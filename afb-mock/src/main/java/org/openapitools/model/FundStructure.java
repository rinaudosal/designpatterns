package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundStructure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundStructure   {
  @JsonProperty("collectiveInvestmentSchemeId")
  private Long collectiveInvestmentSchemeId = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("fundHouseId")
  private Long fundHouseId = null;

  @JsonProperty("legalStructureCode")
  private String legalStructureCode = null;

  public FundStructure collectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
    return this;
  }

  /**
   * The Id of the {CollectiveInvestmentScheme}
   * @return collectiveInvestmentSchemeId
  **/
  @ApiModelProperty(value = "The Id of the {CollectiveInvestmentScheme}")


  public Long getCollectiveInvestmentSchemeId() {
    return collectiveInvestmentSchemeId;
  }

  public void setCollectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
  }

  public FundStructure dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public FundStructure fundHouseGroupId(Long fundHouseGroupId) {
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

  public FundStructure fundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
    return this;
  }

  /**
   * The Id of the {FundHouse}
   * @return fundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {FundHouse}")


  public Long getFundHouseId() {
    return fundHouseId;
  }

  public void setFundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
  }

  public FundStructure legalStructureCode(String legalStructureCode) {
    this.legalStructureCode = legalStructureCode;
    return this;
  }

  /**
   * Codes for the different types of legal structures of funds. Refers to {listCollectiveInvestmentSchemeExternalCodes}
   * @return legalStructureCode
  **/
  @ApiModelProperty(value = "Codes for the different types of legal structures of funds. Refers to {listCollectiveInvestmentSchemeExternalCodes}")


  public String getLegalStructureCode() {
    return legalStructureCode;
  }

  public void setLegalStructureCode(String legalStructureCode) {
    this.legalStructureCode = legalStructureCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundStructure fundStructure = (FundStructure) o;
    return Objects.equals(this.collectiveInvestmentSchemeId, fundStructure.collectiveInvestmentSchemeId) &&
        Objects.equals(this.dealingFundHouseId, fundStructure.dealingFundHouseId) &&
        Objects.equals(this.fundHouseGroupId, fundStructure.fundHouseGroupId) &&
        Objects.equals(this.fundHouseId, fundStructure.fundHouseId) &&
        Objects.equals(this.legalStructureCode, fundStructure.legalStructureCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemeId, dealingFundHouseId, fundHouseGroupId, fundHouseId, legalStructureCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundStructure {\n");
    
    sb.append("    collectiveInvestmentSchemeId: ").append(toIndentedString(collectiveInvestmentSchemeId)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    legalStructureCode: ").append(toIndentedString(legalStructureCode)).append("\n");
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

