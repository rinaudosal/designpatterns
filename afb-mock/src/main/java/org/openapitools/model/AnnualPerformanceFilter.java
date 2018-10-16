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
 * AnnualPerformanceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AnnualPerformanceFilter   {
  @JsonProperty("history1")
  private NumberComparisonFilter history1 = null;

  @JsonProperty("history2")
  private NumberComparisonFilter history2 = null;

  @JsonProperty("history3")
  private NumberComparisonFilter history3 = null;

  @JsonProperty("history4")
  private NumberComparisonFilter history4 = null;

  @JsonProperty("history5")
  private NumberComparisonFilter history5 = null;

  @JsonProperty("ytd")
  private NumberComparisonFilter ytd = null;

  public AnnualPerformanceFilter history1(NumberComparisonFilter history1) {
    this.history1 = history1;
    return this;
  }

  /**
   * Get history1
   * @return history1
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getHistory1() {
    return history1;
  }

  public void setHistory1(NumberComparisonFilter history1) {
    this.history1 = history1;
  }

  public AnnualPerformanceFilter history2(NumberComparisonFilter history2) {
    this.history2 = history2;
    return this;
  }

  /**
   * Get history2
   * @return history2
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getHistory2() {
    return history2;
  }

  public void setHistory2(NumberComparisonFilter history2) {
    this.history2 = history2;
  }

  public AnnualPerformanceFilter history3(NumberComparisonFilter history3) {
    this.history3 = history3;
    return this;
  }

  /**
   * Get history3
   * @return history3
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getHistory3() {
    return history3;
  }

  public void setHistory3(NumberComparisonFilter history3) {
    this.history3 = history3;
  }

  public AnnualPerformanceFilter history4(NumberComparisonFilter history4) {
    this.history4 = history4;
    return this;
  }

  /**
   * Get history4
   * @return history4
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getHistory4() {
    return history4;
  }

  public void setHistory4(NumberComparisonFilter history4) {
    this.history4 = history4;
  }

  public AnnualPerformanceFilter history5(NumberComparisonFilter history5) {
    this.history5 = history5;
    return this;
  }

  /**
   * Get history5
   * @return history5
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getHistory5() {
    return history5;
  }

  public void setHistory5(NumberComparisonFilter history5) {
    this.history5 = history5;
  }

  public AnnualPerformanceFilter ytd(NumberComparisonFilter ytd) {
    this.ytd = ytd;
    return this;
  }

  /**
   * Get ytd
   * @return ytd
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getYtd() {
    return ytd;
  }

  public void setYtd(NumberComparisonFilter ytd) {
    this.ytd = ytd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnualPerformanceFilter annualPerformanceFilter = (AnnualPerformanceFilter) o;
    return Objects.equals(this.history1, annualPerformanceFilter.history1) &&
        Objects.equals(this.history2, annualPerformanceFilter.history2) &&
        Objects.equals(this.history3, annualPerformanceFilter.history3) &&
        Objects.equals(this.history4, annualPerformanceFilter.history4) &&
        Objects.equals(this.history5, annualPerformanceFilter.history5) &&
        Objects.equals(this.ytd, annualPerformanceFilter.ytd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history1, history2, history3, history4, history5, ytd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnualPerformanceFilter {\n");
    
    sb.append("    history1: ").append(toIndentedString(history1)).append("\n");
    sb.append("    history2: ").append(toIndentedString(history2)).append("\n");
    sb.append("    history3: ").append(toIndentedString(history3)).append("\n");
    sb.append("    history4: ").append(toIndentedString(history4)).append("\n");
    sb.append("    history5: ").append(toIndentedString(history5)).append("\n");
    sb.append("    ytd: ").append(toIndentedString(ytd)).append("\n");
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

