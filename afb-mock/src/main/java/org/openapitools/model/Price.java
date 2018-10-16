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
 * Price
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Price   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("priceTypeCode")
  private String priceTypeCode = null;

  @JsonProperty("value")
  private Double value = null;

  public Price currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Price date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the latest available validated price for the Instrument.
   * @return date
  **/
  @ApiModelProperty(value = "Date of the latest available validated price for the Instrument.")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Price priceTypeCode(String priceTypeCode) {
    this.priceTypeCode = priceTypeCode;
    return this;
  }

  /**
   * Price type code. Refer to {listPriceTypes}
   * @return priceTypeCode
  **/
  @ApiModelProperty(value = "Price type code. Refer to {listPriceTypes}")


  public String getPriceTypeCode() {
    return priceTypeCode;
  }

  public void setPriceTypeCode(String priceTypeCode) {
    this.priceTypeCode = priceTypeCode;
  }

  public Price value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The price for the fund, represented in the Instrument's current currency.
   * @return value
  **/
  @ApiModelProperty(value = "The price for the fund, represented in the Instrument's current currency.")


  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.currencyCode, price.currencyCode) &&
        Objects.equals(this.date, price.date) &&
        Objects.equals(this.priceTypeCode, price.priceTypeCode) &&
        Objects.equals(this.value, price.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, date, priceTypeCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    priceTypeCode: ").append(toIndentedString(priceTypeCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

