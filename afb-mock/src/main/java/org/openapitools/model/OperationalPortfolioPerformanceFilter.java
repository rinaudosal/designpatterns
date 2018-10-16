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
 * OperationalPortfolioPerformanceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioPerformanceFilter   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  /**
   * When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   */
  public enum LevelEnum {
    MODEL_PORTFOLIO("MODEL_PORTFOLIO"),
    
    REAL_PORTFOLIO("REAL_PORTFOLIO"),
    
    FINAL_INVESTOR_PORTFOLIO("FINAL_INVESTOR_PORTFOLIO");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("level")
  private LevelEnum level = null;

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

  public OperationalPortfolioPerformanceFilter currencyCode(String currencyCode) {
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

  public OperationalPortfolioPerformanceFilter endDate(OffsetDateTime endDate) {
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

  public OperationalPortfolioPerformanceFilter level(LevelEnum level) {
    this.level = level;
    return this;
  }

  /**
   * When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   * @return level
  **/
  @ApiModelProperty(value = "When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".")


  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public OperationalPortfolioPerformanceFilter retentionType(RetentionTypeEnum retentionType) {
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

  public OperationalPortfolioPerformanceFilter startDate(OffsetDateTime startDate) {
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
    OperationalPortfolioPerformanceFilter operationalPortfolioPerformanceFilter = (OperationalPortfolioPerformanceFilter) o;
    return Objects.equals(this.currencyCode, operationalPortfolioPerformanceFilter.currencyCode) &&
        Objects.equals(this.endDate, operationalPortfolioPerformanceFilter.endDate) &&
        Objects.equals(this.level, operationalPortfolioPerformanceFilter.level) &&
        Objects.equals(this.retentionType, operationalPortfolioPerformanceFilter.retentionType) &&
        Objects.equals(this.startDate, operationalPortfolioPerformanceFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, endDate, level, retentionType, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioPerformanceFilter {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

