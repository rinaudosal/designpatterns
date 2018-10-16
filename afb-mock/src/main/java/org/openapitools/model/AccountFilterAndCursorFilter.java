package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountFilter;
import org.openapitools.model.CursorFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AccountFilterAndCursorFilter   {
  @JsonProperty("accountFilter")
  private AccountFilter accountFilter = null;

  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  public AccountFilterAndCursorFilter accountFilter(AccountFilter accountFilter) {
    this.accountFilter = accountFilter;
    return this;
  }

  /**
   * Get accountFilter
   * @return accountFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountFilter getAccountFilter() {
    return accountFilter;
  }

  public void setAccountFilter(AccountFilter accountFilter) {
    this.accountFilter = accountFilter;
  }

  public AccountFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFilterAndCursorFilter accountFilterAndCursorFilter = (AccountFilterAndCursorFilter) o;
    return Objects.equals(this.accountFilter, accountFilterAndCursorFilter.accountFilter) &&
        Objects.equals(this.cursorFilter, accountFilterAndCursorFilter.cursorFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountFilter, cursorFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFilterAndCursorFilter {\n");
    
    sb.append("    accountFilter: ").append(toIndentedString(accountFilter)).append("\n");
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
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

