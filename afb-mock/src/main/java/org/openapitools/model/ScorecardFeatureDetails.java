package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ScorecardFeatureDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ScorecardFeatureDetails   {
  @JsonProperty("featureTypeCode")
  private String featureTypeCode = null;

  @JsonProperty("mathematicalFunctionsCode")
  private String mathematicalFunctionsCode = null;

  public ScorecardFeatureDetails featureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
    return this;
  }

  /**
   * The feature of Scorecard. Refer to {listScorecardFeaturesByDistributor}
   * @return featureTypeCode
  **/
  @ApiModelProperty(value = "The feature of Scorecard. Refer to {listScorecardFeaturesByDistributor}")


  public String getFeatureTypeCode() {
    return featureTypeCode;
  }

  public void setFeatureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
  }

  public ScorecardFeatureDetails mathematicalFunctionsCode(String mathematicalFunctionsCode) {
    this.mathematicalFunctionsCode = mathematicalFunctionsCode;
    return this;
  }

  /**
   * The main mathematical function of the {Scorecard}. Refer to {listScorecardMathematicalFunctionValues}
   * @return mathematicalFunctionsCode
  **/
  @ApiModelProperty(value = "The main mathematical function of the {Scorecard}. Refer to {listScorecardMathematicalFunctionValues}")


  public String getMathematicalFunctionsCode() {
    return mathematicalFunctionsCode;
  }

  public void setMathematicalFunctionsCode(String mathematicalFunctionsCode) {
    this.mathematicalFunctionsCode = mathematicalFunctionsCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScorecardFeatureDetails scorecardFeatureDetails = (ScorecardFeatureDetails) o;
    return Objects.equals(this.featureTypeCode, scorecardFeatureDetails.featureTypeCode) &&
        Objects.equals(this.mathematicalFunctionsCode, scorecardFeatureDetails.mathematicalFunctionsCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureTypeCode, mathematicalFunctionsCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorecardFeatureDetails {\n");
    
    sb.append("    featureTypeCode: ").append(toIndentedString(featureTypeCode)).append("\n");
    sb.append("    mathematicalFunctionsCode: ").append(toIndentedString(mathematicalFunctionsCode)).append("\n");
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

