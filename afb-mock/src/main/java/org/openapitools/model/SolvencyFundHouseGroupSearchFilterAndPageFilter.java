package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InstrumentSearchByCodeFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyFundHouseGroupSearchFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyFundHouseGroupSearchFilterAndPageFilter   {
  @JsonProperty("authorizedCode")
  private String authorizedCode = null;

  @JsonProperty("breakdownDate")
  private OffsetDateTime breakdownDate = null;

  @JsonProperty("distributorName")
  @Valid
  private List<String> distributorName = null;

  @JsonProperty("fundName")
  @Valid
  private List<String> fundName = null;

  @JsonProperty("instrumentSearchByCode")
  private InstrumentSearchByCodeFilter instrumentSearchByCode = null;

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("periodicity")
  private String periodicity = null;

  public SolvencyFundHouseGroupSearchFilterAndPageFilter authorizedCode(String authorizedCode) {
    this.authorizedCode = authorizedCode;
    return this;
  }

  /**
   * The code of the {listAuthorized}
   * @return authorizedCode
  **/
  @ApiModelProperty(value = "The code of the {listAuthorized}")


  public String getAuthorizedCode() {
    return authorizedCode;
  }

  public void setAuthorizedCode(String authorizedCode) {
    this.authorizedCode = authorizedCode;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter breakdownDate(OffsetDateTime breakdownDate) {
    this.breakdownDate = breakdownDate;
    return this;
  }

  /**
   * Breakdown Date
   * @return breakdownDate
  **/
  @ApiModelProperty(value = "Breakdown Date")

  @Valid

  public OffsetDateTime getBreakdownDate() {
    return breakdownDate;
  }

  public void setBreakdownDate(OffsetDateTime breakdownDate) {
    this.breakdownDate = breakdownDate;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter distributorName(List<String> distributorName) {
    this.distributorName = distributorName;
    return this;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter addDistributorNameItem(String distributorNameItem) {
    if (this.distributorName == null) {
      this.distributorName = new ArrayList<>();
    }
    this.distributorName.add(distributorNameItem);
    return this;
  }

  /**
   * Get distributorName
   * @return distributorName
  **/
  @ApiModelProperty(value = "")


  public List<String> getDistributorName() {
    return distributorName;
  }

  public void setDistributorName(List<String> distributorName) {
    this.distributorName = distributorName;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter fundName(List<String> fundName) {
    this.fundName = fundName;
    return this;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter addFundNameItem(String fundNameItem) {
    if (this.fundName == null) {
      this.fundName = new ArrayList<>();
    }
    this.fundName.add(fundNameItem);
    return this;
  }

  /**
   * Get fundName
   * @return fundName
  **/
  @ApiModelProperty(value = "")


  public List<String> getFundName() {
    return fundName;
  }

  public void setFundName(List<String> fundName) {
    this.fundName = fundName;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter instrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
    this.instrumentSearchByCode = instrumentSearchByCode;
    return this;
  }

  /**
   * Get instrumentSearchByCode
   * @return instrumentSearchByCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchByCodeFilter getInstrumentSearchByCode() {
    return instrumentSearchByCode;
  }

  public void setInstrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
    this.instrumentSearchByCode = instrumentSearchByCode;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter page(PageFilter page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPage() {
    return page;
  }

  public void setPage(PageFilter page) {
    this.page = page;
  }

  public SolvencyFundHouseGroupSearchFilterAndPageFilter periodicity(String periodicity) {
    this.periodicity = periodicity;
    return this;
  }

  /**
   * The periodicity of the {String}
   * @return periodicity
  **/
  @ApiModelProperty(value = "The periodicity of the {String}")


  public String getPeriodicity() {
    return periodicity;
  }

  public void setPeriodicity(String periodicity) {
    this.periodicity = periodicity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyFundHouseGroupSearchFilterAndPageFilter solvencyFundHouseGroupSearchFilterAndPageFilter = (SolvencyFundHouseGroupSearchFilterAndPageFilter) o;
    return Objects.equals(this.authorizedCode, solvencyFundHouseGroupSearchFilterAndPageFilter.authorizedCode) &&
        Objects.equals(this.breakdownDate, solvencyFundHouseGroupSearchFilterAndPageFilter.breakdownDate) &&
        Objects.equals(this.distributorName, solvencyFundHouseGroupSearchFilterAndPageFilter.distributorName) &&
        Objects.equals(this.fundName, solvencyFundHouseGroupSearchFilterAndPageFilter.fundName) &&
        Objects.equals(this.instrumentSearchByCode, solvencyFundHouseGroupSearchFilterAndPageFilter.instrumentSearchByCode) &&
        Objects.equals(this.page, solvencyFundHouseGroupSearchFilterAndPageFilter.page) &&
        Objects.equals(this.periodicity, solvencyFundHouseGroupSearchFilterAndPageFilter.periodicity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedCode, breakdownDate, distributorName, fundName, instrumentSearchByCode, page, periodicity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyFundHouseGroupSearchFilterAndPageFilter {\n");
    
    sb.append("    authorizedCode: ").append(toIndentedString(authorizedCode)).append("\n");
    sb.append("    breakdownDate: ").append(toIndentedString(breakdownDate)).append("\n");
    sb.append("    distributorName: ").append(toIndentedString(distributorName)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    instrumentSearchByCode: ").append(toIndentedString(instrumentSearchByCode)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
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

