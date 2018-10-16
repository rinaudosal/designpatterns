package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.OperationalPortfolioDealingInstrument;
import org.openapitools.model.OperationalPortfolioMovementFeeData;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioMovement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioMovement   {
  @JsonProperty("associatedContract")
  private ResourceReference associatedContract = null;

  @JsonProperty("associatedContractExternalReference")
  private String associatedContractExternalReference = null;

  @JsonProperty("associatedDealingFundHouse")
  private ResourceReference associatedDealingFundHouse = null;

  @JsonProperty("associatedDealingInstrument")
  private OperationalPortfolioDealingInstrument associatedDealingInstrument = null;

  @JsonProperty("authorizationNeeded")
  private Boolean authorizationNeeded = null;

  @JsonProperty("contract")
  private ResourceReference contract = null;

  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingFundHouse")
  private ResourceReference dealingFundHouse = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("movementDate")
  private OffsetDateTime movementDate = null;

  /**
   * Type of the movement, in order to define how to distribute the new money or how to redem. Enum to select between \"DIRECT\", \"PROPORTIONAL\" or \"TOTAL\".
   */
  public enum MovementTypeEnum {
    DIRECT("DIRECT"),
    
    PROPORTIONAL("PROPORTIONAL"),
    
    TOTAL("TOTAL");

    private String value;

    MovementTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MovementTypeEnum fromValue(String text) {
      for (MovementTypeEnum b : MovementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("movementType")
  private MovementTypeEnum movementType = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  @JsonProperty("operationalPortfolioMovementDealingInstrument")
  private OperationalPortfolioDealingInstrument operationalPortfolioMovementDealingInstrument = null;

  @JsonProperty("operationalPortfolioMovementFeeData")
  private OperationalPortfolioMovementFeeData operationalPortfolioMovementFeeData = null;

  @JsonProperty("operationalPortfolioMovementTypeCode")
  private String operationalPortfolioMovementTypeCode = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("requestedAmount")
  private Double requestedAmount = null;

  @JsonProperty("requestedShares")
  private Double requestedShares = null;

  /**
   * When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   */
  public enum ScopeEnum {
    MODEL_PORTFOLIO("MODEL_PORTFOLIO"),
    
    REAL_PORTFOLIO("REAL_PORTFOLIO");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("scope")
  private ScopeEnum scope = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public OperationalPortfolioMovement associatedContract(ResourceReference associatedContract) {
    this.associatedContract = associatedContract;
    return this;
  }

  /**
   * Get associatedContract
   * @return associatedContract
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getAssociatedContract() {
    return associatedContract;
  }

  public void setAssociatedContract(ResourceReference associatedContract) {
    this.associatedContract = associatedContract;
  }

  public OperationalPortfolioMovement associatedContractExternalReference(String associatedContractExternalReference) {
    this.associatedContractExternalReference = associatedContractExternalReference;
    return this;
  }

  /**
   * If the distributor has access to Spanish transfer, this field keeps the contract destination external reference of this transfer
   * @return associatedContractExternalReference
  **/
  @ApiModelProperty(value = "If the distributor has access to Spanish transfer, this field keeps the contract destination external reference of this transfer")


  public String getAssociatedContractExternalReference() {
    return associatedContractExternalReference;
  }

  public void setAssociatedContractExternalReference(String associatedContractExternalReference) {
    this.associatedContractExternalReference = associatedContractExternalReference;
  }

  public OperationalPortfolioMovement associatedDealingFundHouse(ResourceReference associatedDealingFundHouse) {
    this.associatedDealingFundHouse = associatedDealingFundHouse;
    return this;
  }

  /**
   * Get associatedDealingFundHouse
   * @return associatedDealingFundHouse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getAssociatedDealingFundHouse() {
    return associatedDealingFundHouse;
  }

  public void setAssociatedDealingFundHouse(ResourceReference associatedDealingFundHouse) {
    this.associatedDealingFundHouse = associatedDealingFundHouse;
  }

  public OperationalPortfolioMovement associatedDealingInstrument(OperationalPortfolioDealingInstrument associatedDealingInstrument) {
    this.associatedDealingInstrument = associatedDealingInstrument;
    return this;
  }

  /**
   * Get associatedDealingInstrument
   * @return associatedDealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioDealingInstrument getAssociatedDealingInstrument() {
    return associatedDealingInstrument;
  }

  public void setAssociatedDealingInstrument(OperationalPortfolioDealingInstrument associatedDealingInstrument) {
    this.associatedDealingInstrument = associatedDealingInstrument;
  }

  public OperationalPortfolioMovement authorizationNeeded(Boolean authorizationNeeded) {
    this.authorizationNeeded = authorizationNeeded;
    return this;
  }

  /**
   * Field to indicate if the {OperationalPortfolioMovement} crated needs authorization
   * @return authorizationNeeded
  **/
  @ApiModelProperty(value = "Field to indicate if the {OperationalPortfolioMovement} crated needs authorization")


  public Boolean getAuthorizationNeeded() {
    return authorizationNeeded;
  }

  public void setAuthorizationNeeded(Boolean authorizationNeeded) {
    this.authorizationNeeded = authorizationNeeded;
  }

  public OperationalPortfolioMovement contract(ResourceReference contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getContract() {
    return contract;
  }

  public void setContract(ResourceReference contract) {
    this.contract = contract;
  }

  public OperationalPortfolioMovement contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * Contract External Reference
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "Contract External Reference")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public OperationalPortfolioMovement currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the {OperationalPortfolioMovement}. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the {OperationalPortfolioMovement}. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OperationalPortfolioMovement dealingFundHouse(ResourceReference dealingFundHouse) {
    this.dealingFundHouse = dealingFundHouse;
    return this;
  }

  /**
   * Get dealingFundHouse
   * @return dealingFundHouse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getDealingFundHouse() {
    return dealingFundHouse;
  }

  public void setDealingFundHouse(ResourceReference dealingFundHouse) {
    this.dealingFundHouse = dealingFundHouse;
  }

  public OperationalPortfolioMovement distributorId(Long distributorId) {
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

  public OperationalPortfolioMovement externalReference(String externalReference) {
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

  public OperationalPortfolioMovement id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolioOrder}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolioOrder}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OperationalPortfolioMovement movementDate(OffsetDateTime movementDate) {
    this.movementDate = movementDate;
    return this;
  }

  /**
   * The {OperationalPortfolioMovement} date
   * @return movementDate
  **/
  @ApiModelProperty(value = "The {OperationalPortfolioMovement} date")

  @Valid

  public OffsetDateTime getMovementDate() {
    return movementDate;
  }

  public void setMovementDate(OffsetDateTime movementDate) {
    this.movementDate = movementDate;
  }

  public OperationalPortfolioMovement movementType(MovementTypeEnum movementType) {
    this.movementType = movementType;
    return this;
  }

  /**
   * Type of the movement, in order to define how to distribute the new money or how to redem. Enum to select between \"DIRECT\", \"PROPORTIONAL\" or \"TOTAL\".
   * @return movementType
  **/
  @ApiModelProperty(value = "Type of the movement, in order to define how to distribute the new money or how to redem. Enum to select between \"DIRECT\", \"PROPORTIONAL\" or \"TOTAL\".")


  public MovementTypeEnum getMovementType() {
    return movementType;
  }

  public void setMovementType(MovementTypeEnum movementType) {
    this.movementType = movementType;
  }

  public OperationalPortfolioMovement operationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolio}
   * @return operationalPortfolioId
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolio}")


  public Long getOperationalPortfolioId() {
    return operationalPortfolioId;
  }

  public void setOperationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
  }

  public OperationalPortfolioMovement operationalPortfolioMovementDealingInstrument(OperationalPortfolioDealingInstrument operationalPortfolioMovementDealingInstrument) {
    this.operationalPortfolioMovementDealingInstrument = operationalPortfolioMovementDealingInstrument;
    return this;
  }

  /**
   * Get operationalPortfolioMovementDealingInstrument
   * @return operationalPortfolioMovementDealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioDealingInstrument getOperationalPortfolioMovementDealingInstrument() {
    return operationalPortfolioMovementDealingInstrument;
  }

  public void setOperationalPortfolioMovementDealingInstrument(OperationalPortfolioDealingInstrument operationalPortfolioMovementDealingInstrument) {
    this.operationalPortfolioMovementDealingInstrument = operationalPortfolioMovementDealingInstrument;
  }

  public OperationalPortfolioMovement operationalPortfolioMovementFeeData(OperationalPortfolioMovementFeeData operationalPortfolioMovementFeeData) {
    this.operationalPortfolioMovementFeeData = operationalPortfolioMovementFeeData;
    return this;
  }

  /**
   * Get operationalPortfolioMovementFeeData
   * @return operationalPortfolioMovementFeeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioMovementFeeData getOperationalPortfolioMovementFeeData() {
    return operationalPortfolioMovementFeeData;
  }

  public void setOperationalPortfolioMovementFeeData(OperationalPortfolioMovementFeeData operationalPortfolioMovementFeeData) {
    this.operationalPortfolioMovementFeeData = operationalPortfolioMovementFeeData;
  }

  public OperationalPortfolioMovement operationalPortfolioMovementTypeCode(String operationalPortfolioMovementTypeCode) {
    this.operationalPortfolioMovementTypeCode = operationalPortfolioMovementTypeCode;
    return this;
  }

  /**
   * Movement type for operational portfolio. Refer to {listOperationalPortfolioMovementTypes}
   * @return operationalPortfolioMovementTypeCode
  **/
  @ApiModelProperty(value = "Movement type for operational portfolio. Refer to {listOperationalPortfolioMovementTypes}")


  public String getOperationalPortfolioMovementTypeCode() {
    return operationalPortfolioMovementTypeCode;
  }

  public void setOperationalPortfolioMovementTypeCode(String operationalPortfolioMovementTypeCode) {
    this.operationalPortfolioMovementTypeCode = operationalPortfolioMovementTypeCode;
  }

  public OperationalPortfolioMovement productId(Long productId) {
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

  public OperationalPortfolioMovement requestedAmount(Double requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

  /**
   * Amount requested in the {OperationalPortfolioMovement}. Expressed in {OperationalPortfolioMovement.currencyCode}
   * @return requestedAmount
  **/
  @ApiModelProperty(value = "Amount requested in the {OperationalPortfolioMovement}. Expressed in {OperationalPortfolioMovement.currencyCode}")


  public Double getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(Double requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public OperationalPortfolioMovement requestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
    return this;
  }

  /**
   * Shares requested in the {OperationalPortfolioMovement}. Only available for Spanish transfer contributions or withdrawals.
   * @return requestedShares
  **/
  @ApiModelProperty(value = "Shares requested in the {OperationalPortfolioMovement}. Only available for Spanish transfer contributions or withdrawals.")


  public Double getRequestedShares() {
    return requestedShares;
  }

  public void setRequestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
  }

  public OperationalPortfolioMovement scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   * @return scope
  **/
  @ApiModelProperty(value = "When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".")


  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public OperationalPortfolioMovement subdistributorId(Long subdistributorId) {
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
    OperationalPortfolioMovement operationalPortfolioMovement = (OperationalPortfolioMovement) o;
    return Objects.equals(this.associatedContract, operationalPortfolioMovement.associatedContract) &&
        Objects.equals(this.associatedContractExternalReference, operationalPortfolioMovement.associatedContractExternalReference) &&
        Objects.equals(this.associatedDealingFundHouse, operationalPortfolioMovement.associatedDealingFundHouse) &&
        Objects.equals(this.associatedDealingInstrument, operationalPortfolioMovement.associatedDealingInstrument) &&
        Objects.equals(this.authorizationNeeded, operationalPortfolioMovement.authorizationNeeded) &&
        Objects.equals(this.contract, operationalPortfolioMovement.contract) &&
        Objects.equals(this.contractExternalReference, operationalPortfolioMovement.contractExternalReference) &&
        Objects.equals(this.currencyCode, operationalPortfolioMovement.currencyCode) &&
        Objects.equals(this.dealingFundHouse, operationalPortfolioMovement.dealingFundHouse) &&
        Objects.equals(this.distributorId, operationalPortfolioMovement.distributorId) &&
        Objects.equals(this.externalReference, operationalPortfolioMovement.externalReference) &&
        Objects.equals(this.id, operationalPortfolioMovement.id) &&
        Objects.equals(this.movementDate, operationalPortfolioMovement.movementDate) &&
        Objects.equals(this.movementType, operationalPortfolioMovement.movementType) &&
        Objects.equals(this.operationalPortfolioId, operationalPortfolioMovement.operationalPortfolioId) &&
        Objects.equals(this.operationalPortfolioMovementDealingInstrument, operationalPortfolioMovement.operationalPortfolioMovementDealingInstrument) &&
        Objects.equals(this.operationalPortfolioMovementFeeData, operationalPortfolioMovement.operationalPortfolioMovementFeeData) &&
        Objects.equals(this.operationalPortfolioMovementTypeCode, operationalPortfolioMovement.operationalPortfolioMovementTypeCode) &&
        Objects.equals(this.productId, operationalPortfolioMovement.productId) &&
        Objects.equals(this.requestedAmount, operationalPortfolioMovement.requestedAmount) &&
        Objects.equals(this.requestedShares, operationalPortfolioMovement.requestedShares) &&
        Objects.equals(this.scope, operationalPortfolioMovement.scope) &&
        Objects.equals(this.subdistributorId, operationalPortfolioMovement.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedContract, associatedContractExternalReference, associatedDealingFundHouse, associatedDealingInstrument, authorizationNeeded, contract, contractExternalReference, currencyCode, dealingFundHouse, distributorId, externalReference, id, movementDate, movementType, operationalPortfolioId, operationalPortfolioMovementDealingInstrument, operationalPortfolioMovementFeeData, operationalPortfolioMovementTypeCode, productId, requestedAmount, requestedShares, scope, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioMovement {\n");
    
    sb.append("    associatedContract: ").append(toIndentedString(associatedContract)).append("\n");
    sb.append("    associatedContractExternalReference: ").append(toIndentedString(associatedContractExternalReference)).append("\n");
    sb.append("    associatedDealingFundHouse: ").append(toIndentedString(associatedDealingFundHouse)).append("\n");
    sb.append("    associatedDealingInstrument: ").append(toIndentedString(associatedDealingInstrument)).append("\n");
    sb.append("    authorizationNeeded: ").append(toIndentedString(authorizationNeeded)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingFundHouse: ").append(toIndentedString(dealingFundHouse)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    movementDate: ").append(toIndentedString(movementDate)).append("\n");
    sb.append("    movementType: ").append(toIndentedString(movementType)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    operationalPortfolioMovementDealingInstrument: ").append(toIndentedString(operationalPortfolioMovementDealingInstrument)).append("\n");
    sb.append("    operationalPortfolioMovementFeeData: ").append(toIndentedString(operationalPortfolioMovementFeeData)).append("\n");
    sb.append("    operationalPortfolioMovementTypeCode: ").append(toIndentedString(operationalPortfolioMovementTypeCode)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    requestedShares: ").append(toIndentedString(requestedShares)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

