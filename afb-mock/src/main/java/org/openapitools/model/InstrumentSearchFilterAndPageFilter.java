package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InstrumentSearchFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchFilterAndPageFilter   {
  @JsonProperty("instrumentSearch")
  private InstrumentSearchFilter instrumentSearch = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public InstrumentSearchFilterAndPageFilter instrumentSearch(InstrumentSearchFilter instrumentSearch) {
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

  public InstrumentSearchFilterAndPageFilter page(PageFilter page) {
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
    InstrumentSearchFilterAndPageFilter instrumentSearchFilterAndPageFilter = (InstrumentSearchFilterAndPageFilter) o;
    return Objects.equals(this.instrumentSearch, instrumentSearchFilterAndPageFilter.instrumentSearch) &&
        Objects.equals(this.page, instrumentSearchFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentSearch, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchFilterAndPageFilter {\n");
    
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

