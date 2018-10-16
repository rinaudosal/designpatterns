package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.UploadedOrder;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadedOrderAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedOrderAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("uploadedOrders")
  @Valid
  private List<UploadedOrder> uploadedOrders = null;

  public UploadedOrderAndPage page(Page page) {
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

  public UploadedOrderAndPage uploadedOrders(List<UploadedOrder> uploadedOrders) {
    this.uploadedOrders = uploadedOrders;
    return this;
  }

  public UploadedOrderAndPage addUploadedOrdersItem(UploadedOrder uploadedOrdersItem) {
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
    UploadedOrderAndPage uploadedOrderAndPage = (UploadedOrderAndPage) o;
    return Objects.equals(this.page, uploadedOrderAndPage.page) &&
        Objects.equals(this.uploadedOrders, uploadedOrderAndPage.uploadedOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, uploadedOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedOrderAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

