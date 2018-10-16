package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FiscalSimulationBasicData;
import org.openapitools.model.SpanishMarketSimulationData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object used to obtain the results of a fiscal simulation.
 */
@ApiModel(description = "Object used to obtain the results of a fiscal simulation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FiscalSimulation   {
  @JsonProperty("basicData")
  private FiscalSimulationBasicData basicData = null;

  @JsonProperty("spanishMarketSimulationData")
  private SpanishMarketSimulationData spanishMarketSimulationData = null;

  @JsonProperty("withheldAmount")
  private Double withheldAmount = null;

  @JsonProperty("withheldAmountInLocalCurrency")
  private Double withheldAmountInLocalCurrency = null;

  public FiscalSimulation basicData(FiscalSimulationBasicData basicData) {
    this.basicData = basicData;
    return this;
  }

  /**
   * Get basicData
   * @return basicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FiscalSimulationBasicData getBasicData() {
    return basicData;
  }

  public void setBasicData(FiscalSimulationBasicData basicData) {
    this.basicData = basicData;
  }

  public FiscalSimulation spanishMarketSimulationData(SpanishMarketSimulationData spanishMarketSimulationData) {
    this.spanishMarketSimulationData = spanishMarketSimulationData;
    return this;
  }

  /**
   * Get spanishMarketSimulationData
   * @return spanishMarketSimulationData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishMarketSimulationData getSpanishMarketSimulationData() {
    return spanishMarketSimulationData;
  }

  public void setSpanishMarketSimulationData(SpanishMarketSimulationData spanishMarketSimulationData) {
    this.spanishMarketSimulationData = spanishMarketSimulationData;
  }

  public FiscalSimulation withheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
    return this;
  }

  /**
   * The withheld amount obtained as a result of the simulation. Expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}
   * @return withheldAmount
  **/
  @ApiModelProperty(value = "The withheld amount obtained as a result of the simulation. Expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}")


  public Double getWithheldAmount() {
    return withheldAmount;
  }

  public void setWithheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
  }

  public FiscalSimulation withheldAmountInLocalCurrency(Double withheldAmountInLocalCurrency) {
    this.withheldAmountInLocalCurrency = withheldAmountInLocalCurrency;
    return this;
  }

  /**
   * The withheld amount obtained as a result of the simulation. Expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}
   * @return withheldAmountInLocalCurrency
  **/
  @ApiModelProperty(value = "The withheld amount obtained as a result of the simulation. Expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}")


  public Double getWithheldAmountInLocalCurrency() {
    return withheldAmountInLocalCurrency;
  }

  public void setWithheldAmountInLocalCurrency(Double withheldAmountInLocalCurrency) {
    this.withheldAmountInLocalCurrency = withheldAmountInLocalCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalSimulation fiscalSimulation = (FiscalSimulation) o;
    return Objects.equals(this.basicData, fiscalSimulation.basicData) &&
        Objects.equals(this.spanishMarketSimulationData, fiscalSimulation.spanishMarketSimulationData) &&
        Objects.equals(this.withheldAmount, fiscalSimulation.withheldAmount) &&
        Objects.equals(this.withheldAmountInLocalCurrency, fiscalSimulation.withheldAmountInLocalCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicData, spanishMarketSimulationData, withheldAmount, withheldAmountInLocalCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalSimulation {\n");
    
    sb.append("    basicData: ").append(toIndentedString(basicData)).append("\n");
    sb.append("    spanishMarketSimulationData: ").append(toIndentedString(spanishMarketSimulationData)).append("\n");
    sb.append("    withheldAmount: ").append(toIndentedString(withheldAmount)).append("\n");
    sb.append("    withheldAmountInLocalCurrency: ").append(toIndentedString(withheldAmountInLocalCurrency)).append("\n");
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

