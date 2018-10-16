package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EtfSumary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EtfSumary   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ticker")
  private String ticker = null;

  public EtfSumary currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The Fund's currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The Fund's currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public EtfSumary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * administrator of Etf
   * @return name
  **/
  @ApiModelProperty(value = "administrator of Etf")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EtfSumary ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

  /**
   * custodian of Etf
   * @return ticker
  **/
  @ApiModelProperty(value = "custodian of Etf")


  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtfSumary etfSumary = (EtfSumary) o;
    return Objects.equals(this.currencyCode, etfSumary.currencyCode) &&
        Objects.equals(this.name, etfSumary.name) &&
        Objects.equals(this.ticker, etfSumary.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, name, ticker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtfSumary {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

