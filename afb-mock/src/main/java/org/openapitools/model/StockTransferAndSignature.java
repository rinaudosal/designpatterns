package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Signature;
import org.openapitools.model.StockTransfer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("stockTransfer")
  private StockTransfer stockTransfer = null;

  public StockTransferAndSignature signature(Signature signature) {
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

  public StockTransferAndSignature stockTransfer(StockTransfer stockTransfer) {
    this.stockTransfer = stockTransfer;
    return this;
  }

  /**
   * Get stockTransfer
   * @return stockTransfer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransfer getStockTransfer() {
    return stockTransfer;
  }

  public void setStockTransfer(StockTransfer stockTransfer) {
    this.stockTransfer = stockTransfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferAndSignature stockTransferAndSignature = (StockTransferAndSignature) o;
    return Objects.equals(this.signature, stockTransferAndSignature.signature) &&
        Objects.equals(this.stockTransfer, stockTransferAndSignature.stockTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, stockTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    stockTransfer: ").append(toIndentedString(stockTransfer)).append("\n");
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

