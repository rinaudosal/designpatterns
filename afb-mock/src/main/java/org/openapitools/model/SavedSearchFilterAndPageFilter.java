package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.SavedSearchFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedSearchFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavedSearchFilterAndPageFilter   {
  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("savedSearch")
  private SavedSearchFilter savedSearch = null;

  public SavedSearchFilterAndPageFilter page(PageFilter page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPage() {
    return page;
  }

  public void setPage(PageFilter page) {
    this.page = page;
  }

  public SavedSearchFilterAndPageFilter savedSearch(SavedSearchFilter savedSearch) {
    this.savedSearch = savedSearch;
    return this;
  }

  /**
   * Get savedSearch
   * @return savedSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SavedSearchFilter getSavedSearch() {
    return savedSearch;
  }

  public void setSavedSearch(SavedSearchFilter savedSearch) {
    this.savedSearch = savedSearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSearchFilterAndPageFilter savedSearchFilterAndPageFilter = (SavedSearchFilterAndPageFilter) o;
    return Objects.equals(this.page, savedSearchFilterAndPageFilter.page) &&
        Objects.equals(this.savedSearch, savedSearchFilterAndPageFilter.savedSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, savedSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSearchFilterAndPageFilter {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    savedSearch: ").append(toIndentedString(savedSearch)).append("\n");
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

