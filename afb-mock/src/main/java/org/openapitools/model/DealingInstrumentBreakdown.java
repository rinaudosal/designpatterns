package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains all the {DealingInstrument} associated to the {SavingPlan}. 10 is the maximun number of associated {DealingInstrument}s
 */
@ApiModel(description = "Contains all the {DealingInstrument} associated to the {SavingPlan}. 10 is the maximun number of associated {DealingInstrument}s")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingInstrumentBreakdown   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

  /**
   * Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {SavingPlan}.
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

  @JsonProperty("shares")
  private Double shares = null;

  public DealingInstrumentBreakdown amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount assigned to the {DealingInstrument} expressed in {SavingPlan.basicData.currencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "The amount assigned to the {DealingInstrument} expressed in {SavingPlan.basicData.currencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DealingInstrumentBreakdown dealingInstrument(ResourceReference dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
    return this;
  }

  /**
   * Get dealingInstrument
   * @return dealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getDealingInstrument() {
    return dealingInstrument;
  }

  public void setDealingInstrument(ResourceReference dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
  }

  public DealingInstrumentBreakdown dealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
    return this;
  }

  /**
   * The Id of the {DealingInstrument}
   * @return dealingInstrumentId
  **/
  @ApiModelProperty(value = "The Id of the {DealingInstrument}")


  public Long getDealingInstrumentId() {
    return dealingInstrumentId;
  }

  public void setDealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
  }

  public DealingInstrumentBreakdown dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {SavingPlan}.
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {SavingPlan}.")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public DealingInstrumentBreakdown shares(Double shares) {
    this.shares = shares;
    return this;
  }

  /**
   * The shares assigned to the {DealingInstrument}
   * @return shares
  **/
  @ApiModelProperty(value = "The shares assigned to the {DealingInstrument}")


  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealingInstrumentBreakdown dealingInstrumentBreakdown = (DealingInstrumentBreakdown) o;
    return Objects.equals(this.amount, dealingInstrumentBreakdown.amount) &&
        Objects.equals(this.dealingInstrument, dealingInstrumentBreakdown.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentId, dealingInstrumentBreakdown.dealingInstrumentId) &&
        Objects.equals(this.dealingInstrumentType, dealingInstrumentBreakdown.dealingInstrumentType) &&
        Objects.equals(this.shares, dealingInstrumentBreakdown.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, dealingInstrument, dealingInstrumentId, dealingInstrumentType, shares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingInstrumentBreakdown {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

