package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FundRangeFilter;
import org.openapitools.model.InstrumentSearchByCodeFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorporateActionFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CorporateActionFilterAndPageFilter   {
  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  /**
   * Gets or Sets eventSource
   */
  public enum EventSourceEnum {
    FUND("FUND"),
    
    COLLECTIVEINVESTMENTSCHEME("COLLECTIVEINVESTMENTSCHEME"),
    
    FUNDHOUSE("FUNDHOUSE"),
    
    FUNDGROUP("FUNDGROUP");

    private String value;

    EventSourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventSourceEnum fromValue(String text) {
      for (EventSourceEnum b : EventSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("eventSource")
  private EventSourceEnum eventSource = null;

  @JsonProperty("eventTypeCodes")
  @Valid
  private List<String> eventTypeCodes = null;

  @JsonProperty("fundRange")
  private FundRangeFilter fundRange = null;

  @JsonProperty("instrumentId")
  private String instrumentId = null;

  @JsonProperty("instrumentSearchByCode")
  private InstrumentSearchByCodeFilter instrumentSearchByCode = null;

  /**
   * Gets or Sets instrumentType
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

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("referenceNumber")
  private Long referenceNumber = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public CorporateActionFilterAndPageFilter dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public CorporateActionFilterAndPageFilter distributorId(Long distributorId) {
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

  public CorporateActionFilterAndPageFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * To Date
   * @return endDate
  **/
  @ApiModelProperty(value = "To Date")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CorporateActionFilterAndPageFilter eventSource(EventSourceEnum eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  /**
   * Get eventSource
   * @return eventSource
  **/
  @ApiModelProperty(value = "")


  public EventSourceEnum getEventSource() {
    return eventSource;
  }

  public void setEventSource(EventSourceEnum eventSource) {
    this.eventSource = eventSource;
  }

  public CorporateActionFilterAndPageFilter eventTypeCodes(List<String> eventTypeCodes) {
    this.eventTypeCodes = eventTypeCodes;
    return this;
  }

  public CorporateActionFilterAndPageFilter addEventTypeCodesItem(String eventTypeCodesItem) {
    if (this.eventTypeCodes == null) {
      this.eventTypeCodes = new ArrayList<>();
    }
    this.eventTypeCodes.add(eventTypeCodesItem);
    return this;
  }

  /**
   * List of eventTypeCode the {Consumer} is interested in. Refers to {listEventTypes}
   * @return eventTypeCodes
  **/
  @ApiModelProperty(value = "List of eventTypeCode the {Consumer} is interested in. Refers to {listEventTypes}")


  public List<String> getEventTypeCodes() {
    return eventTypeCodes;
  }

  public void setEventTypeCodes(List<String> eventTypeCodes) {
    this.eventTypeCodes = eventTypeCodes;
  }

  public CorporateActionFilterAndPageFilter fundRange(FundRangeFilter fundRange) {
    this.fundRange = fundRange;
    return this;
  }

  /**
   * Get fundRange
   * @return fundRange
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundRangeFilter getFundRange() {
    return fundRange;
  }

  public void setFundRange(FundRangeFilter fundRange) {
    this.fundRange = fundRange;
  }

  public CorporateActionFilterAndPageFilter instrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
    return this;
  }

  /**
   * Get instrumentId
   * @return instrumentId
  **/
  @ApiModelProperty(value = "")


  public String getInstrumentId() {
    return instrumentId;
  }

  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }

  public CorporateActionFilterAndPageFilter instrumentSearchByCode(InstrumentSearchByCodeFilter instrumentSearchByCode) {
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

  public CorporateActionFilterAndPageFilter instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Get instrumentType
   * @return instrumentType
  **/
  @ApiModelProperty(value = "")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }

  public CorporateActionFilterAndPageFilter marketId(Long marketId) {
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

  public CorporateActionFilterAndPageFilter page(PageFilter page) {
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

  public CorporateActionFilterAndPageFilter referenceNumber(Long referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "")


  public Long getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(Long referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public CorporateActionFilterAndPageFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * From Date
   * @return startDate
  **/
  @ApiModelProperty(value = "From Date")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateActionFilterAndPageFilter corporateActionFilterAndPageFilter = (CorporateActionFilterAndPageFilter) o;
    return Objects.equals(this.dealingFundHouseId, corporateActionFilterAndPageFilter.dealingFundHouseId) &&
        Objects.equals(this.distributorId, corporateActionFilterAndPageFilter.distributorId) &&
        Objects.equals(this.endDate, corporateActionFilterAndPageFilter.endDate) &&
        Objects.equals(this.eventSource, corporateActionFilterAndPageFilter.eventSource) &&
        Objects.equals(this.eventTypeCodes, corporateActionFilterAndPageFilter.eventTypeCodes) &&
        Objects.equals(this.fundRange, corporateActionFilterAndPageFilter.fundRange) &&
        Objects.equals(this.instrumentId, corporateActionFilterAndPageFilter.instrumentId) &&
        Objects.equals(this.instrumentSearchByCode, corporateActionFilterAndPageFilter.instrumentSearchByCode) &&
        Objects.equals(this.instrumentType, corporateActionFilterAndPageFilter.instrumentType) &&
        Objects.equals(this.marketId, corporateActionFilterAndPageFilter.marketId) &&
        Objects.equals(this.page, corporateActionFilterAndPageFilter.page) &&
        Objects.equals(this.referenceNumber, corporateActionFilterAndPageFilter.referenceNumber) &&
        Objects.equals(this.startDate, corporateActionFilterAndPageFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingFundHouseId, distributorId, endDate, eventSource, eventTypeCodes, fundRange, instrumentId, instrumentSearchByCode, instrumentType, marketId, page, referenceNumber, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateActionFilterAndPageFilter {\n");
    
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventTypeCodes: ").append(toIndentedString(eventTypeCodes)).append("\n");
    sb.append("    fundRange: ").append(toIndentedString(fundRange)).append("\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    instrumentSearchByCode: ").append(toIndentedString(instrumentSearchByCode)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

