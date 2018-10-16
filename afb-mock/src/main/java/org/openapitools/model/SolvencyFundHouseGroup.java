package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SolvencyFund;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyFundHouseGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyFundHouseGroup   {
  @JsonProperty("authorizedCode")
  private String authorizedCode = null;

  @JsonProperty("distributorName")
  private String distributorName = null;

  @JsonProperty("solvencyFund")
  private SolvencyFund solvencyFund = null;

  public SolvencyFundHouseGroup authorizedCode(String authorizedCode) {
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

  public SolvencyFundHouseGroup distributorName(String distributorName) {
    this.distributorName = distributorName;
    return this;
  }

  /**
   * The periodicity of the {String}
   * @return distributorName
  **/
  @ApiModelProperty(value = "The periodicity of the {String}")


  public String getDistributorName() {
    return distributorName;
  }

  public void setDistributorName(String distributorName) {
    this.distributorName = distributorName;
  }

  public SolvencyFundHouseGroup solvencyFund(SolvencyFund solvencyFund) {
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
    SolvencyFundHouseGroup solvencyFundHouseGroup = (SolvencyFundHouseGroup) o;
    return Objects.equals(this.authorizedCode, solvencyFundHouseGroup.authorizedCode) &&
        Objects.equals(this.distributorName, solvencyFundHouseGroup.distributorName) &&
        Objects.equals(this.solvencyFund, solvencyFundHouseGroup.solvencyFund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedCode, distributorName, solvencyFund);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyFundHouseGroup {\n");
    
    sb.append("    authorizedCode: ").append(toIndentedString(authorizedCode)).append("\n");
    sb.append("    distributorName: ").append(toIndentedString(distributorName)).append("\n");
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

