package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PageFilter;
import org.openapitools.model.StatisticRawFilter;
import org.openapitools.model.WeightedInstrumentFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {StatisticFilter}, a {WeightedInstrumentFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {StatisticFilter}, a {WeightedInstrumentFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedStatisticRawFilterAndPageFilter   {
  @JsonProperty("instruments")
  @Valid
  private List<WeightedInstrumentFilter> instruments = null;

  @JsonProperty("marketId")
  private Long marketId = null;

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("statistic")
  private StatisticRawFilter statistic = null;

  public WeightedStatisticRawFilterAndPageFilter instruments(List<WeightedInstrumentFilter> instruments) {
    this.instruments = instruments;
    return this;
  }

  public WeightedStatisticRawFilterAndPageFilter addInstrumentsItem(WeightedInstrumentFilter instrumentsItem) {
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

  public WeightedStatisticRawFilterAndPageFilter marketId(Long marketId) {
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

  public WeightedStatisticRawFilterAndPageFilter page(PageFilter page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPage() {
    return page;
  }

  public void setPage(PageFilter page) {
    this.page = page;
  }

  public WeightedStatisticRawFilterAndPageFilter statistic(StatisticRawFilter statistic) {
    this.statistic = statistic;
    return this;
  }

  /**
   * Get statistic
   * @return statistic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatisticRawFilter getStatistic() {
    return statistic;
  }

  public void setStatistic(StatisticRawFilter statistic) {
    this.statistic = statistic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedStatisticRawFilterAndPageFilter weightedStatisticRawFilterAndPageFilter = (WeightedStatisticRawFilterAndPageFilter) o;
    return Objects.equals(this.instruments, weightedStatisticRawFilterAndPageFilter.instruments) &&
        Objects.equals(this.marketId, weightedStatisticRawFilterAndPageFilter.marketId) &&
        Objects.equals(this.page, weightedStatisticRawFilterAndPageFilter.page) &&
        Objects.equals(this.statistic, weightedStatisticRawFilterAndPageFilter.statistic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruments, marketId, page, statistic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedStatisticRawFilterAndPageFilter {\n");
    
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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
