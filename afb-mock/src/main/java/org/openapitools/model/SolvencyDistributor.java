package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.SolvencyFund;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyDistributor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyDistributor   {
  @JsonProperty("authorizedCode")
  private String authorizedCode = null;

  @JsonProperty("estimatedDate")
  private OffsetDateTime estimatedDate = null;

  @JsonProperty("fundHouseGroupName")
  private String fundHouseGroupName = null;

  @JsonProperty("intermediaryName")
  private String intermediaryName = null;

  @JsonProperty("solvencyFund")
  private SolvencyFund solvencyFund = null;

  public SolvencyDistributor authorizedCode(String authorizedCode) {
    this.authorizedCode = authorizedCode;
    return this;
  }

  /**
   * The code of the {listAuthorized}
   * @return authorizedCode
  **/
  @ApiModelProperty(value = "The code of the {listAuthorized}")


  public String getAuthorizedCode() {
    return authorizedCode;
  }

  public void setAuthorizedCode(String authorizedCode) {
    this.authorizedCode = authorizedCode;
  }

  public SolvencyDistributor estimatedDate(OffsetDateTime estimatedDate) {
    this.estimatedDate = estimatedDate;
    return this;
  }

  /**
   * Estimated Date
   * @return estimatedDate
  **/
  @ApiModelProperty(value = "Estimated Date")

  @Valid

  public OffsetDateTime getEstimatedDate() {
    return estimatedDate;
  }

  public void setEstimatedDate(OffsetDateTime estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  public SolvencyDistributor fundHouseGroupName(String fundHouseGroupName) {
    this.fundHouseGroupName = fundHouseGroupName;
    return this;
  }

  /**
   * The periodicity of the {String}
   * @return fundHouseGroupName
  **/
  @ApiModelProperty(value = "The periodicity of the {String}")


  public String getFundHouseGroupName() {
    return fundHouseGroupName;
  }

  public void setFundHouseGroupName(String fundHouseGroupName) {
    this.fundHouseGroupName = fundHouseGroupName;
  }

  public SolvencyDistributor intermediaryName(String intermediaryName) {
    this.intermediaryName = intermediaryName;
    return this;
  }

  /**
   * The periodicity of the {String}
   * @return intermediaryName
  **/
  @ApiModelProperty(value = "The periodicity of the {String}")


  public String getIntermediaryName() {
    return intermediaryName;
  }

  public void setIntermediaryName(String intermediaryName) {
    this.intermediaryName = intermediaryName;
  }

  public SolvencyDistributor solvencyFund(SolvencyFund solvencyFund) {
    this.solvencyFund = solvencyFund;
    return this;
  }

  /**
   * Get solvencyFund
   * @return solvencyFund
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SolvencyFund getSolvencyFund() {
    return solvencyFund;
  }

  public void setSolvencyFund(SolvencyFund solvencyFund) {
    this.solvencyFund = solvencyFund;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyDistributor solvencyDistributor = (SolvencyDistributor) o;
    return Objects.equals(this.authorizedCode, solvencyDistributor.authorizedCode) &&
        Objects.equals(this.estimatedDate, solvencyDistributor.estimatedDate) &&
        Objects.equals(this.fundHouseGroupName, solvencyDistributor.fundHouseGroupName) &&
        Objects.equals(this.intermediaryName, solvencyDistributor.intermediaryName) &&
        Objects.equals(this.solvencyFund, solvencyDistributor.solvencyFund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedCode, estimatedDate, fundHouseGroupName, intermediaryName, solvencyFund);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyDistributor {\n");
    
    sb.append("    authorizedCode: ").append(toIndentedString(authorizedCode)).append("\n");
    sb.append("    estimatedDate: ").append(toIndentedString(estimatedDate)).append("\n");
    sb.append("    fundHouseGroupName: ").append(toIndentedString(fundHouseGroupName)).append("\n");
    sb.append("    intermediaryName: ").append(toIndentedString(intermediaryName)).append("\n");
    sb.append("    solvencyFund: ").append(toIndentedString(solvencyFund)).append("\n");
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

