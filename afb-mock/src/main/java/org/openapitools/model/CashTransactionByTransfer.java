package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CashTransfer;
import org.openapitools.model.FinancialInstitution;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransactionByTransfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransactionByTransfer   {
  @JsonProperty("accountWithInstitution")
  private FinancialInstitution accountWithInstitution = null;

  @JsonProperty("cashAccountId")
  private String cashAccountId = null;

  @JsonProperty("cashClientId")
  private String cashClientId = null;

  @JsonProperty("cashTransactionId")
  private String cashTransactionId = null;

  @JsonProperty("cashTransfer")
  private CashTransfer cashTransfer = null;

  @JsonProperty("customerInstitution")
  private FinancialInstitution customerInstitution = null;

  @JsonProperty("intermediaryIntitution")
  private FinancialInstitution intermediaryIntitution = null;

  @JsonProperty("messageUserReferences")
  private String messageUserReferences = null;

  @JsonProperty("omType")
  private String omType = null;

  @JsonProperty("orderingIntitution")
  private FinancialInstitution orderingIntitution = null;

  @JsonProperty("senderReference")
  private String senderReference = null;

  @JsonProperty("swiftMessageType")
  private String swiftMessageType = null;

  public CashTransactionByTransfer accountWithInstitution(FinancialInstitution accountWithInstitution) {
    this.accountWithInstitution = accountWithInstitution;
    return this;
  }

  /**
   * Get accountWithInstitution
   * @return accountWithInstitution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitution getAccountWithInstitution() {
    return accountWithInstitution;
  }

  public void setAccountWithInstitution(FinancialInstitution accountWithInstitution) {
    this.accountWithInstitution = accountWithInstitution;
  }

  public CashTransactionByTransfer cashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
    return this;
  }

  /**
   * The Id of the {CashAccount}
   * @return cashAccountId
  **/
  @ApiModelProperty(value = "The Id of the {CashAccount}")


  public String getCashAccountId() {
    return cashAccountId;
  }

  public void setCashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
  }

  public CashTransactionByTransfer cashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
    return this;
  }

  /**
   * The Id of the associated {CashClient}
   * @return cashClientId
  **/
  @ApiModelProperty(value = "The Id of the associated {CashClient}")


  public String getCashClientId() {
    return cashClientId;
  }

  public void setCashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
  }

  public CashTransactionByTransfer cashTransactionId(String cashTransactionId) {
    this.cashTransactionId = cashTransactionId;
    return this;
  }

  /**
   * The Id of the {CashTransaction}
   * @return cashTransactionId
  **/
  @ApiModelProperty(value = "The Id of the {CashTransaction}")


  public String getCashTransactionId() {
    return cashTransactionId;
  }

  public void setCashTransactionId(String cashTransactionId) {
    this.cashTransactionId = cashTransactionId;
  }

  public CashTransactionByTransfer cashTransfer(CashTransfer cashTransfer) {
    this.cashTransfer = cashTransfer;
    return this;
  }

  /**
   * Get cashTransfer
   * @return cashTransfer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CashTransfer getCashTransfer() {
    return cashTransfer;
  }

  public void setCashTransfer(CashTransfer cashTransfer) {
    this.cashTransfer = cashTransfer;
  }

  public CashTransactionByTransfer customerInstitution(FinancialInstitution customerInstitution) {
    this.customerInstitution = customerInstitution;
    return this;
  }

  /**
   * Get customerInstitution
   * @return customerInstitution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitution getCustomerInstitution() {
    return customerInstitution;
  }

  public void setCustomerInstitution(FinancialInstitution customerInstitution) {
    this.customerInstitution = customerInstitution;
  }

  public CashTransactionByTransfer intermediaryIntitution(FinancialInstitution intermediaryIntitution) {
    this.intermediaryIntitution = intermediaryIntitution;
    return this;
  }

  /**
   * Get intermediaryIntitution
   * @return intermediaryIntitution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitution getIntermediaryIntitution() {
    return intermediaryIntitution;
  }

  public void setIntermediaryIntitution(FinancialInstitution intermediaryIntitution) {
    this.intermediaryIntitution = intermediaryIntitution;
  }

  public CashTransactionByTransfer messageUserReferences(String messageUserReferences) {
    this.messageUserReferences = messageUserReferences;
    return this;
  }

  /**
   * The 'Message User Reference' (MUR) associated to teh {CashTransaction}
   * @return messageUserReferences
  **/
  @ApiModelProperty(value = "The 'Message User Reference' (MUR) associated to teh {CashTransaction}")


  public String getMessageUserReferences() {
    return messageUserReferences;
  }

  public void setMessageUserReferences(String messageUserReferences) {
    this.messageUserReferences = messageUserReferences;
  }

  public CashTransactionByTransfer omType(String omType) {
    this.omType = omType;
    return this;
  }

  /**
   * The om Type
   * @return omType
  **/
  @ApiModelProperty(value = "The om Type")


  public String getOmType() {
    return omType;
  }

  public void setOmType(String omType) {
    this.omType = omType;
  }

  public CashTransactionByTransfer orderingIntitution(FinancialInstitution orderingIntitution) {
    this.orderingIntitution = orderingIntitution;
    return this;
  }

  /**
   * Get orderingIntitution
   * @return orderingIntitution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitution getOrderingIntitution() {
    return orderingIntitution;
  }

  public void setOrderingIntitution(FinancialInstitution orderingIntitution) {
    this.orderingIntitution = orderingIntitution;
  }

  public CashTransactionByTransfer senderReference(String senderReference) {
    this.senderReference = senderReference;
    return this;
  }

  /**
   * The 'Sender Reference' associated to the {CashTransaction} (corresponds with `SWIFT` field 20)
   * @return senderReference
  **/
  @ApiModelProperty(value = "The 'Sender Reference' associated to the {CashTransaction} (corresponds with `SWIFT` field 20)")


  public String getSenderReference() {
    return senderReference;
  }

  public void setSenderReference(String senderReference) {
    this.senderReference = senderReference;
  }

  public CashTransactionByTransfer swiftMessageType(String swiftMessageType) {
    this.swiftMessageType = swiftMessageType;
    return this;
  }

  /**
   * The swift message type that originates the {CashTransaction}
   * @return swiftMessageType
  **/
  @ApiModelProperty(value = "The swift message type that originates the {CashTransaction}")


  public String getSwiftMessageType() {
    return swiftMessageType;
  }

  public void setSwiftMessageType(String swiftMessageType) {
    this.swiftMessageType = swiftMessageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransactionByTransfer cashTransactionByTransfer = (CashTransactionByTransfer) o;
    return Objects.equals(this.accountWithInstitution, cashTransactionByTransfer.accountWithInstitution) &&
        Objects.equals(this.cashAccountId, cashTransactionByTransfer.cashAccountId) &&
        Objects.equals(this.cashClientId, cashTransactionByTransfer.cashClientId) &&
        Objects.equals(this.cashTransactionId, cashTransactionByTransfer.cashTransactionId) &&
        Objects.equals(this.cashTransfer, cashTransactionByTransfer.cashTransfer) &&
        Objects.equals(this.customerInstitution, cashTransactionByTransfer.customerInstitution) &&
        Objects.equals(this.intermediaryIntitution, cashTransactionByTransfer.intermediaryIntitution) &&
        Objects.equals(this.messageUserReferences, cashTransactionByTransfer.messageUserReferences) &&
        Objects.equals(this.omType, cashTransactionByTransfer.omType) &&
        Objects.equals(this.orderingIntitution, cashTransactionByTransfer.orderingIntitution) &&
        Objects.equals(this.senderReference, cashTransactionByTransfer.senderReference) &&
        Objects.equals(this.swiftMessageType, cashTransactionByTransfer.swiftMessageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountWithInstitution, cashAccountId, cashClientId, cashTransactionId, cashTransfer, customerInstitution, intermediaryIntitution, messageUserReferences, omType, orderingIntitution, senderReference, swiftMessageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionByTransfer {\n");
    
    sb.append("    accountWithInstitution: ").append(toIndentedString(accountWithInstitution)).append("\n");
    sb.append("    cashAccountId: ").append(toIndentedString(cashAccountId)).append("\n");
    sb.append("    cashClientId: ").append(toIndentedString(cashClientId)).append("\n");
    sb.append("    cashTransactionId: ").append(toIndentedString(cashTransactionId)).append("\n");
    sb.append("    cashTransfer: ").append(toIndentedString(cashTransfer)).append("\n");
    sb.append("    customerInstitution: ").append(toIndentedString(customerInstitution)).append("\n");
    sb.append("    intermediaryIntitution: ").append(toIndentedString(intermediaryIntitution)).append("\n");
    sb.append("    messageUserReferences: ").append(toIndentedString(messageUserReferences)).append("\n");
    sb.append("    omType: ").append(toIndentedString(omType)).append("\n");
    sb.append("    orderingIntitution: ").append(toIndentedString(orderingIntitution)).append("\n");
    sb.append("    senderReference: ").append(toIndentedString(senderReference)).append("\n");
    sb.append("    swiftMessageType: ").append(toIndentedString(swiftMessageType)).append("\n");
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

