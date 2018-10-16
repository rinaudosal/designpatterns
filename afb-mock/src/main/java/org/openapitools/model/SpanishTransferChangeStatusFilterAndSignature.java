package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Signature;
import org.openapitools.model.SpanishTransferChangeStatusFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferChangeStatusFilterAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferChangeStatusFilterAndSignature   {
  @JsonProperty("filter")
  private SpanishTransferChangeStatusFilter filter = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public SpanishTransferChangeStatusFilterAndSignature filter(SpanishTransferChangeStatusFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferChangeStatusFilter getFilter() {
    return filter;
  }

  public void setFilter(SpanishTransferChangeStatusFilter filter) {
    this.filter = filter;
  }

  public SpanishTransferChangeStatusFilterAndSignature signature(Signature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Signature getSignature() {
    return signature;
  }

  public void setSignature(Signature signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferChangeStatusFilterAndSignature spanishTransferChangeStatusFilterAndSignature = (SpanishTransferChangeStatusFilterAndSignature) o;
    return Objects.equals(this.filter, spanishTransferChangeStatusFilterAndSignature.filter) &&
        Objects.equals(this.signature, spanishTransferChangeStatusFilterAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferChangeStatusFilterAndSignature {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

