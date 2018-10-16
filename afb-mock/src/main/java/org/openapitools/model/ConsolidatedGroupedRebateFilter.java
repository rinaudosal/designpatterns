package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConsolidatedRebateFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsolidatedGroupedRebateFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ConsolidatedGroupedRebateFilter   {
  @JsonProperty("consolidatedRebateFilter")
  private ConsolidatedRebateFilter consolidatedRebateFilter = null;

  @JsonProperty("groupingLevelCode")
  private String groupingLevelCode = null;

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

  public ConsolidatedGroupedRebateFilter consolidatedRebateFilter(ConsolidatedRebateFilter consolidatedRebateFilter) {
    this.consolidatedRebateFilter = consolidatedRebateFilter;
    return this;
  }

  /**
   * Get consolidatedRebateFilter
   * @return consolidatedRebateFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConsolidatedRebateFilter getConsolidatedRebateFilter() {
    return consolidatedRebateFilter;
  }

  public void setConsolidatedRebateFilter(ConsolidatedRebateFilter consolidatedRebateFilter) {
    this.consolidatedRebateFilter = consolidatedRebateFilter;
  }

  public ConsolidatedGroupedRebateFilter groupingLevelCode(String groupingLevelCode) {
    this.groupingLevelCode = groupingLevelCode;
    return this;
  }

  /**
   * The {Rebate}'s grouping level requested. Refer to {listRebateGroupingLevels}
   * @return groupingLevelCode
  **/
  @ApiModelProperty(value = "The {Rebate}'s grouping level requested. Refer to {listRebateGroupingLevels}")


  public String getGroupingLevelCode() {
    return groupingLevelCode;
  }

  public void setGroupingLevelCode(String groupingLevelCode) {
    this.groupingLevelCode = groupingLevelCode;
  }

  public ConsolidatedGroupedRebateFilter period(PeriodEnum period) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsolidatedGroupedRebateFilter consolidatedGroupedRebateFilter = (ConsolidatedGroupedRebateFilter) o;
    return Objects.equals(this.consolidatedRebateFilter, consolidatedGroupedRebateFilter.consolidatedRebateFilter) &&
        Objects.equals(this.groupingLevelCode, consolidatedGroupedRebateFilter.groupingLevelCode) &&
        Objects.equals(this.period, consolidatedGroupedRebateFilter.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consolidatedRebateFilter, groupingLevelCode, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsolidatedGroupedRebateFilter {\n");
    
    sb.append("    consolidatedRebateFilter: ").append(toIndentedString(consolidatedRebateFilter)).append("\n");
    sb.append("    groupingLevelCode: ").append(toIndentedString(groupingLevelCode)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

