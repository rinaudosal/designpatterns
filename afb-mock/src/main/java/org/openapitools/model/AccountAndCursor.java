package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Cursor;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AccountAndCursor   {
  @JsonProperty("accounts")
  @Valid
  private List<Account> accounts = null;

  @JsonProperty("cursor")
  private Cursor cursor = null;

  public AccountAndCursor accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AccountAndCursor addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public AccountAndCursor cursor(Cursor cursor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAndCursor accountAndCursor = (AccountAndCursor) o;
    return Objects.equals(this.accounts, accountAndCursor.accounts) &&
        Objects.equals(this.cursor, accountAndCursor.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAndCursor {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

