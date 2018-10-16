package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InstrumentSearchByCodeFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchByCodeFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchByCodeFilterAndPageFilter   {
  @JsonProperty("instrumentSearch")
  private InstrumentSearchByCodeFilter instrumentSearch = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public InstrumentSearchByCodeFilterAndPageFilter instrumentSearch(InstrumentSearchByCodeFilter instrumentSearch) {
    this.instrumentSearch = instrumentSearch;
    return this;
  }

  /**
   * Get instrumentSearch
   * @return instrumentSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchByCodeFilter getInstrumentSearch() {
    return instrumentSearch;
  }

  public void setInstrumentSearch(InstrumentSearchByCodeFilter instrumentSearch) {
    this.instrumentSearch = instrumentSearch;
  }

  public InstrumentSearchByCodeFilterAndPageFilter page(PageFilter page) {
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
    InstrumentSearchByCodeFilterAndPageFilter instrumentSearchByCodeFilterAndPageFilter = (InstrumentSearchByCodeFilterAndPageFilter) o;
    return Objects.equals(this.instrumentSearch, instrumentSearchByCodeFilterAndPageFilter.instrumentSearch) &&
        Objects.equals(this.page, instrumentSearchByCodeFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentSearch, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchByCodeFilterAndPageFilter {\n");
    
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

