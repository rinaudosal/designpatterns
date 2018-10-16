package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DestinationIdentification;
import org.openapitools.model.TransactionData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Transfer   {
  @JsonProperty("destinationIndentification")
  private DestinationIdentification destinationIndentification = null;

  @JsonProperty("sourceIdentification")
  private TransactionData sourceIdentification = null;

  public Transfer destinationIndentification(DestinationIdentification destinationIndentification) {
    this.destinationIndentification = destinationIndentification;
    return this;
  }

  /**
   * Get destinationIndentification
   * @return destinationIndentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DestinationIdentification getDestinationIndentification() {
    return destinationIndentification;
  }

  public void setDestinationIndentification(DestinationIdentification destinationIndentification) {
    this.destinationIndentification = destinationIndentification;
  }

  public Transfer sourceIdentification(TransactionData sourceIdentification) {
    this.sourceIdentification = sourceIdentification;
    return this;
  }

  /**
   * Get sourceIdentification
   * @return sourceIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionData getSourceIdentification() {
    return sourceIdentification;
  }

  public void setSourceIdentification(TransactionData sourceIdentification) {
    this.sourceIdentification = sourceIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.destinationIndentification, transfer.destinationIndentification) &&
        Objects.equals(this.sourceIdentification, transfer.sourceIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationIndentification, sourceIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    
    sb.append("    destinationIndentification: ").append(toIndentedString(destinationIndentification)).append("\n");
    sb.append("    sourceIdentification: ").append(toIndentedString(sourceIdentification)).append("\n");
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

