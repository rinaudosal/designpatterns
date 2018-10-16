package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.StatisticFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Currency} codes and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Currency} codes and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StatisticRawFilter   {
  @JsonProperty("periods")
  @Valid
  private List<String> periods = null;

  @JsonProperty("statisticFilter")
  private StatisticFilter statisticFilter = null;

  @JsonProperty("statistical")
  @Valid
  private List<String> statistical = null;

  public StatisticRawFilter periods(List<String> periods) {
    this.periods = periods;
    return this;
  }

  public StatisticRawFilter addPeriodsItem(String periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * diferent periods available
   * @return periods
  **/
  @ApiModelProperty(value = "diferent periods available")


  public List<String> getPeriods() {
    return periods;
  }

  public void setPeriods(List<String> periods) {
    this.periods = periods;
  }

  public StatisticRawFilter statisticFilter(StatisticFilter statisticFilter) {
    this.statisticFilter = statisticFilter;
    return this;
  }

  /**
   * Get statisticFilter
   * @return statisticFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatisticFilter getStatisticFilter() {
    return statisticFilter;
  }

  public void setStatisticFilter(StatisticFilter statisticFilter) {
    this.statisticFilter = statisticFilter;
  }

  public StatisticRawFilter statistical(List<String> statistical) {
    this.statistical = statistical;
    return this;
  }

  public StatisticRawFilter addStatisticalItem(String statisticalItem) {
    if (this.statistical == null) {
      this.statistical = new ArrayList<>();
    }
    this.statistical.add(statisticalItem);
    return this;
  }

  /**
   * diferent statistical available
   * @return statistical
  **/
  @ApiModelProperty(value = "diferent statistical available")


  public List<String> getStatistical() {
    return statistical;
  }

  public void setStatistical(List<String> statistical) {
    this.statistical = statistical;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticRawFilter statisticRawFilter = (StatisticRawFilter) o;
    return Objects.equals(this.periods, statisticRawFilter.periods) &&
        Objects.equals(this.statisticFilter, statisticRawFilter.statisticFilter) &&
        Objects.equals(this.statistical, statisticRawFilter.statistical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periods, statisticFilter, statistical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticRawFilter {\n");
    
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    statisticFilter: ").append(toIndentedString(statisticFilter)).append("\n");
    sb.append("    statistical: ").append(toIndentedString(statistical)).append("\n");
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

