package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvestmentLimitFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InvestmentLimitFilter   {
  @JsonProperty("featureTypeCode")
  private String featureTypeCode = null;

  @JsonProperty("investmentLimitRiskLevelCode")
  private String investmentLimitRiskLevelCode = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Enum to select between \"ACTIVED\" \"DESACTIVED\". Indicates the type of the {InvestmentLimit}
   */
  public enum OperationalStatusEnum {
    ACTIVED("ACTIVED"),
    
    DESACTIVED("DESACTIVED");

    private String value;

    OperationalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationalStatusEnum fromValue(String text) {
      for (OperationalStatusEnum b : OperationalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operationalStatus")
  private OperationalStatusEnum operationalStatus = null;

  public InvestmentLimitFilter featureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
    return this;
  }

  /**
   * The feature of InvestmentLimit. Refer to {listInvestmentLimitFeaturesByDistributor}
   * @return featureTypeCode
  **/
  @ApiModelProperty(value = "The feature of InvestmentLimit. Refer to {listInvestmentLimitFeaturesByDistributor}")


  public String getFeatureTypeCode() {
    return featureTypeCode;
  }

  public void setFeatureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
  }

  public InvestmentLimitFilter investmentLimitRiskLevelCode(String investmentLimitRiskLevelCode) {
    this.investmentLimitRiskLevelCode = investmentLimitRiskLevelCode;
    return this;
  }

  /**
   * The feature of InvestmentLimit. Refer to {listInvestmentLimitRiskLevels}
   * @return investmentLimitRiskLevelCode
  **/
  @ApiModelProperty(value = "The feature of InvestmentLimit. Refer to {listInvestmentLimitRiskLevels}")


  public String getInvestmentLimitRiskLevelCode() {
    return investmentLimitRiskLevelCode;
  }

  public void setInvestmentLimitRiskLevelCode(String investmentLimitRiskLevelCode) {
    this.investmentLimitRiskLevelCode = investmentLimitRiskLevelCode;
  }

  public InvestmentLimitFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The Name of the {InvestmentLimit}
   * @return name
  **/
  @ApiModelProperty(value = "The Name of the {InvestmentLimit}")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InvestmentLimitFilter operationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }

  /**
   * Enum to select between \"ACTIVED\" \"DESACTIVED\". Indicates the type of the {InvestmentLimit}
   * @return operationalStatus
  **/
  @ApiModelProperty(value = "Enum to select between \"ACTIVED\" \"DESACTIVED\". Indicates the type of the {InvestmentLimit}")


  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }

  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentLimitFilter investmentLimitFilter = (InvestmentLimitFilter) o;
    return Objects.equals(this.featureTypeCode, investmentLimitFilter.featureTypeCode) &&
        Objects.equals(this.investmentLimitRiskLevelCode, investmentLimitFilter.investmentLimitRiskLevelCode) &&
        Objects.equals(this.name, investmentLimitFilter.name) &&
        Objects.equals(this.operationalStatus, investmentLimitFilter.operationalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureTypeCode, investmentLimitRiskLevelCode, name, operationalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentLimitFilter {\n");
    
    sb.append("    featureTypeCode: ").append(toIndentedString(featureTypeCode)).append("\n");
    sb.append("    investmentLimitRiskLevelCode: ").append(toIndentedString(investmentLimitRiskLevelCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
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

