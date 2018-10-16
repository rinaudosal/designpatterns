package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SolvencyFundHouseGroup;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {SolvencyFundHouseGroup} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {SolvencyFundHouseGroup} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyFundHouseGroupAndPage   {
  @JsonProperty("fundHouseGroups")
  @Valid
  private List<SolvencyFundHouseGroup> fundHouseGroups = null;

  @JsonProperty("page")
  private Page page = null;

  public SolvencyFundHouseGroupAndPage fundHouseGroups(List<SolvencyFundHouseGroup> fundHouseGroups) {
    this.fundHouseGroups = fundHouseGroups;
    return this;
  }

  public SolvencyFundHouseGroupAndPage addFundHouseGroupsItem(SolvencyFundHouseGroup fundHouseGroupsItem) {
    if (this.fundHouseGroups == null) {
      this.fundHouseGroups = new ArrayList<>();
    }
    this.fundHouseGroups.add(fundHouseGroupsItem);
    return this;
  }

  /**
   * The array of {SolvencyFundHouseGroup}
   * @return fundHouseGroups
  **/
  @ApiModelProperty(value = "The array of {SolvencyFundHouseGroup}")

  @Valid

  public List<SolvencyFundHouseGroup> getFundHouseGroups() {
    return fundHouseGroups;
  }

  public void setFundHouseGroups(List<SolvencyFundHouseGroup> fundHouseGroups) {
    this.fundHouseGroups = fundHouseGroups;
  }

  public SolvencyFundHouseGroupAndPage page(Page page) {
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
    SolvencyFundHouseGroupAndPage solvencyFundHouseGroupAndPage = (SolvencyFundHouseGroupAndPage) o;
    return Objects.equals(this.fundHouseGroups, solvencyFundHouseGroupAndPage.fundHouseGroups) &&
        Objects.equals(this.page, solvencyFundHouseGroupAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundHouseGroups, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyFundHouseGroupAndPage {\n");
    
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

