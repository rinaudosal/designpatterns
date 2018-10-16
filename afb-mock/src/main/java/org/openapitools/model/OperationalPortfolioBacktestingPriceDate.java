package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioBacktestingPriceDate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioBacktestingPriceDate   {
  @JsonProperty("inceptionDate")
  private OffsetDateTime inceptionDate = null;

  @JsonProperty("lastPrice")
  private OffsetDateTime lastPrice = null;

  public OperationalPortfolioBacktestingPriceDate inceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

  /**
   * The portfolio's inception date.
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "The portfolio's inception date.")

  @Valid

  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public OperationalPortfolioBacktestingPriceDate lastPrice(OffsetDateTime lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

  /**
   * Last price.
   * @return lastPrice
  **/
  @ApiModelProperty(value = "Last price.")

  @Valid

  public OffsetDateTime getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(OffsetDateTime lastPrice) {
    this.lastPrice = lastPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioBacktestingPriceDate operationalPortfolioBacktestingPriceDate = (OperationalPortfolioBacktestingPriceDate) o;
    return Objects.equals(this.inceptionDate, operationalPortfolioBacktestingPriceDate.inceptionDate) &&
        Objects.equals(this.lastPrice, operationalPortfolioBacktestingPriceDate.lastPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inceptionDate, lastPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioBacktestingPriceDate {\n");
    
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
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

