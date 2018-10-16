package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationFormFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ApplicationFormFilter   {
  @JsonProperty("showSignature")
  private Boolean showSignature = null;

  public ApplicationFormFilter showSignature(Boolean showSignature) {
    this.showSignature = showSignature;
    return this;
  }

  /**
   * Indicates whether user has selected the option to include the appropiate signatures in the requested Application Form of the {StockTransfer}
   * @return showSignature
  **/
  @ApiModelProperty(value = "Indicates whether user has selected the option to include the appropiate signatures in the requested Application Form of the {StockTransfer}")


  public Boolean getShowSignature() {
    return showSignature;
  }

  public void setShowSignature(Boolean showSignature) {
    this.showSignature = showSignature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationFormFilter applicationFormFilter = (ApplicationFormFilter) o;
    return Objects.equals(this.showSignature, applicationFormFilter.showSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationFormFilter {\n");
    
    sb.append("    showSignature: ").append(toIndentedString(showSignature)).append("\n");
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

