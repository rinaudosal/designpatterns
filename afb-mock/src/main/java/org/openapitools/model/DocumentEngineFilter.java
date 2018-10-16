package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;SearchDocumentEngineFilter&#x60; allows the {Consumer} to filter the results that match the required characteristics.
 */
@ApiModel(description = "The `SearchDocumentEngineFilter` allows the {Consumer} to filter the results that match the required characteristics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DocumentEngineFilter   {
  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("frequencyCode")
  private String frequencyCode = null;

  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("fundHouseId")
  private Long fundHouseId = null;

  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("marketId")
  private Long marketId = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public DocumentEngineFilter endDate(OffsetDateTime endDate) {
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

  public DocumentEngineFilter frequencyCode(String frequencyCode) {
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

  public DocumentEngineFilter fundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
    return this;
  }

  /**
   * The Id of the {FundHouseGroup}
   * @return fundHouseGroupId
  **/
  @ApiModelProperty(value = "The Id of the {FundHouseGroup}")


  public Long getFundHouseGroupId() {
    return fundHouseGroupId;
  }

  public void setFundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
  }

  public DocumentEngineFilter fundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
    return this;
  }

  /**
   * The Id of the {FundHouse}
   * @return fundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {FundHouse}")


  public Long getFundHouseId() {
    return fundHouseId;
  }

  public void setFundHouseId(Long fundHouseId) {
    this.fundHouseId = fundHouseId;
  }

  public DocumentEngineFilter keyword(String keyword) {
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

  public DocumentEngineFilter languageCode(String languageCode) {
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

  public DocumentEngineFilter marketId(Long marketId) {
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

  public DocumentEngineFilter startDate(OffsetDateTime startDate) {
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
    DocumentEngineFilter documentEngineFilter = (DocumentEngineFilter) o;
    return Objects.equals(this.endDate, documentEngineFilter.endDate) &&
        Objects.equals(this.frequencyCode, documentEngineFilter.frequencyCode) &&
        Objects.equals(this.fundHouseGroupId, documentEngineFilter.fundHouseGroupId) &&
        Objects.equals(this.fundHouseId, documentEngineFilter.fundHouseId) &&
        Objects.equals(this.keyword, documentEngineFilter.keyword) &&
        Objects.equals(this.languageCode, documentEngineFilter.languageCode) &&
        Objects.equals(this.marketId, documentEngineFilter.marketId) &&
        Objects.equals(this.startDate, documentEngineFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, frequencyCode, fundHouseGroupId, fundHouseId, keyword, languageCode, marketId, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEngineFilter {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequencyCode: ").append(toIndentedString(frequencyCode)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    fundHouseId: ").append(toIndentedString(fundHouseId)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

