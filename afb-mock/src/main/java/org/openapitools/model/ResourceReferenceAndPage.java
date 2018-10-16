package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {ResourceReference} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {ResourceReference} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ResourceReferenceAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("resources")
  @Valid
  private List<ResourceReference> resources = null;

  public ResourceReferenceAndPage page(Page page) {
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

  public ResourceReferenceAndPage resources(List<ResourceReference> resources) {
    this.resources = resources;
    return this;
  }

  public ResourceReferenceAndPage addResourcesItem(ResourceReference resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * The array of {ResourceReference}
   * @return resources
  **/
  @ApiModelProperty(value = "The array of {ResourceReference}")

  @Valid

  public List<ResourceReference> getResources() {
    return resources;
  }

  public void setResources(List<ResourceReference> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceReferenceAndPage resourceReferenceAndPage = (ResourceReferenceAndPage) o;
    return Objects.equals(this.page, resourceReferenceAndPage.page) &&
        Objects.equals(this.resources, resourceReferenceAndPage.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceReferenceAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

