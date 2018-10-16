package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DealingFundHouse;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {DealingFundHouse} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {DealingFundHouse} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingFundHouseAndPage   {
  @JsonProperty("dealingFundHouses")
  @Valid
  private List<DealingFundHouse> dealingFundHouses = null;

  @JsonProperty("page")
  private Page page = null;

  public DealingFundHouseAndPage dealingFundHouses(List<DealingFundHouse> dealingFundHouses) {
    this.dealingFundHouses = dealingFundHouses;
    return this;
  }

  public DealingFundHouseAndPage addDealingFundHousesItem(DealingFundHouse dealingFundHousesItem) {
    if (this.dealingFundHouses == null) {
      this.dealingFundHouses = new ArrayList<>();
    }
    this.dealingFundHouses.add(dealingFundHousesItem);
    return this;
  }

  /**
   * The array of {DealingFundHouse}
   * @return dealingFundHouses
  **/
  @ApiModelProperty(value = "The array of {DealingFundHouse}")

  @Valid

  public List<DealingFundHouse> getDealingFundHouses() {
    return dealingFundHouses;
  }

  public void setDealingFundHouses(List<DealingFundHouse> dealingFundHouses) {
    this.dealingFundHouses = dealingFundHouses;
  }

  public DealingFundHouseAndPage page(Page page) {
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
    DealingFundHouseAndPage dealingFundHouseAndPage = (DealingFundHouseAndPage) o;
    return Objects.equals(this.dealingFundHouses, dealingFundHouseAndPage.dealingFundHouses) &&
        Objects.equals(this.page, dealingFundHouseAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingFundHouses, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingFundHouseAndPage {\n");
    
    sb.append("    dealingFundHouses: ").append(toIndentedString(dealingFundHouses)).append("\n");
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

