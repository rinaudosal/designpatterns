package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FactaClient;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Keeps FATCA controlling information around a client.
 */
@ApiModel(description = "Keeps FATCA controlling information around a client.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FatcaControlling   {
  @JsonProperty("clientDocument")
  private String clientDocument = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientsBreakdown")
  @Valid
  private List<FactaClient> clientsBreakdown = null;

  @JsonProperty("distributorId")
  private String distributorId = null;

  @JsonProperty("subdistributorId")
  private String subdistributorId = null;

  public FatcaControlling clientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
    return this;
  }

  /**
   * The document code of the {Client}
   * @return clientDocument
  **/
  @ApiModelProperty(value = "The document code of the {Client}")


  public String getClientDocument() {
    return clientDocument;
  }

  public void setClientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
  }

  public FatcaControlling clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The Id of the {Client}
   * @return clientId
  **/
  @ApiModelProperty(value = "The Id of the {Client}")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public FatcaControlling clientsBreakdown(List<FactaClient> clientsBreakdown) {
    this.clientsBreakdown = clientsBreakdown;
    return this;
  }

  public FatcaControlling addClientsBreakdownItem(FactaClient clientsBreakdownItem) {
    if (this.clientsBreakdown == null) {
      this.clientsBreakdown = new ArrayList<>();
    }
    this.clientsBreakdown.add(clientsBreakdownItem);
    return this;
  }

  /**
   * Get clientsBreakdown
   * @return clientsBreakdown
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FactaClient> getClientsBreakdown() {
    return clientsBreakdown;
  }

  public void setClientsBreakdown(List<FactaClient> clientsBreakdown) {
    this.clientsBreakdown = clientsBreakdown;
  }

  public FatcaControlling distributorId(String distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Client}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Client}")


  public String getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(String distributorId) {
    this.distributorId = distributorId;
  }

  public FatcaControlling subdistributorId(String subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Client}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Client}")


  public String getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(String subdistributorId) {
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
    FatcaControlling fatcaControlling = (FatcaControlling) o;
    return Objects.equals(this.clientDocument, fatcaControlling.clientDocument) &&
        Objects.equals(this.clientId, fatcaControlling.clientId) &&
        Objects.equals(this.clientsBreakdown, fatcaControlling.clientsBreakdown) &&
        Objects.equals(this.distributorId, fatcaControlling.distributorId) &&
        Objects.equals(this.subdistributorId, fatcaControlling.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDocument, clientId, clientsBreakdown, distributorId, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FatcaControlling {\n");
    
    sb.append("    clientDocument: ").append(toIndentedString(clientDocument)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientsBreakdown: ").append(toIndentedString(clientsBreakdown)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
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

