package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationalPortfolioPerformanceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HistoricalOperationalPerformanceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HistoricalOperationalPerformanceFilter   {
  @JsonProperty("operationalPortfolioPerformanceFilter")
  private OperationalPortfolioPerformanceFilter operationalPortfolioPerformanceFilter = null;

  @JsonProperty("performanceTypeCode")
  private String performanceTypeCode = null;

  public HistoricalOperationalPerformanceFilter operationalPortfolioPerformanceFilter(OperationalPortfolioPerformanceFilter operationalPortfolioPerformanceFilter) {
    this.operationalPortfolioPerformanceFilter = operationalPortfolioPerformanceFilter;
    return this;
  }

  /**
   * Get operationalPortfolioPerformanceFilter
   * @return operationalPortfolioPerformanceFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioPerformanceFilter getOperationalPortfolioPerformanceFilter() {
    return operationalPortfolioPerformanceFilter;
  }

  public void setOperationalPortfolioPerformanceFilter(OperationalPortfolioPerformanceFilter operationalPortfolioPerformanceFilter) {
    this.operationalPortfolioPerformanceFilter = operationalPortfolioPerformanceFilter;
  }

  public HistoricalOperationalPerformanceFilter performanceTypeCode(String performanceTypeCode) {
    this.performanceTypeCode = performanceTypeCode;
    return this;
  }

  /**
   * PerformanceType catalog (annual, acumulate, quarterly,...). Refer to {listPerformanceTypes}
   * @return performanceTypeCode
  **/
  @ApiModelProperty(value = "PerformanceType catalog (annual, acumulate, quarterly,...). Refer to {listPerformanceTypes}")


  public String getPerformanceTypeCode() {
    return performanceTypeCode;
  }

  public void setPerformanceTypeCode(String performanceTypeCode) {
    this.performanceTypeCode = performanceTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalOperationalPerformanceFilter historicalOperationalPerformanceFilter = (HistoricalOperationalPerformanceFilter) o;
    return Objects.equals(this.operationalPortfolioPerformanceFilter, historicalOperationalPerformanceFilter.operationalPortfolioPerformanceFilter) &&
        Objects.equals(this.performanceTypeCode, historicalOperationalPerformanceFilter.performanceTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalPortfolioPerformanceFilter, performanceTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalOperationalPerformanceFilter {\n");
    
    sb.append("    operationalPortfolioPerformanceFilter: ").append(toIndentedString(operationalPortfolioPerformanceFilter)).append("\n");
    sb.append("    performanceTypeCode: ").append(toIndentedString(performanceTypeCode)).append("\n");
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

