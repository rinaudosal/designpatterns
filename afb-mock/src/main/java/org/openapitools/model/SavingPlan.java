package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DealingInstrumentBreakdown;
import org.openapitools.model.ResourceReference;
import org.openapitools.model.SavingPlanBasicData;
import org.openapitools.model.SavingPlanEnlargementData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlan   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("assetAccountCode")
  private String assetAccountCode = null;

  @JsonProperty("associatedContract")
  private ResourceReference associatedContract = null;

  @JsonProperty("basicData")
  private SavingPlanBasicData basicData = null;

  @JsonProperty("collectiveInvestmentSchemeId")
  private Long collectiveInvestmentSchemeId = null;

  @JsonProperty("currentAccountCode")
  private String currentAccountCode = null;

  @JsonProperty("dealingInstrumentsBreakdown")
  @Valid
  private List<DealingInstrumentBreakdown> dealingInstrumentsBreakdown = null;

  @JsonProperty("enlargenmentData")
  private SavingPlanEnlargementData enlargenmentData = null;

  @JsonProperty("expenses")
  private Double expenses = null;

  @JsonProperty("fee")
  private Double fee = null;

  @JsonProperty("firstTransactionAmount")
  private Double firstTransactionAmount = null;

  @JsonProperty("firstTransactionFeePercentage")
  private Double firstTransactionFeePercentage = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("numberOfQuotas")
  private Long numberOfQuotas = null;

  @JsonProperty("numberOfQuotasFirstTransaction")
  private Long numberOfQuotasFirstTransaction = null;

  @JsonProperty("periodCode")
  private String periodCode = null;

  @JsonProperty("reductionPercentage")
  private Double reductionPercentage = null;

  @JsonProperty("secondTransactionDate")
  private OffsetDateTime secondTransactionDate = null;

  @JsonProperty("shares")
  private Double shares = null;

  @JsonProperty("valueDate")
  private OffsetDateTime valueDate = null;

  public SavingPlan amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Total amount associated to the {SavingPlan} expressed in {SavingPlan.basicData.currencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "Total amount associated to the {SavingPlan} expressed in {SavingPlan.basicData.currencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SavingPlan assetAccountCode(String assetAccountCode) {
    this.assetAccountCode = assetAccountCode;
    return this;
  }

  /**
   * The asset account code associated to the {SavingPlan}
   * @return assetAccountCode
  **/
  @ApiModelProperty(value = "The asset account code associated to the {SavingPlan}")


  public String getAssetAccountCode() {
    return assetAccountCode;
  }

  public void setAssetAccountCode(String assetAccountCode) {
    this.assetAccountCode = assetAccountCode;
  }

  public SavingPlan associatedContract(ResourceReference associatedContract) {
    this.associatedContract = associatedContract;
    return this;
  }

  /**
   * Get associatedContract
   * @return associatedContract
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getAssociatedContract() {
    return associatedContract;
  }

  public void setAssociatedContract(ResourceReference associatedContract) {
    this.associatedContract = associatedContract;
  }

  public SavingPlan basicData(SavingPlanBasicData basicData) {
    this.basicData = basicData;
    return this;
  }

  /**
   * Get basicData
   * @return basicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SavingPlanBasicData getBasicData() {
    return basicData;
  }

  public void setBasicData(SavingPlanBasicData basicData) {
    this.basicData = basicData;
  }

  public SavingPlan collectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
    return this;
  }

  /**
   * The Id of the {CollectiveInvestmentScheme}
   * @return collectiveInvestmentSchemeId
  **/
  @ApiModelProperty(value = "The Id of the {CollectiveInvestmentScheme}")


  public Long getCollectiveInvestmentSchemeId() {
    return collectiveInvestmentSchemeId;
  }

  public void setCollectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
  }

  public SavingPlan currentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
    return this;
  }

  /**
   * The current account code associated to the {SavingPlan}
   * @return currentAccountCode
  **/
  @ApiModelProperty(value = "The current account code associated to the {SavingPlan}")


  public String getCurrentAccountCode() {
    return currentAccountCode;
  }

  public void setCurrentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
  }

  public SavingPlan dealingInstrumentsBreakdown(List<DealingInstrumentBreakdown> dealingInstrumentsBreakdown) {
    this.dealingInstrumentsBreakdown = dealingInstrumentsBreakdown;
    return this;
  }

  public SavingPlan addDealingInstrumentsBreakdownItem(DealingInstrumentBreakdown dealingInstrumentsBreakdownItem) {
    if (this.dealingInstrumentsBreakdown == null) {
      this.dealingInstrumentsBreakdown = new ArrayList<>();
    }
    this.dealingInstrumentsBreakdown.add(dealingInstrumentsBreakdownItem);
    return this;
  }

  /**
   * Get dealingInstrumentsBreakdown
   * @return dealingInstrumentsBreakdown
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DealingInstrumentBreakdown> getDealingInstrumentsBreakdown() {
    return dealingInstrumentsBreakdown;
  }

  public void setDealingInstrumentsBreakdown(List<DealingInstrumentBreakdown> dealingInstrumentsBreakdown) {
    this.dealingInstrumentsBreakdown = dealingInstrumentsBreakdown;
  }

  public SavingPlan enlargenmentData(SavingPlanEnlargementData enlargenmentData) {
    this.enlargenmentData = enlargenmentData;
    return this;
  }

  /**
   * Get enlargenmentData
   * @return enlargenmentData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SavingPlanEnlargementData getEnlargenmentData() {
    return enlargenmentData;
  }

  public void setEnlargenmentData(SavingPlanEnlargementData enlargenmentData) {
    this.enlargenmentData = enlargenmentData;
  }

  public SavingPlan expenses(Double expenses) {
    this.expenses = expenses;
    return this;
  }

  /**
   * The expenses amount expressed in {SavingPlan.basicData.currencyCode}
   * @return expenses
  **/
  @ApiModelProperty(value = "The expenses amount expressed in {SavingPlan.basicData.currencyCode}")


  public Double getExpenses() {
    return expenses;
  }

  public void setExpenses(Double expenses) {
    this.expenses = expenses;
  }

  public SavingPlan fee(Double fee) {
    this.fee = fee;
    return this;
  }

  /**
   * The fee amount expressed in {SavingPlan.basicData.currencyCode}
   * @return fee
  **/
  @ApiModelProperty(value = "The fee amount expressed in {SavingPlan.basicData.currencyCode}")


  public Double getFee() {
    return fee;
  }

  public void setFee(Double fee) {
    this.fee = fee;
  }

  public SavingPlan firstTransactionAmount(Double firstTransactionAmount) {
    this.firstTransactionAmount = firstTransactionAmount;
    return this;
  }

  /**
   * The amount that corresponds of the first transaction of the {SavingPlan}
   * @return firstTransactionAmount
  **/
  @ApiModelProperty(value = "The amount that corresponds of the first transaction of the {SavingPlan}")


  public Double getFirstTransactionAmount() {
    return firstTransactionAmount;
  }

  public void setFirstTransactionAmount(Double firstTransactionAmount) {
    this.firstTransactionAmount = firstTransactionAmount;
  }

  public SavingPlan firstTransactionFeePercentage(Double firstTransactionFeePercentage) {
    this.firstTransactionFeePercentage = firstTransactionFeePercentage;
    return this;
  }

  /**
   * The first transaction fee percentage
   * @return firstTransactionFeePercentage
  **/
  @ApiModelProperty(value = "The first transaction fee percentage")


  public Double getFirstTransactionFeePercentage() {
    return firstTransactionFeePercentage;
  }

  public void setFirstTransactionFeePercentage(Double firstTransactionFeePercentage) {
    this.firstTransactionFeePercentage = firstTransactionFeePercentage;
  }

  public SavingPlan id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {SavingPlan}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {SavingPlan}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SavingPlan numberOfQuotas(Long numberOfQuotas) {
    this.numberOfQuotas = numberOfQuotas;
    return this;
  }

  /**
   * The number of quotas associated to the {SavingPlan}
   * @return numberOfQuotas
  **/
  @ApiModelProperty(value = "The number of quotas associated to the {SavingPlan}")


  public Long getNumberOfQuotas() {
    return numberOfQuotas;
  }

  public void setNumberOfQuotas(Long numberOfQuotas) {
    this.numberOfQuotas = numberOfQuotas;
  }

  public SavingPlan numberOfQuotasFirstTransaction(Long numberOfQuotasFirstTransaction) {
    this.numberOfQuotasFirstTransaction = numberOfQuotasFirstTransaction;
    return this;
  }

  /**
   * The number of quotas that corresponds of the first transaction of the {SavingPlan}
   * @return numberOfQuotasFirstTransaction
  **/
  @ApiModelProperty(value = "The number of quotas that corresponds of the first transaction of the {SavingPlan}")


  public Long getNumberOfQuotasFirstTransaction() {
    return numberOfQuotasFirstTransaction;
  }

  public void setNumberOfQuotasFirstTransaction(Long numberOfQuotasFirstTransaction) {
    this.numberOfQuotasFirstTransaction = numberOfQuotasFirstTransaction;
  }

  public SavingPlan periodCode(String periodCode) {
    this.periodCode = periodCode;
    return this;
  }

  /**
   * The period assigne to the {SavingPlan}. Refer of {listSavingPlanPeriods}
   * @return periodCode
  **/
  @ApiModelProperty(value = "The period assigne to the {SavingPlan}. Refer of {listSavingPlanPeriods}")


  public String getPeriodCode() {
    return periodCode;
  }

  public void setPeriodCode(String periodCode) {
    this.periodCode = periodCode;
  }

  public SavingPlan reductionPercentage(Double reductionPercentage) {
    this.reductionPercentage = reductionPercentage;
    return this;
  }

  /**
   * The reduction percentage
   * @return reductionPercentage
  **/
  @ApiModelProperty(value = "The reduction percentage")


  public Double getReductionPercentage() {
    return reductionPercentage;
  }

  public void setReductionPercentage(Double reductionPercentage) {
    this.reductionPercentage = reductionPercentage;
  }

  public SavingPlan secondTransactionDate(OffsetDateTime secondTransactionDate) {
    this.secondTransactionDate = secondTransactionDate;
    return this;
  }

  /**
   * The date when the payment of the second transaction of the {SavingPlan} will take effect
   * @return secondTransactionDate
  **/
  @ApiModelProperty(value = "The date when the payment of the second transaction of the {SavingPlan} will take effect")

  @Valid

  public OffsetDateTime getSecondTransactionDate() {
    return secondTransactionDate;
  }

  public void setSecondTransactionDate(OffsetDateTime secondTransactionDate) {
    this.secondTransactionDate = secondTransactionDate;
  }

  public SavingPlan shares(Double shares) {
    this.shares = shares;
    return this;
  }

  /**
   * Total number of shares associated to the {SavingPlan}
   * @return shares
  **/
  @ApiModelProperty(value = "Total number of shares associated to the {SavingPlan}")


  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public SavingPlan valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The date when the {SavingPlan} takes effect
   * @return valueDate
  **/
  @ApiModelProperty(value = "The date when the {SavingPlan} takes effect")

  @Valid

  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlan savingPlan = (SavingPlan) o;
    return Objects.equals(this.amount, savingPlan.amount) &&
        Objects.equals(this.assetAccountCode, savingPlan.assetAccountCode) &&
        Objects.equals(this.associatedContract, savingPlan.associatedContract) &&
        Objects.equals(this.basicData, savingPlan.basicData) &&
        Objects.equals(this.collectiveInvestmentSchemeId, savingPlan.collectiveInvestmentSchemeId) &&
        Objects.equals(this.currentAccountCode, savingPlan.currentAccountCode) &&
        Objects.equals(this.dealingInstrumentsBreakdown, savingPlan.dealingInstrumentsBreakdown) &&
        Objects.equals(this.enlargenmentData, savingPlan.enlargenmentData) &&
        Objects.equals(this.expenses, savingPlan.expenses) &&
        Objects.equals(this.fee, savingPlan.fee) &&
        Objects.equals(this.firstTransactionAmount, savingPlan.firstTransactionAmount) &&
        Objects.equals(this.firstTransactionFeePercentage, savingPlan.firstTransactionFeePercentage) &&
        Objects.equals(this.id, savingPlan.id) &&
        Objects.equals(this.numberOfQuotas, savingPlan.numberOfQuotas) &&
        Objects.equals(this.numberOfQuotasFirstTransaction, savingPlan.numberOfQuotasFirstTransaction) &&
        Objects.equals(this.periodCode, savingPlan.periodCode) &&
        Objects.equals(this.reductionPercentage, savingPlan.reductionPercentage) &&
        Objects.equals(this.secondTransactionDate, savingPlan.secondTransactionDate) &&
        Objects.equals(this.shares, savingPlan.shares) &&
        Objects.equals(this.valueDate, savingPlan.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, assetAccountCode, associatedContract, basicData, collectiveInvestmentSchemeId, currentAccountCode, dealingInstrumentsBreakdown, enlargenmentData, expenses, fee, firstTransactionAmount, firstTransactionFeePercentage, id, numberOfQuotas, numberOfQuotasFirstTransaction, periodCode, reductionPercentage, secondTransactionDate, shares, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlan {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assetAccountCode: ").append(toIndentedString(assetAccountCode)).append("\n");
    sb.append("    associatedContract: ").append(toIndentedString(associatedContract)).append("\n");
    sb.append("    basicData: ").append(toIndentedString(basicData)).append("\n");
    sb.append("    collectiveInvestmentSchemeId: ").append(toIndentedString(collectiveInvestmentSchemeId)).append("\n");
    sb.append("    currentAccountCode: ").append(toIndentedString(currentAccountCode)).append("\n");
    sb.append("    dealingInstrumentsBreakdown: ").append(toIndentedString(dealingInstrumentsBreakdown)).append("\n");
    sb.append("    enlargenmentData: ").append(toIndentedString(enlargenmentData)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    firstTransactionAmount: ").append(toIndentedString(firstTransactionAmount)).append("\n");
    sb.append("    firstTransactionFeePercentage: ").append(toIndentedString(firstTransactionFeePercentage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfQuotas: ").append(toIndentedString(numberOfQuotas)).append("\n");
    sb.append("    numberOfQuotasFirstTransaction: ").append(toIndentedString(numberOfQuotasFirstTransaction)).append("\n");
    sb.append("    periodCode: ").append(toIndentedString(periodCode)).append("\n");
    sb.append("    reductionPercentage: ").append(toIndentedString(reductionPercentage)).append("\n");
    sb.append("    secondTransactionDate: ").append(toIndentedString(secondTransactionDate)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

