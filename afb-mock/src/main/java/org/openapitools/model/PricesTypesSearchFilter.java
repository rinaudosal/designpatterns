package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricesTypesSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PricesTypesSearchFilter   {
  @JsonProperty("bid")
  private NumberComparisonFilter bid = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("nav")
  private NumberComparisonFilter nav = null;

  @JsonProperty("offer")
  private NumberComparisonFilter offer = null;

  public PricesTypesSearchFilter bid(NumberComparisonFilter bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   * @return bid
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getBid() {
    return bid;
  }

  public void setBid(NumberComparisonFilter bid) {
    this.bid = bid;
  }

  public PricesTypesSearchFilter date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date to show prices filter
   * @return date
  **/
  @ApiModelProperty(value = "Date to show prices filter")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public PricesTypesSearchFilter nav(NumberComparisonFilter nav) {
    this.nav = nav;
    return this;
  }

  /**
   * Get nav
   * @return nav
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getNav() {
    return nav;
  }

  public void setNav(NumberComparisonFilter nav) {
    this.nav = nav;
  }

  public PricesTypesSearchFilter offer(NumberComparisonFilter offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getOffer() {
    return offer;
  }

  public void setOffer(NumberComparisonFilter offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricesTypesSearchFilter pricesTypesSearchFilter = (PricesTypesSearchFilter) o;
    return Objects.equals(this.bid, pricesTypesSearchFilter.bid) &&
        Objects.equals(this.date, pricesTypesSearchFilter.date) &&
        Objects.equals(this.nav, pricesTypesSearchFilter.nav) &&
        Objects.equals(this.offer, pricesTypesSearchFilter.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, date, nav, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricesTypesSearchFilter {\n");
    
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

