package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderPage;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;PageFilter&#x60; object allows the {Consumer} to retrieve a specific set of result in a &#x60;list&#x60; operation.
 */
@ApiModel(description = "The `PageFilter` object allows the {Consumer} to retrieve a specific set of result in a `list` operation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PageFilter   {
  @JsonProperty("orderPage")
  private OrderPage orderPage = null;

  @JsonProperty("pageNumber")
  private Long pageNumber = null;

  @JsonProperty("resultPerPage")
  private Long resultPerPage = null;

  public PageFilter orderPage(OrderPage orderPage) {
    this.orderPage = orderPage;
    return this;
  }

  /**
   * Get orderPage
   * @return orderPage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderPage getOrderPage() {
    return orderPage;
  }

  public void setOrderPage(OrderPage orderPage) {
    this.orderPage = orderPage;
  }

  public PageFilter pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * The page number to retrieve.
   * @return pageNumber
  **/
  @ApiModelProperty(value = "The page number to retrieve.")


  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PageFilter resultPerPage(Long resultPerPage) {
    this.resultPerPage = resultPerPage;
    return this;
  }

  /**
   * The number of requested result per page.
   * @return resultPerPage
  **/
  @ApiModelProperty(value = "The number of requested result per page.")


  public Long getResultPerPage() {
    return resultPerPage;
  }

  public void setResultPerPage(Long resultPerPage) {
    this.resultPerPage = resultPerPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFilter pageFilter = (PageFilter) o;
    return Objects.equals(this.orderPage, pageFilter.orderPage) &&
        Objects.equals(this.pageNumber, pageFilter.pageNumber) &&
        Objects.equals(this.resultPerPage, pageFilter.resultPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderPage, pageNumber, resultPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFilter {\n");
    
    sb.append("    orderPage: ").append(toIndentedString(orderPage)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    resultPerPage: ").append(toIndentedString(resultPerPage)).append("\n");
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

