package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelativeStatisticFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RelativeStatisticFilter   {
  @JsonProperty("alpha")
  private NumberComparisonFilter alpha = null;

  @JsonProperty("beta")
  private NumberComparisonFilter beta = null;

  @JsonProperty("correlation")
  private NumberComparisonFilter correlation = null;

  @JsonProperty("infoRatio")
  private NumberComparisonFilter infoRatio = null;

  @JsonProperty("jesenAlpha")
  private NumberComparisonFilter jesenAlpha = null;

  @JsonProperty("r2")
  private NumberComparisonFilter r2 = null;

  @JsonProperty("trackingError")
  private NumberComparisonFilter trackingError = null;

  @JsonProperty("treynorRatio")
  private NumberComparisonFilter treynorRatio = null;

  public RelativeStatisticFilter alpha(NumberComparisonFilter alpha) {
    this.alpha = alpha;
    return this;
  }

  /**
   * Get alpha
   * @return alpha
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getAlpha() {
    return alpha;
  }

  public void setAlpha(NumberComparisonFilter alpha) {
    this.alpha = alpha;
  }

  public RelativeStatisticFilter beta(NumberComparisonFilter beta) {
    this.beta = beta;
    return this;
  }

  /**
   * Get beta
   * @return beta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getBeta() {
    return beta;
  }

  public void setBeta(NumberComparisonFilter beta) {
    this.beta = beta;
  }

  public RelativeStatisticFilter correlation(NumberComparisonFilter correlation) {
    this.correlation = correlation;
    return this;
  }

  /**
   * Get correlation
   * @return correlation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getCorrelation() {
    return correlation;
  }

  public void setCorrelation(NumberComparisonFilter correlation) {
    this.correlation = correlation;
  }

  public RelativeStatisticFilter infoRatio(NumberComparisonFilter infoRatio) {
    this.infoRatio = infoRatio;
    return this;
  }

  /**
   * Get infoRatio
   * @return infoRatio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getInfoRatio() {
    return infoRatio;
  }

  public void setInfoRatio(NumberComparisonFilter infoRatio) {
    this.infoRatio = infoRatio;
  }

  public RelativeStatisticFilter jesenAlpha(NumberComparisonFilter jesenAlpha) {
    this.jesenAlpha = jesenAlpha;
    return this;
  }

  /**
   * Get jesenAlpha
   * @return jesenAlpha
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getJesenAlpha() {
    return jesenAlpha;
  }

  public void setJesenAlpha(NumberComparisonFilter jesenAlpha) {
    this.jesenAlpha = jesenAlpha;
  }

  public RelativeStatisticFilter r2(NumberComparisonFilter r2) {
    this.r2 = r2;
    return this;
  }

  /**
   * Get r2
   * @return r2
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getR2() {
    return r2;
  }

  public void setR2(NumberComparisonFilter r2) {
    this.r2 = r2;
  }

  public RelativeStatisticFilter trackingError(NumberComparisonFilter trackingError) {
    this.trackingError = trackingError;
    return this;
  }

  /**
   * Get trackingError
   * @return trackingError
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getTrackingError() {
    return trackingError;
  }

  public void setTrackingError(NumberComparisonFilter trackingError) {
    this.trackingError = trackingError;
  }

  public RelativeStatisticFilter treynorRatio(NumberComparisonFilter treynorRatio) {
    this.treynorRatio = treynorRatio;
    return this;
  }

  /**
   * Get treynorRatio
   * @return treynorRatio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getTreynorRatio() {
    return treynorRatio;
  }

  public void setTreynorRatio(NumberComparisonFilter treynorRatio) {
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
    RelativeStatisticFilter relativeStatisticFilter = (RelativeStatisticFilter) o;
    return Objects.equals(this.alpha, relativeStatisticFilter.alpha) &&
        Objects.equals(this.beta, relativeStatisticFilter.beta) &&
        Objects.equals(this.correlation, relativeStatisticFilter.correlation) &&
        Objects.equals(this.infoRatio, relativeStatisticFilter.infoRatio) &&
        Objects.equals(this.jesenAlpha, relativeStatisticFilter.jesenAlpha) &&
        Objects.equals(this.r2, relativeStatisticFilter.r2) &&
        Objects.equals(this.trackingError, relativeStatisticFilter.trackingError) &&
        Objects.equals(this.treynorRatio, relativeStatisticFilter.treynorRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alpha, beta, correlation, infoRatio, jesenAlpha, r2, trackingError, treynorRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeStatisticFilter {\n");
    
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
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

