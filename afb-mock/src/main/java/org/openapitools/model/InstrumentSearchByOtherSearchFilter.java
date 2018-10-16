package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The InstrumentSearchByCodeFilter is used by the {searchInstruments} method. It is a generic structure that allows to search a specific resource using its external identifier (such as its ISIN identifier).
 */
@ApiModel(description = "The InstrumentSearchByCodeFilter is used by the {searchInstruments} method. It is a generic structure that allows to search a specific resource using its external identifier (such as its ISIN identifier).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchByOtherSearchFilter   {
  @JsonProperty("instrumentOtherSearch")
  @Valid
  private List<String> instrumentOtherSearch = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  public InstrumentSearchByOtherSearchFilter instrumentOtherSearch(List<String> instrumentOtherSearch) {
    this.instrumentOtherSearch = instrumentOtherSearch;
    return this;
  }

  public InstrumentSearchByOtherSearchFilter addInstrumentOtherSearchItem(String instrumentOtherSearchItem) {
    if (this.instrumentOtherSearch == null) {
      this.instrumentOtherSearch = new ArrayList<>();
    }
    this.instrumentOtherSearch.add(instrumentOtherSearchItem);
    return this;
  }

  /**
   * Get instrumentOtherSearch
   * @return instrumentOtherSearch
  **/
  @ApiModelProperty(value = "")


  public List<String> getInstrumentOtherSearch() {
    return instrumentOtherSearch;
  }

  public void setInstrumentOtherSearch(List<String> instrumentOtherSearch) {
    this.instrumentOtherSearch = instrumentOtherSearch;
  }

  public InstrumentSearchByOtherSearchFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public InstrumentSearchByOtherSearchFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")


  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentSearchByOtherSearchFilter instrumentSearchByOtherSearchFilter = (InstrumentSearchByOtherSearchFilter) o;
    return Objects.equals(this.instrumentOtherSearch, instrumentSearchByOtherSearchFilter.instrumentOtherSearch) &&
        Objects.equals(this.values, instrumentSearchByOtherSearchFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentOtherSearch, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchByOtherSearchFilter {\n");
    
    sb.append("    instrumentOtherSearch: ").append(toIndentedString(instrumentOtherSearch)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

