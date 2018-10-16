package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ContractFilter;
import org.openapitools.model.CursorFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ContractFilterAndCursorFilter   {
  @JsonProperty("contractFilter")
  private ContractFilter contractFilter = null;

  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  public ContractFilterAndCursorFilter contractFilter(ContractFilter contractFilter) {
    this.contractFilter = contractFilter;
    return this;
  }

  /**
   * Get contractFilter
   * @return contractFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContractFilter getContractFilter() {
    return contractFilter;
  }

  public void setContractFilter(ContractFilter contractFilter) {
    this.contractFilter = contractFilter;
  }

  public ContractFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
    this.cursorFilter = cursorFilter;
    return this;
  }

  /**
   * Get cursorFilter
   * @return cursorFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CursorFilter getCursorFilter() {
    return cursorFilter;
  }

  public void setCursorFilter(CursorFilter cursorFilter) {
    this.cursorFilter = cursorFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractFilterAndCursorFilter contractFilterAndCursorFilter = (ContractFilterAndCursorFilter) o;
    return Objects.equals(this.contractFilter, contractFilterAndCursorFilter.contractFilter) &&
        Objects.equals(this.cursorFilter, contractFilterAndCursorFilter.cursorFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractFilter, cursorFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractFilterAndCursorFilter {\n");
    
    sb.append("    contractFilter: ").append(toIndentedString(contractFilter)).append("\n");
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
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

