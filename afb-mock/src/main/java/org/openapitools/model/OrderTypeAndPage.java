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
 * OrderTypeAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderTypeAndPage   {
  @JsonProperty("orderTypeCodes")
  @Valid
  private List<String> orderTypeCodes = null;

  @JsonProperty("page")
  private Page page = null;

  public OrderTypeAndPage orderTypeCodes(List<String> orderTypeCodes) {
    this.orderTypeCodes = orderTypeCodes;
    return this;
  }

  public OrderTypeAndPage addOrderTypeCodesItem(String orderTypeCodesItem) {
    if (this.orderTypeCodes == null) {
      this.orderTypeCodes = new ArrayList<>();
    }
    this.orderTypeCodes.add(orderTypeCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescriptions.code} corresponding to the available Order types (as it appears in {Order.orderTypeCode}). Refer to {listTransactionTypes}
   * @return orderTypeCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescriptions.code} corresponding to the available Order types (as it appears in {Order.orderTypeCode}). Refer to {listTransactionTypes}")


  public List<String> getOrderTypeCodes() {
    return orderTypeCodes;
  }

  public void setOrderTypeCodes(List<String> orderTypeCodes) {
    this.orderTypeCodes = orderTypeCodes;
  }

  public OrderTypeAndPage page(Page page) {
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
    OrderTypeAndPage orderTypeAndPage = (OrderTypeAndPage) o;
    return Objects.equals(this.orderTypeCodes, orderTypeAndPage.orderTypeCodes) &&
        Objects.equals(this.page, orderTypeAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderTypeCodes, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTypeAndPage {\n");
    
    sb.append("    orderTypeCodes: ").append(toIndentedString(orderTypeCodes)).append("\n");
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

