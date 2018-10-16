package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FundAccount;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DestinationIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DestinationIdentification   {
  @JsonProperty("accountCode")
  private String accountCode = null;

  @JsonProperty("cnmvEntity")
  private Long cnmvEntity = null;

  @JsonProperty("cnmvFund")
  private Long cnmvFund = null;

  @JsonProperty("destinationFund")
  private String destinationFund = null;

  @JsonProperty("entityNIF")
  private Long entityNIF = null;

  @JsonProperty("entityName")
  private String entityName = null;

  @JsonProperty("fundAccount")
  private FundAccount fundAccount = null;

  @JsonProperty("fundNIF")
  private Long fundNIF = null;

  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("omnibusMode")
  private String omnibusMode = null;

  public DestinationIdentification accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * Account code
   * @return accountCode
  **/
  @ApiModelProperty(value = "Account code")


  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public DestinationIdentification cnmvEntity(Long cnmvEntity) {
    this.cnmvEntity = cnmvEntity;
    return this;
  }

  /**
   * Number Registers CNMV Entity
   * @return cnmvEntity
  **/
  @ApiModelProperty(value = "Number Registers CNMV Entity")


  public Long getCnmvEntity() {
    return cnmvEntity;
  }

  public void setCnmvEntity(Long cnmvEntity) {
    this.cnmvEntity = cnmvEntity;
  }

  public DestinationIdentification cnmvFund(Long cnmvFund) {
    this.cnmvFund = cnmvFund;
    return this;
  }

  /**
   * Number Registers CNMV Fund
   * @return cnmvFund
  **/
  @ApiModelProperty(value = "Number Registers CNMV Fund")


  public Long getCnmvFund() {
    return cnmvFund;
  }

  public void setCnmvFund(Long cnmvFund) {
    this.cnmvFund = cnmvFund;
  }

  public DestinationIdentification destinationFund(String destinationFund) {
    this.destinationFund = destinationFund;
    return this;
  }

  /**
   * Destination fund
   * @return destinationFund
  **/
  @ApiModelProperty(value = "Destination fund")


  public String getDestinationFund() {
    return destinationFund;
  }

  public void setDestinationFund(String destinationFund) {
    this.destinationFund = destinationFund;
  }

  public DestinationIdentification entityNIF(Long entityNIF) {
    this.entityNIF = entityNIF;
    return this;
  }

  /**
   * Entity NIF
   * @return entityNIF
  **/
  @ApiModelProperty(value = "Entity NIF")


  public Long getEntityNIF() {
    return entityNIF;
  }

  public void setEntityNIF(Long entityNIF) {
    this.entityNIF = entityNIF;
  }

  public DestinationIdentification entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Entity name
   * @return entityName
  **/
  @ApiModelProperty(value = "Entity name")


  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public DestinationIdentification fundAccount(FundAccount fundAccount) {
    this.fundAccount = fundAccount;
    return this;
  }

  /**
   * Get fundAccount
   * @return fundAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundAccount getFundAccount() {
    return fundAccount;
  }

  public void setFundAccount(FundAccount fundAccount) {
    this.fundAccount = fundAccount;
  }

  public DestinationIdentification fundNIF(Long fundNIF) {
    this.fundNIF = fundNIF;
    return this;
  }

  /**
   * Fund NIF
   * @return fundNIF
  **/
  @ApiModelProperty(value = "Fund NIF")


  public Long getFundNIF() {
    return fundNIF;
  }

  public void setFundNIF(Long fundNIF) {
    this.fundNIF = fundNIF;
  }

  public DestinationIdentification fundName(String fundName) {
    this.fundName = fundName;
    return this;
  }

  /**
   * Fund name
   * @return fundName
  **/
  @ApiModelProperty(value = "Fund name")


  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public DestinationIdentification omnibusMode(String omnibusMode) {
    this.omnibusMode = omnibusMode;
    return this;
  }

  /**
   * Omnibus mode
   * @return omnibusMode
  **/
  @ApiModelProperty(value = "Omnibus mode")


  public String getOmnibusMode() {
    return omnibusMode;
  }

  public void setOmnibusMode(String omnibusMode) {
    this.omnibusMode = omnibusMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationIdentification destinationIdentification = (DestinationIdentification) o;
    return Objects.equals(this.accountCode, destinationIdentification.accountCode) &&
        Objects.equals(this.cnmvEntity, destinationIdentification.cnmvEntity) &&
        Objects.equals(this.cnmvFund, destinationIdentification.cnmvFund) &&
        Objects.equals(this.destinationFund, destinationIdentification.destinationFund) &&
        Objects.equals(this.entityNIF, destinationIdentification.entityNIF) &&
        Objects.equals(this.entityName, destinationIdentification.entityName) &&
        Objects.equals(this.fundAccount, destinationIdentification.fundAccount) &&
        Objects.equals(this.fundNIF, destinationIdentification.fundNIF) &&
        Objects.equals(this.fundName, destinationIdentification.fundName) &&
        Objects.equals(this.omnibusMode, destinationIdentification.omnibusMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, cnmvEntity, cnmvFund, destinationFund, entityNIF, entityName, fundAccount, fundNIF, fundName, omnibusMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationIdentification {\n");
    
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    cnmvEntity: ").append(toIndentedString(cnmvEntity)).append("\n");
    sb.append("    cnmvFund: ").append(toIndentedString(cnmvFund)).append("\n");
    sb.append("    destinationFund: ").append(toIndentedString(destinationFund)).append("\n");
    sb.append("    entityNIF: ").append(toIndentedString(entityNIF)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    fundAccount: ").append(toIndentedString(fundAccount)).append("\n");
    sb.append("    fundNIF: ").append(toIndentedString(fundNIF)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    omnibusMode: ").append(toIndentedString(omnibusMode)).append("\n");
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

