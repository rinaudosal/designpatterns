package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvestmentLimit;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {InvestmentLimit} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {InvestmentLimit} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InvestmentLimitAndPage   {
  @JsonProperty("investmentLimits")
  @Valid
  private List<InvestmentLimit> investmentLimits = null;

  @JsonProperty("page")
  private Page page = null;

  public InvestmentLimitAndPage investmentLimits(List<InvestmentLimit> investmentLimits) {
    this.investmentLimits = investmentLimits;
    return this;
  }

  public InvestmentLimitAndPage addInvestmentLimitsItem(InvestmentLimit investmentLimitsItem) {
    if (this.investmentLimits == null) {
      this.investmentLimits = new ArrayList<>();
    }
    this.investmentLimits.add(investmentLimitsItem);
    return this;
  }

  /**
   * The array of {InvestmentLimit}
   * @return investmentLimits
  **/
  @ApiModelProperty(value = "The array of {InvestmentLimit}")

  @Valid

  public List<InvestmentLimit> getInvestmentLimits() {
    return investmentLimits;
  }

  public void setInvestmentLimits(List<InvestmentLimit> investmentLimits) {
    this.investmentLimits = investmentLimits;
  }

  public InvestmentLimitAndPage page(Page page) {
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
    InvestmentLimitAndPage investmentLimitAndPage = (InvestmentLimitAndPage) o;
    return Objects.equals(this.investmentLimits, investmentLimitAndPage.investmentLimits) &&
        Objects.equals(this.page, investmentLimitAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentLimits, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentLimitAndPage {\n");
    
    sb.append("    investmentLimits: ").append(toIndentedString(investmentLimits)).append("\n");
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

