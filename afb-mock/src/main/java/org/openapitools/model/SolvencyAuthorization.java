package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.KeyValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyAuthorization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorization   {
  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("fundId")
  private Long fundId = null;

  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("intermediateId")
  private Long intermediateId = null;

  @JsonProperty("isin")
  private String isin = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private KeyValue status = null;

  public SolvencyAuthorization distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The distributor identifier
   * @return distributorId
  **/
  @ApiModelProperty(value = "The distributor identifier")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public SolvencyAuthorization fundId(Long fundId) {
    this.fundId = fundId;
    return this;
  }

  /**
   * The fund identifier
   * @return fundId
  **/
  @ApiModelProperty(value = "The fund identifier")


  public Long getFundId() {
    return fundId;
  }

  public void setFundId(Long fundId) {
    this.fundId = fundId;
  }

  public SolvencyAuthorization fundName(String fundName) {
    this.fundName = fundName;
    return this;
  }

  /**
   * The fund name
   * @return fundName
  **/
  @ApiModelProperty(value = "The fund name")


  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public SolvencyAuthorization intermediateId(Long intermediateId) {
    this.intermediateId = intermediateId;
    return this;
  }

  /**
   * The distributor intermediate identifier
   * @return intermediateId
  **/
  @ApiModelProperty(value = "The distributor intermediate identifier")


  public Long getIntermediateId() {
    return intermediateId;
  }

  public void setIntermediateId(Long intermediateId) {
    this.intermediateId = intermediateId;
  }

  public SolvencyAuthorization isin(String isin) {
    this.isin = isin;
    return this;
  }

  /**
   * The fund isin
   * @return isin
  **/
  @ApiModelProperty(value = "The fund isin")


  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public SolvencyAuthorization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The fund house group name or distributor name
   * @return name
  **/
  @ApiModelProperty(value = "The fund house group name or distributor name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SolvencyAuthorization status(KeyValue status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public KeyValue getStatus() {
    return status;
  }

  public void setStatus(KeyValue status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyAuthorization solvencyAuthorization = (SolvencyAuthorization) o;
    return Objects.equals(this.distributorId, solvencyAuthorization.distributorId) &&
        Objects.equals(this.fundId, solvencyAuthorization.fundId) &&
        Objects.equals(this.fundName, solvencyAuthorization.fundName) &&
        Objects.equals(this.intermediateId, solvencyAuthorization.intermediateId) &&
        Objects.equals(this.isin, solvencyAuthorization.isin) &&
        Objects.equals(this.name, solvencyAuthorization.name) &&
        Objects.equals(this.status, solvencyAuthorization.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, fundId, fundName, intermediateId, isin, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorization {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    fundId: ").append(toIndentedString(fundId)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    intermediateId: ").append(toIndentedString(intermediateId)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

