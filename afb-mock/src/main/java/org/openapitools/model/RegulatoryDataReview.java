package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegulatoryDataReview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RegulatoryDataReview   {
  @JsonProperty("instrumentsUnderRegulation")
  private Long instrumentsUnderRegulation = null;

  @JsonProperty("regulatoryDataCode")
  private String regulatoryDataCode = null;

  @JsonProperty("trend")
  private Double trend = null;

  @JsonProperty("valueDate")
  private OffsetDateTime valueDate = null;

  public RegulatoryDataReview instrumentsUnderRegulation(Long instrumentsUnderRegulation) {
    this.instrumentsUnderRegulation = instrumentsUnderRegulation;
    return this;
  }

  /**
   * Returns the total number of {Instrument}s under this regulation into the platform
   * @return instrumentsUnderRegulation
  **/
  @ApiModelProperty(value = "Returns the total number of {Instrument}s under this regulation into the platform")


  public Long getInstrumentsUnderRegulation() {
    return instrumentsUnderRegulation;
  }

  public void setInstrumentsUnderRegulation(Long instrumentsUnderRegulation) {
    this.instrumentsUnderRegulation = instrumentsUnderRegulation;
  }

  public RegulatoryDataReview regulatoryDataCode(String regulatoryDataCode) {
    this.regulatoryDataCode = regulatoryDataCode;
    return this;
  }

  /**
   * Refers to {listRegulations}
   * @return regulatoryDataCode
  **/
  @ApiModelProperty(value = "Refers to {listRegulations}")


  public String getRegulatoryDataCode() {
    return regulatoryDataCode;
  }

  public void setRegulatoryDataCode(String regulatoryDataCode) {
    this.regulatoryDataCode = regulatoryDataCode;
  }

  public RegulatoryDataReview trend(Double trend) {
    this.trend = trend;
    return this;
  }

  /**
   * Returns a percentage that expresses the trend of the number of instruments under this regulation into the platform
   * @return trend
  **/
  @ApiModelProperty(value = "Returns a percentage that expresses the trend of the number of instruments under this regulation into the platform")


  public Double getTrend() {
    return trend;
  }

  public void setTrend(Double trend) {
    this.trend = trend;
  }

  public RegulatoryDataReview valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The date when returned data were calculated
   * @return valueDate
  **/
  @ApiModelProperty(value = "The date when returned data were calculated")

  @Valid

  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatoryDataReview regulatoryDataReview = (RegulatoryDataReview) o;
    return Objects.equals(this.instrumentsUnderRegulation, regulatoryDataReview.instrumentsUnderRegulation) &&
        Objects.equals(this.regulatoryDataCode, regulatoryDataReview.regulatoryDataCode) &&
        Objects.equals(this.trend, regulatoryDataReview.trend) &&
        Objects.equals(this.valueDate, regulatoryDataReview.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentsUnderRegulation, regulatoryDataCode, trend, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDataReview {\n");
    
    sb.append("    instrumentsUnderRegulation: ").append(toIndentedString(instrumentsUnderRegulation)).append("\n");
    sb.append("    regulatoryDataCode: ").append(toIndentedString(regulatoryDataCode)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

