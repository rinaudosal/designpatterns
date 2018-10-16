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
 * RawSearchInstrumentResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RawSearchInstrumentResult   {
  @JsonProperty("baseCurrencyCode")
  private String baseCurrencyCode = null;

  @JsonProperty("classificationKeyValuesALLFUNDSCATEGORY")
  private String classificationKeyValuesALLFUNDSCATEGORY = null;

  @JsonProperty("cnmvInstrument")
  private Double cnmvInstrument = null;

  @JsonProperty("collectiveInvestmentTransferableSecurities")
  private Boolean collectiveInvestmentTransferableSecurities = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dateAum")
  private OffsetDateTime dateAum = null;

  @JsonProperty("datePortfolio")
  private OffsetDateTime datePortfolio = null;

  @JsonProperty("dealingAvailable")
  private Boolean dealingAvailable = null;

  @JsonProperty("distributionFrequency")
  private String distributionFrequency = null;

  @JsonProperty("domicilie")
  private String domicilie = null;

  @JsonProperty("externalCodeKeyValuesISIN")
  private String externalCodeKeyValuesISIN = null;

  @JsonProperty("feesAnnual")
  private Double feesAnnual = null;

  @JsonProperty("feesDistribution")
  private Double feesDistribution = null;

  @JsonProperty("feesExitMax")
  private Double feesExitMax = null;

  @JsonProperty("feesInitialMax")
  private Double feesInitialMax = null;

  @JsonProperty("feesOperatingCashFlow")
  private Double feesOperatingCashFlow = null;

  @JsonProperty("feesPerformance")
  private Double feesPerformance = null;

  @JsonProperty("fundAum")
  private Double fundAum = null;

  @JsonProperty("fundCurrencyAumCode")
  private String fundCurrencyAumCode = null;

  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("fundHouseId")
  private Long fundHouseId = null;

  @JsonProperty("fundTypeCode")
  private String fundTypeCode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("inceptionDate")
  private OffsetDateTime inceptionDate = null;

  @JsonProperty("indexName")
  private String indexName = null;

  @JsonProperty("informationProvider")
  private String informationProvider = null;

  @JsonProperty("instrumentType")
  private String instrumentType = null;

  @JsonProperty("lastPrice")
  private Double lastPrice = null;

  @JsonProperty("lastPriceDate")
  private OffsetDateTime lastPriceDate = null;

  @JsonProperty("mifid2ReportingDate")
  private OffsetDateTime mifid2ReportingDate = null;

  @JsonProperty("minimunInvestmentInitial")
  private Double minimunInvestmentInitial = null;

  @JsonProperty("minimunInvestmentSubsequent")
  private Double minimunInvestmentSubsequent = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ongoingChargeDate")
  private OffsetDateTime ongoingChargeDate = null;

  @JsonProperty("performanceAnnualHistory1")
  private Double performanceAnnualHistory1 = null;

  @JsonProperty("performanceAnnualHistory2")
  private Double performanceAnnualHistory2 = null;

  @JsonProperty("performanceAnnualYtd")
  private Double performanceAnnualYtd = null;

  @JsonProperty("performanceCumulativeDay")
  private Double performanceCumulativeDay = null;

  @JsonProperty("performanceCumulativeFiveYears")
  private Double performanceCumulativeFiveYears = null;

  @JsonProperty("performanceCumulativeOneYear")
  private Double performanceCumulativeOneYear = null;

  @JsonProperty("performanceCumulativeSixMonths")
  private Double performanceCumulativeSixMonths = null;

  @JsonProperty("performanceCumulativeThreeYears")
  private Double performanceCumulativeThreeYears = null;

  @JsonProperty("performanceCumulativeWeek")
  private Double performanceCumulativeWeek = null;

  @JsonProperty("priipsReportingDate")
  private OffsetDateTime priipsReportingDate = null;

  @JsonProperty("productStructure")
  private String productStructure = null;

  @JsonProperty("rebalanceFrequency")
  private String rebalanceFrequency = null;

  @JsonProperty("replicationMethod")
  private String replicationMethod = null;

  @JsonProperty("riskLevel")
  private Long riskLevel = null;

  @JsonProperty("shareTypeCode")
  private String shareTypeCode = null;

  @JsonProperty("statisticAbsoluteMaxDrawdown")
  private Double statisticAbsoluteMaxDrawdown = null;

  @JsonProperty("statisticAbsolutePerformance")
  private Double statisticAbsolutePerformance = null;

  @JsonProperty("statisticAbsoluteSharpeRatio")
  private Double statisticAbsoluteSharpeRatio = null;

  @JsonProperty("statisticAbsoluteVolatility")
  private Double statisticAbsoluteVolatility = null;

  @JsonProperty("statisticRelativeAlpha")
  private Double statisticRelativeAlpha = null;

  @JsonProperty("statisticRelativeBeta")
  private Double statisticRelativeBeta = null;

  @JsonProperty("statisticRelativeCorrelation")
  private Double statisticRelativeCorrelation = null;

  @JsonProperty("statisticRelativeInfoRatio")
  private Double statisticRelativeInfoRatio = null;

  @JsonProperty("statisticRelativeTrackingError")
  private Double statisticRelativeTrackingError = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  @JsonProperty("subscriptionTypeCurrency")
  private String subscriptionTypeCurrency = null;

  @JsonProperty("transferable")
  private Boolean transferable = null;

  @JsonProperty("whiteassimilated")
  private Double whiteassimilated = null;

  @JsonProperty("whiteassimilatedAnt")
  private Double whiteassimilatedAnt = null;

  public RawSearchInstrumentResult baseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
    return this;
  }

  /**
   * Get baseCurrencyCode
   * @return baseCurrencyCode
  **/
  @ApiModelProperty(value = "")


  public String getBaseCurrencyCode() {
    return baseCurrencyCode;
  }

  public void setBaseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }

  public RawSearchInstrumentResult classificationKeyValuesALLFUNDSCATEGORY(String classificationKeyValuesALLFUNDSCATEGORY) {
    this.classificationKeyValuesALLFUNDSCATEGORY = classificationKeyValuesALLFUNDSCATEGORY;
    return this;
  }

  /**
   * Get classificationKeyValuesALLFUNDSCATEGORY
   * @return classificationKeyValuesALLFUNDSCATEGORY
  **/
  @ApiModelProperty(value = "")


  public String getClassificationKeyValuesALLFUNDSCATEGORY() {
    return classificationKeyValuesALLFUNDSCATEGORY;
  }

  public void setClassificationKeyValuesALLFUNDSCATEGORY(String classificationKeyValuesALLFUNDSCATEGORY) {
    this.classificationKeyValuesALLFUNDSCATEGORY = classificationKeyValuesALLFUNDSCATEGORY;
  }

  public RawSearchInstrumentResult cnmvInstrument(Double cnmvInstrument) {
    this.cnmvInstrument = cnmvInstrument;
    return this;
  }

  /**
   * Get cnmvInstrument
   * @return cnmvInstrument
  **/
  @ApiModelProperty(value = "")


  public Double getCnmvInstrument() {
    return cnmvInstrument;
  }

  public void setCnmvInstrument(Double cnmvInstrument) {
    this.cnmvInstrument = cnmvInstrument;
  }

  public RawSearchInstrumentResult collectiveInvestmentTransferableSecurities(Boolean collectiveInvestmentTransferableSecurities) {
    this.collectiveInvestmentTransferableSecurities = collectiveInvestmentTransferableSecurities;
    return this;
  }

  /**
   * Get collectiveInvestmentTransferableSecurities
   * @return collectiveInvestmentTransferableSecurities
  **/
  @ApiModelProperty(value = "")


  public Boolean getCollectiveInvestmentTransferableSecurities() {
    return collectiveInvestmentTransferableSecurities;
  }

  public void setCollectiveInvestmentTransferableSecurities(Boolean collectiveInvestmentTransferableSecurities) {
    this.collectiveInvestmentTransferableSecurities = collectiveInvestmentTransferableSecurities;
  }

  public RawSearchInstrumentResult currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public RawSearchInstrumentResult dateAum(OffsetDateTime dateAum) {
    this.dateAum = dateAum;
    return this;
  }

  /**
   * Get dateAum
   * @return dateAum
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateAum() {
    return dateAum;
  }

  public void setDateAum(OffsetDateTime dateAum) {
    this.dateAum = dateAum;
  }

  public RawSearchInstrumentResult datePortfolio(OffsetDateTime datePortfolio) {
    this.datePortfolio = datePortfolio;
    return this;
  }

  /**
   * Get datePortfolio
   * @return datePortfolio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDatePortfolio() {
    return datePortfolio;
  }

  public void setDatePortfolio(OffsetDateTime datePortfolio) {
    this.datePortfolio = datePortfolio;
  }

  public RawSearchInstrumentResult dealingAvailable(Boolean dealingAvailable) {
    this.dealingAvailable = dealingAvailable;
    return this;
  }

  /**
   * Get dealingAvailable
   * @return dealingAvailable
  **/
  @ApiModelProperty(value = "")


  public Boolean getDealingAvailable() {
    return dealingAvailable;
  }

  public void setDealingAvailable(Boolean dealingAvailable) {
    this.dealingAvailable = dealingAvailable;
  }

  public RawSearchInstrumentResult distributionFrequency(String distributionFrequency) {
    this.distributionFrequency = distributionFrequency;
    return this;
  }

  /**
   * Get distributionFrequency
   * @return distributionFrequency
  **/
  @ApiModelProperty(value = "")


  public String getDistributionFrequency() {
    return distributionFrequency;
  }

  public void setDistributionFrequency(String distributionFrequency) {
    this.distributionFrequency = distributionFrequency;
  }

  public RawSearchInstrumentResult domicilie(String domicilie) {
    this.domicilie = domicilie;
    return this;
  }

  /**
   * Get domicilie
   * @return domicilie
  **/
  @ApiModelProperty(value = "")


  public String getDomicilie() {
    return domicilie;
  }

  public void setDomicilie(String domicilie) {
    this.domicilie = domicilie;
  }

  public RawSearchInstrumentResult externalCodeKeyValuesISIN(String externalCodeKeyValuesISIN) {
    this.externalCodeKeyValuesISIN = externalCodeKeyValuesISIN;
    return this;
  }

  /**
   * Get externalCodeKeyValuesISIN
   * @return externalCodeKeyValuesISIN
  **/
  @ApiModelProperty(value = "")


  public String getExternalCodeKeyValuesISIN() {
    return externalCodeKeyValuesISIN;
  }

  public void setExternalCodeKeyValuesISIN(String externalCodeKeyValuesISIN) {
    this.externalCodeKeyValuesISIN = externalCodeKeyValuesISIN;
  }

  public RawSearchInstrumentResult feesAnnual(Double feesAnnual) {
    this.feesAnnual = feesAnnual;
    return this;
  }

  /**
   * Get feesAnnual
   * @return feesAnnual
  **/
  @ApiModelProperty(value = "")


  public Double getFeesAnnual() {
    return feesAnnual;
  }

  public void setFeesAnnual(Double feesAnnual) {
    this.feesAnnual = feesAnnual;
  }

  public RawSearchInstrumentResult feesDistribution(Double feesDistribution) {
    this.feesDistribution = feesDistribution;
    return this;
  }

  /**
   * Get feesDistribution
   * @return feesDistribution
  **/
  @ApiModelProperty(value = "")


  public Double getFeesDistribution() {
    return feesDistribution;
  }

  public void setFeesDistribution(Double feesDistribution) {
    this.feesDistribution = feesDistribution;
  }

  public RawSearchInstrumentResult feesExitMax(Double feesExitMax) {
    this.feesExitMax = feesExitMax;
    return this;
  }

  /**
   * Get feesExitMax
   * @return feesExitMax
  **/
  @ApiModelProperty(value = "")


  public Double getFeesExitMax() {
    return feesExitMax;
  }

  public void setFeesExitMax(Double feesExitMax) {
    this.feesExitMax = feesExitMax;
  }

  public RawSearchInstrumentResult feesInitialMax(Double feesInitialMax) {
    this.feesInitialMax = feesInitialMax;
    return this;
  }

  /**
   * Get feesInitialMax
   * @return feesInitialMax
  **/
  @ApiModelProperty(value = "")


  public Double getFeesInitialMax() {
    return feesInitialMax;
  }

  public void setFeesInitialMax(Double feesInitialMax) {
    this.feesInitialMax = feesInitialMax;
  }

  public RawSearchInstrumentResult feesOperatingCashFlow(Double feesOperatingCashFlow) {
    this.feesOperatingCashFlow = feesOperatingCashFlow;
    return this;
  }

  /**
   * Get feesOperatingCashFlow
   * @return feesOperatingCashFlow
  **/
  @ApiModelProperty(value = "")


  public Double getFeesOperatingCashFlow() {
    return feesOperatingCashFlow;
  }

  public void setFeesOperatingCashFlow(Double feesOperatingCashFlow) {
    this.feesOperatingCashFlow = feesOperatingCashFlow;
  }

  public RawSearchInstrumentResult feesPerformance(Double feesPerformance) {
    this.feesPerformance = feesPerformance;
    return this;
  }

  /**
   * Get feesPerformance
   * @return feesPerformance
  **/
  @ApiModelProperty(value = "")


  public Double getFeesPerformance() {
    return feesPerformance;
  }

  public void setFeesPerformance(Double feesPerformance) {
    this.feesPerformance = feesPerformance;
  }

  public RawSearchInstrumentResult fundAum(Double fundAum) {
    this.fundAum = fundAum;
    return this;
  }

  /**
   * Get fundAum
   * @return fundAum
  **/
  @ApiModelProperty(value = "")


  public Double getFundAum() {
    return fundAum;
  }

  public void setFundAum(Double fundAum) {
    this.fundAum = fundAum;
  }

  public RawSearchInstrumentResult fundCurrencyAumCode(String fundCurrencyAumCode) {
    this.fundCurrencyAumCode = fundCurrencyAumCode;
    return this;
  }

  /**
   * Get fundCurrencyAumCode
   * @return fundCurrencyAumCode
  **/
  @ApiModelProperty(value = "")


  public String getFundCurrencyAumCode() {
    return fundCurrencyAumCode;
  }

  public void setFundCurrencyAumCode(String fundCurrencyAumCode) {
    this.fundCurrencyAumCode = fundCurrencyAumCode;
  }

  public RawSearchInstrumentResult fundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
    return this;
  }

  /**
   * Get fundHouseGroupId
   * @return fundHouseGroupId
  **/
  @ApiModelProperty(value = "")


  public Long getFundHouseGroupId() {
    return fundHouseGroupId;
  }

  public void setFundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
  }

  public RawSearchInstrumentResult fundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
    return this;
  }

  /**
   * Get fundHouseId
   * @return fundHouseId
  **/
  @ApiModelProperty(value = "")


  public Long getFundHouseId() {
    return fundHouseId;
  }

  public void setFundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
  }

  public RawSearchInstrumentResult fundTypeCode(String fundTypeCode) {
    this.fundTypeCode = fundTypeCode;
    return this;
  }

  /**
   * Get fundTypeCode
   * @return fundTypeCode
  **/
  @ApiModelProperty(value = "")


  public String getFundTypeCode() {
    return fundTypeCode;
  }

  public void setFundTypeCode(String fundTypeCode) {
    this.fundTypeCode = fundTypeCode;
  }

  public RawSearchInstrumentResult id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RawSearchInstrumentResult inceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

  /**
   * Get inceptionDate
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public RawSearchInstrumentResult indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  /**
   * Get indexName
   * @return indexName
  **/
  @ApiModelProperty(value = "")


  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public RawSearchInstrumentResult informationProvider(String informationProvider) {
    this.informationProvider = informationProvider;
    return this;
  }

  /**
   * Get informationProvider
   * @return informationProvider
  **/
  @ApiModelProperty(value = "")


  public String getInformationProvider() {
    return informationProvider;
  }

  public void setInformationProvider(String informationProvider) {
    this.informationProvider = informationProvider;
  }

  public RawSearchInstrumentResult instrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Get instrumentType
   * @return instrumentType
  **/
  @ApiModelProperty(value = "")


  public String getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }

  public RawSearchInstrumentResult lastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

  /**
   * Get lastPrice
   * @return lastPrice
  **/
  @ApiModelProperty(value = "")


  public Double getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  public RawSearchInstrumentResult lastPriceDate(OffsetDateTime lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
    return this;
  }

  /**
   * Get lastPriceDate
   * @return lastPriceDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastPriceDate() {
    return lastPriceDate;
  }

  public void setLastPriceDate(OffsetDateTime lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
  }

  public RawSearchInstrumentResult mifid2ReportingDate(OffsetDateTime mifid2ReportingDate) {
    this.mifid2ReportingDate = mifid2ReportingDate;
    return this;
  }

  /**
   * Get mifid2ReportingDate
   * @return mifid2ReportingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getMifid2ReportingDate() {
    return mifid2ReportingDate;
  }

  public void setMifid2ReportingDate(OffsetDateTime mifid2ReportingDate) {
    this.mifid2ReportingDate = mifid2ReportingDate;
  }

  public RawSearchInstrumentResult minimunInvestmentInitial(Double minimunInvestmentInitial) {
    this.minimunInvestmentInitial = minimunInvestmentInitial;
    return this;
  }

  /**
   * Get minimunInvestmentInitial
   * @return minimunInvestmentInitial
  **/
  @ApiModelProperty(value = "")


  public Double getMinimunInvestmentInitial() {
    return minimunInvestmentInitial;
  }

  public void setMinimunInvestmentInitial(Double minimunInvestmentInitial) {
    this.minimunInvestmentInitial = minimunInvestmentInitial;
  }

  public RawSearchInstrumentResult minimunInvestmentSubsequent(Double minimunInvestmentSubsequent) {
    this.minimunInvestmentSubsequent = minimunInvestmentSubsequent;
    return this;
  }

  /**
   * Get minimunInvestmentSubsequent
   * @return minimunInvestmentSubsequent
  **/
  @ApiModelProperty(value = "")


  public Double getMinimunInvestmentSubsequent() {
    return minimunInvestmentSubsequent;
  }

  public void setMinimunInvestmentSubsequent(Double minimunInvestmentSubsequent) {
    this.minimunInvestmentSubsequent = minimunInvestmentSubsequent;
  }

  public RawSearchInstrumentResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RawSearchInstrumentResult ongoingChargeDate(OffsetDateTime ongoingChargeDate) {
    this.ongoingChargeDate = ongoingChargeDate;
    return this;
  }

  /**
   * Get ongoingChargeDate
   * @return ongoingChargeDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOngoingChargeDate() {
    return ongoingChargeDate;
  }

  public void setOngoingChargeDate(OffsetDateTime ongoingChargeDate) {
    this.ongoingChargeDate = ongoingChargeDate;
  }

  public RawSearchInstrumentResult performanceAnnualHistory1(Double performanceAnnualHistory1) {
    this.performanceAnnualHistory1 = performanceAnnualHistory1;
    return this;
  }

  /**
   * Get performanceAnnualHistory1
   * @return performanceAnnualHistory1
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceAnnualHistory1() {
    return performanceAnnualHistory1;
  }

  public void setPerformanceAnnualHistory1(Double performanceAnnualHistory1) {
    this.performanceAnnualHistory1 = performanceAnnualHistory1;
  }

  public RawSearchInstrumentResult performanceAnnualHistory2(Double performanceAnnualHistory2) {
    this.performanceAnnualHistory2 = performanceAnnualHistory2;
    return this;
  }

  /**
   * Get performanceAnnualHistory2
   * @return performanceAnnualHistory2
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceAnnualHistory2() {
    return performanceAnnualHistory2;
  }

  public void setPerformanceAnnualHistory2(Double performanceAnnualHistory2) {
    this.performanceAnnualHistory2 = performanceAnnualHistory2;
  }

  public RawSearchInstrumentResult performanceAnnualYtd(Double performanceAnnualYtd) {
    this.performanceAnnualYtd = performanceAnnualYtd;
    return this;
  }

  /**
   * Get performanceAnnualYtd
   * @return performanceAnnualYtd
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceAnnualYtd() {
    return performanceAnnualYtd;
  }

  public void setPerformanceAnnualYtd(Double performanceAnnualYtd) {
    this.performanceAnnualYtd = performanceAnnualYtd;
  }

  public RawSearchInstrumentResult performanceCumulativeDay(Double performanceCumulativeDay) {
    this.performanceCumulativeDay = performanceCumulativeDay;
    return this;
  }

  /**
   * Get performanceCumulativeDay
   * @return performanceCumulativeDay
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceCumulativeDay() {
    return performanceCumulativeDay;
  }

  public void setPerformanceCumulativeDay(Double performanceCumulativeDay) {
    this.performanceCumulativeDay = performanceCumulativeDay;
  }

  public RawSearchInstrumentResult performanceCumulativeFiveYears(Double performanceCumulativeFiveYears) {
    this.performanceCumulativeFiveYears = performanceCumulativeFiveYears;
    return this;
  }

  /**
   * Get performanceCumulativeFiveYears
   * @return performanceCumulativeFiveYears
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceCumulativeFiveYears() {
    return performanceCumulativeFiveYears;
  }

  public void setPerformanceCumulativeFiveYears(Double performanceCumulativeFiveYears) {
    this.performanceCumulativeFiveYears = performanceCumulativeFiveYears;
  }

  public RawSearchInstrumentResult performanceCumulativeOneYear(Double performanceCumulativeOneYear) {
    this.performanceCumulativeOneYear = performanceCumulativeOneYear;
    return this;
  }

  /**
   * Get performanceCumulativeOneYear
   * @return performanceCumulativeOneYear
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceCumulativeOneYear() {
    return performanceCumulativeOneYear;
  }

  public void setPerformanceCumulativeOneYear(Double performanceCumulativeOneYear) {
    this.performanceCumulativeOneYear = performanceCumulativeOneYear;
  }

  public RawSearchInstrumentResult performanceCumulativeSixMonths(Double performanceCumulativeSixMonths) {
    this.performanceCumulativeSixMonths = performanceCumulativeSixMonths;
    return this;
  }

  /**
   * Get performanceCumulativeSixMonths
   * @return performanceCumulativeSixMonths
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceCumulativeSixMonths() {
    return performanceCumulativeSixMonths;
  }

  public void setPerformanceCumulativeSixMonths(Double performanceCumulativeSixMonths) {
    this.performanceCumulativeSixMonths = performanceCumulativeSixMonths;
  }

  public RawSearchInstrumentResult performanceCumulativeThreeYears(Double performanceCumulativeThreeYears) {
    this.performanceCumulativeThreeYears = performanceCumulativeThreeYears;
    return this;
  }

  /**
   * Get performanceCumulativeThreeYears
   * @return performanceCumulativeThreeYears
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceCumulativeThreeYears() {
    return performanceCumulativeThreeYears;
  }

  public void setPerformanceCumulativeThreeYears(Double performanceCumulativeThreeYears) {
    this.performanceCumulativeThreeYears = performanceCumulativeThreeYears;
  }

  public RawSearchInstrumentResult performanceCumulativeWeek(Double performanceCumulativeWeek) {
    this.performanceCumulativeWeek = performanceCumulativeWeek;
    return this;
  }

  /**
   * Get performanceCumulativeWeek
   * @return performanceCumulativeWeek
  **/
  @ApiModelProperty(value = "")


  public Double getPerformanceCumulativeWeek() {
    return performanceCumulativeWeek;
  }

  public void setPerformanceCumulativeWeek(Double performanceCumulativeWeek) {
    this.performanceCumulativeWeek = performanceCumulativeWeek;
  }

  public RawSearchInstrumentResult priipsReportingDate(OffsetDateTime priipsReportingDate) {
    this.priipsReportingDate = priipsReportingDate;
    return this;
  }

  /**
   * Get priipsReportingDate
   * @return priipsReportingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPriipsReportingDate() {
    return priipsReportingDate;
  }

  public void setPriipsReportingDate(OffsetDateTime priipsReportingDate) {
    this.priipsReportingDate = priipsReportingDate;
  }

  public RawSearchInstrumentResult productStructure(String productStructure) {
    this.productStructure = productStructure;
    return this;
  }

  /**
   * Get productStructure
   * @return productStructure
  **/
  @ApiModelProperty(value = "")


  public String getProductStructure() {
    return productStructure;
  }

  public void setProductStructure(String productStructure) {
    this.productStructure = productStructure;
  }

  public RawSearchInstrumentResult rebalanceFrequency(String rebalanceFrequency) {
    this.rebalanceFrequency = rebalanceFrequency;
    return this;
  }

  /**
   * Get rebalanceFrequency
   * @return rebalanceFrequency
  **/
  @ApiModelProperty(value = "")


  public String getRebalanceFrequency() {
    return rebalanceFrequency;
  }

  public void setRebalanceFrequency(String rebalanceFrequency) {
    this.rebalanceFrequency = rebalanceFrequency;
  }

  public RawSearchInstrumentResult replicationMethod(String replicationMethod) {
    this.replicationMethod = replicationMethod;
    return this;
  }

  /**
   * Get replicationMethod
   * @return replicationMethod
  **/
  @ApiModelProperty(value = "")


  public String getReplicationMethod() {
    return replicationMethod;
  }

  public void setReplicationMethod(String replicationMethod) {
    this.replicationMethod = replicationMethod;
  }

  public RawSearchInstrumentResult riskLevel(Long riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

  /**
   * Get riskLevel
   * @return riskLevel
  **/
  @ApiModelProperty(value = "")


  public Long getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(Long riskLevel) {
    this.riskLevel = riskLevel;
  }

  public RawSearchInstrumentResult shareTypeCode(String shareTypeCode) {
    this.shareTypeCode = shareTypeCode;
    return this;
  }

  /**
   * Get shareTypeCode
   * @return shareTypeCode
  **/
  @ApiModelProperty(value = "")


  public String getShareTypeCode() {
    return shareTypeCode;
  }

  public void setShareTypeCode(String shareTypeCode) {
    this.shareTypeCode = shareTypeCode;
  }

  public RawSearchInstrumentResult statisticAbsoluteMaxDrawdown(Double statisticAbsoluteMaxDrawdown) {
    this.statisticAbsoluteMaxDrawdown = statisticAbsoluteMaxDrawdown;
    return this;
  }

  /**
   * Get statisticAbsoluteMaxDrawdown
   * @return statisticAbsoluteMaxDrawdown
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticAbsoluteMaxDrawdown() {
    return statisticAbsoluteMaxDrawdown;
  }

  public void setStatisticAbsoluteMaxDrawdown(Double statisticAbsoluteMaxDrawdown) {
    this.statisticAbsoluteMaxDrawdown = statisticAbsoluteMaxDrawdown;
  }

  public RawSearchInstrumentResult statisticAbsolutePerformance(Double statisticAbsolutePerformance) {
    this.statisticAbsolutePerformance = statisticAbsolutePerformance;
    return this;
  }

  /**
   * Get statisticAbsolutePerformance
   * @return statisticAbsolutePerformance
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticAbsolutePerformance() {
    return statisticAbsolutePerformance;
  }

  public void setStatisticAbsolutePerformance(Double statisticAbsolutePerformance) {
    this.statisticAbsolutePerformance = statisticAbsolutePerformance;
  }

  public RawSearchInstrumentResult statisticAbsoluteSharpeRatio(Double statisticAbsoluteSharpeRatio) {
    this.statisticAbsoluteSharpeRatio = statisticAbsoluteSharpeRatio;
    return this;
  }

  /**
   * Get statisticAbsoluteSharpeRatio
   * @return statisticAbsoluteSharpeRatio
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticAbsoluteSharpeRatio() {
    return statisticAbsoluteSharpeRatio;
  }

  public void setStatisticAbsoluteSharpeRatio(Double statisticAbsoluteSharpeRatio) {
    this.statisticAbsoluteSharpeRatio = statisticAbsoluteSharpeRatio;
  }

  public RawSearchInstrumentResult statisticAbsoluteVolatility(Double statisticAbsoluteVolatility) {
    this.statisticAbsoluteVolatility = statisticAbsoluteVolatility;
    return this;
  }

  /**
   * Get statisticAbsoluteVolatility
   * @return statisticAbsoluteVolatility
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticAbsoluteVolatility() {
    return statisticAbsoluteVolatility;
  }

  public void setStatisticAbsoluteVolatility(Double statisticAbsoluteVolatility) {
    this.statisticAbsoluteVolatility = statisticAbsoluteVolatility;
  }

  public RawSearchInstrumentResult statisticRelativeAlpha(Double statisticRelativeAlpha) {
    this.statisticRelativeAlpha = statisticRelativeAlpha;
    return this;
  }

  /**
   * Get statisticRelativeAlpha
   * @return statisticRelativeAlpha
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticRelativeAlpha() {
    return statisticRelativeAlpha;
  }

  public void setStatisticRelativeAlpha(Double statisticRelativeAlpha) {
    this.statisticRelativeAlpha = statisticRelativeAlpha;
  }

  public RawSearchInstrumentResult statisticRelativeBeta(Double statisticRelativeBeta) {
    this.statisticRelativeBeta = statisticRelativeBeta;
    return this;
  }

  /**
   * Get statisticRelativeBeta
   * @return statisticRelativeBeta
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticRelativeBeta() {
    return statisticRelativeBeta;
  }

  public void setStatisticRelativeBeta(Double statisticRelativeBeta) {
    this.statisticRelativeBeta = statisticRelativeBeta;
  }

  public RawSearchInstrumentResult statisticRelativeCorrelation(Double statisticRelativeCorrelation) {
    this.statisticRelativeCorrelation = statisticRelativeCorrelation;
    return this;
  }

  /**
   * Get statisticRelativeCorrelation
   * @return statisticRelativeCorrelation
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticRelativeCorrelation() {
    return statisticRelativeCorrelation;
  }

  public void setStatisticRelativeCorrelation(Double statisticRelativeCorrelation) {
    this.statisticRelativeCorrelation = statisticRelativeCorrelation;
  }

  public RawSearchInstrumentResult statisticRelativeInfoRatio(Double statisticRelativeInfoRatio) {
    this.statisticRelativeInfoRatio = statisticRelativeInfoRatio;
    return this;
  }

  /**
   * Get statisticRelativeInfoRatio
   * @return statisticRelativeInfoRatio
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticRelativeInfoRatio() {
    return statisticRelativeInfoRatio;
  }

  public void setStatisticRelativeInfoRatio(Double statisticRelativeInfoRatio) {
    this.statisticRelativeInfoRatio = statisticRelativeInfoRatio;
  }

  public RawSearchInstrumentResult statisticRelativeTrackingError(Double statisticRelativeTrackingError) {
    this.statisticRelativeTrackingError = statisticRelativeTrackingError;
    return this;
  }

  /**
   * Get statisticRelativeTrackingError
   * @return statisticRelativeTrackingError
  **/
  @ApiModelProperty(value = "")


  public Double getStatisticRelativeTrackingError() {
    return statisticRelativeTrackingError;
  }

  public void setStatisticRelativeTrackingError(Double statisticRelativeTrackingError) {
    this.statisticRelativeTrackingError = statisticRelativeTrackingError;
  }

  public RawSearchInstrumentResult subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Get subscriptionType
   * @return subscriptionType
  **/
  @ApiModelProperty(value = "")


  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public RawSearchInstrumentResult subscriptionTypeCurrency(String subscriptionTypeCurrency) {
    this.subscriptionTypeCurrency = subscriptionTypeCurrency;
    return this;
  }

  /**
   * Get subscriptionTypeCurrency
   * @return subscriptionTypeCurrency
  **/
  @ApiModelProperty(value = "")


  public String getSubscriptionTypeCurrency() {
    return subscriptionTypeCurrency;
  }

  public void setSubscriptionTypeCurrency(String subscriptionTypeCurrency) {
    this.subscriptionTypeCurrency = subscriptionTypeCurrency;
  }

  public RawSearchInstrumentResult transferable(Boolean transferable) {
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

  public RawSearchInstrumentResult whiteassimilated(Double whiteassimilated) {
    this.whiteassimilated = whiteassimilated;
    return this;
  }

  /**
   * Get whiteassimilated
   * @return whiteassimilated
  **/
  @ApiModelProperty(value = "")


  public Double getWhiteassimilated() {
    return whiteassimilated;
  }

  public void setWhiteassimilated(Double whiteassimilated) {
    this.whiteassimilated = whiteassimilated;
  }

  public RawSearchInstrumentResult whiteassimilatedAnt(Double whiteassimilatedAnt) {
    this.whiteassimilatedAnt = whiteassimilatedAnt;
    return this;
  }

  /**
   * Get whiteassimilatedAnt
   * @return whiteassimilatedAnt
  **/
  @ApiModelProperty(value = "")


  public Double getWhiteassimilatedAnt() {
    return whiteassimilatedAnt;
  }

  public void setWhiteassimilatedAnt(Double whiteassimilatedAnt) {
    this.whiteassimilatedAnt = whiteassimilatedAnt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawSearchInstrumentResult rawSearchInstrumentResult = (RawSearchInstrumentResult) o;
    return Objects.equals(this.baseCurrencyCode, rawSearchInstrumentResult.baseCurrencyCode) &&
        Objects.equals(this.classificationKeyValuesALLFUNDSCATEGORY, rawSearchInstrumentResult.classificationKeyValuesALLFUNDSCATEGORY) &&
        Objects.equals(this.cnmvInstrument, rawSearchInstrumentResult.cnmvInstrument) &&
        Objects.equals(this.collectiveInvestmentTransferableSecurities, rawSearchInstrumentResult.collectiveInvestmentTransferableSecurities) &&
        Objects.equals(this.currencyCode, rawSearchInstrumentResult.currencyCode) &&
        Objects.equals(this.dateAum, rawSearchInstrumentResult.dateAum) &&
        Objects.equals(this.datePortfolio, rawSearchInstrumentResult.datePortfolio) &&
        Objects.equals(this.dealingAvailable, rawSearchInstrumentResult.dealingAvailable) &&
        Objects.equals(this.distributionFrequency, rawSearchInstrumentResult.distributionFrequency) &&
        Objects.equals(this.domicilie, rawSearchInstrumentResult.domicilie) &&
        Objects.equals(this.externalCodeKeyValuesISIN, rawSearchInstrumentResult.externalCodeKeyValuesISIN) &&
        Objects.equals(this.feesAnnual, rawSearchInstrumentResult.feesAnnual) &&
        Objects.equals(this.feesDistribution, rawSearchInstrumentResult.feesDistribution) &&
        Objects.equals(this.feesExitMax, rawSearchInstrumentResult.feesExitMax) &&
        Objects.equals(this.feesInitialMax, rawSearchInstrumentResult.feesInitialMax) &&
        Objects.equals(this.feesOperatingCashFlow, rawSearchInstrumentResult.feesOperatingCashFlow) &&
        Objects.equals(this.feesPerformance, rawSearchInstrumentResult.feesPerformance) &&
        Objects.equals(this.fundAum, rawSearchInstrumentResult.fundAum) &&
        Objects.equals(this.fundCurrencyAumCode, rawSearchInstrumentResult.fundCurrencyAumCode) &&
        Objects.equals(this.fundHouseGroupId, rawSearchInstrumentResult.fundHouseGroupId) &&
        Objects.equals(this.fundHouseId, rawSearchInstrumentResult.fundHouseId) &&
        Objects.equals(this.fundTypeCode, rawSearchInstrumentResult.fundTypeCode) &&
        Objects.equals(this.id, rawSearchInstrumentResult.id) &&
        Objects.equals(this.inceptionDate, rawSearchInstrumentResult.inceptionDate) &&
        Objects.equals(this.indexName, rawSearchInstrumentResult.indexName) &&
        Objects.equals(this.informationProvider, rawSearchInstrumentResult.informationProvider) &&
        Objects.equals(this.instrumentType, rawSearchInstrumentResult.instrumentType) &&
        Objects.equals(this.lastPrice, rawSearchInstrumentResult.lastPrice) &&
        Objects.equals(this.lastPriceDate, rawSearchInstrumentResult.lastPriceDate) &&
        Objects.equals(this.mifid2ReportingDate, rawSearchInstrumentResult.mifid2ReportingDate) &&
        Objects.equals(this.minimunInvestmentInitial, rawSearchInstrumentResult.minimunInvestmentInitial) &&
        Objects.equals(this.minimunInvestmentSubsequent, rawSearchInstrumentResult.minimunInvestmentSubsequent) &&
        Objects.equals(this.name, rawSearchInstrumentResult.name) &&
        Objects.equals(this.ongoingChargeDate, rawSearchInstrumentResult.ongoingChargeDate) &&
        Objects.equals(this.performanceAnnualHistory1, rawSearchInstrumentResult.performanceAnnualHistory1) &&
        Objects.equals(this.performanceAnnualHistory2, rawSearchInstrumentResult.performanceAnnualHistory2) &&
        Objects.equals(this.performanceAnnualYtd, rawSearchInstrumentResult.performanceAnnualYtd) &&
        Objects.equals(this.performanceCumulativeDay, rawSearchInstrumentResult.performanceCumulativeDay) &&
        Objects.equals(this.performanceCumulativeFiveYears, rawSearchInstrumentResult.performanceCumulativeFiveYears) &&
        Objects.equals(this.performanceCumulativeOneYear, rawSearchInstrumentResult.performanceCumulativeOneYear) &&
        Objects.equals(this.performanceCumulativeSixMonths, rawSearchInstrumentResult.performanceCumulativeSixMonths) &&
        Objects.equals(this.performanceCumulativeThreeYears, rawSearchInstrumentResult.performanceCumulativeThreeYears) &&
        Objects.equals(this.performanceCumulativeWeek, rawSearchInstrumentResult.performanceCumulativeWeek) &&
        Objects.equals(this.priipsReportingDate, rawSearchInstrumentResult.priipsReportingDate) &&
        Objects.equals(this.productStructure, rawSearchInstrumentResult.productStructure) &&
        Objects.equals(this.rebalanceFrequency, rawSearchInstrumentResult.rebalanceFrequency) &&
        Objects.equals(this.replicationMethod, rawSearchInstrumentResult.replicationMethod) &&
        Objects.equals(this.riskLevel, rawSearchInstrumentResult.riskLevel) &&
        Objects.equals(this.shareTypeCode, rawSearchInstrumentResult.shareTypeCode) &&
        Objects.equals(this.statisticAbsoluteMaxDrawdown, rawSearchInstrumentResult.statisticAbsoluteMaxDrawdown) &&
        Objects.equals(this.statisticAbsolutePerformance, rawSearchInstrumentResult.statisticAbsolutePerformance) &&
        Objects.equals(this.statisticAbsoluteSharpeRatio, rawSearchInstrumentResult.statisticAbsoluteSharpeRatio) &&
        Objects.equals(this.statisticAbsoluteVolatility, rawSearchInstrumentResult.statisticAbsoluteVolatility) &&
        Objects.equals(this.statisticRelativeAlpha, rawSearchInstrumentResult.statisticRelativeAlpha) &&
        Objects.equals(this.statisticRelativeBeta, rawSearchInstrumentResult.statisticRelativeBeta) &&
        Objects.equals(this.statisticRelativeCorrelation, rawSearchInstrumentResult.statisticRelativeCorrelation) &&
        Objects.equals(this.statisticRelativeInfoRatio, rawSearchInstrumentResult.statisticRelativeInfoRatio) &&
        Objects.equals(this.statisticRelativeTrackingError, rawSearchInstrumentResult.statisticRelativeTrackingError) &&
        Objects.equals(this.subscriptionType, rawSearchInstrumentResult.subscriptionType) &&
        Objects.equals(this.subscriptionTypeCurrency, rawSearchInstrumentResult.subscriptionTypeCurrency) &&
        Objects.equals(this.transferable, rawSearchInstrumentResult.transferable) &&
        Objects.equals(this.whiteassimilated, rawSearchInstrumentResult.whiteassimilated) &&
        Objects.equals(this.whiteassimilatedAnt, rawSearchInstrumentResult.whiteassimilatedAnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrencyCode, classificationKeyValuesALLFUNDSCATEGORY, cnmvInstrument, collectiveInvestmentTransferableSecurities, currencyCode, dateAum, datePortfolio, dealingAvailable, distributionFrequency, domicilie, externalCodeKeyValuesISIN, feesAnnual, feesDistribution, feesExitMax, feesInitialMax, feesOperatingCashFlow, feesPerformance, fundAum, fundCurrencyAumCode, fundHouseGroupId, fundHouseId, fundTypeCode, id, inceptionDate, indexName, informationProvider, instrumentType, lastPrice, lastPriceDate, mifid2ReportingDate, minimunInvestmentInitial, minimunInvestmentSubsequent, name, ongoingChargeDate, performanceAnnualHistory1, performanceAnnualHistory2, performanceAnnualYtd, performanceCumulativeDay, performanceCumulativeFiveYears, performanceCumulativeOneYear, performanceCumulativeSixMonths, performanceCumulativeThreeYears, performanceCumulativeWeek, priipsReportingDate, productStructure, rebalanceFrequency, replicationMethod, riskLevel, shareTypeCode, statisticAbsoluteMaxDrawdown, statisticAbsolutePerformance, statisticAbsoluteSharpeRatio, statisticAbsoluteVolatility, statisticRelativeAlpha, statisticRelativeBeta, statisticRelativeCorrelation, statisticRelativeInfoRatio, statisticRelativeTrackingError, subscriptionType, subscriptionTypeCurrency, transferable, whiteassimilated, whiteassimilatedAnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawSearchInstrumentResult {\n");
    
    sb.append("    baseCurrencyCode: ").append(toIndentedString(baseCurrencyCode)).append("\n");
    sb.append("    classificationKeyValuesALLFUNDSCATEGORY: ").append(toIndentedString(classificationKeyValuesALLFUNDSCATEGORY)).append("\n");
    sb.append("    cnmvInstrument: ").append(toIndentedString(cnmvInstrument)).append("\n");
    sb.append("    collectiveInvestmentTransferableSecurities: ").append(toIndentedString(collectiveInvestmentTransferableSecurities)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dateAum: ").append(toIndentedString(dateAum)).append("\n");
    sb.append("    datePortfolio: ").append(toIndentedString(datePortfolio)).append("\n");
    sb.append("    dealingAvailable: ").append(toIndentedString(dealingAvailable)).append("\n");
    sb.append("    distributionFrequency: ").append(toIndentedString(distributionFrequency)).append("\n");
    sb.append("    domicilie: ").append(toIndentedString(domicilie)).append("\n");
    sb.append("    externalCodeKeyValuesISIN: ").append(toIndentedString(externalCodeKeyValuesISIN)).append("\n");
    sb.append("    feesAnnual: ").append(toIndentedString(feesAnnual)).append("\n");
    sb.append("    feesDistribution: ").append(toIndentedString(feesDistribution)).append("\n");
    sb.append("    feesExitMax: ").append(toIndentedString(feesExitMax)).append("\n");
    sb.append("    feesInitialMax: ").append(toIndentedString(feesInitialMax)).append("\n");
    sb.append("    feesOperatingCashFlow: ").append(toIndentedString(feesOperatingCashFlow)).append("\n");
    sb.append("    feesPerformance: ").append(toIndentedString(feesPerformance)).append("\n");
    sb.append("    fundAum: ").append(toIndentedString(fundAum)).append("\n");
    sb.append("    fundCurrencyAumCode: ").append(toIndentedString(fundCurrencyAumCode)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    fundTypeCode: ").append(toIndentedString(fundTypeCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    informationProvider: ").append(toIndentedString(informationProvider)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastPriceDate: ").append(toIndentedString(lastPriceDate)).append("\n");
    sb.append("    mifid2ReportingDate: ").append(toIndentedString(mifid2ReportingDate)).append("\n");
    sb.append("    minimunInvestmentInitial: ").append(toIndentedString(minimunInvestmentInitial)).append("\n");
    sb.append("    minimunInvestmentSubsequent: ").append(toIndentedString(minimunInvestmentSubsequent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ongoingChargeDate: ").append(toIndentedString(ongoingChargeDate)).append("\n");
    sb.append("    performanceAnnualHistory1: ").append(toIndentedString(performanceAnnualHistory1)).append("\n");
    sb.append("    performanceAnnualHistory2: ").append(toIndentedString(performanceAnnualHistory2)).append("\n");
    sb.append("    performanceAnnualYtd: ").append(toIndentedString(performanceAnnualYtd)).append("\n");
    sb.append("    performanceCumulativeDay: ").append(toIndentedString(performanceCumulativeDay)).append("\n");
    sb.append("    performanceCumulativeFiveYears: ").append(toIndentedString(performanceCumulativeFiveYears)).append("\n");
    sb.append("    performanceCumulativeOneYear: ").append(toIndentedString(performanceCumulativeOneYear)).append("\n");
    sb.append("    performanceCumulativeSixMonths: ").append(toIndentedString(performanceCumulativeSixMonths)).append("\n");
    sb.append("    performanceCumulativeThreeYears: ").append(toIndentedString(performanceCumulativeThreeYears)).append("\n");
    sb.append("    performanceCumulativeWeek: ").append(toIndentedString(performanceCumulativeWeek)).append("\n");
    sb.append("    priipsReportingDate: ").append(toIndentedString(priipsReportingDate)).append("\n");
    sb.append("    productStructure: ").append(toIndentedString(productStructure)).append("\n");
    sb.append("    rebalanceFrequency: ").append(toIndentedString(rebalanceFrequency)).append("\n");
    sb.append("    replicationMethod: ").append(toIndentedString(replicationMethod)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    shareTypeCode: ").append(toIndentedString(shareTypeCode)).append("\n");
    sb.append("    statisticAbsoluteMaxDrawdown: ").append(toIndentedString(statisticAbsoluteMaxDrawdown)).append("\n");
    sb.append("    statisticAbsolutePerformance: ").append(toIndentedString(statisticAbsolutePerformance)).append("\n");
    sb.append("    statisticAbsoluteSharpeRatio: ").append(toIndentedString(statisticAbsoluteSharpeRatio)).append("\n");
    sb.append("    statisticAbsoluteVolatility: ").append(toIndentedString(statisticAbsoluteVolatility)).append("\n");
    sb.append("    statisticRelativeAlpha: ").append(toIndentedString(statisticRelativeAlpha)).append("\n");
    sb.append("    statisticRelativeBeta: ").append(toIndentedString(statisticRelativeBeta)).append("\n");
    sb.append("    statisticRelativeCorrelation: ").append(toIndentedString(statisticRelativeCorrelation)).append("\n");
    sb.append("    statisticRelativeInfoRatio: ").append(toIndentedString(statisticRelativeInfoRatio)).append("\n");
    sb.append("    statisticRelativeTrackingError: ").append(toIndentedString(statisticRelativeTrackingError)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    subscriptionTypeCurrency: ").append(toIndentedString(subscriptionTypeCurrency)).append("\n");
    sb.append("    transferable: ").append(toIndentedString(transferable)).append("\n");
    sb.append("    whiteassimilated: ").append(toIndentedString(whiteassimilated)).append("\n");
    sb.append("    whiteassimilatedAnt: ").append(toIndentedString(whiteassimilatedAnt)).append("\n");
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

