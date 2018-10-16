package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sector
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Sector   {
  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("parent")
  private String parent = null;

  @JsonProperty("sectorCode")
  private String sectorCode = null;

  public Sector order(Integer order) {
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

  public Sector parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The sector to depended
   * @return parent
  **/
  @ApiModelProperty(value = "The sector to depended")


  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public Sector sectorCode(String sectorCode) {
    this.sectorCode = sectorCode;
    return this;
  }

  /**
   * Get sectorCode
   * @return sectorCode
  **/
  @ApiModelProperty(value = "")


  public String getSectorCode() {
    return sectorCode;
  }

  public void setSectorCode(String sectorCode) {
    this.sectorCode = sectorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sector sector = (Sector) o;
    return Objects.equals(this.order, sector.order) &&
        Objects.equals(this.parent, sector.parent) &&
        Objects.equals(this.sectorCode, sector.sectorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, parent, sectorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sector {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    sectorCode: ").append(toIndentedString(sectorCode)).append("\n");
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

