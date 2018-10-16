/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DealingFundHouse;
import org.openapitools.model.DealingFundHouseAndPage;
import org.openapitools.model.DealingInstrument;
import org.openapitools.model.DealingInstrumentAndPage;
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
@Api(value = "dealingFundHouses", description = "the dealingFundHouses API")
public interface DealingFundHousesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "getDealingFundHouseById", nickname = "getDealingFundHouseByIdUsingGET", notes = "", response = DealingFundHouse.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "dealingfundhouses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DealingFundHouse.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code."),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/dealingFundHouses/{dealingFundHouseId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DealingFundHouse> getDealingFundHouseByIdUsingGET(@ApiParam(value = "The Id of the {DealingFundHouse}",required=true) @PathVariable("dealingFundHouseId") Long dealingFundHouseId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"logoUrls\" : [ {    \"value\" : \"value\",    \"key\" : \"key\"  }, {    \"value\" : \"value\",    \"key\" : \"key\"  } ],  \"name\" : \"name\",  \"id\" : 0,  \"swiftPermitted\" : true}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "getDealingInstrumentById", nickname = "getDealingInstrumentByIdUsingGET", notes = "Find DealingInstrument by ID", response = DealingInstrument.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "dealingfundhouses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DealingInstrument.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code."),
        @ApiResponse(code = 404, message = "Entity not found. This response corresponds to the '404' HTTP status code.") })
    @RequestMapping(value = "/dealingFundHouses/{dealingFundHouseId}/dealingInstruments/{dealingInstrumentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DealingInstrument> getDealingInstrumentByIdUsingGET(@ApiParam(value = "The Id of the {DealingFundHouse}",required=true) @PathVariable("dealingFundHouseId") Long dealingFundHouseId,@ApiParam(value = "The Id of the {DealingInstrument}",required=true) @PathVariable("dealingInstrumentId") Long dealingInstrumentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"brokerId\" : 0,  \"instrumentType\" : \"FUND\",  \"externalCodeKeyValues\" : [ {    \"value\" : \"value\",    \"key\" : \"key\"  }, {    \"value\" : \"value\",    \"key\" : \"key\"  } ],  \"name\" : \"name\",  \"id\" : 1,  \"dealingFundHouseId\" : 6,  \"currencyCode\" : \"currencyCode\",  \"stockExchangeId\" : \"stockExchangeId\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "listDealingFundHouses", nickname = "listDealingFundHousesUsingPOST", notes = "", response = DealingFundHouseAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "dealingfundhouses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DealingFundHouseAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/dealingFundHouses/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DealingFundHouseAndPage> listDealingFundHousesUsingPOST(@ApiParam(value = "body"  )  @Valid @RequestBody PageFilter pageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"dealingFundHouses\" : [ {    \"logoUrls\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"id\" : 0,    \"swiftPermitted\" : true  }, {    \"logoUrls\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"id\" : 0,    \"swiftPermitted\" : true  } ],  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "listDealingInstruments", nickname = "listDealingInstrumentsUsingPOST", notes = "Returns list of DealingInstrument", response = DealingInstrumentAndPage.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "dealingfundhouses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DealingInstrumentAndPage.class),
        @ApiResponse(code = 400, message = "Illegal input for operation. This response corresponds to the '400' HTTP status code.") })
    @RequestMapping(value = "/dealingFundHouses/{dealingFundHouseId}/dealingInstruments/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DealingInstrumentAndPage> listDealingInstrumentsUsingPOST(@ApiParam(value = "The Id of the {DealingFundHouse}",required=true) @PathVariable("dealingFundHouseId") Long dealingFundHouseId,@ApiParam(value = "body"  )  @Valid @RequestBody PageFilter pageFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"dealingInstruments\" : [ {    \"brokerId\" : 0,    \"instrumentType\" : \"FUND\",    \"externalCodeKeyValues\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"id\" : 1,    \"dealingFundHouseId\" : 6,    \"currencyCode\" : \"currencyCode\",    \"stockExchangeId\" : \"stockExchangeId\"  }, {    \"brokerId\" : 0,    \"instrumentType\" : \"FUND\",    \"externalCodeKeyValues\" : [ {      \"value\" : \"value\",      \"key\" : \"key\"    }, {      \"value\" : \"value\",      \"key\" : \"key\"    } ],    \"name\" : \"name\",    \"id\" : 1,    \"dealingFundHouseId\" : 6,    \"currencyCode\" : \"currencyCode\",    \"stockExchangeId\" : \"stockExchangeId\"  } ],  \"page\" : {    \"pageNumber\" : 6,    \"resultPerPage\" : 1,    \"totalNumberOfResult\" : 5,    \"orderPage\" : {      \"by\" : \"by\",      \"sort\" : \"ASCENDING\"    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
