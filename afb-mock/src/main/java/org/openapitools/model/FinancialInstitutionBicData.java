package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialInstitutionBicData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FinancialInstitutionBicData   {
  @JsonProperty("bankBic")
  private String bankBic = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("intermediaryBankBic")
  private String intermediaryBankBic = null;

  @JsonProperty("receiverBic")
  private String receiverBic = null;

  @JsonProperty("senderBic")
  private String senderBic = null;

  public FinancialInstitutionBicData bankBic(String bankBic) {
    this.bankBic = bankBic;
    return this;
  }

  /**
   * The 'Bank Identifier Code' associated to the Institution Bank
   * @return bankBic
  **/
  @ApiModelProperty(value = "The 'Bank Identifier Code' associated to the Institution Bank")


  public String getBankBic() {
    return bankBic;
  }

  public void setBankBic(String bankBic) {
    this.bankBic = bankBic;
  }

  public FinancialInstitutionBicData bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * The name associated to the Institution
   * @return bic
  **/
  @ApiModelProperty(value = "The name associated to the Institution")


  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public FinancialInstitutionBicData intermediaryBankBic(String intermediaryBankBic) {
    this.intermediaryBankBic = intermediaryBankBic;
    return this;
  }

  /**
   * The 'Bank Identifier Code' associated to the intermediary bank
   * @return intermediaryBankBic
  **/
  @ApiModelProperty(value = "The 'Bank Identifier Code' associated to the intermediary bank")


  public String getIntermediaryBankBic() {
    return intermediaryBankBic;
  }

  public void setIntermediaryBankBic(String intermediaryBankBic) {
    this.intermediaryBankBic = intermediaryBankBic;
  }

  public FinancialInstitutionBicData receiverBic(String receiverBic) {
    this.receiverBic = receiverBic;
    return this;
  }

  /**
   * The 'Bank Identifier Code' associated to the `SWIFT` message receiver
   * @return receiverBic
  **/
  @ApiModelProperty(value = "The 'Bank Identifier Code' associated to the `SWIFT` message receiver")


  public String getReceiverBic() {
    return receiverBic;
  }

  public void setReceiverBic(String receiverBic) {
    this.receiverBic = receiverBic;
  }

  public FinancialInstitutionBicData senderBic(String senderBic) {
    this.senderBic = senderBic;
    return this;
  }

  /**
   * The 'Bank Identifier Code' associated to the `SWIFT` message sender
   * @return senderBic
  **/
  @ApiModelProperty(value = "The 'Bank Identifier Code' associated to the `SWIFT` message sender")


  public String getSenderBic() {
    return senderBic;
  }

  public void setSenderBic(String senderBic) {
    this.senderBic = senderBic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialInstitutionBicData financialInstitutionBicData = (FinancialInstitutionBicData) o;
    return Objects.equals(this.bankBic, financialInstitutionBicData.bankBic) &&
        Objects.equals(this.bic, financialInstitutionBicData.bic) &&
        Objects.equals(this.intermediaryBankBic, financialInstitutionBicData.intermediaryBankBic) &&
        Objects.equals(this.receiverBic, financialInstitutionBicData.receiverBic) &&
        Objects.equals(this.senderBic, financialInstitutionBicData.senderBic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankBic, bic, intermediaryBankBic, receiverBic, senderBic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialInstitutionBicData {\n");
    
    sb.append("    bankBic: ").append(toIndentedString(bankBic)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    intermediaryBankBic: ").append(toIndentedString(intermediaryBankBic)).append("\n");
    sb.append("    receiverBic: ").append(toIndentedString(receiverBic)).append("\n");
    sb.append("    senderBic: ").append(toIndentedString(senderBic)).append("\n");
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

