package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Benchmark;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Benchmark} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Benchmark} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BenchmarkAndPage   {
  @JsonProperty("benchmarks")
  @Valid
  private List<Benchmark> benchmarks = null;

  @JsonProperty("page")
  private Page page = null;

  public BenchmarkAndPage benchmarks(List<Benchmark> benchmarks) {
    this.benchmarks = benchmarks;
    return this;
  }

  public BenchmarkAndPage addBenchmarksItem(Benchmark benchmarksItem) {
    if (this.benchmarks == null) {
      this.benchmarks = new ArrayList<>();
    }
    this.benchmarks.add(benchmarksItem);
    return this;
  }

  /**
   * The array of {Benchmark}
   * @return benchmarks
  **/
  @ApiModelProperty(value = "The array of {Benchmark}")

  @Valid

  public List<Benchmark> getBenchmarks() {
    return benchmarks;
  }

  public void setBenchmarks(List<Benchmark> benchmarks) {
    this.benchmarks = benchmarks;
  }

  public BenchmarkAndPage page(Page page) {
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
    BenchmarkAndPage benchmarkAndPage = (BenchmarkAndPage) o;
    return Objects.equals(this.benchmarks, benchmarkAndPage.benchmarks) &&
        Objects.equals(this.page, benchmarkAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarks, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkAndPage {\n");
    
    sb.append("    benchmarks: ").append(toIndentedString(benchmarks)).append("\n");
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

