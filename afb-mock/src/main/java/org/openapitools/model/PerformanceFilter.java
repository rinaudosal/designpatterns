package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PerformanceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PerformanceFilter   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  /**
   * Gross or Net dividend in UK
   */
  public enum RetentionTypeEnum {
    GROSS("GROSS"),
    
    NET("NET");

    private String value;

    RetentionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RetentionTypeEnum fromValue(String text) {
      for (RetentionTypeEnum b : RetentionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("retentionType")
  private RetentionTypeEnum retentionType = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public PerformanceFilter currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The {Fund}'s currency. Refers to {listCalculationCurrencies}.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The {Fund}'s currency. Refers to {listCalculationCurrencies}.")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PerformanceFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Date.
   * @return endDate
  **/
  @ApiModelProperty(value = "Date.")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public PerformanceFilter retentionType(RetentionTypeEnum retentionType) {
    this.retentionType = retentionType;
    return this;
  }

  /**
   * Gross or Net dividend in UK
   * @return retentionType
  **/
  @ApiModelProperty(value = "Gross or Net dividend in UK")


  public RetentionTypeEnum getRetentionType() {
    return retentionType;
  }

  public void setRetentionType(RetentionTypeEnum retentionType) {
    this.retentionType = retentionType;
  }

  public PerformanceFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date.
   * @return startDate
  **/
  @ApiModelProperty(value = "Date.")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceFilter performanceFilter = (PerformanceFilter) o;
    return Objects.equals(this.currencyCode, performanceFilter.currencyCode) &&
        Objects.equals(this.endDate, performanceFilter.endDate) &&
        Objects.equals(this.retentionType, performanceFilter.retentionType) &&
        Objects.equals(this.startDate, performanceFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, endDate, retentionType, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceFilter {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

