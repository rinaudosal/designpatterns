package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.GroupedRebate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupedRebateAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GroupedRebateAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("groupedRebates")
  @Valid
  private List<GroupedRebate> groupedRebates = null;

  public GroupedRebateAndCursor cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cursor getCursor() {
    return cursor;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

  public GroupedRebateAndCursor groupedRebates(List<GroupedRebate> groupedRebates) {
    this.groupedRebates = groupedRebates;
    return this;
  }

  public GroupedRebateAndCursor addGroupedRebatesItem(GroupedRebate groupedRebatesItem) {
    if (this.groupedRebates == null) {
      this.groupedRebates = new ArrayList<>();
    }
    this.groupedRebates.add(groupedRebatesItem);
    return this;
  }

  /**
   * Get groupedRebates
   * @return groupedRebates
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GroupedRebate> getGroupedRebates() {
    return groupedRebates;
  }

  public void setGroupedRebates(List<GroupedRebate> groupedRebates) {
    this.groupedRebates = groupedRebates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupedRebateAndCursor groupedRebateAndCursor = (GroupedRebateAndCursor) o;
    return Objects.equals(this.cursor, groupedRebateAndCursor.cursor) &&
        Objects.equals(this.groupedRebates, groupedRebateAndCursor.groupedRebates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, groupedRebates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupedRebateAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    groupedRebates: ").append(toIndentedString(groupedRebates)).append("\n");
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

