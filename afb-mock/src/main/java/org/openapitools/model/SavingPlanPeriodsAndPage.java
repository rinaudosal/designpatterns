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
 * A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listSavingPlanPeriods} for a complete list.
 */
@ApiModel(description = "A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listSavingPlanPeriods} for a complete list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanPeriodsAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("periodCodes")
  @Valid
  private List<String> periodCodes = null;

  public SavingPlanPeriodsAndPage page(Page page) {
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

  public SavingPlanPeriodsAndPage periodCodes(List<String> periodCodes) {
    this.periodCodes = periodCodes;
    return this;
  }

  public SavingPlanPeriodsAndPage addPeriodCodesItem(String periodCodesItem) {
    if (this.periodCodes == null) {
      this.periodCodes = new ArrayList<>();
    }
    this.periodCodes.add(periodCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} available. Refer to {listSavingPlanPeriods} for a complete list.
   * @return periodCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} available. Refer to {listSavingPlanPeriods} for a complete list.")


  public List<String> getPeriodCodes() {
    return periodCodes;
  }

  public void setPeriodCodes(List<String> periodCodes) {
    this.periodCodes = periodCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanPeriodsAndPage savingPlanPeriodsAndPage = (SavingPlanPeriodsAndPage) o;
    return Objects.equals(this.page, savingPlanPeriodsAndPage.page) &&
        Objects.equals(this.periodCodes, savingPlanPeriodsAndPage.periodCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, periodCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanPeriodsAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    periodCodes: ").append(toIndentedString(periodCodes)).append("\n");
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

