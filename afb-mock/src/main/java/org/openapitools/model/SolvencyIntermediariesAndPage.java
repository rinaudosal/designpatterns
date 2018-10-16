package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SolvencyIntermediary;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {SolvencyDistributor} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {SolvencyDistributor} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyIntermediariesAndPage   {
  @JsonProperty("intermediaries")
  @Valid
  private List<SolvencyIntermediary> intermediaries = null;

  @JsonProperty("page")
  private Page page = null;

  public SolvencyIntermediariesAndPage intermediaries(List<SolvencyIntermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }

  public SolvencyIntermediariesAndPage addIntermediariesItem(SolvencyIntermediary intermediariesItem) {
    if (this.intermediaries == null) {
      this.intermediaries = new ArrayList<>();
    }
    this.intermediaries.add(intermediariesItem);
    return this;
  }

  /**
   * The array of {SolvencyIntermediary}
   * @return intermediaries
  **/
  @ApiModelProperty(value = "The array of {SolvencyIntermediary}")

  @Valid

  public List<SolvencyIntermediary> getIntermediaries() {
    return intermediaries;
  }

  public void setIntermediaries(List<SolvencyIntermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  public SolvencyIntermediariesAndPage page(Page page) {
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
    SolvencyIntermediariesAndPage solvencyIntermediariesAndPage = (SolvencyIntermediariesAndPage) o;
    return Objects.equals(this.intermediaries, solvencyIntermediariesAndPage.intermediaries) &&
        Objects.equals(this.page, solvencyIntermediariesAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intermediaries, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyIntermediariesAndPage {\n");
    
    sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
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

