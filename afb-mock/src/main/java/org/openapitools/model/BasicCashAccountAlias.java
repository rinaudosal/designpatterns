package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicCashAccountAlias
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BasicCashAccountAlias   {
  @JsonProperty("cashClientId")
  private String cashClientId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("name")
  private String name = null;

  public BasicCashAccountAlias cashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
    return this;
  }

  /**
   * The Id of the {CashClient}
   * @return cashClientId
  **/
  @ApiModelProperty(value = "The Id of the {CashClient}")


  public String getCashClientId() {
    return cashClientId;
  }

  public void setCashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
  }

  public BasicCashAccountAlias currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the {CashAccountAlias}. Refers to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the {CashAccountAlias}. Refers to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BasicCashAccountAlias name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the alias
   * @return name
  **/
  @ApiModelProperty(value = "The name of the alias")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicCashAccountAlias basicCashAccountAlias = (BasicCashAccountAlias) o;
    return Objects.equals(this.cashClientId, basicCashAccountAlias.cashClientId) &&
        Objects.equals(this.currencyCode, basicCashAccountAlias.currencyCode) &&
        Objects.equals(this.name, basicCashAccountAlias.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashClientId, currencyCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicCashAccountAlias {\n");
    
    sb.append("    cashClientId: ").append(toIndentedString(cashClientId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

