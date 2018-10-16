package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SavingPlanBasicData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlanSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanSummary   {
  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("basicData")
  private SavingPlanBasicData basicData = null;

  @JsonProperty("contractBalance")
  private Double contractBalance = null;

  @JsonProperty("id")
  private Long id = null;

  public SavingPlanSummary balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The total balance of the {SavingPlan} expressed in {SavingPlan.basicData.currencyCode}
   * @return balance
  **/
  @ApiModelProperty(value = "The total balance of the {SavingPlan} expressed in {SavingPlan.basicData.currencyCode}")


  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public SavingPlanSummary basicData(SavingPlanBasicData basicData) {
    this.basicData = basicData;
    return this;
  }

  /**
   * Get basicData
   * @return basicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SavingPlanBasicData getBasicData() {
    return basicData;
  }

  public void setBasicData(SavingPlanBasicData basicData) {
    this.basicData = basicData;
  }

  public SavingPlanSummary contractBalance(Double contractBalance) {
    this.contractBalance = contractBalance;
    return this;
  }

  /**
   * The total balance of the {Contract} associated to the {SavingPlan}
   * @return contractBalance
  **/
  @ApiModelProperty(value = "The total balance of the {Contract} associated to the {SavingPlan}")


  public Double getContractBalance() {
    return contractBalance;
  }

  public void setContractBalance(Double contractBalance) {
    this.contractBalance = contractBalance;
  }

  public SavingPlanSummary id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {SavingPlan}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {SavingPlan}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanSummary savingPlanSummary = (SavingPlanSummary) o;
    return Objects.equals(this.balance, savingPlanSummary.balance) &&
        Objects.equals(this.basicData, savingPlanSummary.basicData) &&
        Objects.equals(this.contractBalance, savingPlanSummary.contractBalance) &&
        Objects.equals(this.id, savingPlanSummary.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, basicData, contractBalance, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanSummary {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    basicData: ").append(toIndentedString(basicData)).append("\n");
    sb.append("    contractBalance: ").append(toIndentedString(contractBalance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

