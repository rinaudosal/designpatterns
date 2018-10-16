package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This generic object is used keep information about how to iterate a collection of records sequentally. In that case the object contains the cursor string of the current data in order to retrive the next or previous chunk
 */
@ApiModel(description = "This generic object is used keep information about how to iterate a collection of records sequentally. In that case the object contains the cursor string of the current data in order to retrive the next or previous chunk")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Cursor   {
  @JsonProperty("cursorString")
  private String cursorString = null;

  @JsonProperty("hasNext")
  private Boolean hasNext = null;

  @JsonProperty("hasPrevious")
  private Boolean hasPrevious = null;

  public Cursor cursorString(String cursorString) {
    this.cursorString = cursorString;
    return this;
  }

  /**
   * This string keeps information about previos and next records that could be requested.
   * @return cursorString
  **/
  @ApiModelProperty(value = "This string keeps information about previos and next records that could be requested.")


  public String getCursorString() {
    return cursorString;
  }

  public void setCursorString(String cursorString) {
    this.cursorString = cursorString;
  }

  public Cursor hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

  /**
   * It informs if there are more records to be requested
   * @return hasNext
  **/
  @ApiModelProperty(value = "It informs if there are more records to be requested")


  public Boolean getHasNext() {
    return hasNext;
  }

  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public Cursor hasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

  /**
   * It informs if there are previous records to be requested
   * @return hasPrevious
  **/
  @ApiModelProperty(value = "It informs if there are previous records to be requested")


  public Boolean getHasPrevious() {
    return hasPrevious;
  }

  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cursor cursor = (Cursor) o;
    return Objects.equals(this.cursorString, cursor.cursorString) &&
        Objects.equals(this.hasNext, cursor.hasNext) &&
        Objects.equals(this.hasPrevious, cursor.hasPrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorString, hasNext, hasPrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cursor {\n");
    
    sb.append("    cursorString: ").append(toIndentedString(cursorString)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
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

