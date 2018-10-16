package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HistoricalPerformance;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {HistoricalPerformance} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {HistoricalPerformance} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ValueAddedMonthlyIndexAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("portfolioPerformances")
  @Valid
  private List<HistoricalPerformance> portfolioPerformances = null;

  public ValueAddedMonthlyIndexAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public ValueAddedMonthlyIndexAndPage portfolioPerformances(List<HistoricalPerformance> portfolioPerformances) {
    this.portfolioPerformances = portfolioPerformances;
    return this;
  }

  public ValueAddedMonthlyIndexAndPage addPortfolioPerformancesItem(HistoricalPerformance portfolioPerformancesItem) {
    if (this.portfolioPerformances == null) {
      this.portfolioPerformances = new ArrayList<>();
    }
    this.portfolioPerformances.add(portfolioPerformancesItem);
    return this;
  }

  /**
   * Get portfolioPerformances
   * @return portfolioPerformances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<HistoricalPerformance> getPortfolioPerformances() {
    return portfolioPerformances;
  }

  public void setPortfolioPerformances(List<HistoricalPerformance> portfolioPerformances) {
    this.portfolioPerformances = portfolioPerformances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueAddedMonthlyIndexAndPage valueAddedMonthlyIndexAndPage = (ValueAddedMonthlyIndexAndPage) o;
    return Objects.equals(this.page, valueAddedMonthlyIndexAndPage.page) &&
        Objects.equals(this.portfolioPerformances, valueAddedMonthlyIndexAndPage.portfolioPerformances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, portfolioPerformances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueAddedMonthlyIndexAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    portfolioPerformances: ").append(toIndentedString(portfolioPerformances)).append("\n");
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

