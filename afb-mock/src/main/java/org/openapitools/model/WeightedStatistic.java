package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Statistic;
import org.openapitools.model.WeightedResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeightedStatistic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedStatistic   {
  @JsonProperty("instrument")
  private WeightedResourceReference instrument = null;

  @JsonProperty("statistic")
  private Statistic statistic = null;

  public WeightedStatistic instrument(WeightedResourceReference instrument) {
    this.instrument = instrument;
    return this;
  }

  /**
   * Get instrument
   * @return instrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WeightedResourceReference getInstrument() {
    return instrument;
  }

  public void setInstrument(WeightedResourceReference instrument) {
    this.instrument = instrument;
  }

  public WeightedStatistic statistic(Statistic statistic) {
    this.statistic = statistic;
    return this;
  }

  /**
   * Get statistic
   * @return statistic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Statistic getStatistic() {
    return statistic;
  }

  public void setStatistic(Statistic statistic) {
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
    WeightedStatistic weightedStatistic = (WeightedStatistic) o;
    return Objects.equals(this.instrument, weightedStatistic.instrument) &&
        Objects.equals(this.statistic, weightedStatistic.statistic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument, statistic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedStatistic {\n");
    
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
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

