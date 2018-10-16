package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SavedSearch;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {SavedSearch} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {SavedSearch} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavedSearchAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("searches")
  @Valid
  private List<SavedSearch> searches = null;

  public SavedSearchAndPage page(Page page) {
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

  public SavedSearchAndPage searches(List<SavedSearch> searches) {
    this.searches = searches;
    return this;
  }

  public SavedSearchAndPage addSearchesItem(SavedSearch searchesItem) {
    if (this.searches == null) {
      this.searches = new ArrayList<>();
    }
    this.searches.add(searchesItem);
    return this;
  }

  /**
   * The array of {SavedSearch}
   * @return searches
  **/
  @ApiModelProperty(value = "The array of {SavedSearch}")

  @Valid

  public List<SavedSearch> getSearches() {
    return searches;
  }

  public void setSearches(List<SavedSearch> searches) {
    this.searches = searches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSearchAndPage savedSearchAndPage = (SavedSearchAndPage) o;
    return Objects.equals(this.page, savedSearchAndPage.page) &&
        Objects.equals(this.searches, savedSearchAndPage.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, searches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSearchAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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

