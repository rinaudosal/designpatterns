package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlanFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanFilter   {
  @JsonProperty("collectiveInvestmentSchemeId")
  private Long collectiveInvestmentSchemeId = null;

  @JsonProperty("transactionTypeCode")
  private String transactionTypeCode = null;

  public SavingPlanFilter collectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
    return this;
  }

  /**
   * The Id of the {CollectiveInvestmentScheme}
   * @return collectiveInvestmentSchemeId
  **/
  @ApiModelProperty(value = "The Id of the {CollectiveInvestmentScheme}")


  public Long getCollectiveInvestmentSchemeId() {
    return collectiveInvestmentSchemeId;
  }

  public void setCollectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
  }

  public SavingPlanFilter transactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
    return this;
  }

  /**
   * Refer to  {listTransactionTypes}
   * @return transactionTypeCode
  **/
  @ApiModelProperty(value = "Refer to  {listTransactionTypes}")


  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }

  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanFilter savingPlanFilter = (SavingPlanFilter) o;
    return Objects.equals(this.collectiveInvestmentSchemeId, savingPlanFilter.collectiveInvestmentSchemeId) &&
        Objects.equals(this.transactionTypeCode, savingPlanFilter.transactionTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemeId, transactionTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanFilter {\n");
    
    sb.append("    collectiveInvestmentSchemeId: ").append(toIndentedString(collectiveInvestmentSchemeId)).append("\n");
    sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
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

