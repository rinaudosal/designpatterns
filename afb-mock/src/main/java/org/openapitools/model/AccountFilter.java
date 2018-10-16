package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object used for an account searching. This distributor accounts are each one associated with a dealing fund house
 */
@ApiModel(description = "Object used for an account searching. This distributor accounts are each one associated with a dealing fund house")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AccountFilter   {
  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("productId")
  private Long productId = null;

  public AccountFilter dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public AccountFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


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
    AccountFilter accountFilter = (AccountFilter) o;
    return Objects.equals(this.dealingFundHouseId, accountFilter.dealingFundHouseId) &&
        Objects.equals(this.productId, accountFilter.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingFundHouseId, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFilter {\n");
    
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
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

