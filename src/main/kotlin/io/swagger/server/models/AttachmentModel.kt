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
 * @param id unique identifier for the attachment, generated by the consumer
 * @param name file name with extension
 * @param type attachment MIME-Type
 * @param body file content*/
data class AttachmentModel(
        /* file name with extension */

        val name: kotlin.String,
        /* file content */

        val body: kotlin.String,
        /* unique identifier for the attachment, generated by the consumer */
        val id: kotlin.String? = null,
        /* attachment MIME-Type */
        val type: kotlin.String? = null
) {

}


