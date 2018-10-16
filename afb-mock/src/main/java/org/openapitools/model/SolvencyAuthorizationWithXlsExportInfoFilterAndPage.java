package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.SolvencyAuthorizationSearchFilter;
import org.openapitools.model.XlsExportInfoFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed a {XlsExportInfoFilter}, a {SolvencyAuthorizationSearchFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed a {XlsExportInfoFilter}, a {SolvencyAuthorizationSearchFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationWithXlsExportInfoFilterAndPage   {
  @JsonProperty("filter")
  private SolvencyAuthorizationSearchFilter filter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  @JsonProperty("xlsExportInfo")
  private XlsExportInfoFilter xlsExportInfo = null;

  public SolvencyAuthorizationWithXlsExportInfoFilterAndPage filter(SolvencyAuthorizationSearchFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SolvencyAuthorizationSearchFilter getFilter() {
    return filter;
  }

  public void setFilter(SolvencyAuthorizationSearchFilter filter) {
    this.filter = filter;
  }

  public SolvencyAuthorizationWithXlsExportInfoFilterAndPage pageFilter(PageFilter pageFilter) {
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

  public SolvencyAuthorizationWithXlsExportInfoFilterAndPage xlsExportInfo(XlsExportInfoFilter xlsExportInfo) {
    this.xlsExportInfo = xlsExportInfo;
    return this;
  }

  /**
   * Get xlsExportInfo
   * @return xlsExportInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public XlsExportInfoFilter getXlsExportInfo() {
    return xlsExportInfo;
  }

  public void setXlsExportInfo(XlsExportInfoFilter xlsExportInfo) {
    this.xlsExportInfo = xlsExportInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyAuthorizationWithXlsExportInfoFilterAndPage solvencyAuthorizationWithXlsExportInfoFilterAndPage = (SolvencyAuthorizationWithXlsExportInfoFilterAndPage) o;
    return Objects.equals(this.filter, solvencyAuthorizationWithXlsExportInfoFilterAndPage.filter) &&
        Objects.equals(this.pageFilter, solvencyAuthorizationWithXlsExportInfoFilterAndPage.pageFilter) &&
        Objects.equals(this.xlsExportInfo, solvencyAuthorizationWithXlsExportInfoFilterAndPage.xlsExportInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageFilter, xlsExportInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationWithXlsExportInfoFilterAndPage {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pageFilter: ").append(toIndentedString(pageFilter)).append("\n");
    sb.append("    xlsExportInfo: ").append(toIndentedString(xlsExportInfo)).append("\n");
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

