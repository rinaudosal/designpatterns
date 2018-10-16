package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DistributorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DistributorFilter   {
  @JsonProperty("depositaryId")
  private Long depositaryId = null;

  public DistributorFilter depositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
    return this;
  }

  /**
   * The Id of the {Depositary}. The ids can be extracted from the {listDepositary} method
   * @return depositaryId
  **/
  @ApiModelProperty(value = "The Id of the {Depositary}. The ids can be extracted from the {listDepositary} method")


  public Long getDepositaryId() {
    return depositaryId;
  }

  public void setDepositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributorFilter distributorFilter = (DistributorFilter) o;
    return Objects.equals(this.depositaryId, distributorFilter.depositaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositaryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributorFilter {\n");
    
    sb.append("    depositaryId: ").append(toIndentedString(depositaryId)).append("\n");
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

