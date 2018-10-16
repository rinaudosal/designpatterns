package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * In case of a SWITCH {Order}, two {Transaction}s will be generated, the first one, will be described with the {Order.currencyCode}, {Order.dealingInstrumentType}, {Order.externalReference}
 */
@ApiModel(description = "In case of a SWITCH {Order}, two {Transaction}s will be generated, the first one, will be described with the {Order.currencyCode}, {Order.dealingInstrumentType}, {Order.externalReference}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderSwitchData   {
  @JsonProperty("associatedCurrencyCode")
  private String associatedCurrencyCode = null;

  @JsonProperty("associatedDealingInstrument")
  private ResourceReference associatedDealingInstrument = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   */
  public enum AssociatedDealingInstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    AssociatedDealingInstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssociatedDealingInstrumentTypeEnum fromValue(String text) {
      for (AssociatedDealingInstrumentTypeEnum b : AssociatedDealingInstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("associatedDealingInstrumentType")
  private AssociatedDealingInstrumentTypeEnum associatedDealingInstrumentType = null;

  @JsonProperty("associatedOrderExternalReference")
  private String associatedOrderExternalReference = null;

  public OrderSwitchData associatedCurrencyCode(String associatedCurrencyCode) {
    this.associatedCurrencyCode = associatedCurrencyCode;
    return this;
  }

  /**
   * This field is only used in switch operations. It keeps the currency code of the fund which was used in the other operation associated to this one. Refer to {listCurrencies}
   * @return associatedCurrencyCode
  **/
  @ApiModelProperty(value = "This field is only used in switch operations. It keeps the currency code of the fund which was used in the other operation associated to this one. Refer to {listCurrencies}")


  public String getAssociatedCurrencyCode() {
    return associatedCurrencyCode;
  }

  public void setAssociatedCurrencyCode(String associatedCurrencyCode) {
    this.associatedCurrencyCode = associatedCurrencyCode;
  }

  public OrderSwitchData associatedDealingInstrument(ResourceReference associatedDealingInstrument) {
    this.associatedDealingInstrument = associatedDealingInstrument;
    return this;
  }

  /**
   * Get associatedDealingInstrument
   * @return associatedDealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getAssociatedDealingInstrument() {
    return associatedDealingInstrument;
  }

  public void setAssociatedDealingInstrument(ResourceReference associatedDealingInstrument) {
    this.associatedDealingInstrument = associatedDealingInstrument;
  }

  public OrderSwitchData associatedDealingInstrumentType(AssociatedDealingInstrumentTypeEnum associatedDealingInstrumentType) {
    this.associatedDealingInstrumentType = associatedDealingInstrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return associatedDealingInstrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public AssociatedDealingInstrumentTypeEnum getAssociatedDealingInstrumentType() {
    return associatedDealingInstrumentType;
  }

  public void setAssociatedDealingInstrumentType(AssociatedDealingInstrumentTypeEnum associatedDealingInstrumentType) {
    this.associatedDealingInstrumentType = associatedDealingInstrumentType;
  }

  public OrderSwitchData associatedOrderExternalReference(String associatedOrderExternalReference) {
    this.associatedOrderExternalReference = associatedOrderExternalReference;
    return this;
  }

  /**
   * External reference associated to the {Order}
   * @return associatedOrderExternalReference
  **/
  @ApiModelProperty(value = "External reference associated to the {Order}")


  public String getAssociatedOrderExternalReference() {
    return associatedOrderExternalReference;
  }

  public void setAssociatedOrderExternalReference(String associatedOrderExternalReference) {
    this.associatedOrderExternalReference = associatedOrderExternalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSwitchData orderSwitchData = (OrderSwitchData) o;
    return Objects.equals(this.associatedCurrencyCode, orderSwitchData.associatedCurrencyCode) &&
        Objects.equals(this.associatedDealingInstrument, orderSwitchData.associatedDealingInstrument) &&
        Objects.equals(this.associatedDealingInstrumentType, orderSwitchData.associatedDealingInstrumentType) &&
        Objects.equals(this.associatedOrderExternalReference, orderSwitchData.associatedOrderExternalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedCurrencyCode, associatedDealingInstrument, associatedDealingInstrumentType, associatedOrderExternalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSwitchData {\n");
    
    sb.append("    associatedCurrencyCode: ").append(toIndentedString(associatedCurrencyCode)).append("\n");
    sb.append("    associatedDealingInstrument: ").append(toIndentedString(associatedDealingInstrument)).append("\n");
    sb.append("    associatedDealingInstrumentType: ").append(toIndentedString(associatedDealingInstrumentType)).append("\n");
    sb.append("    associatedOrderExternalReference: ").append(toIndentedString(associatedOrderExternalReference)).append("\n");
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

