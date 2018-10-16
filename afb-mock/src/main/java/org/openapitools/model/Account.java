package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Account   {
  @JsonProperty("currentAccountCode")
  private String currentAccountCode = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("productId")
  private Long productId = null;

  public Account currentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
    return this;
  }

  /**
   * The Current Account Code associated to the account
   * @return currentAccountCode
  **/
  @ApiModelProperty(value = "The Current Account Code associated to the account")


  public String getCurrentAccountCode() {
    return currentAccountCode;
  }

  public void setCurrentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
  }

  public Account dealingFundHouseId(Long dealingFundHouseId) {
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

  public Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Account Id
   * @return id
  **/
  @ApiModelProperty(value = "Account Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Account Description
   * @return name
  **/
  @ApiModelProperty(value = "Account Description")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account productId(Long productId) {
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
    Account account = (Account) o;
    return Objects.equals(this.currentAccountCode, account.currentAccountCode) &&
        Objects.equals(this.dealingFundHouseId, account.dealingFundHouseId) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.productId, account.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountCode, dealingFundHouseId, id, name, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    currentAccountCode: ").append(toIndentedString(currentAccountCode)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

