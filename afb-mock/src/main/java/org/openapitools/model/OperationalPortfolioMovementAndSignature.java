package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationalPortfolioMovement;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioMovementAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioMovementAndSignature   {
  @JsonProperty("operationalPortfolioMovement")
  private OperationalPortfolioMovement operationalPortfolioMovement = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public OperationalPortfolioMovementAndSignature operationalPortfolioMovement(OperationalPortfolioMovement operationalPortfolioMovement) {
    this.operationalPortfolioMovement = operationalPortfolioMovement;
    return this;
  }

  /**
   * Get operationalPortfolioMovement
   * @return operationalPortfolioMovement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioMovement getOperationalPortfolioMovement() {
    return operationalPortfolioMovement;
  }

  public void setOperationalPortfolioMovement(OperationalPortfolioMovement operationalPortfolioMovement) {
    this.operationalPortfolioMovement = operationalPortfolioMovement;
  }

  public OperationalPortfolioMovementAndSignature signature(Signature signature) {
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
    OperationalPortfolioMovementAndSignature operationalPortfolioMovementAndSignature = (OperationalPortfolioMovementAndSignature) o;
    return Objects.equals(this.operationalPortfolioMovement, operationalPortfolioMovementAndSignature.operationalPortfolioMovement) &&
        Objects.equals(this.signature, operationalPortfolioMovementAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalPortfolioMovement, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioMovementAndSignature {\n");
    
    sb.append("    operationalPortfolioMovement: ").append(toIndentedString(operationalPortfolioMovement)).append("\n");
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

