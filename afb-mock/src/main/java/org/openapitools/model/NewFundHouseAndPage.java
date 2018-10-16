package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.NewFundHouse;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {NewFundHouse} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {NewFundHouse} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class NewFundHouseAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("resources")
  @Valid
  private List<NewFundHouse> resources = null;

  public NewFundHouseAndPage page(Page page) {
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

  public NewFundHouseAndPage resources(List<NewFundHouse> resources) {
    this.resources = resources;
    return this;
  }

  public NewFundHouseAndPage addResourcesItem(NewFundHouse resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * The array of {NewFundHouse}
   * @return resources
  **/
  @ApiModelProperty(value = "The array of {NewFundHouse}")

  @Valid

  public List<NewFundHouse> getResources() {
    return resources;
  }

  public void setResources(List<NewFundHouse> resources) {
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
    NewFundHouseAndPage newFundHouseAndPage = (NewFundHouseAndPage) o;
    return Objects.equals(this.page, newFundHouseAndPage.page) &&
        Objects.equals(this.resources, newFundHouseAndPage.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewFundHouseAndPage {\n");
    
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

