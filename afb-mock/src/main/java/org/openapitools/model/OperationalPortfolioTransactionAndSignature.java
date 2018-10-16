package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationalPortfolioTransaction;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioTransactionAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioTransactionAndSignature   {
  @JsonProperty("operationalPortfolioTransaction")
  private OperationalPortfolioTransaction operationalPortfolioTransaction = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public OperationalPortfolioTransactionAndSignature operationalPortfolioTransaction(OperationalPortfolioTransaction operationalPortfolioTransaction) {
    this.operationalPortfolioTransaction = operationalPortfolioTransaction;
    return this;
  }

  /**
   * Get operationalPortfolioTransaction
   * @return operationalPortfolioTransaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioTransaction getOperationalPortfolioTransaction() {
    return operationalPortfolioTransaction;
  }

  public void setOperationalPortfolioTransaction(OperationalPortfolioTransaction operationalPortfolioTransaction) {
    this.operationalPortfolioTransaction = operationalPortfolioTransaction;
  }

  public OperationalPortfolioTransactionAndSignature signature(Signature signature) {
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
    OperationalPortfolioTransactionAndSignature operationalPortfolioTransactionAndSignature = (OperationalPortfolioTransactionAndSignature) o;
    return Objects.equals(this.operationalPortfolioTransaction, operationalPortfolioTransactionAndSignature.operationalPortfolioTransaction) &&
        Objects.equals(this.signature, operationalPortfolioTransactionAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalPortfolioTransaction, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioTransactionAndSignature {\n");
    
    sb.append("    operationalPortfolioTransaction: ").append(toIndentedString(operationalPortfolioTransaction)).append("\n");
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
