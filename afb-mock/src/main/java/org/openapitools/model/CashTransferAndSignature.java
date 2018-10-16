package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CashTransfer;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransferAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransferAndSignature   {
  @JsonProperty("cashTransfer")
  private CashTransfer cashTransfer = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public CashTransferAndSignature cashTransfer(CashTransfer cashTransfer) {
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

  public CashTransferAndSignature signature(Signature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Signature getSignature() {
    return signature;
  }

  public void setSignature(Signature signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransferAndSignature cashTransferAndSignature = (CashTransferAndSignature) o;
    return Objects.equals(this.cashTransfer, cashTransferAndSignature.cashTransfer) &&
        Objects.equals(this.signature, cashTransferAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashTransfer, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransferAndSignature {\n");
    
    sb.append("    cashTransfer: ").append(toIndentedString(cashTransfer)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

