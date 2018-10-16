package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.OrderMonitoringFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {OrderMonitoringFilter} and a {CursorFilter}.
 */
@ApiModel(description = "A simple object composed of either a {OrderMonitoringFilter} and a {CursorFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderMonitoringFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("orderMonitoringFilter")
  private OrderMonitoringFilter orderMonitoringFilter = null;

  public OrderMonitoringFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
    this.cursorFilter = cursorFilter;
    return this;
  }

  /**
   * Get cursorFilter
   * @return cursorFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CursorFilter getCursorFilter() {
    return cursorFilter;
  }

  public void setCursorFilter(CursorFilter cursorFilter) {
    this.cursorFilter = cursorFilter;
  }

  public OrderMonitoringFilterAndCursorFilter orderMonitoringFilter(OrderMonitoringFilter orderMonitoringFilter) {
    this.orderMonitoringFilter = orderMonitoringFilter;
    return this;
  }

  /**
   * Get orderMonitoringFilter
   * @return orderMonitoringFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderMonitoringFilter getOrderMonitoringFilter() {
    return orderMonitoringFilter;
  }

  public void setOrderMonitoringFilter(OrderMonitoringFilter orderMonitoringFilter) {
    this.orderMonitoringFilter = orderMonitoringFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMonitoringFilterAndCursorFilter orderMonitoringFilterAndCursorFilter = (OrderMonitoringFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, orderMonitoringFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.orderMonitoringFilter, orderMonitoringFilterAndCursorFilter.orderMonitoringFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, orderMonitoringFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMonitoringFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    orderMonitoringFilter: ").append(toIndentedString(orderMonitoringFilter)).append("\n");
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

