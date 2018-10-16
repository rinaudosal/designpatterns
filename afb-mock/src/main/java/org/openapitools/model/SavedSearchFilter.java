package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavedSearchFilter   {
  /**
   * Gets or Sets searchType
   */
  public enum SearchTypeEnum {
    FUND("FUND"),
    
    ETF("ETF"),
    
    TOOLS("TOOLS");

    private String value;

    SearchTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SearchTypeEnum fromValue(String text) {
      for (SearchTypeEnum b : SearchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("searchType")
  private SearchTypeEnum searchType = null;

  public SavedSearchFilter searchType(SearchTypeEnum searchType) {
    this.searchType = searchType;
    return this;
  }

  /**
   * Get searchType
   * @return searchType
  **/
  @ApiModelProperty(value = "")


  public SearchTypeEnum getSearchType() {
    return searchType;
  }

  public void setSearchType(SearchTypeEnum searchType) {
    this.searchType = searchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSearchFilter savedSearchFilter = (SavedSearchFilter) o;
    return Objects.equals(this.searchType, savedSearchFilter.searchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSearchFilter {\n");
    
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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

