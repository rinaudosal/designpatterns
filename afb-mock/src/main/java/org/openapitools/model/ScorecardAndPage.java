package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.Scorecard;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Scorecard} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Scorecard} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ScorecardAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("scorecards")
  @Valid
  private List<Scorecard> scorecards = null;

  public ScorecardAndPage page(Page page) {
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

  public ScorecardAndPage scorecards(List<Scorecard> scorecards) {
    this.scorecards = scorecards;
    return this;
  }

  public ScorecardAndPage addScorecardsItem(Scorecard scorecardsItem) {
    if (this.scorecards == null) {
      this.scorecards = new ArrayList<>();
    }
    this.scorecards.add(scorecardsItem);
    return this;
  }

  /**
   * The array of {Scorecard}
   * @return scorecards
  **/
  @ApiModelProperty(value = "The array of {Scorecard}")

  @Valid

  public List<Scorecard> getScorecards() {
    return scorecards;
  }

  public void setScorecards(List<Scorecard> scorecards) {
    this.scorecards = scorecards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScorecardAndPage scorecardAndPage = (ScorecardAndPage) o;
    return Objects.equals(this.page, scorecardAndPage.page) &&
        Objects.equals(this.scorecards, scorecardAndPage.scorecards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, scorecards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorecardAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    scorecards: ").append(toIndentedString(scorecards)).append("\n");
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

