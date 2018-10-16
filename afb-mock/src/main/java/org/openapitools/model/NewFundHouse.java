package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Its function is the administration and representation of Collective Investment Institutions. Its obligations include keeping the books for the fund, determining the value of units, issuing certificates for the unit holders in the fund, and selecting the securities which will comprise the fund (Fund Mgmt. Co.).
 */
@ApiModel(description = "Its function is the administration and representation of Collective Investment Institutions. Its obligations include keeping the books for the fund, determining the value of units, issuing certificates for the unit holders in the fund, and selecting the securities which will comprise the fund (Fund Mgmt. Co.).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class NewFundHouse   {
  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("fundsNumber")
  private Long fundsNumber = null;

  @JsonProperty("resources")
  private ResourceReference resources = null;

  public NewFundHouse fundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
    return this;
  }

  /**
   * The Id of the {FundHouseGroup}
   * @return fundHouseGroupId
  **/
  @ApiModelProperty(value = "The Id of the {FundHouseGroup}")


  public Long getFundHouseGroupId() {
    return fundHouseGroupId;
  }

  public void setFundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
  }

  public NewFundHouse fundsNumber(Long fundsNumber) {
    this.fundsNumber = fundsNumber;
    return this;
  }

  /**
   * Get fundsNumber
   * @return fundsNumber
  **/
  @ApiModelProperty(value = "")


  public Long getFundsNumber() {
    return fundsNumber;
  }

  public void setFundsNumber(Long fundsNumber) {
    this.fundsNumber = fundsNumber;
  }

  public NewFundHouse resources(ResourceReference resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getResources() {
    return resources;
  }

  public void setResources(ResourceReference resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewFundHouse newFundHouse = (NewFundHouse) o;
    return Objects.equals(this.fundHouseGroupId, newFundHouse.fundHouseGroupId) &&
        Objects.equals(this.fundsNumber, newFundHouse.fundsNumber) &&
        Objects.equals(this.resources, newFundHouse.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundHouseGroupId, fundsNumber, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewFundHouse {\n");
    
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundsNumber: ").append(toIndentedString(fundsNumber)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

