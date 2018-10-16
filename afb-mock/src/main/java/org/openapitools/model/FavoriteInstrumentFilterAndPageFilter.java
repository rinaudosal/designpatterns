package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FavoriteInstrumentFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FavoriteInstrumentFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FavoriteInstrumentFilterAndPageFilter   {
  @JsonProperty("instrumentType")
  private FavoriteInstrumentFilter instrumentType = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public FavoriteInstrumentFilterAndPageFilter instrumentType(FavoriteInstrumentFilter instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Get instrumentType
   * @return instrumentType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FavoriteInstrumentFilter getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(FavoriteInstrumentFilter instrumentType) {
    this.instrumentType = instrumentType;
  }

  public FavoriteInstrumentFilterAndPageFilter page(PageFilter page) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoriteInstrumentFilterAndPageFilter favoriteInstrumentFilterAndPageFilter = (FavoriteInstrumentFilterAndPageFilter) o;
    return Objects.equals(this.instrumentType, favoriteInstrumentFilterAndPageFilter.instrumentType) &&
        Objects.equals(this.page, favoriteInstrumentFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentType, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteInstrumentFilterAndPageFilter {\n");
    
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

