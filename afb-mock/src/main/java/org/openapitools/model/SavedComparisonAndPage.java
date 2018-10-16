package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SavedComparison;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {SavedComparison} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {SavedComparison} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavedComparisonAndPage   {
  @JsonProperty("comparisons")
  @Valid
  private List<SavedComparison> comparisons = null;

  @JsonProperty("page")
  private Page page = null;

  public SavedComparisonAndPage comparisons(List<SavedComparison> comparisons) {
    this.comparisons = comparisons;
    return this;
  }

  public SavedComparisonAndPage addComparisonsItem(SavedComparison comparisonsItem) {
    if (this.comparisons == null) {
      this.comparisons = new ArrayList<>();
    }
    this.comparisons.add(comparisonsItem);
    return this;
  }

  /**
   * The array of {SavedComparison}
   * @return comparisons
  **/
  @ApiModelProperty(value = "The array of {SavedComparison}")

  @Valid

  public List<SavedComparison> getComparisons() {
    return comparisons;
  }

  public void setComparisons(List<SavedComparison> comparisons) {
    this.comparisons = comparisons;
  }

  public SavedComparisonAndPage page(Page page) {
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
    SavedComparisonAndPage savedComparisonAndPage = (SavedComparisonAndPage) o;
    return Objects.equals(this.comparisons, savedComparisonAndPage.comparisons) &&
        Objects.equals(this.page, savedComparisonAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisons, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedComparisonAndPage {\n");
    
    sb.append("    comparisons: ").append(toIndentedString(comparisons)).append("\n");
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

