package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursoredExcelFilter;
import org.openapitools.model.TransactionFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionFilterAndCursoredExcelFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionFilterAndCursoredExcelFilter   {
  @JsonProperty("cursoredExceFilter")
  private CursoredExcelFilter cursoredExceFilter = null;

  @JsonProperty("transactionFilter")
  private TransactionFilter transactionFilter = null;

  public TransactionFilterAndCursoredExcelFilter cursoredExceFilter(CursoredExcelFilter cursoredExceFilter) {
    this.cursoredExceFilter = cursoredExceFilter;
    return this;
  }

  /**
   * Get cursoredExceFilter
   * @return cursoredExceFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CursoredExcelFilter getCursoredExceFilter() {
    return cursoredExceFilter;
  }

  public void setCursoredExceFilter(CursoredExcelFilter cursoredExceFilter) {
    this.cursoredExceFilter = cursoredExceFilter;
  }

  public TransactionFilterAndCursoredExcelFilter transactionFilter(TransactionFilter transactionFilter) {
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
    TransactionFilterAndCursoredExcelFilter transactionFilterAndCursoredExcelFilter = (TransactionFilterAndCursoredExcelFilter) o;
    return Objects.equals(this.cursoredExceFilter, transactionFilterAndCursoredExcelFilter.cursoredExceFilter) &&
        Objects.equals(this.transactionFilter, transactionFilterAndCursoredExcelFilter.transactionFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursoredExceFilter, transactionFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFilterAndCursoredExcelFilter {\n");
    
    sb.append("    cursoredExceFilter: ").append(toIndentedString(cursoredExceFilter)).append("\n");
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

