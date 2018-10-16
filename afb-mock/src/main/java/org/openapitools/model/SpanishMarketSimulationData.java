package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object contains attibutes only used for spanish taxaction
 */
@ApiModel(description = "This object contains attibutes only used for spanish taxaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishMarketSimulationData   {
  @JsonProperty("capitalGainedUntil2006")
  private Double capitalGainedUntil2006 = null;

  @JsonProperty("capitalGainedUntil2006InLocalCurrency")
  private Double capitalGainedUntil2006InLocalCurrency = null;

  @JsonProperty("withheldAmountUntil2006")
  private Double withheldAmountUntil2006 = null;

  @JsonProperty("withheldAmountUntil2006InLocalCurrency")
  private Double withheldAmountUntil2006InLocalCurrency = null;

  @JsonProperty("withholdingPercentageUntil2006")
  private Double withholdingPercentageUntil2006 = null;

  public SpanishMarketSimulationData capitalGainedUntil2006(Double capitalGainedUntil2006) {
    this.capitalGainedUntil2006 = capitalGainedUntil2006;
    return this;
  }

  /**
   * Capital gained until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}
   * @return capitalGainedUntil2006
  **/
  @ApiModelProperty(value = "Capital gained until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}")


  public Double getCapitalGainedUntil2006() {
    return capitalGainedUntil2006;
  }

  public void setCapitalGainedUntil2006(Double capitalGainedUntil2006) {
    this.capitalGainedUntil2006 = capitalGainedUntil2006;
  }

  public SpanishMarketSimulationData capitalGainedUntil2006InLocalCurrency(Double capitalGainedUntil2006InLocalCurrency) {
    this.capitalGainedUntil2006InLocalCurrency = capitalGainedUntil2006InLocalCurrency;
    return this;
  }

  /**
   * Capital gained until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}
   * @return capitalGainedUntil2006InLocalCurrency
  **/
  @ApiModelProperty(value = "Capital gained until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}")


  public Double getCapitalGainedUntil2006InLocalCurrency() {
    return capitalGainedUntil2006InLocalCurrency;
  }

  public void setCapitalGainedUntil2006InLocalCurrency(Double capitalGainedUntil2006InLocalCurrency) {
    this.capitalGainedUntil2006InLocalCurrency = capitalGainedUntil2006InLocalCurrency;
  }

  public SpanishMarketSimulationData withheldAmountUntil2006(Double withheldAmountUntil2006) {
    this.withheldAmountUntil2006 = withheldAmountUntil2006;
    return this;
  }

  /**
   * Withheld amount until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}
   * @return withheldAmountUntil2006
  **/
  @ApiModelProperty(value = "Withheld amount until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}")


  public Double getWithheldAmountUntil2006() {
    return withheldAmountUntil2006;
  }

  public void setWithheldAmountUntil2006(Double withheldAmountUntil2006) {
    this.withheldAmountUntil2006 = withheldAmountUntil2006;
  }

  public SpanishMarketSimulationData withheldAmountUntil2006InLocalCurrency(Double withheldAmountUntil2006InLocalCurrency) {
    this.withheldAmountUntil2006InLocalCurrency = withheldAmountUntil2006InLocalCurrency;
    return this;
  }

  /**
   * Withheld amount until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}
   * @return withheldAmountUntil2006InLocalCurrency
  **/
  @ApiModelProperty(value = "Withheld amount until 2006 expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}")


  public Double getWithheldAmountUntil2006InLocalCurrency() {
    return withheldAmountUntil2006InLocalCurrency;
  }

  public void setWithheldAmountUntil2006InLocalCurrency(Double withheldAmountUntil2006InLocalCurrency) {
    this.withheldAmountUntil2006InLocalCurrency = withheldAmountUntil2006InLocalCurrency;
  }

  public SpanishMarketSimulationData withholdingPercentageUntil2006(Double withholdingPercentageUntil2006) {
    this.withholdingPercentageUntil2006 = withholdingPercentageUntil2006;
    return this;
  }

  /**
   * Witholing percentage until 2006.
   * @return withholdingPercentageUntil2006
  **/
  @ApiModelProperty(value = "Witholing percentage until 2006.")


  public Double getWithholdingPercentageUntil2006() {
    return withholdingPercentageUntil2006;
  }

  public void setWithholdingPercentageUntil2006(Double withholdingPercentageUntil2006) {
    this.withholdingPercentageUntil2006 = withholdingPercentageUntil2006;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishMarketSimulationData spanishMarketSimulationData = (SpanishMarketSimulationData) o;
    return Objects.equals(this.capitalGainedUntil2006, spanishMarketSimulationData.capitalGainedUntil2006) &&
        Objects.equals(this.capitalGainedUntil2006InLocalCurrency, spanishMarketSimulationData.capitalGainedUntil2006InLocalCurrency) &&
        Objects.equals(this.withheldAmountUntil2006, spanishMarketSimulationData.withheldAmountUntil2006) &&
        Objects.equals(this.withheldAmountUntil2006InLocalCurrency, spanishMarketSimulationData.withheldAmountUntil2006InLocalCurrency) &&
        Objects.equals(this.withholdingPercentageUntil2006, spanishMarketSimulationData.withholdingPercentageUntil2006);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalGainedUntil2006, capitalGainedUntil2006InLocalCurrency, withheldAmountUntil2006, withheldAmountUntil2006InLocalCurrency, withholdingPercentageUntil2006);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishMarketSimulationData {\n");
    
    sb.append("    capitalGainedUntil2006: ").append(toIndentedString(capitalGainedUntil2006)).append("\n");
    sb.append("    capitalGainedUntil2006InLocalCurrency: ").append(toIndentedString(capitalGainedUntil2006InLocalCurrency)).append("\n");
    sb.append("    withheldAmountUntil2006: ").append(toIndentedString(withheldAmountUntil2006)).append("\n");
    sb.append("    withheldAmountUntil2006InLocalCurrency: ").append(toIndentedString(withheldAmountUntil2006InLocalCurrency)).append("\n");
    sb.append("    withholdingPercentageUntil2006: ").append(toIndentedString(withholdingPercentageUntil2006)).append("\n");
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

