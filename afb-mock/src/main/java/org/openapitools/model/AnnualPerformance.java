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
 * AnnualPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AnnualPerformance   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("history1")
  private Double history1 = null;

  @JsonProperty("history2")
  private Double history2 = null;

  @JsonProperty("history3")
  private Double history3 = null;

  @JsonProperty("history4")
  private Double history4 = null;

  @JsonProperty("history5")
  private Double history5 = null;

  @JsonProperty("ytd")
  private Double ytd = null;

  public AnnualPerformance calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public AnnualPerformance history1(Double history1) {
    this.history1 = history1;
    return this;
  }

  /**
   * History 1
   * @return history1
  **/
  @ApiModelProperty(value = "History 1")


  public Double getHistory1() {
    return history1;
  }

  public void setHistory1(Double history1) {
    this.history1 = history1;
  }

  public AnnualPerformance history2(Double history2) {
    this.history2 = history2;
    return this;
  }

  /**
   * History 2
   * @return history2
  **/
  @ApiModelProperty(value = "History 2")


  public Double getHistory2() {
    return history2;
  }

  public void setHistory2(Double history2) {
    this.history2 = history2;
  }

  public AnnualPerformance history3(Double history3) {
    this.history3 = history3;
    return this;
  }

  /**
   * History 3
   * @return history3
  **/
  @ApiModelProperty(value = "History 3")


  public Double getHistory3() {
    return history3;
  }

  public void setHistory3(Double history3) {
    this.history3 = history3;
  }

  public AnnualPerformance history4(Double history4) {
    this.history4 = history4;
    return this;
  }

  /**
   * History 4
   * @return history4
  **/
  @ApiModelProperty(value = "History 4")


  public Double getHistory4() {
    return history4;
  }

  public void setHistory4(Double history4) {
    this.history4 = history4;
  }

  public AnnualPerformance history5(Double history5) {
    this.history5 = history5;
    return this;
  }

  /**
   * History 5
   * @return history5
  **/
  @ApiModelProperty(value = "History 5")


  public Double getHistory5() {
    return history5;
  }

  public void setHistory5(Double history5) {
    this.history5 = history5;
  }

  public AnnualPerformance ytd(Double ytd) {
    this.ytd = ytd;
    return this;
  }

  /**
   * Ytd
   * @return ytd
  **/
  @ApiModelProperty(value = "Ytd")


  public Double getYtd() {
    return ytd;
  }

  public void setYtd(Double ytd) {
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
    AnnualPerformance annualPerformance = (AnnualPerformance) o;
    return Objects.equals(this.calculationPeriod, annualPerformance.calculationPeriod) &&
        Objects.equals(this.history1, annualPerformance.history1) &&
        Objects.equals(this.history2, annualPerformance.history2) &&
        Objects.equals(this.history3, annualPerformance.history3) &&
        Objects.equals(this.history4, annualPerformance.history4) &&
        Objects.equals(this.history5, annualPerformance.history5) &&
        Objects.equals(this.ytd, annualPerformance.ytd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, history1, history2, history3, history4, history5, ytd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnualPerformance {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
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

