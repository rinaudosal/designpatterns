package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.QuarterlyPerformance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {QuarterlyPerformance} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {QuarterlyPerformance} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class QuarterlyPerformancesAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("quarterlyPerformances")
  @Valid
  private List<QuarterlyPerformance> quarterlyPerformances = null;

  public QuarterlyPerformancesAndPage page(Page page) {
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

  public QuarterlyPerformancesAndPage quarterlyPerformances(List<QuarterlyPerformance> quarterlyPerformances) {
    this.quarterlyPerformances = quarterlyPerformances;
    return this;
  }

  public QuarterlyPerformancesAndPage addQuarterlyPerformancesItem(QuarterlyPerformance quarterlyPerformancesItem) {
    if (this.quarterlyPerformances == null) {
      this.quarterlyPerformances = new ArrayList<>();
    }
    this.quarterlyPerformances.add(quarterlyPerformancesItem);
    return this;
  }

  /**
   * The array of {QuarterlyPerformance}
   * @return quarterlyPerformances
  **/
  @ApiModelProperty(value = "The array of {QuarterlyPerformance}")

  @Valid

  public List<QuarterlyPerformance> getQuarterlyPerformances() {
    return quarterlyPerformances;
  }

  public void setQuarterlyPerformances(List<QuarterlyPerformance> quarterlyPerformances) {
    this.quarterlyPerformances = quarterlyPerformances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarterlyPerformancesAndPage quarterlyPerformancesAndPage = (QuarterlyPerformancesAndPage) o;
    return Objects.equals(this.page, quarterlyPerformancesAndPage.page) &&
        Objects.equals(this.quarterlyPerformances, quarterlyPerformancesAndPage.quarterlyPerformances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, quarterlyPerformances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarterlyPerformancesAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    quarterlyPerformances: ").append(toIndentedString(quarterlyPerformances)).append("\n");
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

