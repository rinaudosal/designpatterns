package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.Portfolio;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Portfolio} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Portfolio} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PortfolioAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("portfolios")
  @Valid
  private List<Portfolio> portfolios = null;

  public PortfolioAndPage page(Page page) {
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

  public PortfolioAndPage portfolios(List<Portfolio> portfolios) {
    this.portfolios = portfolios;
    return this;
  }

  public PortfolioAndPage addPortfoliosItem(Portfolio portfoliosItem) {
    if (this.portfolios == null) {
      this.portfolios = new ArrayList<>();
    }
    this.portfolios.add(portfoliosItem);
    return this;
  }

  /**
   * The array of {Portfolio}
   * @return portfolios
  **/
  @ApiModelProperty(value = "The array of {Portfolio}")

  @Valid

  public List<Portfolio> getPortfolios() {
    return portfolios;
  }

  public void setPortfolios(List<Portfolio> portfolios) {
    this.portfolios = portfolios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioAndPage portfolioAndPage = (PortfolioAndPage) o;
    return Objects.equals(this.page, portfolioAndPage.page) &&
        Objects.equals(this.portfolios, portfolioAndPage.portfolios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, portfolios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    portfolios: ").append(toIndentedString(portfolios)).append("\n");
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

