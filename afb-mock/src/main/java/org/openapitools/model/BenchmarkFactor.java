package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BenchmarkFactor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BenchmarkFactor   {
  @JsonProperty("benchmark")
  private ResourceReference benchmark = null;

  @JsonProperty("weight")
  private Double weight = null;

  public BenchmarkFactor benchmark(ResourceReference benchmark) {
    this.benchmark = benchmark;
    return this;
  }

  /**
   * Get benchmark
   * @return benchmark
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getBenchmark() {
    return benchmark;
  }

  public void setBenchmark(ResourceReference benchmark) {
    this.benchmark = benchmark;
  }

  public BenchmarkFactor weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * This factor's weight in the related {CompositeIndex}
   * @return weight
  **/
  @ApiModelProperty(value = "This factor's weight in the related {CompositeIndex}")


  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenchmarkFactor benchmarkFactor = (BenchmarkFactor) o;
    return Objects.equals(this.benchmark, benchmarkFactor.benchmark) &&
        Objects.equals(this.weight, benchmarkFactor.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmark, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkFactor {\n");
    
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

