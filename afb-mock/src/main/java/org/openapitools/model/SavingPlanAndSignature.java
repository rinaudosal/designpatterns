package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SavingPlan;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlanAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanAndSignature   {
  @JsonProperty("savingPlan")
  private SavingPlan savingPlan = null;

  @JsonProperty("signature")
  private Signature signature = null;

  public SavingPlanAndSignature savingPlan(SavingPlan savingPlan) {
    this.savingPlan = savingPlan;
    return this;
  }

  /**
   * Get savingPlan
   * @return savingPlan
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SavingPlan getSavingPlan() {
    return savingPlan;
  }

  public void setSavingPlan(SavingPlan savingPlan) {
    this.savingPlan = savingPlan;
  }

  public SavingPlanAndSignature signature(Signature signature) {
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
    SavingPlanAndSignature savingPlanAndSignature = (SavingPlanAndSignature) o;
    return Objects.equals(this.savingPlan, savingPlanAndSignature.savingPlan) &&
        Objects.equals(this.signature, savingPlanAndSignature.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingPlan, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanAndSignature {\n");
    
    sb.append("    savingPlan: ").append(toIndentedString(savingPlan)).append("\n");
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

