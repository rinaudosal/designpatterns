package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferIdsAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferIdsAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("stockTransferIds")
  @Valid
  private List<String> stockTransferIds = null;

  public StockTransferIdsAndSignature signature(Signature signature) {
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

  public StockTransferIdsAndSignature stockTransferIds(List<String> stockTransferIds) {
    this.stockTransferIds = stockTransferIds;
    return this;
  }

  public StockTransferIdsAndSignature addStockTransferIdsItem(String stockTransferIdsItem) {
    if (this.stockTransferIds == null) {
      this.stockTransferIds = new ArrayList<>();
    }
    this.stockTransferIds.add(stockTransferIdsItem);
    return this;
  }

  /**
   * The array of ids of {StockTransfer}
   * @return stockTransferIds
  **/
  @ApiModelProperty(value = "The array of ids of {StockTransfer}")


  public List<String> getStockTransferIds() {
    return stockTransferIds;
  }

  public void setStockTransferIds(List<String> stockTransferIds) {
    this.stockTransferIds = stockTransferIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferIdsAndSignature stockTransferIdsAndSignature = (StockTransferIdsAndSignature) o;
    return Objects.equals(this.signature, stockTransferIdsAndSignature.signature) &&
        Objects.equals(this.stockTransferIds, stockTransferIdsAndSignature.stockTransferIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, stockTransferIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferIdsAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    stockTransferIds: ").append(toIndentedString(stockTransferIds)).append("\n");
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

