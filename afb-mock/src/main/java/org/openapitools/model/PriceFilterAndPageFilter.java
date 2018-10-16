package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.PriceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {PriceFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {PriceFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PriceFilterAndPageFilter   {
  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("price")
  private PriceFilter price = null;

  public PriceFilterAndPageFilter page(PageFilter page) {
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

  public PriceFilterAndPageFilter price(PriceFilter price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PriceFilter getPrice() {
    return price;
  }

  public void setPrice(PriceFilter price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceFilterAndPageFilter priceFilterAndPageFilter = (PriceFilterAndPageFilter) o;
    return Objects.equals(this.page, priceFilterAndPageFilter.page) &&
        Objects.equals(this.price, priceFilterAndPageFilter.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceFilterAndPageFilter {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

