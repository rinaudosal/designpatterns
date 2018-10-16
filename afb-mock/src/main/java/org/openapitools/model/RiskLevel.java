package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RiskLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskLevel   {
  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("value")
  private Long value = null;

  public RiskLevel imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * URL of the image representing this specific RiskLevel
   * @return imageUrl
  **/
  @ApiModelProperty(value = "URL of the image representing this specific RiskLevel")


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public RiskLevel value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * Risk Level value
   * @return value
  **/
  @ApiModelProperty(value = "Risk Level value")


  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
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
    RiskLevel riskLevel = (RiskLevel) o;
    return Objects.equals(this.imageUrl, riskLevel.imageUrl) &&
        Objects.equals(this.value, riskLevel.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskLevel {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

