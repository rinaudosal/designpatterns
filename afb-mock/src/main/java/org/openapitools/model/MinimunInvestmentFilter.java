package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MinimunInvestmentFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MinimunInvestmentFilter   {
  @JsonProperty("initial")
  private NumberComparisonFilter initial = null;

  @JsonProperty("subsequent")
  private NumberComparisonFilter subsequent = null;

  /**
   * Gets or Sets typeValue
   */
  public enum TypeValueEnum {
    UNITS("UNITS"),
    
    AMOUNT("AMOUNT");

    private String value;

    TypeValueEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeValueEnum fromValue(String text) {
      for (TypeValueEnum b : TypeValueEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("typeValue")
  private TypeValueEnum typeValue = null;

  public MinimunInvestmentFilter initial(NumberComparisonFilter initial) {
    this.initial = initial;
    return this;
  }

  /**
   * Get initial
   * @return initial
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getInitial() {
    return initial;
  }

  public void setInitial(NumberComparisonFilter initial) {
    this.initial = initial;
  }

  public MinimunInvestmentFilter subsequent(NumberComparisonFilter subsequent) {
    this.subsequent = subsequent;
    return this;
  }

  /**
   * Get subsequent
   * @return subsequent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getSubsequent() {
    return subsequent;
  }

  public void setSubsequent(NumberComparisonFilter subsequent) {
    this.subsequent = subsequent;
  }

  public MinimunInvestmentFilter typeValue(TypeValueEnum typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * Get typeValue
   * @return typeValue
  **/
  @ApiModelProperty(value = "")


  public TypeValueEnum getTypeValue() {
    return typeValue;
  }

  public void setTypeValue(TypeValueEnum typeValue) {
    this.typeValue = typeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimunInvestmentFilter minimunInvestmentFilter = (MinimunInvestmentFilter) o;
    return Objects.equals(this.initial, minimunInvestmentFilter.initial) &&
        Objects.equals(this.subsequent, minimunInvestmentFilter.subsequent) &&
        Objects.equals(this.typeValue, minimunInvestmentFilter.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initial, subsequent, typeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimunInvestmentFilter {\n");
    
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    subsequent: ").append(toIndentedString(subsequent)).append("\n");
    sb.append("    typeValue: ").append(toIndentedString(typeValue)).append("\n");
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

