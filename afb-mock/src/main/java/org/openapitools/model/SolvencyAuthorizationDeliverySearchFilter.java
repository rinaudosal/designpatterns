package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DateOperatorComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyAuthorizationDeliverySearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationDeliverySearchFilter   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("estimatedDate")
  private DateOperatorComparisonFilter estimatedDate = null;

  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("isin")
  private String isin = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("period")
  private String period = null;

  @JsonProperty("receptionDate")
  private DateOperatorComparisonFilter receptionDate = null;

  @JsonProperty("status")
  private String status = null;

  public SolvencyAuthorizationDeliverySearchFilter description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description to filter
   * @return description
  **/
  @ApiModelProperty(value = "The description to filter")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SolvencyAuthorizationDeliverySearchFilter estimatedDate(DateOperatorComparisonFilter estimatedDate) {
    this.estimatedDate = estimatedDate;
    return this;
  }

  /**
   * Get estimatedDate
   * @return estimatedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateOperatorComparisonFilter getEstimatedDate() {
    return estimatedDate;
  }

  public void setEstimatedDate(DateOperatorComparisonFilter estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  public SolvencyAuthorizationDeliverySearchFilter fundName(String fundName) {
    this.fundName = fundName;
    return this;
  }

  /**
   * The fund name to filter
   * @return fundName
  **/
  @ApiModelProperty(value = "The fund name to filter")


  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public SolvencyAuthorizationDeliverySearchFilter isin(String isin) {
    this.isin = isin;
    return this;
  }

  /**
   * The isin to filter
   * @return isin
  **/
  @ApiModelProperty(value = "The isin to filter")


  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public SolvencyAuthorizationDeliverySearchFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name to filter (distributor or Fund Search Group)
   * @return name
  **/
  @ApiModelProperty(value = "The name to filter (distributor or Fund Search Group)")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SolvencyAuthorizationDeliverySearchFilter period(String period) {
    this.period = period;
    return this;
  }

  /**
   * The period code to filter
   * @return period
  **/
  @ApiModelProperty(value = "The period code to filter")


  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public SolvencyAuthorizationDeliverySearchFilter receptionDate(DateOperatorComparisonFilter receptionDate) {
    this.receptionDate = receptionDate;
    return this;
  }

  /**
   * Get receptionDate
   * @return receptionDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateOperatorComparisonFilter getReceptionDate() {
    return receptionDate;
  }

  public void setReceptionDate(DateOperatorComparisonFilter receptionDate) {
    this.receptionDate = receptionDate;
  }

  public SolvencyAuthorizationDeliverySearchFilter status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status code to filter
   * @return status
  **/
  @ApiModelProperty(value = "The status code to filter")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
    SolvencyAuthorizationDeliverySearchFilter solvencyAuthorizationDeliverySearchFilter = (SolvencyAuthorizationDeliverySearchFilter) o;
    return Objects.equals(this.description, solvencyAuthorizationDeliverySearchFilter.description) &&
        Objects.equals(this.estimatedDate, solvencyAuthorizationDeliverySearchFilter.estimatedDate) &&
        Objects.equals(this.fundName, solvencyAuthorizationDeliverySearchFilter.fundName) &&
        Objects.equals(this.isin, solvencyAuthorizationDeliverySearchFilter.isin) &&
        Objects.equals(this.name, solvencyAuthorizationDeliverySearchFilter.name) &&
        Objects.equals(this.period, solvencyAuthorizationDeliverySearchFilter.period) &&
        Objects.equals(this.receptionDate, solvencyAuthorizationDeliverySearchFilter.receptionDate) &&
        Objects.equals(this.status, solvencyAuthorizationDeliverySearchFilter.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, estimatedDate, fundName, isin, name, period, receptionDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationDeliverySearchFilter {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    estimatedDate: ").append(toIndentedString(estimatedDate)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

