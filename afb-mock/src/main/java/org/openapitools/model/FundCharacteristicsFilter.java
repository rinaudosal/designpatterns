package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DateComparisonFilter;
import org.openapitools.model.MinimunInvestmentFilter;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundCharacteristicsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundCharacteristicsFilter   {
  @JsonProperty("baseCurrencyCode")
  private String baseCurrencyCode = null;

  @JsonProperty("benchmarkName")
  private String benchmarkName = null;

  @JsonProperty("cnmvInstrument")
  private NumberComparisonFilter cnmvInstrument = null;

  @JsonProperty("collectiveInvestmentTransferableSecurities")
  private Boolean collectiveInvestmentTransferableSecurities = null;

  @JsonProperty("countryOfRegitrationCode")
  private String countryOfRegitrationCode = null;

  @JsonProperty("currencyAumCode")
  private String currencyAumCode = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dateAum")
  private DateComparisonFilter dateAum = null;

  @JsonProperty("datePortfolio")
  private DateComparisonFilter datePortfolio = null;

  @JsonProperty("distributionFrequencyCode")
  private String distributionFrequencyCode = null;

  @JsonProperty("domicilieCountryCode")
  private String domicilieCountryCode = null;

  @JsonProperty("fundAum")
  private NumberComparisonFilter fundAum = null;

  @JsonProperty("fundTypeCode")
  private String fundTypeCode = null;

  @JsonProperty("inceptionDate")
  private DateComparisonFilter inceptionDate = null;

  @JsonProperty("initialAum")
  private NumberComparisonFilter initialAum = null;

  @JsonProperty("lastPrice")
  private NumberComparisonFilter lastPrice = null;

  @JsonProperty("lastPriceDate")
  private DateComparisonFilter lastPriceDate = null;

  @JsonProperty("minimunInvestment")
  private MinimunInvestmentFilter minimunInvestment = null;

  @JsonProperty("name")
  @Valid
  private List<String> name = null;

  @JsonProperty("parentClass")
  private Boolean parentClass = null;

  @JsonProperty("rebalanceFrequencyCode")
  private String rebalanceFrequencyCode = null;

  @JsonProperty("riskLevel")
  private NumberComparisonFilter riskLevel = null;

  @JsonProperty("shareAum")
  private NumberComparisonFilter shareAum = null;

  @JsonProperty("shareTypeCode")
  private String shareTypeCode = null;

  @JsonProperty("shariaCompliant")
  private Boolean shariaCompliant = null;

  @JsonProperty("transferable")
  private Boolean transferable = null;

  public FundCharacteristicsFilter baseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
    return this;
  }

  /**
   * The Instrument's currency. Refer to {listCurrencies}
   * @return baseCurrencyCode
  **/
  @ApiModelProperty(value = "The Instrument's currency. Refer to {listCurrencies}")


  public String getBaseCurrencyCode() {
    return baseCurrencyCode;
  }

  public void setBaseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public FundCharacteristicsFilter benchmarkName(String benchmarkName) {
    this.benchmarkName = benchmarkName;
    return this;
  }

  /**
   * name of fund
   * @return benchmarkName
  **/
  @ApiModelProperty(value = "name of fund")


  public String getBenchmarkName() {
    return benchmarkName;
  }

  public void setBenchmarkName(String benchmarkName) {
    this.benchmarkName = benchmarkName;
  }

  public FundCharacteristicsFilter cnmvInstrument(NumberComparisonFilter cnmvInstrument) {
    this.cnmvInstrument = cnmvInstrument;
    return this;
  }

  /**
   * Get cnmvInstrument
   * @return cnmvInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getCnmvInstrument() {
    return cnmvInstrument;
  }

  public void setCnmvInstrument(NumberComparisonFilter cnmvInstrument) {
    this.cnmvInstrument = cnmvInstrument;
  }

  public FundCharacteristicsFilter collectiveInvestmentTransferableSecurities(Boolean collectiveInvestmentTransferableSecurities) {
    this.collectiveInvestmentTransferableSecurities = collectiveInvestmentTransferableSecurities;
    return this;
  }

  /**
   * UCITS Normative : A public limited company that coordinates the distribution and management of unit trusts amongst countries within the European Union
   * @return collectiveInvestmentTransferableSecurities
  **/
  @ApiModelProperty(value = "UCITS Normative : A public limited company that coordinates the distribution and management of unit trusts amongst countries within the European Union")


  public Boolean getCollectiveInvestmentTransferableSecurities() {
    return collectiveInvestmentTransferableSecurities;
  }

  public void setCollectiveInvestmentTransferableSecurities(Boolean collectiveInvestmentTransferableSecurities) {
    this.collectiveInvestmentTransferableSecurities = collectiveInvestmentTransferableSecurities;
  }

  public FundCharacteristicsFilter countryOfRegitrationCode(String countryOfRegitrationCode) {
    this.countryOfRegitrationCode = countryOfRegitrationCode;
    return this;
  }

  /**
   * The country code where the fund is regitration. Refer to {listCountries}
   * @return countryOfRegitrationCode
  **/
  @ApiModelProperty(value = "The country code where the fund is regitration. Refer to {listCountries}")


  public String getCountryOfRegitrationCode() {
    return countryOfRegitrationCode;
  }

  public void setCountryOfRegitrationCode(String countryOfRegitrationCode) {
    this.countryOfRegitrationCode = countryOfRegitrationCode;
  }

  public FundCharacteristicsFilter currencyAumCode(String currencyAumCode) {
    this.currencyAumCode = currencyAumCode;
    return this;
  }

  /**
   * name of base currency Refer to {listCurrencies}
   * @return currencyAumCode
  **/
  @ApiModelProperty(value = "name of base currency Refer to {listCurrencies}")


  public String getCurrencyAumCode() {
    return currencyAumCode;
  }

  public void setCurrencyAumCode(String currencyAumCode) {
    this.currencyAumCode = currencyAumCode;
  }

  public FundCharacteristicsFilter currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The Instrument's currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The Instrument's currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public FundCharacteristicsFilter dateAum(DateComparisonFilter dateAum) {
    this.dateAum = dateAum;
    return this;
  }

  /**
   * Get dateAum
   * @return dateAum
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateComparisonFilter getDateAum() {
    return dateAum;
  }

  public void setDateAum(DateComparisonFilter dateAum) {
    this.dateAum = dateAum;
  }

  public FundCharacteristicsFilter datePortfolio(DateComparisonFilter datePortfolio) {
    this.datePortfolio = datePortfolio;
    return this;
  }

  /**
   * Get datePortfolio
   * @return datePortfolio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateComparisonFilter getDatePortfolio() {
    return datePortfolio;
  }

  public void setDatePortfolio(DateComparisonFilter datePortfolio) {
    this.datePortfolio = datePortfolio;
  }

  public FundCharacteristicsFilter distributionFrequencyCode(String distributionFrequencyCode) {
    this.distributionFrequencyCode = distributionFrequencyCode;
    return this;
  }

  /**
   * distribution frequency Refer to {listFrequencies}
   * @return distributionFrequencyCode
  **/
  @ApiModelProperty(value = "distribution frequency Refer to {listFrequencies}")


  public String getDistributionFrequencyCode() {
    return distributionFrequencyCode;
  }

  public void setDistributionFrequencyCode(String distributionFrequencyCode) {
    this.distributionFrequencyCode = distributionFrequencyCode;
  }

  public FundCharacteristicsFilter domicilieCountryCode(String domicilieCountryCode) {
    this.domicilieCountryCode = domicilieCountryCode;
    return this;
  }

  /**
   * The country code where the fund is domiciliated. Refer to {listCountries}
   * @return domicilieCountryCode
  **/
  @ApiModelProperty(value = "The country code where the fund is domiciliated. Refer to {listCountries}")


  public String getDomicilieCountryCode() {
    return domicilieCountryCode;
  }

  public void setDomicilieCountryCode(String domicilieCountryCode) {
    this.domicilieCountryCode = domicilieCountryCode;
  }

  public FundCharacteristicsFilter fundAum(NumberComparisonFilter fundAum) {
    this.fundAum = fundAum;
    return this;
  }

  /**
   * Get fundAum
   * @return fundAum
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getFundAum() {
    return fundAum;
  }

  public void setFundAum(NumberComparisonFilter fundAum) {
    this.fundAum = fundAum;
  }

  public FundCharacteristicsFilter fundTypeCode(String fundTypeCode) {
    this.fundTypeCode = fundTypeCode;
    return this;
  }

  /**
   * Refer to {listFundTypes}
   * @return fundTypeCode
  **/
  @ApiModelProperty(value = "Refer to {listFundTypes}")


  public String getFundTypeCode() {
    return fundTypeCode;
  }

  public void setFundTypeCode(String fundTypeCode) {
    this.fundTypeCode = fundTypeCode;
  }

  public FundCharacteristicsFilter inceptionDate(DateComparisonFilter inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

  /**
   * Get inceptionDate
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateComparisonFilter getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(DateComparisonFilter inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public FundCharacteristicsFilter initialAum(NumberComparisonFilter initialAum) {
    this.initialAum = initialAum;
    return this;
  }

  /**
   * Get initialAum
   * @return initialAum
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getInitialAum() {
    return initialAum;
  }

  public void setInitialAum(NumberComparisonFilter initialAum) {
    this.initialAum = initialAum;
  }

  public FundCharacteristicsFilter lastPrice(NumberComparisonFilter lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

  /**
   * Get lastPrice
   * @return lastPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(NumberComparisonFilter lastPrice) {
    this.lastPrice = lastPrice;
  }

  public FundCharacteristicsFilter lastPriceDate(DateComparisonFilter lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
    return this;
  }

  /**
   * Get lastPriceDate
   * @return lastPriceDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateComparisonFilter getLastPriceDate() {
    return lastPriceDate;
  }

  public void setLastPriceDate(DateComparisonFilter lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
  }

  public FundCharacteristicsFilter minimunInvestment(MinimunInvestmentFilter minimunInvestment) {
    this.minimunInvestment = minimunInvestment;
    return this;
  }

  /**
   * Get minimunInvestment
   * @return minimunInvestment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MinimunInvestmentFilter getMinimunInvestment() {
    return minimunInvestment;
  }

  public void setMinimunInvestment(MinimunInvestmentFilter minimunInvestment) {
    this.minimunInvestment = minimunInvestment;
  }

  public FundCharacteristicsFilter name(List<String> name) {
    this.name = name;
    return this;
  }

  public FundCharacteristicsFilter addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public FundCharacteristicsFilter parentClass(Boolean parentClass) {
    this.parentClass = parentClass;
    return this;
  }

  /**
   * Get parentClass
   * @return parentClass
  **/
  @ApiModelProperty(value = "")


  public Boolean getParentClass() {
    return parentClass;
  }

  public void setParentClass(Boolean parentClass) {
    this.parentClass = parentClass;
  }

  public FundCharacteristicsFilter rebalanceFrequencyCode(String rebalanceFrequencyCode) {
    this.rebalanceFrequencyCode = rebalanceFrequencyCode;
    return this;
  }

  /**
   * distribution frequency Refer to {listFrequencies}
   * @return rebalanceFrequencyCode
  **/
  @ApiModelProperty(value = "distribution frequency Refer to {listFrequencies}")


  public String getRebalanceFrequencyCode() {
    return rebalanceFrequencyCode;
  }

  public void setRebalanceFrequencyCode(String rebalanceFrequencyCode) {
    this.rebalanceFrequencyCode = rebalanceFrequencyCode;
  }

  public FundCharacteristicsFilter riskLevel(NumberComparisonFilter riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

  /**
   * Get riskLevel
   * @return riskLevel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(NumberComparisonFilter riskLevel) {
    this.riskLevel = riskLevel;
  }

  public FundCharacteristicsFilter shareAum(NumberComparisonFilter shareAum) {
    this.shareAum = shareAum;
    return this;
  }

  /**
   * Get shareAum
   * @return shareAum
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getShareAum() {
    return shareAum;
  }

  public void setShareAum(NumberComparisonFilter shareAum) {
    this.shareAum = shareAum;
  }

  public FundCharacteristicsFilter shareTypeCode(String shareTypeCode) {
    this.shareTypeCode = shareTypeCode;
    return this;
  }

  /**
   * Refer to {listShareTypes}
   * @return shareTypeCode
  **/
  @ApiModelProperty(value = "Refer to {listShareTypes}")


  public String getShareTypeCode() {
    return shareTypeCode;
  }

  public void setShareTypeCode(String shareTypeCode) {
    this.shareTypeCode = shareTypeCode;
  }

  public FundCharacteristicsFilter shariaCompliant(Boolean shariaCompliant) {
    this.shariaCompliant = shariaCompliant;
    return this;
  }

  /**
   * An indication the fund complies with Sharia law, governing the payment of interest and fees.
   * @return shariaCompliant
  **/
  @ApiModelProperty(value = "An indication the fund complies with Sharia law, governing the payment of interest and fees.")


  public Boolean getShariaCompliant() {
    return shariaCompliant;
  }

  public void setShariaCompliant(Boolean shariaCompliant) {
    this.shariaCompliant = shariaCompliant;
  }

  public FundCharacteristicsFilter transferable(Boolean transferable) {
    this.transferable = transferable;
    return this;
  }

  /**
   * Get transferable
   * @return transferable
  **/
  @ApiModelProperty(value = "")


  public Boolean getTransferable() {
    return transferable;
  }

  public void setTransferable(Boolean transferable) {
    this.transferable = transferable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundCharacteristicsFilter fundCharacteristicsFilter = (FundCharacteristicsFilter) o;
    return Objects.equals(this.baseCurrencyCode, fundCharacteristicsFilter.baseCurrencyCode) &&
        Objects.equals(this.benchmarkName, fundCharacteristicsFilter.benchmarkName) &&
        Objects.equals(this.cnmvInstrument, fundCharacteristicsFilter.cnmvInstrument) &&
        Objects.equals(this.collectiveInvestmentTransferableSecurities, fundCharacteristicsFilter.collectiveInvestmentTransferableSecurities) &&
        Objects.equals(this.countryOfRegitrationCode, fundCharacteristicsFilter.countryOfRegitrationCode) &&
        Objects.equals(this.currencyAumCode, fundCharacteristicsFilter.currencyAumCode) &&
        Objects.equals(this.currencyCode, fundCharacteristicsFilter.currencyCode) &&
        Objects.equals(this.dateAum, fundCharacteristicsFilter.dateAum) &&
        Objects.equals(this.datePortfolio, fundCharacteristicsFilter.datePortfolio) &&
        Objects.equals(this.distributionFrequencyCode, fundCharacteristicsFilter.distributionFrequencyCode) &&
        Objects.equals(this.domicilieCountryCode, fundCharacteristicsFilter.domicilieCountryCode) &&
        Objects.equals(this.fundAum, fundCharacteristicsFilter.fundAum) &&
        Objects.equals(this.fundTypeCode, fundCharacteristicsFilter.fundTypeCode) &&
        Objects.equals(this.inceptionDate, fundCharacteristicsFilter.inceptionDate) &&
        Objects.equals(this.initialAum, fundCharacteristicsFilter.initialAum) &&
        Objects.equals(this.lastPrice, fundCharacteristicsFilter.lastPrice) &&
        Objects.equals(this.lastPriceDate, fundCharacteristicsFilter.lastPriceDate) &&
        Objects.equals(this.minimunInvestment, fundCharacteristicsFilter.minimunInvestment) &&
        Objects.equals(this.name, fundCharacteristicsFilter.name) &&
        Objects.equals(this.parentClass, fundCharacteristicsFilter.parentClass) &&
        Objects.equals(this.rebalanceFrequencyCode, fundCharacteristicsFilter.rebalanceFrequencyCode) &&
        Objects.equals(this.riskLevel, fundCharacteristicsFilter.riskLevel) &&
        Objects.equals(this.shareAum, fundCharacteristicsFilter.shareAum) &&
        Objects.equals(this.shareTypeCode, fundCharacteristicsFilter.shareTypeCode) &&
        Objects.equals(this.shariaCompliant, fundCharacteristicsFilter.shariaCompliant) &&
        Objects.equals(this.transferable, fundCharacteristicsFilter.transferable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrencyCode, benchmarkName, cnmvInstrument, collectiveInvestmentTransferableSecurities, countryOfRegitrationCode, currencyAumCode, currencyCode, dateAum, datePortfolio, distributionFrequencyCode, domicilieCountryCode, fundAum, fundTypeCode, inceptionDate, initialAum, lastPrice, lastPriceDate, minimunInvestment, name, parentClass, rebalanceFrequencyCode, riskLevel, shareAum, shareTypeCode, shariaCompliant, transferable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundCharacteristicsFilter {\n");
    
    sb.append("    baseCurrencyCode: ").append(toIndentedString(baseCurrencyCode)).append("\n");
    sb.append("    benchmarkName: ").append(toIndentedString(benchmarkName)).append("\n");
    sb.append("    cnmvInstrument: ").append(toIndentedString(cnmvInstrument)).append("\n");
    sb.append("    collectiveInvestmentTransferableSecurities: ").append(toIndentedString(collectiveInvestmentTransferableSecurities)).append("\n");
    sb.append("    countryOfRegitrationCode: ").append(toIndentedString(countryOfRegitrationCode)).append("\n");
    sb.append("    currencyAumCode: ").append(toIndentedString(currencyAumCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dateAum: ").append(toIndentedString(dateAum)).append("\n");
    sb.append("    datePortfolio: ").append(toIndentedString(datePortfolio)).append("\n");
    sb.append("    distributionFrequencyCode: ").append(toIndentedString(distributionFrequencyCode)).append("\n");
    sb.append("    domicilieCountryCode: ").append(toIndentedString(domicilieCountryCode)).append("\n");
    sb.append("    fundAum: ").append(toIndentedString(fundAum)).append("\n");
    sb.append("    fundTypeCode: ").append(toIndentedString(fundTypeCode)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    initialAum: ").append(toIndentedString(initialAum)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastPriceDate: ").append(toIndentedString(lastPriceDate)).append("\n");
    sb.append("    minimunInvestment: ").append(toIndentedString(minimunInvestment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentClass: ").append(toIndentedString(parentClass)).append("\n");
    sb.append("    rebalanceFrequencyCode: ").append(toIndentedString(rebalanceFrequencyCode)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    shareAum: ").append(toIndentedString(shareAum)).append("\n");
    sb.append("    shareTypeCode: ").append(toIndentedString(shareTypeCode)).append("\n");
    sb.append("    shariaCompliant: ").append(toIndentedString(shariaCompliant)).append("\n");
    sb.append("    transferable: ").append(toIndentedString(transferable)).append("\n");
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

