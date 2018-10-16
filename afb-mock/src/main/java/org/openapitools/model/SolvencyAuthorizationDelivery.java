package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.KeyValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyAuthorizationDelivery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationDelivery   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("documentUrl")
  private String documentUrl = null;

  @JsonProperty("estimatedDate")
  private OffsetDateTime estimatedDate = null;

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

  @JsonProperty("receptionDate")
  private OffsetDateTime receptionDate = null;

  @JsonProperty("status")
  private KeyValue status = null;

  public SolvencyAuthorizationDelivery description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description
   * @return description
  **/
  @ApiModelProperty(value = "The description")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SolvencyAuthorizationDelivery distributorId(Long distributorId) {
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

  public SolvencyAuthorizationDelivery documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * The document name
   * @return documentName
  **/
  @ApiModelProperty(value = "The document name")


  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public SolvencyAuthorizationDelivery documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

  /**
   * The document url
   * @return documentUrl
  **/
  @ApiModelProperty(value = "The document url")


  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public SolvencyAuthorizationDelivery estimatedDate(OffsetDateTime estimatedDate) {
    this.estimatedDate = estimatedDate;
    return this;
  }

  /**
   * The estimated date
   * @return estimatedDate
  **/
  @ApiModelProperty(value = "The estimated date")

  @Valid

  public OffsetDateTime getEstimatedDate() {
    return estimatedDate;
  }

  public void setEstimatedDate(OffsetDateTime estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  public SolvencyAuthorizationDelivery fundId(Long fundId) {
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

  public SolvencyAuthorizationDelivery fundName(String fundName) {
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

  public SolvencyAuthorizationDelivery intermediateId(Long intermediateId) {
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

  public SolvencyAuthorizationDelivery isin(String isin) {
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

  public SolvencyAuthorizationDelivery name(String name) {
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

  public SolvencyAuthorizationDelivery receptionDate(OffsetDateTime receptionDate) {
    this.receptionDate = receptionDate;
    return this;
  }

  /**
   * The reception date
   * @return receptionDate
  **/
  @ApiModelProperty(value = "The reception date")

  @Valid

  public OffsetDateTime getReceptionDate() {
    return receptionDate;
  }

  public void setReceptionDate(OffsetDateTime receptionDate) {
    this.receptionDate = receptionDate;
  }

  public SolvencyAuthorizationDelivery status(KeyValue status) {
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
    SolvencyAuthorizationDelivery solvencyAuthorizationDelivery = (SolvencyAuthorizationDelivery) o;
    return Objects.equals(this.description, solvencyAuthorizationDelivery.description) &&
        Objects.equals(this.distributorId, solvencyAuthorizationDelivery.distributorId) &&
        Objects.equals(this.documentName, solvencyAuthorizationDelivery.documentName) &&
        Objects.equals(this.documentUrl, solvencyAuthorizationDelivery.documentUrl) &&
        Objects.equals(this.estimatedDate, solvencyAuthorizationDelivery.estimatedDate) &&
        Objects.equals(this.fundId, solvencyAuthorizationDelivery.fundId) &&
        Objects.equals(this.fundName, solvencyAuthorizationDelivery.fundName) &&
        Objects.equals(this.intermediateId, solvencyAuthorizationDelivery.intermediateId) &&
        Objects.equals(this.isin, solvencyAuthorizationDelivery.isin) &&
        Objects.equals(this.name, solvencyAuthorizationDelivery.name) &&
        Objects.equals(this.receptionDate, solvencyAuthorizationDelivery.receptionDate) &&
        Objects.equals(this.status, solvencyAuthorizationDelivery.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, distributorId, documentName, documentUrl, estimatedDate, fundId, fundName, intermediateId, isin, name, receptionDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationDelivery {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    estimatedDate: ").append(toIndentedString(estimatedDate)).append("\n");
    sb.append("    fundId: ").append(toIndentedString(fundId)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    intermediateId: ").append(toIndentedString(intermediateId)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    receptionDate: ").append(toIndentedString(receptionDate)).append("\n");
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

