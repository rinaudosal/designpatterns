package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HistoricalPerformance;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {HistoricalPerformance} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {HistoricalPerformance} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HistoricalPerformancesAndPage   {
  @JsonProperty("benchmarkPerformances")
  @Valid
  private List<HistoricalPerformance> benchmarkPerformances = null;

  @JsonProperty("instrumentPerformances")
  @Valid
  private List<HistoricalPerformance> instrumentPerformances = null;

  @JsonProperty("page")
  private Page page = null;

  public HistoricalPerformancesAndPage benchmarkPerformances(List<HistoricalPerformance> benchmarkPerformances) {
    this.benchmarkPerformances = benchmarkPerformances;
    return this;
  }

  public HistoricalPerformancesAndPage addBenchmarkPerformancesItem(HistoricalPerformance benchmarkPerformancesItem) {
    if (this.benchmarkPerformances == null) {
      this.benchmarkPerformances = new ArrayList<>();
    }
    this.benchmarkPerformances.add(benchmarkPerformancesItem);
    return this;
  }

  /**
   * The array of {HistoricalPerformance}
   * @return benchmarkPerformances
  **/
  @ApiModelProperty(value = "The array of {HistoricalPerformance}")

  @Valid

  public List<HistoricalPerformance> getBenchmarkPerformances() {
    return benchmarkPerformances;
  }

  public void setBenchmarkPerformances(List<HistoricalPerformance> benchmarkPerformances) {
    this.benchmarkPerformances = benchmarkPerformances;
  }

  public HistoricalPerformancesAndPage instrumentPerformances(List<HistoricalPerformance> instrumentPerformances) {
    this.instrumentPerformances = instrumentPerformances;
    return this;
  }

  public HistoricalPerformancesAndPage addInstrumentPerformancesItem(HistoricalPerformance instrumentPerformancesItem) {
    if (this.instrumentPerformances == null) {
      this.instrumentPerformances = new ArrayList<>();
    }
    this.instrumentPerformances.add(instrumentPerformancesItem);
    return this;
  }

  /**
   * Get instrumentPerformances
   * @return instrumentPerformances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<HistoricalPerformance> getInstrumentPerformances() {
    return instrumentPerformances;
  }

  public void setInstrumentPerformances(List<HistoricalPerformance> instrumentPerformances) {
    this.instrumentPerformances = instrumentPerformances;
  }

  public HistoricalPerformancesAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalPerformancesAndPage historicalPerformancesAndPage = (HistoricalPerformancesAndPage) o;
    return Objects.equals(this.benchmarkPerformances, historicalPerformancesAndPage.benchmarkPerformances) &&
        Objects.equals(this.instrumentPerformances, historicalPerformancesAndPage.instrumentPerformances) &&
        Objects.equals(this.page, historicalPerformancesAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkPerformances, instrumentPerformances, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalPerformancesAndPage {\n");
    
    sb.append("    benchmarkPerformances: ").append(toIndentedString(benchmarkPerformances)).append("\n");
    sb.append("    instrumentPerformances: ").append(toIndentedString(instrumentPerformances)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

