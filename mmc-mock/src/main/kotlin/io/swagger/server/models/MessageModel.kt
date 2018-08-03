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
package io.swagger.server.models


/**
 *
 * @param uuid uuid of the message
 * @param appCode application code
 * @param status message status */
data class MessageModel(
        /* uuid of the message */
        val uuid: kotlin.String? = null,
        /* application code */
        val appCode: kotlin.String? = null,
        /* message status  */
        val status: MessageModel.Status? = null
) {

    /**
     * message status
     * Values: nOTFOUND,rECEIVED,qUEUED,rEFUSED,sENT,eRROR,aBORTED
     */
    enum class Status(val value: kotlin.String) {

        nOTFOUND("NOT_FOUND"),

        rECEIVED("RECEIVED"),

        qUEUED("QUEUED"),

        rEFUSED("REFUSED"),

        sENT("SENT"),

        eRROR("ERROR"),

        aBORTED("ABORTED");

    }

}

