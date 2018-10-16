package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Market;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Market} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Market} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MarketAndPage   {
  @JsonProperty("markets")
  @Valid
  private List<Market> markets = null;

  @JsonProperty("page")
  private Page page = null;

  public MarketAndPage markets(List<Market> markets) {
    this.markets = markets;
    return this;
  }

  public MarketAndPage addMarketsItem(Market marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

  /**
   * The array of {Market}
   * @return markets
  **/
  @ApiModelProperty(value = "The array of {Market}")

  @Valid

  public List<Market> getMarkets() {
    return markets;
  }

  public void setMarkets(List<Market> markets) {
    this.markets = markets;
  }

  public MarketAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
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
    MarketAndPage marketAndPage = (MarketAndPage) o;
    return Objects.equals(this.markets, marketAndPage.markets) &&
        Objects.equals(this.page, marketAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketAndPage {\n");
    
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
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

