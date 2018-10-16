package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SolvencyDistributor;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {SolvencyDistributor} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {SolvencyDistributor} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyDistributorAndPage   {
  @JsonProperty("distributors")
  @Valid
  private List<SolvencyDistributor> distributors = null;

  @JsonProperty("page")
  private Page page = null;

  public SolvencyDistributorAndPage distributors(List<SolvencyDistributor> distributors) {
    this.distributors = distributors;
    return this;
  }

  public SolvencyDistributorAndPage addDistributorsItem(SolvencyDistributor distributorsItem) {
    if (this.distributors == null) {
      this.distributors = new ArrayList<>();
    }
    this.distributors.add(distributorsItem);
    return this;
  }

  /**
   * The array of {SolvencyDistributor}
   * @return distributors
  **/
  @ApiModelProperty(value = "The array of {SolvencyDistributor}")

  @Valid

  public List<SolvencyDistributor> getDistributors() {
    return distributors;
  }

  public void setDistributors(List<SolvencyDistributor> distributors) {
    this.distributors = distributors;
  }

  public SolvencyDistributorAndPage page(Page page) {
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
    SolvencyDistributorAndPage solvencyDistributorAndPage = (SolvencyDistributorAndPage) o;
    return Objects.equals(this.distributors, solvencyDistributorAndPage.distributors) &&
        Objects.equals(this.page, solvencyDistributorAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributors, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyDistributorAndPage {\n");
    
    sb.append("    distributors: ").append(toIndentedString(distributors)).append("\n");
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

