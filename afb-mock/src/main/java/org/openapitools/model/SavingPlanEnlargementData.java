package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlanEnlargementData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanEnlargementData   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("quotas")
  private Long quotas = null;

  public SavingPlanEnlargementData amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount to increase the {SavingPlan} balance
   * @return amount
  **/
  @ApiModelProperty(value = "The amount to increase the {SavingPlan} balance")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SavingPlanEnlargementData quotas(Long quotas) {
    this.quotas = quotas;
    return this;
  }

  /**
   * The number of quotas to increase the {SavingPlan}.
   * @return quotas
  **/
  @ApiModelProperty(value = "The number of quotas to increase the {SavingPlan}.")


  public Long getQuotas() {
    return quotas;
  }

  public void setQuotas(Long quotas) {
    this.quotas = quotas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanEnlargementData savingPlanEnlargementData = (SavingPlanEnlargementData) o;
    return Objects.equals(this.amount, savingPlanEnlargementData.amount) &&
        Objects.equals(this.quotas, savingPlanEnlargementData.quotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, quotas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanEnlargementData {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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

