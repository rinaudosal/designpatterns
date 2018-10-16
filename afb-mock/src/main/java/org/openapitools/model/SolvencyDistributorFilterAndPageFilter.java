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
 * SolvencyDistributorFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyDistributorFilterAndPageFilter   {
  @JsonProperty("authorizedCode")
  private String authorizedCode = null;

  @JsonProperty("breakdownDate")
  private OffsetDateTime breakdownDate = null;

  @JsonProperty("description")
  @Valid
  private List<String> description = null;

  @JsonProperty("estimatedDate")
  private OffsetDateTime estimatedDate = null;

  @JsonProperty("fundHouseGroupName")
  @Valid
  private List<String> fundHouseGroupName = null;

  @JsonProperty("fundName")
  @Valid
  private List<String> fundName = null;

  @JsonProperty("instrumentSearchByCode")
  private InstrumentSearchByCodeFilter instrumentSearchByCode = null;

  @JsonProperty("intermediaryId")
  private String intermediaryId = null;

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("periodicity")
  private String periodicity = null;

  public SolvencyDistributorFilterAndPageFilter authorizedCode(String authorizedCode) {
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

  public SolvencyDistributorFilterAndPageFilter breakdownDate(OffsetDateTime breakdownDate) {
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

  public SolvencyDistributorFilterAndPageFilter description(List<String> description) {
    this.description = description;
    return this;
  }

  public SolvencyDistributorFilterAndPageFilter addDescriptionItem(String descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<>();
    }
    this.description.add(descriptionItem);
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public List<String> getDescription() {
    return description;
  }

  public void setDescription(List<String> description) {
    this.description = description;
  }

  public SolvencyDistributorFilterAndPageFilter estimatedDate(OffsetDateTime estimatedDate) {
    this.estimatedDate = estimatedDate;
    return this;
  }

  /**
   * Estimated Date
   * @return estimatedDate
  **/
  @ApiModelProperty(value = "Estimated Date")

  @Valid

  public OffsetDateTime getEstimatedDate() {
    return estimatedDate;
  }

  public void setEstimatedDate(OffsetDateTime estimatedDate) {
    this.estimatedDate = estimatedDate;
  }

  public SolvencyDistributorFilterAndPageFilter fundHouseGroupName(List<String> fundHouseGroupName) {
    this.fundHouseGroupName = fundHouseGroupName;
    return this;
  }

  public SolvencyDistributorFilterAndPageFilter addFundHouseGroupNameItem(String fundHouseGroupNameItem) {
    if (this.fundHouseGroupName == null) {
      this.fundHouseGroupName = new ArrayList<>();
    }
    this.fundHouseGroupName.add(fundHouseGroupNameItem);
    return this;
  }

  /**
   * Get fundHouseGroupName
   * @return fundHouseGroupName
  **/
  @ApiModelProperty(value = "")


  public List<String> getFundHouseGroupName() {
    return fundHouseGroupName;
  }

  public void setFundHouseGroupName(List<String> fundHouseGroupName) {
    this.fundHouseGroupName = fundHouseGroupName;
  }

  public SolvencyDistributorFilterAndPageFilter fundName(List<String> fundName) {
    this.fundName = fundName;
    return this;
  }

  public SolvencyDistributorFilterAndPageFilter addFundNameItem(String fundNameItem) {
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

  public SolvencyDistributorFilterAndPageFilter instrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
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

  public SolvencyDistributorFilterAndPageFilter intermediaryId(String intermediaryId) {
    this.intermediaryId = intermediaryId;
    return this;
  }

  /**
   * The code of the {Intermediary}
   * @return intermediaryId
  **/
  @ApiModelProperty(value = "The code of the {Intermediary}")


  public String getIntermediaryId() {
    return intermediaryId;
  }

  public void setIntermediaryId(String intermediaryId) {
    this.intermediaryId = intermediaryId;
  }

  public SolvencyDistributorFilterAndPageFilter page(PageFilter page) {
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

  public SolvencyDistributorFilterAndPageFilter periodicity(String periodicity) {
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
    SolvencyDistributorFilterAndPageFilter solvencyDistributorFilterAndPageFilter = (SolvencyDistributorFilterAndPageFilter) o;
    return Objects.equals(this.authorizedCode, solvencyDistributorFilterAndPageFilter.authorizedCode) &&
        Objects.equals(this.breakdownDate, solvencyDistributorFilterAndPageFilter.breakdownDate) &&
        Objects.equals(this.description, solvencyDistributorFilterAndPageFilter.description) &&
        Objects.equals(this.estimatedDate, solvencyDistributorFilterAndPageFilter.estimatedDate) &&
        Objects.equals(this.fundHouseGroupName, solvencyDistributorFilterAndPageFilter.fundHouseGroupName) &&
        Objects.equals(this.fundName, solvencyDistributorFilterAndPageFilter.fundName) &&
        Objects.equals(this.instrumentSearchByCode, solvencyDistributorFilterAndPageFilter.instrumentSearchByCode) &&
        Objects.equals(this.intermediaryId, solvencyDistributorFilterAndPageFilter.intermediaryId) &&
        Objects.equals(this.page, solvencyDistributorFilterAndPageFilter.page) &&
        Objects.equals(this.periodicity, solvencyDistributorFilterAndPageFilter.periodicity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedCode, breakdownDate, description, estimatedDate, fundHouseGroupName, fundName, instrumentSearchByCode, intermediaryId, page, periodicity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyDistributorFilterAndPageFilter {\n");
    
    sb.append("    authorizedCode: ").append(toIndentedString(authorizedCode)).append("\n");
    sb.append("    breakdownDate: ").append(toIndentedString(breakdownDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    estimatedDate: ").append(toIndentedString(estimatedDate)).append("\n");
    sb.append("    fundHouseGroupName: ").append(toIndentedString(fundHouseGroupName)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    instrumentSearchByCode: ").append(toIndentedString(instrumentSearchByCode)).append("\n");
    sb.append("    intermediaryId: ").append(toIndentedString(intermediaryId)).append("\n");
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

