package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.WeightedInstrumentFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {WeightedInstrumentFilter}. In each {WeightedInstrumentFilter}, the attribute {WeightedInstrumentFilter.weight} is ignored.
 */
@ApiModel(description = "A simple object composed of an array of {WeightedInstrumentFilter}. In each {WeightedInstrumentFilter}, the attribute {WeightedInstrumentFilter.weight} is ignored.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedCommonDateFilter   {
  @JsonProperty("instruments")
  @Valid
  private List<WeightedInstrumentFilter> instruments = null;

  public WeightedCommonDateFilter instruments(List<WeightedInstrumentFilter> instruments) {
    this.instruments = instruments;
    return this;
  }

  public WeightedCommonDateFilter addInstrumentsItem(WeightedInstrumentFilter instrumentsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedCommonDateFilter weightedCommonDateFilter = (WeightedCommonDateFilter) o;
    return Objects.equals(this.instruments, weightedCommonDateFilter.instruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedCommonDateFilter {\n");
    
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
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

