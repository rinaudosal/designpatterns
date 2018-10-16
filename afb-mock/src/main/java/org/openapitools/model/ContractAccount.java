package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object that keeps information about an account associated with a contract
 */
@ApiModel(description = "Object that keeps information about an account associated with a contract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ContractAccount   {
  @JsonProperty("assetAccountCode")
  private String assetAccountCode = null;

  @JsonProperty("currentAccountCode")
  private String currentAccountCode = null;

  public ContractAccount assetAccountCode(String assetAccountCode) {
    this.assetAccountCode = assetAccountCode;
    return this;
  }

  /**
   * The Asset Account Code associated to the contract
   * @return assetAccountCode
  **/
  @ApiModelProperty(value = "The Asset Account Code associated to the contract")


  public String getAssetAccountCode() {
    return assetAccountCode;
  }

  public void setAssetAccountCode(String assetAccountCode) {
    this.assetAccountCode = assetAccountCode;
  }

  public ContractAccount currentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
    return this;
  }

  /**
   * The Current Account Code associated to the contract
   * @return currentAccountCode
  **/
  @ApiModelProperty(value = "The Current Account Code associated to the contract")


  public String getCurrentAccountCode() {
    return currentAccountCode;
  }

  public void setCurrentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractAccount contractAccount = (ContractAccount) o;
    return Objects.equals(this.assetAccountCode, contractAccount.assetAccountCode) &&
        Objects.equals(this.currentAccountCode, contractAccount.currentAccountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetAccountCode, currentAccountCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractAccount {\n");
    
    sb.append("    assetAccountCode: ").append(toIndentedString(assetAccountCode)).append("\n");
    sb.append("    currentAccountCode: ").append(toIndentedString(currentAccountCode)).append("\n");
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

