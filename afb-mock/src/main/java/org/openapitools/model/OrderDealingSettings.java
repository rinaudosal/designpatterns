package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about the dealing settings
 */
@ApiModel(description = "This object keeps information about the dealing settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderDealingSettings   {
  @JsonProperty("estimatedRedemptionCutoffTime")
  private String estimatedRedemptionCutoffTime = null;

  @JsonProperty("estimatedSubscriptionCutoffTime")
  private String estimatedSubscriptionCutoffTime = null;

  @JsonProperty("feeChargeOptionAvailable")
  private Boolean feeChargeOptionAvailable = null;

  @JsonProperty("omnibusAvailable")
  private Boolean omnibusAvailable = null;

  public OrderDealingSettings estimatedRedemptionCutoffTime(String estimatedRedemptionCutoffTime) {
    this.estimatedRedemptionCutoffTime = estimatedRedemptionCutoffTime;
    return this;
  }

  /**
   * Get estimatedRedemptionCutoffTime
   * @return estimatedRedemptionCutoffTime
  **/
  @ApiModelProperty(value = "")


  public String getEstimatedRedemptionCutoffTime() {
    return estimatedRedemptionCutoffTime;
  }

  public void setEstimatedRedemptionCutoffTime(String estimatedRedemptionCutoffTime) {
    this.estimatedRedemptionCutoffTime = estimatedRedemptionCutoffTime;
  }

  public OrderDealingSettings estimatedSubscriptionCutoffTime(String estimatedSubscriptionCutoffTime) {
    this.estimatedSubscriptionCutoffTime = estimatedSubscriptionCutoffTime;
    return this;
  }

  /**
   * Get estimatedSubscriptionCutoffTime
   * @return estimatedSubscriptionCutoffTime
  **/
  @ApiModelProperty(value = "")


  public String getEstimatedSubscriptionCutoffTime() {
    return estimatedSubscriptionCutoffTime;
  }

  public void setEstimatedSubscriptionCutoffTime(String estimatedSubscriptionCutoffTime) {
    this.estimatedSubscriptionCutoffTime = estimatedSubscriptionCutoffTime;
  }

  public OrderDealingSettings feeChargeOptionAvailable(Boolean feeChargeOptionAvailable) {
    this.feeChargeOptionAvailable = feeChargeOptionAvailable;
    return this;
  }

  /**
   * Indicates whether, in the order dealing, it's posible to choose de {Order.feeChargeOption}. It will depend on the selected dealingInstrument
   * @return feeChargeOptionAvailable
  **/
  @ApiModelProperty(value = "Indicates whether, in the order dealing, it's posible to choose de {Order.feeChargeOption}. It will depend on the selected dealingInstrument")


  public Boolean getFeeChargeOptionAvailable() {
    return feeChargeOptionAvailable;
  }

  public void setFeeChargeOptionAvailable(Boolean feeChargeOptionAvailable) {
    this.feeChargeOptionAvailable = feeChargeOptionAvailable;
  }

  public OrderDealingSettings omnibusAvailable(Boolean omnibusAvailable) {
    this.omnibusAvailable = omnibusAvailable;
    return this;
  }

  /**
   * Indicates whether the order can be in \"Omnibus Mode\". It depends on the value of {DistributorSeetings.omnibus} that corresponds to the {Oder.distributorId}. Furthermore, this value it will depend on the selected dealingInstrument
   * @return omnibusAvailable
  **/
  @ApiModelProperty(value = "Indicates whether the order can be in \"Omnibus Mode\". It depends on the value of {DistributorSeetings.omnibus} that corresponds to the {Oder.distributorId}. Furthermore, this value it will depend on the selected dealingInstrument")


  public Boolean getOmnibusAvailable() {
    return omnibusAvailable;
  }

  public void setOmnibusAvailable(Boolean omnibusAvailable) {
    this.omnibusAvailable = omnibusAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDealingSettings orderDealingSettings = (OrderDealingSettings) o;
    return Objects.equals(this.estimatedRedemptionCutoffTime, orderDealingSettings.estimatedRedemptionCutoffTime) &&
        Objects.equals(this.estimatedSubscriptionCutoffTime, orderDealingSettings.estimatedSubscriptionCutoffTime) &&
        Objects.equals(this.feeChargeOptionAvailable, orderDealingSettings.feeChargeOptionAvailable) &&
        Objects.equals(this.omnibusAvailable, orderDealingSettings.omnibusAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedRedemptionCutoffTime, estimatedSubscriptionCutoffTime, feeChargeOptionAvailable, omnibusAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDealingSettings {\n");
    
    sb.append("    estimatedRedemptionCutoffTime: ").append(toIndentedString(estimatedRedemptionCutoffTime)).append("\n");
    sb.append("    estimatedSubscriptionCutoffTime: ").append(toIndentedString(estimatedSubscriptionCutoffTime)).append("\n");
    sb.append("    feeChargeOptionAvailable: ").append(toIndentedString(feeChargeOptionAvailable)).append("\n");
    sb.append("    omnibusAvailable: ").append(toIndentedString(omnibusAvailable)).append("\n");
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

