package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CashAccountAliasFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashAccountAliasFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashAccountAliasFilterAndPageFilter   {
  @JsonProperty("cashAccountAliasFilter")
  private CashAccountAliasFilter cashAccountAliasFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public CashAccountAliasFilterAndPageFilter cashAccountAliasFilter(CashAccountAliasFilter cashAccountAliasFilter) {
    this.cashAccountAliasFilter = cashAccountAliasFilter;
    return this;
  }

  /**
   * Get cashAccountAliasFilter
   * @return cashAccountAliasFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CashAccountAliasFilter getCashAccountAliasFilter() {
    return cashAccountAliasFilter;
  }

  public void setCashAccountAliasFilter(CashAccountAliasFilter cashAccountAliasFilter) {
    this.cashAccountAliasFilter = cashAccountAliasFilter;
  }

  public CashAccountAliasFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    CashAccountAliasFilterAndPageFilter cashAccountAliasFilterAndPageFilter = (CashAccountAliasFilterAndPageFilter) o;
    return Objects.equals(this.cashAccountAliasFilter, cashAccountAliasFilterAndPageFilter.cashAccountAliasFilter) &&
        Objects.equals(this.pageFilter, cashAccountAliasFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashAccountAliasFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccountAliasFilterAndPageFilter {\n");
    
    sb.append("    cashAccountAliasFilter: ").append(toIndentedString(cashAccountAliasFilter)).append("\n");
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

