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
 * QuarterlyPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class QuarterlyPerformance   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("quarter1")
  private Double quarter1 = null;

  @JsonProperty("quarter2")
  private Double quarter2 = null;

  @JsonProperty("quarter3")
  private Double quarter3 = null;

  @JsonProperty("quarter4")
  private Double quarter4 = null;

  @JsonProperty("year")
  private Double year = null;

  public QuarterlyPerformance calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public QuarterlyPerformance quarter1(Double quarter1) {
    this.quarter1 = quarter1;
    return this;
  }

  /**
   * Quarter 1
   * @return quarter1
  **/
  @ApiModelProperty(value = "Quarter 1")


  public Double getQuarter1() {
    return quarter1;
  }

  public void setQuarter1(Double quarter1) {
    this.quarter1 = quarter1;
  }

  public QuarterlyPerformance quarter2(Double quarter2) {
    this.quarter2 = quarter2;
    return this;
  }

  /**
   * Quarter 2
   * @return quarter2
  **/
  @ApiModelProperty(value = "Quarter 2")


  public Double getQuarter2() {
    return quarter2;
  }

  public void setQuarter2(Double quarter2) {
    this.quarter2 = quarter2;
  }

  public QuarterlyPerformance quarter3(Double quarter3) {
    this.quarter3 = quarter3;
    return this;
  }

  /**
   * Quarter 3
   * @return quarter3
  **/
  @ApiModelProperty(value = "Quarter 3")


  public Double getQuarter3() {
    return quarter3;
  }

  public void setQuarter3(Double quarter3) {
    this.quarter3 = quarter3;
  }

  public QuarterlyPerformance quarter4(Double quarter4) {
    this.quarter4 = quarter4;
    return this;
  }

  /**
   * Quarter 4
   * @return quarter4
  **/
  @ApiModelProperty(value = "Quarter 4")


  public Double getQuarter4() {
    return quarter4;
  }

  public void setQuarter4(Double quarter4) {
    this.quarter4 = quarter4;
  }

  public QuarterlyPerformance year(Double year) {
    this.year = year;
    return this;
  }

  /**
   * Year
   * @return year
  **/
  @ApiModelProperty(value = "Year")


  public Double getYear() {
    return year;
  }

  public void setYear(Double year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarterlyPerformance quarterlyPerformance = (QuarterlyPerformance) o;
    return Objects.equals(this.calculationPeriod, quarterlyPerformance.calculationPeriod) &&
        Objects.equals(this.quarter1, quarterlyPerformance.quarter1) &&
        Objects.equals(this.quarter2, quarterlyPerformance.quarter2) &&
        Objects.equals(this.quarter3, quarterlyPerformance.quarter3) &&
        Objects.equals(this.quarter4, quarterlyPerformance.quarter4) &&
        Objects.equals(this.year, quarterlyPerformance.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, quarter1, quarter2, quarter3, quarter4, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarterlyPerformance {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    quarter1: ").append(toIndentedString(quarter1)).append("\n");
    sb.append("    quarter2: ").append(toIndentedString(quarter2)).append("\n");
    sb.append("    quarter3: ").append(toIndentedString(quarter3)).append("\n");
    sb.append("    quarter4: ").append(toIndentedString(quarter4)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

