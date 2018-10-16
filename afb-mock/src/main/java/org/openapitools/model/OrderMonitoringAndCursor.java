package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.OrderMonitoring;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {OrderMonitoring} and {Cursor}.
 */
@ApiModel(description = "A simple object composed of an array of {OrderMonitoring} and {Cursor}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderMonitoringAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("orderMonitoring")
  @Valid
  private List<OrderMonitoring> orderMonitoring = null;

  public OrderMonitoringAndCursor cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cursor getCursor() {
    return cursor;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

  public OrderMonitoringAndCursor orderMonitoring(List<OrderMonitoring> orderMonitoring) {
    this.orderMonitoring = orderMonitoring;
    return this;
  }

  public OrderMonitoringAndCursor addOrderMonitoringItem(OrderMonitoring orderMonitoringItem) {
    if (this.orderMonitoring == null) {
      this.orderMonitoring = new ArrayList<>();
    }
    this.orderMonitoring.add(orderMonitoringItem);
    return this;
  }

  /**
   * The array of {OrderMonitoring}
   * @return orderMonitoring
  **/
  @ApiModelProperty(value = "The array of {OrderMonitoring}")

  @Valid

  public List<OrderMonitoring> getOrderMonitoring() {
    return orderMonitoring;
  }

  public void setOrderMonitoring(List<OrderMonitoring> orderMonitoring) {
    this.orderMonitoring = orderMonitoring;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMonitoringAndCursor orderMonitoringAndCursor = (OrderMonitoringAndCursor) o;
    return Objects.equals(this.cursor, orderMonitoringAndCursor.cursor) &&
        Objects.equals(this.orderMonitoring, orderMonitoringAndCursor.orderMonitoring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, orderMonitoring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMonitoringAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    orderMonitoring: ").append(toIndentedString(orderMonitoring)).append("\n");
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

