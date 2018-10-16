package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationalPortfolioComposition;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioCompositionAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioCompositionAndSignature   {
  @JsonProperty("operationalPortfolioComposition")
  private OperationalPortfolioComposition operationalPortfolioComposition = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public OperationalPortfolioCompositionAndSignature operationalPortfolioComposition(OperationalPortfolioComposition operationalPortfolioComposition) {
    this.operationalPortfolioComposition = operationalPortfolioComposition;
    return this;
  }

  /**
   * Get operationalPortfolioComposition
   * @return operationalPortfolioComposition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioComposition getOperationalPortfolioComposition() {
    return operationalPortfolioComposition;
  }

  public void setOperationalPortfolioComposition(OperationalPortfolioComposition operationalPortfolioComposition) {
    this.operationalPortfolioComposition = operationalPortfolioComposition;
  }

  public OperationalPortfolioCompositionAndSignature signature(Signature signature) {
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
    OperationalPortfolioCompositionAndSignature operationalPortfolioCompositionAndSignature = (OperationalPortfolioCompositionAndSignature) o;
    return Objects.equals(this.operationalPortfolioComposition, operationalPortfolioCompositionAndSignature.operationalPortfolioComposition) &&
        Objects.equals(this.signature, operationalPortfolioCompositionAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalPortfolioComposition, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioCompositionAndSignature {\n");
    
    sb.append("    operationalPortfolioComposition: ").append(toIndentedString(operationalPortfolioComposition)).append("\n");
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

