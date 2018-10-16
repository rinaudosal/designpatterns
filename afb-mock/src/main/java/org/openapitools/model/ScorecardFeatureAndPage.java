package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listScorecardFeaturesByDistributor} for a complete list.
 */
@ApiModel(description = "A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listScorecardFeaturesByDistributor} for a complete list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ScorecardFeatureAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("scorecardFeatures")
  @Valid
  private List<String> scorecardFeatures = null;

  public ScorecardFeatureAndPage page(Page page) {
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

  public ScorecardFeatureAndPage scorecardFeatures(List<String> scorecardFeatures) {
    this.scorecardFeatures = scorecardFeatures;
    return this;
  }

  public ScorecardFeatureAndPage addScorecardFeaturesItem(String scorecardFeaturesItem) {
    if (this.scorecardFeatures == null) {
      this.scorecardFeatures = new ArrayList<>();
    }
    this.scorecardFeatures.add(scorecardFeaturesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} available.
   * @return scorecardFeatures
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} available.")


  public List<String> getScorecardFeatures() {
    return scorecardFeatures;
  }

  public void setScorecardFeatures(List<String> scorecardFeatures) {
    this.scorecardFeatures = scorecardFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScorecardFeatureAndPage scorecardFeatureAndPage = (ScorecardFeatureAndPage) o;
    return Objects.equals(this.page, scorecardFeatureAndPage.page) &&
        Objects.equals(this.scorecardFeatures, scorecardFeatureAndPage.scorecardFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, scorecardFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorecardFeatureAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    scorecardFeatures: ").append(toIndentedString(scorecardFeatures)).append("\n");
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

