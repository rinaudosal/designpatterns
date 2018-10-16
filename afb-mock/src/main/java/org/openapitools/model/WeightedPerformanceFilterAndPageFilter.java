package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PerformanceFilterAndPageFilter;
import org.openapitools.model.WeightedInstrumentFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {WeightedInstrumentFilter} and a {PerformanceFilterAndPageFilter}.
 */
@ApiModel(description = "A simple object composed of a {WeightedInstrumentFilter} and a {PerformanceFilterAndPageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedPerformanceFilterAndPageFilter   {
  @JsonProperty("filter")
  private PerformanceFilterAndPageFilter filter = null;

  @JsonProperty("instruments")
  @Valid
  private List<WeightedInstrumentFilter> instruments = null;

  @JsonProperty("marketId")
  private Long marketId = null;

  public WeightedPerformanceFilterAndPageFilter filter(PerformanceFilterAndPageFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PerformanceFilterAndPageFilter getFilter() {
    return filter;
  }

  public void setFilter(PerformanceFilterAndPageFilter filter) {
    this.filter = filter;
  }

  public WeightedPerformanceFilterAndPageFilter instruments(List<WeightedInstrumentFilter> instruments) {
    this.instruments = instruments;
    return this;
  }

  public WeightedPerformanceFilterAndPageFilter addInstrumentsItem(WeightedInstrumentFilter instrumentsItem) {
    if (this.instruments == null) {
      this.instruments = new ArrayList<>();
    }
    this.instruments.add(instrumentsItem);
    return this;
  }

  /**
   * Get instruments
   * @return instruments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WeightedInstrumentFilter> getInstruments() {
    return instruments;
  }

  public void setInstruments(List<WeightedInstrumentFilter> instruments) {
    this.instruments = instruments;
  }

  public WeightedPerformanceFilterAndPageFilter marketId(Long marketId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedPerformanceFilterAndPageFilter weightedPerformanceFilterAndPageFilter = (WeightedPerformanceFilterAndPageFilter) o;
    return Objects.equals(this.filter, weightedPerformanceFilterAndPageFilter.filter) &&
        Objects.equals(this.instruments, weightedPerformanceFilterAndPageFilter.instruments) &&
        Objects.equals(this.marketId, weightedPerformanceFilterAndPageFilter.marketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, instruments, marketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedPerformanceFilterAndPageFilter {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
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
