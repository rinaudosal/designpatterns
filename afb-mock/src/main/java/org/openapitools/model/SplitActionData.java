package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SplitActionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SplitActionData   {
  @JsonProperty("ratio")
  private String ratio = null;

  public SplitActionData ratio(String ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * @return ratio
  **/
  @ApiModelProperty(value = "")


  public String getRatio() {
    return ratio;
  }

  public void setRatio(String ratio) {
    this.ratio = ratio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitActionData splitActionData = (SplitActionData) o;
    return Objects.equals(this.ratio, splitActionData.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitActionData {\n");
    
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

