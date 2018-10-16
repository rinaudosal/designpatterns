package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FatcaControlling;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FatcaControllingAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FatcaControllingAndSignature   {
  @JsonProperty("fatcaControlling")
  private FatcaControlling fatcaControlling = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public FatcaControllingAndSignature fatcaControlling(FatcaControlling fatcaControlling) {
    this.fatcaControlling = fatcaControlling;
    return this;
  }

  /**
   * Get fatcaControlling
   * @return fatcaControlling
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FatcaControlling getFatcaControlling() {
    return fatcaControlling;
  }

  public void setFatcaControlling(FatcaControlling fatcaControlling) {
    this.fatcaControlling = fatcaControlling;
  }

  public FatcaControllingAndSignature signature(Signature signature) {
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
    FatcaControllingAndSignature fatcaControllingAndSignature = (FatcaControllingAndSignature) o;
    return Objects.equals(this.fatcaControlling, fatcaControllingAndSignature.fatcaControlling) &&
        Objects.equals(this.signature, fatcaControllingAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fatcaControlling, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FatcaControllingAndSignature {\n");
    
    sb.append("    fatcaControlling: ").append(toIndentedString(fatcaControlling)).append("\n");
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

