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
 * A simple object allowing the {Consumer} to filter the result for matching either {GenericBreakdown.date} or {HoldingBreakdown.date}
 */
@ApiModel(description = "A simple object allowing the {Consumer} to filter the result for matching either {GenericBreakdown.date} or {HoldingBreakdown.date}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BreakdownFilter   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  public BreakdownFilter date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Either the {GenericBreakdown.date} or {HoldingBreakdown.date} to match.
   * @return date
  **/
  @ApiModelProperty(value = "Either the {GenericBreakdown.date} or {HoldingBreakdown.date} to match.")

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
    BreakdownFilter breakdownFilter = (BreakdownFilter) o;
    return Objects.equals(this.date, breakdownFilter.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreakdownFilter {\n");
    
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

