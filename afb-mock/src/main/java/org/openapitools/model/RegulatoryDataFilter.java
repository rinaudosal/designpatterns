package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegulatoryDataFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RegulatoryDataFilter   {
  @JsonProperty("regulatoryDataCode")
  private String regulatoryDataCode = null;

  public RegulatoryDataFilter regulatoryDataCode(String regulatoryDataCode) {
    this.regulatoryDataCode = regulatoryDataCode;
    return this;
  }

  /**
   * Refers to {listRegulatoryDataCodes}
   * @return regulatoryDataCode
  **/
  @ApiModelProperty(value = "Refers to {listRegulatoryDataCodes}")


  public String getRegulatoryDataCode() {
    return regulatoryDataCode;
  }

  public void setRegulatoryDataCode(String regulatoryDataCode) {
    this.regulatoryDataCode = regulatoryDataCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatoryDataFilter regulatoryDataFilter = (RegulatoryDataFilter) o;
    return Objects.equals(this.regulatoryDataCode, regulatoryDataFilter.regulatoryDataCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryDataCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDataFilter {\n");
    
    sb.append("    regulatoryDataCode: ").append(toIndentedString(regulatoryDataCode)).append("\n");
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

