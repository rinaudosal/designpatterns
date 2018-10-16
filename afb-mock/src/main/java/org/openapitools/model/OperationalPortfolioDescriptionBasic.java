package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioDescriptionBasic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioDescriptionBasic   {
  @JsonProperty("generalDescription")
  private String generalDescription = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("monthlyAnalysis")
  private String monthlyAnalysis = null;

  public OperationalPortfolioDescriptionBasic generalDescription(String generalDescription) {
    this.generalDescription = generalDescription;
    return this;
  }

  /**
   * General Description
   * @return generalDescription
  **/
  @ApiModelProperty(value = "General Description")


  public String getGeneralDescription() {
    return generalDescription;
  }

  public void setGeneralDescription(String generalDescription) {
    this.generalDescription = generalDescription;
  }

  public OperationalPortfolioDescriptionBasic languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * The {OperationalPortfolioDescriptionBasic} language code. Refer to {listLanguages}
   * @return languageCode
  **/
  @ApiModelProperty(value = "The {OperationalPortfolioDescriptionBasic} language code. Refer to {listLanguages}")


  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public OperationalPortfolioDescriptionBasic monthlyAnalysis(String monthlyAnalysis) {
    this.monthlyAnalysis = monthlyAnalysis;
    return this;
  }

  /**
   * Monthly Analysis
   * @return monthlyAnalysis
  **/
  @ApiModelProperty(value = "Monthly Analysis")


  public String getMonthlyAnalysis() {
    return monthlyAnalysis;
  }

  public void setMonthlyAnalysis(String monthlyAnalysis) {
    this.monthlyAnalysis = monthlyAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioDescriptionBasic operationalPortfolioDescriptionBasic = (OperationalPortfolioDescriptionBasic) o;
    return Objects.equals(this.generalDescription, operationalPortfolioDescriptionBasic.generalDescription) &&
        Objects.equals(this.languageCode, operationalPortfolioDescriptionBasic.languageCode) &&
        Objects.equals(this.monthlyAnalysis, operationalPortfolioDescriptionBasic.monthlyAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalDescription, languageCode, monthlyAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioDescriptionBasic {\n");
    
    sb.append("    generalDescription: ").append(toIndentedString(generalDescription)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    monthlyAnalysis: ").append(toIndentedString(monthlyAnalysis)).append("\n");
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

