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
 * A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listTransactionTypes} for a complete list.
 */
@ApiModel(description = "A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listTransactionTypes} for a complete list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanTransactionTypesAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("transactionTypesCodes")
  @Valid
  private List<String> transactionTypesCodes = null;

  public SavingPlanTransactionTypesAndPage page(Page page) {
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

  public SavingPlanTransactionTypesAndPage transactionTypesCodes(List<String> transactionTypesCodes) {
    this.transactionTypesCodes = transactionTypesCodes;
    return this;
  }

  public SavingPlanTransactionTypesAndPage addTransactionTypesCodesItem(String transactionTypesCodesItem) {
    if (this.transactionTypesCodes == null) {
      this.transactionTypesCodes = new ArrayList<>();
    }
    this.transactionTypesCodes.add(transactionTypesCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} available. Refer to {listTransactionTypes} for a complete list.
   * @return transactionTypesCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} available. Refer to {listTransactionTypes} for a complete list.")


  public List<String> getTransactionTypesCodes() {
    return transactionTypesCodes;
  }

  public void setTransactionTypesCodes(List<String> transactionTypesCodes) {
    this.transactionTypesCodes = transactionTypesCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanTransactionTypesAndPage savingPlanTransactionTypesAndPage = (SavingPlanTransactionTypesAndPage) o;
    return Objects.equals(this.page, savingPlanTransactionTypesAndPage.page) &&
        Objects.equals(this.transactionTypesCodes, savingPlanTransactionTypesAndPage.transactionTypesCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, transactionTypesCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanTransactionTypesAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    transactionTypesCodes: ").append(toIndentedString(transactionTypesCodes)).append("\n");
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

