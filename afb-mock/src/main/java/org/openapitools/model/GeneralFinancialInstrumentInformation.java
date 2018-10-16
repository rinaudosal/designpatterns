package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeneralFinancialInstrumentInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GeneralFinancialInstrumentInformation   {
  @JsonProperty("financialInstrumentCurrency")
  private String financialInstrumentCurrency = null;

  @JsonProperty("financialInstrumentGuarantorName")
  private String financialInstrumentGuarantorName = null;

  @JsonProperty("financialInstrumentIdentifyingData")
  private String financialInstrumentIdentifyingData = null;

  @JsonProperty("financialInstrumentIssuerName")
  private String financialInstrumentIssuerName = null;

  /**
   * Structured Securities or Structured Funds or UCITS or Non UCITS
   */
  public enum FinancialInstrumentLegalStructureEnum {
    S("S"),
    
    SF("SF"),
    
    U("U"),
    
    N("N");

    private String value;

    FinancialInstrumentLegalStructureEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FinancialInstrumentLegalStructureEnum fromValue(String text) {
      for (FinancialInstrumentLegalStructureEnum b : FinancialInstrumentLegalStructureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("financialInstrumentLegalStructure")
  private FinancialInstrumentLegalStructureEnum financialInstrumentLegalStructure = null;

  @JsonProperty("financialInstrumentName")
  private String financialInstrumentName = null;

  /**
   * Yes or No
   */
  public enum LeveragedFinancialInstrumentOrContingentLiabilityEnum {
    Y("Y"),
    
    N("N");

    private String value;

    LeveragedFinancialInstrumentOrContingentLiabilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LeveragedFinancialInstrumentOrContingentLiabilityEnum fromValue(String text) {
      for (LeveragedFinancialInstrumentOrContingentLiabilityEnum b : LeveragedFinancialInstrumentOrContingentLiabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("leveragedFinancialInstrumentOrContingentLiability")
  private LeveragedFinancialInstrumentOrContingentLiabilityEnum leveragedFinancialInstrumentOrContingentLiability = null;

  @JsonProperty("productCategoryOrNature")
  private String productCategoryOrNature = null;

  @JsonProperty("reportingDate")
  private OffsetDateTime reportingDate = null;

  @JsonProperty("typeOfIdentificationCodeForTheFinancialInstrument")
  private String typeOfIdentificationCodeForTheFinancialInstrument = null;

  public GeneralFinancialInstrumentInformation financialInstrumentCurrency(String financialInstrumentCurrency) {
    this.financialInstrumentCurrency = financialInstrumentCurrency;
    return this;
  }

  /**
   * Denomination currency of the financial instrument
   * @return financialInstrumentCurrency
  **/
  @ApiModelProperty(value = "Denomination currency of the financial instrument")


  public String getFinancialInstrumentCurrency() {
    return financialInstrumentCurrency;
  }

  public void setFinancialInstrumentCurrency(String financialInstrumentCurrency) {
    this.financialInstrumentCurrency = financialInstrumentCurrency;
  }

  public GeneralFinancialInstrumentInformation financialInstrumentGuarantorName(String financialInstrumentGuarantorName) {
    this.financialInstrumentGuarantorName = financialInstrumentGuarantorName;
    return this;
  }

  /**
   * Name of Guarantor of the financial instrument
   * @return financialInstrumentGuarantorName
  **/
  @ApiModelProperty(value = "Name of Guarantor of the financial instrument")


  public String getFinancialInstrumentGuarantorName() {
    return financialInstrumentGuarantorName;
  }

  public void setFinancialInstrumentGuarantorName(String financialInstrumentGuarantorName) {
    this.financialInstrumentGuarantorName = financialInstrumentGuarantorName;
  }

  public GeneralFinancialInstrumentInformation financialInstrumentIdentifyingData(String financialInstrumentIdentifyingData) {
    this.financialInstrumentIdentifyingData = financialInstrumentIdentifyingData;
    return this;
  }

  /**
   * Identification of the financial instrument
   * @return financialInstrumentIdentifyingData
  **/
  @ApiModelProperty(value = "Identification of the financial instrument")


  public String getFinancialInstrumentIdentifyingData() {
    return financialInstrumentIdentifyingData;
  }

  public void setFinancialInstrumentIdentifyingData(String financialInstrumentIdentifyingData) {
    this.financialInstrumentIdentifyingData = financialInstrumentIdentifyingData;
  }

  public GeneralFinancialInstrumentInformation financialInstrumentIssuerName(String financialInstrumentIssuerName) {
    this.financialInstrumentIssuerName = financialInstrumentIssuerName;
    return this;
  }

  /**
   * Name of Issuer of the financial instrument. The one who is responsible for the financial instrument management or issuance
   * @return financialInstrumentIssuerName
  **/
  @ApiModelProperty(value = "Name of Issuer of the financial instrument. The one who is responsible for the financial instrument management or issuance")


  public String getFinancialInstrumentIssuerName() {
    return financialInstrumentIssuerName;
  }

  public void setFinancialInstrumentIssuerName(String financialInstrumentIssuerName) {
    this.financialInstrumentIssuerName = financialInstrumentIssuerName;
  }

  public GeneralFinancialInstrumentInformation financialInstrumentLegalStructure(FinancialInstrumentLegalStructureEnum financialInstrumentLegalStructure) {
    this.financialInstrumentLegalStructure = financialInstrumentLegalStructure;
    return this;
  }

  /**
   * Structured Securities or Structured Funds or UCITS or Non UCITS
   * @return financialInstrumentLegalStructure
  **/
  @ApiModelProperty(value = "Structured Securities or Structured Funds or UCITS or Non UCITS")


  public FinancialInstrumentLegalStructureEnum getFinancialInstrumentLegalStructure() {
    return financialInstrumentLegalStructure;
  }

  public void setFinancialInstrumentLegalStructure(FinancialInstrumentLegalStructureEnum financialInstrumentLegalStructure) {
    this.financialInstrumentLegalStructure = financialInstrumentLegalStructure;
  }

  public GeneralFinancialInstrumentInformation financialInstrumentName(String financialInstrumentName) {
    this.financialInstrumentName = financialInstrumentName;
    return this;
  }

  /**
   * Name of the financial instrument
   * @return financialInstrumentName
  **/
  @ApiModelProperty(value = "Name of the financial instrument")


  public String getFinancialInstrumentName() {
    return financialInstrumentName;
  }

  public void setFinancialInstrumentName(String financialInstrumentName) {
    this.financialInstrumentName = financialInstrumentName;
  }

  public GeneralFinancialInstrumentInformation leveragedFinancialInstrumentOrContingentLiability(LeveragedFinancialInstrumentOrContingentLiabilityEnum leveragedFinancialInstrumentOrContingentLiability) {
    this.leveragedFinancialInstrumentOrContingentLiability = leveragedFinancialInstrumentOrContingentLiability;
    return this;
  }

  /**
   * Yes or No
   * @return leveragedFinancialInstrumentOrContingentLiability
  **/
  @ApiModelProperty(value = "Yes or No")


  public LeveragedFinancialInstrumentOrContingentLiabilityEnum getLeveragedFinancialInstrumentOrContingentLiability() {
    return leveragedFinancialInstrumentOrContingentLiability;
  }

  public void setLeveragedFinancialInstrumentOrContingentLiability(LeveragedFinancialInstrumentOrContingentLiabilityEnum leveragedFinancialInstrumentOrContingentLiability) {
    this.leveragedFinancialInstrumentOrContingentLiability = leveragedFinancialInstrumentOrContingentLiability;
  }

  public GeneralFinancialInstrumentInformation productCategoryOrNature(String productCategoryOrNature) {
    this.productCategoryOrNature = productCategoryOrNature;
    return this;
  }

  /**
   * Designation of the respective product category or nature
   * @return productCategoryOrNature
  **/
  @ApiModelProperty(value = "Designation of the respective product category or nature")


  public String getProductCategoryOrNature() {
    return productCategoryOrNature;
  }

  public void setProductCategoryOrNature(String productCategoryOrNature) {
    this.productCategoryOrNature = productCategoryOrNature;
  }

  public GeneralFinancialInstrumentInformation reportingDate(OffsetDateTime reportingDate) {
    this.reportingDate = reportingDate;
    return this;
  }

  /**
   * Date to which the data refer
   * @return reportingDate
  **/
  @ApiModelProperty(value = "Date to which the data refer")

  @Valid

  public OffsetDateTime getReportingDate() {
    return reportingDate;
  }

  public void setReportingDate(OffsetDateTime reportingDate) {
    this.reportingDate = reportingDate;
  }

  public GeneralFinancialInstrumentInformation typeOfIdentificationCodeForTheFinancialInstrument(String typeOfIdentificationCodeForTheFinancialInstrument) {
    this.typeOfIdentificationCodeForTheFinancialInstrument = typeOfIdentificationCodeForTheFinancialInstrument;
    return this;
  }

  /**
   * Codification chosen to identify the financial instrument
   * @return typeOfIdentificationCodeForTheFinancialInstrument
  **/
  @ApiModelProperty(value = "Codification chosen to identify the financial instrument")


  public String getTypeOfIdentificationCodeForTheFinancialInstrument() {
    return typeOfIdentificationCodeForTheFinancialInstrument;
  }

  public void setTypeOfIdentificationCodeForTheFinancialInstrument(String typeOfIdentificationCodeForTheFinancialInstrument) {
    this.typeOfIdentificationCodeForTheFinancialInstrument = typeOfIdentificationCodeForTheFinancialInstrument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralFinancialInstrumentInformation generalFinancialInstrumentInformation = (GeneralFinancialInstrumentInformation) o;
    return Objects.equals(this.financialInstrumentCurrency, generalFinancialInstrumentInformation.financialInstrumentCurrency) &&
        Objects.equals(this.financialInstrumentGuarantorName, generalFinancialInstrumentInformation.financialInstrumentGuarantorName) &&
        Objects.equals(this.financialInstrumentIdentifyingData, generalFinancialInstrumentInformation.financialInstrumentIdentifyingData) &&
        Objects.equals(this.financialInstrumentIssuerName, generalFinancialInstrumentInformation.financialInstrumentIssuerName) &&
        Objects.equals(this.financialInstrumentLegalStructure, generalFinancialInstrumentInformation.financialInstrumentLegalStructure) &&
        Objects.equals(this.financialInstrumentName, generalFinancialInstrumentInformation.financialInstrumentName) &&
        Objects.equals(this.leveragedFinancialInstrumentOrContingentLiability, generalFinancialInstrumentInformation.leveragedFinancialInstrumentOrContingentLiability) &&
        Objects.equals(this.productCategoryOrNature, generalFinancialInstrumentInformation.productCategoryOrNature) &&
        Objects.equals(this.reportingDate, generalFinancialInstrumentInformation.reportingDate) &&
        Objects.equals(this.typeOfIdentificationCodeForTheFinancialInstrument, generalFinancialInstrumentInformation.typeOfIdentificationCodeForTheFinancialInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialInstrumentCurrency, financialInstrumentGuarantorName, financialInstrumentIdentifyingData, financialInstrumentIssuerName, financialInstrumentLegalStructure, financialInstrumentName, leveragedFinancialInstrumentOrContingentLiability, productCategoryOrNature, reportingDate, typeOfIdentificationCodeForTheFinancialInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralFinancialInstrumentInformation {\n");
    
    sb.append("    financialInstrumentCurrency: ").append(toIndentedString(financialInstrumentCurrency)).append("\n");
    sb.append("    financialInstrumentGuarantorName: ").append(toIndentedString(financialInstrumentGuarantorName)).append("\n");
    sb.append("    financialInstrumentIdentifyingData: ").append(toIndentedString(financialInstrumentIdentifyingData)).append("\n");
    sb.append("    financialInstrumentIssuerName: ").append(toIndentedString(financialInstrumentIssuerName)).append("\n");
    sb.append("    financialInstrumentLegalStructure: ").append(toIndentedString(financialInstrumentLegalStructure)).append("\n");
    sb.append("    financialInstrumentName: ").append(toIndentedString(financialInstrumentName)).append("\n");
    sb.append("    leveragedFinancialInstrumentOrContingentLiability: ").append(toIndentedString(leveragedFinancialInstrumentOrContingentLiability)).append("\n");
    sb.append("    productCategoryOrNature: ").append(toIndentedString(productCategoryOrNature)).append("\n");
    sb.append("    reportingDate: ").append(toIndentedString(reportingDate)).append("\n");
    sb.append("    typeOfIdentificationCodeForTheFinancialInstrument: ").append(toIndentedString(typeOfIdentificationCodeForTheFinancialInstrument)).append("\n");
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

