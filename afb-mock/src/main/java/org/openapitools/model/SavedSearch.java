package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InstrumentSearchFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedSearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavedSearch   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instrumentSearch")
  private InstrumentSearchFilter instrumentSearch = null;

  @JsonProperty("name")
  private String name = null;

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

  public SavedSearch id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Save search ID.
   * @return id
  **/
  @ApiModelProperty(value = "Save search ID.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SavedSearch instrumentSearch(InstrumentSearchFilter instrumentSearch) {
    this.instrumentSearch = instrumentSearch;
    return this;
  }

  /**
   * Get instrumentSearch
   * @return instrumentSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchFilter getInstrumentSearch() {
    return instrumentSearch;
  }

  public void setInstrumentSearch(InstrumentSearchFilter instrumentSearch) {
    this.instrumentSearch = instrumentSearch;
  }

  public SavedSearch name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Save search
   * @return name
  **/
  @ApiModelProperty(value = "Name of Save search")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SavedSearch searchType(SearchTypeEnum searchType) {
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
    SavedSearch savedSearch = (SavedSearch) o;
    return Objects.equals(this.id, savedSearch.id) &&
        Objects.equals(this.instrumentSearch, savedSearch.instrumentSearch) &&
        Objects.equals(this.name, savedSearch.name) &&
        Objects.equals(this.searchType, savedSearch.searchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instrumentSearch, name, searchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSearch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instrumentSearch: ").append(toIndentedString(instrumentSearch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

