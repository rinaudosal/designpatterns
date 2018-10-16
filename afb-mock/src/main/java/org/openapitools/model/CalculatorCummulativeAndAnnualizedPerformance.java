package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CalculatorPerformance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalculatorCummulativeAndAnnualizedPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CalculatorCummulativeAndAnnualizedPerformance   {
  @JsonProperty("annualizedPerformance")
  private CalculatorPerformance annualizedPerformance = null;

  @JsonProperty("cummulativePerformance")
  private CalculatorPerformance cummulativePerformance = null;

  public CalculatorCummulativeAndAnnualizedPerformance annualizedPerformance(CalculatorPerformance annualizedPerformance) {
    this.annualizedPerformance = annualizedPerformance;
    return this;
  }

  /**
   * Get annualizedPerformance
   * @return annualizedPerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CalculatorPerformance getAnnualizedPerformance() {
    return annualizedPerformance;
  }

  public void setAnnualizedPerformance(CalculatorPerformance annualizedPerformance) {
    this.annualizedPerformance = annualizedPerformance;
  }

  public CalculatorCummulativeAndAnnualizedPerformance cummulativePerformance(CalculatorPerformance cummulativePerformance) {
    this.cummulativePerformance = cummulativePerformance;
    return this;
  }

  /**
   * Get cummulativePerformance
   * @return cummulativePerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CalculatorPerformance getCummulativePerformance() {
    return cummulativePerformance;
  }

  public void setCummulativePerformance(CalculatorPerformance cummulativePerformance) {
    this.cummulativePerformance = cummulativePerformance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatorCummulativeAndAnnualizedPerformance calculatorCummulativeAndAnnualizedPerformance = (CalculatorCummulativeAndAnnualizedPerformance) o;
    return Objects.equals(this.annualizedPerformance, calculatorCummulativeAndAnnualizedPerformance.annualizedPerformance) &&
        Objects.equals(this.cummulativePerformance, calculatorCummulativeAndAnnualizedPerformance.cummulativePerformance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualizedPerformance, cummulativePerformance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatorCummulativeAndAnnualizedPerformance {\n");
    
    sb.append("    annualizedPerformance: ").append(toIndentedString(annualizedPerformance)).append("\n");
    sb.append("    cummulativePerformance: ").append(toIndentedString(cummulativePerformance)).append("\n");
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

