package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CashAccountAliasSummary;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashAccountAliasSummaryAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashAccountAliasSummaryAndPage   {
  @JsonProperty("cashAccountAliasSummaries")
  @Valid
  private List<CashAccountAliasSummary> cashAccountAliasSummaries = null;

  @JsonProperty("page")
  private Page page = null;

  public CashAccountAliasSummaryAndPage cashAccountAliasSummaries(List<CashAccountAliasSummary> cashAccountAliasSummaries) {
    this.cashAccountAliasSummaries = cashAccountAliasSummaries;
    return this;
  }

  public CashAccountAliasSummaryAndPage addCashAccountAliasSummariesItem(CashAccountAliasSummary cashAccountAliasSummariesItem) {
    if (this.cashAccountAliasSummaries == null) {
      this.cashAccountAliasSummaries = new ArrayList<>();
    }
    this.cashAccountAliasSummaries.add(cashAccountAliasSummariesItem);
    return this;
  }

  /**
   * Get cashAccountAliasSummaries
   * @return cashAccountAliasSummaries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CashAccountAliasSummary> getCashAccountAliasSummaries() {
    return cashAccountAliasSummaries;
  }

  public void setCashAccountAliasSummaries(List<CashAccountAliasSummary> cashAccountAliasSummaries) {
    this.cashAccountAliasSummaries = cashAccountAliasSummaries;
  }

  public CashAccountAliasSummaryAndPage page(Page page) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashAccountAliasSummaryAndPage cashAccountAliasSummaryAndPage = (CashAccountAliasSummaryAndPage) o;
    return Objects.equals(this.cashAccountAliasSummaries, cashAccountAliasSummaryAndPage.cashAccountAliasSummaries) &&
        Objects.equals(this.page, cashAccountAliasSummaryAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashAccountAliasSummaries, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccountAliasSummaryAndPage {\n");
    
    sb.append("    cashAccountAliasSummaries: ").append(toIndentedString(cashAccountAliasSummaries)).append("\n");
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

