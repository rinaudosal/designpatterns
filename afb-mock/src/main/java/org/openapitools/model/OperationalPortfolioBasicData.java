package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioBasicData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioBasicData   {
  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("numberContracts")
  private Long numberContracts = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  public OperationalPortfolioBasicData distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public OperationalPortfolioBasicData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the portfolio
   * @return name
  **/
  @ApiModelProperty(value = "The name of the portfolio")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OperationalPortfolioBasicData numberContracts(Long numberContracts) {
    this.numberContracts = numberContracts;
    return this;
  }

  /**
   * Number of contracts associated to {OperationalPorfolio}
   * @return numberContracts
  **/
  @ApiModelProperty(value = "Number of contracts associated to {OperationalPorfolio}")


  public Long getNumberContracts() {
    return numberContracts;
  }

  public void setNumberContracts(Long numberContracts) {
    this.numberContracts = numberContracts;
  }

  public OperationalPortfolioBasicData productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public OperationalPortfolioBasicData statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of portfolio. Refer to {listPortfolioStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of portfolio. Refer to {listPortfolioStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioBasicData operationalPortfolioBasicData = (OperationalPortfolioBasicData) o;
    return Objects.equals(this.distributorId, operationalPortfolioBasicData.distributorId) &&
        Objects.equals(this.name, operationalPortfolioBasicData.name) &&
        Objects.equals(this.numberContracts, operationalPortfolioBasicData.numberContracts) &&
        Objects.equals(this.productId, operationalPortfolioBasicData.productId) &&
        Objects.equals(this.statusCode, operationalPortfolioBasicData.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, name, numberContracts, productId, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioBasicData {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberContracts: ").append(toIndentedString(numberContracts)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

