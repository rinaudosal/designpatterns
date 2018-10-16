package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Manager;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Manager} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Manager} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ManagersAndPage   {
  @JsonProperty("managers")
  @Valid
  private List<Manager> managers = null;

  @JsonProperty("page")
  private Page page = null;

  public ManagersAndPage managers(List<Manager> managers) {
    this.managers = managers;
    return this;
  }

  public ManagersAndPage addManagersItem(Manager managersItem) {
    if (this.managers == null) {
      this.managers = new ArrayList<>();
    }
    this.managers.add(managersItem);
    return this;
  }

  /**
   * The array of {Manager}
   * @return managers
  **/
  @ApiModelProperty(value = "The array of {Manager}")

  @Valid

  public List<Manager> getManagers() {
    return managers;
  }

  public void setManagers(List<Manager> managers) {
    this.managers = managers;
  }

  public ManagersAndPage page(Page page) {
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
    ManagersAndPage managersAndPage = (ManagersAndPage) o;
    return Objects.equals(this.managers, managersAndPage.managers) &&
        Objects.equals(this.page, managersAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managers, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagersAndPage {\n");
    
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
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

