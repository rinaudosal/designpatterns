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
 * TransactionTypeAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionTypeAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("transactionTypeCodes")
  @Valid
  private List<String> transactionTypeCodes = null;

  public TransactionTypeAndPage page(Page page) {
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

  public TransactionTypeAndPage transactionTypeCodes(List<String> transactionTypeCodes) {
    this.transactionTypeCodes = transactionTypeCodes;
    return this;
  }

  public TransactionTypeAndPage addTransactionTypeCodesItem(String transactionTypeCodesItem) {
    if (this.transactionTypeCodes == null) {
      this.transactionTypeCodes = new ArrayList<>();
    }
    this.transactionTypeCodes.add(transactionTypeCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescriptions.code} corresponding with the available transaction types. Refer to {listTransactionTypes}
   * @return transactionTypeCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescriptions.code} corresponding with the available transaction types. Refer to {listTransactionTypes}")


  public List<String> getTransactionTypeCodes() {
    return transactionTypeCodes;
  }

  public void setTransactionTypeCodes(List<String> transactionTypeCodes) {
    this.transactionTypeCodes = transactionTypeCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionTypeAndPage transactionTypeAndPage = (TransactionTypeAndPage) o;
    return Objects.equals(this.page, transactionTypeAndPage.page) &&
        Objects.equals(this.transactionTypeCodes, transactionTypeAndPage.transactionTypeCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, transactionTypeCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionTypeAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    transactionTypeCodes: ").append(toIndentedString(transactionTypeCodes)).append("\n");
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

