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
 * TransferSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransferSummary   {
  @JsonProperty("actionTransfer")
  private String actionTransfer = null;

  @JsonProperty("ammountShares")
  private String ammountShares = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("numberAsociatedTransfer")
  private Long numberAsociatedTransfer = null;

  @JsonProperty("numberTransfer")
  private Long numberTransfer = null;

  @JsonProperty("requestType")
  private String requestType = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("transferType")
  private String transferType = null;

  @JsonProperty("userTransfer")
  private String userTransfer = null;

  public TransferSummary actionTransfer(String actionTransfer) {
    this.actionTransfer = actionTransfer;
    return this;
  }

  /**
   * Action transfer
   * @return actionTransfer
  **/
  @ApiModelProperty(value = "Action transfer")


  public String getActionTransfer() {
    return actionTransfer;
  }

  public void setActionTransfer(String actionTransfer) {
    this.actionTransfer = actionTransfer;
  }

  public TransferSummary ammountShares(String ammountShares) {
    this.ammountShares = ammountShares;
    return this;
  }

  /**
   * Ammount/Shares
   * @return ammountShares
  **/
  @ApiModelProperty(value = "Ammount/Shares")


  public String getAmmountShares() {
    return ammountShares;
  }

  public void setAmmountShares(String ammountShares) {
    this.ammountShares = ammountShares;
  }

  public TransferSummary creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Creation date transfer
   * @return creationDate
  **/
  @ApiModelProperty(value = "Creation date transfer")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public TransferSummary numberAsociatedTransfer(Long numberAsociatedTransfer) {
    this.numberAsociatedTransfer = numberAsociatedTransfer;
    return this;
  }

  /**
   * Number Asociated Transfer
   * @return numberAsociatedTransfer
  **/
  @ApiModelProperty(value = "Number Asociated Transfer")


  public Long getNumberAsociatedTransfer() {
    return numberAsociatedTransfer;
  }

  public void setNumberAsociatedTransfer(Long numberAsociatedTransfer) {
    this.numberAsociatedTransfer = numberAsociatedTransfer;
  }

  public TransferSummary numberTransfer(Long numberTransfer) {
    this.numberTransfer = numberTransfer;
    return this;
  }

  /**
   * Number Transfer
   * @return numberTransfer
  **/
  @ApiModelProperty(value = "Number Transfer")


  public Long getNumberTransfer() {
    return numberTransfer;
  }

  public void setNumberTransfer(Long numberTransfer) {
    this.numberTransfer = numberTransfer;
  }

  public TransferSummary requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

  /**
   * Request type
   * @return requestType
  **/
  @ApiModelProperty(value = "Request type")


  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public TransferSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status
   * @return status
  **/
  @ApiModelProperty(value = "Status")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransferSummary subdistributorId(Long subdistributorId) {
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

  public TransferSummary transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

  /**
   * Transfer type
   * @return transferType
  **/
  @ApiModelProperty(value = "Transfer type")


  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public TransferSummary userTransfer(String userTransfer) {
    this.userTransfer = userTransfer;
    return this;
  }

  /**
   * User transfer
   * @return userTransfer
  **/
  @ApiModelProperty(value = "User transfer")


  public String getUserTransfer() {
    return userTransfer;
  }

  public void setUserTransfer(String userTransfer) {
    this.userTransfer = userTransfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferSummary transferSummary = (TransferSummary) o;
    return Objects.equals(this.actionTransfer, transferSummary.actionTransfer) &&
        Objects.equals(this.ammountShares, transferSummary.ammountShares) &&
        Objects.equals(this.creationDate, transferSummary.creationDate) &&
        Objects.equals(this.numberAsociatedTransfer, transferSummary.numberAsociatedTransfer) &&
        Objects.equals(this.numberTransfer, transferSummary.numberTransfer) &&
        Objects.equals(this.requestType, transferSummary.requestType) &&
        Objects.equals(this.status, transferSummary.status) &&
        Objects.equals(this.subdistributorId, transferSummary.subdistributorId) &&
        Objects.equals(this.transferType, transferSummary.transferType) &&
        Objects.equals(this.userTransfer, transferSummary.userTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTransfer, ammountShares, creationDate, numberAsociatedTransfer, numberTransfer, requestType, status, subdistributorId, transferType, userTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferSummary {\n");
    
    sb.append("    actionTransfer: ").append(toIndentedString(actionTransfer)).append("\n");
    sb.append("    ammountShares: ").append(toIndentedString(ammountShares)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    numberAsociatedTransfer: ").append(toIndentedString(numberAsociatedTransfer)).append("\n");
    sb.append("    numberTransfer: ").append(toIndentedString(numberTransfer)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    userTransfer: ").append(toIndentedString(userTransfer)).append("\n");
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

