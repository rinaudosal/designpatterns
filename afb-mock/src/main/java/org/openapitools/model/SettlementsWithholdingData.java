package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains data about withholdings associated to the {Settlement}
 */
@ApiModel(description = "Contains data about withholdings associated to the {Settlement}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementsWithholdingData   {
  @JsonProperty("withheldAmount")
  private Double withheldAmount = null;

  public SettlementsWithholdingData withheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
    return this;
  }

  /**
   * Withheld amount expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. Refer to {TransactionWithholdingData.withheldAmount}
   * @return withheldAmount
  **/
  @ApiModelProperty(value = "Withheld amount expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. Refer to {TransactionWithholdingData.withheldAmount}")


  public Double getWithheldAmount() {
    return withheldAmount;
  }

  public void setWithheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementsWithholdingData settlementsWithholdingData = (SettlementsWithholdingData) o;
    return Objects.equals(this.withheldAmount, settlementsWithholdingData.withheldAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withheldAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementsWithholdingData {\n");
    
    sb.append("    withheldAmount: ").append(toIndentedString(withheldAmount)).append("\n");
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

