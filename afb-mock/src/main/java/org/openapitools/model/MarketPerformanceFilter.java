package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PerformanceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed by a {PerformanceFilter} and a market identifier.
 */
@ApiModel(description = "A simple object composed by a {PerformanceFilter} and a market identifier.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MarketPerformanceFilter   {
  @JsonProperty("marketId")
  private Long marketId = null;

  @JsonProperty("performanceFilter")
  private PerformanceFilter performanceFilter = null;

  public MarketPerformanceFilter marketId(Long marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * The Id of the {Market}
   * @return marketId
  **/
  @ApiModelProperty(value = "The Id of the {Market}")


  public Long getMarketId() {
    return marketId;
  }

  public void setMarketId(Long marketId) {
    this.marketId = marketId;
  }

  public MarketPerformanceFilter performanceFilter(PerformanceFilter performanceFilter) {
    this.performanceFilter = performanceFilter;
    return this;
  }

  /**
   * Get performanceFilter
   * @return performanceFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PerformanceFilter getPerformanceFilter() {
    return performanceFilter;
  }

  public void setPerformanceFilter(PerformanceFilter performanceFilter) {
    this.performanceFilter = performanceFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketPerformanceFilter marketPerformanceFilter = (MarketPerformanceFilter) o;
    return Objects.equals(this.marketId, marketPerformanceFilter.marketId) &&
        Objects.equals(this.performanceFilter, marketPerformanceFilter.performanceFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, performanceFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketPerformanceFilter {\n");
    
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    performanceFilter: ").append(toIndentedString(performanceFilter)).append("\n");
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

