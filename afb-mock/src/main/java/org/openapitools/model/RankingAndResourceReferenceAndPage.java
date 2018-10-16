package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.RankingAndResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {RankingAndResourceReference} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {RankingAndResourceReference} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RankingAndResourceReferenceAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("rankingAndResourceReference")
  @Valid
  private List<RankingAndResourceReference> rankingAndResourceReference = null;

  public RankingAndResourceReferenceAndPage page(Page page) {
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

  public RankingAndResourceReferenceAndPage rankingAndResourceReference(List<RankingAndResourceReference> rankingAndResourceReference) {
    this.rankingAndResourceReference = rankingAndResourceReference;
    return this;
  }

  public RankingAndResourceReferenceAndPage addRankingAndResourceReferenceItem(RankingAndResourceReference rankingAndResourceReferenceItem) {
    if (this.rankingAndResourceReference == null) {
      this.rankingAndResourceReference = new ArrayList<>();
    }
    this.rankingAndResourceReference.add(rankingAndResourceReferenceItem);
    return this;
  }

  /**
   * The array of {RankingAndResourceReference}
   * @return rankingAndResourceReference
  **/
  @ApiModelProperty(value = "The array of {RankingAndResourceReference}")

  @Valid

  public List<RankingAndResourceReference> getRankingAndResourceReference() {
    return rankingAndResourceReference;
  }

  public void setRankingAndResourceReference(List<RankingAndResourceReference> rankingAndResourceReference) {
    this.rankingAndResourceReference = rankingAndResourceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingAndResourceReferenceAndPage rankingAndResourceReferenceAndPage = (RankingAndResourceReferenceAndPage) o;
    return Objects.equals(this.page, rankingAndResourceReferenceAndPage.page) &&
        Objects.equals(this.rankingAndResourceReference, rankingAndResourceReferenceAndPage.rankingAndResourceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, rankingAndResourceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingAndResourceReferenceAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rankingAndResourceReference: ").append(toIndentedString(rankingAndResourceReference)).append("\n");
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

