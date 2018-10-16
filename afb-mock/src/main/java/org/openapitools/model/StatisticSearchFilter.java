package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbsoluteStatisticFilter;
import org.openapitools.model.RelativeStatisticFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatisticSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StatisticSearchFilter   {
  @JsonProperty("absolute")
  private AbsoluteStatisticFilter absolute = null;

  @JsonProperty("relative")
  private RelativeStatisticFilter relative = null;

  public StatisticSearchFilter absolute(AbsoluteStatisticFilter absolute) {
    this.absolute = absolute;
    return this;
  }

  /**
   * Get absolute
   * @return absolute
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AbsoluteStatisticFilter getAbsolute() {
    return absolute;
  }

  public void setAbsolute(AbsoluteStatisticFilter absolute) {
    this.absolute = absolute;
  }

  public StatisticSearchFilter relative(RelativeStatisticFilter relative) {
    this.relative = relative;
    return this;
  }

  /**
   * Get relative
   * @return relative
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelativeStatisticFilter getRelative() {
    return relative;
  }

  public void setRelative(RelativeStatisticFilter relative) {
    this.relative = relative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticSearchFilter statisticSearchFilter = (StatisticSearchFilter) o;
    return Objects.equals(this.absolute, statisticSearchFilter.absolute) &&
        Objects.equals(this.relative, statisticSearchFilter.relative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticSearchFilter {\n");
    
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
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

