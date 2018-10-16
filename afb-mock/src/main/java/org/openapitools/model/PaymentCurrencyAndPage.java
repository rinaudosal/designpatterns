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
 * A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listCurrencies} for a complete list.
 */
@ApiModel(description = "A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listCurrencies} for a complete list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PaymentCurrencyAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("paymentCurrenciesCodes")
  @Valid
  private List<String> paymentCurrenciesCodes = null;

  public PaymentCurrencyAndPage page(Page page) {
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

  public PaymentCurrencyAndPage paymentCurrenciesCodes(List<String> paymentCurrenciesCodes) {
    this.paymentCurrenciesCodes = paymentCurrenciesCodes;
    return this;
  }

  public PaymentCurrencyAndPage addPaymentCurrenciesCodesItem(String paymentCurrenciesCodesItem) {
    if (this.paymentCurrenciesCodes == null) {
      this.paymentCurrenciesCodes = new ArrayList<>();
    }
    this.paymentCurrenciesCodes.add(paymentCurrenciesCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} available. Refer to {listCurrencies} for a complete list.
   * @return paymentCurrenciesCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} available. Refer to {listCurrencies} for a complete list.")


  public List<String> getPaymentCurrenciesCodes() {
    return paymentCurrenciesCodes;
  }

  public void setPaymentCurrenciesCodes(List<String> paymentCurrenciesCodes) {
    this.paymentCurrenciesCodes = paymentCurrenciesCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCurrencyAndPage paymentCurrencyAndPage = (PaymentCurrencyAndPage) o;
    return Objects.equals(this.page, paymentCurrencyAndPage.page) &&
        Objects.equals(this.paymentCurrenciesCodes, paymentCurrencyAndPage.paymentCurrenciesCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, paymentCurrenciesCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCurrencyAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    paymentCurrenciesCodes: ").append(toIndentedString(paymentCurrenciesCodes)).append("\n");
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

