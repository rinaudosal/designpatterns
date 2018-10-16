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
 * RiskControlAlarmFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskControlAlarmFilter   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  /**
   * Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the status of the {RiskControlAlarm}
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

  @JsonProperty("typeCode")
  private String typeCode = null;

  public RiskControlAlarmFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the {RiskControlAlarm}
   * @return name
  **/
  @ApiModelProperty(value = "The name of the {RiskControlAlarm}")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RiskControlAlarmFilter operationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolio}
   * @return operationalPortfolioId
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolio}")


  public Long getOperationalPortfolioId() {
    return operationalPortfolioId;
  }

  public void setOperationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
  }

  public RiskControlAlarmFilter operationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }

  /**
   * Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the status of the {RiskControlAlarm}
   * @return operationalStatus
  **/
  @ApiModelProperty(value = "Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the status of the {RiskControlAlarm}")


  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }

  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }

  public RiskControlAlarmFilter typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * The type of alarm. Refer to {listRiskControlAlarmTypes}
   * @return typeCode
  **/
  @ApiModelProperty(value = "The type of alarm. Refer to {listRiskControlAlarmTypes}")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskControlAlarmFilter riskControlAlarmFilter = (RiskControlAlarmFilter) o;
    return Objects.equals(this.name, riskControlAlarmFilter.name) &&
        Objects.equals(this.operationalPortfolioId, riskControlAlarmFilter.operationalPortfolioId) &&
        Objects.equals(this.operationalStatus, riskControlAlarmFilter.operationalStatus) &&
        Objects.equals(this.typeCode, riskControlAlarmFilter.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operationalPortfolioId, operationalStatus, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskControlAlarmFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

