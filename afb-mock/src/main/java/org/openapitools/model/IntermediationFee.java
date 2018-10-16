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
 * IntermediationFee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class IntermediationFee   {
  @JsonProperty("basisPoints")
  private Double basisPoints = null;

  @JsonProperty("feePercentage")
  private Double feePercentage = null;

  @JsonProperty("instrument")
  private ResourceReference instrument = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   */
  public enum InstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

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

  public IntermediationFee basisPoints(Double basisPoints) {
    this.basisPoints = basisPoints;
    return this;
  }

  /**
   * Get basisPoints
   * @return basisPoints
  **/
  @ApiModelProperty(value = "")


  public Double getBasisPoints() {
    return basisPoints;
  }

  public void setBasisPoints(Double basisPoints) {
    this.basisPoints = basisPoints;
  }

  public IntermediationFee feePercentage(Double feePercentage) {
    this.feePercentage = feePercentage;
    return this;
  }

  /**
   * Get feePercentage
   * @return feePercentage
  **/
  @ApiModelProperty(value = "")


  public Double getFeePercentage() {
    return feePercentage;
  }

  public void setFeePercentage(Double feePercentage) {
    this.feePercentage = feePercentage;
  }

  public IntermediationFee instrument(ResourceReference instrument) {
    this.instrument = instrument;
    return this;
  }

  /**
   * Get instrument
   * @return instrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getInstrument() {
    return instrument;
  }

  public void setInstrument(ResourceReference instrument) {
    this.instrument = instrument;
  }

  public IntermediationFee instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return instrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntermediationFee intermediationFee = (IntermediationFee) o;
    return Objects.equals(this.basisPoints, intermediationFee.basisPoints) &&
        Objects.equals(this.feePercentage, intermediationFee.feePercentage) &&
        Objects.equals(this.instrument, intermediationFee.instrument) &&
        Objects.equals(this.instrumentType, intermediationFee.instrumentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basisPoints, feePercentage, instrument, instrumentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntermediationFee {\n");
    
    sb.append("    basisPoints: ").append(toIndentedString(basisPoints)).append("\n");
    sb.append("    feePercentage: ").append(toIndentedString(feePercentage)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
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

