package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundHouseGroupFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundHouseGroupFilterAndPageFilter   {
  @JsonProperty("collectiveInvestmentSchemeId")
  @Valid
  private List<Long> collectiveInvestmentSchemeId = null;

  @JsonProperty("fundHouseGroupId")
  @Valid
  private List<Long> fundHouseGroupId = null;

  @JsonProperty("fundHouseId")
  @Valid
  private List<Long> fundHouseId = null;

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

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("universeCode")
  private String universeCode = null;

  public FundHouseGroupFilterAndPageFilter collectiveInvestmentSchemeId(List<Long> collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
    return this;
  }

  public FundHouseGroupFilterAndPageFilter addCollectiveInvestmentSchemeIdItem(Long collectiveInvestmentSchemeIdItem) {
    if (this.collectiveInvestmentSchemeId == null) {
      this.collectiveInvestmentSchemeId = new ArrayList<>();
    }
    this.collectiveInvestmentSchemeId.add(collectiveInvestmentSchemeIdItem);
    return this;
  }

  /**
   * Get collectiveInvestmentSchemeId
   * @return collectiveInvestmentSchemeId
  **/
  @ApiModelProperty(value = "")


  public List<Long> getCollectiveInvestmentSchemeId() {
    return collectiveInvestmentSchemeId;
  }

  public void setCollectiveInvestmentSchemeId(List<Long> collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
  }

  public FundHouseGroupFilterAndPageFilter fundHouseGroupId(List<Long> fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
    return this;
  }

  public FundHouseGroupFilterAndPageFilter addFundHouseGroupIdItem(Long fundHouseGroupIdItem) {
    if (this.fundHouseGroupId == null) {
      this.fundHouseGroupId = new ArrayList<>();
    }
    this.fundHouseGroupId.add(fundHouseGroupIdItem);
    return this;
  }

  /**
   * Get fundHouseGroupId
   * @return fundHouseGroupId
  **/
  @ApiModelProperty(value = "")


  public List<Long> getFundHouseGroupId() {
    return fundHouseGroupId;
  }

  public void setFundHouseGroupId(List<Long> fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
  }

  public FundHouseGroupFilterAndPageFilter fundHouseId(List<Long> fundHouseId) {
    this.fundHouseId = fundHouseId;
    return this;
  }

  public FundHouseGroupFilterAndPageFilter addFundHouseIdItem(Long fundHouseIdItem) {
    if (this.fundHouseId == null) {
      this.fundHouseId = new ArrayList<>();
    }
    this.fundHouseId.add(fundHouseIdItem);
    return this;
  }

  /**
   * Get fundHouseId
   * @return fundHouseId
  **/
  @ApiModelProperty(value = "")


  public List<Long> getFundHouseId() {
    return fundHouseId;
  }

  public void setFundHouseId(List<Long> fundHouseId) {
    this.fundHouseId = fundHouseId;
  }

  public FundHouseGroupFilterAndPageFilter instrumentType(InstrumentTypeEnum instrumentType) {
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

  public FundHouseGroupFilterAndPageFilter marketId(Long marketId) {
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

  public FundHouseGroupFilterAndPageFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of fundHouseGroup
   * @return name
  **/
  @ApiModelProperty(value = "name of fundHouseGroup")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FundHouseGroupFilterAndPageFilter page(PageFilter page) {
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

  public FundHouseGroupFilterAndPageFilter universeCode(String universeCode) {
    this.universeCode = universeCode;
    return this;
  }

  /**
   * Refers to {listUniverses}
   * @return universeCode
  **/
  @ApiModelProperty(value = "Refers to {listUniverses}")


  public String getUniverseCode() {
    return universeCode;
  }

  public void setUniverseCode(String universeCode) {
    this.universeCode = universeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundHouseGroupFilterAndPageFilter fundHouseGroupFilterAndPageFilter = (FundHouseGroupFilterAndPageFilter) o;
    return Objects.equals(this.collectiveInvestmentSchemeId, fundHouseGroupFilterAndPageFilter.collectiveInvestmentSchemeId) &&
        Objects.equals(this.fundHouseGroupId, fundHouseGroupFilterAndPageFilter.fundHouseGroupId) &&
        Objects.equals(this.fundHouseId, fundHouseGroupFilterAndPageFilter.fundHouseId) &&
        Objects.equals(this.instrumentType, fundHouseGroupFilterAndPageFilter.instrumentType) &&
        Objects.equals(this.marketId, fundHouseGroupFilterAndPageFilter.marketId) &&
        Objects.equals(this.name, fundHouseGroupFilterAndPageFilter.name) &&
        Objects.equals(this.page, fundHouseGroupFilterAndPageFilter.page) &&
        Objects.equals(this.universeCode, fundHouseGroupFilterAndPageFilter.universeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemeId, fundHouseGroupId, fundHouseId, instrumentType, marketId, name, page, universeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundHouseGroupFilterAndPageFilter {\n");
    
    sb.append("    collectiveInvestmentSchemeId: ").append(toIndentedString(collectiveInvestmentSchemeId)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    universeCode: ").append(toIndentedString(universeCode)).append("\n");
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

