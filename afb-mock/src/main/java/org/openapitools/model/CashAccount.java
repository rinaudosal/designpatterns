package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashAccount   {
  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("balanceInLocalCurrency")
  private Double balanceInLocalCurrency = null;

  @JsonProperty("cashClientId")
  private String cashClientId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("currentAccountCode")
  private String currentAccountCode = null;

  @JsonProperty("domicilie")
  private String domicilie = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("localCurrencyCode")
  private String localCurrencyCode = null;

  @JsonProperty("name")
  private String name = null;

  public CashAccount balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The {CashAccount} balance expressed in {balanceCurrencyCode}
   * @return balance
  **/
  @ApiModelProperty(value = "The {CashAccount} balance expressed in {balanceCurrencyCode}")


  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public CashAccount balanceInLocalCurrency(Double balanceInLocalCurrency) {
    this.balanceInLocalCurrency = balanceInLocalCurrency;
    return this;
  }

  /**
   * The {CashAccount} balance expressed in {localCurrencyCode}.
   * @return balanceInLocalCurrency
  **/
  @ApiModelProperty(value = "The {CashAccount} balance expressed in {localCurrencyCode}.")


  public Double getBalanceInLocalCurrency() {
    return balanceInLocalCurrency;
  }

  public void setBalanceInLocalCurrency(Double balanceInLocalCurrency) {
    this.balanceInLocalCurrency = balanceInLocalCurrency;
  }

  public CashAccount cashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
    return this;
  }

  /**
   * The Id of the {CashClient}, who is the owner of the {CashAccount}
   * @return cashClientId
  **/
  @ApiModelProperty(value = "The Id of the {CashClient}, who is the owner of the {CashAccount}")


  public String getCashClientId() {
    return cashClientId;
  }

  public void setCashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
  }

  public CashAccount currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency defined for this {CashAccount}. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency defined for this {CashAccount}. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CashAccount currentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
    return this;
  }

  /**
   * The current account code associated to the {CashAccount}
   * @return currentAccountCode
  **/
  @ApiModelProperty(value = "The current account code associated to the {CashAccount}")


  public String getCurrentAccountCode() {
    return currentAccountCode;
  }

  public void setCurrentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
  }

  public CashAccount domicilie(String domicilie) {
    this.domicilie = domicilie;
    return this;
  }

  /**
   * The domicile established for the {CashAccount}
   * @return domicilie
  **/
  @ApiModelProperty(value = "The domicile established for the {CashAccount}")


  public String getDomicilie() {
    return domicilie;
  }

  public void setDomicilie(String domicilie) {
    this.domicilie = domicilie;
  }

  public CashAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * The 'International Bank Account Number' associated to the {CashAccount}
   * @return iban
  **/
  @ApiModelProperty(value = "The 'International Bank Account Number' associated to the {CashAccount}")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public CashAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {CashAccount}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {CashAccount}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CashAccount localCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
    return this;
  }

  /**
   * The {CashAccount} local currency. Refer to {listCurrencies}. Always `EUR`.
   * @return localCurrencyCode
  **/
  @ApiModelProperty(value = "The {CashAccount} local currency. Refer to {listCurrencies}. Always `EUR`.")


  public String getLocalCurrencyCode() {
    return localCurrencyCode;
  }

  public void setLocalCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
  }

  public CashAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The {CashAccount} name
   * @return name
  **/
  @ApiModelProperty(value = "The {CashAccount} name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashAccount cashAccount = (CashAccount) o;
    return Objects.equals(this.balance, cashAccount.balance) &&
        Objects.equals(this.balanceInLocalCurrency, cashAccount.balanceInLocalCurrency) &&
        Objects.equals(this.cashClientId, cashAccount.cashClientId) &&
        Objects.equals(this.currencyCode, cashAccount.currencyCode) &&
        Objects.equals(this.currentAccountCode, cashAccount.currentAccountCode) &&
        Objects.equals(this.domicilie, cashAccount.domicilie) &&
        Objects.equals(this.iban, cashAccount.iban) &&
        Objects.equals(this.id, cashAccount.id) &&
        Objects.equals(this.localCurrencyCode, cashAccount.localCurrencyCode) &&
        Objects.equals(this.name, cashAccount.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, balanceInLocalCurrency, cashClientId, currencyCode, currentAccountCode, domicilie, iban, id, localCurrencyCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccount {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceInLocalCurrency: ").append(toIndentedString(balanceInLocalCurrency)).append("\n");
    sb.append("    cashClientId: ").append(toIndentedString(cashClientId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currentAccountCode: ").append(toIndentedString(currentAccountCode)).append("\n");
    sb.append("    domicilie: ").append(toIndentedString(domicilie)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCurrencyCode: ").append(toIndentedString(localCurrencyCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

