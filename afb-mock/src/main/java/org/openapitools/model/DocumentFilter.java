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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;DocumentFilter&#x60; allows the {Consumer} to filter the results that match the required characteristics.
 */
@ApiModel(description = "The `DocumentFilter` allows the {Consumer} to filter the results that match the required characteristics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DocumentFilter   {
  @JsonProperty("collectiveInvestmentSchemeIds")
  @Valid
  private List<Long> collectiveInvestmentSchemeIds = null;

  @JsonProperty("documentationTypeCodes")
  @Valid
  private List<String> documentationTypeCodes = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("frequencyCode")
  private String frequencyCode = null;

  @JsonProperty("fundGroupIds")
  @Valid
  private List<Long> fundGroupIds = null;

  @JsonProperty("fundHouseGroupIds")
  @Valid
  private List<Long> fundHouseGroupIds = null;

  @JsonProperty("fundHouseIds")
  @Valid
  private List<Long> fundHouseIds = null;

  @JsonProperty("fundIds")
  @Valid
  private List<Long> fundIds = null;

  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

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

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public DocumentFilter collectiveInvestmentSchemeIds(List<Long> collectiveInvestmentSchemeIds) {
    this.collectiveInvestmentSchemeIds = collectiveInvestmentSchemeIds;
    return this;
  }

  public DocumentFilter addCollectiveInvestmentSchemeIdsItem(Long collectiveInvestmentSchemeIdsItem) {
    if (this.collectiveInvestmentSchemeIds == null) {
      this.collectiveInvestmentSchemeIds = new ArrayList<>();
    }
    this.collectiveInvestmentSchemeIds.add(collectiveInvestmentSchemeIdsItem);
    return this;
  }

  /**
   * Get collectiveInvestmentSchemeIds
   * @return collectiveInvestmentSchemeIds
  **/
  @ApiModelProperty(value = "")


  public List<Long> getCollectiveInvestmentSchemeIds() {
    return collectiveInvestmentSchemeIds;
  }

  public void setCollectiveInvestmentSchemeIds(List<Long> collectiveInvestmentSchemeIds) {
    this.collectiveInvestmentSchemeIds = collectiveInvestmentSchemeIds;
  }

  public DocumentFilter documentationTypeCodes(List<String> documentationTypeCodes) {
    this.documentationTypeCodes = documentationTypeCodes;
    return this;
  }

  public DocumentFilter addDocumentationTypeCodesItem(String documentationTypeCodesItem) {
    if (this.documentationTypeCodes == null) {
      this.documentationTypeCodes = new ArrayList<>();
    }
    this.documentationTypeCodes.add(documentationTypeCodesItem);
    return this;
  }

  /**
   * Refer to {listDocumentationTypes}. This attribute is mandatory
   * @return documentationTypeCodes
  **/
  @ApiModelProperty(value = "Refer to {listDocumentationTypes}. This attribute is mandatory")


  public List<String> getDocumentationTypeCodes() {
    return documentationTypeCodes;
  }

  public void setDocumentationTypeCodes(List<String> documentationTypeCodes) {
    this.documentationTypeCodes = documentationTypeCodes;
  }

  public DocumentFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Date.
   * @return endDate
  **/
  @ApiModelProperty(value = "Date.")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public DocumentFilter frequencyCode(String frequencyCode) {
    this.frequencyCode = frequencyCode;
    return this;
  }

  /**
   * Refer to {listFrequencies}
   * @return frequencyCode
  **/
  @ApiModelProperty(value = "Refer to {listFrequencies}")


  public String getFrequencyCode() {
    return frequencyCode;
  }

  public void setFrequencyCode(String frequencyCode) {
    this.frequencyCode = frequencyCode;
  }

  public DocumentFilter fundGroupIds(List<Long> fundGroupIds) {
    this.fundGroupIds = fundGroupIds;
    return this;
  }

  public DocumentFilter addFundGroupIdsItem(Long fundGroupIdsItem) {
    if (this.fundGroupIds == null) {
      this.fundGroupIds = new ArrayList<>();
    }
    this.fundGroupIds.add(fundGroupIdsItem);
    return this;
  }

  /**
   * Get fundGroupIds
   * @return fundGroupIds
  **/
  @ApiModelProperty(value = "")


  public List<Long> getFundGroupIds() {
    return fundGroupIds;
  }

  public void setFundGroupIds(List<Long> fundGroupIds) {
    this.fundGroupIds = fundGroupIds;
  }

  public DocumentFilter fundHouseGroupIds(List<Long> fundHouseGroupIds) {
    this.fundHouseGroupIds = fundHouseGroupIds;
    return this;
  }

  public DocumentFilter addFundHouseGroupIdsItem(Long fundHouseGroupIdsItem) {
    if (this.fundHouseGroupIds == null) {
      this.fundHouseGroupIds = new ArrayList<>();
    }
    this.fundHouseGroupIds.add(fundHouseGroupIdsItem);
    return this;
  }

  /**
   * Get fundHouseGroupIds
   * @return fundHouseGroupIds
  **/
  @ApiModelProperty(value = "")


  public List<Long> getFundHouseGroupIds() {
    return fundHouseGroupIds;
  }

  public void setFundHouseGroupIds(List<Long> fundHouseGroupIds) {
    this.fundHouseGroupIds = fundHouseGroupIds;
  }

  public DocumentFilter fundHouseIds(List<Long> fundHouseIds) {
    this.fundHouseIds = fundHouseIds;
    return this;
  }

  public DocumentFilter addFundHouseIdsItem(Long fundHouseIdsItem) {
    if (this.fundHouseIds == null) {
      this.fundHouseIds = new ArrayList<>();
    }
    this.fundHouseIds.add(fundHouseIdsItem);
    return this;
  }

  /**
   * Get fundHouseIds
   * @return fundHouseIds
  **/
  @ApiModelProperty(value = "")


  public List<Long> getFundHouseIds() {
    return fundHouseIds;
  }

  public void setFundHouseIds(List<Long> fundHouseIds) {
    this.fundHouseIds = fundHouseIds;
  }

  public DocumentFilter fundIds(List<Long> fundIds) {
    this.fundIds = fundIds;
    return this;
  }

  public DocumentFilter addFundIdsItem(Long fundIdsItem) {
    if (this.fundIds == null) {
      this.fundIds = new ArrayList<>();
    }
    this.fundIds.add(fundIdsItem);
    return this;
  }

  /**
   * Get fundIds
   * @return fundIds
  **/
  @ApiModelProperty(value = "")


  public List<Long> getFundIds() {
    return fundIds;
  }

  public void setFundIds(List<Long> fundIds) {
    this.fundIds = fundIds;
  }

  public DocumentFilter keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  **/
  @ApiModelProperty(value = "")


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public DocumentFilter languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * The Document's language code. Refer to {listLanguages}
   * @return languageCode
  **/
  @ApiModelProperty(value = "The Document's language code. Refer to {listLanguages}")


  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public DocumentFilter level(LevelEnum level) {
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

  public DocumentFilter marketId(Long marketId) {
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

  public DocumentFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date.
   * @return startDate
  **/
  @ApiModelProperty(value = "Date.")

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
    DocumentFilter documentFilter = (DocumentFilter) o;
    return Objects.equals(this.collectiveInvestmentSchemeIds, documentFilter.collectiveInvestmentSchemeIds) &&
        Objects.equals(this.documentationTypeCodes, documentFilter.documentationTypeCodes) &&
        Objects.equals(this.endDate, documentFilter.endDate) &&
        Objects.equals(this.frequencyCode, documentFilter.frequencyCode) &&
        Objects.equals(this.fundGroupIds, documentFilter.fundGroupIds) &&
        Objects.equals(this.fundHouseGroupIds, documentFilter.fundHouseGroupIds) &&
        Objects.equals(this.fundHouseIds, documentFilter.fundHouseIds) &&
        Objects.equals(this.fundIds, documentFilter.fundIds) &&
        Objects.equals(this.keyword, documentFilter.keyword) &&
        Objects.equals(this.languageCode, documentFilter.languageCode) &&
        Objects.equals(this.level, documentFilter.level) &&
        Objects.equals(this.marketId, documentFilter.marketId) &&
        Objects.equals(this.startDate, documentFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectiveInvestmentSchemeIds, documentationTypeCodes, endDate, frequencyCode, fundGroupIds, fundHouseGroupIds, fundHouseIds, fundIds, keyword, languageCode, level, marketId, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFilter {\n");
    
    sb.append("    collectiveInvestmentSchemeIds: ").append(toIndentedString(collectiveInvestmentSchemeIds)).append("\n");
    sb.append("    documentationTypeCodes: ").append(toIndentedString(documentationTypeCodes)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequencyCode: ").append(toIndentedString(frequencyCode)).append("\n");
    sb.append("    fundGroupIds: ").append(toIndentedString(fundGroupIds)).append("\n");
    sb.append("    fundHouseGroupIds: ").append(toIndentedString(fundHouseGroupIds)).append("\n");
    sb.append("    fundHouseIds: ").append(toIndentedString(fundHouseIds)).append("\n");
    sb.append("    fundIds: ").append(toIndentedString(fundIds)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
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

