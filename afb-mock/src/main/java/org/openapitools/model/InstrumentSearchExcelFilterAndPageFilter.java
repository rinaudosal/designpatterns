package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InstrumentSearchFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchExcelFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchExcelFilterAndPageFilter   {
  @JsonProperty("columns")
  @Valid
  private List<String> columns = null;

  @JsonProperty("instrumentSearch")
  private InstrumentSearchFilter instrumentSearch = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public InstrumentSearchExcelFilterAndPageFilter columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public InstrumentSearchExcelFilterAndPageFilter addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * An array to specify which columns must be returned into the generated excel file
   * @return columns
  **/
  @ApiModelProperty(value = "An array to specify which columns must be returned into the generated excel file")


  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public InstrumentSearchExcelFilterAndPageFilter instrumentSearch(InstrumentSearchFilter instrumentSearch) {
    this.instrumentSearch = instrumentSearch;
    return this;
  }

  /**
   * Get instrumentSearch
   * @return instrumentSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchFilter getInstrumentSearch() {
    return instrumentSearch;
  }

  public void setInstrumentSearch(InstrumentSearchFilter instrumentSearch) {
    this.instrumentSearch = instrumentSearch;
  }

  public InstrumentSearchExcelFilterAndPageFilter page(PageFilter page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPage() {
    return page;
  }

  public void setPage(PageFilter page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentSearchExcelFilterAndPageFilter instrumentSearchExcelFilterAndPageFilter = (InstrumentSearchExcelFilterAndPageFilter) o;
    return Objects.equals(this.columns, instrumentSearchExcelFilterAndPageFilter.columns) &&
        Objects.equals(this.instrumentSearch, instrumentSearchExcelFilterAndPageFilter.instrumentSearch) &&
        Objects.equals(this.page, instrumentSearchExcelFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, instrumentSearch, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchExcelFilterAndPageFilter {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    instrumentSearch: ").append(toIndentedString(instrumentSearch)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

