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
 * SpanishTransferLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferLocation   {
  @JsonProperty("location")
  private String location = null;

  @JsonProperty("locationDate")
  private OffsetDateTime locationDate = null;

  public SpanishTransferLocation location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The location received as input. It will be included in the PDF
   * @return location
  **/
  @ApiModelProperty(value = "The location received as input. It will be included in the PDF")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SpanishTransferLocation locationDate(OffsetDateTime locationDate) {
    this.locationDate = locationDate;
    return this;
  }

  /**
   * The date received as input. It will be included in the PDF
   * @return locationDate
  **/
  @ApiModelProperty(value = "The date received as input. It will be included in the PDF")

  @Valid

  public OffsetDateTime getLocationDate() {
    return locationDate;
  }

  public void setLocationDate(OffsetDateTime locationDate) {
    this.locationDate = locationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferLocation spanishTransferLocation = (SpanishTransferLocation) o;
    return Objects.equals(this.location, spanishTransferLocation.location) &&
        Objects.equals(this.locationDate, spanishTransferLocation.locationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, locationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferLocation {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationDate: ").append(toIndentedString(locationDate)).append("\n");
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

