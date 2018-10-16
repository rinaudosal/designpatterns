package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;SearchDocumentLegalFilter&#x60; allows the {Consumer} to filter the results that match the required characteristics.
 */
@ApiModel(description = "The `SearchDocumentLegalFilter` allows the {Consumer} to filter the results that match the required characteristics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DocumentLegalFilter   {
  @JsonProperty("collectiveInvestmentSchemeId")
  private Long collectiveInvestmentSchemeId = null;

  @JsonProperty("fundHouseId")
  private Long fundHouseId = null;

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

  /**
   *  * INTERNATIONAL -- documents required by the regulator of the country for international sale * DOMESTIC -- documents required by the regulator of the country for dometic sale * NA -- not available 
   */
  public enum LevelEnum {
    INTERNATIONAL("INTERNATIONAL"),
    
    DOMESTIC("DOMESTIC"),
    
    INDIFFERENT("INDIFFERENT");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("level")
  private LevelEnum level = null;

  @JsonProperty("marketId")
  private Long marketId = null;

  public DocumentLegalFilter collectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
    return this;
  }

  /**
   * The Id of the {CollectiveInvestmentScheme}
   * @return collectiveInvestmentSchemeId
  **/
  @ApiModelProperty(value = "The Id of the {CollectiveInvestmentScheme}")


  public Long getCollectiveInvestmentSchemeId() {
    return collectiveInvestmentSchemeId;
  }

  public void setCollectiveInvestmentSchemeId(Long collectiveInvestmentSchemeId) {
    this.collectiveInvestmentSchemeId = collectiveInvestmentSchemeId;
  }

  public DocumentLegalFilter fundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
    return this;
  }

  /**
   * The Ids of the {FundHouse}
   * @return fundHouseId
  **/
  @ApiModelProperty(value = "The Ids of the {FundHouse}")


  public Long getFundHouseId() {
    return fundHouseId;
  }

  public void setFundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
  }

  public DocumentLegalFilter instrumentType(InstrumentTypeEnum instrumentType) {
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

  public DocumentLegalFilter level(LevelEnum level) {
    this.level = level;
    return this;
  }

  /**
   *  * INTERNATIONAL -- documents required by the regulator of the country for international sale * DOMESTIC -- documents required by the regulator of the country for dometic sale * NA -- not available 
   * @return level
  **/
  @ApiModelProperty(value = " * INTERNATIONAL -- documents required by the regulator of the country for international sale * DOMESTIC -- documents required by the regulator of the country for dometic sale * NA -- not available ")


  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public DocumentLegalFilter marketId(Long marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * The Id of the {Market}. Refer to {listMarkets}. This parameter must be set at the same time as the `fundIds`
   * @return marketId
  **/
  @ApiModelProperty(value = "The Id of the {Market}. Refer to {listMarkets}. This parameter must be set at the same time as the `fundIds`")


  public Long getMarketId() {
    return marketId;
  }

  public void setMarketId(Long marketId) {
    this.marketId = marketId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentLegalFilter documentLegalFilter = (DocumentLegalFilter) o;
    return Objects.equals(this.collectiveInvestmentSchemeId, documentLegalFilter.collectiveInvestmentSchemeId) &&
        Objects.equals(this.fundHouseId, documentLegalFilter.fundHouseId) &&
        Objects.equals(this.instrumentType, documentLegalFilter.instrumentType) &&
        Objects.equals(this.level, documentLegalFilter.level) &&
        Objects.equals(this.marketId, documentLegalFilter.marketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemeId, fundHouseId, instrumentType, level, marketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentLegalFilter {\n");
    
    sb.append("    collectiveInvestmentSchemeId: ").append(toIndentedString(collectiveInvestmentSchemeId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
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

