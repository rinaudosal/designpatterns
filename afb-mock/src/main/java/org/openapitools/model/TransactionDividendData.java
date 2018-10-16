package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.TransactionReinvestmentData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about dividend transactions.
 */
@ApiModel(description = "This object keeps specific information about dividend transactions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionDividendData   {
  /**
   * Defines category of the distribution between INTEREST or DIVIDEND
   */
  public enum DistributionCategoryEnum {
    INTEREST("INTEREST"),
    
    DIVIDEND("DIVIDEND");

    private String value;

    DistributionCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DistributionCategoryEnum fromValue(String text) {
      for (DistributionCategoryEnum b : DistributionCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("distributionCategory")
  private DistributionCategoryEnum distributionCategory = null;

  @JsonProperty("distributionNumber")
  private Long distributionNumber = null;

  /**
   * Defines if the distribution is by ACCUMULATION or by INCONME
   */
  public enum DistributionPolicyEnum {
    INCOME("INCOME"),
    
    ACCUMULATION("ACCUMULATION");

    private String value;

    DistributionPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DistributionPolicyEnum fromValue(String text) {
      for (DistributionPolicyEnum b : DistributionPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("distributionPolicy")
  private DistributionPolicyEnum distributionPolicy = null;

  @JsonProperty("dividendPayoutFrequencyCode")
  private String dividendPayoutFrequencyCode = null;

  @JsonProperty("dividendRate")
  private Double dividendRate = null;

  /**
   * Defines if the dividen is FINAL or INTERIM
   */
  public enum DividendTypeEnum {
    FINAL("FINAL"),
    
    INTERN("INTERN");

    private String value;

    DividendTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DividendTypeEnum fromValue(String text) {
      for (DividendTypeEnum b : DividendTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("dividendType")
  private DividendTypeEnum dividendType = null;

  @JsonProperty("equalizationRate")
  private Double equalizationRate = null;

  @JsonProperty("frankedIncomePercentage")
  private Double frankedIncomePercentage = null;

  @JsonProperty("grossAmountRate")
  private Double grossAmountRate = null;

  @JsonProperty("grossDividendAmount")
  private Double grossDividendAmount = null;

  @JsonProperty("incomeTax")
  private Double incomeTax = null;

  @JsonProperty("localAccount")
  private Boolean localAccount = null;

  @JsonProperty("netEqualizationAmount")
  private Double netEqualizationAmount = null;

  @JsonProperty("netIncomeAmount")
  private Double netIncomeAmount = null;

  @JsonProperty("paymentDate")
  private OffsetDateTime paymentDate = null;

  @JsonProperty("perDealingInstrumentCorporationTax")
  private Double perDealingInstrumentCorporationTax = null;

  @JsonProperty("perShareCorporationTax")
  private Double perShareCorporationTax = null;

  @JsonProperty("sharesRate")
  private Double sharesRate = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("transactionReinvestmentData")
  private TransactionReinvestmentData transactionReinvestmentData = null;

  @JsonProperty("unfrankedIncomePercentage")
  private Double unfrankedIncomePercentage = null;

  /**
   * Defines if the withholding is applied by the dealing fund house, by the distributor or by both
   */
  public enum WithholdingPolicyEnum {
    DEALING_FUND_HOUSE("DEALING_FUND_HOUSE"),
    
    DISTRIBUTOR("DISTRIBUTOR"),
    
    BOTH("BOTH");

    private String value;

    WithholdingPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WithholdingPolicyEnum fromValue(String text) {
      for (WithholdingPolicyEnum b : WithholdingPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("withholdingPolicy")
  private WithholdingPolicyEnum withholdingPolicy = null;

  public TransactionDividendData distributionCategory(DistributionCategoryEnum distributionCategory) {
    this.distributionCategory = distributionCategory;
    return this;
  }

  /**
   * Defines category of the distribution between INTEREST or DIVIDEND
   * @return distributionCategory
  **/
  @ApiModelProperty(value = "Defines category of the distribution between INTEREST or DIVIDEND")


  public DistributionCategoryEnum getDistributionCategory() {
    return distributionCategory;
  }

  public void setDistributionCategory(DistributionCategoryEnum distributionCategory) {
    this.distributionCategory = distributionCategory;
  }

  public TransactionDividendData distributionNumber(Long distributionNumber) {
    this.distributionNumber = distributionNumber;
    return this;
  }

  /**
   * Defines the distribution number of the dividend.
   * @return distributionNumber
  **/
  @ApiModelProperty(value = "Defines the distribution number of the dividend.")


  public Long getDistributionNumber() {
    return distributionNumber;
  }

  public void setDistributionNumber(Long distributionNumber) {
    this.distributionNumber = distributionNumber;
  }

  public TransactionDividendData distributionPolicy(DistributionPolicyEnum distributionPolicy) {
    this.distributionPolicy = distributionPolicy;
    return this;
  }

  /**
   * Defines if the distribution is by ACCUMULATION or by INCONME
   * @return distributionPolicy
  **/
  @ApiModelProperty(value = "Defines if the distribution is by ACCUMULATION or by INCONME")


  public DistributionPolicyEnum getDistributionPolicy() {
    return distributionPolicy;
  }

  public void setDistributionPolicy(DistributionPolicyEnum distributionPolicy) {
    this.distributionPolicy = distributionPolicy;
  }

  public TransactionDividendData dividendPayoutFrequencyCode(String dividendPayoutFrequencyCode) {
    this.dividendPayoutFrequencyCode = dividendPayoutFrequencyCode;
    return this;
  }

  /**
   * Defines periodicity of the distribution. Refer to {listDividendPayoutFrequencies}
   * @return dividendPayoutFrequencyCode
  **/
  @ApiModelProperty(value = "Defines periodicity of the distribution. Refer to {listDividendPayoutFrequencies}")


  public String getDividendPayoutFrequencyCode() {
    return dividendPayoutFrequencyCode;
  }

  public void setDividendPayoutFrequencyCode(String dividendPayoutFrequencyCode) {
    this.dividendPayoutFrequencyCode = dividendPayoutFrequencyCode;
  }

  public TransactionDividendData dividendRate(Double dividendRate) {
    this.dividendRate = dividendRate;
    return this;
  }

  /**
   * Applied rate to the dividend's distribuition.
   * @return dividendRate
  **/
  @ApiModelProperty(value = "Applied rate to the dividend's distribuition.")


  public Double getDividendRate() {
    return dividendRate;
  }

  public void setDividendRate(Double dividendRate) {
    this.dividendRate = dividendRate;
  }

  public TransactionDividendData dividendType(DividendTypeEnum dividendType) {
    this.dividendType = dividendType;
    return this;
  }

  /**
   * Defines if the dividen is FINAL or INTERIM
   * @return dividendType
  **/
  @ApiModelProperty(value = "Defines if the dividen is FINAL or INTERIM")


  public DividendTypeEnum getDividendType() {
    return dividendType;
  }

  public void setDividendType(DividendTypeEnum dividendType) {
    this.dividendType = dividendType;
  }

  public TransactionDividendData equalizationRate(Double equalizationRate) {
    this.equalizationRate = equalizationRate;
    return this;
  }

  /**
   * Equalization rate applied
   * @return equalizationRate
  **/
  @ApiModelProperty(value = "Equalization rate applied")


  public Double getEqualizationRate() {
    return equalizationRate;
  }

  public void setEqualizationRate(Double equalizationRate) {
    this.equalizationRate = equalizationRate;
  }

  public TransactionDividendData frankedIncomePercentage(Double frankedIncomePercentage) {
    this.frankedIncomePercentage = frankedIncomePercentage;
    return this;
  }

  /**
   * Franked income percentage.
   * @return frankedIncomePercentage
  **/
  @ApiModelProperty(value = "Franked income percentage.")


  public Double getFrankedIncomePercentage() {
    return frankedIncomePercentage;
  }

  public void setFrankedIncomePercentage(Double frankedIncomePercentage) {
    this.frankedIncomePercentage = frankedIncomePercentage;
  }

  public TransactionDividendData grossAmountRate(Double grossAmountRate) {
    this.grossAmountRate = grossAmountRate;
    return this;
  }

  /**
   * Applied rate to the gross amount of the dividend.
   * @return grossAmountRate
  **/
  @ApiModelProperty(value = "Applied rate to the gross amount of the dividend.")


  public Double getGrossAmountRate() {
    return grossAmountRate;
  }

  public void setGrossAmountRate(Double grossAmountRate) {
    this.grossAmountRate = grossAmountRate;
  }

  public TransactionDividendData grossDividendAmount(Double grossDividendAmount) {
    this.grossDividendAmount = grossDividendAmount;
    return this;
  }

  /**
   * Gross dividend amount. Expressed in {Transaction.currencyCode}
   * @return grossDividendAmount
  **/
  @ApiModelProperty(value = "Gross dividend amount. Expressed in {Transaction.currencyCode}")


  public Double getGrossDividendAmount() {
    return grossDividendAmount;
  }

  public void setGrossDividendAmount(Double grossDividendAmount) {
    this.grossDividendAmount = grossDividendAmount;
  }

  public TransactionDividendData incomeTax(Double incomeTax) {
    this.incomeTax = incomeTax;
    return this;
  }

  /**
   * Income tax applied. Expressed in {Transaction.currencyCode}
   * @return incomeTax
  **/
  @ApiModelProperty(value = "Income tax applied. Expressed in {Transaction.currencyCode}")


  public Double getIncomeTax() {
    return incomeTax;
  }

  public void setIncomeTax(Double incomeTax) {
    this.incomeTax = incomeTax;
  }

  public TransactionDividendData localAccount(Boolean localAccount) {
    this.localAccount = localAccount;
    return this;
  }

  /**
   * Indicates if the client account is checked as local according the country of the {DealingFundHouse}
   * @return localAccount
  **/
  @ApiModelProperty(value = "Indicates if the client account is checked as local according the country of the {DealingFundHouse}")


  public Boolean getLocalAccount() {
    return localAccount;
  }

  public void setLocalAccount(Boolean localAccount) {
    this.localAccount = localAccount;
  }

  public TransactionDividendData netEqualizationAmount(Double netEqualizationAmount) {
    this.netEqualizationAmount = netEqualizationAmount;
    return this;
  }

  /**
   * Net equalization amount. Expressed in {Transaction.currencyCode}
   * @return netEqualizationAmount
  **/
  @ApiModelProperty(value = "Net equalization amount. Expressed in {Transaction.currencyCode}")


  public Double getNetEqualizationAmount() {
    return netEqualizationAmount;
  }

  public void setNetEqualizationAmount(Double netEqualizationAmount) {
    this.netEqualizationAmount = netEqualizationAmount;
  }

  public TransactionDividendData netIncomeAmount(Double netIncomeAmount) {
    this.netIncomeAmount = netIncomeAmount;
    return this;
  }

  /**
   * Income net amount. Expressed in {Transaction.currencyCode}
   * @return netIncomeAmount
  **/
  @ApiModelProperty(value = "Income net amount. Expressed in {Transaction.currencyCode}")


  public Double getNetIncomeAmount() {
    return netIncomeAmount;
  }

  public void setNetIncomeAmount(Double netIncomeAmount) {
    this.netIncomeAmount = netIncomeAmount;
  }

  public TransactionDividendData paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The {Transaction} payment date where event is generated
   * @return paymentDate
  **/
  @ApiModelProperty(value = "The {Transaction} payment date where event is generated")

  @Valid

  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public TransactionDividendData perDealingInstrumentCorporationTax(Double perDealingInstrumentCorporationTax) {
    this.perDealingInstrumentCorporationTax = perDealingInstrumentCorporationTax;
    return this;
  }

  /**
   * Trustee's net liability to corporation tax per {Fund} or {ETF}. Expressed in {Transaction.currencyCode}
   * @return perDealingInstrumentCorporationTax
  **/
  @ApiModelProperty(value = "Trustee's net liability to corporation tax per {Fund} or {ETF}. Expressed in {Transaction.currencyCode}")


  public Double getPerDealingInstrumentCorporationTax() {
    return perDealingInstrumentCorporationTax;
  }

  public void setPerDealingInstrumentCorporationTax(Double perDealingInstrumentCorporationTax) {
    this.perDealingInstrumentCorporationTax = perDealingInstrumentCorporationTax;
  }

  public TransactionDividendData perShareCorporationTax(Double perShareCorporationTax) {
    this.perShareCorporationTax = perShareCorporationTax;
    return this;
  }

  /**
   * Trustee's net liability to corporation tax per unit/share. Expressed in {Transaction.currencyCode}
   * @return perShareCorporationTax
  **/
  @ApiModelProperty(value = "Trustee's net liability to corporation tax per unit/share. Expressed in {Transaction.currencyCode}")


  public Double getPerShareCorporationTax() {
    return perShareCorporationTax;
  }

  public void setPerShareCorporationTax(Double perShareCorporationTax) {
    this.perShareCorporationTax = perShareCorporationTax;
  }

  public TransactionDividendData sharesRate(Double sharesRate) {
    this.sharesRate = sharesRate;
    return this;
  }

  /**
   * Applied rate to the shares of the dividend.
   * @return sharesRate
  **/
  @ApiModelProperty(value = "Applied rate to the shares of the dividend.")


  public Double getSharesRate() {
    return sharesRate;
  }

  public void setSharesRate(Double sharesRate) {
    this.sharesRate = sharesRate;
  }

  public TransactionDividendData startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The {Transaction}'s start date from equalization
   * @return startDate
  **/
  @ApiModelProperty(value = "The {Transaction}'s start date from equalization")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public TransactionDividendData transactionReinvestmentData(TransactionReinvestmentData transactionReinvestmentData) {
    this.transactionReinvestmentData = transactionReinvestmentData;
    return this;
  }

  /**
   * Get transactionReinvestmentData
   * @return transactionReinvestmentData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionReinvestmentData getTransactionReinvestmentData() {
    return transactionReinvestmentData;
  }

  public void setTransactionReinvestmentData(TransactionReinvestmentData transactionReinvestmentData) {
    this.transactionReinvestmentData = transactionReinvestmentData;
  }

  public TransactionDividendData unfrankedIncomePercentage(Double unfrankedIncomePercentage) {
    this.unfrankedIncomePercentage = unfrankedIncomePercentage;
    return this;
  }

  /**
   * Unfranked income percentage.
   * @return unfrankedIncomePercentage
  **/
  @ApiModelProperty(value = "Unfranked income percentage.")


  public Double getUnfrankedIncomePercentage() {
    return unfrankedIncomePercentage;
  }

  public void setUnfrankedIncomePercentage(Double unfrankedIncomePercentage) {
    this.unfrankedIncomePercentage = unfrankedIncomePercentage;
  }

  public TransactionDividendData withholdingPolicy(WithholdingPolicyEnum withholdingPolicy) {
    this.withholdingPolicy = withholdingPolicy;
    return this;
  }

  /**
   * Defines if the withholding is applied by the dealing fund house, by the distributor or by both
   * @return withholdingPolicy
  **/
  @ApiModelProperty(value = "Defines if the withholding is applied by the dealing fund house, by the distributor or by both")


  public WithholdingPolicyEnum getWithholdingPolicy() {
    return withholdingPolicy;
  }

  public void setWithholdingPolicy(WithholdingPolicyEnum withholdingPolicy) {
    this.withholdingPolicy = withholdingPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDividendData transactionDividendData = (TransactionDividendData) o;
    return Objects.equals(this.distributionCategory, transactionDividendData.distributionCategory) &&
        Objects.equals(this.distributionNumber, transactionDividendData.distributionNumber) &&
        Objects.equals(this.distributionPolicy, transactionDividendData.distributionPolicy) &&
        Objects.equals(this.dividendPayoutFrequencyCode, transactionDividendData.dividendPayoutFrequencyCode) &&
        Objects.equals(this.dividendRate, transactionDividendData.dividendRate) &&
        Objects.equals(this.dividendType, transactionDividendData.dividendType) &&
        Objects.equals(this.equalizationRate, transactionDividendData.equalizationRate) &&
        Objects.equals(this.frankedIncomePercentage, transactionDividendData.frankedIncomePercentage) &&
        Objects.equals(this.grossAmountRate, transactionDividendData.grossAmountRate) &&
        Objects.equals(this.grossDividendAmount, transactionDividendData.grossDividendAmount) &&
        Objects.equals(this.incomeTax, transactionDividendData.incomeTax) &&
        Objects.equals(this.localAccount, transactionDividendData.localAccount) &&
        Objects.equals(this.netEqualizationAmount, transactionDividendData.netEqualizationAmount) &&
        Objects.equals(this.netIncomeAmount, transactionDividendData.netIncomeAmount) &&
        Objects.equals(this.paymentDate, transactionDividendData.paymentDate) &&
        Objects.equals(this.perDealingInstrumentCorporationTax, transactionDividendData.perDealingInstrumentCorporationTax) &&
        Objects.equals(this.perShareCorporationTax, transactionDividendData.perShareCorporationTax) &&
        Objects.equals(this.sharesRate, transactionDividendData.sharesRate) &&
        Objects.equals(this.startDate, transactionDividendData.startDate) &&
        Objects.equals(this.transactionReinvestmentData, transactionDividendData.transactionReinvestmentData) &&
        Objects.equals(this.unfrankedIncomePercentage, transactionDividendData.unfrankedIncomePercentage) &&
        Objects.equals(this.withholdingPolicy, transactionDividendData.withholdingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionCategory, distributionNumber, distributionPolicy, dividendPayoutFrequencyCode, dividendRate, dividendType, equalizationRate, frankedIncomePercentage, grossAmountRate, grossDividendAmount, incomeTax, localAccount, netEqualizationAmount, netIncomeAmount, paymentDate, perDealingInstrumentCorporationTax, perShareCorporationTax, sharesRate, startDate, transactionReinvestmentData, unfrankedIncomePercentage, withholdingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDividendData {\n");
    
    sb.append("    distributionCategory: ").append(toIndentedString(distributionCategory)).append("\n");
    sb.append("    distributionNumber: ").append(toIndentedString(distributionNumber)).append("\n");
    sb.append("    distributionPolicy: ").append(toIndentedString(distributionPolicy)).append("\n");
    sb.append("    dividendPayoutFrequencyCode: ").append(toIndentedString(dividendPayoutFrequencyCode)).append("\n");
    sb.append("    dividendRate: ").append(toIndentedString(dividendRate)).append("\n");
    sb.append("    dividendType: ").append(toIndentedString(dividendType)).append("\n");
    sb.append("    equalizationRate: ").append(toIndentedString(equalizationRate)).append("\n");
    sb.append("    frankedIncomePercentage: ").append(toIndentedString(frankedIncomePercentage)).append("\n");
    sb.append("    grossAmountRate: ").append(toIndentedString(grossAmountRate)).append("\n");
    sb.append("    grossDividendAmount: ").append(toIndentedString(grossDividendAmount)).append("\n");
    sb.append("    incomeTax: ").append(toIndentedString(incomeTax)).append("\n");
    sb.append("    localAccount: ").append(toIndentedString(localAccount)).append("\n");
    sb.append("    netEqualizationAmount: ").append(toIndentedString(netEqualizationAmount)).append("\n");
    sb.append("    netIncomeAmount: ").append(toIndentedString(netIncomeAmount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    perDealingInstrumentCorporationTax: ").append(toIndentedString(perDealingInstrumentCorporationTax)).append("\n");
    sb.append("    perShareCorporationTax: ").append(toIndentedString(perShareCorporationTax)).append("\n");
    sb.append("    sharesRate: ").append(toIndentedString(sharesRate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    transactionReinvestmentData: ").append(toIndentedString(transactionReinvestmentData)).append("\n");
    sb.append("    unfrankedIncomePercentage: ").append(toIndentedString(unfrankedIncomePercentage)).append("\n");
    sb.append("    withholdingPolicy: ").append(toIndentedString(withholdingPolicy)).append("\n");
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

