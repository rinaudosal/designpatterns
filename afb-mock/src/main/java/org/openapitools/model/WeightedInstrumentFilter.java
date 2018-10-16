package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeightedInstrumentFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedInstrumentFilter   {
  @JsonProperty("instrumentId")
  private String instrumentId = null;

  /**
   * Indicates whether to search for a {Fund} or an {ETF} or a {Portfolio} or a {Benchmark} or a {ReferenceBenchmark}
   */
  public enum InstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF"),
    
    SIMULATED_PORTFOLIO("SIMULATED_PORTFOLIO"),
    
    THEORETICAL_PORTFOLIO("THEORETICAL_PORTFOLIO"),
    
    BENCHMARK("BENCHMARK"),
    
    REFERENCE_BENCHMARK("REFERENCE_BENCHMARK");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstrumentTypeEnum fromValue(String text) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("instrumentType")
  private InstrumentTypeEnum instrumentType = null;

  @JsonProperty("weight")
  private Double weight = null;

  public WeightedInstrumentFilter instrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
    return this;
  }

  /**
   * The Id of the instrument to look for
   * @return instrumentId
  **/
  @ApiModelProperty(value = "The Id of the instrument to look for")


  public String getInstrumentId() {
    return instrumentId;
  }

  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }

  public WeightedInstrumentFilter instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Indicates whether to search for a {Fund} or an {ETF} or a {Portfolio} or a {Benchmark} or a {ReferenceBenchmark}
   * @return instrumentType
  **/
  @ApiModelProperty(value = "Indicates whether to search for a {Fund} or an {ETF} or a {Portfolio} or a {Benchmark} or a {ReferenceBenchmark}")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }

  public WeightedInstrumentFilter weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


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
    WeightedInstrumentFilter weightedInstrumentFilter = (WeightedInstrumentFilter) o;
    return Objects.equals(this.instrumentId, weightedInstrumentFilter.instrumentId) &&
        Objects.equals(this.instrumentType, weightedInstrumentFilter.instrumentType) &&
        Objects.equals(this.weight, weightedInstrumentFilter.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentId, instrumentType, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedInstrumentFilter {\n");
    
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
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

