package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about specific attributes of the transaction.
 */
@ApiModel(description = "This object keeps information about specific attributes of the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderSettingsData   {
  /**
   * Indicator to choose between {DealingInstrument} currency or payment currency.
   */
  public enum DealingCurrencyPolicyEnum {
    INSTRUMENT_CURRENCY("INSTRUMENT_CURRENCY"),
    
    PAYMENT_CURRENCY("PAYMENT_CURRENCY");

    private String value;

    DealingCurrencyPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DealingCurrencyPolicyEnum fromValue(String text) {
      for (DealingCurrencyPolicyEnum b : DealingCurrencyPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("dealingCurrencyPolicy")
  private DealingCurrencyPolicyEnum dealingCurrencyPolicy = null;

  @JsonProperty("omnibus")
  private Boolean omnibus = null;

  public OrderSettingsData dealingCurrencyPolicy(DealingCurrencyPolicyEnum dealingCurrencyPolicy) {
    this.dealingCurrencyPolicy = dealingCurrencyPolicy;
    return this;
  }

  /**
   * Indicator to choose between {DealingInstrument} currency or payment currency.
   * @return dealingCurrencyPolicy
  **/
  @ApiModelProperty(value = "Indicator to choose between {DealingInstrument} currency or payment currency.")


  public DealingCurrencyPolicyEnum getDealingCurrencyPolicy() {
    return dealingCurrencyPolicy;
  }

  public void setDealingCurrencyPolicy(DealingCurrencyPolicyEnum dealingCurrencyPolicy) {
    this.dealingCurrencyPolicy = dealingCurrencyPolicy;
  }

  public OrderSettingsData omnibus(Boolean omnibus) {
    this.omnibus = omnibus;
    return this;
  }

  /**
   * Lo que se muestra en {Transaction.omnibus} en la combinacion de {Order.omnibus} vs {OrderDealingSettings.omnibusAvailable} , de la siguiente forma si en el alta {OrderDealingSettings.omnibusAvailable}=false  => Transaction.{Transaction.omnibus}=NOT_APLICABLE si en el alta {OrderDealingSettings.omnibusAvailable}=true y el usuario selecciona omnibus=FALSE => {Transaction.omnibus}= NO si en el alta {OrderDealingSettings.omnibusAvailable}=true y el usuario selecciona omnibus=TRUE  => {Transaction.omnibus}= YES
   * @return omnibus
  **/
  @ApiModelProperty(value = "Lo que se muestra en {Transaction.omnibus} en la combinacion de {Order.omnibus} vs {OrderDealingSettings.omnibusAvailable} , de la siguiente forma si en el alta {OrderDealingSettings.omnibusAvailable}=false  => Transaction.{Transaction.omnibus}=NOT_APLICABLE si en el alta {OrderDealingSettings.omnibusAvailable}=true y el usuario selecciona omnibus=FALSE => {Transaction.omnibus}= NO si en el alta {OrderDealingSettings.omnibusAvailable}=true y el usuario selecciona omnibus=TRUE  => {Transaction.omnibus}= YES")


  public Boolean getOmnibus() {
    return omnibus;
  }

  public void setOmnibus(Boolean omnibus) {
    this.omnibus = omnibus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSettingsData orderSettingsData = (OrderSettingsData) o;
    return Objects.equals(this.dealingCurrencyPolicy, orderSettingsData.dealingCurrencyPolicy) &&
        Objects.equals(this.omnibus, orderSettingsData.omnibus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingCurrencyPolicy, omnibus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSettingsData {\n");
    
    sb.append("    dealingCurrencyPolicy: ").append(toIndentedString(dealingCurrencyPolicy)).append("\n");
    sb.append("    omnibus: ").append(toIndentedString(omnibus)).append("\n");
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

