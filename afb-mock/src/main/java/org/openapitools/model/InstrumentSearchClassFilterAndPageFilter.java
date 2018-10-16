package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InstrumentSearchClassFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchClassFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchClassFilterAndPageFilter   {
  @JsonProperty("instrumentSearchClassFilter")
  private InstrumentSearchClassFilter instrumentSearchClassFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public InstrumentSearchClassFilterAndPageFilter instrumentSearchClassFilter(InstrumentSearchClassFilter instrumentSearchClassFilter) {
    this.instrumentSearchClassFilter = instrumentSearchClassFilter;
    return this;
  }

  /**
   * Get instrumentSearchClassFilter
   * @return instrumentSearchClassFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchClassFilter getInstrumentSearchClassFilter() {
    return instrumentSearchClassFilter;
  }

  public void setInstrumentSearchClassFilter(InstrumentSearchClassFilter instrumentSearchClassFilter) {
    this.instrumentSearchClassFilter = instrumentSearchClassFilter;
  }

  public InstrumentSearchClassFilterAndPageFilter page(PageFilter page) {
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
    InstrumentSearchClassFilterAndPageFilter instrumentSearchClassFilterAndPageFilter = (InstrumentSearchClassFilterAndPageFilter) o;
    return Objects.equals(this.instrumentSearchClassFilter, instrumentSearchClassFilterAndPageFilter.instrumentSearchClassFilter) &&
        Objects.equals(this.page, instrumentSearchClassFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentSearchClassFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchClassFilterAndPageFilter {\n");
    
    sb.append("    instrumentSearchClassFilter: ").append(toIndentedString(instrumentSearchClassFilter)).append("\n");
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

