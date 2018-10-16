package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.RawSearchInstrumentResult;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RawSearchInstrumentResultAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RawSearchInstrumentResultAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("results")
  @Valid
  private List<RawSearchInstrumentResult> results = null;

  public RawSearchInstrumentResultAndPage page(Page page) {
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

  public RawSearchInstrumentResultAndPage results(List<RawSearchInstrumentResult> results) {
    this.results = results;
    return this;
  }

  public RawSearchInstrumentResultAndPage addResultsItem(RawSearchInstrumentResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RawSearchInstrumentResult> getResults() {
    return results;
  }

  public void setResults(List<RawSearchInstrumentResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawSearchInstrumentResultAndPage rawSearchInstrumentResultAndPage = (RawSearchInstrumentResultAndPage) o;
    return Objects.equals(this.page, rawSearchInstrumentResultAndPage.page) &&
        Objects.equals(this.results, rawSearchInstrumentResultAndPage.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawSearchInstrumentResultAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

