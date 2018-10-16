package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Composition;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComposedComposition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ComposedComposition   {
  @JsonProperty("benchmarkComposition")
  private Composition benchmarkComposition = null;

  @JsonProperty("composition")
  private Composition composition = null;

  public ComposedComposition benchmarkComposition(Composition benchmarkComposition) {
    this.benchmarkComposition = benchmarkComposition;
    return this;
  }

  /**
   * Get benchmarkComposition
   * @return benchmarkComposition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Composition getBenchmarkComposition() {
    return benchmarkComposition;
  }

  public void setBenchmarkComposition(Composition benchmarkComposition) {
    this.benchmarkComposition = benchmarkComposition;
  }

  public ComposedComposition composition(Composition composition) {
    this.composition = composition;
    return this;
  }

  /**
   * Get composition
   * @return composition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Composition getComposition() {
    return composition;
  }

  public void setComposition(Composition composition) {
    this.composition = composition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComposedComposition composedComposition = (ComposedComposition) o;
    return Objects.equals(this.benchmarkComposition, composedComposition.benchmarkComposition) &&
        Objects.equals(this.composition, composedComposition.composition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkComposition, composition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComposedComposition {\n");
    
    sb.append("    benchmarkComposition: ").append(toIndentedString(benchmarkComposition)).append("\n");
    sb.append("    composition: ").append(toIndentedString(composition)).append("\n");
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

