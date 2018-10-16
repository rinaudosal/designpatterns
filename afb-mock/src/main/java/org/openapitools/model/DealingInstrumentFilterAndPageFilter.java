package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DealingInstrumentFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingInstrumentFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingInstrumentFilterAndPageFilter   {
  @JsonProperty("dealingInstrumentFilter")
  private DealingInstrumentFilter dealingInstrumentFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public DealingInstrumentFilterAndPageFilter dealingInstrumentFilter(DealingInstrumentFilter dealingInstrumentFilter) {
    this.dealingInstrumentFilter = dealingInstrumentFilter;
    return this;
  }

  /**
   * Get dealingInstrumentFilter
   * @return dealingInstrumentFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DealingInstrumentFilter getDealingInstrumentFilter() {
    return dealingInstrumentFilter;
  }

  public void setDealingInstrumentFilter(DealingInstrumentFilter dealingInstrumentFilter) {
    this.dealingInstrumentFilter = dealingInstrumentFilter;
  }

  public DealingInstrumentFilterAndPageFilter page(PageFilter page) {
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
    DealingInstrumentFilterAndPageFilter dealingInstrumentFilterAndPageFilter = (DealingInstrumentFilterAndPageFilter) o;
    return Objects.equals(this.dealingInstrumentFilter, dealingInstrumentFilterAndPageFilter.dealingInstrumentFilter) &&
        Objects.equals(this.page, dealingInstrumentFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingInstrumentFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingInstrumentFilterAndPageFilter {\n");
    
    sb.append("    dealingInstrumentFilter: ").append(toIndentedString(dealingInstrumentFilter)).append("\n");
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

