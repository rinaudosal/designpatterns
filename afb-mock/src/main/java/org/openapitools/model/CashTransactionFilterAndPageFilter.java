package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CashTransactionFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransactionFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransactionFilterAndPageFilter   {
  @JsonProperty("cashTransactionFilter")
  private CashTransactionFilter cashTransactionFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public CashTransactionFilterAndPageFilter cashTransactionFilter(CashTransactionFilter cashTransactionFilter) {
    this.cashTransactionFilter = cashTransactionFilter;
    return this;
  }

  /**
   * Get cashTransactionFilter
   * @return cashTransactionFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CashTransactionFilter getCashTransactionFilter() {
    return cashTransactionFilter;
  }

  public void setCashTransactionFilter(CashTransactionFilter cashTransactionFilter) {
    this.cashTransactionFilter = cashTransactionFilter;
  }

  public CashTransactionFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    CashTransactionFilterAndPageFilter cashTransactionFilterAndPageFilter = (CashTransactionFilterAndPageFilter) o;
    return Objects.equals(this.cashTransactionFilter, cashTransactionFilterAndPageFilter.cashTransactionFilter) &&
        Objects.equals(this.pageFilter, cashTransactionFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashTransactionFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionFilterAndPageFilter {\n");
    
    sb.append("    cashTransactionFilter: ").append(toIndentedString(cashTransactionFilter)).append("\n");
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

