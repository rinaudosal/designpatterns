package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FavoriteInstrumentRawFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FavoriteInstrumentRawFilterAndPageFilter   {
  @JsonProperty("marketId")
  private Integer marketId = null;

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("regulatoryDataCode")
  private String regulatoryDataCode = null;

  public FavoriteInstrumentRawFilterAndPageFilter marketId(Integer marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * Get marketId
   * @return marketId
  **/
  @ApiModelProperty(value = "")


  public Integer getMarketId() {
    return marketId;
  }

  public void setMarketId(Integer marketId) {
    this.marketId = marketId;
  }

  public FavoriteInstrumentRawFilterAndPageFilter page(PageFilter page) {
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

  public FavoriteInstrumentRawFilterAndPageFilter regulatoryDataCode(String regulatoryDataCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoriteInstrumentRawFilterAndPageFilter favoriteInstrumentRawFilterAndPageFilter = (FavoriteInstrumentRawFilterAndPageFilter) o;
    return Objects.equals(this.marketId, favoriteInstrumentRawFilterAndPageFilter.marketId) &&
        Objects.equals(this.page, favoriteInstrumentRawFilterAndPageFilter.page) &&
        Objects.equals(this.regulatoryDataCode, favoriteInstrumentRawFilterAndPageFilter.regulatoryDataCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, page, regulatoryDataCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteInstrumentRawFilterAndPageFilter {\n");
    
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    regulatoryDataCode: ").append(toIndentedString(regulatoryDataCode)).append("\n");
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

