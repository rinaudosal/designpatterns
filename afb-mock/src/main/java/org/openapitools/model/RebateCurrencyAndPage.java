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
 * A simple object composed of an array of {CodeDescription.code} and a {Page}
 */
@ApiModel(description = "A simple object composed of an array of {CodeDescription.code} and a {Page}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebateCurrencyAndPage   {
  @JsonProperty("currencyCodes")
  @Valid
  private List<String> currencyCodes = null;

  @JsonProperty("page")
  private Page page = null;

  public RebateCurrencyAndPage currencyCodes(List<String> currencyCodes) {
    this.currencyCodes = currencyCodes;
    return this;
  }

  public RebateCurrencyAndPage addCurrencyCodesItem(String currencyCodesItem) {
    if (this.currencyCodes == null) {
      this.currencyCodes = new ArrayList<>();
    }
    this.currencyCodes.add(currencyCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} corresponding with the available rebate currencies. Refer to {listCurrencies} for a complete list.
   * @return currencyCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} corresponding with the available rebate currencies. Refer to {listCurrencies} for a complete list.")


  public List<String> getCurrencyCodes() {
    return currencyCodes;
  }

  public void setCurrencyCodes(List<String> currencyCodes) {
    this.currencyCodes = currencyCodes;
  }

  public RebateCurrencyAndPage page(Page page) {
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
    RebateCurrencyAndPage rebateCurrencyAndPage = (RebateCurrencyAndPage) o;
    return Objects.equals(this.currencyCodes, rebateCurrencyAndPage.currencyCodes) &&
        Objects.equals(this.page, rebateCurrencyAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCodes, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebateCurrencyAndPage {\n");
    
    sb.append("    currencyCodes: ").append(toIndentedString(currencyCodes)).append("\n");
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

