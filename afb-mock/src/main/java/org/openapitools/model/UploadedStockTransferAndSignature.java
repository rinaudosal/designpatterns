package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Signature;
import org.openapitools.model.UploadedStockTransfer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadedStockTransferAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedStockTransferAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("uploadedStockTransfers")
  @Valid
  private List<UploadedStockTransfer> uploadedStockTransfers = null;

  public UploadedStockTransferAndSignature signature(Signature signature) {
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

  public UploadedStockTransferAndSignature uploadedStockTransfers(List<UploadedStockTransfer> uploadedStockTransfers) {
    this.uploadedStockTransfers = uploadedStockTransfers;
    return this;
  }

  public UploadedStockTransferAndSignature addUploadedStockTransfersItem(UploadedStockTransfer uploadedStockTransfersItem) {
    if (this.uploadedStockTransfers == null) {
      this.uploadedStockTransfers = new ArrayList<>();
    }
    this.uploadedStockTransfers.add(uploadedStockTransfersItem);
    return this;
  }

  /**
   * The array of {UploadedStockTransfer}s
   * @return uploadedStockTransfers
  **/
  @ApiModelProperty(value = "The array of {UploadedStockTransfer}s")

  @Valid

  public List<UploadedStockTransfer> getUploadedStockTransfers() {
    return uploadedStockTransfers;
  }

  public void setUploadedStockTransfers(List<UploadedStockTransfer> uploadedStockTransfers) {
    this.uploadedStockTransfers = uploadedStockTransfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedStockTransferAndSignature uploadedStockTransferAndSignature = (UploadedStockTransferAndSignature) o;
    return Objects.equals(this.signature, uploadedStockTransferAndSignature.signature) &&
        Objects.equals(this.uploadedStockTransfers, uploadedStockTransferAndSignature.uploadedStockTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, uploadedStockTransfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedStockTransferAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    uploadedStockTransfers: ").append(toIndentedString(uploadedStockTransfers)).append("\n");
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

