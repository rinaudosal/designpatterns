package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderFilter   {
  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   */
  public enum DealingInstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    DealingInstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DealingInstrumentTypeEnum fromValue(String text) {
      for (DealingInstrumentTypeEnum b : DealingInstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("dealingInstrumentType")
  private DealingInstrumentTypeEnum dealingInstrumentType = null;

  public OrderFilter dealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
    return this;
  }

  /**
   * The Id of the {dealingInstrumentId}
   * @return dealingInstrumentId
  **/
  @ApiModelProperty(value = "The Id of the {dealingInstrumentId}")


  public Long getDealingInstrumentId() {
    return dealingInstrumentId;
  }

  public void setDealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
  }

  public OrderFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFilter orderFilter = (OrderFilter) o;
    return Objects.equals(this.dealingInstrumentId, orderFilter.dealingInstrumentId) &&
        Objects.equals(this.dealingInstrumentType, orderFilter.dealingInstrumentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingInstrumentId, dealingInstrumentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFilter {\n");
    
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
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

