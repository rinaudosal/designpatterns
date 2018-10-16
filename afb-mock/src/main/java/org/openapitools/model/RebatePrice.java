package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.BasicRebate;
import org.openapitools.model.FeeData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RebatePrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebatePrice   {
  @JsonProperty("assetManagementHouseTrancheApplied")
  private Double assetManagementHouseTrancheApplied = null;

  @JsonProperty("basicRebate")
  private BasicRebate basicRebate = null;

  @JsonProperty("basisPoints")
  private Double basisPoints = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("feeData")
  private FeeData feeData = null;

  @JsonProperty("rebatePercentage")
  private Double rebatePercentage = null;

  @JsonProperty("valueDate")
  private OffsetDateTime valueDate = null;

  public RebatePrice assetManagementHouseTrancheApplied(Double assetManagementHouseTrancheApplied) {
    this.assetManagementHouseTrancheApplied = assetManagementHouseTrancheApplied;
    return this;
  }

  /**
   * The tranche of de {DealingFundHouse} applied
   * @return assetManagementHouseTrancheApplied
  **/
  @ApiModelProperty(value = "The tranche of de {DealingFundHouse} applied")


  public Double getAssetManagementHouseTrancheApplied() {
    return assetManagementHouseTrancheApplied;
  }

  public void setAssetManagementHouseTrancheApplied(Double assetManagementHouseTrancheApplied) {
    this.assetManagementHouseTrancheApplied = assetManagementHouseTrancheApplied;
  }

  public RebatePrice basicRebate(BasicRebate basicRebate) {
    this.basicRebate = basicRebate;
    return this;
  }

  /**
   * Get basicRebate
   * @return basicRebate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicRebate getBasicRebate() {
    return basicRebate;
  }

  public void setBasicRebate(BasicRebate basicRebate) {
    this.basicRebate = basicRebate;
  }

  public RebatePrice basisPoints(Double basisPoints) {
    this.basisPoints = basisPoints;
    return this;
  }

  /**
   * The {Rebate} basis points value (BPS)
   * @return basisPoints
  **/
  @ApiModelProperty(value = "The {Rebate} basis points value (BPS)")


  public Double getBasisPoints() {
    return basisPoints;
  }

  public void setBasisPoints(Double basisPoints) {
    this.basisPoints = basisPoints;
  }

  public RebatePrice dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The id of the {DealingFundHouse}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The id of the {DealingFundHouse}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public RebatePrice feeData(FeeData feeData) {
    this.feeData = feeData;
    return this;
  }

  /**
   * Get feeData
   * @return feeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FeeData getFeeData() {
    return feeData;
  }

  public void setFeeData(FeeData feeData) {
    this.feeData = feeData;
  }

  public RebatePrice rebatePercentage(Double rebatePercentage) {
    this.rebatePercentage = rebatePercentage;
    return this;
  }

  /**
   * The value of the {Rebate} percentage
   * @return rebatePercentage
  **/
  @ApiModelProperty(value = "The value of the {Rebate} percentage")


  public Double getRebatePercentage() {
    return rebatePercentage;
  }

  public void setRebatePercentage(Double rebatePercentage) {
    this.rebatePercentage = rebatePercentage;
  }

  public RebatePrice valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The value date
   * @return valueDate
  **/
  @ApiModelProperty(value = "The value date")

  @Valid

  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebatePrice rebatePrice = (RebatePrice) o;
    return Objects.equals(this.assetManagementHouseTrancheApplied, rebatePrice.assetManagementHouseTrancheApplied) &&
        Objects.equals(this.basicRebate, rebatePrice.basicRebate) &&
        Objects.equals(this.basisPoints, rebatePrice.basisPoints) &&
        Objects.equals(this.dealingFundHouseId, rebatePrice.dealingFundHouseId) &&
        Objects.equals(this.feeData, rebatePrice.feeData) &&
        Objects.equals(this.rebatePercentage, rebatePrice.rebatePercentage) &&
        Objects.equals(this.valueDate, rebatePrice.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetManagementHouseTrancheApplied, basicRebate, basisPoints, dealingFundHouseId, feeData, rebatePercentage, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebatePrice {\n");
    
    sb.append("    assetManagementHouseTrancheApplied: ").append(toIndentedString(assetManagementHouseTrancheApplied)).append("\n");
    sb.append("    basicRebate: ").append(toIndentedString(basicRebate)).append("\n");
    sb.append("    basisPoints: ").append(toIndentedString(basisPoints)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    feeData: ").append(toIndentedString(feeData)).append("\n");
    sb.append("    rebatePercentage: ").append(toIndentedString(rebatePercentage)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

