package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferIdsAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferIdsAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("spanishTransferIds")
  @Valid
  private List<Long> spanishTransferIds = null;

  public SpanishTransferIdsAndSignature signature(Signature signature) {
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

  public SpanishTransferIdsAndSignature spanishTransferIds(List<Long> spanishTransferIds) {
    this.spanishTransferIds = spanishTransferIds;
    return this;
  }

  public SpanishTransferIdsAndSignature addSpanishTransferIdsItem(Long spanishTransferIdsItem) {
    if (this.spanishTransferIds == null) {
      this.spanishTransferIds = new ArrayList<>();
    }
    this.spanishTransferIds.add(spanishTransferIdsItem);
    return this;
  }

  /**
   * The array of ids of {SpanishTransfer}
   * @return spanishTransferIds
  **/
  @ApiModelProperty(value = "The array of ids of {SpanishTransfer}")


  public List<Long> getSpanishTransferIds() {
    return spanishTransferIds;
  }

  public void setSpanishTransferIds(List<Long> spanishTransferIds) {
    this.spanishTransferIds = spanishTransferIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferIdsAndSignature spanishTransferIdsAndSignature = (SpanishTransferIdsAndSignature) o;
    return Objects.equals(this.signature, spanishTransferIdsAndSignature.signature) &&
        Objects.equals(this.spanishTransferIds, spanishTransferIdsAndSignature.spanishTransferIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, spanishTransferIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferIdsAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    spanishTransferIds: ").append(toIndentedString(spanishTransferIds)).append("\n");
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

