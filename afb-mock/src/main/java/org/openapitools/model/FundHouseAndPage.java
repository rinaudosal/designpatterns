package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FundHouse;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {FundHouse} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {FundHouse} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundHouseAndPage   {
  @JsonProperty("fundHouses")
  @Valid
  private List<FundHouse> fundHouses = null;

  @JsonProperty("page")
  private Page page = null;

  public FundHouseAndPage fundHouses(List<FundHouse> fundHouses) {
    this.fundHouses = fundHouses;
    return this;
  }

  public FundHouseAndPage addFundHousesItem(FundHouse fundHousesItem) {
    if (this.fundHouses == null) {
      this.fundHouses = new ArrayList<>();
    }
    this.fundHouses.add(fundHousesItem);
    return this;
  }

  /**
   * The array of {FundHouse}
   * @return fundHouses
  **/
  @ApiModelProperty(value = "The array of {FundHouse}")

  @Valid

  public List<FundHouse> getFundHouses() {
    return fundHouses;
  }

  public void setFundHouses(List<FundHouse> fundHouses) {
    this.fundHouses = fundHouses;
  }

  public FundHouseAndPage page(Page page) {
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
    FundHouseAndPage fundHouseAndPage = (FundHouseAndPage) o;
    return Objects.equals(this.fundHouses, fundHouseAndPage.fundHouses) &&
        Objects.equals(this.page, fundHouseAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundHouses, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundHouseAndPage {\n");
    
    sb.append("    fundHouses: ").append(toIndentedString(fundHouses)).append("\n");
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

