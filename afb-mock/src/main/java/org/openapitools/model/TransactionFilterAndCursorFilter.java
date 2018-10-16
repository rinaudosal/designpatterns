package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.GroupTransactionFilter;
import org.openapitools.model.TransactionFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("groupedTransactionFilter")
  private GroupTransactionFilter groupedTransactionFilter = null;

  @JsonProperty("transactionFilter")
  private TransactionFilter transactionFilter = null;

  public TransactionFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public TransactionFilterAndCursorFilter groupedTransactionFilter(GroupTransactionFilter groupedTransactionFilter) {
    this.groupedTransactionFilter = groupedTransactionFilter;
    return this;
  }

  /**
   * Get groupedTransactionFilter
   * @return groupedTransactionFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GroupTransactionFilter getGroupedTransactionFilter() {
    return groupedTransactionFilter;
  }

  public void setGroupedTransactionFilter(GroupTransactionFilter groupedTransactionFilter) {
    this.groupedTransactionFilter = groupedTransactionFilter;
  }

  public TransactionFilterAndCursorFilter transactionFilter(TransactionFilter transactionFilter) {
    this.transactionFilter = transactionFilter;
    return this;
  }

  /**
   * Get transactionFilter
   * @return transactionFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionFilter getTransactionFilter() {
    return transactionFilter;
  }

  public void setTransactionFilter(TransactionFilter transactionFilter) {
    this.transactionFilter = transactionFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFilterAndCursorFilter transactionFilterAndCursorFilter = (TransactionFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, transactionFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.groupedTransactionFilter, transactionFilterAndCursorFilter.groupedTransactionFilter) &&
        Objects.equals(this.transactionFilter, transactionFilterAndCursorFilter.transactionFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, groupedTransactionFilter, transactionFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    groupedTransactionFilter: ").append(toIndentedString(groupedTransactionFilter)).append("\n");
    sb.append("    transactionFilter: ").append(toIndentedString(transactionFilter)).append("\n");
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

