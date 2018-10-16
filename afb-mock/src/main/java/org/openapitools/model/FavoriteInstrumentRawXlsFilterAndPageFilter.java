package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FavoriteInstrumentRawXlsFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FavoriteInstrumentRawXlsFilterAndPageFilter   {
  @JsonProperty("columns")
  @Valid
  private List<String> columns = null;

  @JsonProperty("marketId")
  private Integer marketId = null;

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("regulatoryDataCode")
  private String regulatoryDataCode = null;

  public FavoriteInstrumentRawXlsFilterAndPageFilter columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public FavoriteInstrumentRawXlsFilterAndPageFilter addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * An array to specify which columns must be returned into the generated excel file
   * @return columns
  **/
  @ApiModelProperty(value = "An array to specify which columns must be returned into the generated excel file")


  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public FavoriteInstrumentRawXlsFilterAndPageFilter marketId(Integer marketId) {
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

  public FavoriteInstrumentRawXlsFilterAndPageFilter page(PageFilter page) {
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

  public FavoriteInstrumentRawXlsFilterAndPageFilter regulatoryDataCode(String regulatoryDataCode) {
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
    FavoriteInstrumentRawXlsFilterAndPageFilter favoriteInstrumentRawXlsFilterAndPageFilter = (FavoriteInstrumentRawXlsFilterAndPageFilter) o;
    return Objects.equals(this.columns, favoriteInstrumentRawXlsFilterAndPageFilter.columns) &&
        Objects.equals(this.marketId, favoriteInstrumentRawXlsFilterAndPageFilter.marketId) &&
        Objects.equals(this.page, favoriteInstrumentRawXlsFilterAndPageFilter.page) &&
        Objects.equals(this.regulatoryDataCode, favoriteInstrumentRawXlsFilterAndPageFilter.regulatoryDataCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, marketId, page, regulatoryDataCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteInstrumentRawXlsFilterAndPageFilter {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

