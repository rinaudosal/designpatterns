package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InstrumentSearchByCodeFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingInstrumentFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingInstrumentFilter   {
  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("instrumentSearchByCode")
  private InstrumentSearchByCodeFilter instrumentSearchByCode = null;

  @JsonProperty("productId")
  private Long productId = null;

  public DealingInstrumentFilter dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse}. The id can be extracted from the `/dealingFundHouses/list` API
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse}. The id can be extracted from the `/dealingFundHouses/list` API")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public DealingInstrumentFilter distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}. The id can be extracted from the `/distributors/list` API
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}. The id can be extracted from the `/distributors/list` API")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public DealingInstrumentFilter instrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
    this.instrumentSearchByCode = instrumentSearchByCode;
    return this;
  }

  /**
   * Get instrumentSearchByCode
   * @return instrumentSearchByCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchByCodeFilter getInstrumentSearchByCode() {
    return instrumentSearchByCode;
  }

  public void setInstrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
    this.instrumentSearchByCode = instrumentSearchByCode;
  }

  public DealingInstrumentFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}. The id can be extracted from the `/products/list` API
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}. The id can be extracted from the `/products/list` API")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealingInstrumentFilter dealingInstrumentFilter = (DealingInstrumentFilter) o;
    return Objects.equals(this.dealingFundHouseId, dealingInstrumentFilter.dealingFundHouseId) &&
        Objects.equals(this.distributorId, dealingInstrumentFilter.distributorId) &&
        Objects.equals(this.instrumentSearchByCode, dealingInstrumentFilter.instrumentSearchByCode) &&
        Objects.equals(this.productId, dealingInstrumentFilter.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingFundHouseId, distributorId, instrumentSearchByCode, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingInstrumentFilter {\n");
    
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    instrumentSearchByCode: ").append(toIndentedString(instrumentSearchByCode)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

