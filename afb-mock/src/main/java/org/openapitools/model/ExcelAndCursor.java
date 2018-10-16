package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Cursor;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This generic object is used keep information about how to iterate a collection of records sequentally and return them into an excel file, in binary format. In that case the object contains the cursor string of the current data in order to retrive the next or previous chunk
 */
@ApiModel(description = "This generic object is used keep information about how to iterate a collection of records sequentally and return them into an excel file, in binary format. In that case the object contains the cursor string of the current data in order to retrive the next or previous chunk")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ExcelAndCursor   {
  @JsonProperty("base64BinaryData")
  private String base64BinaryData = null;

  @JsonProperty("cursor")
  private Cursor cursor = null;

  public ExcelAndCursor base64BinaryData(String base64BinaryData) {
    this.base64BinaryData = base64BinaryData;
    return this;
  }

  /**
   * The Base64 encoded binary data, that corresponds to the exel file.
   * @return base64BinaryData
  **/
  @ApiModelProperty(value = "The Base64 encoded binary data, that corresponds to the exel file.")


  public String getBase64BinaryData() {
    return base64BinaryData;
  }

  public void setBase64BinaryData(String base64BinaryData) {
    this.base64BinaryData = base64BinaryData;
  }

  public ExcelAndCursor cursor(Cursor cursor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcelAndCursor excelAndCursor = (ExcelAndCursor) o;
    return Objects.equals(this.base64BinaryData, excelAndCursor.base64BinaryData) &&
        Objects.equals(this.cursor, excelAndCursor.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64BinaryData, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcelAndCursor {\n");
    
    sb.append("    base64BinaryData: ").append(toIndentedString(base64BinaryData)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

