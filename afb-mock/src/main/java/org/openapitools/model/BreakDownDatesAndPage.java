package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The last twelve calculation dates of fund look-through
 */
@ApiModel(description = "The last twelve calculation dates of fund look-through")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BreakDownDatesAndPage   {
  @JsonProperty("breakdownDates")
  @Valid
  private List<OffsetDateTime> breakdownDates = null;

  @JsonProperty("page")
  private Page page = null;

  public BreakDownDatesAndPage breakdownDates(List<OffsetDateTime> breakdownDates) {
    this.breakdownDates = breakdownDates;
    return this;
  }

  public BreakDownDatesAndPage addBreakdownDatesItem(OffsetDateTime breakdownDatesItem) {
    if (this.breakdownDates == null) {
      this.breakdownDates = new ArrayList<>();
    }
    this.breakdownDates.add(breakdownDatesItem);
    return this;
  }

  /**
   * The array of {date} available.
   * @return breakdownDates
  **/
  @ApiModelProperty(value = "The array of {date} available.")

  @Valid

  public List<OffsetDateTime> getBreakdownDates() {
    return breakdownDates;
  }

  public void setBreakdownDates(List<OffsetDateTime> breakdownDates) {
    this.breakdownDates = breakdownDates;
  }

  public BreakDownDatesAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreakDownDatesAndPage breakDownDatesAndPage = (BreakDownDatesAndPage) o;
    return Objects.equals(this.breakdownDates, breakDownDatesAndPage.breakdownDates) &&
        Objects.equals(this.page, breakDownDatesAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdownDates, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreakDownDatesAndPage {\n");
    
    sb.append("    breakdownDates: ").append(toIndentedString(breakdownDates)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

