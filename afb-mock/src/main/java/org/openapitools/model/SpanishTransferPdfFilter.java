package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SpanishTransferLocation;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferPdfFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferPdfFilter   {
  @JsonProperty("destinationLocation")
  private SpanishTransferLocation destinationLocation = null;

  @JsonProperty("sourceLocation")
  private SpanishTransferLocation sourceLocation = null;

  public SpanishTransferPdfFilter destinationLocation(SpanishTransferLocation destinationLocation) {
    this.destinationLocation = destinationLocation;
    return this;
  }

  /**
   * Get destinationLocation
   * @return destinationLocation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferLocation getDestinationLocation() {
    return destinationLocation;
  }

  public void setDestinationLocation(SpanishTransferLocation destinationLocation) {
    this.destinationLocation = destinationLocation;
  }

  public SpanishTransferPdfFilter sourceLocation(SpanishTransferLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

  /**
   * Get sourceLocation
   * @return sourceLocation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferLocation getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(SpanishTransferLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferPdfFilter spanishTransferPdfFilter = (SpanishTransferPdfFilter) o;
    return Objects.equals(this.destinationLocation, spanishTransferPdfFilter.destinationLocation) &&
        Objects.equals(this.sourceLocation, spanishTransferPdfFilter.sourceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationLocation, sourceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferPdfFilter {\n");
    
    sb.append("    destinationLocation: ").append(toIndentedString(destinationLocation)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
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

