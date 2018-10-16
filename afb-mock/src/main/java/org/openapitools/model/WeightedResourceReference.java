package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeightedResourceReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedResourceReference   {
  /**
   * Indicates the type of instrument. It can be either a {Fund} or an {ETF} or a {Portfolio} or a {Benchmark} or a {ReferenceBenchmark}
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

  @JsonProperty("reference")
  private ResourceReference reference = null;

  @JsonProperty("weight")
  private Double weight = null;

  public WeightedResourceReference instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Indicates the type of instrument. It can be either a {Fund} or an {ETF} or a {Portfolio} or a {Benchmark} or a {ReferenceBenchmark}
   * @return instrumentType
  **/
  @ApiModelProperty(value = "Indicates the type of instrument. It can be either a {Fund} or an {ETF} or a {Portfolio} or a {Benchmark} or a {ReferenceBenchmark}")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }

  public WeightedResourceReference reference(ResourceReference reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getReference() {
    return reference;
  }

  public void setReference(ResourceReference reference) {
    this.reference = reference;
  }

  public WeightedResourceReference weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * The weight of that specific instrument in the specific {Comparison}
   * @return weight
  **/
  @ApiModelProperty(value = "The weight of that specific instrument in the specific {Comparison}")


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
    WeightedResourceReference weightedResourceReference = (WeightedResourceReference) o;
    return Objects.equals(this.instrumentType, weightedResourceReference.instrumentType) &&
        Objects.equals(this.reference, weightedResourceReference.reference) &&
        Objects.equals(this.weight, weightedResourceReference.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentType, reference, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedResourceReference {\n");
    
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

