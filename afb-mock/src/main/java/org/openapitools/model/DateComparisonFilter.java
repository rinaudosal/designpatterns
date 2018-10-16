package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DateComparisonFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DateComparisonFilter   {
  @JsonProperty("comparisonCode")
  private String comparisonCode = null;

  @JsonProperty("value")
  private OffsetDateTime value = null;

  public DateComparisonFilter comparisonCode(String comparisonCode) {
    this.comparisonCode = comparisonCode;
    return this;
  }

  /**
   * The Comparison's code. Refer to {listComparisons}
   * @return comparisonCode
  **/
  @ApiModelProperty(value = "The Comparison's code. Refer to {listComparisons}")


  public String getComparisonCode() {
    return comparisonCode;
  }

  public void setComparisonCode(String comparisonCode) {
    this.comparisonCode = comparisonCode;
  }

  public DateComparisonFilter value(OffsetDateTime value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getValue() {
    return value;
  }

  public void setValue(OffsetDateTime value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateComparisonFilter dateComparisonFilter = (DateComparisonFilter) o;
    return Objects.equals(this.comparisonCode, dateComparisonFilter.comparisonCode) &&
        Objects.equals(this.value, dateComparisonFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateComparisonFilter {\n");
    
    sb.append("    comparisonCode: ").append(toIndentedString(comparisonCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

