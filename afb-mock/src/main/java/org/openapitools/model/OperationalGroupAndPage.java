package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OperationalGroup;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {OperationalGroup} and {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {OperationalGroup} and {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalGroupAndPage   {
  @JsonProperty("operationalGroups")
  @Valid
  private List<OperationalGroup> operationalGroups = null;

  @JsonProperty("page")
  private Page page = null;

  public OperationalGroupAndPage operationalGroups(List<OperationalGroup> operationalGroups) {
    this.operationalGroups = operationalGroups;
    return this;
  }

  public OperationalGroupAndPage addOperationalGroupsItem(OperationalGroup operationalGroupsItem) {
    if (this.operationalGroups == null) {
      this.operationalGroups = new ArrayList<>();
    }
    this.operationalGroups.add(operationalGroupsItem);
    return this;
  }

  /**
   * The array of {OperationalGroup}
   * @return operationalGroups
  **/
  @ApiModelProperty(value = "The array of {OperationalGroup}")

  @Valid

  public List<OperationalGroup> getOperationalGroups() {
    return operationalGroups;
  }

  public void setOperationalGroups(List<OperationalGroup> operationalGroups) {
    this.operationalGroups = operationalGroups;
  }

  public OperationalGroupAndPage page(Page page) {
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
    OperationalGroupAndPage operationalGroupAndPage = (OperationalGroupAndPage) o;
    return Objects.equals(this.operationalGroups, operationalGroupAndPage.operationalGroups) &&
        Objects.equals(this.page, operationalGroupAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalGroups, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalGroupAndPage {\n");
    
    sb.append("    operationalGroups: ").append(toIndentedString(operationalGroups)).append("\n");
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

