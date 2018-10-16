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
 * HoldingBreakdownFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HoldingBreakdownFilter   {
  @JsonProperty("comparison")
  private NumberComparisonFilter comparison = null;

  @JsonProperty("holding")
  private String holding = null;

  @JsonProperty("inTopTen")
  private Boolean inTopTen = null;

  public HoldingBreakdownFilter comparison(NumberComparisonFilter comparison) {
    this.comparison = comparison;
    return this;
  }

  /**
   * Get comparison
   * @return comparison
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getComparison() {
    return comparison;
  }

  public void setComparison(NumberComparisonFilter comparison) {
    this.comparison = comparison;
  }

  public HoldingBreakdownFilter holding(String holding) {
    this.holding = holding;
    return this;
  }

  /**
   * Get holding
   * @return holding
  **/
  @ApiModelProperty(value = "")


  public String getHolding() {
    return holding;
  }

  public void setHolding(String holding) {
    this.holding = holding;
  }

  public HoldingBreakdownFilter inTopTen(Boolean inTopTen) {
    this.inTopTen = inTopTen;
    return this;
  }

  /**
   * Field to search only in top ten or all breakdown
   * @return inTopTen
  **/
  @ApiModelProperty(value = "Field to search only in top ten or all breakdown")


  public Boolean getInTopTen() {
    return inTopTen;
  }

  public void setInTopTen(Boolean inTopTen) {
    this.inTopTen = inTopTen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingBreakdownFilter holdingBreakdownFilter = (HoldingBreakdownFilter) o;
    return Objects.equals(this.comparison, holdingBreakdownFilter.comparison) &&
        Objects.equals(this.holding, holdingBreakdownFilter.holding) &&
        Objects.equals(this.inTopTen, holdingBreakdownFilter.inTopTen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparison, holding, inTopTen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingBreakdownFilter {\n");
    
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
    sb.append("    inTopTen: ").append(toIndentedString(inTopTen)).append("\n");
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

