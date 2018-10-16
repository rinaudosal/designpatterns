package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderMonitoringFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderMonitoringFilter   {
  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

  @JsonProperty("operationalPortfolioMovementId")
  private Long operationalPortfolioMovementId = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public OrderMonitoringFilter contractExternalReference(String contractExternalReference) {
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

  public OrderMonitoringFilter dealingInstrumentId(Long dealingInstrumentId) {
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

  public OrderMonitoringFilter operationalPortfolioMovementId(Long operationalPortfolioMovementId) {
    this.operationalPortfolioMovementId = operationalPortfolioMovementId;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolioMovement}
   * @return operationalPortfolioMovementId
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolioMovement}")


  public Long getOperationalPortfolioMovementId() {
    return operationalPortfolioMovementId;
  }

  public void setOperationalPortfolioMovementId(Long operationalPortfolioMovementId) {
    this.operationalPortfolioMovementId = operationalPortfolioMovementId;
  }

  public OrderMonitoringFilter subdistributorId(Long subdistributorId) {
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
    OrderMonitoringFilter orderMonitoringFilter = (OrderMonitoringFilter) o;
    return Objects.equals(this.contractExternalReference, orderMonitoringFilter.contractExternalReference) &&
        Objects.equals(this.dealingInstrumentId, orderMonitoringFilter.dealingInstrumentId) &&
        Objects.equals(this.operationalPortfolioMovementId, orderMonitoringFilter.operationalPortfolioMovementId) &&
        Objects.equals(this.subdistributorId, orderMonitoringFilter.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractExternalReference, dealingInstrumentId, operationalPortfolioMovementId, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMonitoringFilter {\n");
    
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    operationalPortfolioMovementId: ").append(toIndentedString(operationalPortfolioMovementId)).append("\n");
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

