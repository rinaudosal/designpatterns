package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CashTransferFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransferFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransferFilterAndPageFilter   {
  @JsonProperty("cashTransferFilter")
  private CashTransferFilter cashTransferFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public CashTransferFilterAndPageFilter cashTransferFilter(CashTransferFilter cashTransferFilter) {
    this.cashTransferFilter = cashTransferFilter;
    return this;
  }

  /**
   * Get cashTransferFilter
   * @return cashTransferFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CashTransferFilter getCashTransferFilter() {
    return cashTransferFilter;
  }

  public void setCashTransferFilter(CashTransferFilter cashTransferFilter) {
    this.cashTransferFilter = cashTransferFilter;
  }

  public CashTransferFilterAndPageFilter pageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
    return this;
  }

  /**
   * Get pageFilter
   * @return pageFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPageFilter() {
    return pageFilter;
  }

  public void setPageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransferFilterAndPageFilter cashTransferFilterAndPageFilter = (CashTransferFilterAndPageFilter) o;
    return Objects.equals(this.cashTransferFilter, cashTransferFilterAndPageFilter.cashTransferFilter) &&
        Objects.equals(this.pageFilter, cashTransferFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashTransferFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransferFilterAndPageFilter {\n");
    
    sb.append("    cashTransferFilter: ").append(toIndentedString(cashTransferFilter)).append("\n");
    sb.append("    pageFilter: ").append(toIndentedString(pageFilter)).append("\n");
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

