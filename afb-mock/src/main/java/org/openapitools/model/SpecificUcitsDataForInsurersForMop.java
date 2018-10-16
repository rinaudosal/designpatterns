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
 * SpecificUcitsDataForInsurersForMop
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpecificUcitsDataForInsurersForMop   {
  @JsonProperty("incidentalCostsPortfolioCarriedInterestUcits")
  private Double incidentalCostsPortfolioCarriedInterestUcits = null;

  @JsonProperty("incidentalCostsPortfolioPerformanceFeesUcits")
  private Double incidentalCostsPortfolioPerformanceFeesUcits = null;

  @JsonProperty("ongoingCostsPortfolioOtherCostsUcits")
  private Double ongoingCostsPortfolioOtherCostsUcits = null;

  @JsonProperty("ongoingCostsPortfolioTransactionCosts")
  private Double ongoingCostsPortfolioTransactionCosts = null;

  @JsonProperty("portfolioUcitsSrri")
  private Long portfolioUcitsSrri = null;

  @JsonProperty("portfolioUcitsVol")
  private Double portfolioUcitsVol = null;

  /**
   * Indicate if the line contains PRIIPS data or Not
   */
  public enum PriipDataDeliveryEnum {
    Y("Y"),
    
    N("N");

    private String value;

    PriipDataDeliveryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PriipDataDeliveryEnum fromValue(String text) {
      for (PriipDataDeliveryEnum b : PriipDataDeliveryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("priipDataDelivery")
  private PriipDataDeliveryEnum priipDataDelivery = null;

  @JsonProperty("transactionsCostsMethodology")
  private String transactionsCostsMethodology = null;

  /**
   * Indicate if the line contains UCITS data or Not
   */
  public enum UcitsDataDeliveryEnum {
    Y("Y"),
    
    N("N");

    private String value;

    UcitsDataDeliveryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UcitsDataDeliveryEnum fromValue(String text) {
      for (UcitsDataDeliveryEnum b : UcitsDataDeliveryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ucitsDataDelivery")
  private UcitsDataDeliveryEnum ucitsDataDelivery = null;

  @JsonProperty("ucitsKidWebAddress")
  private String ucitsKidWebAddress = null;

  public SpecificUcitsDataForInsurersForMop incidentalCostsPortfolioCarriedInterestUcits(Double incidentalCostsPortfolioCarriedInterestUcits) {
    this.incidentalCostsPortfolioCarriedInterestUcits = incidentalCostsPortfolioCarriedInterestUcits;
    return this;
  }

  /**
   * See UCITS definition as a % of invested capital per annum (average)
   * @return incidentalCostsPortfolioCarriedInterestUcits
  **/
  @ApiModelProperty(value = "See UCITS definition as a % of invested capital per annum (average)")


  public Double getIncidentalCostsPortfolioCarriedInterestUcits() {
    return incidentalCostsPortfolioCarriedInterestUcits;
  }

  public void setIncidentalCostsPortfolioCarriedInterestUcits(Double incidentalCostsPortfolioCarriedInterestUcits) {
    this.incidentalCostsPortfolioCarriedInterestUcits = incidentalCostsPortfolioCarriedInterestUcits;
  }

  public SpecificUcitsDataForInsurersForMop incidentalCostsPortfolioPerformanceFeesUcits(Double incidentalCostsPortfolioPerformanceFeesUcits) {
    this.incidentalCostsPortfolioPerformanceFeesUcits = incidentalCostsPortfolioPerformanceFeesUcits;
    return this;
  }

  /**
   * See UCITS definition as a % of NAV of the portfolio, the funds or the share class / per annum
   * @return incidentalCostsPortfolioPerformanceFeesUcits
  **/
  @ApiModelProperty(value = "See UCITS definition as a % of NAV of the portfolio, the funds or the share class / per annum")


  public Double getIncidentalCostsPortfolioPerformanceFeesUcits() {
    return incidentalCostsPortfolioPerformanceFeesUcits;
  }

  public void setIncidentalCostsPortfolioPerformanceFeesUcits(Double incidentalCostsPortfolioPerformanceFeesUcits) {
    this.incidentalCostsPortfolioPerformanceFeesUcits = incidentalCostsPortfolioPerformanceFeesUcits;
  }

  public SpecificUcitsDataForInsurersForMop ongoingCostsPortfolioOtherCostsUcits(Double ongoingCostsPortfolioOtherCostsUcits) {
    this.ongoingCostsPortfolioOtherCostsUcits = ongoingCostsPortfolioOtherCostsUcits;
    return this;
  }

  /**
   * See UCITS definition as a % of NAV of the portfolio, the funds or the share class / per annum
   * @return ongoingCostsPortfolioOtherCostsUcits
  **/
  @ApiModelProperty(value = "See UCITS definition as a % of NAV of the portfolio, the funds or the share class / per annum")


  public Double getOngoingCostsPortfolioOtherCostsUcits() {
    return ongoingCostsPortfolioOtherCostsUcits;
  }

  public void setOngoingCostsPortfolioOtherCostsUcits(Double ongoingCostsPortfolioOtherCostsUcits) {
    this.ongoingCostsPortfolioOtherCostsUcits = ongoingCostsPortfolioOtherCostsUcits;
  }

  public SpecificUcitsDataForInsurersForMop ongoingCostsPortfolioTransactionCosts(Double ongoingCostsPortfolioTransactionCosts) {
    this.ongoingCostsPortfolioTransactionCosts = ongoingCostsPortfolioTransactionCosts;
    return this;
  }

  /**
   * See PRIIPS / UCITS definition as a % of NAV of the portfolio, the funds or the share class / per annum
   * @return ongoingCostsPortfolioTransactionCosts
  **/
  @ApiModelProperty(value = "See PRIIPS / UCITS definition as a % of NAV of the portfolio, the funds or the share class / per annum")


  public Double getOngoingCostsPortfolioTransactionCosts() {
    return ongoingCostsPortfolioTransactionCosts;
  }

  public void setOngoingCostsPortfolioTransactionCosts(Double ongoingCostsPortfolioTransactionCosts) {
    this.ongoingCostsPortfolioTransactionCosts = ongoingCostsPortfolioTransactionCosts;
  }

  public SpecificUcitsDataForInsurersForMop portfolioUcitsSrri(Long portfolioUcitsSrri) {
    this.portfolioUcitsSrri = portfolioUcitsSrri;
    return this;
  }

  /**
   * The SRRI of the Valid UCITS KIID
   * @return portfolioUcitsSrri
  **/
  @ApiModelProperty(value = "The SRRI of the Valid UCITS KIID")


  public Long getPortfolioUcitsSrri() {
    return portfolioUcitsSrri;
  }

  public void setPortfolioUcitsSrri(Long portfolioUcitsSrri) {
    this.portfolioUcitsSrri = portfolioUcitsSrri;
  }

  public SpecificUcitsDataForInsurersForMop portfolioUcitsVol(Double portfolioUcitsVol) {
    this.portfolioUcitsVol = portfolioUcitsVol;
    return this;
  }

  /**
   * If available - Historical volatility corresponding to the SRRI of the Valid UCITS KIID
   * @return portfolioUcitsVol
  **/
  @ApiModelProperty(value = "If available - Historical volatility corresponding to the SRRI of the Valid UCITS KIID")


  public Double getPortfolioUcitsVol() {
    return portfolioUcitsVol;
  }

  public void setPortfolioUcitsVol(Double portfolioUcitsVol) {
    this.portfolioUcitsVol = portfolioUcitsVol;
  }

  public SpecificUcitsDataForInsurersForMop priipDataDelivery(PriipDataDeliveryEnum priipDataDelivery) {
    this.priipDataDelivery = priipDataDelivery;
    return this;
  }

  /**
   * Indicate if the line contains PRIIPS data or Not
   * @return priipDataDelivery
  **/
  @ApiModelProperty(value = "Indicate if the line contains PRIIPS data or Not")


  public PriipDataDeliveryEnum getPriipDataDelivery() {
    return priipDataDelivery;
  }

  public void setPriipDataDelivery(PriipDataDeliveryEnum priipDataDelivery) {
    this.priipDataDelivery = priipDataDelivery;
  }

  public SpecificUcitsDataForInsurersForMop transactionsCostsMethodology(String transactionsCostsMethodology) {
    this.transactionsCostsMethodology = transactionsCostsMethodology;
    return this;
  }

  /**
   * 1. New PRIIPS methodology, 2. Full PRIIPS methodology, 3. Other methodology, 4. None, 5. text
   * @return transactionsCostsMethodology
  **/
  @ApiModelProperty(value = "1. New PRIIPS methodology, 2. Full PRIIPS methodology, 3. Other methodology, 4. None, 5. text")


  public String getTransactionsCostsMethodology() {
    return transactionsCostsMethodology;
  }

  public void setTransactionsCostsMethodology(String transactionsCostsMethodology) {
    this.transactionsCostsMethodology = transactionsCostsMethodology;
  }

  public SpecificUcitsDataForInsurersForMop ucitsDataDelivery(UcitsDataDeliveryEnum ucitsDataDelivery) {
    this.ucitsDataDelivery = ucitsDataDelivery;
    return this;
  }

  /**
   * Indicate if the line contains UCITS data or Not
   * @return ucitsDataDelivery
  **/
  @ApiModelProperty(value = "Indicate if the line contains UCITS data or Not")


  public UcitsDataDeliveryEnum getUcitsDataDelivery() {
    return ucitsDataDelivery;
  }

  public void setUcitsDataDelivery(UcitsDataDeliveryEnum ucitsDataDelivery) {
    this.ucitsDataDelivery = ucitsDataDelivery;
  }

  public SpecificUcitsDataForInsurersForMop ucitsKidWebAddress(String ucitsKidWebAddress) {
    this.ucitsKidWebAddress = ucitsKidWebAddress;
    return this;
  }

  /**
   * Direct link to the UCITS Kid
   * @return ucitsKidWebAddress
  **/
  @ApiModelProperty(value = "Direct link to the UCITS Kid")


  public String getUcitsKidWebAddress() {
    return ucitsKidWebAddress;
  }

  public void setUcitsKidWebAddress(String ucitsKidWebAddress) {
    this.ucitsKidWebAddress = ucitsKidWebAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificUcitsDataForInsurersForMop specificUcitsDataForInsurersForMop = (SpecificUcitsDataForInsurersForMop) o;
    return Objects.equals(this.incidentalCostsPortfolioCarriedInterestUcits, specificUcitsDataForInsurersForMop.incidentalCostsPortfolioCarriedInterestUcits) &&
        Objects.equals(this.incidentalCostsPortfolioPerformanceFeesUcits, specificUcitsDataForInsurersForMop.incidentalCostsPortfolioPerformanceFeesUcits) &&
        Objects.equals(this.ongoingCostsPortfolioOtherCostsUcits, specificUcitsDataForInsurersForMop.ongoingCostsPortfolioOtherCostsUcits) &&
        Objects.equals(this.ongoingCostsPortfolioTransactionCosts, specificUcitsDataForInsurersForMop.ongoingCostsPortfolioTransactionCosts) &&
        Objects.equals(this.portfolioUcitsSrri, specificUcitsDataForInsurersForMop.portfolioUcitsSrri) &&
        Objects.equals(this.portfolioUcitsVol, specificUcitsDataForInsurersForMop.portfolioUcitsVol) &&
        Objects.equals(this.priipDataDelivery, specificUcitsDataForInsurersForMop.priipDataDelivery) &&
        Objects.equals(this.transactionsCostsMethodology, specificUcitsDataForInsurersForMop.transactionsCostsMethodology) &&
        Objects.equals(this.ucitsDataDelivery, specificUcitsDataForInsurersForMop.ucitsDataDelivery) &&
        Objects.equals(this.ucitsKidWebAddress, specificUcitsDataForInsurersForMop.ucitsKidWebAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentalCostsPortfolioCarriedInterestUcits, incidentalCostsPortfolioPerformanceFeesUcits, ongoingCostsPortfolioOtherCostsUcits, ongoingCostsPortfolioTransactionCosts, portfolioUcitsSrri, portfolioUcitsVol, priipDataDelivery, transactionsCostsMethodology, ucitsDataDelivery, ucitsKidWebAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificUcitsDataForInsurersForMop {\n");
    
    sb.append("    incidentalCostsPortfolioCarriedInterestUcits: ").append(toIndentedString(incidentalCostsPortfolioCarriedInterestUcits)).append("\n");
    sb.append("    incidentalCostsPortfolioPerformanceFeesUcits: ").append(toIndentedString(incidentalCostsPortfolioPerformanceFeesUcits)).append("\n");
    sb.append("    ongoingCostsPortfolioOtherCostsUcits: ").append(toIndentedString(ongoingCostsPortfolioOtherCostsUcits)).append("\n");
    sb.append("    ongoingCostsPortfolioTransactionCosts: ").append(toIndentedString(ongoingCostsPortfolioTransactionCosts)).append("\n");
    sb.append("    portfolioUcitsSrri: ").append(toIndentedString(portfolioUcitsSrri)).append("\n");
    sb.append("    portfolioUcitsVol: ").append(toIndentedString(portfolioUcitsVol)).append("\n");
    sb.append("    priipDataDelivery: ").append(toIndentedString(priipDataDelivery)).append("\n");
    sb.append("    transactionsCostsMethodology: ").append(toIndentedString(transactionsCostsMethodology)).append("\n");
    sb.append("    ucitsDataDelivery: ").append(toIndentedString(ucitsDataDelivery)).append("\n");
    sb.append("    ucitsKidWebAddress: ").append(toIndentedString(ucitsKidWebAddress)).append("\n");
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

