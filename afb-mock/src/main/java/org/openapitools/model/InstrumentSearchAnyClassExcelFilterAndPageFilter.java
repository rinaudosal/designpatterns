package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InstrumentSearchAnyClassExcelFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchAnyClassExcelFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchAnyClassExcelFilterAndPageFilter   {
  @JsonProperty("instrumentSearchAnyClassExcelFilter")
  private InstrumentSearchAnyClassExcelFilter instrumentSearchAnyClassExcelFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public InstrumentSearchAnyClassExcelFilterAndPageFilter instrumentSearchAnyClassExcelFilter(InstrumentSearchAnyClassExcelFilter instrumentSearchAnyClassExcelFilter) {
    this.instrumentSearchAnyClassExcelFilter = instrumentSearchAnyClassExcelFilter;
    return this;
  }

  /**
   * Get instrumentSearchAnyClassExcelFilter
   * @return instrumentSearchAnyClassExcelFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchAnyClassExcelFilter getInstrumentSearchAnyClassExcelFilter() {
    return instrumentSearchAnyClassExcelFilter;
  }

  public void setInstrumentSearchAnyClassExcelFilter(InstrumentSearchAnyClassExcelFilter instrumentSearchAnyClassExcelFilter) {
    this.instrumentSearchAnyClassExcelFilter = instrumentSearchAnyClassExcelFilter;
  }

  public InstrumentSearchAnyClassExcelFilterAndPageFilter page(PageFilter page) {
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
    InstrumentSearchAnyClassExcelFilterAndPageFilter instrumentSearchAnyClassExcelFilterAndPageFilter = (InstrumentSearchAnyClassExcelFilterAndPageFilter) o;
    return Objects.equals(this.instrumentSearchAnyClassExcelFilter, instrumentSearchAnyClassExcelFilterAndPageFilter.instrumentSearchAnyClassExcelFilter) &&
        Objects.equals(this.page, instrumentSearchAnyClassExcelFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentSearchAnyClassExcelFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchAnyClassExcelFilterAndPageFilter {\n");
    
    sb.append("    instrumentSearchAnyClassExcelFilter: ").append(toIndentedString(instrumentSearchAnyClassExcelFilter)).append("\n");
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

