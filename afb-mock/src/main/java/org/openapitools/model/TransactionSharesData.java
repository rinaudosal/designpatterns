package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about the shares of the transaction.
 */
@ApiModel(description = "This object keeps information about the shares of the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionSharesData   {
  @JsonProperty("awardedShares")
  private Double awardedShares = null;

  @JsonProperty("confirmedSharedAfterDistribution")
  private Double confirmedSharedAfterDistribution = null;

  @JsonProperty("confirmedSharesBeforeDistribution")
  private Double confirmedSharesBeforeDistribution = null;

  @JsonProperty("requestedShares")
  private Double requestedShares = null;

  @JsonProperty("sharesAtCutoffDate")
  private Double sharesAtCutoffDate = null;

  public TransactionSharesData awardedShares(Double awardedShares) {
    this.awardedShares = awardedShares;
    return this;
  }

  /**
   * Awarded shares assigned to the transaction
   * @return awardedShares
  **/
  @ApiModelProperty(value = "Awarded shares assigned to the transaction")


  public Double getAwardedShares() {
    return awardedShares;
  }

  public void setAwardedShares(Double awardedShares) {
    this.awardedShares = awardedShares;
  }

  public TransactionSharesData confirmedSharedAfterDistribution(Double confirmedSharedAfterDistribution) {
    this.confirmedSharedAfterDistribution = confirmedSharedAfterDistribution;
    return this;
  }

  /**
   * Confirmed shares after last distribution
   * @return confirmedSharedAfterDistribution
  **/
  @ApiModelProperty(value = "Confirmed shares after last distribution")


  public Double getConfirmedSharedAfterDistribution() {
    return confirmedSharedAfterDistribution;
  }

  public void setConfirmedSharedAfterDistribution(Double confirmedSharedAfterDistribution) {
    this.confirmedSharedAfterDistribution = confirmedSharedAfterDistribution;
  }

  public TransactionSharesData confirmedSharesBeforeDistribution(Double confirmedSharesBeforeDistribution) {
    this.confirmedSharesBeforeDistribution = confirmedSharesBeforeDistribution;
    return this;
  }

  /**
   * Confirmed shares before last distribution
   * @return confirmedSharesBeforeDistribution
  **/
  @ApiModelProperty(value = "Confirmed shares before last distribution")


  public Double getConfirmedSharesBeforeDistribution() {
    return confirmedSharesBeforeDistribution;
  }

  public void setConfirmedSharesBeforeDistribution(Double confirmedSharesBeforeDistribution) {
    this.confirmedSharesBeforeDistribution = confirmedSharesBeforeDistribution;
  }

  public TransactionSharesData requestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
    return this;
  }

  /**
   * Shares requested in the transaction
   * @return requestedShares
  **/
  @ApiModelProperty(value = "Shares requested in the transaction")


  public Double getRequestedShares() {
    return requestedShares;
  }

  public void setRequestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
  }

  public TransactionSharesData sharesAtCutoffDate(Double sharesAtCutoffDate) {
    this.sharesAtCutoffDate = sharesAtCutoffDate;
    return this;
  }

  /**
   * Shares at cutoff date. Refers to {TransactionDateData.cutoffDate}
   * @return sharesAtCutoffDate
  **/
  @ApiModelProperty(value = "Shares at cutoff date. Refers to {TransactionDateData.cutoffDate}")


  public Double getSharesAtCutoffDate() {
    return sharesAtCutoffDate;
  }

  public void setSharesAtCutoffDate(Double sharesAtCutoffDate) {
    this.sharesAtCutoffDate = sharesAtCutoffDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSharesData transactionSharesData = (TransactionSharesData) o;
    return Objects.equals(this.awardedShares, transactionSharesData.awardedShares) &&
        Objects.equals(this.confirmedSharedAfterDistribution, transactionSharesData.confirmedSharedAfterDistribution) &&
        Objects.equals(this.confirmedSharesBeforeDistribution, transactionSharesData.confirmedSharesBeforeDistribution) &&
        Objects.equals(this.requestedShares, transactionSharesData.requestedShares) &&
        Objects.equals(this.sharesAtCutoffDate, transactionSharesData.sharesAtCutoffDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awardedShares, confirmedSharedAfterDistribution, confirmedSharesBeforeDistribution, requestedShares, sharesAtCutoffDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSharesData {\n");
    
    sb.append("    awardedShares: ").append(toIndentedString(awardedShares)).append("\n");
    sb.append("    confirmedSharedAfterDistribution: ").append(toIndentedString(confirmedSharedAfterDistribution)).append("\n");
    sb.append("    confirmedSharesBeforeDistribution: ").append(toIndentedString(confirmedSharesBeforeDistribution)).append("\n");
    sb.append("    requestedShares: ").append(toIndentedString(requestedShares)).append("\n");
    sb.append("    sharesAtCutoffDate: ").append(toIndentedString(sharesAtCutoffDate)).append("\n");
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

