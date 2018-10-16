package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Distributor;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Distributor} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Distributor} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DistributorAndPage   {
  @JsonProperty("distributors")
  @Valid
  private List<Distributor> distributors = null;

  @JsonProperty("page")
  private Page page = null;

  public DistributorAndPage distributors(List<Distributor> distributors) {
    this.distributors = distributors;
    return this;
  }

  public DistributorAndPage addDistributorsItem(Distributor distributorsItem) {
    if (this.distributors == null) {
      this.distributors = new ArrayList<>();
    }
    this.distributors.add(distributorsItem);
    return this;
  }

  /**
   * The array of {Distributor}
   * @return distributors
  **/
  @ApiModelProperty(value = "The array of {Distributor}")

  @Valid

  public List<Distributor> getDistributors() {
    return distributors;
  }

  public void setDistributors(List<Distributor> distributors) {
    this.distributors = distributors;
  }

  public DistributorAndPage page(Page page) {
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
    DistributorAndPage distributorAndPage = (DistributorAndPage) o;
    return Objects.equals(this.distributors, distributorAndPage.distributors) &&
        Objects.equals(this.page, distributorAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributors, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributorAndPage {\n");
    
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

