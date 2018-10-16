package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundAccount   {
  @JsonProperty("acc")
  private String acc = null;

  @JsonProperty("accountCode")
  private String accountCode = null;

  @JsonProperty("bank")
  private String bank = null;

  @JsonProperty("bra")
  private String bra = null;

  @JsonProperty("cd")
  private String cd = null;

  public FundAccount acc(String acc) {
    this.acc = acc;
    return this;
  }

  /**
   * acc
   * @return acc
  **/
  @ApiModelProperty(value = "acc")


  public String getAcc() {
    return acc;
  }

  public void setAcc(String acc) {
    this.acc = acc;
  }

  public FundAccount accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * Uni. Account Code
   * @return accountCode
  **/
  @ApiModelProperty(value = "Uni. Account Code")


  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public FundAccount bank(String bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Bank CCC
   * @return bank
  **/
  @ApiModelProperty(value = "Bank CCC")


  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public FundAccount bra(String bra) {
    this.bra = bra;
    return this;
  }

  /**
   * Bra
   * @return bra
  **/
  @ApiModelProperty(value = "Bra")


  public String getBra() {
    return bra;
  }

  public void setBra(String bra) {
    this.bra = bra;
  }

  public FundAccount cd(String cd) {
    this.cd = cd;
    return this;
  }

  /**
   * CD
   * @return cd
  **/
  @ApiModelProperty(value = "CD")


  public String getCd() {
    return cd;
  }

  public void setCd(String cd) {
    this.cd = cd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundAccount fundAccount = (FundAccount) o;
    return Objects.equals(this.acc, fundAccount.acc) &&
        Objects.equals(this.accountCode, fundAccount.accountCode) &&
        Objects.equals(this.bank, fundAccount.bank) &&
        Objects.equals(this.bra, fundAccount.bra) &&
        Objects.equals(this.cd, fundAccount.cd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acc, accountCode, bank, bra, cd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundAccount {\n");
    
    sb.append("    acc: ").append(toIndentedString(acc)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    bra: ").append(toIndentedString(bra)).append("\n");
    sb.append("    cd: ").append(toIndentedString(cd)).append("\n");
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

