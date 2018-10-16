package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessSettlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ProcessSettlement   {
  @JsonProperty("settlementStatusCode")
  private String settlementStatusCode = null;

  public ProcessSettlement settlementStatusCode(String settlementStatusCode) {
    this.settlementStatusCode = settlementStatusCode;
    return this;
  }

  /**
   * The new {Settlement}'s status. Refer to {listSettlementStatuses}
   * @return settlementStatusCode
  **/
  @ApiModelProperty(value = "The new {Settlement}'s status. Refer to {listSettlementStatuses}")


  public String getSettlementStatusCode() {
    return settlementStatusCode;
  }

  public void setSettlementStatusCode(String settlementStatusCode) {
    this.settlementStatusCode = settlementStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessSettlement processSettlement = (ProcessSettlement) o;
    return Objects.equals(this.settlementStatusCode, processSettlement.settlementStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessSettlement {\n");
    
    sb.append("    settlementStatusCode: ").append(toIndentedString(settlementStatusCode)).append("\n");
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

