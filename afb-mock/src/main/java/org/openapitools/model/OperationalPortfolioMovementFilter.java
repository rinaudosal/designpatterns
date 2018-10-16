package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object is a filter used for retrieve a transction authorization list filtered by some criteria
 */
@ApiModel(description = "This object is a filter used for retrieve a transction authorization list filtered by some criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioMovementFilter   {
  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public OperationalPortfolioMovementFilter contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * Contract External Reference
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "Contract External Reference")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public OperationalPortfolioMovementFilter productId(Long productId) {
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

  public OperationalPortfolioMovementFilter subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Subdistributor}")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioMovementFilter operationalPortfolioMovementFilter = (OperationalPortfolioMovementFilter) o;
    return Objects.equals(this.contractExternalReference, operationalPortfolioMovementFilter.contractExternalReference) &&
        Objects.equals(this.productId, operationalPortfolioMovementFilter.productId) &&
        Objects.equals(this.subdistributorId, operationalPortfolioMovementFilter.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractExternalReference, productId, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioMovementFilter {\n");
    
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
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

