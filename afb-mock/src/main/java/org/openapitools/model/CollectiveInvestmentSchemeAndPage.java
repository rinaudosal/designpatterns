package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CollectiveInvestmentScheme;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {CollectiveInvestmentScheme} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {CollectiveInvestmentScheme} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CollectiveInvestmentSchemeAndPage   {
  @JsonProperty("collectiveInvestmentSchemes")
  @Valid
  private List<CollectiveInvestmentScheme> collectiveInvestmentSchemes = null;

  @JsonProperty("page")
  private Page page = null;

  public CollectiveInvestmentSchemeAndPage collectiveInvestmentSchemes(List<CollectiveInvestmentScheme> collectiveInvestmentSchemes) {
    this.collectiveInvestmentSchemes = collectiveInvestmentSchemes;
    return this;
  }

  public CollectiveInvestmentSchemeAndPage addCollectiveInvestmentSchemesItem(CollectiveInvestmentScheme collectiveInvestmentSchemesItem) {
    if (this.collectiveInvestmentSchemes == null) {
      this.collectiveInvestmentSchemes = new ArrayList<>();
    }
    this.collectiveInvestmentSchemes.add(collectiveInvestmentSchemesItem);
    return this;
  }

  /**
   * The array of {CollectiveInvestmentScheme}
   * @return collectiveInvestmentSchemes
  **/
  @ApiModelProperty(value = "The array of {CollectiveInvestmentScheme}")

  @Valid

  public List<CollectiveInvestmentScheme> getCollectiveInvestmentSchemes() {
    return collectiveInvestmentSchemes;
  }

  public void setCollectiveInvestmentSchemes(List<CollectiveInvestmentScheme> collectiveInvestmentSchemes) {
    this.collectiveInvestmentSchemes = collectiveInvestmentSchemes;
  }

  public CollectiveInvestmentSchemeAndPage page(Page page) {
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
    CollectiveInvestmentSchemeAndPage collectiveInvestmentSchemeAndPage = (CollectiveInvestmentSchemeAndPage) o;
    return Objects.equals(this.collectiveInvestmentSchemes, collectiveInvestmentSchemeAndPage.collectiveInvestmentSchemes) &&
        Objects.equals(this.page, collectiveInvestmentSchemeAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemes, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectiveInvestmentSchemeAndPage {\n");
    
    sb.append("    collectiveInvestmentSchemes: ").append(toIndentedString(collectiveInvestmentSchemes)).append("\n");
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

