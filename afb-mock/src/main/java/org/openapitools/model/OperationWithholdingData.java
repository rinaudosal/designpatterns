package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about withholdings applied in the {Operation}.
 */
@ApiModel(description = "This object keeps specific information about withholdings applied in the {Operation}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationWithholdingData   {
  @JsonProperty("withheldAmount")
  private Double withheldAmount = null;

  @JsonProperty("witholding")
  private Boolean witholding = null;

  public OperationWithholdingData withheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
    return this;
  }

  /**
   * Withheld amount expressed in the {DealingInstrument} currency. Expressed in {Operation.currencyCode}
   * @return withheldAmount
  **/
  @ApiModelProperty(value = "Withheld amount expressed in the {DealingInstrument} currency. Expressed in {Operation.currencyCode}")


  public Double getWithheldAmount() {
    return withheldAmount;
  }

  public void setWithheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
  }

  public OperationWithholdingData witholding(Boolean witholding) {
    this.witholding = witholding;
    return this;
  }

  /**
   * Witholding
   * @return witholding
  **/
  @ApiModelProperty(value = "Witholding")


  public Boolean getWitholding() {
    return witholding;
  }

  public void setWitholding(Boolean witholding) {
    this.witholding = witholding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationWithholdingData operationWithholdingData = (OperationWithholdingData) o;
    return Objects.equals(this.withheldAmount, operationWithholdingData.withheldAmount) &&
        Objects.equals(this.witholding, operationWithholdingData.witholding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withheldAmount, witholding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationWithholdingData {\n");
    
    sb.append("    withheldAmount: ").append(toIndentedString(withheldAmount)).append("\n");
    sb.append("    witholding: ").append(toIndentedString(witholding)).append("\n");
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

