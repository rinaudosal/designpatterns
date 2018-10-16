package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about fees applied to a transaction. They are all expressed in {Transaction.currencyCode}
 */
@ApiModel(description = "This object keeps specific information about fees applied to a transaction. They are all expressed in {Transaction.currencyCode}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionFeeData   {
  @JsonProperty("appliedDealingFundHouseFee")
  private Double appliedDealingFundHouseFee = null;

  @JsonProperty("appliedDistributorFee")
  private Double appliedDistributorFee = null;

  @JsonProperty("depositFee")
  private Double depositFee = null;

  @JsonProperty("dilutionLevy")
  private Double dilutionLevy = null;

  @JsonProperty("discount")
  private Double discount = null;

  @JsonProperty("exchangeFee")
  private Double exchangeFee = null;

  @JsonProperty("exitCharge")
  private Double exitCharge = null;

  @JsonProperty("expensesAppliedByAfb")
  private Double expensesAppliedByAfb = null;

  @JsonProperty("feePerDealingInstrument")
  private Double feePerDealingInstrument = null;

  @JsonProperty("firstTransactionFeeAmount")
  private Double firstTransactionFeeAmount = null;

  @JsonProperty("firstTransactionFeePercentage")
  private Double firstTransactionFeePercentage = null;

  @JsonProperty("initialCharge")
  private Double initialCharge = null;

  @JsonProperty("performanceFee")
  private Double performanceFee = null;

  @JsonProperty("secondTransactionFeeAmount")
  private Double secondTransactionFeeAmount = null;

  @JsonProperty("secondTransactionFeePercentage")
  private Double secondTransactionFeePercentage = null;

  @JsonProperty("totalFee")
  private Double totalFee = null;

  public TransactionFeeData appliedDealingFundHouseFee(Double appliedDealingFundHouseFee) {
    this.appliedDealingFundHouseFee = appliedDealingFundHouseFee;
    return this;
  }

  /**
   * The total amount of the dealing fund house's fee applied
   * @return appliedDealingFundHouseFee
  **/
  @ApiModelProperty(value = "The total amount of the dealing fund house's fee applied")


  public Double getAppliedDealingFundHouseFee() {
    return appliedDealingFundHouseFee;
  }

  public void setAppliedDealingFundHouseFee(Double appliedDealingFundHouseFee) {
    this.appliedDealingFundHouseFee = appliedDealingFundHouseFee;
  }

  public TransactionFeeData appliedDistributorFee(Double appliedDistributorFee) {
    this.appliedDistributorFee = appliedDistributorFee;
    return this;
  }

  /**
   * The  amount of the distributor's fee applied
   * @return appliedDistributorFee
  **/
  @ApiModelProperty(value = "The  amount of the distributor's fee applied")


  public Double getAppliedDistributorFee() {
    return appliedDistributorFee;
  }

  public void setAppliedDistributorFee(Double appliedDistributorFee) {
    this.appliedDistributorFee = appliedDistributorFee;
  }

  public TransactionFeeData depositFee(Double depositFee) {
    this.depositFee = depositFee;
    return this;
  }

  /**
   * Deposit fee applied to the transaction.
   * @return depositFee
  **/
  @ApiModelProperty(value = "Deposit fee applied to the transaction.")


  public Double getDepositFee() {
    return depositFee;
  }

  public void setDepositFee(Double depositFee) {
    this.depositFee = depositFee;
  }

  public TransactionFeeData dilutionLevy(Double dilutionLevy) {
    this.dilutionLevy = dilutionLevy;
    return this;
  }

  /**
   * The value of an extra charge levied by fund managers on investors buying or selling units in a fund.
   * @return dilutionLevy
  **/
  @ApiModelProperty(value = "The value of an extra charge levied by fund managers on investors buying or selling units in a fund.")


  public Double getDilutionLevy() {
    return dilutionLevy;
  }

  public void setDilutionLevy(Double dilutionLevy) {
    this.dilutionLevy = dilutionLevy;
  }

  public TransactionFeeData discount(Double discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Discount applied to the transaction
   * @return discount
  **/
  @ApiModelProperty(value = "Discount applied to the transaction")


  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public TransactionFeeData exchangeFee(Double exchangeFee) {
    this.exchangeFee = exchangeFee;
    return this;
  }

  /**
   * Exchange fee applied to the transaction
   * @return exchangeFee
  **/
  @ApiModelProperty(value = "Exchange fee applied to the transaction")


  public Double getExchangeFee() {
    return exchangeFee;
  }

  public void setExchangeFee(Double exchangeFee) {
    this.exchangeFee = exchangeFee;
  }

  public TransactionFeeData exitCharge(Double exitCharge) {
    this.exitCharge = exitCharge;
    return this;
  }

  /**
   * Exit charge applied to the transaction
   * @return exitCharge
  **/
  @ApiModelProperty(value = "Exit charge applied to the transaction")


  public Double getExitCharge() {
    return exitCharge;
  }

  public void setExitCharge(Double exitCharge) {
    this.exitCharge = exitCharge;
  }

  public TransactionFeeData expensesAppliedByAfb(Double expensesAppliedByAfb) {
    this.expensesAppliedByAfb = expensesAppliedByAfb;
    return this;
  }

  /**
   * Expenses applied by Allfunds Bank
   * @return expensesAppliedByAfb
  **/
  @ApiModelProperty(value = "Expenses applied by Allfunds Bank")


  public Double getExpensesAppliedByAfb() {
    return expensesAppliedByAfb;
  }

  public void setExpensesAppliedByAfb(Double expensesAppliedByAfb) {
    this.expensesAppliedByAfb = expensesAppliedByAfb;
  }

  public TransactionFeeData feePerDealingInstrument(Double feePerDealingInstrument) {
    this.feePerDealingInstrument = feePerDealingInstrument;
    return this;
  }

  /**
   * Applied fee per Fund/ETF
   * @return feePerDealingInstrument
  **/
  @ApiModelProperty(value = "Applied fee per Fund/ETF")


  public Double getFeePerDealingInstrument() {
    return feePerDealingInstrument;
  }

  public void setFeePerDealingInstrument(Double feePerDealingInstrument) {
    this.feePerDealingInstrument = feePerDealingInstrument;
  }

  public TransactionFeeData firstTransactionFeeAmount(Double firstTransactionFeeAmount) {
    this.firstTransactionFeeAmount = firstTransactionFeeAmount;
    return this;
  }

  /**
   * The amount of the first group of commission applied to the {Transaction} by the {Distributor}
   * @return firstTransactionFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the first group of commission applied to the {Transaction} by the {Distributor}")


  public Double getFirstTransactionFeeAmount() {
    return firstTransactionFeeAmount;
  }

  public void setFirstTransactionFeeAmount(Double firstTransactionFeeAmount) {
    this.firstTransactionFeeAmount = firstTransactionFeeAmount;
  }

  public TransactionFeeData firstTransactionFeePercentage(Double firstTransactionFeePercentage) {
    this.firstTransactionFeePercentage = firstTransactionFeePercentage;
    return this;
  }

  /**
   * The percentage of the first group of commission applied to the {Transaction} by the {Distributor}
   * @return firstTransactionFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the first group of commission applied to the {Transaction} by the {Distributor}")


  public Double getFirstTransactionFeePercentage() {
    return firstTransactionFeePercentage;
  }

  public void setFirstTransactionFeePercentage(Double firstTransactionFeePercentage) {
    this.firstTransactionFeePercentage = firstTransactionFeePercentage;
  }

  public TransactionFeeData initialCharge(Double initialCharge) {
    this.initialCharge = initialCharge;
    return this;
  }

  /**
   * Initial charge applied to the transaction
   * @return initialCharge
  **/
  @ApiModelProperty(value = "Initial charge applied to the transaction")


  public Double getInitialCharge() {
    return initialCharge;
  }

  public void setInitialCharge(Double initialCharge) {
    this.initialCharge = initialCharge;
  }

  public TransactionFeeData performanceFee(Double performanceFee) {
    this.performanceFee = performanceFee;
    return this;
  }

  /**
   * Performance fee applied to the transaction.
   * @return performanceFee
  **/
  @ApiModelProperty(value = "Performance fee applied to the transaction.")


  public Double getPerformanceFee() {
    return performanceFee;
  }

  public void setPerformanceFee(Double performanceFee) {
    this.performanceFee = performanceFee;
  }

  public TransactionFeeData secondTransactionFeeAmount(Double secondTransactionFeeAmount) {
    this.secondTransactionFeeAmount = secondTransactionFeeAmount;
    return this;
  }

  /**
   * The amount of the second group of commission applied to the {Transaction} by the {Distributor}
   * @return secondTransactionFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the second group of commission applied to the {Transaction} by the {Distributor}")


  public Double getSecondTransactionFeeAmount() {
    return secondTransactionFeeAmount;
  }

  public void setSecondTransactionFeeAmount(Double secondTransactionFeeAmount) {
    this.secondTransactionFeeAmount = secondTransactionFeeAmount;
  }

  public TransactionFeeData secondTransactionFeePercentage(Double secondTransactionFeePercentage) {
    this.secondTransactionFeePercentage = secondTransactionFeePercentage;
    return this;
  }

  /**
   * The percentage of the second group of commission applied to the {Transaction} by the {Distributor}
   * @return secondTransactionFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the second group of commission applied to the {Transaction} by the {Distributor}")


  public Double getSecondTransactionFeePercentage() {
    return secondTransactionFeePercentage;
  }

  public void setSecondTransactionFeePercentage(Double secondTransactionFeePercentage) {
    this.secondTransactionFeePercentage = secondTransactionFeePercentage;
  }

  public TransactionFeeData totalFee(Double totalFee) {
    this.totalFee = totalFee;
    return this;
  }

  /**
   * Fee amount that could be applied by the distributor. Expressed in {Transaction.currencyCode}
   * @return totalFee
  **/
  @ApiModelProperty(value = "Fee amount that could be applied by the distributor. Expressed in {Transaction.currencyCode}")


  public Double getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Double totalFee) {
    this.totalFee = totalFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFeeData transactionFeeData = (TransactionFeeData) o;
    return Objects.equals(this.appliedDealingFundHouseFee, transactionFeeData.appliedDealingFundHouseFee) &&
        Objects.equals(this.appliedDistributorFee, transactionFeeData.appliedDistributorFee) &&
        Objects.equals(this.depositFee, transactionFeeData.depositFee) &&
        Objects.equals(this.dilutionLevy, transactionFeeData.dilutionLevy) &&
        Objects.equals(this.discount, transactionFeeData.discount) &&
        Objects.equals(this.exchangeFee, transactionFeeData.exchangeFee) &&
        Objects.equals(this.exitCharge, transactionFeeData.exitCharge) &&
        Objects.equals(this.expensesAppliedByAfb, transactionFeeData.expensesAppliedByAfb) &&
        Objects.equals(this.feePerDealingInstrument, transactionFeeData.feePerDealingInstrument) &&
        Objects.equals(this.firstTransactionFeeAmount, transactionFeeData.firstTransactionFeeAmount) &&
        Objects.equals(this.firstTransactionFeePercentage, transactionFeeData.firstTransactionFeePercentage) &&
        Objects.equals(this.initialCharge, transactionFeeData.initialCharge) &&
        Objects.equals(this.performanceFee, transactionFeeData.performanceFee) &&
        Objects.equals(this.secondTransactionFeeAmount, transactionFeeData.secondTransactionFeeAmount) &&
        Objects.equals(this.secondTransactionFeePercentage, transactionFeeData.secondTransactionFeePercentage) &&
        Objects.equals(this.totalFee, transactionFeeData.totalFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDealingFundHouseFee, appliedDistributorFee, depositFee, dilutionLevy, discount, exchangeFee, exitCharge, expensesAppliedByAfb, feePerDealingInstrument, firstTransactionFeeAmount, firstTransactionFeePercentage, initialCharge, performanceFee, secondTransactionFeeAmount, secondTransactionFeePercentage, totalFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFeeData {\n");
    
    sb.append("    appliedDealingFundHouseFee: ").append(toIndentedString(appliedDealingFundHouseFee)).append("\n");
    sb.append("    appliedDistributorFee: ").append(toIndentedString(appliedDistributorFee)).append("\n");
    sb.append("    depositFee: ").append(toIndentedString(depositFee)).append("\n");
    sb.append("    dilutionLevy: ").append(toIndentedString(dilutionLevy)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    exchangeFee: ").append(toIndentedString(exchangeFee)).append("\n");
    sb.append("    exitCharge: ").append(toIndentedString(exitCharge)).append("\n");
    sb.append("    expensesAppliedByAfb: ").append(toIndentedString(expensesAppliedByAfb)).append("\n");
    sb.append("    feePerDealingInstrument: ").append(toIndentedString(feePerDealingInstrument)).append("\n");
    sb.append("    firstTransactionFeeAmount: ").append(toIndentedString(firstTransactionFeeAmount)).append("\n");
    sb.append("    firstTransactionFeePercentage: ").append(toIndentedString(firstTransactionFeePercentage)).append("\n");
    sb.append("    initialCharge: ").append(toIndentedString(initialCharge)).append("\n");
    sb.append("    performanceFee: ").append(toIndentedString(performanceFee)).append("\n");
    sb.append("    secondTransactionFeeAmount: ").append(toIndentedString(secondTransactionFeeAmount)).append("\n");
    sb.append("    secondTransactionFeePercentage: ").append(toIndentedString(secondTransactionFeePercentage)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
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

