package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Price} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Price} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PriceAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("prices")
  @Valid
  private List<Price> prices = null;

  public PriceAndPage page(Page page) {
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

  public PriceAndPage prices(List<Price> prices) {
    this.prices = prices;
    return this;
  }

  public PriceAndPage addPricesItem(Price pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * The array of {Price}
   * @return prices
  **/
  @ApiModelProperty(value = "The array of {Price}")

  @Valid

  public List<Price> getPrices() {
    return prices;
  }

  public void setPrices(List<Price> prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndPage priceAndPage = (PriceAndPage) o;
    return Objects.equals(this.page, priceAndPage.page) &&
        Objects.equals(this.prices, priceAndPage.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

