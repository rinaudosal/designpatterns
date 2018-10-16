package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FundGroup;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {FundGroup} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {FundGroup} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundGroupAndPage   {
  @JsonProperty("fundGroups")
  @Valid
  private List<FundGroup> fundGroups = null;

  @JsonProperty("page")
  private Page page = null;

  public FundGroupAndPage fundGroups(List<FundGroup> fundGroups) {
    this.fundGroups = fundGroups;
    return this;
  }

  public FundGroupAndPage addFundGroupsItem(FundGroup fundGroupsItem) {
    if (this.fundGroups == null) {
      this.fundGroups = new ArrayList<>();
    }
    this.fundGroups.add(fundGroupsItem);
    return this;
  }

  /**
   * The array of {FundGroup}
   * @return fundGroups
  **/
  @ApiModelProperty(value = "The array of {FundGroup}")

  @Valid

  public List<FundGroup> getFundGroups() {
    return fundGroups;
  }

  public void setFundGroups(List<FundGroup> fundGroups) {
    this.fundGroups = fundGroups;
  }

  public FundGroupAndPage page(Page page) {
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
    FundGroupAndPage fundGroupAndPage = (FundGroupAndPage) o;
    return Objects.equals(this.fundGroups, fundGroupAndPage.fundGroups) &&
        Objects.equals(this.page, fundGroupAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundGroups, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundGroupAndPage {\n");
    
    sb.append("    fundGroups: ").append(toIndentedString(fundGroups)).append("\n");
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

