package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BenchmarkFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {BenchmarkFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {BenchmarkFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BenchmarkFilterAndPageFilter   {
  @JsonProperty("benchmark")
  private BenchmarkFilter benchmark = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public BenchmarkFilterAndPageFilter benchmark(BenchmarkFilter benchmark) {
    this.benchmark = benchmark;
    return this;
  }

  /**
   * Get benchmark
   * @return benchmark
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BenchmarkFilter getBenchmark() {
    return benchmark;
  }

  public void setBenchmark(BenchmarkFilter benchmark) {
    this.benchmark = benchmark;
  }

  public BenchmarkFilterAndPageFilter page(PageFilter page) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenchmarkFilterAndPageFilter benchmarkFilterAndPageFilter = (BenchmarkFilterAndPageFilter) o;
    return Objects.equals(this.benchmark, benchmarkFilterAndPageFilter.benchmark) &&
        Objects.equals(this.page, benchmarkFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmark, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkFilterAndPageFilter {\n");
    
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
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

