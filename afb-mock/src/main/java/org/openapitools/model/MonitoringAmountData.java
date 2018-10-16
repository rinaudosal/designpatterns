package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonitoringAmountData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MonitoringAmountData   {
  @JsonProperty("settledAmount")
  private Double settledAmount = null;

  @JsonProperty("totalAmount")
  private Double totalAmount = null;

  @JsonProperty("unsettledAmount")
  private Double unsettledAmount = null;

  public MonitoringAmountData settledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
    return this;
  }

  /**
   * Settled Amount
   * @return settledAmount
  **/
  @ApiModelProperty(value = "Settled Amount")


  public Double getSettledAmount() {
    return settledAmount;
  }

  public void setSettledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
  }

  public MonitoringAmountData totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Total Amount refer to {OperationalPortfolio}
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total Amount refer to {OperationalPortfolio}")


  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public MonitoringAmountData unsettledAmount(Double unsettledAmount) {
    this.unsettledAmount = unsettledAmount;
    return this;
  }

  /**
   * Pending Amount
   * @return unsettledAmount
  **/
  @ApiModelProperty(value = "Pending Amount")


  public Double getUnsettledAmount() {
    return unsettledAmount;
  }

  public void setUnsettledAmount(Double unsettledAmount) {
    this.unsettledAmount = unsettledAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringAmountData monitoringAmountData = (MonitoringAmountData) o;
    return Objects.equals(this.settledAmount, monitoringAmountData.settledAmount) &&
        Objects.equals(this.totalAmount, monitoringAmountData.totalAmount) &&
        Objects.equals(this.unsettledAmount, monitoringAmountData.unsettledAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settledAmount, totalAmount, unsettledAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringAmountData {\n");
    
    sb.append("    settledAmount: ").append(toIndentedString(settledAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unsettledAmount: ").append(toIndentedString(unsettledAmount)).append("\n");
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

