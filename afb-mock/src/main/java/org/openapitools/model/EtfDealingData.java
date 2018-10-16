package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about the ETF dealing process
 */
@ApiModel(description = "This object keeps specific information about the ETF dealing process")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EtfDealingData   {
  @JsonProperty("dealingTypeCode")
  private String dealingTypeCode = null;

  @JsonProperty("executeShares")
  private Double executeShares = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("launchPrice")
  private Double launchPrice = null;

  @JsonProperty("pendingShares")
  private Double pendingShares = null;

  @JsonProperty("validityPeriodCode")
  private String validityPeriodCode = null;

  public EtfDealingData dealingTypeCode(String dealingTypeCode) {
    this.dealingTypeCode = dealingTypeCode;
    return this;
  }

  /**
   * Defines the ETF dealing type. Refer to {listEtfDealingTypes}
   * @return dealingTypeCode
  **/
  @ApiModelProperty(value = "Defines the ETF dealing type. Refer to {listEtfDealingTypes}")


  public String getDealingTypeCode() {
    return dealingTypeCode;
  }

  public void setDealingTypeCode(String dealingTypeCode) {
    this.dealingTypeCode = dealingTypeCode;
  }

  public EtfDealingData executeShares(Double executeShares) {
    this.executeShares = executeShares;
    return this;
  }

  /**
   * Miminum amount for the order execution.
   * @return executeShares
  **/
  @ApiModelProperty(value = "Miminum amount for the order execution.")


  public Double getExecuteShares() {
    return executeShares;
  }

  public void setExecuteShares(Double executeShares) {
    this.executeShares = executeShares;
  }

  public EtfDealingData expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Defines the date when the order expires
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Defines the date when the order expires")

  @Valid

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public EtfDealingData launchPrice(Double launchPrice) {
    this.launchPrice = launchPrice;
    return this;
  }

  /**
   * Defines the launch price for the ETF dealing.
   * @return launchPrice
  **/
  @ApiModelProperty(value = "Defines the launch price for the ETF dealing.")


  public Double getLaunchPrice() {
    return launchPrice;
  }

  public void setLaunchPrice(Double launchPrice) {
    this.launchPrice = launchPrice;
  }

  public EtfDealingData pendingShares(Double pendingShares) {
    this.pendingShares = pendingShares;
    return this;
  }

  /**
   * Miminum amount for the order execution.
   * @return pendingShares
  **/
  @ApiModelProperty(value = "Miminum amount for the order execution.")


  public Double getPendingShares() {
    return pendingShares;
  }

  public void setPendingShares(Double pendingShares) {
    this.pendingShares = pendingShares;
  }

  public EtfDealingData validityPeriodCode(String validityPeriodCode) {
    this.validityPeriodCode = validityPeriodCode;
    return this;
  }

  /**
   * Defines ETF dealing validity period. Refer to {listEtfDealingValidityPeriods}
   * @return validityPeriodCode
  **/
  @ApiModelProperty(value = "Defines ETF dealing validity period. Refer to {listEtfDealingValidityPeriods}")


  public String getValidityPeriodCode() {
    return validityPeriodCode;
  }

  public void setValidityPeriodCode(String validityPeriodCode) {
    this.validityPeriodCode = validityPeriodCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtfDealingData etfDealingData = (EtfDealingData) o;
    return Objects.equals(this.dealingTypeCode, etfDealingData.dealingTypeCode) &&
        Objects.equals(this.executeShares, etfDealingData.executeShares) &&
        Objects.equals(this.expirationDate, etfDealingData.expirationDate) &&
        Objects.equals(this.launchPrice, etfDealingData.launchPrice) &&
        Objects.equals(this.pendingShares, etfDealingData.pendingShares) &&
        Objects.equals(this.validityPeriodCode, etfDealingData.validityPeriodCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingTypeCode, executeShares, expirationDate, launchPrice, pendingShares, validityPeriodCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtfDealingData {\n");
    
    sb.append("    dealingTypeCode: ").append(toIndentedString(dealingTypeCode)).append("\n");
    sb.append("    executeShares: ").append(toIndentedString(executeShares)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    launchPrice: ").append(toIndentedString(launchPrice)).append("\n");
    sb.append("    pendingShares: ").append(toIndentedString(pendingShares)).append("\n");
    sb.append("    validityPeriodCode: ").append(toIndentedString(validityPeriodCode)).append("\n");
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

