package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains specific internal metadata about the  {Settlement}
 */
@ApiModel(description = "Contains specific internal metadata about the  {Settlement}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementSettingsData   {
  @JsonProperty("grouped")
  private Boolean grouped = null;

  @JsonProperty("groupedTransaction")
  private Boolean groupedTransaction = null;

  @JsonProperty("groupedTransactionsConfirmed")
  private Boolean groupedTransactionsConfirmed = null;

  @JsonProperty("numberGroupedTransactions")
  private Long numberGroupedTransactions = null;

  public SettlementSettingsData grouped(Boolean grouped) {
    this.grouped = grouped;
    return this;
  }

  /**
   * Indicates whether the {Settlement} is grouped. It contains data about different individual settlements, grouped by some criteria.
   * @return grouped
  **/
  @ApiModelProperty(value = "Indicates whether the {Settlement} is grouped. It contains data about different individual settlements, grouped by some criteria.")


  public Boolean getGrouped() {
    return grouped;
  }

  public void setGrouped(Boolean grouped) {
    this.grouped = grouped;
  }

  public SettlementSettingsData groupedTransaction(Boolean groupedTransaction) {
    this.groupedTransaction = groupedTransaction;
    return this;
  }

  /**
   * Indicates whether the {Transaction} associated to the {Settlement} is grouped (aka is {TransactionSettingsData.grouped} is `true`).
   * @return groupedTransaction
  **/
  @ApiModelProperty(value = "Indicates whether the {Transaction} associated to the {Settlement} is grouped (aka is {TransactionSettingsData.grouped} is `true`).")


  public Boolean getGroupedTransaction() {
    return groupedTransaction;
  }

  public void setGroupedTransaction(Boolean groupedTransaction) {
    this.groupedTransaction = groupedTransaction;
  }

  public SettlementSettingsData groupedTransactionsConfirmed(Boolean groupedTransactionsConfirmed) {
    this.groupedTransactionsConfirmed = groupedTransactionsConfirmed;
    return this;
  }

  /**
   * If the {Transaction} associated to the {Settlement} is grouped, this field indicates whether the each single transactions has been confirmed. It is the same value as {TransactionSettingsData.groupedTransactionsConfirmed}
   * @return groupedTransactionsConfirmed
  **/
  @ApiModelProperty(value = "If the {Transaction} associated to the {Settlement} is grouped, this field indicates whether the each single transactions has been confirmed. It is the same value as {TransactionSettingsData.groupedTransactionsConfirmed}")


  public Boolean getGroupedTransactionsConfirmed() {
    return groupedTransactionsConfirmed;
  }

  public void setGroupedTransactionsConfirmed(Boolean groupedTransactionsConfirmed) {
    this.groupedTransactionsConfirmed = groupedTransactionsConfirmed;
  }

  public SettlementSettingsData numberGroupedTransactions(Long numberGroupedTransactions) {
    this.numberGroupedTransactions = numberGroupedTransactions;
    return this;
  }

  /**
   * If the {Transaction} associated to the {Settlement} is grouped (aka is {TransactionSettingsData.grouped} is `true`), this field indicates the number of single transactions which are grouped together.
   * @return numberGroupedTransactions
  **/
  @ApiModelProperty(value = "If the {Transaction} associated to the {Settlement} is grouped (aka is {TransactionSettingsData.grouped} is `true`), this field indicates the number of single transactions which are grouped together.")


  public Long getNumberGroupedTransactions() {
    return numberGroupedTransactions;
  }

  public void setNumberGroupedTransactions(Long numberGroupedTransactions) {
    this.numberGroupedTransactions = numberGroupedTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementSettingsData settlementSettingsData = (SettlementSettingsData) o;
    return Objects.equals(this.grouped, settlementSettingsData.grouped) &&
        Objects.equals(this.groupedTransaction, settlementSettingsData.groupedTransaction) &&
        Objects.equals(this.groupedTransactionsConfirmed, settlementSettingsData.groupedTransactionsConfirmed) &&
        Objects.equals(this.numberGroupedTransactions, settlementSettingsData.numberGroupedTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouped, groupedTransaction, groupedTransactionsConfirmed, numberGroupedTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementSettingsData {\n");
    
    sb.append("    grouped: ").append(toIndentedString(grouped)).append("\n");
    sb.append("    groupedTransaction: ").append(toIndentedString(groupedTransaction)).append("\n");
    sb.append("    groupedTransactionsConfirmed: ").append(toIndentedString(groupedTransactionsConfirmed)).append("\n");
    sb.append("    numberGroupedTransactions: ").append(toIndentedString(numberGroupedTransactions)).append("\n");
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

