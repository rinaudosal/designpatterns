package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradingLimitFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TradingLimitFilter   {
  @JsonProperty("depositaryId")
  private Long depositaryId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("productId")
  private Long productId = null;

  public TradingLimitFilter depositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
    return this;
  }

  /**
   * The Id of the {Depositary}
   * @return depositaryId
  **/
  @ApiModelProperty(value = "The Id of the {Depositary}")


  public Long getDepositaryId() {
    return depositaryId;
  }

  public void setDepositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
  }

  public TradingLimitFilter distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public TradingLimitFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Procuct}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Procuct}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingLimitFilter tradingLimitFilter = (TradingLimitFilter) o;
    return Objects.equals(this.depositaryId, tradingLimitFilter.depositaryId) &&
        Objects.equals(this.distributorId, tradingLimitFilter.distributorId) &&
        Objects.equals(this.productId, tradingLimitFilter.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositaryId, distributorId, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingLimitFilter {\n");
    
    sb.append("    depositaryId: ").append(toIndentedString(depositaryId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

