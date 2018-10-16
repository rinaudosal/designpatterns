package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.UploadedStockTransfer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadedStockTransferAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedStockTransferAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("uploadedStockTransfers")
  @Valid
  private List<UploadedStockTransfer> uploadedStockTransfers = null;

  public UploadedStockTransferAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public UploadedStockTransferAndPage uploadedStockTransfers(List<UploadedStockTransfer> uploadedStockTransfers) {
    this.uploadedStockTransfers = uploadedStockTransfers;
    return this;
  }

  public UploadedStockTransferAndPage addUploadedStockTransfersItem(UploadedStockTransfer uploadedStockTransfersItem) {
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
    UploadedStockTransferAndPage uploadedStockTransferAndPage = (UploadedStockTransferAndPage) o;
    return Objects.equals(this.page, uploadedStockTransferAndPage.page) &&
        Objects.equals(this.uploadedStockTransfers, uploadedStockTransferAndPage.uploadedStockTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, uploadedStockTransfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedStockTransferAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

