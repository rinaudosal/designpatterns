package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about the shares of the {Operation}.
 */
@ApiModel(description = "This object keeps information about the shares of the {Operation}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationSharesData   {
  @JsonProperty("requestedShares")
  private Double requestedShares = null;

  public OperationSharesData requestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
    return this;
  }

  /**
   * Shares requested in the {Operation}
   * @return requestedShares
  **/
  @ApiModelProperty(value = "Shares requested in the {Operation}")


  public Double getRequestedShares() {
    return requestedShares;
  }

  public void setRequestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationSharesData operationSharesData = (OperationSharesData) o;
    return Objects.equals(this.requestedShares, operationSharesData.requestedShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationSharesData {\n");
    
    sb.append("    requestedShares: ").append(toIndentedString(requestedShares)).append("\n");
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

