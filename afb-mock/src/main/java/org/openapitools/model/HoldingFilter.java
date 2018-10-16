package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the search criteria to obtain the valuations of the fund positions.
 */
@ApiModel(description = "Defines the search criteria to obtain the valuations of the fund positions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HoldingFilter   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrumentIds")
  @Valid
  private List<Long> dealingInstrumentIds = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("settlementDate")
  private OffsetDateTime settlementDate = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public HoldingFilter accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The Id of the {Account}
   * @return accountId
  **/
  @ApiModelProperty(value = "The Id of the {Account}")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public HoldingFilter contractExternalReference(String contractExternalReference) {
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

  public HoldingFilter dealingFundHouseId(Long dealingFundHouseId) {
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

  public HoldingFilter dealingInstrumentIds(List<Long> dealingInstrumentIds) {
    this.dealingInstrumentIds = dealingInstrumentIds;
    return this;
  }

  public HoldingFilter addDealingInstrumentIdsItem(Long dealingInstrumentIdsItem) {
    if (this.dealingInstrumentIds == null) {
      this.dealingInstrumentIds = new ArrayList<>();
    }
    this.dealingInstrumentIds.add(dealingInstrumentIdsItem);
    return this;
  }

  /**
   * Get dealingInstrumentIds
   * @return dealingInstrumentIds
  **/
  @ApiModelProperty(value = "")


  public List<Long> getDealingInstrumentIds() {
    return dealingInstrumentIds;
  }

  public void setDealingInstrumentIds(List<Long> dealingInstrumentIds) {
    this.dealingInstrumentIds = dealingInstrumentIds;
  }

  public HoldingFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public HoldingFilter settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

  /**
   * Settlement date from to component
   * @return settlementDate
  **/
  @ApiModelProperty(value = "Settlement date from to component")

  @Valid

  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }

  public HoldingFilter subdistributorId(Long subdistributorId) {
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
    HoldingFilter holdingFilter = (HoldingFilter) o;
    return Objects.equals(this.accountId, holdingFilter.accountId) &&
        Objects.equals(this.contractExternalReference, holdingFilter.contractExternalReference) &&
        Objects.equals(this.dealingFundHouseId, holdingFilter.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrumentIds, holdingFilter.dealingInstrumentIds) &&
        Objects.equals(this.productId, holdingFilter.productId) &&
        Objects.equals(this.settlementDate, holdingFilter.settlementDate) &&
        Objects.equals(this.subdistributorId, holdingFilter.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, contractExternalReference, dealingFundHouseId, dealingInstrumentIds, productId, settlementDate, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingFilter {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrumentIds: ").append(toIndentedString(dealingInstrumentIds)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
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

