package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Signature;
import org.openapitools.model.UploadedOrder;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadedOrderAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedOrderAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("uploadedOrders")
  @Valid
  private List<UploadedOrder> uploadedOrders = null;

  public UploadedOrderAndSignature signature(Signature signature) {
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

  public UploadedOrderAndSignature uploadedOrders(List<UploadedOrder> uploadedOrders) {
    this.uploadedOrders = uploadedOrders;
    return this;
  }

  public UploadedOrderAndSignature addUploadedOrdersItem(UploadedOrder uploadedOrdersItem) {
    if (this.uploadedOrders == null) {
      this.uploadedOrders = new ArrayList<>();
    }
    this.uploadedOrders.add(uploadedOrdersItem);
    return this;
  }

  /**
   * The array of {UploadedOrder}s
   * @return uploadedOrders
  **/
  @ApiModelProperty(value = "The array of {UploadedOrder}s")

  @Valid

  public List<UploadedOrder> getUploadedOrders() {
    return uploadedOrders;
  }

  public void setUploadedOrders(List<UploadedOrder> uploadedOrders) {
    this.uploadedOrders = uploadedOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedOrderAndSignature uploadedOrderAndSignature = (UploadedOrderAndSignature) o;
    return Objects.equals(this.signature, uploadedOrderAndSignature.signature) &&
        Objects.equals(this.uploadedOrders, uploadedOrderAndSignature.uploadedOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, uploadedOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedOrderAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    uploadedOrders: ").append(toIndentedString(uploadedOrders)).append("\n");
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

