package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InvestmentLimitByFeatureFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {InvestmentLimitByFeatureFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of either a {InvestmentLimitByFeatureFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InvestmentLimitByFeatureFilterAndPageFilter   {
  @JsonProperty("investmentLimitByFeatureFilter")
  private InvestmentLimitByFeatureFilter investmentLimitByFeatureFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public InvestmentLimitByFeatureFilterAndPageFilter investmentLimitByFeatureFilter(InvestmentLimitByFeatureFilter investmentLimitByFeatureFilter) {
    this.investmentLimitByFeatureFilter = investmentLimitByFeatureFilter;
    return this;
  }

  /**
   * Get investmentLimitByFeatureFilter
   * @return investmentLimitByFeatureFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentLimitByFeatureFilter getInvestmentLimitByFeatureFilter() {
    return investmentLimitByFeatureFilter;
  }

  public void setInvestmentLimitByFeatureFilter(InvestmentLimitByFeatureFilter investmentLimitByFeatureFilter) {
    this.investmentLimitByFeatureFilter = investmentLimitByFeatureFilter;
  }

  public InvestmentLimitByFeatureFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    InvestmentLimitByFeatureFilterAndPageFilter investmentLimitByFeatureFilterAndPageFilter = (InvestmentLimitByFeatureFilterAndPageFilter) o;
    return Objects.equals(this.investmentLimitByFeatureFilter, investmentLimitByFeatureFilterAndPageFilter.investmentLimitByFeatureFilter) &&
        Objects.equals(this.pageFilter, investmentLimitByFeatureFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentLimitByFeatureFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentLimitByFeatureFilterAndPageFilter {\n");
    
    sb.append("    investmentLimitByFeatureFilter: ").append(toIndentedString(investmentLimitByFeatureFilter)).append("\n");
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

