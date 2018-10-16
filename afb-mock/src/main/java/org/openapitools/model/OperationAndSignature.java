package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Operation;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationAndSignature   {
  @JsonProperty("operation")
  private Operation operation = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public OperationAndSignature operation(Operation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Operation getOperation() {
    return operation;
  }

  public void setOperation(Operation operation) {
    this.operation = operation;
  }

  public OperationAndSignature signature(Signature signature) {
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
    OperationAndSignature operationAndSignature = (OperationAndSignature) o;
    return Objects.equals(this.operation, operationAndSignature.operation) &&
        Objects.equals(this.signature, operationAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationAndSignature {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

