package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A collection of an {UploadedStockTransfer.id}s
 */
@ApiModel(description = "A collection of an {UploadedStockTransfer.id}s")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedStockTransferIds   {
  @JsonProperty("ids")
  @Valid
  private List<Long> ids = null;

  public UploadedStockTransferIds ids(List<Long> ids) {
    this.ids = ids;
    return this;
  }

  public UploadedStockTransferIds addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * The array of ids of {UploadedStockTransfer}
   * @return ids
  **/
  @ApiModelProperty(value = "The array of ids of {UploadedStockTransfer}")


  public List<Long> getIds() {
    return ids;
  }

  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedStockTransferIds uploadedStockTransferIds = (UploadedStockTransferIds) o;
    return Objects.equals(this.ids, uploadedStockTransferIds.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedStockTransferIds {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

