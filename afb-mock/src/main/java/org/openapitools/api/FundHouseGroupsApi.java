/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CollectiveInvestmentScheme;
import org.openapitools.model.CollectiveInvestmentSchemeAndPage;
import org.openapitools.model.Document;
import org.openapitools.model.DocumentAndPage;
import org.openapitools.model.FundHouse;
import org.openapitools.model.FundHouseAndPage;
import org.openapitools.model.FundHouseGroup;
import org.openapitools.model.FundHouseGroupAndPage;
import org.openapitools.model.NewFundHouseAndPage;
import org.openapitools.model.NewFundHouseFilterAndPageFilter;
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
@Api(value = "fundHouseGroups", description = "the fundHouseGroups API")
public interface FundHouseGroupsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "getCollectiveInvestmentSchemeById", nickname = "getCollectiveInvestmentSchemeByIdUsingGET", notes = "This method returns the Collective Investment Scheme whose Collective Investment Scheme Id is specified as parameter.", response = CollectiveInvestmentScheme.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CollectiveInvestmentScheme.class),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/{fundHouseId}/collectiveInvestmentSchemes/{collectiveInvestmentSchemeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CollectiveInvestmentScheme> getCollectiveInvestmentSchemeByIdUsingGET(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "The Id of the {FundHouse}",required=true) @PathVariable("fundHouseId") Long fundHouseId,@ApiParam(value = "The Id of the {CollectiveInvestmentScheme}",required=true) @PathVariable("collectiveInvestmentSchemeId") Long collectiveInvestmentSchemeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"externalCodeKeyValues\" : [ {    \"value\" : \"value\",    \"key\" : \"key\"  }, {    \"value\" : \"value\",    \"key\" : \"key\"  } ],  \"name\" : \"name\",  \"id\" : 0,  \"typeCode\" : \"typeCode\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "getCollectiveInvestmentSchemeDocumentById", nickname = "getCollectiveInvestmentSchemeDocumentByIdUsingGET", notes = "This method returns the {Document} whose Id is specified as parameter.", response = Document.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Document.class),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/{fundHouseId}/collectiveInvestmentSchemes/{collectiveInvestmentSchemeId}/documents/{documentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Document> getCollectiveInvestmentSchemeDocumentByIdUsingGET(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "The Id of the {FundHouse}",required=true) @PathVariable("fundHouseId") Long fundHouseId,@ApiParam(value = "The Id of the {CollectiveInvestmentScheme}",required=true) @PathVariable("collectiveInvestmentSchemeId") Long collectiveInvestmentSchemeId,@ApiParam(value = "The Id of the {Document}",required=true) @PathVariable("documentId") String documentId) {
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


