package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferEvolution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferEvolution   {
  @JsonProperty("actions")
  @Valid
  private List<String> actions = null;

  @JsonProperty("associatedSpanishTransferId")
  private String associatedSpanishTransferId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("operationsStatusCode")
  private String operationsStatusCode = null;

  @JsonProperty("spanishTransferId")
  private String spanishTransferId = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  /**
   * Indicates if the {SpanishTransfer} was dealt by shares of by amount.
   */
  public enum SubscriptionTypeEnum {
    AMOUNT("AMOUNT"),
    
    SHARES("SHARES");

    private String value;

    SubscriptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubscriptionTypeEnum fromValue(String text) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("subscriptionType")
  private SubscriptionTypeEnum subscriptionType = null;

  /**
   * The class of the {SpanishTransfer}.
   */
  public enum TransferClassEnum {
    ENTRY("ENTRY"),
    
    EXIT("EXIT"),
    
    INTERNAL("INTERNAL");

    private String value;

    TransferClassEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransferClassEnum fromValue(String text) {
      for (TransferClassEnum b : TransferClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("transferClass")
  private TransferClassEnum transferClass = null;

  /**
   * The type of the {SpanishTransfer}.
   */
  public enum TransferTypeEnum {
    TOTAL("TOTAL"),
    
    PARTIAL("PARTIAL");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransferTypeEnum fromValue(String text) {
      for (TransferTypeEnum b : TransferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("transferType")
  private TransferTypeEnum transferType = null;

  public SpanishTransferEvolution actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public SpanishTransferEvolution addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Describes any significant actions on the {SpanishTransfer}
   * @return actions
  **/
  @ApiModelProperty(value = "Describes any significant actions on the {SpanishTransfer}")


  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public SpanishTransferEvolution associatedSpanishTransferId(String associatedSpanishTransferId) {
    this.associatedSpanishTransferId = associatedSpanishTransferId;
    return this;
  }

  /**
   * The Id of the other 'leg' of this  {SpanishTransfer}
   * @return associatedSpanishTransferId
  **/
  @ApiModelProperty(value = "The Id of the other 'leg' of this  {SpanishTransfer}")


  public String getAssociatedSpanishTransferId() {
    return associatedSpanishTransferId;
  }

  public void setAssociatedSpanishTransferId(String associatedSpanishTransferId) {
    this.associatedSpanishTransferId = associatedSpanishTransferId;
  }

  public SpanishTransferEvolution distributorId(Long distributorId) {
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

  public SpanishTransferEvolution externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Refers to {SpanishTransferId}
   * @return externalReference
  **/
  @ApiModelProperty(value = "Refers to {SpanishTransferId}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public SpanishTransferEvolution operationsStatusCode(String operationsStatusCode) {
    this.operationsStatusCode = operationsStatusCode;
    return this;
  }

  /**
   * Refers to {listOpeationStatuses}
   * @return operationsStatusCode
  **/
  @ApiModelProperty(value = "Refers to {listOpeationStatuses}")


  public String getOperationsStatusCode() {
    return operationsStatusCode;
  }

  public void setOperationsStatusCode(String operationsStatusCode) {
    this.operationsStatusCode = operationsStatusCode;
  }

  public SpanishTransferEvolution spanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
    return this;
  }

  /**
   * The Id of the {SpanishTransfer}
   * @return spanishTransferId
  **/
  @ApiModelProperty(value = "The Id of the {SpanishTransfer}")


  public String getSpanishTransferId() {
    return spanishTransferId;
  }

  public void setSpanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
  }

  public SpanishTransferEvolution subdistributorId(Long subdistributorId) {
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

  public SpanishTransferEvolution subscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Indicates if the {SpanishTransfer} was dealt by shares of by amount.
   * @return subscriptionType
  **/
  @ApiModelProperty(value = "Indicates if the {SpanishTransfer} was dealt by shares of by amount.")


  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public SpanishTransferEvolution transferClass(TransferClassEnum transferClass) {
    this.transferClass = transferClass;
    return this;
  }

  /**
   * The class of the {SpanishTransfer}.
   * @return transferClass
  **/
  @ApiModelProperty(value = "The class of the {SpanishTransfer}.")


  public TransferClassEnum getTransferClass() {
    return transferClass;
  }

  public void setTransferClass(TransferClassEnum transferClass) {
    this.transferClass = transferClass;
  }

  public SpanishTransferEvolution transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }

  /**
   * The type of the {SpanishTransfer}.
   * @return transferType
  **/
  @ApiModelProperty(value = "The type of the {SpanishTransfer}.")


  public TransferTypeEnum getTransferType() {
    return transferType;
  }

  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferEvolution spanishTransferEvolution = (SpanishTransferEvolution) o;
    return Objects.equals(this.actions, spanishTransferEvolution.actions) &&
        Objects.equals(this.associatedSpanishTransferId, spanishTransferEvolution.associatedSpanishTransferId) &&
        Objects.equals(this.distributorId, spanishTransferEvolution.distributorId) &&
        Objects.equals(this.externalReference, spanishTransferEvolution.externalReference) &&
        Objects.equals(this.operationsStatusCode, spanishTransferEvolution.operationsStatusCode) &&
        Objects.equals(this.spanishTransferId, spanishTransferEvolution.spanishTransferId) &&
        Objects.equals(this.subdistributorId, spanishTransferEvolution.subdistributorId) &&
        Objects.equals(this.subscriptionType, spanishTransferEvolution.subscriptionType) &&
        Objects.equals(this.transferClass, spanishTransferEvolution.transferClass) &&
        Objects.equals(this.transferType, spanishTransferEvolution.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, associatedSpanishTransferId, distributorId, externalReference, operationsStatusCode, spanishTransferId, subdistributorId, subscriptionType, transferClass, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferEvolution {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    associatedSpanishTransferId: ").append(toIndentedString(associatedSpanishTransferId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    operationsStatusCode: ").append(toIndentedString(operationsStatusCode)).append("\n");
    sb.append("    spanishTransferId: ").append(toIndentedString(spanishTransferId)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    transferClass: ").append(toIndentedString(transferClass)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

