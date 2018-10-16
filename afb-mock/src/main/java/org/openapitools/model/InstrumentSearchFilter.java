package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BreakdownSearchFilter;
import org.openapitools.model.FeesSearchFilter;
import org.openapitools.model.FundDetailsSearchFilter;
import org.openapitools.model.InstrumentSearchByCodeFilter;
import org.openapitools.model.PerformanceSearchFilter;
import org.openapitools.model.PricesTypesSearchFilter;
import org.openapitools.model.RatingsSearchFilter;
import org.openapitools.model.StatisticSearchFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchFilter   {
  @JsonProperty("breakdownSearch")
  private BreakdownSearchFilter breakdownSearch = null;

  @JsonProperty("feesSearch")
  private FeesSearchFilter feesSearch = null;

  @JsonProperty("fundDetailsSearch")
  private FundDetailsSearchFilter fundDetailsSearch = null;

  @JsonProperty("instrumentSearchByCode")
  private InstrumentSearchByCodeFilter instrumentSearchByCode = null;

  /**
   * Indicates whether to search for a {Fund} or an {ETF}
   */
  public enum InstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstrumentTypeEnum fromValue(String text) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("instrumentType")
  private InstrumentTypeEnum instrumentType = null;

  @JsonProperty("marketId")
  private Long marketId = null;

  @JsonProperty("performanceSearch")
  private PerformanceSearchFilter performanceSearch = null;

  @JsonProperty("pricesTypesSearch")
  private PricesTypesSearchFilter pricesTypesSearch = null;

  @JsonProperty("ratingsSearch")
  private RatingsSearchFilter ratingsSearch = null;

  @JsonProperty("regulatoryDataCode")
  private String regulatoryDataCode = null;

  @JsonProperty("statisticSearch")
  private StatisticSearchFilter statisticSearch = null;

  public InstrumentSearchFilter breakdownSearch(BreakdownSearchFilter breakdownSearch) {
    this.breakdownSearch = breakdownSearch;
    return this;
  }

  /**
   * Get breakdownSearch
   * @return breakdownSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BreakdownSearchFilter getBreakdownSearch() {
    return breakdownSearch;
  }

  public void setBreakdownSearch(BreakdownSearchFilter breakdownSearch) {
    this.breakdownSearch = breakdownSearch;
  }

  public InstrumentSearchFilter feesSearch(FeesSearchFilter feesSearch) {
    this.feesSearch = feesSearch;
    return this;
  }

  /**
   * Get feesSearch
   * @return feesSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FeesSearchFilter getFeesSearch() {
    return feesSearch;
  }

  public void setFeesSearch(FeesSearchFilter feesSearch) {
    this.feesSearch = feesSearch;
  }

  public InstrumentSearchFilter fundDetailsSearch(FundDetailsSearchFilter fundDetailsSearch) {
    this.fundDetailsSearch = fundDetailsSearch;
    return this;
  }

  /**
   * Get fundDetailsSearch
   * @return fundDetailsSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundDetailsSearchFilter getFundDetailsSearch() {
    return fundDetailsSearch;
  }

  public void setFundDetailsSearch(FundDetailsSearchFilter fundDetailsSearch) {
    this.fundDetailsSearch = fundDetailsSearch;
  }

  public InstrumentSearchFilter instrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
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

  public InstrumentSearchFilter instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Indicates whether to search for a {Fund} or an {ETF}
   * @return instrumentType
  **/
  @ApiModelProperty(value = "Indicates whether to search for a {Fund} or an {ETF}")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }

  public InstrumentSearchFilter marketId(Long marketId) {
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

  public InstrumentSearchFilter performanceSearch(PerformanceSearchFilter performanceSearch) {
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

  public InstrumentSearchFilter pricesTypesSearch(PricesTypesSearchFilter pricesTypesSearch) {
    this.pricesTypesSearch = pricesTypesSearch;
    return this;
  }

  /**
   * Get pricesTypesSearch
   * @return pricesTypesSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PricesTypesSearchFilter getPricesTypesSearch() {
    return pricesTypesSearch;
  }

  public void setPricesTypesSearch(PricesTypesSearchFilter pricesTypesSearch) {
    this.pricesTypesSearch = pricesTypesSearch;
  }

  public InstrumentSearchFilter ratingsSearch(RatingsSearchFilter ratingsSearch) {
    this.ratingsSearch = ratingsSearch;
    return this;
  }

  /**
   * Get ratingsSearch
   * @return ratingsSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RatingsSearchFilter getRatingsSearch() {
    return ratingsSearch;
  }

  public void setRatingsSearch(RatingsSearchFilter ratingsSearch) {
    this.ratingsSearch = ratingsSearch;
  }

  public InstrumentSearchFilter regulatoryDataCode(String regulatoryDataCode) {
    this.regulatoryDataCode = regulatoryDataCode;
    return this;
  }

  /**
   * Refers to {listRegulatoryDataCodes}
   * @return regulatoryDataCode
  **/
  @ApiModelProperty(value = "Refers to {listRegulatoryDataCodes}")


  public String getRegulatoryDataCode() {
    return regulatoryDataCode;
  }

  public void setRegulatoryDataCode(String regulatoryDataCode) {
    this.regulatoryDataCode = regulatoryDataCode;
  }

  public InstrumentSearchFilter statisticSearch(StatisticSearchFilter statisticSearch) {
    this.statisticSearch = statisticSearch;
    return this;
  }

  /**
   * Get statisticSearch
   * @return statisticSearch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatisticSearchFilter getStatisticSearch() {
    return statisticSearch;
  }

  public void setStatisticSearch(StatisticSearchFilter statisticSearch) {
    this.statisticSearch = statisticSearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentSearchFilter instrumentSearchFilter = (InstrumentSearchFilter) o;
    return Objects.equals(this.breakdownSearch, instrumentSearchFilter.breakdownSearch) &&
        Objects.equals(this.feesSearch, instrumentSearchFilter.feesSearch) &&
        Objects.equals(this.fundDetailsSearch, instrumentSearchFilter.fundDetailsSearch) &&
        Objects.equals(this.instrumentSearchByCode, instrumentSearchFilter.instrumentSearchByCode) &&
        Objects.equals(this.instrumentType, instrumentSearchFilter.instrumentType) &&
        Objects.equals(this.marketId, instrumentSearchFilter.marketId) &&
        Objects.equals(this.performanceSearch, instrumentSearchFilter.performanceSearch) &&
        Objects.equals(this.pricesTypesSearch, instrumentSearchFilter.pricesTypesSearch) &&
        Objects.equals(this.ratingsSearch, instrumentSearchFilter.ratingsSearch) &&
        Objects.equals(this.regulatoryDataCode, instrumentSearchFilter.regulatoryDataCode) &&
        Objects.equals(this.statisticSearch, instrumentSearchFilter.statisticSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdownSearch, feesSearch, fundDetailsSearch, instrumentSearchByCode, instrumentType, marketId, performanceSearch, pricesTypesSearch, ratingsSearch, regulatoryDataCode, statisticSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchFilter {\n");
    
    sb.append("    breakdownSearch: ").append(toIndentedString(breakdownSearch)).append("\n");
    sb.append("    feesSearch: ").append(toIndentedString(feesSearch)).append("\n");
    sb.append("    fundDetailsSearch: ").append(toIndentedString(fundDetailsSearch)).append("\n");
    sb.append("    instrumentSearchByCode: ").append(toIndentedString(instrumentSearchByCode)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    performanceSearch: ").append(toIndentedString(performanceSearch)).append("\n");
    sb.append("    pricesTypesSearch: ").append(toIndentedString(pricesTypesSearch)).append("\n");
    sb.append("    ratingsSearch: ").append(toIndentedString(ratingsSearch)).append("\n");
    sb.append("    regulatoryDataCode: ").append(toIndentedString(regulatoryDataCode)).append("\n");
    sb.append("    statisticSearch: ").append(toIndentedString(statisticSearch)).append("\n");
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

