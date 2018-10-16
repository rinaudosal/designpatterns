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
 * DateOperatorComparisonFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DateOperatorComparisonFilter   {
  /**
   * Gets or Sets comparisonCodeType
   */
  public enum ComparisonCodeTypeEnum {
    GT("GT"),
    
    GE("GE"),
    
    LT("LT"),
    
    LE("LE"),
    
    EQ("EQ"),
    
    NE("NE");

    private String value;

    ComparisonCodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComparisonCodeTypeEnum fromValue(String text) {
      for (ComparisonCodeTypeEnum b : ComparisonCodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("comparisonCodeType")
  private ComparisonCodeTypeEnum comparisonCodeType = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  public DateOperatorComparisonFilter comparisonCodeType(ComparisonCodeTypeEnum comparisonCodeType) {
    this.comparisonCodeType = comparisonCodeType;
    return this;
  }

  /**
   * Get comparisonCodeType
   * @return comparisonCodeType
  **/
  @ApiModelProperty(value = "")


  public ComparisonCodeTypeEnum getComparisonCodeType() {
    return comparisonCodeType;
  }

  public void setComparisonCodeType(ComparisonCodeTypeEnum comparisonCodeType) {
    this.comparisonCodeType = comparisonCodeType;
  }

  public DateOperatorComparisonFilter date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateOperatorComparisonFilter dateOperatorComparisonFilter = (DateOperatorComparisonFilter) o;
    return Objects.equals(this.comparisonCodeType, dateOperatorComparisonFilter.comparisonCodeType) &&
        Objects.equals(this.date, dateOperatorComparisonFilter.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonCodeType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateOperatorComparisonFilter {\n");
    
    sb.append("    comparisonCodeType: ").append(toIndentedString(comparisonCodeType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

