/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Document;
import org.openapitools.model.DocumentAndPage;
import org.openapitools.model.FundGroup;
import org.openapitools.model.FundGroupAndPage;
import org.openapitools.model.PageFilter;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

@Validated
@Api(value = "fundGroups", description = "the fundGroups API")
public interface FundGroupsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "getDocumentById", nickname = "getDocumentByIdUsingGET", notes = "This method returns the {Document} whose Id is specified as parameter.", response = Document.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundgroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Document.class),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/fundGroups/{fundGroupId}/documents/{documentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Document> getDocumentByIdUsingGET(@ApiParam(value = "The Id of the {FundGroup}",required=true) @PathVariable("fundGroupId") Long fundGroupId,@ApiParam(value = "The Id of the {Document}",required=true) @PathVariable("documentId") String documentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"owner\" : {    \"id\" : \"id\",    \"label\" : \"label\",    \"url\" : \"url\"  },  \"metadata\" : [ {    \"value\" : \"value\",    \"key\" : \"key\"  }, {    \"value\" : \"value\",    \"key\" : \"key\"  } ],  \"file\" : {    \"filename\" : \"filename\",    \"size\" : 0,    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"title\" : \"title\",    \"url\" : \"url\"  },  \"id\" : \"id\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "getFundGroupById", nickname = "getFundGroupByIdUsingGET", notes = "This method returns the Fundgroup whose Id is specified as parameter.", response = FundGroup.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundgroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FundGroup.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code."),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/fundGroups/{fundGroupId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<FundGroup> getFundGroupByIdUsingGET(@ApiParam(value = "The Id of the {FundGroup}",required=true) @PathVariable("fundGroupId") Long fundGroupId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"name\",  \"id\" : 0}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "listDocuments", nickname = "listDocumentsUsingPOST", notes = "Get a list of {Document}s associated with the {FundGroup}", response = DocumentAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundgroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DocumentAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundGroups/{fundGroupId}/documents/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DocumentAndPage> listDocumentsUsingPOST(@ApiParam(value = "The Id of the {FundGroup}",required=true) @PathVariable("fundGroupId") Long fundGroupId,@ApiParam(value = "page"  )  @Valid @RequestBody PageFilter pageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"documents\" : [ {    \"owner\" : {      \"id\" : \"id\",      \"label\" : \"label\",      \"url\" : \"url\"    },    \"metadata\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"file\" : {      \"filename\" : \"filename\",      \"size\" : 0,      \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",      \"title\" : \"title\",      \"url\" : \"url\"    },    \"id\" : \"id\"  }, {    \"owner\" : {      \"id\" : \"id\",      \"label\" : \"label\",      \"url\" : \"url\"    },    \"metadata\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"file\" : {      \"filename\" : \"filename\",      \"size\" : 0,      \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",      \"title\" : \"title\",      \"url\" : \"url\"    },    \"id\" : \"id\"  } ],  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "listFundGroups", nickname = "listFundGroupsUsingPOST", notes = "", response = FundGroupAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundgroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FundGroupAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundGroups/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<FundGroupAndPage> listFundGroupsUsingPOST(@ApiParam(value = "body"  )  @Valid @RequestBody PageFilter pageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"fundGroups\" : [ {    \"name\" : \"name\",    \"id\" : 0  }, {    \"name\" : \"name\",    \"id\" : 0  } ],  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
