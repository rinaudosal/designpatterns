package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransferFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransferFilter   {
  @JsonProperty("direction")
  private String direction = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("transferDate")
  private OffsetDateTime transferDate = null;

  public TransferFilter direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Transfer class: ([Entry][Exit][Internal])
   * @return direction
  **/
  @ApiModelProperty(value = "Transfer class: ([Entry][Exit][Internal])")


  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public TransferFilter distributorId(Long distributorId) {
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

  public TransferFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External Reference
   * @return externalReference
  **/
  @ApiModelProperty(value = "External Reference")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public TransferFilter subdistributorId(Long subdistributorId) {
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

  public TransferFilter transferDate(OffsetDateTime transferDate) {
    this.transferDate = transferDate;
    return this;
  }

  /**
   * Transfer date
   * @return transferDate
  **/
  @ApiModelProperty(value = "Transfer date")

  @Valid

  public OffsetDateTime getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(OffsetDateTime transferDate) {
    this.transferDate = transferDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferFilter transferFilter = (TransferFilter) o;
    return Objects.equals(this.direction, transferFilter.direction) &&
        Objects.equals(this.distributorId, transferFilter.distributorId) &&
        Objects.equals(this.externalReference, transferFilter.externalReference) &&
        Objects.equals(this.subdistributorId, transferFilter.subdistributorId) &&
        Objects.equals(this.transferDate, transferFilter.transferDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, distributorId, externalReference, subdistributorId, transferDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferFilter {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
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

