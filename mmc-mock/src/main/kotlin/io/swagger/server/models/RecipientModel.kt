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
 * @param name recipient name
 * @param surname recipient surname
 * @param alias alternate name for the recipient, use [CC] and [BCC] placeholders in this field to send mail as CC or BCC
 * @param group reference of the group to send the message to
 * @param reference digital reference for the recipient, could be the telephone number for sms messages, email address for email messages or device id for push notifications*/
data class RecipientModel(
        /* recipient name */
        val name: kotlin.String? = null,
        /* recipient surname */
        val surname: kotlin.String? = null,
        /* alternate name for the recipient, use [CC] and [BCC] placeholders in this field to send mail as CC or BCC */
        val alias: kotlin.String? = null,
        /* reference of the group to send the message to */
        val group: kotlin.String? = null,
        /* digital reference for the recipient, could be the telephone number for sms messages, email address for email messages or device id for push notifications */
        val reference: kotlin.String? = null
) {

}


