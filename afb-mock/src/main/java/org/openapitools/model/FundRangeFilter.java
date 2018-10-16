package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundRangeFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundRangeFilter   {
  @JsonProperty("collectiveInvestmentSchemeId")
  private Long collectiveInvestmentSchemeId = null;

  @JsonProperty("custodian")
  private String custodian = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("etfAdministrator")
  private String etfAdministrator = null;

  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("fundHouseId")
  private Long fundHouseId = null;

  @JsonProperty("marketIdentifierCode")
  private String marketIdentifierCode = null;

  @JsonProperty("universeCode")
  private String universeCode = null;

  public FundRangeFilter collectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
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

  public FundRangeFilter custodian(String custodian) {
    this.custodian = custodian;
    return this;
  }

  /**
   * custodian of Etf
   * @return custodian
  **/
  @ApiModelProperty(value = "custodian of Etf")


  public String getCustodian() {
    return custodian;
  }

  public void setCustodian(String custodian) {
    this.custodian = custodian;
  }

  public FundRangeFilter dealingFundHouseId(Long dealingFundHouseId) {
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

  public FundRangeFilter etfAdministrator(String etfAdministrator) {
    this.etfAdministrator = etfAdministrator;
    return this;
  }

  /**
   * administrator of Etf
   * @return etfAdministrator
  **/
  @ApiModelProperty(value = "administrator of Etf")


  public String getEtfAdministrator() {
    return etfAdministrator;
  }

  public void setEtfAdministrator(String etfAdministrator) {
    this.etfAdministrator = etfAdministrator;
  }

  public FundRangeFilter fundHouseGroupId(Long fundHouseGroupId) {
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

  public FundRangeFilter fundHouseId(Long fundHouseId) {
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

  public FundRangeFilter marketIdentifierCode(String marketIdentifierCode) {
    this.marketIdentifierCode = marketIdentifierCode;
    return this;
  }

  /**
   * market identifier code of Etf MIC
   * @return marketIdentifierCode
  **/
  @ApiModelProperty(value = "market identifier code of Etf MIC")


  public String getMarketIdentifierCode() {
    return marketIdentifierCode;
  }

  public void setMarketIdentifierCode(String marketIdentifierCode) {
    this.marketIdentifierCode = marketIdentifierCode;
  }

  public FundRangeFilter universeCode(String universeCode) {
    this.universeCode = universeCode;
    return this;
  }

  /**
   * Refers to {listUniverses}
   * @return universeCode
  **/
  @ApiModelProperty(value = "Refers to {listUniverses}")


  public String getUniverseCode() {
    return universeCode;
  }

  public void setUniverseCode(String universeCode) {
    this.universeCode = universeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundRangeFilter fundRangeFilter = (FundRangeFilter) o;
    return Objects.equals(this.collectiveInvestmentSchemeId, fundRangeFilter.collectiveInvestmentSchemeId) &&
        Objects.equals(this.custodian, fundRangeFilter.custodian) &&
        Objects.equals(this.dealingFundHouseId, fundRangeFilter.dealingFundHouseId) &&
        Objects.equals(this.etfAdministrator, fundRangeFilter.etfAdministrator) &&
        Objects.equals(this.fundHouseGroupId, fundRangeFilter.fundHouseGroupId) &&
        Objects.equals(this.fundHouseId, fundRangeFilter.fundHouseId) &&
        Objects.equals(this.marketIdentifierCode, fundRangeFilter.marketIdentifierCode) &&
        Objects.equals(this.universeCode, fundRangeFilter.universeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemeId, custodian, dealingFundHouseId, etfAdministrator, fundHouseGroupId, fundHouseId, marketIdentifierCode, universeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundRangeFilter {\n");
    
    sb.append("    collectiveInvestmentSchemeId: ").append(toIndentedString(collectiveInvestmentSchemeId)).append("\n");
    sb.append("    custodian: ").append(toIndentedString(custodian)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    etfAdministrator: ").append(toIndentedString(etfAdministrator)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    marketIdentifierCode: ").append(toIndentedString(marketIdentifierCode)).append("\n");
    sb.append("    universeCode: ").append(toIndentedString(universeCode)).append("\n");
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

