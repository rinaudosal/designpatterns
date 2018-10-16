package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.RiskControlAlarmFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {RiskControlAlarmFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of either a {RiskControlAlarmFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskControlAlarmFilterAndPageFilter   {
  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  @JsonProperty("riskControlAlarmFilter")
  private RiskControlAlarmFilter riskControlAlarmFilter = null;

  public RiskControlAlarmFilterAndPageFilter pageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
    return this;
  }

  /**
   * Get pageFilter
   * @return pageFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPageFilter() {
    return pageFilter;
  }

  public void setPageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
  }

  public RiskControlAlarmFilterAndPageFilter riskControlAlarmFilter(RiskControlAlarmFilter riskControlAlarmFilter) {
    this.riskControlAlarmFilter = riskControlAlarmFilter;
    return this;
  }

  /**
   * Get riskControlAlarmFilter
   * @return riskControlAlarmFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RiskControlAlarmFilter getRiskControlAlarmFilter() {
    return riskControlAlarmFilter;
  }

  public void setRiskControlAlarmFilter(RiskControlAlarmFilter riskControlAlarmFilter) {
    this.riskControlAlarmFilter = riskControlAlarmFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskControlAlarmFilterAndPageFilter riskControlAlarmFilterAndPageFilter = (RiskControlAlarmFilterAndPageFilter) o;
    return Objects.equals(this.pageFilter, riskControlAlarmFilterAndPageFilter.pageFilter) &&
        Objects.equals(this.riskControlAlarmFilter, riskControlAlarmFilterAndPageFilter.riskControlAlarmFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageFilter, riskControlAlarmFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskControlAlarmFilterAndPageFilter {\n");
    
    sb.append("    pageFilter: ").append(toIndentedString(pageFilter)).append("\n");
    sb.append("    riskControlAlarmFilter: ").append(toIndentedString(riskControlAlarmFilter)).append("\n");
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

