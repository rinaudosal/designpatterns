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
 * CompositionDealingInstrument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CompositionDealingInstrument   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("dealingFundHouse")
  private ResourceReference dealingFundHouse = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

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

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("weightPercentage")
  private Double weightPercentage = null;

  public CompositionDealingInstrument amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount
   * @return amount
  **/
  @ApiModelProperty(value = "Amount")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CompositionDealingInstrument dealingFundHouse(ResourceReference dealingFundHouse) {
    this.dealingFundHouse = dealingFundHouse;
    return this;
  }

  /**
   * Get dealingFundHouse
   * @return dealingFundHouse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getDealingFundHouse() {
    return dealingFundHouse;
  }

  public void setDealingFundHouse(ResourceReference dealingFundHouse) {
    this.dealingFundHouse = dealingFundHouse;
  }

  public CompositionDealingInstrument dealingInstrument(ResourceReference dealingInstrument) {
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

  public CompositionDealingInstrument dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
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

  public CompositionDealingInstrument errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code refer to {CompositionDealingInstrument}
   * @return errorCode
  **/
  @ApiModelProperty(value = "Error code refer to {CompositionDealingInstrument}")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public CompositionDealingInstrument weightPercentage(Double weightPercentage) {
    this.weightPercentage = weightPercentage;
    return this;
  }

  /**
   * Weight Percentage refer to {OperationalPortfolioComposition}
   * @return weightPercentage
  **/
  @ApiModelProperty(value = "Weight Percentage refer to {OperationalPortfolioComposition}")


  public Double getWeightPercentage() {
    return weightPercentage;
  }

  public void setWeightPercentage(Double weightPercentage) {
    this.weightPercentage = weightPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositionDealingInstrument compositionDealingInstrument = (CompositionDealingInstrument) o;
    return Objects.equals(this.amount, compositionDealingInstrument.amount) &&
        Objects.equals(this.dealingFundHouse, compositionDealingInstrument.dealingFundHouse) &&
        Objects.equals(this.dealingInstrument, compositionDealingInstrument.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, compositionDealingInstrument.dealingInstrumentType) &&
        Objects.equals(this.errorCode, compositionDealingInstrument.errorCode) &&
        Objects.equals(this.weightPercentage, compositionDealingInstrument.weightPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, dealingFundHouse, dealingInstrument, dealingInstrumentType, errorCode, weightPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositionDealingInstrument {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dealingFundHouse: ").append(toIndentedString(dealingFundHouse)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    weightPercentage: ").append(toIndentedString(weightPercentage)).append("\n");
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

