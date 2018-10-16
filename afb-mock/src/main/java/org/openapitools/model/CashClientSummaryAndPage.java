package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CashClientSummary;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashClientSummaryAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashClientSummaryAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("summaries")
  @Valid
  private List<CashClientSummary> summaries = null;

  public CashClientSummaryAndPage page(Page page) {
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

  public CashClientSummaryAndPage summaries(List<CashClientSummary> summaries) {
    this.summaries = summaries;
    return this;
  }

  public CashClientSummaryAndPage addSummariesItem(CashClientSummary summariesItem) {
    if (this.summaries == null) {
      this.summaries = new ArrayList<>();
    }
    this.summaries.add(summariesItem);
    return this;
  }

  /**
   * Get summaries
   * @return summaries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CashClientSummary> getSummaries() {
    return summaries;
  }

  public void setSummaries(List<CashClientSummary> summaries) {
    this.summaries = summaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashClientSummaryAndPage cashClientSummaryAndPage = (CashClientSummaryAndPage) o;
    return Objects.equals(this.page, cashClientSummaryAndPage.page) &&
        Objects.equals(this.summaries, cashClientSummaryAndPage.summaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, summaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashClientSummaryAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
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

