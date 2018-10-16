package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FundStructure;
import org.openapitools.model.KeyValue;
import org.openapitools.model.Price;
import org.openapitools.model.RiskLevel;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An investment fund is a supply of capital belonging to numerous investors that is used to collectively purchase securities while each investor retains ownership and control of his or her own shares.
 */
@ApiModel(description = "An investment fund is a supply of capital belonging to numerous investors that is used to collectively purchase securities while each investor retains ownership and control of his or her own shares.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Fund   {
  @JsonProperty("breakdownDate")
  private OffsetDateTime breakdownDate = null;

  @JsonProperty("classType")
  private String classType = null;

  @JsonProperty("classificationKeyValues")
  @Valid
  private List<KeyValue> classificationKeyValues = null;

  @JsonProperty("collectiveInvestmentTransferableSecurities")
  private String collectiveInvestmentTransferableSecurities = null;

  @JsonProperty("comparasionBenchmarkId")
  private String comparasionBenchmarkId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingAvailable")
  private Boolean dealingAvailable = null;

  @JsonProperty("domicilieCountryCode")
  private String domicilieCountryCode = null;

  @JsonProperty("europeanFundClassificationCode")
  private String europeanFundClassificationCode = null;

  @JsonProperty("externalCodeKeyValues")
  @Valid
  private List<KeyValue> externalCodeKeyValues = null;

  @JsonProperty("firstPrices")
  @Valid
  private List<Price> firstPrices = null;

  @JsonProperty("fundGroupId")
  private Long fundGroupId = null;

  @JsonProperty("fundHouseBenchmarkDescription")
  private String fundHouseBenchmarkDescription = null;

  @JsonProperty("fundTypeCode")
  private String fundTypeCode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("inceptionDate")
  private OffsetDateTime inceptionDate = null;

  /**
   * this is a data fund provider. 
   */
  public enum InformationProviderEnum {
    ALLFUNDS("ALLFUNDS"),
    
    MORNINGSTAR("MORNINGSTAR");

    private String value;

    InformationProviderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InformationProviderEnum fromValue(String text) {
      for (InformationProviderEnum b : InformationProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("informationProvider")
  private InformationProviderEnum informationProvider = null;

  @JsonProperty("investmentObjective")
  private String investmentObjective = null;

  @JsonProperty("lastDividendDate")
  private OffsetDateTime lastDividendDate = null;

  @JsonProperty("lastPrices")
  @Valid
  private List<Price> lastPrices = null;

  @JsonProperty("marketId")
  private Long marketId = null;

  @JsonProperty("marketRegistrationKeyValues")
  @Valid
  private List<KeyValue> marketRegistrationKeyValues = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentClass")
  private Boolean parentClass = null;

  /**
   * Gross or Net dividend in UK
   */
  public enum RetentionTypeEnum {
    GROSS("GROSS"),
    
    NET("NET");

    private String value;

    RetentionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RetentionTypeEnum fromValue(String text) {
      for (RetentionTypeEnum b : RetentionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("retentionType")
  private RetentionTypeEnum retentionType = null;

  @JsonProperty("riskLevel")
  private RiskLevel riskLevel = null;

  @JsonProperty("shariaCompliant")
  private Boolean shariaCompliant = null;

  @JsonProperty("structure")
  private FundStructure structure = null;

  /**
   * show this fund is Acumulation (S) or Income(N)
   */
  public enum TypeShareEnum {
    ACUMULATION("ACUMULATION"),
    
    INCOME("INCOME");

    private String value;

    TypeShareEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeShareEnum fromValue(String text) {
      for (TypeShareEnum b : TypeShareEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("typeShare")
  private TypeShareEnum typeShare = null;

  /**
   * valuation frequency
   */
  public enum ValuationFrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    FORTNIGHTLY("FORTNIGHTLY"),
    
    MONTHLY("MONTHLY"),
    
    BIMONTHLY("BIMONTHLY"),
    
    QUARTERLY("QUARTERLY");

    private String value;

    ValuationFrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValuationFrequencyEnum fromValue(String text) {
      for (ValuationFrequencyEnum b : ValuationFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("valuationFrequency")
  private ValuationFrequencyEnum valuationFrequency = null;

  public Fund breakdownDate(OffsetDateTime breakdownDate) {
    this.breakdownDate = breakdownDate;
    return this;
  }

  /**
   * Breakdown Date
   * @return breakdownDate
  **/
  @ApiModelProperty(value = "Breakdown Date")

  @Valid

  public OffsetDateTime getBreakdownDate() {
    return breakdownDate;
  }

  public void setBreakdownDate(OffsetDateTime breakdownDate) {
    this.breakdownDate = breakdownDate;
  }

  public Fund classType(String classType) {
    this.classType = classType;
    return this;
  }

  /**
   * An indication on what has been incorporated into the management fee for that share class. The field distinguishes between classes that load their management.
   * @return classType
  **/
  @ApiModelProperty(value = "An indication on what has been incorporated into the management fee for that share class. The field distinguishes between classes that load their management.")


  public String getClassType() {
    return classType;
  }

  public void setClassType(String classType) {
    this.classType = classType;
  }

  public Fund classificationKeyValues(List<KeyValue> classificationKeyValues) {
    this.classificationKeyValues = classificationKeyValues;
    return this;
  }

  public Fund addClassificationKeyValuesItem(KeyValue classificationKeyValuesItem) {
    if (this.classificationKeyValues == null) {
      this.classificationKeyValues = new ArrayList<>();
    }
    this.classificationKeyValues.add(classificationKeyValuesItem);
    return this;
  }

  /**
   * This attribute contains a list of the fund's classifications. Each {KeyValue.key} contains a code whose description can be found in the {listFundClassifications} Catalog. Each {KeyValue.value} contains the value of the specific `code` for this {Fund}. 
   * @return classificationKeyValues
  **/
  @ApiModelProperty(value = "This attribute contains a list of the fund's classifications. Each {KeyValue.key} contains a code whose description can be found in the {listFundClassifications} Catalog. Each {KeyValue.value} contains the value of the specific `code` for this {Fund}. ")

  @Valid

  public List<KeyValue> getClassificationKeyValues() {
    return classificationKeyValues;
  }

  public void setClassificationKeyValues(List<KeyValue> classificationKeyValues) {
    this.classificationKeyValues = classificationKeyValues;
  }

  public Fund collectiveInvestmentTransferableSecurities(String collectiveInvestmentTransferableSecurities) {
    this.collectiveInvestmentTransferableSecurities = collectiveInvestmentTransferableSecurities;
    return this;
  }

  /**
   * UCITS Normative : A public limited company that coordinates the distribution and management of unit trusts amongst countries within the European Union
   * @return collectiveInvestmentTransferableSecurities
  **/
  @ApiModelProperty(value = "UCITS Normative : A public limited company that coordinates the distribution and management of unit trusts amongst countries within the European Union")


  public String getCollectiveInvestmentTransferableSecurities() {
    return collectiveInvestmentTransferableSecurities;
  }

  public void setCollectiveInvestmentTransferableSecurities(String collectiveInvestmentTransferableSecurities) {
    this.collectiveInvestmentTransferableSecurities = collectiveInvestmentTransferableSecurities;
  }

  public Fund comparasionBenchmarkId(String comparasionBenchmarkId) {
    this.comparasionBenchmarkId = comparasionBenchmarkId;
    return this;
  }

  /**
   * The Id of the {Benchmark}
   * @return comparasionBenchmarkId
  **/
  @ApiModelProperty(value = "The Id of the {Benchmark}")


  public String getComparasionBenchmarkId() {
    return comparasionBenchmarkId;
  }

  public void setComparasionBenchmarkId(String comparasionBenchmarkId) {
    this.comparasionBenchmarkId = comparasionBenchmarkId;
  }

  public Fund currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The Fund's currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The Fund's currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Fund dealingAvailable(Boolean dealingAvailable) {
    this.dealingAvailable = dealingAvailable;
    return this;
  }

  /**
   * this fund is dealing
   * @return dealingAvailable
  **/
  @ApiModelProperty(value = "this fund is dealing")


  public Boolean getDealingAvailable() {
    return dealingAvailable;
  }

  public void setDealingAvailable(Boolean dealingAvailable) {
    this.dealingAvailable = dealingAvailable;
  }

  public Fund domicilieCountryCode(String domicilieCountryCode) {
    this.domicilieCountryCode = domicilieCountryCode;
    return this;
  }

  /**
   * The country code where the Fund is domiciliated. Refer to {listCountries}
   * @return domicilieCountryCode
  **/
  @ApiModelProperty(value = "The country code where the Fund is domiciliated. Refer to {listCountries}")


  public String getDomicilieCountryCode() {
    return domicilieCountryCode;
  }

  public void setDomicilieCountryCode(String domicilieCountryCode) {
    this.domicilieCountryCode = domicilieCountryCode;
  }

  public Fund europeanFundClassificationCode(String europeanFundClassificationCode) {
    this.europeanFundClassificationCode = europeanFundClassificationCode;
    return this;
  }

  /**
   * Refers to {listEuropeanFundClassifications}
   * @return europeanFundClassificationCode
  **/
  @ApiModelProperty(value = "Refers to {listEuropeanFundClassifications}")


  public String getEuropeanFundClassificationCode() {
    return europeanFundClassificationCode;
  }

  public void setEuropeanFundClassificationCode(String europeanFundClassificationCode) {
    this.europeanFundClassificationCode = europeanFundClassificationCode;
  }

  public Fund externalCodeKeyValues(List<KeyValue> externalCodeKeyValues) {
    this.externalCodeKeyValues = externalCodeKeyValues;
    return this;
  }

  public Fund addExternalCodeKeyValuesItem(KeyValue externalCodeKeyValuesItem) {
    if (this.externalCodeKeyValues == null) {
      this.externalCodeKeyValues = new ArrayList<>();
    }
    this.externalCodeKeyValues.add(externalCodeKeyValuesItem);
    return this;
  }

  /**
   * This attribute contains the list of the fund's official identifications. Each {KeyValue.key} contains a code whose description can be found in the {listInstrumentExternalCodes} Catalog. Each {KeyValue.value} contains the value of the specific `code` for this {Fund}. 
   * @return externalCodeKeyValues
  **/
  @ApiModelProperty(value = "This attribute contains the list of the fund's official identifications. Each {KeyValue.key} contains a code whose description can be found in the {listInstrumentExternalCodes} Catalog. Each {KeyValue.value} contains the value of the specific `code` for this {Fund}. ")

  @Valid

  public List<KeyValue> getExternalCodeKeyValues() {
    return externalCodeKeyValues;
  }

  public void setExternalCodeKeyValues(List<KeyValue> externalCodeKeyValues) {
    this.externalCodeKeyValues = externalCodeKeyValues;
  }

  public Fund firstPrices(List<Price> firstPrices) {
    this.firstPrices = firstPrices;
    return this;
  }

  public Fund addFirstPricesItem(Price firstPricesItem) {
    if (this.firstPrices == null) {
      this.firstPrices = new ArrayList<>();
    }
    this.firstPrices.add(firstPricesItem);
    return this;
  }

  /**
   * Get firstPrices
   * @return firstPrices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getFirstPrices() {
    return firstPrices;
  }

  public void setFirstPrices(List<Price> firstPrices) {
    this.firstPrices = firstPrices;
  }

  public Fund fundGroupId(Long fundGroupId) {
    this.fundGroupId = fundGroupId;
    return this;
  }

  /**
   * The Id of the {FundGroup}
   * @return fundGroupId
  **/
  @ApiModelProperty(value = "The Id of the {FundGroup}")


  public Long getFundGroupId() {
    return fundGroupId;
  }

  public void setFundGroupId(Long fundGroupId) {
    this.fundGroupId = fundGroupId;
  }

  public Fund fundHouseBenchmarkDescription(String fundHouseBenchmarkDescription) {
    this.fundHouseBenchmarkDescription = fundHouseBenchmarkDescription;
    return this;
  }

  /**
   * Benchmark of the fund according to the Fund House.
   * @return fundHouseBenchmarkDescription
  **/
  @ApiModelProperty(value = "Benchmark of the fund according to the Fund House.")


  public String getFundHouseBenchmarkDescription() {
    return fundHouseBenchmarkDescription;
  }

  public void setFundHouseBenchmarkDescription(String fundHouseBenchmarkDescription) {
    this.fundHouseBenchmarkDescription = fundHouseBenchmarkDescription;
  }

  public Fund fundTypeCode(String fundTypeCode) {
    this.fundTypeCode = fundTypeCode;
    return this;
  }

  /**
   * The Fund's type. Refer to {listFundTypes}
   * @return fundTypeCode
  **/
  @ApiModelProperty(value = "The Fund's type. Refer to {listFundTypes}")


  public String getFundTypeCode() {
    return fundTypeCode;
  }

  public void setFundTypeCode(String fundTypeCode) {
    this.fundTypeCode = fundTypeCode;
  }

  public Fund id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Internal identification in Allfunds Bank. This id is the unique key.
   * @return id
  **/
  @ApiModelProperty(value = "Internal identification in Allfunds Bank. This id is the unique key.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Fund inceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

  /**
   * The date on which an investment product began its operations.
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "The date on which an investment product began its operations.")

  @Valid

  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public Fund informationProvider(InformationProviderEnum informationProvider) {
    this.informationProvider = informationProvider;
    return this;
  }

  /**
   * this is a data fund provider. 
   * @return informationProvider
  **/
  @ApiModelProperty(value = "this is a data fund provider. ")


  public InformationProviderEnum getInformationProvider() {
    return informationProvider;
  }

  public void setInformationProvider(InformationProviderEnum informationProvider) {
    this.informationProvider = informationProvider;
  }

  public Fund investmentObjective(String investmentObjective) {
    this.investmentObjective = investmentObjective;
    return this;
  }

  /**
   * A client information form used by registered investment advisors and other asset managers that aids in determining the optimal portfolio mix for the client. An investment objective survey may come in the form of a questionnaire, where the investor will be asked things such as:  * Current liquid and net worth  * Risk aversion  * Investing time horizon  * Income levels  * Expense levels  * Planned bequeathments and/or charitable contributions  * Restrictions on security selection' 
   * @return investmentObjective
  **/
  @ApiModelProperty(value = "A client information form used by registered investment advisors and other asset managers that aids in determining the optimal portfolio mix for the client. An investment objective survey may come in the form of a questionnaire, where the investor will be asked things such as:  * Current liquid and net worth  * Risk aversion  * Investing time horizon  * Income levels  * Expense levels  * Planned bequeathments and/or charitable contributions  * Restrictions on security selection' ")


  public String getInvestmentObjective() {
    return investmentObjective;
  }

  public void setInvestmentObjective(String investmentObjective) {
    this.investmentObjective = investmentObjective;
  }

  public Fund lastDividendDate(OffsetDateTime lastDividendDate) {
    this.lastDividendDate = lastDividendDate;
    return this;
  }

  /**
   * last dividend date
   * @return lastDividendDate
  **/
  @ApiModelProperty(value = "last dividend date")

  @Valid

  public OffsetDateTime getLastDividendDate() {
    return lastDividendDate;
  }

  public void setLastDividendDate(OffsetDateTime lastDividendDate) {
    this.lastDividendDate = lastDividendDate;
  }

  public Fund lastPrices(List<Price> lastPrices) {
    this.lastPrices = lastPrices;
    return this;
  }

  public Fund addLastPricesItem(Price lastPricesItem) {
    if (this.lastPrices == null) {
      this.lastPrices = new ArrayList<>();
    }
    this.lastPrices.add(lastPricesItem);
    return this;
  }

  /**
   * Get lastPrices
   * @return lastPrices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getLastPrices() {
    return lastPrices;
  }

  public void setLastPrices(List<Price> lastPrices) {
    this.lastPrices = lastPrices;
  }

  public Fund marketId(Long marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * The Id of the {Market}
   * @return marketId
  **/
  @ApiModelProperty(value = "The Id of the {Market}")


  public Long getMarketId() {
    return marketId;
  }

  public void setMarketId(Long marketId) {
    this.marketId = marketId;
  }

  public Fund marketRegistrationKeyValues(List<KeyValue> marketRegistrationKeyValues) {
    this.marketRegistrationKeyValues = marketRegistrationKeyValues;
    return this;
  }

  public Fund addMarketRegistrationKeyValuesItem(KeyValue marketRegistrationKeyValuesItem) {
    if (this.marketRegistrationKeyValues == null) {
      this.marketRegistrationKeyValues = new ArrayList<>();
    }
    this.marketRegistrationKeyValues.add(marketRegistrationKeyValuesItem);
    return this;
  }

  /**
   * This attribute contains a list of the fund's market registration. Each {KeyValue.key} contains a code whose description can be found in the {listMarketRegistrations} Catalog. Each {KeyValue.value} contains the value of the specific `code` for this {Fund}. 
   * @return marketRegistrationKeyValues
  **/
  @ApiModelProperty(value = "This attribute contains a list of the fund's market registration. Each {KeyValue.key} contains a code whose description can be found in the {listMarketRegistrations} Catalog. Each {KeyValue.value} contains the value of the specific `code` for this {Fund}. ")

  @Valid

  public List<KeyValue> getMarketRegistrationKeyValues() {
    return marketRegistrationKeyValues;
  }

  public void setMarketRegistrationKeyValues(List<KeyValue> marketRegistrationKeyValues) {
    this.marketRegistrationKeyValues = marketRegistrationKeyValues;
  }

  public Fund name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the fund. This name would be common to all share classes of the portfolio.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the fund. This name would be common to all share classes of the portfolio.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Fund parentClass(Boolean parentClass) {
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

  public Fund retentionType(RetentionTypeEnum retentionType) {
    this.retentionType = retentionType;
    return this;
  }

  /**
   * Gross or Net dividend in UK
   * @return retentionType
  **/
  @ApiModelProperty(value = "Gross or Net dividend in UK")


  public RetentionTypeEnum getRetentionType() {
    return retentionType;
  }

  public void setRetentionType(RetentionTypeEnum retentionType) {
    this.retentionType = retentionType;
  }

  public Fund riskLevel(RiskLevel riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

  /**
   * Get riskLevel
   * @return riskLevel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RiskLevel getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(RiskLevel riskLevel) {
    this.riskLevel = riskLevel;
  }

  public Fund shariaCompliant(Boolean shariaCompliant) {
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

  public Fund structure(FundStructure structure) {
    this.structure = structure;
    return this;
  }

  /**
   * Get structure
   * @return structure
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundStructure getStructure() {
    return structure;
  }

  public void setStructure(FundStructure structure) {
    this.structure = structure;
  }

  public Fund typeShare(TypeShareEnum typeShare) {
    this.typeShare = typeShare;
    return this;
  }

  /**
   * show this fund is Acumulation (S) or Income(N)
   * @return typeShare
  **/
  @ApiModelProperty(value = "show this fund is Acumulation (S) or Income(N)")


  public TypeShareEnum getTypeShare() {
    return typeShare;
  }

  public void setTypeShare(TypeShareEnum typeShare) {
    this.typeShare = typeShare;
  }

  public Fund valuationFrequency(ValuationFrequencyEnum valuationFrequency) {
    this.valuationFrequency = valuationFrequency;
    return this;
  }

  /**
   * valuation frequency
   * @return valuationFrequency
  **/
  @ApiModelProperty(value = "valuation frequency")


  public ValuationFrequencyEnum getValuationFrequency() {
    return valuationFrequency;
  }

  public void setValuationFrequency(ValuationFrequencyEnum valuationFrequency) {
    this.valuationFrequency = valuationFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fund fund = (Fund) o;
    return Objects.equals(this.breakdownDate, fund.breakdownDate) &&
        Objects.equals(this.classType, fund.classType) &&
        Objects.equals(this.classificationKeyValues, fund.classificationKeyValues) &&
        Objects.equals(this.collectiveInvestmentTransferableSecurities, fund.collectiveInvestmentTransferableSecurities) &&
        Objects.equals(this.comparasionBenchmarkId, fund.comparasionBenchmarkId) &&
        Objects.equals(this.currencyCode, fund.currencyCode) &&
        Objects.equals(this.dealingAvailable, fund.dealingAvailable) &&
        Objects.equals(this.domicilieCountryCode, fund.domicilieCountryCode) &&
        Objects.equals(this.europeanFundClassificationCode, fund.europeanFundClassificationCode) &&
        Objects.equals(this.externalCodeKeyValues, fund.externalCodeKeyValues) &&
        Objects.equals(this.firstPrices, fund.firstPrices) &&
        Objects.equals(this.fundGroupId, fund.fundGroupId) &&
        Objects.equals(this.fundHouseBenchmarkDescription, fund.fundHouseBenchmarkDescription) &&
        Objects.equals(this.fundTypeCode, fund.fundTypeCode) &&
        Objects.equals(this.id, fund.id) &&
        Objects.equals(this.inceptionDate, fund.inceptionDate) &&
        Objects.equals(this.informationProvider, fund.informationProvider) &&
        Objects.equals(this.investmentObjective, fund.investmentObjective) &&
        Objects.equals(this.lastDividendDate, fund.lastDividendDate) &&
        Objects.equals(this.lastPrices, fund.lastPrices) &&
        Objects.equals(this.marketId, fund.marketId) &&
        Objects.equals(this.marketRegistrationKeyValues, fund.marketRegistrationKeyValues) &&
        Objects.equals(this.name, fund.name) &&
        Objects.equals(this.parentClass, fund.parentClass) &&
        Objects.equals(this.retentionType, fund.retentionType) &&
        Objects.equals(this.riskLevel, fund.riskLevel) &&
        Objects.equals(this.shariaCompliant, fund.shariaCompliant) &&
        Objects.equals(this.structure, fund.structure) &&
        Objects.equals(this.typeShare, fund.typeShare) &&
        Objects.equals(this.valuationFrequency, fund.valuationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdownDate, classType, classificationKeyValues, collectiveInvestmentTransferableSecurities, comparasionBenchmarkId, currencyCode, dealingAvailable, domicilieCountryCode, europeanFundClassificationCode, externalCodeKeyValues, firstPrices, fundGroupId, fundHouseBenchmarkDescription, fundTypeCode, id, inceptionDate, informationProvider, investmentObjective, lastDividendDate, lastPrices, marketId, marketRegistrationKeyValues, name, parentClass, retentionType, riskLevel, shariaCompliant, structure, typeShare, valuationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fund {\n");
    
    sb.append("    breakdownDate: ").append(toIndentedString(breakdownDate)).append("\n");
    sb.append("    classType: ").append(toIndentedString(classType)).append("\n");
    sb.append("    classificationKeyValues: ").append(toIndentedString(classificationKeyValues)).append("\n");
    sb.append("    collectiveInvestmentTransferableSecurities: ").append(toIndentedString(collectiveInvestmentTransferableSecurities)).append("\n");
    sb.append("    comparasionBenchmarkId: ").append(toIndentedString(comparasionBenchmarkId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingAvailable: ").append(toIndentedString(dealingAvailable)).append("\n");
    sb.append("    domicilieCountryCode: ").append(toIndentedString(domicilieCountryCode)).append("\n");
    sb.append("    europeanFundClassificationCode: ").append(toIndentedString(europeanFundClassificationCode)).append("\n");
    sb.append("    externalCodeKeyValues: ").append(toIndentedString(externalCodeKeyValues)).append("\n");
    sb.append("    firstPrices: ").append(toIndentedString(firstPrices)).append("\n");
    sb.append("    fundGroupId: ").append(toIndentedString(fundGroupId)).append("\n");
    sb.append("    fundHouseBenchmarkDescription: ").append(toIndentedString(fundHouseBenchmarkDescription)).append("\n");
    sb.append("    fundTypeCode: ").append(toIndentedString(fundTypeCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    informationProvider: ").append(toIndentedString(informationProvider)).append("\n");
    sb.append("    investmentObjective: ").append(toIndentedString(investmentObjective)).append("\n");
    sb.append("    lastDividendDate: ").append(toIndentedString(lastDividendDate)).append("\n");
    sb.append("    lastPrices: ").append(toIndentedString(lastPrices)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    marketRegistrationKeyValues: ").append(toIndentedString(marketRegistrationKeyValues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentClass: ").append(toIndentedString(parentClass)).append("\n");
    sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    shariaCompliant: ").append(toIndentedString(shariaCompliant)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
    sb.append("    typeShare: ").append(toIndentedString(typeShare)).append("\n");
    sb.append("    valuationFrequency: ").append(toIndentedString(valuationFrequency)).append("\n");
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

