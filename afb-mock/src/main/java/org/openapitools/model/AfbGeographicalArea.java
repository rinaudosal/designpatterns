package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AfbGeographicalArea
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbGeographicalArea   {
  @JsonProperty("afbGeographicalAreaCode")
  private String afbGeographicalAreaCode = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("parent")
  private String parent = null;

  public AfbGeographicalArea afbGeographicalAreaCode(String afbGeographicalAreaCode) {
    this.afbGeographicalAreaCode = afbGeographicalAreaCode;
    return this;
  }

  /**
   * Get afbGeographicalAreaCode
   * @return afbGeographicalAreaCode
  **/
  @ApiModelProperty(value = "")


  public String getAfbGeographicalAreaCode() {
    return afbGeographicalAreaCode;
  }

  public void setAfbGeographicalAreaCode(String afbGeographicalAreaCode) {
    this.afbGeographicalAreaCode = afbGeographicalAreaCode;
  }

  public AfbGeographicalArea order(Integer order) {
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

  public AfbGeographicalArea parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The AfbGeographicalArea to depended
   * @return parent
  **/
  @ApiModelProperty(value = "The AfbGeographicalArea to depended")


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
    AfbGeographicalArea afbGeographicalArea = (AfbGeographicalArea) o;
    return Objects.equals(this.afbGeographicalAreaCode, afbGeographicalArea.afbGeographicalAreaCode) &&
        Objects.equals(this.order, afbGeographicalArea.order) &&
        Objects.equals(this.parent, afbGeographicalArea.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbGeographicalAreaCode, order, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbGeographicalArea {\n");
    
    sb.append("    afbGeographicalAreaCode: ").append(toIndentedString(afbGeographicalAreaCode)).append("\n");
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

