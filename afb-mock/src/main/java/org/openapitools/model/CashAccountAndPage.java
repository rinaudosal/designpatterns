package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CashAccount;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashAccountAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashAccountAndPage   {
  @JsonProperty("accounts")
  @Valid
  private List<CashAccount> accounts = null;

  @JsonProperty("page")
  private Page page = null;

  public CashAccountAndPage accounts(List<CashAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  public CashAccountAndPage addAccountsItem(CashAccount accountsItem) {
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

  public List<CashAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<CashAccount> accounts) {
    this.accounts = accounts;
  }

  public CashAccountAndPage page(Page page) {
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
    CashAccountAndPage cashAccountAndPage = (CashAccountAndPage) o;
    return Objects.equals(this.accounts, cashAccountAndPage.accounts) &&
        Objects.equals(this.page, cashAccountAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccountAndPage {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

