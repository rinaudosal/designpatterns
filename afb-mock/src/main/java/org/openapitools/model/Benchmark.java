package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BenchmarkFactor;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A benchmark is a standard against which the performance of a {Security}, {MutualFund} or {InvestmentManager} can be measured. Generally, {BroadMarketStock} and {MarketSegmentStock} and bond indexes are used for this purpose.
 */
@ApiModel(description = "A benchmark is a standard against which the performance of a {Security}, {MutualFund} or {InvestmentManager} can be measured. Generally, {BroadMarketStock} and {MarketSegmentStock} and bond indexes are used for this purpose.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Benchmark   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("factors")
  @Valid
  private List<BenchmarkFactor> factors = null;

  @JsonProperty("firstPrices")
  @Valid
  private List<Price> firstPrices = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lastPrices")
  @Valid
  private List<Price> lastPrices = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ticker")
  private String ticker = null;

  public Benchmark currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The {Benchmark} currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The {Benchmark} currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Benchmark factors(List<BenchmarkFactor> factors) {
    this.factors = factors;
    return this;
  }

  public Benchmark addFactorsItem(BenchmarkFactor factorsItem) {
    if (this.factors == null) {
      this.factors = new ArrayList<>();
    }
    this.factors.add(factorsItem);
    return this;
  }

  /**
   * In case of a {CompositeIndex} this list will contain the different {BenchmarkFactor}s composing this {Benchmark}.
   * @return factors
  **/
  @ApiModelProperty(value = "In case of a {CompositeIndex} this list will contain the different {BenchmarkFactor}s composing this {Benchmark}.")

  @Valid

  public List<BenchmarkFactor> getFactors() {
    return factors;
  }

  public void setFactors(List<BenchmarkFactor> factors) {
    this.factors = factors;
  }

  public Benchmark firstPrices(List<Price> firstPrices) {
    this.firstPrices = firstPrices;
    return this;
  }

  public Benchmark addFirstPricesItem(Price firstPricesItem) {
    if (this.firstPrices == null) {
      this.firstPrices = new ArrayList<>();
    }
    this.firstPrices.add(firstPricesItem);
    return this;
  }

  /**
   * Get firstPrices
   * @return firstPrices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getFirstPrices() {
    return firstPrices;
  }

  public void setFirstPrices(List<Price> firstPrices) {
    this.firstPrices = firstPrices;
  }

  public Benchmark id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identificator for this {Benchmark}
   * @return id
  **/
  @ApiModelProperty(value = "The unique identificator for this {Benchmark}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Benchmark lastPrices(List<Price> lastPrices) {
    this.lastPrices = lastPrices;
    return this;
  }

  public Benchmark addLastPricesItem(Price lastPricesItem) {
    if (this.lastPrices == null) {
      this.lastPrices = new ArrayList<>();
    }
    this.lastPrices.add(lastPricesItem);
    return this;
  }

  /**
   * Get lastPrices
   * @return lastPrices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getLastPrices() {
    return lastPrices;
  }

  public void setLastPrices(List<Price> lastPrices) {
    this.lastPrices = lastPrices;
  }

  public Benchmark name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The {Benchmark} name.
   * @return name
  **/
  @ApiModelProperty(value = "The {Benchmark} name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Benchmark ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

  /**
   * The external identificator for this {Benchmark}
   * @return ticker
  **/
  @ApiModelProperty(value = "The external identificator for this {Benchmark}")


  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benchmark benchmark = (Benchmark) o;
    return Objects.equals(this.currencyCode, benchmark.currencyCode) &&
        Objects.equals(this.factors, benchmark.factors) &&
        Objects.equals(this.firstPrices, benchmark.firstPrices) &&
        Objects.equals(this.id, benchmark.id) &&
        Objects.equals(this.lastPrices, benchmark.lastPrices) &&
        Objects.equals(this.name, benchmark.name) &&
        Objects.equals(this.ticker, benchmark.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, factors, firstPrices, id, lastPrices, name, ticker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benchmark {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    firstPrices: ").append(toIndentedString(firstPrices)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastPrices: ").append(toIndentedString(lastPrices)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

