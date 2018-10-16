package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Fund;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Fund} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Fund} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundAndPage   {
  @JsonProperty("fund")
  @Valid
  private List<Fund> fund = null;

  @JsonProperty("page")
  private Page page = null;

  public FundAndPage fund(List<Fund> fund) {
    this.fund = fund;
    return this;
  }

  public FundAndPage addFundItem(Fund fundItem) {
    if (this.fund == null) {
      this.fund = new ArrayList<>();
    }
    this.fund.add(fundItem);
    return this;
  }

  /**
   * The array of {Fund}
   * @return fund
  **/
  @ApiModelProperty(value = "The array of {Fund}")

  @Valid

  public List<Fund> getFund() {
    return fund;
  }

  public void setFund(List<Fund> fund) {
    this.fund = fund;
  }

  public FundAndPage page(Page page) {
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
    FundAndPage fundAndPage = (FundAndPage) o;
    return Objects.equals(this.fund, fundAndPage.fund) &&
        Objects.equals(this.page, fundAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fund, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundAndPage {\n");
    
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
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

