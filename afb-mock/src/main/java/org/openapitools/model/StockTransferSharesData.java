package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about the shares of the {StockTransfer}.
 */
@ApiModel(description = "This object keeps information about the shares of the {StockTransfer}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferSharesData   {
  @JsonProperty("requestedShares")
  private Double requestedShares = null;

  @JsonProperty("requestedSharesAsWords")
  private String requestedSharesAsWords = null;

  @JsonProperty("sharesAfterDistribution")
  private Double sharesAfterDistribution = null;

  @JsonProperty("sharesBeforeDistribution")
  private Double sharesBeforeDistribution = null;

  public StockTransferSharesData requestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
    return this;
  }

  /**
   * Shares requested in the {StockTransfer}
   * @return requestedShares
  **/
  @ApiModelProperty(value = "Shares requested in the {StockTransfer}")


  public Double getRequestedShares() {
    return requestedShares;
  }

  public void setRequestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
  }

  public StockTransferSharesData requestedSharesAsWords(String requestedSharesAsWords) {
    this.requestedSharesAsWords = requestedSharesAsWords;
    return this;
  }

  /**
   * Shares requested in the {StockTransfer} expressed with words.
   * @return requestedSharesAsWords
  **/
  @ApiModelProperty(value = "Shares requested in the {StockTransfer} expressed with words.")


  public String getRequestedSharesAsWords() {
    return requestedSharesAsWords;
  }

  public void setRequestedSharesAsWords(String requestedSharesAsWords) {
    this.requestedSharesAsWords = requestedSharesAsWords;
  }

  public StockTransferSharesData sharesAfterDistribution(Double sharesAfterDistribution) {
    this.sharesAfterDistribution = sharesAfterDistribution;
    return this;
  }

  /**
   * Shares requested in the {StockTransfer} after last {DealingInstrument} distribution
   * @return sharesAfterDistribution
  **/
  @ApiModelProperty(value = "Shares requested in the {StockTransfer} after last {DealingInstrument} distribution")


  public Double getSharesAfterDistribution() {
    return sharesAfterDistribution;
  }

  public void setSharesAfterDistribution(Double sharesAfterDistribution) {
    this.sharesAfterDistribution = sharesAfterDistribution;
  }

  public StockTransferSharesData sharesBeforeDistribution(Double sharesBeforeDistribution) {
    this.sharesBeforeDistribution = sharesBeforeDistribution;
    return this;
  }

  /**
   * Shares requested in the {StockTransfer} before last {DealingInstrument} distribution
   * @return sharesBeforeDistribution
  **/
  @ApiModelProperty(value = "Shares requested in the {StockTransfer} before last {DealingInstrument} distribution")


  public Double getSharesBeforeDistribution() {
    return sharesBeforeDistribution;
  }

  public void setSharesBeforeDistribution(Double sharesBeforeDistribution) {
    this.sharesBeforeDistribution = sharesBeforeDistribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferSharesData stockTransferSharesData = (StockTransferSharesData) o;
    return Objects.equals(this.requestedShares, stockTransferSharesData.requestedShares) &&
        Objects.equals(this.requestedSharesAsWords, stockTransferSharesData.requestedSharesAsWords) &&
        Objects.equals(this.sharesAfterDistribution, stockTransferSharesData.sharesAfterDistribution) &&
        Objects.equals(this.sharesBeforeDistribution, stockTransferSharesData.sharesBeforeDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedShares, requestedSharesAsWords, sharesAfterDistribution, sharesBeforeDistribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferSharesData {\n");
    
    sb.append("    requestedShares: ").append(toIndentedString(requestedShares)).append("\n");
    sb.append("    requestedSharesAsWords: ").append(toIndentedString(requestedSharesAsWords)).append("\n");
    sb.append("    sharesAfterDistribution: ").append(toIndentedString(sharesAfterDistribution)).append("\n");
    sb.append("    sharesBeforeDistribution: ").append(toIndentedString(sharesBeforeDistribution)).append("\n");
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

