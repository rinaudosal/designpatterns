package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioFilter   {
  @JsonProperty("supervision")
  private Boolean supervision = null;

  public OperationalPortfolioFilter supervision(Boolean supervision) {
    this.supervision = supervision;
    return this;
  }

  /**
   * Indicates if you have supervision
   * @return supervision
  **/
  @ApiModelProperty(value = "Indicates if you have supervision")


  public Boolean getSupervision() {
    return supervision;
  }

  public void setSupervision(Boolean supervision) {
    this.supervision = supervision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioFilter operationalPortfolioFilter = (OperationalPortfolioFilter) o;
    return Objects.equals(this.supervision, operationalPortfolioFilter.supervision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supervision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioFilter {\n");
    
    sb.append("    supervision: ").append(toIndentedString(supervision)).append("\n");
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

