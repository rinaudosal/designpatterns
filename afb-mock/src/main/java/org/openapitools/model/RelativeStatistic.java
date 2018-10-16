package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CalculationPeriod;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;RelativeStatistic&#x60; object contains the statistics related to an instrument compared to a benchmark.
 */
@ApiModel(description = "The `RelativeStatistic` object contains the statistics related to an instrument compared to a benchmark.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RelativeStatistic   {
  @JsonProperty("actPremium")
  private Double actPremium = null;

  @JsonProperty("alpha")
  private Double alpha = null;

  @JsonProperty("beta")
  private Double beta = null;

  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("correlation")
  private Double correlation = null;

  @JsonProperty("infoRatio")
  private Double infoRatio = null;

  @JsonProperty("jesenAlpha")
  private Double jesenAlpha = null;

  @JsonProperty("r2")
  private Double r2 = null;

  @JsonProperty("trackingError")
  private Double trackingError = null;

  @JsonProperty("treynorRatio")
  private Double treynorRatio = null;

  public RelativeStatistic actPremium(Double actPremium) {
    this.actPremium = actPremium;
    return this;
  }

  /**
   * Get actPremium
   * @return actPremium
  **/
  @ApiModelProperty(value = "")


  public Double getActPremium() {
    return actPremium;
  }

  public void setActPremium(Double actPremium) {
    this.actPremium = actPremium;
  }

  public RelativeStatistic alpha(Double alpha) {
    this.alpha = alpha;
    return this;
  }

  /**
   * Alpha, often considered the active return on an investment, gauges the performance of an investment against a market index used as a benchmark, since they are often considered to represent the market's movement as a whole. The excess returns of a fund relative to the return of a benchmark index is the fund's alpha.
   * @return alpha
  **/
  @ApiModelProperty(value = "Alpha, often considered the active return on an investment, gauges the performance of an investment against a market index used as a benchmark, since they are often considered to represent the market's movement as a whole. The excess returns of a fund relative to the return of a benchmark index is the fund's alpha.")


  public Double getAlpha() {
    return alpha;
  }

  public void setAlpha(Double alpha) {
    this.alpha = alpha;
  }

  public RelativeStatistic beta(Double beta) {
    this.beta = beta;
    return this;
  }

  /**
   * Beta is a measure of the volatility, or systematic risk, of a security or a portfolio in comparison to the market as a whole.
   * @return beta
  **/
  @ApiModelProperty(value = "Beta is a measure of the volatility, or systematic risk, of a security or a portfolio in comparison to the market as a whole.")


  public Double getBeta() {
    return beta;
  }

  public void setBeta(Double beta) {
    this.beta = beta;
  }

  public RelativeStatistic calculationPeriod(CalculationPeriod calculationPeriod) {
    this.calculationPeriod = calculationPeriod;
    return this;
  }

  /**
   * Get calculationPeriod
   * @return calculationPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CalculationPeriod getCalculationPeriod() {
    return calculationPeriod;
  }

  public void setCalculationPeriod(CalculationPeriod calculationPeriod) {
    this.calculationPeriod = calculationPeriod;
  }

  public RelativeStatistic correlation(Double correlation) {
    this.correlation = correlation;
    return this;
  }

  /**
   * Correlation is a statistical measure of how two securities move in relation to each other.
   * @return correlation
  **/
  @ApiModelProperty(value = "Correlation is a statistical measure of how two securities move in relation to each other.")


  public Double getCorrelation() {
    return correlation;
  }

  public void setCorrelation(Double correlation) {
    this.correlation = correlation;
  }

  public RelativeStatistic infoRatio(Double infoRatio) {
    this.infoRatio = infoRatio;
    return this;
  }

  /**
   * The information ratio (IR) is a ratio of portfolio returns above the returns of a benchmark (usually an index) to the volatility of those returns. The information ratio (IR) measures a portfolio manager's ability to generate excess returns relative to a benchmark, but also attempts to identify the consistency of the investor.
   * @return infoRatio
  **/
  @ApiModelProperty(value = "The information ratio (IR) is a ratio of portfolio returns above the returns of a benchmark (usually an index) to the volatility of those returns. The information ratio (IR) measures a portfolio manager's ability to generate excess returns relative to a benchmark, but also attempts to identify the consistency of the investor.")


  public Double getInfoRatio() {
    return infoRatio;
  }

  public void setInfoRatio(Double infoRatio) {
    this.infoRatio = infoRatio;
  }

  public RelativeStatistic jesenAlpha(Double jesenAlpha) {
    this.jesenAlpha = jesenAlpha;
    return this;
  }

  /**
   * The Jensen's measure is a risk-adjusted performance measure that represents the average return on a portfolio over and above that predicted by the capital asset pricing model (CAPM), given the portfolio's beta and the average market return.
   * @return jesenAlpha
  **/
  @ApiModelProperty(value = "The Jensen's measure is a risk-adjusted performance measure that represents the average return on a portfolio over and above that predicted by the capital asset pricing model (CAPM), given the portfolio's beta and the average market return.")


  public Double getJesenAlpha() {
    return jesenAlpha;
  }

  public void setJesenAlpha(Double jesenAlpha) {
    this.jesenAlpha = jesenAlpha;
  }

  public RelativeStatistic r2(Double r2) {
    this.r2 = r2;
    return this;
  }

  /**
   * R-squared is a statistical measure that represents the percentage of a fund or security's movements that can be explained by movements in a benchmark index.
   * @return r2
  **/
  @ApiModelProperty(value = "R-squared is a statistical measure that represents the percentage of a fund or security's movements that can be explained by movements in a benchmark index.")


  public Double getR2() {
    return r2;
  }

  public void setR2(Double r2) {
    this.r2 = r2;
  }

  public RelativeStatistic trackingError(Double trackingError) {
    this.trackingError = trackingError;
    return this;
  }

  /**
   * A tracking error is the divergence between the price behavior of a position or a portfolio and the price behavior of a benchmark.
   * @return trackingError
  **/
  @ApiModelProperty(value = "A tracking error is the divergence between the price behavior of a position or a portfolio and the price behavior of a benchmark.")


  public Double getTrackingError() {
    return trackingError;
  }

  public void setTrackingError(Double trackingError) {
    this.trackingError = trackingError;
  }

  public RelativeStatistic treynorRatio(Double treynorRatio) {
    this.treynorRatio = treynorRatio;
    return this;
  }

  /**
   * A ratio developed by Jack Treynor that measures returns earned in excess of that which could have been earned on a riskless investment per each unit of market risk.
   * @return treynorRatio
  **/
  @ApiModelProperty(value = "A ratio developed by Jack Treynor that measures returns earned in excess of that which could have been earned on a riskless investment per each unit of market risk.")


  public Double getTreynorRatio() {
    return treynorRatio;
  }

  public void setTreynorRatio(Double treynorRatio) {
    this.treynorRatio = treynorRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeStatistic relativeStatistic = (RelativeStatistic) o;
    return Objects.equals(this.actPremium, relativeStatistic.actPremium) &&
        Objects.equals(this.alpha, relativeStatistic.alpha) &&
        Objects.equals(this.beta, relativeStatistic.beta) &&
        Objects.equals(this.calculationPeriod, relativeStatistic.calculationPeriod) &&
        Objects.equals(this.correlation, relativeStatistic.correlation) &&
        Objects.equals(this.infoRatio, relativeStatistic.infoRatio) &&
        Objects.equals(this.jesenAlpha, relativeStatistic.jesenAlpha) &&
        Objects.equals(this.r2, relativeStatistic.r2) &&
        Objects.equals(this.trackingError, relativeStatistic.trackingError) &&
        Objects.equals(this.treynorRatio, relativeStatistic.treynorRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actPremium, alpha, beta, calculationPeriod, correlation, infoRatio, jesenAlpha, r2, trackingError, treynorRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeStatistic {\n");
    
    sb.append("    actPremium: ").append(toIndentedString(actPremium)).append("\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    correlation: ").append(toIndentedString(correlation)).append("\n");
    sb.append("    infoRatio: ").append(toIndentedString(infoRatio)).append("\n");
    sb.append("    jesenAlpha: ").append(toIndentedString(jesenAlpha)).append("\n");
    sb.append("    r2: ").append(toIndentedString(r2)).append("\n");
    sb.append("    trackingError: ").append(toIndentedString(trackingError)).append("\n");
    sb.append("    treynorRatio: ").append(toIndentedString(treynorRatio)).append("\n");
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

