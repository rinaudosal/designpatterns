package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HoldingBreakdown;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {HoldingBreakdown} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {HoldingBreakdown} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HoldingBreakdownAndPage   {
  @JsonProperty("holdingBreakdowns")
  @Valid
  private List<HoldingBreakdown> holdingBreakdowns = null;

  @JsonProperty("page")
  private Page page = null;

  public HoldingBreakdownAndPage holdingBreakdowns(List<HoldingBreakdown> holdingBreakdowns) {
    this.holdingBreakdowns = holdingBreakdowns;
    return this;
  }

  public HoldingBreakdownAndPage addHoldingBreakdownsItem(HoldingBreakdown holdingBreakdownsItem) {
    if (this.holdingBreakdowns == null) {
      this.holdingBreakdowns = new ArrayList<>();
    }
    this.holdingBreakdowns.add(holdingBreakdownsItem);
    return this;
  }

  /**
   * The array of {HoldingBreakdown}
   * @return holdingBreakdowns
  **/
  @ApiModelProperty(value = "The array of {HoldingBreakdown}")

  @Valid

  public List<HoldingBreakdown> getHoldingBreakdowns() {
    return holdingBreakdowns;
  }

  public void setHoldingBreakdowns(List<HoldingBreakdown> holdingBreakdowns) {
    this.holdingBreakdowns = holdingBreakdowns;
  }

  public HoldingBreakdownAndPage page(Page page) {
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
    HoldingBreakdownAndPage holdingBreakdownAndPage = (HoldingBreakdownAndPage) o;
    return Objects.equals(this.holdingBreakdowns, holdingBreakdownAndPage.holdingBreakdowns) &&
        Objects.equals(this.page, holdingBreakdownAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdingBreakdowns, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingBreakdownAndPage {\n");
    
    sb.append("    holdingBreakdowns: ").append(toIndentedString(holdingBreakdowns)).append("\n");
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

