package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ComposedComposition;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {ComposedComposition} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {ComposedComposition} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ComposedCompositionAndPage   {
  @JsonProperty("compositions")
  @Valid
  private List<ComposedComposition> compositions = null;

  @JsonProperty("page")
  private Page page = null;

  public ComposedCompositionAndPage compositions(List<ComposedComposition> compositions) {
    this.compositions = compositions;
    return this;
  }

  public ComposedCompositionAndPage addCompositionsItem(ComposedComposition compositionsItem) {
    if (this.compositions == null) {
      this.compositions = new ArrayList<>();
    }
    this.compositions.add(compositionsItem);
    return this;
  }

  /**
   * The array of {ComposedComposition}
   * @return compositions
  **/
  @ApiModelProperty(value = "The array of {ComposedComposition}")

  @Valid

  public List<ComposedComposition> getCompositions() {
    return compositions;
  }

  public void setCompositions(List<ComposedComposition> compositions) {
    this.compositions = compositions;
  }

  public ComposedCompositionAndPage page(Page page) {
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
    ComposedCompositionAndPage composedCompositionAndPage = (ComposedCompositionAndPage) o;
    return Objects.equals(this.compositions, composedCompositionAndPage.compositions) &&
        Objects.equals(this.page, composedCompositionAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositions, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComposedCompositionAndPage {\n");
    
    sb.append("    compositions: ").append(toIndentedString(compositions)).append("\n");
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

