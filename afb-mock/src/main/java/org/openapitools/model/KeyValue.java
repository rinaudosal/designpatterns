package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This generic object is used to hold a specific key and its corresponding value. It is mainly used to list references to external identifications and classifications, such as the {InstrumentExternalCode} of a financial instrument or its different classifications.
 */
@ApiModel(description = "This generic object is used to hold a specific key and its corresponding value. It is mainly used to list references to external identifications and classifications, such as the {InstrumentExternalCode} of a financial instrument or its different classifications.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class KeyValue   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public KeyValue key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Code
   * @return key
  **/
  @ApiModelProperty(value = "Code")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KeyValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value
   * @return value
  **/
  @ApiModelProperty(value = "Value")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyValue keyValue = (KeyValue) o;
    return Objects.equals(this.key, keyValue.key) &&
        Objects.equals(this.value, keyValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValue {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

