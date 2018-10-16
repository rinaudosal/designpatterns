package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DateComparisonFilter;
import org.openapitools.model.GenericBreakdownFilter;
import org.openapitools.model.HoldingBreakdownFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BreakdownSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BreakdownSearchFilter   {
  @JsonProperty("assetAllocation")
  private GenericBreakdownFilter assetAllocation = null;

  @JsonProperty("breakdownDate")
  private DateComparisonFilter breakdownDate = null;

  @JsonProperty("creditQuality")
  private GenericBreakdownFilter creditQuality = null;

  @JsonProperty("currency")
  private GenericBreakdownFilter currency = null;

  @JsonProperty("geographicArea")
  private GenericBreakdownFilter geographicArea = null;

  @JsonProperty("holdings")
  private HoldingBreakdownFilter holdings = null;

  @JsonProperty("sector")
  private GenericBreakdownFilter sector = null;

  public BreakdownSearchFilter assetAllocation(GenericBreakdownFilter assetAllocation) {
    this.assetAllocation = assetAllocation;
    return this;
  }

  /**
   * Get assetAllocation
   * @return assetAllocation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericBreakdownFilter getAssetAllocation() {
    return assetAllocation;
  }

  public void setAssetAllocation(GenericBreakdownFilter assetAllocation) {
    this.assetAllocation = assetAllocation;
  }

  public BreakdownSearchFilter breakdownDate(DateComparisonFilter breakdownDate) {
    this.breakdownDate = breakdownDate;
    return this;
  }

  /**
   * Get breakdownDate
   * @return breakdownDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateComparisonFilter getBreakdownDate() {
    return breakdownDate;
  }

  public void setBreakdownDate(DateComparisonFilter breakdownDate) {
    this.breakdownDate = breakdownDate;
  }

  public BreakdownSearchFilter creditQuality(GenericBreakdownFilter creditQuality) {
    this.creditQuality = creditQuality;
    return this;
  }

  /**
   * Get creditQuality
   * @return creditQuality
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericBreakdownFilter getCreditQuality() {
    return creditQuality;
  }

  public void setCreditQuality(GenericBreakdownFilter creditQuality) {
    this.creditQuality = creditQuality;
  }

  public BreakdownSearchFilter currency(GenericBreakdownFilter currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericBreakdownFilter getCurrency() {
    return currency;
  }

  public void setCurrency(GenericBreakdownFilter currency) {
    this.currency = currency;
  }

  public BreakdownSearchFilter geographicArea(GenericBreakdownFilter geographicArea) {
    this.geographicArea = geographicArea;
    return this;
  }

  /**
   * Get geographicArea
   * @return geographicArea
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericBreakdownFilter getGeographicArea() {
    return geographicArea;
  }

  public void setGeographicArea(GenericBreakdownFilter geographicArea) {
    this.geographicArea = geographicArea;
  }

  public BreakdownSearchFilter holdings(HoldingBreakdownFilter holdings) {
    this.holdings = holdings;
    return this;
  }

  /**
   * Get holdings
   * @return holdings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HoldingBreakdownFilter getHoldings() {
    return holdings;
  }

  public void setHoldings(HoldingBreakdownFilter holdings) {
    this.holdings = holdings;
  }

  public BreakdownSearchFilter sector(GenericBreakdownFilter sector) {
    this.sector = sector;
    return this;
  }

  /**
   * Get sector
   * @return sector
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericBreakdownFilter getSector() {
    return sector;
  }

  public void setSector(GenericBreakdownFilter sector) {
    this.sector = sector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreakdownSearchFilter breakdownSearchFilter = (BreakdownSearchFilter) o;
    return Objects.equals(this.assetAllocation, breakdownSearchFilter.assetAllocation) &&
        Objects.equals(this.breakdownDate, breakdownSearchFilter.breakdownDate) &&
        Objects.equals(this.creditQuality, breakdownSearchFilter.creditQuality) &&
        Objects.equals(this.currency, breakdownSearchFilter.currency) &&
        Objects.equals(this.geographicArea, breakdownSearchFilter.geographicArea) &&
        Objects.equals(this.holdings, breakdownSearchFilter.holdings) &&
        Objects.equals(this.sector, breakdownSearchFilter.sector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetAllocation, breakdownDate, creditQuality, currency, geographicArea, holdings, sector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreakdownSearchFilter {\n");
    
    sb.append("    assetAllocation: ").append(toIndentedString(assetAllocation)).append("\n");
    sb.append("    breakdownDate: ").append(toIndentedString(breakdownDate)).append("\n");
    sb.append("    creditQuality: ").append(toIndentedString(creditQuality)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    geographicArea: ").append(toIndentedString(geographicArea)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
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

