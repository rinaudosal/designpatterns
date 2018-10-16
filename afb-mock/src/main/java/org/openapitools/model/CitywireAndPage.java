package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Citywire;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Citywire} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Citywire} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CitywireAndPage   {
  @JsonProperty("citywires")
  @Valid
  private List<Citywire> citywires = null;

  @JsonProperty("page")
  private Page page = null;

  public CitywireAndPage citywires(List<Citywire> citywires) {
    this.citywires = citywires;
    return this;
  }

  public CitywireAndPage addCitywiresItem(Citywire citywiresItem) {
    if (this.citywires == null) {
      this.citywires = new ArrayList<>();
    }
    this.citywires.add(citywiresItem);
    return this;
  }

  /**
   * The array of {Citywire}
   * @return citywires
  **/
  @ApiModelProperty(value = "The array of {Citywire}")

  @Valid

  public List<Citywire> getCitywires() {
    return citywires;
  }

  public void setCitywires(List<Citywire> citywires) {
    this.citywires = citywires;
  }

  public CitywireAndPage page(Page page) {
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
    CitywireAndPage citywireAndPage = (CitywireAndPage) o;
    return Objects.equals(this.citywires, citywireAndPage.citywires) &&
        Objects.equals(this.page, citywireAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(citywires, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitywireAndPage {\n");
    
    sb.append("    citywires: ").append(toIndentedString(citywires)).append("\n");
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

