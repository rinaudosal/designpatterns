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
 * TransactionMonitoringFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionMonitoringFilter   {
  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("operationalPortfolioOrderOriginCode")
  private String operationalPortfolioOrderOriginCode = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public TransactionMonitoringFilter contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * The {Contract.externalReference}
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "The {Contract.externalReference}")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public TransactionMonitoringFilter dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public TransactionMonitoringFilter dealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
    return this;
  }

  /**
   * The Id of the {DealingInstrument}
   * @return dealingInstrumentId
  **/
  @ApiModelProperty(value = "The Id of the {DealingInstrument}")


  public Long getDealingInstrumentId() {
    return dealingInstrumentId;
  }

  public void setDealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
  }

  public TransactionMonitoringFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Latest date to look for {OperationalPortfolioOrder.priceDate}
   * @return endDate
  **/
  @ApiModelProperty(value = "Latest date to look for {OperationalPortfolioOrder.priceDate}")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public TransactionMonitoringFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External reference associated to the {OperationalPortfolioMovement}
   * @return externalReference
  **/
  @ApiModelProperty(value = "External reference associated to the {OperationalPortfolioMovement}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public TransactionMonitoringFilter operationalPortfolioOrderOriginCode(String operationalPortfolioOrderOriginCode) {
    this.operationalPortfolioOrderOriginCode = operationalPortfolioOrderOriginCode;
    return this;
  }

  /**
   * The status of {TransactionMonitoring}. Refer to {listOperationalPortfolioOrderOrigin}
   * @return operationalPortfolioOrderOriginCode
  **/
  @ApiModelProperty(value = "The status of {TransactionMonitoring}. Refer to {listOperationalPortfolioOrderOrigin}")


  public String getOperationalPortfolioOrderOriginCode() {
    return operationalPortfolioOrderOriginCode;
  }

  public void setOperationalPortfolioOrderOriginCode(String operationalPortfolioOrderOriginCode) {
    this.operationalPortfolioOrderOriginCode = operationalPortfolioOrderOriginCode;
  }

  public TransactionMonitoringFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Earliest date to look for {OperationalPortfolioOrder.priceDate}
   * @return startDate
  **/
  @ApiModelProperty(value = "Earliest date to look for {OperationalPortfolioOrder.priceDate}")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public TransactionMonitoringFilter subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Subdistributor}")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionMonitoringFilter transactionMonitoringFilter = (TransactionMonitoringFilter) o;
    return Objects.equals(this.contractExternalReference, transactionMonitoringFilter.contractExternalReference) &&
        Objects.equals(this.dealingFundHouseId, transactionMonitoringFilter.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrumentId, transactionMonitoringFilter.dealingInstrumentId) &&
        Objects.equals(this.endDate, transactionMonitoringFilter.endDate) &&
        Objects.equals(this.externalReference, transactionMonitoringFilter.externalReference) &&
        Objects.equals(this.operationalPortfolioOrderOriginCode, transactionMonitoringFilter.operationalPortfolioOrderOriginCode) &&
        Objects.equals(this.startDate, transactionMonitoringFilter.startDate) &&
        Objects.equals(this.subdistributorId, transactionMonitoringFilter.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractExternalReference, dealingFundHouseId, dealingInstrumentId, endDate, externalReference, operationalPortfolioOrderOriginCode, startDate, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionMonitoringFilter {\n");
    
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    operationalPortfolioOrderOriginCode: ").append(toIndentedString(operationalPortfolioOrderOriginCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
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

