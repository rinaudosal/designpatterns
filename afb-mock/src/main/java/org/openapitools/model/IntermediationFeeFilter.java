package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IntermediationFeeFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class IntermediationFeeFilter   {
  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("valueDate")
  private OffsetDateTime valueDate = null;

  public IntermediationFeeFilter distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public IntermediationFeeFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public IntermediationFeeFilter valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The date when returned data were calculated
   * @return valueDate
  **/
  @ApiModelProperty(value = "The date when returned data were calculated")

  @Valid

  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntermediationFeeFilter intermediationFeeFilter = (IntermediationFeeFilter) o;
    return Objects.equals(this.distributorId, intermediationFeeFilter.distributorId) &&
        Objects.equals(this.productId, intermediationFeeFilter.productId) &&
        Objects.equals(this.valueDate, intermediationFeeFilter.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, productId, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntermediationFeeFilter {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

