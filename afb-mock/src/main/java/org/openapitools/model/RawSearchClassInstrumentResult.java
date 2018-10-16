package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ClassInstrument;
import org.openapitools.model.FeeData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RawSearchClassInstrumentResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RawSearchClassInstrumentResult   {
  @JsonProperty("classInstrument")
  private ClassInstrument classInstrument = null;

  /**
   * Indicates whether to search for a {NOT_CLASSIFICABLE} or an {CLASSIFICABLE} or an {NOT_INFORMED} instrument.
   */
  public enum ClassStatusEnum {
    NOT_CLASSIFICABLE("NOT_CLASSIFICABLE"),
    
    CLASSIFICABLE("CLASSIFICABLE"),
    
    NOT_INFORMED("NOT_INFORMED");

    private String value;

    ClassStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClassStatusEnum fromValue(String text) {
      for (ClassStatusEnum b : ClassStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("classStatus")
  private ClassStatusEnum classStatus = null;

  @JsonProperty("classificationKeyValuesALLFUNDSCATEGORY")
  private String classificationKeyValuesALLFUNDSCATEGORY = null;

  @JsonProperty("cnmvInstrument")
  private Double cnmvInstrument = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("externalCodeKeyValuesISIN")
  private String externalCodeKeyValuesISIN = null;

  @JsonProperty("feeData")
  private FeeData feeData = null;

  @JsonProperty("fundGroupName")
  private String fundGroupName = null;

  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("fundHouseId")
  private Long fundHouseId = null;

  @JsonProperty("hedge")
  private Boolean hedge = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("informationProvider")
  private String informationProvider = null;

  @JsonProperty("instrumentType")
  private String instrumentType = null;

  @JsonProperty("minimunInvestmentInitial")
  private Double minimunInvestmentInitial = null;

  @JsonProperty("minimunInvestmentSubsequent")
  private Double minimunInvestmentSubsequent = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("operatingCashFlow")
  private Double operatingCashFlow = null;

  /**
   * It's a complex product if is {YES} if it's {NO} is not complex, and value {NOT_APPLICABLE}
   */
  public enum ProductComplexityEnum {
    COMPLEX("COMPLEX"),
    
    NOT_COMPLEX("NOT_COMPLEX"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    ProductComplexityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductComplexityEnum fromValue(String text) {
      for (ProductComplexityEnum b : ProductComplexityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("productComplexity")
  private ProductComplexityEnum productComplexity = null;

  @JsonProperty("riskLevel")
  private Long riskLevel = null;

  @JsonProperty("shareTypeCode")
  private String shareTypeCode = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  @JsonProperty("subscriptionTypeCurrency")
  private String subscriptionTypeCurrency = null;

  @JsonProperty("transferable")
  private Boolean transferable = null;

  public RawSearchClassInstrumentResult classInstrument(ClassInstrument classInstrument) {
    this.classInstrument = classInstrument;
    return this;
  }

  /**
   * Get classInstrument
   * @return classInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClassInstrument getClassInstrument() {
    return classInstrument;
  }

  public void setClassInstrument(ClassInstrument classInstrument) {
    this.classInstrument = classInstrument;
  }

  public RawSearchClassInstrumentResult classStatus(ClassStatusEnum classStatus) {
    this.classStatus = classStatus;
    return this;
  }

  /**
   * Indicates whether to search for a {NOT_CLASSIFICABLE} or an {CLASSIFICABLE} or an {NOT_INFORMED} instrument.
   * @return classStatus
  **/
  @ApiModelProperty(value = "Indicates whether to search for a {NOT_CLASSIFICABLE} or an {CLASSIFICABLE} or an {NOT_INFORMED} instrument.")


  public ClassStatusEnum getClassStatus() {
    return classStatus;
  }

  public void setClassStatus(ClassStatusEnum classStatus) {
    this.classStatus = classStatus;
  }

  public RawSearchClassInstrumentResult classificationKeyValuesALLFUNDSCATEGORY(String classificationKeyValuesALLFUNDSCATEGORY) {
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

  public RawSearchClassInstrumentResult cnmvInstrument(Double cnmvInstrument) {
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

  public RawSearchClassInstrumentResult currencyCode(String currencyCode) {
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

  public RawSearchClassInstrumentResult externalCodeKeyValuesISIN(String externalCodeKeyValuesISIN) {
    this.externalCodeKeyValuesISIN = externalCodeKeyValuesISIN;
    return this;
  }

  /**
   * International Securities Identification Number as per ISO 6166.   [A-Z]{2}([A-Z]|[0-9]){9}[0-9]
   * @return externalCodeKeyValuesISIN
  **/
  @ApiModelProperty(value = "International Securities Identification Number as per ISO 6166.   [A-Z]{2}([A-Z]|[0-9]){9}[0-9]")


  public String getExternalCodeKeyValuesISIN() {
    return externalCodeKeyValuesISIN;
  }

  public void setExternalCodeKeyValuesISIN(String externalCodeKeyValuesISIN) {
    this.externalCodeKeyValuesISIN = externalCodeKeyValuesISIN;
  }

  public RawSearchClassInstrumentResult feeData(FeeData feeData) {
    this.feeData = feeData;
    return this;
  }

  /**
   * Get feeData
   * @return feeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FeeData getFeeData() {
    return feeData;
  }

  public void setFeeData(FeeData feeData) {
    this.feeData = feeData;
  }

  public RawSearchClassInstrumentResult fundGroupName(String fundGroupName) {
    this.fundGroupName = fundGroupName;
    return this;
  }

  /**
   * Get fundGroupName
   * @return fundGroupName
  **/
  @ApiModelProperty(value = "")


  public String getFundGroupName() {
    return fundGroupName;
  }

  public void setFundGroupName(String fundGroupName) {
    this.fundGroupName = fundGroupName;
  }

  public RawSearchClassInstrumentResult fundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
    return this;
  }

  /**
   * The Id of the {FundHouseGroup}
   * @return fundHouseGroupId
  **/
  @ApiModelProperty(value = "The Id of the {FundHouseGroup}")


  public Long getFundHouseGroupId() {
    return fundHouseGroupId;
  }

  public void setFundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
  }

  public RawSearchClassInstrumentResult fundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
    return this;
  }

  /**
   * The Id of the {FundHouse}
   * @return fundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {FundHouse}")


  public Long getFundHouseId() {
    return fundHouseId;
  }

  public void setFundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
  }

  public RawSearchClassInstrumentResult hedge(Boolean hedge) {
    this.hedge = hedge;
    return this;
  }

  /**
   * Hedge of the currency
   * @return hedge
  **/
  @ApiModelProperty(value = "Hedge of the currency")


  public Boolean getHedge() {
    return hedge;
  }

  public void setHedge(Boolean hedge) {
    this.hedge = hedge;
  }

  public RawSearchClassInstrumentResult id(Long id) {
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

  public RawSearchClassInstrumentResult informationProvider(String informationProvider) {
    this.informationProvider = informationProvider;
    return this;
  }

  /**
   * Value of origin of the fund
   * @return informationProvider
  **/
  @ApiModelProperty(value = "Value of origin of the fund")


  public String getInformationProvider() {
    return informationProvider;
  }

  public void setInformationProvider(String informationProvider) {
    this.informationProvider = informationProvider;
  }

  public RawSearchClassInstrumentResult instrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * The type of the Instrument
   * @return instrumentType
  **/
  @ApiModelProperty(value = "The type of the Instrument")


  public String getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }

  public RawSearchClassInstrumentResult minimunInvestmentInitial(Double minimunInvestmentInitial) {
    this.minimunInvestmentInitial = minimunInvestmentInitial;
    return this;
  }

  /**
   * Value of the initial minimum investment
   * @return minimunInvestmentInitial
  **/
  @ApiModelProperty(value = "Value of the initial minimum investment")


  public Double getMinimunInvestmentInitial() {
    return minimunInvestmentInitial;
  }

  public void setMinimunInvestmentInitial(Double minimunInvestmentInitial) {
    this.minimunInvestmentInitial = minimunInvestmentInitial;
  }

  public RawSearchClassInstrumentResult minimunInvestmentSubsequent(Double minimunInvestmentSubsequent) {
    this.minimunInvestmentSubsequent = minimunInvestmentSubsequent;
    return this;
  }

  /**
   * Value of the subsequent minimum investment
   * @return minimunInvestmentSubsequent
  **/
  @ApiModelProperty(value = "Value of the subsequent minimum investment")


  public Double getMinimunInvestmentSubsequent() {
    return minimunInvestmentSubsequent;
  }

  public void setMinimunInvestmentSubsequent(Double minimunInvestmentSubsequent) {
    this.minimunInvestmentSubsequent = minimunInvestmentSubsequent;
  }

  public RawSearchClassInstrumentResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The Name of the {Fund}
   * @return name
  **/
  @ApiModelProperty(value = "The Name of the {Fund}")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RawSearchClassInstrumentResult operatingCashFlow(Double operatingCashFlow) {
    this.operatingCashFlow = operatingCashFlow;
    return this;
  }

  /**
   * Value of the Cash Flow
   * @return operatingCashFlow
  **/
  @ApiModelProperty(value = "Value of the Cash Flow")


  public Double getOperatingCashFlow() {
    return operatingCashFlow;
  }

  public void setOperatingCashFlow(Double operatingCashFlow) {
    this.operatingCashFlow = operatingCashFlow;
  }

  public RawSearchClassInstrumentResult productComplexity(ProductComplexityEnum productComplexity) {
    this.productComplexity = productComplexity;
    return this;
  }

  /**
   * It's a complex product if is {YES} if it's {NO} is not complex, and value {NOT_APPLICABLE}
   * @return productComplexity
  **/
  @ApiModelProperty(value = "It's a complex product if is {YES} if it's {NO} is not complex, and value {NOT_APPLICABLE}")


  public ProductComplexityEnum getProductComplexity() {
    return productComplexity;
  }

  public void setProductComplexity(ProductComplexityEnum productComplexity) {
    this.productComplexity = productComplexity;
  }

  public RawSearchClassInstrumentResult riskLevel(Long riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

  /**
   * SRRI
   * @return riskLevel
  **/
  @ApiModelProperty(value = "SRRI")


  public Long getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(Long riskLevel) {
    this.riskLevel = riskLevel;
  }

  public RawSearchClassInstrumentResult shareTypeCode(String shareTypeCode) {
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

  public RawSearchClassInstrumentResult subscriptionType(String subscriptionType) {
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

  public RawSearchClassInstrumentResult subscriptionTypeCurrency(String subscriptionTypeCurrency) {
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

  public RawSearchClassInstrumentResult transferable(Boolean transferable) {
    this.transferable = transferable;
    return this;
  }

  /**
   * It's a transferable if is {true} if it's {false} is not transferable.
   * @return transferable
  **/
  @ApiModelProperty(value = "It's a transferable if is {true} if it's {false} is not transferable.")


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
    RawSearchClassInstrumentResult rawSearchClassInstrumentResult = (RawSearchClassInstrumentResult) o;
    return Objects.equals(this.classInstrument, rawSearchClassInstrumentResult.classInstrument) &&
        Objects.equals(this.classStatus, rawSearchClassInstrumentResult.classStatus) &&
        Objects.equals(this.classificationKeyValuesALLFUNDSCATEGORY, rawSearchClassInstrumentResult.classificationKeyValuesALLFUNDSCATEGORY) &&
        Objects.equals(this.cnmvInstrument, rawSearchClassInstrumentResult.cnmvInstrument) &&
        Objects.equals(this.currencyCode, rawSearchClassInstrumentResult.currencyCode) &&
        Objects.equals(this.externalCodeKeyValuesISIN, rawSearchClassInstrumentResult.externalCodeKeyValuesISIN) &&
        Objects.equals(this.feeData, rawSearchClassInstrumentResult.feeData) &&
        Objects.equals(this.fundGroupName, rawSearchClassInstrumentResult.fundGroupName) &&
        Objects.equals(this.fundHouseGroupId, rawSearchClassInstrumentResult.fundHouseGroupId) &&
        Objects.equals(this.fundHouseId, rawSearchClassInstrumentResult.fundHouseId) &&
        Objects.equals(this.hedge, rawSearchClassInstrumentResult.hedge) &&
        Objects.equals(this.id, rawSearchClassInstrumentResult.id) &&
        Objects.equals(this.informationProvider, rawSearchClassInstrumentResult.informationProvider) &&
        Objects.equals(this.instrumentType, rawSearchClassInstrumentResult.instrumentType) &&
        Objects.equals(this.minimunInvestmentInitial, rawSearchClassInstrumentResult.minimunInvestmentInitial) &&
        Objects.equals(this.minimunInvestmentSubsequent, rawSearchClassInstrumentResult.minimunInvestmentSubsequent) &&
        Objects.equals(this.name, rawSearchClassInstrumentResult.name) &&
        Objects.equals(this.operatingCashFlow, rawSearchClassInstrumentResult.operatingCashFlow) &&
        Objects.equals(this.productComplexity, rawSearchClassInstrumentResult.productComplexity) &&
        Objects.equals(this.riskLevel, rawSearchClassInstrumentResult.riskLevel) &&
        Objects.equals(this.shareTypeCode, rawSearchClassInstrumentResult.shareTypeCode) &&
        Objects.equals(this.subscriptionType, rawSearchClassInstrumentResult.subscriptionType) &&
        Objects.equals(this.subscriptionTypeCurrency, rawSearchClassInstrumentResult.subscriptionTypeCurrency) &&
        Objects.equals(this.transferable, rawSearchClassInstrumentResult.transferable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classInstrument, classStatus, classificationKeyValuesALLFUNDSCATEGORY, cnmvInstrument, currencyCode, externalCodeKeyValuesISIN, feeData, fundGroupName, fundHouseGroupId, fundHouseId, hedge, id, informationProvider, instrumentType, minimunInvestmentInitial, minimunInvestmentSubsequent, name, operatingCashFlow, productComplexity, riskLevel, shareTypeCode, subscriptionType, subscriptionTypeCurrency, transferable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawSearchClassInstrumentResult {\n");
    
    sb.append("    classInstrument: ").append(toIndentedString(classInstrument)).append("\n");
    sb.append("    classStatus: ").append(toIndentedString(classStatus)).append("\n");
    sb.append("    classificationKeyValuesALLFUNDSCATEGORY: ").append(toIndentedString(classificationKeyValuesALLFUNDSCATEGORY)).append("\n");
    sb.append("    cnmvInstrument: ").append(toIndentedString(cnmvInstrument)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    externalCodeKeyValuesISIN: ").append(toIndentedString(externalCodeKeyValuesISIN)).append("\n");
    sb.append("    feeData: ").append(toIndentedString(feeData)).append("\n");
    sb.append("    fundGroupName: ").append(toIndentedString(fundGroupName)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    hedge: ").append(toIndentedString(hedge)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    informationProvider: ").append(toIndentedString(informationProvider)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    minimunInvestmentInitial: ").append(toIndentedString(minimunInvestmentInitial)).append("\n");
    sb.append("    minimunInvestmentSubsequent: ").append(toIndentedString(minimunInvestmentSubsequent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operatingCashFlow: ").append(toIndentedString(operatingCashFlow)).append("\n");
    sb.append("    productComplexity: ").append(toIndentedString(productComplexity)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    shareTypeCode: ").append(toIndentedString(shareTypeCode)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    subscriptionTypeCurrency: ").append(toIndentedString(subscriptionTypeCurrency)).append("\n");
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

