package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DealingDetail;
import org.openapitools.model.MinimunInvestmet;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SubscriptionDetail   {
  @JsonProperty("dealingDetail")
  private DealingDetail dealingDetail = null;

  @JsonProperty("initial")
  private MinimunInvestmet initial = null;

  @JsonProperty("subsequent")
  private MinimunInvestmet subsequent = null;

  public SubscriptionDetail dealingDetail(DealingDetail dealingDetail) {
    this.dealingDetail = dealingDetail;
    return this;
  }

  /**
   * Get dealingDetail
   * @return dealingDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DealingDetail getDealingDetail() {
    return dealingDetail;
  }

  public void setDealingDetail(DealingDetail dealingDetail) {
    this.dealingDetail = dealingDetail;
  }

  public SubscriptionDetail initial(MinimunInvestmet initial) {
    this.initial = initial;
    return this;
  }

  /**
   * Get initial
   * @return initial
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MinimunInvestmet getInitial() {
    return initial;
  }

  public void setInitial(MinimunInvestmet initial) {
    this.initial = initial;
  }

  public SubscriptionDetail subsequent(MinimunInvestmet subsequent) {
    this.subsequent = subsequent;
    return this;
  }

  /**
   * Get subsequent
   * @return subsequent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MinimunInvestmet getSubsequent() {
    return subsequent;
  }

  public void setSubsequent(MinimunInvestmet subsequent) {
    this.subsequent = subsequent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDetail subscriptionDetail = (SubscriptionDetail) o;
    return Objects.equals(this.dealingDetail, subscriptionDetail.dealingDetail) &&
        Objects.equals(this.initial, subscriptionDetail.initial) &&
        Objects.equals(this.subsequent, subscriptionDetail.subsequent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingDetail, initial, subsequent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDetail {\n");
    
    sb.append("    dealingDetail: ").append(toIndentedString(dealingDetail)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    subsequent: ").append(toIndentedString(subsequent)).append("\n");
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

