package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Efama
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Efama   {
  @JsonProperty("efamaCode")
  private String efamaCode = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("parent")
  private String parent = null;

  public Efama efamaCode(String efamaCode) {
    this.efamaCode = efamaCode;
    return this;
  }

  /**
   * Get efamaCode
   * @return efamaCode
  **/
  @ApiModelProperty(value = "")


  public String getEfamaCode() {
    return efamaCode;
  }

  public void setEfamaCode(String efamaCode) {
    this.efamaCode = efamaCode;
  }

  public Efama order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * The order to show
   * @return order
  **/
  @ApiModelProperty(value = "The order to show")


  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public Efama parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The efama to depended
   * @return parent
  **/
  @ApiModelProperty(value = "The efama to depended")


  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Efama efama = (Efama) o;
    return Objects.equals(this.efamaCode, efama.efamaCode) &&
        Objects.equals(this.order, efama.order) &&
        Objects.equals(this.parent, efama.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(efamaCode, order, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Efama {\n");
    
    sb.append("    efamaCode: ").append(toIndentedString(efamaCode)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

