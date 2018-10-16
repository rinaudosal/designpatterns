package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;BenchmarkFilter&#x60; allows the {Consumer} to filter the results that match the required characteristics.
 */
@ApiModel(description = "The `BenchmarkFilter` allows the {Consumer} to filter the results that match the required characteristics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BenchmarkFilter   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tickers")
  @Valid
  private List<String> tickers = null;

  public BenchmarkFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The {Benchmark.name} to match.
   * @return name
  **/
  @ApiModelProperty(value = "The {Benchmark.name} to match.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BenchmarkFilter tickers(List<String> tickers) {
    this.tickers = tickers;
    return this;
  }

  public BenchmarkFilter addTickersItem(String tickersItem) {
    if (this.tickers == null) {
      this.tickers = new ArrayList<>();
    }
    this.tickers.add(tickersItem);
    return this;
  }

  /**
   * Get tickers
   * @return tickers
  **/
  @ApiModelProperty(value = "")


  public List<String> getTickers() {
    return tickers;
  }

  public void setTickers(List<String> tickers) {
    this.tickers = tickers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenchmarkFilter benchmarkFilter = (BenchmarkFilter) o;
    return Objects.equals(this.name, benchmarkFilter.name) &&
        Objects.equals(this.tickers, benchmarkFilter.tickers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tickers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
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

