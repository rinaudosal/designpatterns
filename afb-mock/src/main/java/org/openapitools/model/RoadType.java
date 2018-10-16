package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoadType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RoadType   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public RoadType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Internal code for the Road Type
   * @return code
  **/
  @ApiModelProperty(value = "Internal code for the Road Type")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RoadType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Road type in english
   * @return description
  **/
  @ApiModelProperty(value = "Road type in english")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadType roadType = (RoadType) o;
    return Objects.equals(this.code, roadType.code) &&
        Objects.equals(this.description, roadType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

