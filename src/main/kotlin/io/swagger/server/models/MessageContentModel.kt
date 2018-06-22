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
 * @param header message header 
 * @param body message body*/
data class MessageContentModel (
    /* message body */

    val body: kotlin.String,
    /* message header */
    val header: kotlin.String? = null
) {

}


