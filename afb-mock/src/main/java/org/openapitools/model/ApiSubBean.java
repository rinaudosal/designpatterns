package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiSubBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ApiSubBean   {
  @JsonProperty("apiSubString")
  private String apiSubString = null;

  public ApiSubBean apiSubString(String apiSubString) {
    this.apiSubString = apiSubString;
    return this;
  }

  /**
   * Get apiSubString
   * @return apiSubString
  **/
  @ApiModelProperty(value = "")


  public String getApiSubString() {
    return apiSubString;
  }

  public void setApiSubString(String apiSubString) {
    this.apiSubString = apiSubString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSubBean apiSubBean = (ApiSubBean) o;
    return Objects.equals(this.apiSubString, apiSubBean.apiSubString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiSubString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSubBean {\n");
    
    sb.append("    apiSubString: ").append(toIndentedString(apiSubString)).append("\n");
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

