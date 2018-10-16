package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SpanishTransferBasicData;
import org.openapitools.model.SpanishTransferDateData;
import org.openapitools.model.SpanishTransferItem;
import org.openapitools.model.SpanishTransferPrincipal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransfer   {
  @JsonProperty("basicData")
  private SpanishTransferBasicData basicData = null;

  @JsonProperty("dateData")
  private SpanishTransferDateData dateData = null;

  @JsonProperty("destinationItem")
  private SpanishTransferItem destinationItem = null;

  @JsonProperty("exchangeRateApplied")
  private Double exchangeRateApplied = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("principals")
  @Valid
  private List<SpanishTransferPrincipal> principals = null;

  @JsonProperty("processedAsSwitch")
  private Boolean processedAsSwitch = null;

  @JsonProperty("sourceItem")
  private SpanishTransferItem sourceItem = null;

  @JsonProperty("substatusCode")
  private String substatusCode = null;

  @JsonProperty("transactionExternalReference")
  private String transactionExternalReference = null;

  public SpanishTransfer basicData(SpanishTransferBasicData basicData) {
    this.basicData = basicData;
    return this;
  }

  /**
   * Get basicData
   * @return basicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferBasicData getBasicData() {
    return basicData;
  }

  public void setBasicData(SpanishTransferBasicData basicData) {
    this.basicData = basicData;
  }

  public SpanishTransfer dateData(SpanishTransferDateData dateData) {
    this.dateData = dateData;
    return this;
  }

  /**
   * Get dateData
   * @return dateData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferDateData getDateData() {
    return dateData;
  }

  public void setDateData(SpanishTransferDateData dateData) {
    this.dateData = dateData;
  }

  public SpanishTransfer destinationItem(SpanishTransferItem destinationItem) {
    this.destinationItem = destinationItem;
    return this;
  }

  /**
   * Get destinationItem
   * @return destinationItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferItem getDestinationItem() {
    return destinationItem;
  }

  public void setDestinationItem(SpanishTransferItem destinationItem) {
    this.destinationItem = destinationItem;
  }

  public SpanishTransfer exchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * Exchange rate applied when payment currency is different from the {DealingInstrument} currency.
   * @return exchangeRateApplied
  **/
  @ApiModelProperty(value = "Exchange rate applied when payment currency is different from the {DealingInstrument} currency.")


  public Double getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public SpanishTransfer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {SpanishTransfer}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {SpanishTransfer}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SpanishTransfer principals(List<SpanishTransferPrincipal> principals) {
    this.principals = principals;
    return this;
  }

  public SpanishTransfer addPrincipalsItem(SpanishTransferPrincipal principalsItem) {
    if (this.principals == null) {
      this.principals = new ArrayList<>();
    }
    this.principals.add(principalsItem);
    return this;
  }

  /**
   * Get principals
   * @return principals
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SpanishTransferPrincipal> getPrincipals() {
    return principals;
  }

  public void setPrincipals(List<SpanishTransferPrincipal> principals) {
    this.principals = principals;
  }

  public SpanishTransfer processedAsSwitch(Boolean processedAsSwitch) {
    this.processedAsSwitch = processedAsSwitch;
    return this;
  }

  /**
   * Indicates whether the {SpanishTransfer} was processed as a swtich becouse it's registered as internal transfer.
   * @return processedAsSwitch
  **/
  @ApiModelProperty(value = "Indicates whether the {SpanishTransfer} was processed as a swtich becouse it's registered as internal transfer.")


  public Boolean getProcessedAsSwitch() {
    return processedAsSwitch;
  }

  public void setProcessedAsSwitch(Boolean processedAsSwitch) {
    this.processedAsSwitch = processedAsSwitch;
  }

  public SpanishTransfer sourceItem(SpanishTransferItem sourceItem) {
    this.sourceItem = sourceItem;
    return this;
  }

  /**
   * Get sourceItem
   * @return sourceItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferItem getSourceItem() {
    return sourceItem;
  }

  public void setSourceItem(SpanishTransferItem sourceItem) {
    this.sourceItem = sourceItem;
  }

  public SpanishTransfer substatusCode(String substatusCode) {
    this.substatusCode = substatusCode;
    return this;
  }

  /**
   * Specifies, with a greater level of details, the status of the {SpanishTransfer}. Refer of {listSpanishTransferSubstatuses}
   * @return substatusCode
  **/
  @ApiModelProperty(value = "Specifies, with a greater level of details, the status of the {SpanishTransfer}. Refer of {listSpanishTransferSubstatuses}")


  public String getSubstatusCode() {
    return substatusCode;
  }

  public void setSubstatusCode(String substatusCode) {
    this.substatusCode = substatusCode;
  }

  public SpanishTransfer transactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
    return this;
  }

  /**
   * Transaction external reference associated to the {SpanishTransfer}
   * @return transactionExternalReference
  **/
  @ApiModelProperty(value = "Transaction external reference associated to the {SpanishTransfer}")


  public String getTransactionExternalReference() {
    return transactionExternalReference;
  }

  public void setTransactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransfer spanishTransfer = (SpanishTransfer) o;
    return Objects.equals(this.basicData, spanishTransfer.basicData) &&
        Objects.equals(this.dateData, spanishTransfer.dateData) &&
        Objects.equals(this.destinationItem, spanishTransfer.destinationItem) &&
        Objects.equals(this.exchangeRateApplied, spanishTransfer.exchangeRateApplied) &&
        Objects.equals(this.id, spanishTransfer.id) &&
        Objects.equals(this.principals, spanishTransfer.principals) &&
        Objects.equals(this.processedAsSwitch, spanishTransfer.processedAsSwitch) &&
        Objects.equals(this.sourceItem, spanishTransfer.sourceItem) &&
        Objects.equals(this.substatusCode, spanishTransfer.substatusCode) &&
        Objects.equals(this.transactionExternalReference, spanishTransfer.transactionExternalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicData, dateData, destinationItem, exchangeRateApplied, id, principals, processedAsSwitch, sourceItem, substatusCode, transactionExternalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransfer {\n");
    
    sb.append("    basicData: ").append(toIndentedString(basicData)).append("\n");
    sb.append("    dateData: ").append(toIndentedString(dateData)).append("\n");
    sb.append("    destinationItem: ").append(toIndentedString(destinationItem)).append("\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    processedAsSwitch: ").append(toIndentedString(processedAsSwitch)).append("\n");
    sb.append("    sourceItem: ").append(toIndentedString(sourceItem)).append("\n");
    sb.append("    substatusCode: ").append(toIndentedString(substatusCode)).append("\n");
    sb.append("    transactionExternalReference: ").append(toIndentedString(transactionExternalReference)).append("\n");
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

