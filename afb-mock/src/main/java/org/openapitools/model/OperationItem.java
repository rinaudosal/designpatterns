package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationAmountData;
import org.openapitools.model.OperationContractData;
import org.openapitools.model.OperationDateData;
import org.openapitools.model.OperationItalianRetailMarketData;
import org.openapitools.model.OperationSharesData;
import org.openapitools.model.OperationSpanishMarketData;
import org.openapitools.model.OperationWithholdingData;
import org.openapitools.model.Price;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationItem   {
  @JsonProperty("associatedTransaction")
  private ResourceReference associatedTransaction = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("operationAmountData")
  private OperationAmountData operationAmountData = null;

  @JsonProperty("operationContractData")
  private OperationContractData operationContractData = null;

  @JsonProperty("operationDateData")
  private OperationDateData operationDateData = null;

  @JsonProperty("operationItalianRetailMarketData")
  private OperationItalianRetailMarketData operationItalianRetailMarketData = null;

  @JsonProperty("operationSharesData")
  private OperationSharesData operationSharesData = null;

  @JsonProperty("operationSpanishMarketData")
  private OperationSpanishMarketData operationSpanishMarketData = null;

  @JsonProperty("operationWithholdingData")
  private OperationWithholdingData operationWithholdingData = null;

  @JsonProperty("price")
  private Price price = null;

  public OperationItem associatedTransaction(ResourceReference associatedTransaction) {
    this.associatedTransaction = associatedTransaction;
    return this;
  }

  /**
   * Get associatedTransaction
   * @return associatedTransaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getAssociatedTransaction() {
    return associatedTransaction;
  }

  public void setAssociatedTransaction(ResourceReference associatedTransaction) {
    this.associatedTransaction = associatedTransaction;
  }

  public OperationItem clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The Id of the {Client}
   * @return clientId
  **/
  @ApiModelProperty(value = "The Id of the {Client}")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OperationItem comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Comments Operation
   * @return comments
  **/
  @ApiModelProperty(value = "Comments Operation")


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public OperationItem currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The {Operation}'s currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The {Operation}'s currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OperationItem externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External operation reference
   * @return externalReference
  **/
  @ApiModelProperty(value = "External operation reference")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public OperationItem operationAmountData(OperationAmountData operationAmountData) {
    this.operationAmountData = operationAmountData;
    return this;
  }

  /**
   * Get operationAmountData
   * @return operationAmountData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationAmountData getOperationAmountData() {
    return operationAmountData;
  }

  public void setOperationAmountData(OperationAmountData operationAmountData) {
    this.operationAmountData = operationAmountData;
  }

  public OperationItem operationContractData(OperationContractData operationContractData) {
    this.operationContractData = operationContractData;
    return this;
  }

  /**
   * Get operationContractData
   * @return operationContractData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationContractData getOperationContractData() {
    return operationContractData;
  }

  public void setOperationContractData(OperationContractData operationContractData) {
    this.operationContractData = operationContractData;
  }

  public OperationItem operationDateData(OperationDateData operationDateData) {
    this.operationDateData = operationDateData;
    return this;
  }

  /**
   * Get operationDateData
   * @return operationDateData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationDateData getOperationDateData() {
    return operationDateData;
  }

  public void setOperationDateData(OperationDateData operationDateData) {
    this.operationDateData = operationDateData;
  }

  public OperationItem operationItalianRetailMarketData(OperationItalianRetailMarketData operationItalianRetailMarketData) {
    this.operationItalianRetailMarketData = operationItalianRetailMarketData;
    return this;
  }

  /**
   * Get operationItalianRetailMarketData
   * @return operationItalianRetailMarketData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationItalianRetailMarketData getOperationItalianRetailMarketData() {
    return operationItalianRetailMarketData;
  }

  public void setOperationItalianRetailMarketData(OperationItalianRetailMarketData operationItalianRetailMarketData) {
    this.operationItalianRetailMarketData = operationItalianRetailMarketData;
  }

  public OperationItem operationSharesData(OperationSharesData operationSharesData) {
    this.operationSharesData = operationSharesData;
    return this;
  }

  /**
   * Get operationSharesData
   * @return operationSharesData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationSharesData getOperationSharesData() {
    return operationSharesData;
  }

  public void setOperationSharesData(OperationSharesData operationSharesData) {
    this.operationSharesData = operationSharesData;
  }

  public OperationItem operationSpanishMarketData(OperationSpanishMarketData operationSpanishMarketData) {
    this.operationSpanishMarketData = operationSpanishMarketData;
    return this;
  }

  /**
   * Get operationSpanishMarketData
   * @return operationSpanishMarketData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationSpanishMarketData getOperationSpanishMarketData() {
    return operationSpanishMarketData;
  }

  public void setOperationSpanishMarketData(OperationSpanishMarketData operationSpanishMarketData) {
    this.operationSpanishMarketData = operationSpanishMarketData;
  }

  public OperationItem operationWithholdingData(OperationWithholdingData operationWithholdingData) {
    this.operationWithholdingData = operationWithholdingData;
    return this;
  }

  /**
   * Get operationWithholdingData
   * @return operationWithholdingData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationWithholdingData getOperationWithholdingData() {
    return operationWithholdingData;
  }

  public void setOperationWithholdingData(OperationWithholdingData operationWithholdingData) {
    this.operationWithholdingData = operationWithholdingData;
  }

  public OperationItem price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationItem operationItem = (OperationItem) o;
    return Objects.equals(this.associatedTransaction, operationItem.associatedTransaction) &&
        Objects.equals(this.clientId, operationItem.clientId) &&
        Objects.equals(this.comments, operationItem.comments) &&
        Objects.equals(this.currencyCode, operationItem.currencyCode) &&
        Objects.equals(this.externalReference, operationItem.externalReference) &&
        Objects.equals(this.operationAmountData, operationItem.operationAmountData) &&
        Objects.equals(this.operationContractData, operationItem.operationContractData) &&
        Objects.equals(this.operationDateData, operationItem.operationDateData) &&
        Objects.equals(this.operationItalianRetailMarketData, operationItem.operationItalianRetailMarketData) &&
        Objects.equals(this.operationSharesData, operationItem.operationSharesData) &&
        Objects.equals(this.operationSpanishMarketData, operationItem.operationSpanishMarketData) &&
        Objects.equals(this.operationWithholdingData, operationItem.operationWithholdingData) &&
        Objects.equals(this.price, operationItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedTransaction, clientId, comments, currencyCode, externalReference, operationAmountData, operationContractData, operationDateData, operationItalianRetailMarketData, operationSharesData, operationSpanishMarketData, operationWithholdingData, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationItem {\n");
    
    sb.append("    associatedTransaction: ").append(toIndentedString(associatedTransaction)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    operationAmountData: ").append(toIndentedString(operationAmountData)).append("\n");
    sb.append("    operationContractData: ").append(toIndentedString(operationContractData)).append("\n");
    sb.append("    operationDateData: ").append(toIndentedString(operationDateData)).append("\n");
    sb.append("    operationItalianRetailMarketData: ").append(toIndentedString(operationItalianRetailMarketData)).append("\n");
    sb.append("    operationSharesData: ").append(toIndentedString(operationSharesData)).append("\n");
    sb.append("    operationSpanishMarketData: ").append(toIndentedString(operationSpanishMarketData)).append("\n");
    sb.append("    operationWithholdingData: ").append(toIndentedString(operationWithholdingData)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

