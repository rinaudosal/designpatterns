package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This generic object is used keep information about how to iterate a collection of records sequentally. The navigation is managed using a cursor, and requesting the next or previous chunk of current data
 */
@ApiModel(description = "This generic object is used keep information about how to iterate a collection of records sequentally. The navigation is managed using a cursor, and requesting the next or previous chunk of current data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CursorFilter   {
  @JsonProperty("cursorString")
  private String cursorString = null;

  /**
   * It informs if the requested data will be return the \"PREVIOUS\" or \"NEXT\" records, acording the cursor string defined
   */
  public enum DirectionEnum {
    PREVIOUS("PREVIOUS"),
    
    NEXT("NEXT");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("direction")
  private DirectionEnum direction = null;

  public CursorFilter cursorString(String cursorString) {
    this.cursorString = cursorString;
    return this;
  }

  /**
   * This string keeps information about previous and next records that could be requested.
   * @return cursorString
  **/
  @ApiModelProperty(value = "This string keeps information about previous and next records that could be requested.")


  public String getCursorString() {
    return cursorString;
  }

  public void setCursorString(String cursorString) {
    this.cursorString = cursorString;
  }

  public CursorFilter direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * It informs if the requested data will be return the \"PREVIOUS\" or \"NEXT\" records, acording the cursor string defined
   * @return direction
  **/
  @ApiModelProperty(value = "It informs if the requested data will be return the \"PREVIOUS\" or \"NEXT\" records, acording the cursor string defined")


  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorFilter cursorFilter = (CursorFilter) o;
    return Objects.equals(this.cursorString, cursorFilter.cursorString) &&
        Objects.equals(this.direction, cursorFilter.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorString, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorFilter {\n");
    
    sb.append("    cursorString: ").append(toIndentedString(cursorString)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