    @ApiOperation(value = "getFundHouseById", nickname = "getFundHouseByIdUsingGET", notes = "", response = FundHouse.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FundHouse.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code."),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/{fundHouseId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<FundHouse> getFundHouseByIdUsingGET(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "The Id of the {FundHouse}",required=true) @PathVariable("fundHouseId") Long fundHouseId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"fundHouseGroupId\" : 0,  \"logoUrls\" : [ {    \"value\" : \"value\",    \"key\" : \"key\"  }, {    \"value\" : \"value\",    \"key\" : \"key\"  } ],  \"name\" : \"name\",  \"description\" : \"description\",  \"id\" : 6}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "getFundHouseDocumentById", nickname = "getFundHouseDocumentByIdUsingGET", notes = "This method returns the {Document} whose Id is specified as parameter.", response = Document.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Document.class),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/{fundHouseId}/documents/{documentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Document> getFundHouseDocumentByIdUsingGET(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "The Id of the {FundHouse}",required=true) @PathVariable("fundHouseId") Long fundHouseId,@ApiParam(value = "The Id of the {Document}",required=true) @PathVariable("documentId") String documentId) {
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


    @ApiOperation(value = "getFundHouseGroupById", nickname = "getFundHouseGroupByIdUsingGET", notes = "This method returns the Fund House Group whose Fund House Group id is specified as parameter.", response = FundHouseGroup.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FundHouseGroup.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code."),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<FundHouseGroup> getFundHouseGroupByIdUsingGET(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId) {
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


    @ApiOperation(value = "listCollectiveInvestmentSchemeDocuments", nickname = "listCollectiveInvestmentSchemeDocumentsUsingPOST", notes = "Get a list of documents", response = DocumentAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DocumentAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/{fundHouseId}/collectiveInvestmentSchemes/{collectiveInvestmentSchemeId}/documents/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DocumentAndPage> listCollectiveInvestmentSchemeDocumentsUsingPOST(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "The Id of the {FundHouse}",required=true) @PathVariable("fundHouseId") Long fundHouseId,@ApiParam(value = "The Id of the {CollectiveInvestmentScheme}",required=true) @PathVariable("collectiveInvestmentSchemeId") Long collectiveInvestmentSchemeId,@ApiParam(value = "page"  )  @Valid @RequestBody PageFilter pageFilter) {
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


    @ApiOperation(value = "listCollectiveInvestmentSchemes", nickname = "listCollectiveInvestmentSchemesUsingPOST", notes = "", response = CollectiveInvestmentSchemeAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CollectiveInvestmentSchemeAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/{fundHouseId}/collectiveInvestmentSchemes/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<CollectiveInvestmentSchemeAndPage> listCollectiveInvestmentSchemesUsingPOST(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "The Id of the {FundHouse}",required=true) @PathVariable("fundHouseId") Long fundHouseId,@ApiParam(value = "body"  )  @Valid @RequestBody PageFilter pageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  },  \"collectiveInvestmentSchemes\" : [ {    \"externalCodeKeyValues\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"id\" : 0,    \"typeCode\" : \"typeCode\"  }, {    \"externalCodeKeyValues\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"id\" : 0,    \"typeCode\" : \"typeCode\"  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "listFundHouseDocuments", nickname = "listFundHouseDocumentsUsingPOST", notes = "Get a list of {Document}s associated with the {FundHouse}", response = DocumentAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DocumentAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/{fundHouseId}/documents/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DocumentAndPage> listFundHouseDocumentsUsingPOST(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "The Id of the {FundHouse}",required=true) @PathVariable("fundHouseId") Long fundHouseId,@ApiParam(value = "page"  )  @Valid @RequestBody PageFilter pageFilter) {
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


    @ApiOperation(value = "listFundHouseGroups", nickname = "listFundHouseGroupsUsingPOST", notes = "", response = FundHouseGroupAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FundHouseGroupAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<FundHouseGroupAndPage> listFundHouseGroupsUsingPOST(@ApiParam(value = "body"  )  @Valid @RequestBody PageFilter pageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"fundHouseGroups\" : [ {    \"name\" : \"name\",    \"id\" : 0  }, {    \"name\" : \"name\",    \"id\" : 0  } ],  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "listFundHouses", nickname = "listFundHousesUsingPOST", notes = "", response = FundHouseAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FundHouseAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/{fundHouseGroupId}/fundHouses/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<FundHouseAndPage> listFundHousesUsingPOST(@ApiParam(value = "The Id of the {FundHouseGroup}",required=true) @PathVariable("fundHouseGroupId") Long fundHouseGroupId,@ApiParam(value = "body"  )  @Valid @RequestBody PageFilter pageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"fundHouses\" : [ {    \"fundHouseGroupId\" : 0,    \"logoUrls\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : 6  }, {    \"fundHouseGroupId\" : 0,    \"logoUrls\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : 6  } ],  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "listNewFundHouses", nickname = "listNewFundHousesUsingPOST", notes = "", response = NewFundHouseAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "fundhousegroups", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NewFundHouseAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/fundHouseGroups/newFundHouses/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<NewFundHouseAndPage> listNewFundHousesUsingPOST(@ApiParam(value = "body"  )  @Valid @RequestBody NewFundHouseFilterAndPageFilter newFundHouseFilterAndPageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"resources\" : [ {    \"fundsNumber\" : 6,    \"fundHouseGroupId\" : 0,    \"resources\" : {      \"id\" : \"id\",      \"label\" : \"label\",      \"url\" : \"url\"    }  }, {    \"fundsNumber\" : 6,    \"fundHouseGroupId\" : 0,    \"resources\" : {      \"id\" : \"id\",      \"label\" : \"label\",      \"url\" : \"url\"    }  } ],  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}