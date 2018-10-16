package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the rebalancing type on catalog rebalancingType
 */
@ApiModel(description = "Defines the rebalancing type on catalog rebalancingType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebalancingFilter   {
  @JsonProperty("rebalancingTypeCode")
  private String rebalancingTypeCode = null;

  public RebalancingFilter rebalancingTypeCode(String rebalancingTypeCode) {
    this.rebalancingTypeCode = rebalancingTypeCode;
    return this;
  }

  /**
   * Get rebalancingTypeCode
   * @return rebalancingTypeCode
  **/
  @ApiModelProperty(value = "")


  public String getRebalancingTypeCode() {
    return rebalancingTypeCode;
  }

  public void setRebalancingTypeCode(String rebalancingTypeCode) {
    this.rebalancingTypeCode = rebalancingTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebalancingFilter rebalancingFilter = (RebalancingFilter) o;
    return Objects.equals(this.rebalancingTypeCode, rebalancingFilter.rebalancingTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rebalancingTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebalancingFilter {\n");
    
    sb.append("    rebalancingTypeCode: ").append(toIndentedString(rebalancingTypeCode)).append("\n");
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

