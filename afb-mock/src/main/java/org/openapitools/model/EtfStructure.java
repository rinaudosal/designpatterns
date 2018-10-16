package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EtfStructure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EtfStructure   {
  @JsonProperty("collectiveInvestmentSchemeId")
  private Long collectiveInvestmentSchemeId = null;

  @JsonProperty("custodian")
  private String custodian = null;

  @JsonProperty("etfAdministrator")
  private String etfAdministrator = null;

  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("fundHouseId")
  private Long fundHouseId = null;

  @JsonProperty("legalStructureCode")
  private String legalStructureCode = null;

  @JsonProperty("product")
  private String product = null;

  @JsonProperty("replicationMethod")
  private String replicationMethod = null;

  public EtfStructure collectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
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

  public EtfStructure custodian(String custodian) {
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

  public EtfStructure etfAdministrator(String etfAdministrator) {
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

  public EtfStructure fundHouseGroupId(Long fundHouseGroupId) {
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

  public EtfStructure fundHouseId(Long fundHouseId) {
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

  public EtfStructure legalStructureCode(String legalStructureCode) {
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

  public EtfStructure product(String product) {
    this.product = product;
    return this;
  }

  /**
   * product estructure of Etf
   * @return product
  **/
  @ApiModelProperty(value = "product estructure of Etf")


  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public EtfStructure replicationMethod(String replicationMethod) {
    this.replicationMethod = replicationMethod;
    return this;
  }

  /**
   * replication method of Etf
   * @return replicationMethod
  **/
  @ApiModelProperty(value = "replication method of Etf")


  public String getReplicationMethod() {
    return replicationMethod;
  }

  public void setReplicationMethod(String replicationMethod) {
    this.replicationMethod = replicationMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtfStructure etfStructure = (EtfStructure) o;
    return Objects.equals(this.collectiveInvestmentSchemeId, etfStructure.collectiveInvestmentSchemeId) &&
        Objects.equals(this.custodian, etfStructure.custodian) &&
        Objects.equals(this.etfAdministrator, etfStructure.etfAdministrator) &&
        Objects.equals(this.fundHouseGroupId, etfStructure.fundHouseGroupId) &&
        Objects.equals(this.fundHouseId, etfStructure.fundHouseId) &&
        Objects.equals(this.legalStructureCode, etfStructure.legalStructureCode) &&
        Objects.equals(this.product, etfStructure.product) &&
        Objects.equals(this.replicationMethod, etfStructure.replicationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemeId, custodian, etfAdministrator, fundHouseGroupId, fundHouseId, legalStructureCode, product, replicationMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtfStructure {\n");
    
    sb.append("    collectiveInvestmentSchemeId: ").append(toIndentedString(collectiveInvestmentSchemeId)).append("\n");
    sb.append("    custodian: ").append(toIndentedString(custodian)).append("\n");
    sb.append("    etfAdministrator: ").append(toIndentedString(etfAdministrator)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    legalStructureCode: ").append(toIndentedString(legalStructureCode)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    replicationMethod: ").append(toIndentedString(replicationMethod)).append("\n");
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

