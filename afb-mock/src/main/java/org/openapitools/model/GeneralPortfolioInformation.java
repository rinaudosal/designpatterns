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
 * GeneralPortfolioInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GeneralPortfolioInformation   {
  /**
   * Indicator whether the portfolio targets specific environmental or social objectives.
   */
  public enum EosPortfolioEnum {
    Y("Y"),
    
    N("N");

    private String value;

    EosPortfolioEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EosPortfolioEnum fromValue(String text) {
      for (EosPortfolioEnum b : EosPortfolioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("eosPortfolio")
  private EosPortfolioEnum eosPortfolio = null;

  @JsonProperty("fundCicCode")
  private String fundCicCode = null;

  @JsonProperty("portfolioGuarantorName")
  private String portfolioGuarantorName = null;

  @JsonProperty("portfolioIdentifyingData")
  private String portfolioIdentifyingData = null;

  @JsonProperty("portfolioIssuerName")
  private String portfolioIssuerName = null;

  @JsonProperty("portfolioName")
  private String portfolioName = null;

  @JsonProperty("portfolioPriipsCategory")
  private Long portfolioPriipsCategory = null;

  @JsonProperty("referenceDate")
  private OffsetDateTime referenceDate = null;

  @JsonProperty("shareClassCurrency")
  private String shareClassCurrency = null;

  @JsonProperty("typeOfIdentificationCodeForTheFundShareOrPortfolio")
  private Long typeOfIdentificationCodeForTheFundShareOrPortfolio = null;

  public GeneralPortfolioInformation eosPortfolio(EosPortfolioEnum eosPortfolio) {
    this.eosPortfolio = eosPortfolio;
    return this;
  }

  /**
   * Indicator whether the portfolio targets specific environmental or social objectives.
   * @return eosPortfolio
  **/
  @ApiModelProperty(value = "Indicator whether the portfolio targets specific environmental or social objectives.")


  public EosPortfolioEnum getEosPortfolio() {
    return eosPortfolio;
  }

  public void setEosPortfolio(EosPortfolioEnum eosPortfolio) {
    this.eosPortfolio = eosPortfolio;
  }

  public GeneralPortfolioInformation fundCicCode(String fundCicCode) {
    this.fundCicCode = fundCicCode;
    return this;
  }

  /**
   * CIC code - Fund   (4 digits)
   * @return fundCicCode
  **/
  @ApiModelProperty(value = "CIC code - Fund   (4 digits)")


  public String getFundCicCode() {
    return fundCicCode;
  }

  public void setFundCicCode(String fundCicCode) {
    this.fundCicCode = fundCicCode;
  }

  public GeneralPortfolioInformation portfolioGuarantorName(String portfolioGuarantorName) {
    this.portfolioGuarantorName = portfolioGuarantorName;
    return this;
  }

  /**
   * Name of Guarantor of the financial instrument or fund... i.e. the entity to which the end investor has counterparty risk
   * @return portfolioGuarantorName
  **/
  @ApiModelProperty(value = "Name of Guarantor of the financial instrument or fund... i.e. the entity to which the end investor has counterparty risk")


  public String getPortfolioGuarantorName() {
    return portfolioGuarantorName;
  }

  public void setPortfolioGuarantorName(String portfolioGuarantorName) {
    this.portfolioGuarantorName = portfolioGuarantorName;
  }

  public GeneralPortfolioInformation portfolioIdentifyingData(String portfolioIdentifyingData) {
    this.portfolioIdentifyingData = portfolioIdentifyingData;
    return this;
  }

  /**
   * Identification of the fund or share class or segregated account
   * @return portfolioIdentifyingData
  **/
  @ApiModelProperty(value = "Identification of the fund or share class or segregated account")


  public String getPortfolioIdentifyingData() {
    return portfolioIdentifyingData;
  }

  public void setPortfolioIdentifyingData(String portfolioIdentifyingData) {
    this.portfolioIdentifyingData = portfolioIdentifyingData;
  }

  public GeneralPortfolioInformation portfolioIssuerName(String portfolioIssuerName) {
    this.portfolioIssuerName = portfolioIssuerName;
    return this;
  }

  /**
   * Name of Issuer of Fund  or Share Class. or segregated account manager or financial instrument.
   * @return portfolioIssuerName
  **/
  @ApiModelProperty(value = "Name of Issuer of Fund  or Share Class. or segregated account manager or financial instrument.")


  public String getPortfolioIssuerName() {
    return portfolioIssuerName;
  }

  public void setPortfolioIssuerName(String portfolioIssuerName) {
    this.portfolioIssuerName = portfolioIssuerName;
  }

  public GeneralPortfolioInformation portfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
    return this;
  }

  /**
   * Name of the Portfolio or name of the CIS
   * @return portfolioName
  **/
  @ApiModelProperty(value = "Name of the Portfolio or name of the CIS")


  public String getPortfolioName() {
    return portfolioName;
  }

  public void setPortfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
  }

  public GeneralPortfolioInformation portfolioPriipsCategory(Long portfolioPriipsCategory) {
    this.portfolioPriipsCategory = portfolioPriipsCategory;
    return this;
  }

  /**
   * PRIIPS Category of the Portfolio
   * @return portfolioPriipsCategory
  **/
  @ApiModelProperty(value = "PRIIPS Category of the Portfolio")


  public Long getPortfolioPriipsCategory() {
    return portfolioPriipsCategory;
  }

  public void setPortfolioPriipsCategory(Long portfolioPriipsCategory) {
    this.portfolioPriipsCategory = portfolioPriipsCategory;
  }

  public GeneralPortfolioInformation referenceDate(OffsetDateTime referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

  /**
   * Date of reference.
   * @return referenceDate
  **/
  @ApiModelProperty(value = "Date of reference.")

  @Valid

  public OffsetDateTime getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(OffsetDateTime referenceDate) {
    this.referenceDate = referenceDate;
  }

  public GeneralPortfolioInformation shareClassCurrency(String shareClassCurrency) {
    this.shareClassCurrency = shareClassCurrency;
    return this;
  }

  /**
   * Valuation currency of the portfolio or the share class
   * @return shareClassCurrency
  **/
  @ApiModelProperty(value = "Valuation currency of the portfolio or the share class")


  public String getShareClassCurrency() {
    return shareClassCurrency;
  }

  public void setShareClassCurrency(String shareClassCurrency) {
    this.shareClassCurrency = shareClassCurrency;
  }

  public GeneralPortfolioInformation typeOfIdentificationCodeForTheFundShareOrPortfolio(Long typeOfIdentificationCodeForTheFundShareOrPortfolio) {
    this.typeOfIdentificationCodeForTheFundShareOrPortfolio = typeOfIdentificationCodeForTheFundShareOrPortfolio;
    return this;
  }

  /**
   * Codification chosen to identify the share of the CIS
   * @return typeOfIdentificationCodeForTheFundShareOrPortfolio
  **/
  @ApiModelProperty(value = "Codification chosen to identify the share of the CIS")


  public Long getTypeOfIdentificationCodeForTheFundShareOrPortfolio() {
    return typeOfIdentificationCodeForTheFundShareOrPortfolio;
  }

  public void setTypeOfIdentificationCodeForTheFundShareOrPortfolio(Long typeOfIdentificationCodeForTheFundShareOrPortfolio) {
    this.typeOfIdentificationCodeForTheFundShareOrPortfolio = typeOfIdentificationCodeForTheFundShareOrPortfolio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralPortfolioInformation generalPortfolioInformation = (GeneralPortfolioInformation) o;
    return Objects.equals(this.eosPortfolio, generalPortfolioInformation.eosPortfolio) &&
        Objects.equals(this.fundCicCode, generalPortfolioInformation.fundCicCode) &&
        Objects.equals(this.portfolioGuarantorName, generalPortfolioInformation.portfolioGuarantorName) &&
        Objects.equals(this.portfolioIdentifyingData, generalPortfolioInformation.portfolioIdentifyingData) &&
        Objects.equals(this.portfolioIssuerName, generalPortfolioInformation.portfolioIssuerName) &&
        Objects.equals(this.portfolioName, generalPortfolioInformation.portfolioName) &&
        Objects.equals(this.portfolioPriipsCategory, generalPortfolioInformation.portfolioPriipsCategory) &&
        Objects.equals(this.referenceDate, generalPortfolioInformation.referenceDate) &&
        Objects.equals(this.shareClassCurrency, generalPortfolioInformation.shareClassCurrency) &&
        Objects.equals(this.typeOfIdentificationCodeForTheFundShareOrPortfolio, generalPortfolioInformation.typeOfIdentificationCodeForTheFundShareOrPortfolio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eosPortfolio, fundCicCode, portfolioGuarantorName, portfolioIdentifyingData, portfolioIssuerName, portfolioName, portfolioPriipsCategory, referenceDate, shareClassCurrency, typeOfIdentificationCodeForTheFundShareOrPortfolio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralPortfolioInformation {\n");
    
    sb.append("    eosPortfolio: ").append(toIndentedString(eosPortfolio)).append("\n");
    sb.append("    fundCicCode: ").append(toIndentedString(fundCicCode)).append("\n");
    sb.append("    portfolioGuarantorName: ").append(toIndentedString(portfolioGuarantorName)).append("\n");
    sb.append("    portfolioIdentifyingData: ").append(toIndentedString(portfolioIdentifyingData)).append("\n");
    sb.append("    portfolioIssuerName: ").append(toIndentedString(portfolioIssuerName)).append("\n");
    sb.append("    portfolioName: ").append(toIndentedString(portfolioName)).append("\n");
    sb.append("    portfolioPriipsCategory: ").append(toIndentedString(portfolioPriipsCategory)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    shareClassCurrency: ").append(toIndentedString(shareClassCurrency)).append("\n");
    sb.append("    typeOfIdentificationCodeForTheFundShareOrPortfolio: ").append(toIndentedString(typeOfIdentificationCodeForTheFundShareOrPortfolio)).append("\n");
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

