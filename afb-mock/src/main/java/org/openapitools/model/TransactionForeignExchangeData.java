package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about Foreign Exchange data.
 */
@ApiModel(description = "This object keeps specific information about Foreign Exchange data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionForeignExchangeData   {
  @JsonProperty("fxRate")
  private Double fxRate = null;

  @JsonProperty("fxRateAppliedByAfb")
  private Double fxRateAppliedByAfb = null;

  @JsonProperty("fxServiceFeeAmount")
  private Double fxServiceFeeAmount = null;

  @JsonProperty("fxServiceFeeCurrencyCode")
  private String fxServiceFeeCurrencyCode = null;

  @JsonProperty("fxServiceFeePercentage")
  private Double fxServiceFeePercentage = null;

  public TransactionForeignExchangeData fxRate(Double fxRate) {
    this.fxRate = fxRate;
    return this;
  }

  /**
   * The forex rate applied
   * @return fxRate
  **/
  @ApiModelProperty(value = "The forex rate applied")


  public Double getFxRate() {
    return fxRate;
  }

  public void setFxRate(Double fxRate) {
    this.fxRate = fxRate;
  }

  public TransactionForeignExchangeData fxRateAppliedByAfb(Double fxRateAppliedByAfb) {
    this.fxRateAppliedByAfb = fxRateAppliedByAfb;
    return this;
  }

  /**
   * The rate applied by Allfunds
   * @return fxRateAppliedByAfb
  **/
  @ApiModelProperty(value = "The rate applied by Allfunds")


  public Double getFxRateAppliedByAfb() {
    return fxRateAppliedByAfb;
  }

  public void setFxRateAppliedByAfb(Double fxRateAppliedByAfb) {
    this.fxRateAppliedByAfb = fxRateAppliedByAfb;
  }

  public TransactionForeignExchangeData fxServiceFeeAmount(Double fxServiceFeeAmount) {
    this.fxServiceFeeAmount = fxServiceFeeAmount;
    return this;
  }

  /**
   * The service fee amount applied by Allfunds.
   * @return fxServiceFeeAmount
  **/
  @ApiModelProperty(value = "The service fee amount applied by Allfunds.")


  public Double getFxServiceFeeAmount() {
    return fxServiceFeeAmount;
  }

  public void setFxServiceFeeAmount(Double fxServiceFeeAmount) {
    this.fxServiceFeeAmount = fxServiceFeeAmount;
  }

  public TransactionForeignExchangeData fxServiceFeeCurrencyCode(String fxServiceFeeCurrencyCode) {
    this.fxServiceFeeCurrencyCode = fxServiceFeeCurrencyCode;
    return this;
  }

  /**
   * The currency code associated to fxServiceFeeAmount. Refers to {listCurrencies}
   * @return fxServiceFeeCurrencyCode
  **/
  @ApiModelProperty(value = "The currency code associated to fxServiceFeeAmount. Refers to {listCurrencies}")


  public String getFxServiceFeeCurrencyCode() {
    return fxServiceFeeCurrencyCode;
  }

  public void setFxServiceFeeCurrencyCode(String fxServiceFeeCurrencyCode) {
    this.fxServiceFeeCurrencyCode = fxServiceFeeCurrencyCode;
  }

  public TransactionForeignExchangeData fxServiceFeePercentage(Double fxServiceFeePercentage) {
    this.fxServiceFeePercentage = fxServiceFeePercentage;
    return this;
  }

  /**
   * The service fee percentage applied by Allfunds
   * @return fxServiceFeePercentage
  **/
  @ApiModelProperty(value = "The service fee percentage applied by Allfunds")


  public Double getFxServiceFeePercentage() {
    return fxServiceFeePercentage;
  }

  public void setFxServiceFeePercentage(Double fxServiceFeePercentage) {
    this.fxServiceFeePercentage = fxServiceFeePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionForeignExchangeData transactionForeignExchangeData = (TransactionForeignExchangeData) o;
    return Objects.equals(this.fxRate, transactionForeignExchangeData.fxRate) &&
        Objects.equals(this.fxRateAppliedByAfb, transactionForeignExchangeData.fxRateAppliedByAfb) &&
        Objects.equals(this.fxServiceFeeAmount, transactionForeignExchangeData.fxServiceFeeAmount) &&
        Objects.equals(this.fxServiceFeeCurrencyCode, transactionForeignExchangeData.fxServiceFeeCurrencyCode) &&
        Objects.equals(this.fxServiceFeePercentage, transactionForeignExchangeData.fxServiceFeePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fxRate, fxRateAppliedByAfb, fxServiceFeeAmount, fxServiceFeeCurrencyCode, fxServiceFeePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionForeignExchangeData {\n");
    
    sb.append("    fxRate: ").append(toIndentedString(fxRate)).append("\n");
    sb.append("    fxRateAppliedByAfb: ").append(toIndentedString(fxRateAppliedByAfb)).append("\n");
    sb.append("    fxServiceFeeAmount: ").append(toIndentedString(fxServiceFeeAmount)).append("\n");
    sb.append("    fxServiceFeeCurrencyCode: ").append(toIndentedString(fxServiceFeeCurrencyCode)).append("\n");
    sb.append("    fxServiceFeePercentage: ").append(toIndentedString(fxServiceFeePercentage)).append("\n");
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

