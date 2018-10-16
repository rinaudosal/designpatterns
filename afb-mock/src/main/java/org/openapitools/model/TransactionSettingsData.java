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

public class TransactionSettingsData   {
  @JsonProperty("cancelable")
  private Boolean cancelable = null;

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

  @JsonProperty("exDividend")
  private Boolean exDividend = null;

  @JsonProperty("grouped")
  private Boolean grouped = null;

  @JsonProperty("groupedTransactionsConfirmed")
  private Boolean groupedTransactionsConfirmed = null;

  @JsonProperty("historyAccessible")
  private Boolean historyAccessible = null;

  @JsonProperty("kiidAccessible")
  private Boolean kiidAccessible = null;

  @JsonProperty("numberGroupedTransactions")
  private Long numberGroupedTransactions = null;

  /**
   * Indicates whether the transaction is associated to an omnibus account.
   */
  public enum OmnibusEnum {
    YES("YES"),
    
    NO("NO"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    OmnibusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OmnibusEnum fromValue(String text) {
      for (OmnibusEnum b : OmnibusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("omnibus")
  private OmnibusEnum omnibus = null;

  @JsonProperty("operationId")
  private String operationId = null;

  @JsonProperty("originatedFromOperation")
  private Boolean originatedFromOperation = null;

  @JsonProperty("originatedFromSpanishTransfer")
  private Boolean originatedFromSpanishTransfer = null;

  @JsonProperty("pac")
  private Boolean pac = null;

  @JsonProperty("reportAccessible")
  private Boolean reportAccessible = null;

  @JsonProperty("taxTransactionHistory")
  private Boolean taxTransactionHistory = null;

  public TransactionSettingsData cancelable(Boolean cancelable) {
    this.cancelable = cancelable;
    return this;
  }

  /**
   * Indicates whether it is possible cancel transaction.
   * @return cancelable
  **/
  @ApiModelProperty(value = "Indicates whether it is possible cancel transaction.")


  public Boolean getCancelable() {
    return cancelable;
  }

  public void setCancelable(Boolean cancelable) {
    this.cancelable = cancelable;
  }

  public TransactionSettingsData dealingCurrencyPolicy(DealingCurrencyPolicyEnum dealingCurrencyPolicy) {
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

  public TransactionSettingsData exDividend(Boolean exDividend) {
    this.exDividend = exDividend;
    return this;
  }

  /**
   * Indicates whether the transaction is marked as an EX-dividend.
   * @return exDividend
  **/
  @ApiModelProperty(value = "Indicates whether the transaction is marked as an EX-dividend.")


  public Boolean getExDividend() {
    return exDividend;
  }

  public void setExDividend(Boolean exDividend) {
    this.exDividend = exDividend;
  }

  public TransactionSettingsData grouped(Boolean grouped) {
    this.grouped = grouped;
    return this;
  }

  /**
   * Indicates whether the transaction is grouped.
   * @return grouped
  **/
  @ApiModelProperty(value = "Indicates whether the transaction is grouped.")


  public Boolean getGrouped() {
    return grouped;
  }

  public void setGrouped(Boolean grouped) {
    this.grouped = grouped;
  }

  public TransactionSettingsData groupedTransactionsConfirmed(Boolean groupedTransactionsConfirmed) {
    this.groupedTransactionsConfirmed = groupedTransactionsConfirmed;
    return this;
  }

  /**
   * If the transaction is grouped, indicates whether the indivial transactions are confirmed or not.
   * @return groupedTransactionsConfirmed
  **/
  @ApiModelProperty(value = "If the transaction is grouped, indicates whether the indivial transactions are confirmed or not.")


  public Boolean getGroupedTransactionsConfirmed() {
    return groupedTransactionsConfirmed;
  }

  public void setGroupedTransactionsConfirmed(Boolean groupedTransactionsConfirmed) {
    this.groupedTransactionsConfirmed = groupedTransactionsConfirmed;
  }

  public TransactionSettingsData historyAccessible(Boolean historyAccessible) {
    this.historyAccessible = historyAccessible;
    return this;
  }

  /**
   * Indicates whether it is possible to consult the transaction history of the transaction.
   * @return historyAccessible
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to consult the transaction history of the transaction.")


  public Boolean getHistoryAccessible() {
    return historyAccessible;
  }

  public void setHistoryAccessible(Boolean historyAccessible) {
    this.historyAccessible = historyAccessible;
  }

  public TransactionSettingsData kiidAccessible(Boolean kiidAccessible) {
    this.kiidAccessible = kiidAccessible;
    return this;
  }

  /**
   * Indicates whether it is possible to consult the kiid document associated to the transaction's instrument
   * @return kiidAccessible
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to consult the kiid document associated to the transaction's instrument")


  public Boolean getKiidAccessible() {
    return kiidAccessible;
  }

  public void setKiidAccessible(Boolean kiidAccessible) {
    this.kiidAccessible = kiidAccessible;
  }

  public TransactionSettingsData numberGroupedTransactions(Long numberGroupedTransactions) {
    this.numberGroupedTransactions = numberGroupedTransactions;
    return this;
  }

  /**
   * If the transaction is grouped, this field indicates the number of single orders which are grouped together.
   * @return numberGroupedTransactions
  **/
  @ApiModelProperty(value = "If the transaction is grouped, this field indicates the number of single orders which are grouped together.")


  public Long getNumberGroupedTransactions() {
    return numberGroupedTransactions;
  }

  public void setNumberGroupedTransactions(Long numberGroupedTransactions) {
    this.numberGroupedTransactions = numberGroupedTransactions;
  }

  public TransactionSettingsData omnibus(OmnibusEnum omnibus) {
    this.omnibus = omnibus;
    return this;
  }

  /**
   * Indicates whether the transaction is associated to an omnibus account.
   * @return omnibus
  **/
  @ApiModelProperty(value = "Indicates whether the transaction is associated to an omnibus account.")


  public OmnibusEnum getOmnibus() {
    return omnibus;
  }

  public void setOmnibus(OmnibusEnum omnibus) {
    this.omnibus = omnibus;
  }

  public TransactionSettingsData operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * If the transction is an Operation, this field keeps the id of this operation
   * @return operationId
  **/
  @ApiModelProperty(value = "If the transction is an Operation, this field keeps the id of this operation")


  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public TransactionSettingsData originatedFromOperation(Boolean originatedFromOperation) {
    this.originatedFromOperation = originatedFromOperation;
    return this;
  }

  /**
   * Indicates whether the source of the transaction is an {Operation}.
   * @return originatedFromOperation
  **/
  @ApiModelProperty(value = "Indicates whether the source of the transaction is an {Operation}.")


  public Boolean getOriginatedFromOperation() {
    return originatedFromOperation;
  }

  public void setOriginatedFromOperation(Boolean originatedFromOperation) {
    this.originatedFromOperation = originatedFromOperation;
  }

  public TransactionSettingsData originatedFromSpanishTransfer(Boolean originatedFromSpanishTransfer) {
    this.originatedFromSpanishTransfer = originatedFromSpanishTransfer;
    return this;
  }

  /**
   * Indicates whether the source of the transaction is an {Transfer}.
   * @return originatedFromSpanishTransfer
  **/
  @ApiModelProperty(value = "Indicates whether the source of the transaction is an {Transfer}.")


  public Boolean getOriginatedFromSpanishTransfer() {
    return originatedFromSpanishTransfer;
  }

  public void setOriginatedFromSpanishTransfer(Boolean originatedFromSpanishTransfer) {
    this.originatedFromSpanishTransfer = originatedFromSpanishTransfer;
  }

  public TransactionSettingsData pac(Boolean pac) {
    this.pac = pac;
    return this;
  }

  /**
   * Indicates whether the transaction is associated to an Italian PAC (Piano d'Accumulo del Capitale).
   * @return pac
  **/
  @ApiModelProperty(value = "Indicates whether the transaction is associated to an Italian PAC (Piano d'Accumulo del Capitale).")


  public Boolean getPac() {
    return pac;
  }

  public void setPac(Boolean pac) {
    this.pac = pac;
  }

  public TransactionSettingsData reportAccessible(Boolean reportAccessible) {
    this.reportAccessible = reportAccessible;
    return this;
  }

  /**
   * Indicates whether it is possible to get a PDF report for the {Transaction}
   * @return reportAccessible
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to get a PDF report for the {Transaction}")


  public Boolean getReportAccessible() {
    return reportAccessible;
  }

  public void setReportAccessible(Boolean reportAccessible) {
    this.reportAccessible = reportAccessible;
  }

  public TransactionSettingsData taxTransactionHistory(Boolean taxTransactionHistory) {
    this.taxTransactionHistory = taxTransactionHistory;
    return this;
  }

  /**
   * Indicates whether it is possible to consult the tax transaction history of the {DealingInstrument} associated to the transaction.
   * @return taxTransactionHistory
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to consult the tax transaction history of the {DealingInstrument} associated to the transaction.")


  public Boolean getTaxTransactionHistory() {
    return taxTransactionHistory;
  }

  public void setTaxTransactionHistory(Boolean taxTransactionHistory) {
    this.taxTransactionHistory = taxTransactionHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSettingsData transactionSettingsData = (TransactionSettingsData) o;
    return Objects.equals(this.cancelable, transactionSettingsData.cancelable) &&
        Objects.equals(this.dealingCurrencyPolicy, transactionSettingsData.dealingCurrencyPolicy) &&
        Objects.equals(this.exDividend, transactionSettingsData.exDividend) &&
        Objects.equals(this.grouped, transactionSettingsData.grouped) &&
        Objects.equals(this.groupedTransactionsConfirmed, transactionSettingsData.groupedTransactionsConfirmed) &&
        Objects.equals(this.historyAccessible, transactionSettingsData.historyAccessible) &&
        Objects.equals(this.kiidAccessible, transactionSettingsData.kiidAccessible) &&
        Objects.equals(this.numberGroupedTransactions, transactionSettingsData.numberGroupedTransactions) &&
        Objects.equals(this.omnibus, transactionSettingsData.omnibus) &&
        Objects.equals(this.operationId, transactionSettingsData.operationId) &&
        Objects.equals(this.originatedFromOperation, transactionSettingsData.originatedFromOperation) &&
        Objects.equals(this.originatedFromSpanishTransfer, transactionSettingsData.originatedFromSpanishTransfer) &&
        Objects.equals(this.pac, transactionSettingsData.pac) &&
        Objects.equals(this.reportAccessible, transactionSettingsData.reportAccessible) &&
        Objects.equals(this.taxTransactionHistory, transactionSettingsData.taxTransactionHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelable, dealingCurrencyPolicy, exDividend, grouped, groupedTransactionsConfirmed, historyAccessible, kiidAccessible, numberGroupedTransactions, omnibus, operationId, originatedFromOperation, originatedFromSpanishTransfer, pac, reportAccessible, taxTransactionHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSettingsData {\n");
    
    sb.append("    cancelable: ").append(toIndentedString(cancelable)).append("\n");
    sb.append("    dealingCurrencyPolicy: ").append(toIndentedString(dealingCurrencyPolicy)).append("\n");
    sb.append("    exDividend: ").append(toIndentedString(exDividend)).append("\n");
    sb.append("    grouped: ").append(toIndentedString(grouped)).append("\n");
    sb.append("    groupedTransactionsConfirmed: ").append(toIndentedString(groupedTransactionsConfirmed)).append("\n");
    sb.append("    historyAccessible: ").append(toIndentedString(historyAccessible)).append("\n");
    sb.append("    kiidAccessible: ").append(toIndentedString(kiidAccessible)).append("\n");
    sb.append("    numberGroupedTransactions: ").append(toIndentedString(numberGroupedTransactions)).append("\n");
    sb.append("    omnibus: ").append(toIndentedString(omnibus)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    originatedFromOperation: ").append(toIndentedString(originatedFromOperation)).append("\n");
    sb.append("    originatedFromSpanishTransfer: ").append(toIndentedString(originatedFromSpanishTransfer)).append("\n");
    sb.append("    pac: ").append(toIndentedString(pac)).append("\n");
    sb.append("    reportAccessible: ").append(toIndentedString(reportAccessible)).append("\n");
    sb.append("    taxTransactionHistory: ").append(toIndentedString(taxTransactionHistory)).append("\n");
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

