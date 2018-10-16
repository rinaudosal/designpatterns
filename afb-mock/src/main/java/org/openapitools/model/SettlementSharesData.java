package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains data about shares associated to the the {Transaction} that originated the {Settlement}
 */
@ApiModel(description = "Contains data about shares associated to the the {Transaction} that originated the {Settlement}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementSharesData   {
  @JsonProperty("awardedShares")
  private Double awardedShares = null;

  @JsonProperty("requestedShares")
  private Double requestedShares = null;

  public SettlementSharesData awardedShares(Double awardedShares) {
    this.awardedShares = awardedShares;
    return this;
  }

  /**
   * Awarded shares in the {Settlement}. Refer to {TransactionSharesData.awardedShares}
   * @return awardedShares
  **/
  @ApiModelProperty(value = "Awarded shares in the {Settlement}. Refer to {TransactionSharesData.awardedShares}")


  public Double getAwardedShares() {
    return awardedShares;
  }

  public void setAwardedShares(Double awardedShares) {
    this.awardedShares = awardedShares;
  }

  public SettlementSharesData requestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
    return this;
  }

  /**
   * Requested shares in the {Settlement}. Refer to {TransactionSharesData.requestedShares}
   * @return requestedShares
  **/
  @ApiModelProperty(value = "Requested shares in the {Settlement}. Refer to {TransactionSharesData.requestedShares}")


  public Double getRequestedShares() {
    return requestedShares;
  }

  public void setRequestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementSharesData settlementSharesData = (SettlementSharesData) o;
    return Objects.equals(this.awardedShares, settlementSharesData.awardedShares) &&
        Objects.equals(this.requestedShares, settlementSharesData.requestedShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awardedShares, requestedShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementSharesData {\n");
    
    sb.append("    awardedShares: ").append(toIndentedString(awardedShares)).append("\n");
    sb.append("    requestedShares: ").append(toIndentedString(requestedShares)).append("\n");
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

