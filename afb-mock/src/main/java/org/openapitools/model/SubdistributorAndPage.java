package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.Subdistributor;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Subdistributor} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Subdistributor} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SubdistributorAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("subdistributors")
  @Valid
  private List<Subdistributor> subdistributors = null;

  public SubdistributorAndPage page(Page page) {
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

  public SubdistributorAndPage subdistributors(List<Subdistributor> subdistributors) {
    this.subdistributors = subdistributors;
    return this;
  }

  public SubdistributorAndPage addSubdistributorsItem(Subdistributor subdistributorsItem) {
    if (this.subdistributors == null) {
      this.subdistributors = new ArrayList<>();
    }
    this.subdistributors.add(subdistributorsItem);
    return this;
  }

  /**
   * The array of {Subdistributor}
   * @return subdistributors
  **/
  @ApiModelProperty(value = "The array of {Subdistributor}")

  @Valid

  public List<Subdistributor> getSubdistributors() {
    return subdistributors;
  }

  public void setSubdistributors(List<Subdistributor> subdistributors) {
    this.subdistributors = subdistributors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubdistributorAndPage subdistributorAndPage = (SubdistributorAndPage) o;
    return Objects.equals(this.page, subdistributorAndPage.page) &&
        Objects.equals(this.subdistributors, subdistributorAndPage.subdistributors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, subdistributors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubdistributorAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    subdistributors: ").append(toIndentedString(subdistributors)).append("\n");
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

