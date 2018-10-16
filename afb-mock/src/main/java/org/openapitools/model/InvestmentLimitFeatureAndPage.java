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
 * A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listInvestmentLimitFeatures} for a complete list.
 */
@ApiModel(description = "A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listInvestmentLimitFeatures} for a complete list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InvestmentLimitFeatureAndPage   {
  @JsonProperty("investmentLimitFeatures")
  @Valid
  private List<String> investmentLimitFeatures = null;

  @JsonProperty("page")
  private Page page = null;

  public InvestmentLimitFeatureAndPage investmentLimitFeatures(List<String> investmentLimitFeatures) {
    this.investmentLimitFeatures = investmentLimitFeatures;
    return this;
  }

  public InvestmentLimitFeatureAndPage addInvestmentLimitFeaturesItem(String investmentLimitFeaturesItem) {
    if (this.investmentLimitFeatures == null) {
      this.investmentLimitFeatures = new ArrayList<>();
    }
    this.investmentLimitFeatures.add(investmentLimitFeaturesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} available.
   * @return investmentLimitFeatures
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} available.")


  public List<String> getInvestmentLimitFeatures() {
    return investmentLimitFeatures;
  }

  public void setInvestmentLimitFeatures(List<String> investmentLimitFeatures) {
    this.investmentLimitFeatures = investmentLimitFeatures;
  }

  public InvestmentLimitFeatureAndPage page(Page page) {
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
    InvestmentLimitFeatureAndPage investmentLimitFeatureAndPage = (InvestmentLimitFeatureAndPage) o;
    return Objects.equals(this.investmentLimitFeatures, investmentLimitFeatureAndPage.investmentLimitFeatures) &&
        Objects.equals(this.page, investmentLimitFeatureAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentLimitFeatures, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentLimitFeatureAndPage {\n");
    
    sb.append("    investmentLimitFeatures: ").append(toIndentedString(investmentLimitFeatures)).append("\n");
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

