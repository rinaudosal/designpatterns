package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CostsAndChargesExAnte;
import org.openapitools.model.CostsAndChargesExPost;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CostsAndCharges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CostsAndCharges   {
  @JsonProperty("exAnte")
  private CostsAndChargesExAnte exAnte = null;

  @JsonProperty("exPost")
  private CostsAndChargesExPost exPost = null;

  public CostsAndCharges exAnte(CostsAndChargesExAnte exAnte) {
    this.exAnte = exAnte;
    return this;
  }

  /**
   * Get exAnte
   * @return exAnte
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CostsAndChargesExAnte getExAnte() {
    return exAnte;
  }

  public void setExAnte(CostsAndChargesExAnte exAnte) {
    this.exAnte = exAnte;
  }

  public CostsAndCharges exPost(CostsAndChargesExPost exPost) {
    this.exPost = exPost;
    return this;
  }

  /**
   * Get exPost
   * @return exPost
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CostsAndChargesExPost getExPost() {
    return exPost;
  }

  public void setExPost(CostsAndChargesExPost exPost) {
    this.exPost = exPost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostsAndCharges costsAndCharges = (CostsAndCharges) o;
    return Objects.equals(this.exAnte, costsAndCharges.exAnte) &&
        Objects.equals(this.exPost, costsAndCharges.exPost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exAnte, exPost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostsAndCharges {\n");
    
    sb.append("    exAnte: ").append(toIndentedString(exAnte)).append("\n");
    sb.append("    exPost: ").append(toIndentedString(exPost)).append("\n");
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

