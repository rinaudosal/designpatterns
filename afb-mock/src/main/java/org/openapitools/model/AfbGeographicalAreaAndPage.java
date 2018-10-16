package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AfbGeographicalArea;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {AfbGeographicalArea} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {AfbGeographicalArea} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbGeographicalAreaAndPage   {
  @JsonProperty("afbGeographicAreas")
  @Valid
  private List<AfbGeographicalArea> afbGeographicAreas = null;

  @JsonProperty("page")
  private Page page = null;

  public AfbGeographicalAreaAndPage afbGeographicAreas(List<AfbGeographicalArea> afbGeographicAreas) {
    this.afbGeographicAreas = afbGeographicAreas;
    return this;
  }

  public AfbGeographicalAreaAndPage addAfbGeographicAreasItem(AfbGeographicalArea afbGeographicAreasItem) {
    if (this.afbGeographicAreas == null) {
      this.afbGeographicAreas = new ArrayList<>();
    }
    this.afbGeographicAreas.add(afbGeographicAreasItem);
    return this;
  }

  /**
   * The array of {AfbGeographicalArea}
   * @return afbGeographicAreas
  **/
  @ApiModelProperty(value = "The array of {AfbGeographicalArea}")

  @Valid

  public List<AfbGeographicalArea> getAfbGeographicAreas() {
    return afbGeographicAreas;
  }

  public void setAfbGeographicAreas(List<AfbGeographicalArea> afbGeographicAreas) {
    this.afbGeographicAreas = afbGeographicAreas;
  }

  public AfbGeographicalAreaAndPage page(Page page) {
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
    AfbGeographicalAreaAndPage afbGeographicalAreaAndPage = (AfbGeographicalAreaAndPage) o;
    return Objects.equals(this.afbGeographicAreas, afbGeographicalAreaAndPage.afbGeographicAreas) &&
        Objects.equals(this.page, afbGeographicalAreaAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbGeographicAreas, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbGeographicalAreaAndPage {\n");
    
    sb.append("    afbGeographicAreas: ").append(toIndentedString(afbGeographicAreas)).append("\n");
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

