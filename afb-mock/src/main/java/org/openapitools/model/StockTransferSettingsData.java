package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about specific attributes of the {StockTransfer}.
 */
@ApiModel(description = "This object keeps information about specific attributes of the {StockTransfer}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferSettingsData   {
  @JsonProperty("applicationFormAccessible")
  private Boolean applicationFormAccessible = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("platformAccount")
  private String platformAccount = null;

  @JsonProperty("platformCode")
  private String platformCode = null;

  @JsonProperty("signedApplicationFormAccessible")
  private Boolean signedApplicationFormAccessible = null;

  @JsonProperty("taxTransactionHistory")
  private Boolean taxTransactionHistory = null;

  public StockTransferSettingsData applicationFormAccessible(Boolean applicationFormAccessible) {
    this.applicationFormAccessible = applicationFormAccessible;
    return this;
  }

  /**
   * Indicates whether it is possible to get the {StockTransfer}'s application form
   * @return applicationFormAccessible
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to get the {StockTransfer}'s application form")


  public Boolean getApplicationFormAccessible() {
    return applicationFormAccessible;
  }

  public void setApplicationFormAccessible(Boolean applicationFormAccessible) {
    this.applicationFormAccessible = applicationFormAccessible;
  }

  public StockTransferSettingsData errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The {StockTransfer} error code. It will be reported only if there has been a problem ordering the {StockTransfer}. Refer to {listErrors}
   * @return errorCode
  **/
  @ApiModelProperty(value = "The {StockTransfer} error code. It will be reported only if there has been a problem ordering the {StockTransfer}. Refer to {listErrors}")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public StockTransferSettingsData platformAccount(String platformAccount) {
    this.platformAccount = platformAccount;
    return this;
  }

  /**
   * The account on the platform used to order the {StockTransfer}.
   * @return platformAccount
  **/
  @ApiModelProperty(value = "The account on the platform used to order the {StockTransfer}.")


  public String getPlatformAccount() {
    return platformAccount;
  }

  public void setPlatformAccount(String platformAccount) {
    this.platformAccount = platformAccount;
  }

  public StockTransferSettingsData platformCode(String platformCode) {
    this.platformCode = platformCode;
    return this;
  }

  /**
   * The platform used to ordered the {StockTransfer}. Refer to the {listStockTransferPlatforms}
   * @return platformCode
  **/
  @ApiModelProperty(value = "The platform used to ordered the {StockTransfer}. Refer to the {listStockTransferPlatforms}")


  public String getPlatformCode() {
    return platformCode;
  }

  public void setPlatformCode(String platformCode) {
    this.platformCode = platformCode;
  }

  public StockTransferSettingsData signedApplicationFormAccessible(Boolean signedApplicationFormAccessible) {
    this.signedApplicationFormAccessible = signedApplicationFormAccessible;
    return this;
  }

  /**
   * Indicates whether it is possible to get the {StockTransfer}'s application form with signatures included.
   * @return signedApplicationFormAccessible
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to get the {StockTransfer}'s application form with signatures included.")


  public Boolean getSignedApplicationFormAccessible() {
    return signedApplicationFormAccessible;
  }

  public void setSignedApplicationFormAccessible(Boolean signedApplicationFormAccessible) {
    this.signedApplicationFormAccessible = signedApplicationFormAccessible;
  }

  public StockTransferSettingsData taxTransactionHistory(Boolean taxTransactionHistory) {
    this.taxTransactionHistory = taxTransactionHistory;
    return this;
  }

  /**
   * Indicates whether it is possible to consult the {Transaction}'s tax history associated with this {StockTransfer}. Refer to the {Transaction}'s {TransactionSettingsData.taxTransactionHistory}
   * @return taxTransactionHistory
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to consult the {Transaction}'s tax history associated with this {StockTransfer}. Refer to the {Transaction}'s {TransactionSettingsData.taxTransactionHistory}")


  public Boolean getTaxTransactionHistory() {
    return taxTransactionHistory;
  }

  public void setTaxTransactionHistory(Boolean taxTransactionHistory) {
    this.taxTransactionHistory = taxTransactionHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferSettingsData stockTransferSettingsData = (StockTransferSettingsData) o;
    return Objects.equals(this.applicationFormAccessible, stockTransferSettingsData.applicationFormAccessible) &&
        Objects.equals(this.errorCode, stockTransferSettingsData.errorCode) &&
        Objects.equals(this.platformAccount, stockTransferSettingsData.platformAccount) &&
        Objects.equals(this.platformCode, stockTransferSettingsData.platformCode) &&
        Objects.equals(this.signedApplicationFormAccessible, stockTransferSettingsData.signedApplicationFormAccessible) &&
        Objects.equals(this.taxTransactionHistory, stockTransferSettingsData.taxTransactionHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationFormAccessible, errorCode, platformAccount, platformCode, signedApplicationFormAccessible, taxTransactionHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferSettingsData {\n");
    
    sb.append("    applicationFormAccessible: ").append(toIndentedString(applicationFormAccessible)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    platformAccount: ").append(toIndentedString(platformAccount)).append("\n");
    sb.append("    platformCode: ").append(toIndentedString(platformCode)).append("\n");
    sb.append("    signedApplicationFormAccessible: ").append(toIndentedString(signedApplicationFormAccessible)).append("\n");
    sb.append("    taxTransactionHistory: ").append(toIndentedString(taxTransactionHistory)).append("\n");
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

