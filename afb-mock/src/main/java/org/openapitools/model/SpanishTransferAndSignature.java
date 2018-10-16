package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Signature;
import org.openapitools.model.SpanishTransfer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("spanishTransfer")
  private SpanishTransfer spanishTransfer = null;

  public SpanishTransferAndSignature signature(Signature signature) {
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

  public SpanishTransferAndSignature spanishTransfer(SpanishTransfer spanishTransfer) {
    this.spanishTransfer = spanishTransfer;
    return this;
  }

  /**
   * Get spanishTransfer
   * @return spanishTransfer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransfer getSpanishTransfer() {
    return spanishTransfer;
  }

  public void setSpanishTransfer(SpanishTransfer spanishTransfer) {
    this.spanishTransfer = spanishTransfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferAndSignature spanishTransferAndSignature = (SpanishTransferAndSignature) o;
    return Objects.equals(this.signature, spanishTransferAndSignature.signature) &&
        Objects.equals(this.spanishTransfer, spanishTransferAndSignature.spanishTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, spanishTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    spanishTransfer: ").append(toIndentedString(spanishTransfer)).append("\n");
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

