package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DateComparisonFilter;
import org.openapitools.model.InstrumentSearchByCodeFilter;
import org.openapitools.model.NumberComparisonFilter;
import org.openapitools.model.PerformanceSearchFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PopularFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PopularFilter   {
  @JsonProperty("afbAssetCode")
  private String afbAssetCode = null;

  @JsonProperty("calculationDate")
  private DateComparisonFilter calculationDate = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("instrumentSearchByCode")
  private InstrumentSearchByCodeFilter instrumentSearchByCode = null;

  @JsonProperty("marketId")
  private Long marketId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("performanceSearch")
  private PerformanceSearchFilter performanceSearch = null;

  @JsonProperty("ranking")
  private NumberComparisonFilter ranking = null;

  public PopularFilter afbAssetCode(String afbAssetCode) {
    this.afbAssetCode = afbAssetCode;
    return this;
  }

  /**
   * Refer to {listAfbAssets}
   * @return afbAssetCode
  **/
  @ApiModelProperty(value = "Refer to {listAfbAssets}")


  public String getAfbAssetCode() {
    return afbAssetCode;
  }

  public void setAfbAssetCode(String afbAssetCode) {
    this.afbAssetCode = afbAssetCode;
  }

  public PopularFilter calculationDate(DateComparisonFilter calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

  /**
   * Get calculationDate
   * @return calculationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateComparisonFilter getCalculationDate() {
    return calculationDate;
  }

  public void setCalculationDate(DateComparisonFilter calculationDate) {
    this.calculationDate = calculationDate;
  }

  public PopularFilter currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PopularFilter instrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
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

  public PopularFilter marketId(Long marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * The Id of the {Market}
   * @return marketId
  **/
  @ApiModelProperty(value = "The Id of the {Market}")


  public Long getMarketId() {
    return marketId;
  }

  public void setMarketId(Long marketId) {
    this.marketId = marketId;
  }

  public PopularFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of fund
   * @return name
  **/
  @ApiModelProperty(value = "name of fund")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PopularFilter performanceSearch(PerformanceSearchFilter performanceSearch) {
    this.performanceSearch = performanceSearch;
    return this;
  }

  /**
   * Get performanceSearch
   * @return performanceSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PerformanceSearchFilter getPerformanceSearch() {
    return performanceSearch;
  }

  public void setPerformanceSearch(PerformanceSearchFilter performanceSearch) {
    this.performanceSearch = performanceSearch;
  }

  public PopularFilter ranking(NumberComparisonFilter ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * Get ranking
   * @return ranking
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getRanking() {
    return ranking;
  }

  public void setRanking(NumberComparisonFilter ranking) {
    this.ranking = ranking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularFilter popularFilter = (PopularFilter) o;
    return Objects.equals(this.afbAssetCode, popularFilter.afbAssetCode) &&
        Objects.equals(this.calculationDate, popularFilter.calculationDate) &&
        Objects.equals(this.currencyCode, popularFilter.currencyCode) &&
        Objects.equals(this.instrumentSearchByCode, popularFilter.instrumentSearchByCode) &&
        Objects.equals(this.marketId, popularFilter.marketId) &&
        Objects.equals(this.name, popularFilter.name) &&
        Objects.equals(this.performanceSearch, popularFilter.performanceSearch) &&
        Objects.equals(this.ranking, popularFilter.ranking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbAssetCode, calculationDate, currencyCode, instrumentSearchByCode, marketId, name, performanceSearch, ranking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularFilter {\n");
    
    sb.append("    afbAssetCode: ").append(toIndentedString(afbAssetCode)).append("\n");
    sb.append("    calculationDate: ").append(toIndentedString(calculationDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    instrumentSearchByCode: ").append(toIndentedString(instrumentSearchByCode)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    performanceSearch: ").append(toIndentedString(performanceSearch)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
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

