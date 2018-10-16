package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DealingDetail;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RedemptionDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RedemptionDetail   {
  @JsonProperty("bufferPercentage")
  private Long bufferPercentage = null;

  @JsonProperty("dealingDetail")
  private DealingDetail dealingDetail = null;

  public RedemptionDetail bufferPercentage(Long bufferPercentage) {
    this.bufferPercentage = bufferPercentage;
    return this;
  }

  /**
   * Get bufferPercentage
   * @return bufferPercentage
  **/
  @ApiModelProperty(value = "")


  public Long getBufferPercentage() {
    return bufferPercentage;
  }

  public void setBufferPercentage(Long bufferPercentage) {
    this.bufferPercentage = bufferPercentage;
  }

  public RedemptionDetail dealingDetail(DealingDetail dealingDetail) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionDetail redemptionDetail = (RedemptionDetail) o;
    return Objects.equals(this.bufferPercentage, redemptionDetail.bufferPercentage) &&
        Objects.equals(this.dealingDetail, redemptionDetail.dealingDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufferPercentage, dealingDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionDetail {\n");
    
    sb.append("    bufferPercentage: ").append(toIndentedString(bufferPercentage)).append("\n");
    sb.append("    dealingDetail: ").append(toIndentedString(dealingDetail)).append("\n");
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

