package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.TransactionMonitoringFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {TransactionMonitoringFilterAndCursorFilter} and a {CursorFilter}.
 */
@ApiModel(description = "A simple object composed of either a {TransactionMonitoringFilterAndCursorFilter} and a {CursorFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionMonitoringFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("transactionMonitoringFilter")
  private TransactionMonitoringFilter transactionMonitoringFilter = null;

  public TransactionMonitoringFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public TransactionMonitoringFilterAndCursorFilter transactionMonitoringFilter(TransactionMonitoringFilter transactionMonitoringFilter) {
    this.transactionMonitoringFilter = transactionMonitoringFilter;
    return this;
  }

  /**
   * Get transactionMonitoringFilter
   * @return transactionMonitoringFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionMonitoringFilter getTransactionMonitoringFilter() {
    return transactionMonitoringFilter;
  }

  public void setTransactionMonitoringFilter(TransactionMonitoringFilter transactionMonitoringFilter) {
    this.transactionMonitoringFilter = transactionMonitoringFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionMonitoringFilterAndCursorFilter transactionMonitoringFilterAndCursorFilter = (TransactionMonitoringFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, transactionMonitoringFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.transactionMonitoringFilter, transactionMonitoringFilterAndCursorFilter.transactionMonitoringFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, transactionMonitoringFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionMonitoringFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    transactionMonitoringFilter: ").append(toIndentedString(transactionMonitoringFilter)).append("\n");
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

