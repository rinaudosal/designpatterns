package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is a generic object that holds a &#x60;code&#x60; and it&#39;s &#x60;description&#x60;. It is used throughout the different {Catalogs}.
 */
@ApiModel(description = "This is a generic object that holds a `code` and it's `description`. It is used throughout the different {Catalogs}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CodeDescription   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public CodeDescription code(String code) {
    this.code = code;
    return this;
  }

  /**
   * This `code` attribute contains the key of this `CodeDescription` oject. It is unique in the corresponding context.
   * @return code
  **/
  @ApiModelProperty(value = "This `code` attribute contains the key of this `CodeDescription` oject. It is unique in the corresponding context.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CodeDescription description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of that specific code. This will be localized according to the `Accept-Language` HTTP Header. See {I18N} for more details.
   * @return description
  **/
  @ApiModelProperty(value = "A short description of that specific code. This will be localized according to the `Accept-Language` HTTP Header. See {I18N} for more details.")


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
    CodeDescription codeDescription = (CodeDescription) o;
    return Objects.equals(this.code, codeDescription.code) &&
        Objects.equals(this.description, codeDescription.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeDescription {\n");
    
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

