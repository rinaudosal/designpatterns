package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AfbAsset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbAsset   {
  @JsonProperty("afbAssetCode")
  private String afbAssetCode = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("parent")
  private String parent = null;

  public AfbAsset afbAssetCode(String afbAssetCode) {
    this.afbAssetCode = afbAssetCode;
    return this;
  }

  /**
   * Get afbAssetCode
   * @return afbAssetCode
  **/
  @ApiModelProperty(value = "")


  public String getAfbAssetCode() {
    return afbAssetCode;
  }

  public void setAfbAssetCode(String afbAssetCode) {
    this.afbAssetCode = afbAssetCode;
  }

  public AfbAsset order(Integer order) {
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

  public AfbAsset parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The afbAsset to depended
   * @return parent
  **/
  @ApiModelProperty(value = "The afbAsset to depended")


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
    AfbAsset afbAsset = (AfbAsset) o;
    return Objects.equals(this.afbAssetCode, afbAsset.afbAssetCode) &&
        Objects.equals(this.order, afbAsset.order) &&
        Objects.equals(this.parent, afbAsset.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbAssetCode, order, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbAsset {\n");
    
    sb.append("    afbAssetCode: ").append(toIndentedString(afbAssetCode)).append("\n");
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

