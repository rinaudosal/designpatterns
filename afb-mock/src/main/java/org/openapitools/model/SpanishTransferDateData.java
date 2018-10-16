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
 * SpanishTransferDateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferDateData   {
  @JsonProperty("destinationDate")
  private OffsetDateTime destinationDate = null;

  @JsonProperty("sourceDate")
  private OffsetDateTime sourceDate = null;

  public SpanishTransferDateData destinationDate(OffsetDateTime destinationDate) {
    this.destinationDate = destinationDate;
    return this;
  }

  /**
   * The date selected as destination date
   * @return destinationDate
  **/
  @ApiModelProperty(value = "The date selected as destination date")

  @Valid

  public OffsetDateTime getDestinationDate() {
    return destinationDate;
  }

  public void setDestinationDate(OffsetDateTime destinationDate) {
    this.destinationDate = destinationDate;
  }

  public SpanishTransferDateData sourceDate(OffsetDateTime sourceDate) {
    this.sourceDate = sourceDate;
    return this;
  }

  /**
   * The date selected as source date
   * @return sourceDate
  **/
  @ApiModelProperty(value = "The date selected as source date")

  @Valid

  public OffsetDateTime getSourceDate() {
    return sourceDate;
  }

  public void setSourceDate(OffsetDateTime sourceDate) {
    this.sourceDate = sourceDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferDateData spanishTransferDateData = (SpanishTransferDateData) o;
    return Objects.equals(this.destinationDate, spanishTransferDateData.destinationDate) &&
        Objects.equals(this.sourceDate, spanishTransferDateData.sourceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationDate, sourceDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferDateData {\n");
    
    sb.append("    destinationDate: ").append(toIndentedString(destinationDate)).append("\n");
    sb.append("    sourceDate: ").append(toIndentedString(sourceDate)).append("\n");
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

