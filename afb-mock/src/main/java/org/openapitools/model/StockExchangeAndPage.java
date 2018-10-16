package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.StockExchange;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {StockExchange} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {StockExchange} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockExchangeAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("stockExchanges")
  @Valid
  private List<StockExchange> stockExchanges = null;

  public StockExchangeAndPage page(Page page) {
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

  public StockExchangeAndPage stockExchanges(List<StockExchange> stockExchanges) {
    this.stockExchanges = stockExchanges;
    return this;
  }

  public StockExchangeAndPage addStockExchangesItem(StockExchange stockExchangesItem) {
    if (this.stockExchanges == null) {
      this.stockExchanges = new ArrayList<>();
    }
    this.stockExchanges.add(stockExchangesItem);
    return this;
  }

  /**
   * The array of {StockExchange}
   * @return stockExchanges
  **/
  @ApiModelProperty(value = "The array of {StockExchange}")

  @Valid

  public List<StockExchange> getStockExchanges() {
    return stockExchanges;
  }

  public void setStockExchanges(List<StockExchange> stockExchanges) {
    this.stockExchanges = stockExchanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockExchangeAndPage stockExchangeAndPage = (StockExchangeAndPage) o;
    return Objects.equals(this.page, stockExchangeAndPage.page) &&
        Objects.equals(this.stockExchanges, stockExchangeAndPage.stockExchanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, stockExchanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockExchangeAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    stockExchanges: ").append(toIndentedString(stockExchanges)).append("\n");
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

