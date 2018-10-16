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
 * Costs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Costs   {
  /**
   * See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum
   */
  public enum ExistingCarriedInterestFeesEnum {
    Y("Y"),
    
    N("N");

    private String value;

    ExistingCarriedInterestFeesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExistingCarriedInterestFeesEnum fromValue(String text) {
      for (ExistingCarriedInterestFeesEnum b : ExistingCarriedInterestFeesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("existingCarriedInterestFees")
  private ExistingCarriedInterestFeesEnum existingCarriedInterestFees = null;

  /**
   * Indicates whether there are existing performance fees or not
   */
  public enum ExistingPerformanceFeesEnum {
    Y("Y"),
    
    N("N");

    private String value;

    ExistingPerformanceFeesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExistingPerformanceFeesEnum fromValue(String text) {
      for (ExistingPerformanceFeesEnum b : ExistingPerformanceFeesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("existingPerformanceFees")
  private ExistingPerformanceFeesEnum existingPerformanceFees = null;

  @JsonProperty("incidentalCostsPortfolioCarriedInterest")
  private Double incidentalCostsPortfolioCarriedInterest = null;

  @JsonProperty("incidentalCostsPortfolioPerformanceFees")
  private Double incidentalCostsPortfolioPerformanceFees = null;

  @JsonProperty("oneOffCostPortfolioEntryCost")
  private Double oneOffCostPortfolioEntryCost = null;

  @JsonProperty("oneOffCostPortfolioEntryCostAcquired")
  private Double oneOffCostPortfolioEntryCostAcquired = null;

  @JsonProperty("oneOffCostsPortfolioExitCostAt1Year")
  private Double oneOffCostsPortfolioExitCostAt1Year = null;

  @JsonProperty("oneOffCostsPortfolioExitCostAtHalfRhp")
  private Double oneOffCostsPortfolioExitCostAtHalfRhp = null;

  @JsonProperty("oneOffCostsPortfolioExitCostAtRhp")
  private Double oneOffCostsPortfolioExitCostAtRhp = null;

  /**
   * Indicates whether there is a sliding exit cost or not
   */
  public enum OneOffCostsPortfolioSlidingExitCostIndicatorEnum {
    Y("Y"),
    
    N("N");

    private String value;

    OneOffCostsPortfolioSlidingExitCostIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OneOffCostsPortfolioSlidingExitCostIndicatorEnum fromValue(String text) {
      for (OneOffCostsPortfolioSlidingExitCostIndicatorEnum b : OneOffCostsPortfolioSlidingExitCostIndicatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("oneOffCostsPortfolioSlidingExitCostIndicator")
  private OneOffCostsPortfolioSlidingExitCostIndicatorEnum oneOffCostsPortfolioSlidingExitCostIndicator = null;

  @JsonProperty("ongoingCostsPortfolioManagementCosts")
  private Double ongoingCostsPortfolioManagementCosts = null;

  @JsonProperty("ongoingCostsPortfolioOtherCosts")
  private Double ongoingCostsPortfolioOtherCosts = null;

  @JsonProperty("ongoingCostsPortfolioTransactionCosts")
  private Double ongoingCostsPortfolioTransactionCosts = null;

  public Costs existingCarriedInterestFees(ExistingCarriedInterestFeesEnum existingCarriedInterestFees) {
    this.existingCarriedInterestFees = existingCarriedInterestFees;
    return this;
  }

  /**
   * See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum
   * @return existingCarriedInterestFees
  **/
  @ApiModelProperty(value = "See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum")


  public ExistingCarriedInterestFeesEnum getExistingCarriedInterestFees() {
    return existingCarriedInterestFees;
  }

  public void setExistingCarriedInterestFees(ExistingCarriedInterestFeesEnum existingCarriedInterestFees) {
    this.existingCarriedInterestFees = existingCarriedInterestFees;
  }

  public Costs existingPerformanceFees(ExistingPerformanceFeesEnum existingPerformanceFees) {
    this.existingPerformanceFees = existingPerformanceFees;
    return this;
  }

  /**
   * Indicates whether there are existing performance fees or not
   * @return existingPerformanceFees
  **/
  @ApiModelProperty(value = "Indicates whether there are existing performance fees or not")


  public ExistingPerformanceFeesEnum getExistingPerformanceFees() {
    return existingPerformanceFees;
  }

  public void setExistingPerformanceFees(ExistingPerformanceFeesEnum existingPerformanceFees) {
    this.existingPerformanceFees = existingPerformanceFees;
  }

  public Costs incidentalCostsPortfolioCarriedInterest(Double incidentalCostsPortfolioCarriedInterest) {
    this.incidentalCostsPortfolioCarriedInterest = incidentalCostsPortfolioCarriedInterest;
    return this;
  }

  /**
   * See PRIIPS definition as a % of invested capital per annum (average)
   * @return incidentalCostsPortfolioCarriedInterest
  **/
  @ApiModelProperty(value = "See PRIIPS definition as a % of invested capital per annum (average)")


  public Double getIncidentalCostsPortfolioCarriedInterest() {
    return incidentalCostsPortfolioCarriedInterest;
  }

  public void setIncidentalCostsPortfolioCarriedInterest(Double incidentalCostsPortfolioCarriedInterest) {
    this.incidentalCostsPortfolioCarriedInterest = incidentalCostsPortfolioCarriedInterest;
  }

  public Costs incidentalCostsPortfolioPerformanceFees(Double incidentalCostsPortfolioPerformanceFees) {
    this.incidentalCostsPortfolioPerformanceFees = incidentalCostsPortfolioPerformanceFees;
    return this;
  }

  /**
   * See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum
   * @return incidentalCostsPortfolioPerformanceFees
  **/
  @ApiModelProperty(value = "See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum")


  public Double getIncidentalCostsPortfolioPerformanceFees() {
    return incidentalCostsPortfolioPerformanceFees;
  }

  public void setIncidentalCostsPortfolioPerformanceFees(Double incidentalCostsPortfolioPerformanceFees) {
    this.incidentalCostsPortfolioPerformanceFees = incidentalCostsPortfolioPerformanceFees;
  }

  public Costs oneOffCostPortfolioEntryCost(Double oneOffCostPortfolioEntryCost) {
    this.oneOffCostPortfolioEntryCost = oneOffCostPortfolioEntryCost;
    return this;
  }

  /**
   * Subscription fees not acquired to the fund or the share class or portfolio mandate. Expressed as a % of the amount to be invested
   * @return oneOffCostPortfolioEntryCost
  **/
  @ApiModelProperty(value = "Subscription fees not acquired to the fund or the share class or portfolio mandate. Expressed as a % of the amount to be invested")


  public Double getOneOffCostPortfolioEntryCost() {
    return oneOffCostPortfolioEntryCost;
  }

  public void setOneOffCostPortfolioEntryCost(Double oneOffCostPortfolioEntryCost) {
    this.oneOffCostPortfolioEntryCost = oneOffCostPortfolioEntryCost;
  }

  public Costs oneOffCostPortfolioEntryCostAcquired(Double oneOffCostPortfolioEntryCostAcquired) {
    this.oneOffCostPortfolioEntryCostAcquired = oneOffCostPortfolioEntryCostAcquired;
    return this;
  }

  /**
   * Subscription fees acquired to the fund or the share class or portfolio mandate. Expressed as a % of the amount to be invested
   * @return oneOffCostPortfolioEntryCostAcquired
  **/
  @ApiModelProperty(value = "Subscription fees acquired to the fund or the share class or portfolio mandate. Expressed as a % of the amount to be invested")


  public Double getOneOffCostPortfolioEntryCostAcquired() {
    return oneOffCostPortfolioEntryCostAcquired;
  }

  public void setOneOffCostPortfolioEntryCostAcquired(Double oneOffCostPortfolioEntryCostAcquired) {
    this.oneOffCostPortfolioEntryCostAcquired = oneOffCostPortfolioEntryCostAcquired;
  }

  public Costs oneOffCostsPortfolioExitCostAt1Year(Double oneOffCostsPortfolioExitCostAt1Year) {
    this.oneOffCostsPortfolioExitCostAt1Year = oneOffCostsPortfolioExitCostAt1Year;
    return this;
  }

  /**
   * Exit fees after one year for the portfolio or fund or share class. It is expressed as a % of net asset value.
   * @return oneOffCostsPortfolioExitCostAt1Year
  **/
  @ApiModelProperty(value = "Exit fees after one year for the portfolio or fund or share class. It is expressed as a % of net asset value.")


  public Double getOneOffCostsPortfolioExitCostAt1Year() {
    return oneOffCostsPortfolioExitCostAt1Year;
  }

  public void setOneOffCostsPortfolioExitCostAt1Year(Double oneOffCostsPortfolioExitCostAt1Year) {
    this.oneOffCostsPortfolioExitCostAt1Year = oneOffCostsPortfolioExitCostAt1Year;
  }

  public Costs oneOffCostsPortfolioExitCostAtHalfRhp(Double oneOffCostsPortfolioExitCostAtHalfRhp) {
    this.oneOffCostsPortfolioExitCostAtHalfRhp = oneOffCostsPortfolioExitCostAtHalfRhp;
    return this;
  }

  /**
   * Exit fees after half of the RHP for the portfolio or fund or share class. It is expressed as a % of net asset value.
   * @return oneOffCostsPortfolioExitCostAtHalfRhp
  **/
  @ApiModelProperty(value = "Exit fees after half of the RHP for the portfolio or fund or share class. It is expressed as a % of net asset value.")


  public Double getOneOffCostsPortfolioExitCostAtHalfRhp() {
    return oneOffCostsPortfolioExitCostAtHalfRhp;
  }

  public void setOneOffCostsPortfolioExitCostAtHalfRhp(Double oneOffCostsPortfolioExitCostAtHalfRhp) {
    this.oneOffCostsPortfolioExitCostAtHalfRhp = oneOffCostsPortfolioExitCostAtHalfRhp;
  }

  public Costs oneOffCostsPortfolioExitCostAtRhp(Double oneOffCostsPortfolioExitCostAtRhp) {
    this.oneOffCostsPortfolioExitCostAtRhp = oneOffCostsPortfolioExitCostAtRhp;
    return this;
  }

  /**
   * Exit fees at the end of RHP for the portfolio or fund or share class. It is expressed as a % of net asset value.
   * @return oneOffCostsPortfolioExitCostAtRhp
  **/
  @ApiModelProperty(value = "Exit fees at the end of RHP for the portfolio or fund or share class. It is expressed as a % of net asset value.")


  public Double getOneOffCostsPortfolioExitCostAtRhp() {
    return oneOffCostsPortfolioExitCostAtRhp;
  }

  public void setOneOffCostsPortfolioExitCostAtRhp(Double oneOffCostsPortfolioExitCostAtRhp) {
    this.oneOffCostsPortfolioExitCostAtRhp = oneOffCostsPortfolioExitCostAtRhp;
  }

  public Costs oneOffCostsPortfolioSlidingExitCostIndicator(OneOffCostsPortfolioSlidingExitCostIndicatorEnum oneOffCostsPortfolioSlidingExitCostIndicator) {
    this.oneOffCostsPortfolioSlidingExitCostIndicator = oneOffCostsPortfolioSlidingExitCostIndicator;
    return this;
  }

  /**
   * Indicates whether there is a sliding exit cost or not
   * @return oneOffCostsPortfolioSlidingExitCostIndicator
  **/
  @ApiModelProperty(value = "Indicates whether there is a sliding exit cost or not")


  public OneOffCostsPortfolioSlidingExitCostIndicatorEnum getOneOffCostsPortfolioSlidingExitCostIndicator() {
    return oneOffCostsPortfolioSlidingExitCostIndicator;
  }

  public void setOneOffCostsPortfolioSlidingExitCostIndicator(OneOffCostsPortfolioSlidingExitCostIndicatorEnum oneOffCostsPortfolioSlidingExitCostIndicator) {
    this.oneOffCostsPortfolioSlidingExitCostIndicator = oneOffCostsPortfolioSlidingExitCostIndicator;
  }

  public Costs ongoingCostsPortfolioManagementCosts(Double ongoingCostsPortfolioManagementCosts) {
    this.ongoingCostsPortfolioManagementCosts = ongoingCostsPortfolioManagementCosts;
    return this;
  }

  /**
   * Management fees as a % of the NAV
   * @return ongoingCostsPortfolioManagementCosts
  **/
  @ApiModelProperty(value = "Management fees as a % of the NAV")


  public Double getOngoingCostsPortfolioManagementCosts() {
    return ongoingCostsPortfolioManagementCosts;
  }

  public void setOngoingCostsPortfolioManagementCosts(Double ongoingCostsPortfolioManagementCosts) {
    this.ongoingCostsPortfolioManagementCosts = ongoingCostsPortfolioManagementCosts;
  }

  public Costs ongoingCostsPortfolioOtherCosts(Double ongoingCostsPortfolioOtherCosts) {
    this.ongoingCostsPortfolioOtherCosts = ongoingCostsPortfolioOtherCosts;
    return this;
  }

  /**
   * See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum
   * @return ongoingCostsPortfolioOtherCosts
  **/
  @ApiModelProperty(value = "See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum")


  public Double getOngoingCostsPortfolioOtherCosts() {
    return ongoingCostsPortfolioOtherCosts;
  }

  public void setOngoingCostsPortfolioOtherCosts(Double ongoingCostsPortfolioOtherCosts) {
    this.ongoingCostsPortfolioOtherCosts = ongoingCostsPortfolioOtherCosts;
  }

  public Costs ongoingCostsPortfolioTransactionCosts(Double ongoingCostsPortfolioTransactionCosts) {
    this.ongoingCostsPortfolioTransactionCosts = ongoingCostsPortfolioTransactionCosts;
    return this;
  }

  /**
   * See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum.
   * @return ongoingCostsPortfolioTransactionCosts
  **/
  @ApiModelProperty(value = "See PRIIPS definition as a % of NAV of the portfolio, the funds or the share class / per annum.")


  public Double getOngoingCostsPortfolioTransactionCosts() {
    return ongoingCostsPortfolioTransactionCosts;
  }

  public void setOngoingCostsPortfolioTransactionCosts(Double ongoingCostsPortfolioTransactionCosts) {
    this.ongoingCostsPortfolioTransactionCosts = ongoingCostsPortfolioTransactionCosts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Costs costs = (Costs) o;
    return Objects.equals(this.existingCarriedInterestFees, costs.existingCarriedInterestFees) &&
        Objects.equals(this.existingPerformanceFees, costs.existingPerformanceFees) &&
        Objects.equals(this.incidentalCostsPortfolioCarriedInterest, costs.incidentalCostsPortfolioCarriedInterest) &&
        Objects.equals(this.incidentalCostsPortfolioPerformanceFees, costs.incidentalCostsPortfolioPerformanceFees) &&
        Objects.equals(this.oneOffCostPortfolioEntryCost, costs.oneOffCostPortfolioEntryCost) &&
        Objects.equals(this.oneOffCostPortfolioEntryCostAcquired, costs.oneOffCostPortfolioEntryCostAcquired) &&
        Objects.equals(this.oneOffCostsPortfolioExitCostAt1Year, costs.oneOffCostsPortfolioExitCostAt1Year) &&
        Objects.equals(this.oneOffCostsPortfolioExitCostAtHalfRhp, costs.oneOffCostsPortfolioExitCostAtHalfRhp) &&
        Objects.equals(this.oneOffCostsPortfolioExitCostAtRhp, costs.oneOffCostsPortfolioExitCostAtRhp) &&
        Objects.equals(this.oneOffCostsPortfolioSlidingExitCostIndicator, costs.oneOffCostsPortfolioSlidingExitCostIndicator) &&
        Objects.equals(this.ongoingCostsPortfolioManagementCosts, costs.ongoingCostsPortfolioManagementCosts) &&
        Objects.equals(this.ongoingCostsPortfolioOtherCosts, costs.ongoingCostsPortfolioOtherCosts) &&
        Objects.equals(this.ongoingCostsPortfolioTransactionCosts, costs.ongoingCostsPortfolioTransactionCosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingCarriedInterestFees, existingPerformanceFees, incidentalCostsPortfolioCarriedInterest, incidentalCostsPortfolioPerformanceFees, oneOffCostPortfolioEntryCost, oneOffCostPortfolioEntryCostAcquired, oneOffCostsPortfolioExitCostAt1Year, oneOffCostsPortfolioExitCostAtHalfRhp, oneOffCostsPortfolioExitCostAtRhp, oneOffCostsPortfolioSlidingExitCostIndicator, ongoingCostsPortfolioManagementCosts, ongoingCostsPortfolioOtherCosts, ongoingCostsPortfolioTransactionCosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Costs {\n");
    
    sb.append("    existingCarriedInterestFees: ").append(toIndentedString(existingCarriedInterestFees)).append("\n");
    sb.append("    existingPerformanceFees: ").append(toIndentedString(existingPerformanceFees)).append("\n");
    sb.append("    incidentalCostsPortfolioCarriedInterest: ").append(toIndentedString(incidentalCostsPortfolioCarriedInterest)).append("\n");
    sb.append("    incidentalCostsPortfolioPerformanceFees: ").append(toIndentedString(incidentalCostsPortfolioPerformanceFees)).append("\n");
    sb.append("    oneOffCostPortfolioEntryCost: ").append(toIndentedString(oneOffCostPortfolioEntryCost)).append("\n");
    sb.append("    oneOffCostPortfolioEntryCostAcquired: ").append(toIndentedString(oneOffCostPortfolioEntryCostAcquired)).append("\n");
    sb.append("    oneOffCostsPortfolioExitCostAt1Year: ").append(toIndentedString(oneOffCostsPortfolioExitCostAt1Year)).append("\n");
    sb.append("    oneOffCostsPortfolioExitCostAtHalfRhp: ").append(toIndentedString(oneOffCostsPortfolioExitCostAtHalfRhp)).append("\n");
    sb.append("    oneOffCostsPortfolioExitCostAtRhp: ").append(toIndentedString(oneOffCostsPortfolioExitCostAtRhp)).append("\n");
    sb.append("    oneOffCostsPortfolioSlidingExitCostIndicator: ").append(toIndentedString(oneOffCostsPortfolioSlidingExitCostIndicator)).append("\n");
    sb.append("    ongoingCostsPortfolioManagementCosts: ").append(toIndentedString(ongoingCostsPortfolioManagementCosts)).append("\n");
    sb.append("    ongoingCostsPortfolioOtherCosts: ").append(toIndentedString(ongoingCostsPortfolioOtherCosts)).append("\n");
    sb.append("    ongoingCostsPortfolioTransactionCosts: ").append(toIndentedString(ongoingCostsPortfolioTransactionCosts)).append("\n");
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

