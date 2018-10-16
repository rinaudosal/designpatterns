package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OperationEtfData;
import org.openapitools.model.OperationItem;
import org.openapitools.model.OperationSettingsData;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Operation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Operation   {
  @JsonProperty("contributions")
  @Valid
  private List<OperationItem> contributions = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   */
  public enum DealingInstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    DealingInstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DealingInstrumentTypeEnum fromValue(String text) {
      for (DealingInstrumentTypeEnum b : DealingInstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("dealingInstrumentType")
  private DealingInstrumentTypeEnum dealingInstrumentType = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("operationEtfData")
  private OperationEtfData operationEtfData = null;

  @JsonProperty("operationSettingsData")
  private OperationSettingsData operationSettingsData = null;

  @JsonProperty("operationTypeCode")
  private String operationTypeCode = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("withdrawal")
  private OperationItem withdrawal = null;

  public Operation contributions(List<OperationItem> contributions) {
    this.contributions = contributions;
    return this;
  }

  public Operation addContributionsItem(OperationItem contributionsItem) {
    if (this.contributions == null) {
      this.contributions = new ArrayList<>();
    }
    this.contributions.add(contributionsItem);
    return this;
  }

  /**
   * The array of {OperationItem}
   * @return contributions
  **/
  @ApiModelProperty(value = "The array of {OperationItem}")

  @Valid

  public List<OperationItem> getContributions() {
    return contributions;
  }

  public void setContributions(List<OperationItem> contributions) {
    this.contributions = contributions;
  }

  public Operation dealingFundHouseId(Long dealingFundHouseId) {
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

  public Operation dealingInstrument(ResourceReference dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
    return this;
  }

  /**
   * Get dealingInstrument
   * @return dealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getDealingInstrument() {
    return dealingInstrument;
  }

  public void setDealingInstrument(ResourceReference dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
  }

  public Operation dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public Operation distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public Operation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Operation Id
   * @return id
  **/
  @ApiModelProperty(value = "Operation Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Operation operationEtfData(OperationEtfData operationEtfData) {
    this.operationEtfData = operationEtfData;
    return this;
  }

  /**
   * Get operationEtfData
   * @return operationEtfData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationEtfData getOperationEtfData() {
    return operationEtfData;
  }

  public void setOperationEtfData(OperationEtfData operationEtfData) {
    this.operationEtfData = operationEtfData;
  }

  public Operation operationSettingsData(OperationSettingsData operationSettingsData) {
    this.operationSettingsData = operationSettingsData;
    return this;
  }

  /**
   * Get operationSettingsData
   * @return operationSettingsData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationSettingsData getOperationSettingsData() {
    return operationSettingsData;
  }

  public void setOperationSettingsData(OperationSettingsData operationSettingsData) {
    this.operationSettingsData = operationSettingsData;
  }

  public Operation operationTypeCode(String operationTypeCode) {
    this.operationTypeCode = operationTypeCode;
    return this;
  }

  /**
   * Operation type. Refer to {listOperationTypes}
   * @return operationTypeCode
  **/
  @ApiModelProperty(value = "Operation type. Refer to {listOperationTypes}")


  public String getOperationTypeCode() {
    return operationTypeCode;
  }

  public void setOperationTypeCode(String operationTypeCode) {
    this.operationTypeCode = operationTypeCode;
  }

  public Operation subdistributorId(Long subdistributorId) {
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

  public Operation withdrawal(OperationItem withdrawal) {
    this.withdrawal = withdrawal;
    return this;
  }

  /**
   * Get withdrawal
   * @return withdrawal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationItem getWithdrawal() {
    return withdrawal;
  }

  public void setWithdrawal(OperationItem withdrawal) {
    this.withdrawal = withdrawal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.contributions, operation.contributions) &&
        Objects.equals(this.dealingFundHouseId, operation.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrument, operation.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, operation.dealingInstrumentType) &&
        Objects.equals(this.distributorId, operation.distributorId) &&
        Objects.equals(this.id, operation.id) &&
        Objects.equals(this.operationEtfData, operation.operationEtfData) &&
        Objects.equals(this.operationSettingsData, operation.operationSettingsData) &&
        Objects.equals(this.operationTypeCode, operation.operationTypeCode) &&
        Objects.equals(this.subdistributorId, operation.subdistributorId) &&
        Objects.equals(this.withdrawal, operation.withdrawal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributions, dealingFundHouseId, dealingInstrument, dealingInstrumentType, distributorId, id, operationEtfData, operationSettingsData, operationTypeCode, subdistributorId, withdrawal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    contributions: ").append(toIndentedString(contributions)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationEtfData: ").append(toIndentedString(operationEtfData)).append("\n");
    sb.append("    operationSettingsData: ").append(toIndentedString(operationSettingsData)).append("\n");
    sb.append("    operationTypeCode: ").append(toIndentedString(operationTypeCode)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    withdrawal: ").append(toIndentedString(withdrawal)).append("\n");
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

