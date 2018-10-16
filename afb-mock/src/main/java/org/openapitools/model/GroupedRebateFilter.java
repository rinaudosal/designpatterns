package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RebateFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupedRebateFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GroupedRebateFilter   {
  /**
   * Period to be applied.
   */
  public enum PeriodEnum {
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("period")
  private PeriodEnum period = null;

  @JsonProperty("rebateFilter")
  private RebateFilter rebateFilter = null;

  public GroupedRebateFilter period(PeriodEnum period) {
    this.period = period;
    return this;
  }

  /**
   * Period to be applied.
   * @return period
  **/
  @ApiModelProperty(value = "Period to be applied.")


  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public GroupedRebateFilter rebateFilter(RebateFilter rebateFilter) {
    this.rebateFilter = rebateFilter;
    return this;
  }

  /**
   * Get rebateFilter
   * @return rebateFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RebateFilter getRebateFilter() {
    return rebateFilter;
  }

  public void setRebateFilter(RebateFilter rebateFilter) {
    this.rebateFilter = rebateFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupedRebateFilter groupedRebateFilter = (GroupedRebateFilter) o;
    return Objects.equals(this.period, groupedRebateFilter.period) &&
        Objects.equals(this.rebateFilter, groupedRebateFilter.rebateFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, rebateFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupedRebateFilter {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    rebateFilter: ").append(toIndentedString(rebateFilter)).append("\n");
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

