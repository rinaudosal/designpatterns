package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CheckInvestmentLimit;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckInvestmentLimitAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CheckInvestmentLimitAndPage   {
  @JsonProperty("featureBreakdowns")
  @Valid
  private List<CheckInvestmentLimit> featureBreakdowns = null;

  @JsonProperty("page")
  private Page page = null;

  public CheckInvestmentLimitAndPage featureBreakdowns(List<CheckInvestmentLimit> featureBreakdowns) {
    this.featureBreakdowns = featureBreakdowns;
    return this;
  }

  public CheckInvestmentLimitAndPage addFeatureBreakdownsItem(CheckInvestmentLimit featureBreakdownsItem) {
    if (this.featureBreakdowns == null) {
      this.featureBreakdowns = new ArrayList<>();
    }
    this.featureBreakdowns.add(featureBreakdownsItem);
    return this;
  }

  /**
   * Get featureBreakdowns
   * @return featureBreakdowns
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CheckInvestmentLimit> getFeatureBreakdowns() {
    return featureBreakdowns;
  }

  public void setFeatureBreakdowns(List<CheckInvestmentLimit> featureBreakdowns) {
    this.featureBreakdowns = featureBreakdowns;
  }

  public CheckInvestmentLimitAndPage page(Page page) {
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
    CheckInvestmentLimitAndPage checkInvestmentLimitAndPage = (CheckInvestmentLimitAndPage) o;
    return Objects.equals(this.featureBreakdowns, checkInvestmentLimitAndPage.featureBreakdowns) &&
        Objects.equals(this.page, checkInvestmentLimitAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureBreakdowns, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInvestmentLimitAndPage {\n");
    
    sb.append("    featureBreakdowns: ").append(toIndentedString(featureBreakdowns)).append("\n");
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

