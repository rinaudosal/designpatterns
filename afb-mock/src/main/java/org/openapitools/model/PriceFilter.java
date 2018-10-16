package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PriceFilter   {
  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("numberOfMonth")
  private Long numberOfMonth = null;

  @JsonProperty("priceSearchCode")
  private String priceSearchCode = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  public PriceFilter count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Count
   * @return count
  **/
  @ApiModelProperty(value = "Count")


  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public PriceFilter endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date.
   * @return endDate
  **/
  @ApiModelProperty(value = "End date.")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public PriceFilter numberOfMonth(Long numberOfMonth) {
    this.numberOfMonth = numberOfMonth;
    return this;
  }

  /**
   * Get numberOfMonth
   * @return numberOfMonth
  **/
  @ApiModelProperty(value = "")


  public Long getNumberOfMonth() {
    return numberOfMonth;
  }

  public void setNumberOfMonth(Long numberOfMonth) {
    this.numberOfMonth = numberOfMonth;
  }

  public PriceFilter priceSearchCode(String priceSearchCode) {
    this.priceSearchCode = priceSearchCode;
    return this;
  }

  /**
   * The Price's search code. Refer to {listPriceSearches}
   * @return priceSearchCode
  **/
  @ApiModelProperty(value = "The Price's search code. Refer to {listPriceSearches}")


  public String getPriceSearchCode() {
    return priceSearchCode;
  }

  public void setPriceSearchCode(String priceSearchCode) {
    this.priceSearchCode = priceSearchCode;
  }

  public PriceFilter startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date.
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date.")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceFilter priceFilter = (PriceFilter) o;
    return Objects.equals(this.count, priceFilter.count) &&
        Objects.equals(this.endDate, priceFilter.endDate) &&
        Objects.equals(this.numberOfMonth, priceFilter.numberOfMonth) &&
        Objects.equals(this.priceSearchCode, priceFilter.priceSearchCode) &&
        Objects.equals(this.startDate, priceFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, endDate, numberOfMonth, priceSearchCode, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceFilter {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    numberOfMonth: ").append(toIndentedString(numberOfMonth)).append("\n");
    sb.append("    priceSearchCode: ").append(toIndentedString(priceSearchCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

