package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FundHouseGroup;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {FundHouseGroup} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {FundHouseGroup} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundHouseGroupAndPage   {
  @JsonProperty("fundHouseGroups")
  @Valid
  private List<FundHouseGroup> fundHouseGroups = null;

  @JsonProperty("page")
  private Page page = null;

  public FundHouseGroupAndPage fundHouseGroups(List<FundHouseGroup> fundHouseGroups) {
    this.fundHouseGroups = fundHouseGroups;
    return this;
  }

  public FundHouseGroupAndPage addFundHouseGroupsItem(FundHouseGroup fundHouseGroupsItem) {
    if (this.fundHouseGroups == null) {
      this.fundHouseGroups = new ArrayList<>();
    }
    this.fundHouseGroups.add(fundHouseGroupsItem);
    return this;
  }

  /**
   * The array of {FundHouseGroup}
   * @return fundHouseGroups
  **/
  @ApiModelProperty(value = "The array of {FundHouseGroup}")

  @Valid

  public List<FundHouseGroup> getFundHouseGroups() {
    return fundHouseGroups;
  }

  public void setFundHouseGroups(List<FundHouseGroup> fundHouseGroups) {
    this.fundHouseGroups = fundHouseGroups;
  }

  public FundHouseGroupAndPage page(Page page) {
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
    FundHouseGroupAndPage fundHouseGroupAndPage = (FundHouseGroupAndPage) o;
    return Objects.equals(this.fundHouseGroups, fundHouseGroupAndPage.fundHouseGroups) &&
        Objects.equals(this.page, fundHouseGroupAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundHouseGroups, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundHouseGroupAndPage {\n");
    
    sb.append("    fundHouseGroups: ").append(toIndentedString(fundHouseGroups)).append("\n");
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

