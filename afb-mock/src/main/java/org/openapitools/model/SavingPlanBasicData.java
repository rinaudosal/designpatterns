package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlanBasicData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanBasicData   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("transactionTypeCode")
  private String transactionTypeCode = null;

  public SavingPlanBasicData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the {SavingPlan}. Refers to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the {SavingPlan}. Refers to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SavingPlanBasicData distributorId(Long distributorId) {
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

  public SavingPlanBasicData externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external reference of the {SavingPlan}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external reference of the {SavingPlan}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public SavingPlanBasicData statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of the {SavingPlan}. Refers to {listSavingPlanStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of the {SavingPlan}. Refers to {listSavingPlanStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public SavingPlanBasicData subdistributorId(Long subdistributorId) {
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

  public SavingPlanBasicData transactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
    return this;
  }

  /**
   * The transaction type associated to the {SavingPlan}. Refers to {listTransactionTypes}
   * @return transactionTypeCode
  **/
  @ApiModelProperty(value = "The transaction type associated to the {SavingPlan}. Refers to {listTransactionTypes}")


  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }

  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanBasicData savingPlanBasicData = (SavingPlanBasicData) o;
    return Objects.equals(this.currencyCode, savingPlanBasicData.currencyCode) &&
        Objects.equals(this.distributorId, savingPlanBasicData.distributorId) &&
        Objects.equals(this.externalReference, savingPlanBasicData.externalReference) &&
        Objects.equals(this.statusCode, savingPlanBasicData.statusCode) &&
        Objects.equals(this.subdistributorId, savingPlanBasicData.subdistributorId) &&
        Objects.equals(this.transactionTypeCode, savingPlanBasicData.transactionTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, distributorId, externalReference, statusCode, subdistributorId, transactionTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanBasicData {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
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

