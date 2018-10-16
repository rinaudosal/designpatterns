package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.RebatePrice;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RebatePriceAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebatePriceAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("rebatePrices")
  @Valid
  private List<RebatePrice> rebatePrices = null;

  public RebatePriceAndPage page(Page page) {
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

  public RebatePriceAndPage rebatePrices(List<RebatePrice> rebatePrices) {
    this.rebatePrices = rebatePrices;
    return this;
  }

  public RebatePriceAndPage addRebatePricesItem(RebatePrice rebatePricesItem) {
    if (this.rebatePrices == null) {
      this.rebatePrices = new ArrayList<>();
    }
    this.rebatePrices.add(rebatePricesItem);
    return this;
  }

  /**
   * Get rebatePrices
   * @return rebatePrices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RebatePrice> getRebatePrices() {
    return rebatePrices;
  }

  public void setRebatePrices(List<RebatePrice> rebatePrices) {
    this.rebatePrices = rebatePrices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebatePriceAndPage rebatePriceAndPage = (RebatePriceAndPage) o;
    return Objects.equals(this.page, rebatePriceAndPage.page) &&
        Objects.equals(this.rebatePrices, rebatePriceAndPage.rebatePrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, rebatePrices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebatePriceAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rebatePrices: ").append(toIndentedString(rebatePrices)).append("\n");
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

