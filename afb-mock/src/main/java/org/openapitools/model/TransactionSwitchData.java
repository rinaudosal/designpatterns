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
 * This object keeps specific information about switch operations.
 */
@ApiModel(description = "This object keeps specific information about switch operations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionSwitchData   {
  @JsonProperty("associatedCurrencyCode")
  private String associatedCurrencyCode = null;

  @JsonProperty("associatedDealingInstrument")
  private ResourceReference associatedDealingInstrument = null;

  /**
   * Enum to select between \"FUND\" \"ETF\". Indicates the type of the associated {DealingInstrument}.
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

  @JsonProperty("associatedTransaction")
  private ResourceReference associatedTransaction = null;

  @JsonProperty("associatedTransactionExternalReference")
  private String associatedTransactionExternalReference = null;

  @JsonProperty("switchExchangeRate")
  private Double switchExchangeRate = null;

  public TransactionSwitchData associatedCurrencyCode(String associatedCurrencyCode) {
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

  public TransactionSwitchData associatedDealingInstrument(ResourceReference associatedDealingInstrument) {
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

  public TransactionSwitchData associatedDealingInstrumentType(AssociatedDealingInstrumentTypeEnum associatedDealingInstrumentType) {
    this.associatedDealingInstrumentType = associatedDealingInstrumentType;
    return this;
  }

  /**
   * Enum to select between \"FUND\" \"ETF\". Indicates the type of the associated {DealingInstrument}.
   * @return associatedDealingInstrumentType
  **/
  @ApiModelProperty(value = "Enum to select between \"FUND\" \"ETF\". Indicates the type of the associated {DealingInstrument}.")


  public AssociatedDealingInstrumentTypeEnum getAssociatedDealingInstrumentType() {
    return associatedDealingInstrumentType;
  }

  public void setAssociatedDealingInstrumentType(AssociatedDealingInstrumentTypeEnum associatedDealingInstrumentType) {
    this.associatedDealingInstrumentType = associatedDealingInstrumentType;
  }

  public TransactionSwitchData associatedTransaction(ResourceReference associatedTransaction) {
    this.associatedTransaction = associatedTransaction;
    return this;
  }

  /**
   * Get associatedTransaction
   * @return associatedTransaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getAssociatedTransaction() {
    return associatedTransaction;
  }

  public void setAssociatedTransaction(ResourceReference associatedTransaction) {
    this.associatedTransaction = associatedTransaction;
  }

  public TransactionSwitchData associatedTransactionExternalReference(String associatedTransactionExternalReference) {
    this.associatedTransactionExternalReference = associatedTransactionExternalReference;
    return this;
  }

  /**
   * This field is only used in switch operations. It keeps the external reference of the other operation associated to this one.
   * @return associatedTransactionExternalReference
  **/
  @ApiModelProperty(value = "This field is only used in switch operations. It keeps the external reference of the other operation associated to this one.")


  public String getAssociatedTransactionExternalReference() {
    return associatedTransactionExternalReference;
  }

  public void setAssociatedTransactionExternalReference(String associatedTransactionExternalReference) {
    this.associatedTransactionExternalReference = associatedTransactionExternalReference;
  }

  public TransactionSwitchData switchExchangeRate(Double switchExchangeRate) {
    this.switchExchangeRate = switchExchangeRate;
    return this;
  }

  /**
   * This field is only used in switch operations. It keeps the exchage rate between the currencies of the two {DealingInstrument} included into the switch operation.
   * @return switchExchangeRate
  **/
  @ApiModelProperty(value = "This field is only used in switch operations. It keeps the exchage rate between the currencies of the two {DealingInstrument} included into the switch operation.")


  public Double getSwitchExchangeRate() {
    return switchExchangeRate;
  }

  public void setSwitchExchangeRate(Double switchExchangeRate) {
    this.switchExchangeRate = switchExchangeRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSwitchData transactionSwitchData = (TransactionSwitchData) o;
    return Objects.equals(this.associatedCurrencyCode, transactionSwitchData.associatedCurrencyCode) &&
        Objects.equals(this.associatedDealingInstrument, transactionSwitchData.associatedDealingInstrument) &&
        Objects.equals(this.associatedDealingInstrumentType, transactionSwitchData.associatedDealingInstrumentType) &&
        Objects.equals(this.associatedTransaction, transactionSwitchData.associatedTransaction) &&
        Objects.equals(this.associatedTransactionExternalReference, transactionSwitchData.associatedTransactionExternalReference) &&
        Objects.equals(this.switchExchangeRate, transactionSwitchData.switchExchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedCurrencyCode, associatedDealingInstrument, associatedDealingInstrumentType, associatedTransaction, associatedTransactionExternalReference, switchExchangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSwitchData {\n");
    
    sb.append("    associatedCurrencyCode: ").append(toIndentedString(associatedCurrencyCode)).append("\n");
    sb.append("    associatedDealingInstrument: ").append(toIndentedString(associatedDealingInstrument)).append("\n");
    sb.append("    associatedDealingInstrumentType: ").append(toIndentedString(associatedDealingInstrumentType)).append("\n");
    sb.append("    associatedTransaction: ").append(toIndentedString(associatedTransaction)).append("\n");
    sb.append("    associatedTransactionExternalReference: ").append(toIndentedString(associatedTransactionExternalReference)).append("\n");
    sb.append("    switchExchangeRate: ").append(toIndentedString(switchExchangeRate)).append("\n");
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

