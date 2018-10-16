package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.Rebate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RebateAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebateAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("rebates")
  @Valid
  private List<Rebate> rebates = null;

  public RebateAndCursor cursor(Cursor cursor) {
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

  public RebateAndCursor rebates(List<Rebate> rebates) {
    this.rebates = rebates;
    return this;
  }

  public RebateAndCursor addRebatesItem(Rebate rebatesItem) {
    if (this.rebates == null) {
      this.rebates = new ArrayList<>();
    }
    this.rebates.add(rebatesItem);
    return this;
  }

  /**
   * Get rebates
   * @return rebates
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Rebate> getRebates() {
    return rebates;
  }

  public void setRebates(List<Rebate> rebates) {
    this.rebates = rebates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebateAndCursor rebateAndCursor = (RebateAndCursor) o;
    return Objects.equals(this.cursor, rebateAndCursor.cursor) &&
        Objects.equals(this.rebates, rebateAndCursor.rebates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, rebates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebateAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    rebates: ").append(toIndentedString(rebates)).append("\n");
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

