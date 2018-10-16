package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.GenericBreakdown;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {GenericBreakdown} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {GenericBreakdown} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GenericBreakdownAndPage   {
  @JsonProperty("genericBreakdowns")
  @Valid
  private List<GenericBreakdown> genericBreakdowns = null;

  @JsonProperty("page")
  private Page page = null;

  public GenericBreakdownAndPage genericBreakdowns(List<GenericBreakdown> genericBreakdowns) {
    this.genericBreakdowns = genericBreakdowns;
    return this;
  }

  public GenericBreakdownAndPage addGenericBreakdownsItem(GenericBreakdown genericBreakdownsItem) {
    if (this.genericBreakdowns == null) {
      this.genericBreakdowns = new ArrayList<>();
    }
    this.genericBreakdowns.add(genericBreakdownsItem);
    return this;
  }

  /**
   * The array of {GenericBreakdown}
   * @return genericBreakdowns
  **/
  @ApiModelProperty(value = "The array of {GenericBreakdown}")

  @Valid

  public List<GenericBreakdown> getGenericBreakdowns() {
    return genericBreakdowns;
  }

  public void setGenericBreakdowns(List<GenericBreakdown> genericBreakdowns) {
    this.genericBreakdowns = genericBreakdowns;
  }

  public GenericBreakdownAndPage page(Page page) {
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
    GenericBreakdownAndPage genericBreakdownAndPage = (GenericBreakdownAndPage) o;
    return Objects.equals(this.genericBreakdowns, genericBreakdownAndPage.genericBreakdowns) &&
        Objects.equals(this.page, genericBreakdownAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genericBreakdowns, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericBreakdownAndPage {\n");
    
    sb.append("    genericBreakdowns: ").append(toIndentedString(genericBreakdowns)).append("\n");
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

