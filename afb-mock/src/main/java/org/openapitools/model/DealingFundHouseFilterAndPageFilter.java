package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DealingFundHouseFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingFundHouseFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingFundHouseFilterAndPageFilter   {
  @JsonProperty("dealingFundHouseFilter")
  private DealingFundHouseFilter dealingFundHouseFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public DealingFundHouseFilterAndPageFilter dealingFundHouseFilter(DealingFundHouseFilter dealingFundHouseFilter) {
    this.dealingFundHouseFilter = dealingFundHouseFilter;
    return this;
  }

  /**
   * Get dealingFundHouseFilter
   * @return dealingFundHouseFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DealingFundHouseFilter getDealingFundHouseFilter() {
    return dealingFundHouseFilter;
  }

  public void setDealingFundHouseFilter(DealingFundHouseFilter dealingFundHouseFilter) {
    this.dealingFundHouseFilter = dealingFundHouseFilter;
  }

  public DealingFundHouseFilterAndPageFilter page(PageFilter page) {
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
    DealingFundHouseFilterAndPageFilter dealingFundHouseFilterAndPageFilter = (DealingFundHouseFilterAndPageFilter) o;
    return Objects.equals(this.dealingFundHouseFilter, dealingFundHouseFilterAndPageFilter.dealingFundHouseFilter) &&
        Objects.equals(this.page, dealingFundHouseFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingFundHouseFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingFundHouseFilterAndPageFilter {\n");
    
    sb.append("    dealingFundHouseFilter: ").append(toIndentedString(dealingFundHouseFilter)).append("\n");
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

