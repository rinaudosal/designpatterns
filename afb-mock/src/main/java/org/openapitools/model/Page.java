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
 * The &#x60;Page&#x60; object is returned by many &#x60;list&#x60; operations in order for the {Consumer} to setup its pagination. It comes with all the necessary information to navigate the result set.
 */
@ApiModel(description = "The `Page` object is returned by many `list` operations in order for the {Consumer} to setup its pagination. It comes with all the necessary information to navigate the result set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Page   {
  @JsonProperty("orderPage")
  private OrderPage orderPage = null;

  @JsonProperty("pageNumber")
  private Long pageNumber = null;

  @JsonProperty("resultPerPage")
  private Long resultPerPage = null;

  @JsonProperty("totalNumberOfResult")
  private Long totalNumberOfResult = null;

  public Page orderPage(OrderPage orderPage) {
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

  public Page pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * The current page number. Usually corresponds to the {PageFilter.pageNumber}.
   * @return pageNumber
  **/
  @ApiModelProperty(value = "The current page number. Usually corresponds to the {PageFilter.pageNumber}.")


  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Page resultPerPage(Long resultPerPage) {
    this.resultPerPage = resultPerPage;
    return this;
  }

  /**
   * Number of result per page. Usually corresponds to the {PageFilter.resultPerPage}.
   * @return resultPerPage
  **/
  @ApiModelProperty(value = "Number of result per page. Usually corresponds to the {PageFilter.resultPerPage}.")


  public Long getResultPerPage() {
    return resultPerPage;
  }

  public void setResultPerPage(Long resultPerPage) {
    this.resultPerPage = resultPerPage;
  }

  public Page totalNumberOfResult(Long totalNumberOfResult) {
    this.totalNumberOfResult = totalNumberOfResult;
    return this;
  }

  /**
   * Total number of result in the result set.
   * @return totalNumberOfResult
  **/
  @ApiModelProperty(value = "Total number of result in the result set.")


  public Long getTotalNumberOfResult() {
    return totalNumberOfResult;
  }

  public void setTotalNumberOfResult(Long totalNumberOfResult) {
    this.totalNumberOfResult = totalNumberOfResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.orderPage, page.orderPage) &&
        Objects.equals(this.pageNumber, page.pageNumber) &&
        Objects.equals(this.resultPerPage, page.resultPerPage) &&
        Objects.equals(this.totalNumberOfResult, page.totalNumberOfResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderPage, pageNumber, resultPerPage, totalNumberOfResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    orderPage: ").append(toIndentedString(orderPage)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    resultPerPage: ").append(toIndentedString(resultPerPage)).append("\n");
    sb.append("    totalNumberOfResult: ").append(toIndentedString(totalNumberOfResult)).append("\n");
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

