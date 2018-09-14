/**
 * MMC - Backend API
 * Motore di messaggistica API
 *
 * OpenAPI spec version: 0.3.0
 * Contact: d.ghilardi@reply.it
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.server.apis

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288

import com.google.gson.Gson
import com.mailjet.client.MailjetClient
import com.mailjet.client.MailjetRequest
import com.mailjet.client.resource.Contact
import com.mailjet.client.resource.Email
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.locations.get
import io.ktor.request.receive
import io.ktor.request.receiveText
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.post
import io.ktor.routing.route
import io.swagger.server.Paths
import io.swagger.server.delete
import io.swagger.server.models.ErrorResponse
import io.swagger.server.models.SendMessageRequest
import io.swagger.server.models.SendResponse
import org.json.JSONArray
import org.json.JSONObject
import org.slf4j.LoggerFactory
import java.nio.charset.Charset
import java.util.*


fun Route.DefaultApi() {

    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    val logger = LoggerFactory.getLogger("defaultAPi")

    route("/management/device") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }

    delete<Paths.deleteDevice> { it: Paths.deleteDevice -> call.respond(HttpStatusCode.NotImplemented) }

    get<Paths.messageCheck> { it: Paths.messageCheck -> call.respond(HttpStatusCode.NotImplemented) }

    route("/message/send") {
        post {

            val sendMessageRequest = if (call.request.headers["Content-Type"]?.contains("charset=utf-8")!!) {
                call.receive()
            } else {
                val receiveText = call.receiveText()
                val c = SendMessageRequest::class
                gson.fromJson(String(receiveText.toByteArray(Charset.forName("ISO-8859-1")), Charset.forName("UTF-8")), c.javaObjectType)
            }

            if (sendMessageRequest.type == SendMessageRequest.Type.email) {
                logger.info("Sending message {}", sendMessageRequest)

                val recipients = JSONArray()
                        .put(JSONObject().put(Contact.EMAIL, sendMessageRequest.to[0].reference))

                val email = MailjetRequest(Email.resource)
                        .property(Email.FROMNAME, sendMessageRequest.from.alias)
                        .property(Email.FROMEMAIL, sendMessageRequest.from.reference)
                        .property(Email.SUBJECT, sendMessageRequest.content.header)
                        .property(Email.TEXTPART, sendMessageRequest.content.body)
                        .property(Email.RECIPIENTS, recipients)
                        .property(Email.MJCUSTOMID, "JAVA-Email")

                val client = MailjetClient("222359b850d02deb0e64be7d954efc52", "ce2ae1f2fdf6f1fcb8f379d5616dd209")

                val response = client.post(email)

                logger.info("Sending response {}", response.data)

                if (200 == response.status) {
                    call.respond(HttpStatusCode.OK, SendResponse(SendResponse.ResultCode.R0, "OK", UUID.randomUUID().toString()))
                } else {
                    call.respond(HttpStatusCode.InternalServerError, ErrorResponse("-1", "KO"))
                }
            } else {
                val session = SlackSessionFactory.createWebSocketSlackSession("xoxp-386819753813-387726676423-385984789744-02070eebc26b122225a9a40254725a56")
                session.connect()
                val channel = session.findChannelByName("general") //make sure bot is a member of the channel.
                var to = if (sendMessageRequest.type == SendMessageRequest.Type.push) sendMessageRequest.to[0].group else sendMessageRequest.to[0].reference
                session.sendMessage(channel, "mmc-mock -> [" + sendMessageRequest.type + "]->[" + to + "]: " + sendMessageRequest.content.body)
                call.respond(HttpStatusCode.OK, SendResponse(SendResponse.ResultCode.R0, "OK", UUID.randomUUID().toString()))
            }
        }
    }

}
