package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object used to keep the common data of the results of a fiscal simulation
 */
@ApiModel(description = "Object used to keep the common data of the results of a fiscal simulation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FiscalSimulationBasicData   {
  @JsonProperty("capitalGained")
  private Double capitalGained = null;

  @JsonProperty("capitalGainedInLocalCurrency")
  private Double capitalGainedInLocalCurrency = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("localCurrencyCode")
  private String localCurrencyCode = null;

  @JsonProperty("withholdingPercentage")
  private Double withholdingPercentage = null;

  public FiscalSimulationBasicData capitalGained(Double capitalGained) {
    this.capitalGained = capitalGained;
    return this;
  }

  /**
   * The total capital gained expressed in {FiscalSimulationBasicData.currencyCode}
   * @return capitalGained
  **/
  @ApiModelProperty(value = "The total capital gained expressed in {FiscalSimulationBasicData.currencyCode}")


  public Double getCapitalGained() {
    return capitalGained;
  }

  public void setCapitalGained(Double capitalGained) {
    this.capitalGained = capitalGained;
  }

  public FiscalSimulationBasicData capitalGainedInLocalCurrency(Double capitalGainedInLocalCurrency) {
    this.capitalGainedInLocalCurrency = capitalGainedInLocalCurrency;
    return this;
  }

  /**
   * he total capital gained expressed in {FiscalSimulationBasicData.localCurrencyCode}
   * @return capitalGainedInLocalCurrency
  **/
  @ApiModelProperty(value = "he total capital gained expressed in {FiscalSimulationBasicData.localCurrencyCode}")


  public Double getCapitalGainedInLocalCurrency() {
    return capitalGainedInLocalCurrency;
  }

  public void setCapitalGainedInLocalCurrency(Double capitalGainedInLocalCurrency) {
    this.capitalGainedInLocalCurrency = capitalGainedInLocalCurrency;
  }

  public FiscalSimulationBasicData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency code of the simulation. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency code of the simulation. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public FiscalSimulationBasicData distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public FiscalSimulationBasicData localCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
    return this;
  }

  /**
   * The local currency code of the simulation. Refer to {listCurrencies}
   * @return localCurrencyCode
  **/
  @ApiModelProperty(value = "The local currency code of the simulation. Refer to {listCurrencies}")


  public String getLocalCurrencyCode() {
    return localCurrencyCode;
  }

  public void setLocalCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
  }

  public FiscalSimulationBasicData withholdingPercentage(Double withholdingPercentage) {
    this.withholdingPercentage = withholdingPercentage;
    return this;
  }

  /**
   * The withholdingPercentage obtained as a result of the simulation
   * @return withholdingPercentage
  **/
  @ApiModelProperty(value = "The withholdingPercentage obtained as a result of the simulation")


  public Double getWithholdingPercentage() {
    return withholdingPercentage;
  }

  public void setWithholdingPercentage(Double withholdingPercentage) {
    this.withholdingPercentage = withholdingPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalSimulationBasicData fiscalSimulationBasicData = (FiscalSimulationBasicData) o;
    return Objects.equals(this.capitalGained, fiscalSimulationBasicData.capitalGained) &&
        Objects.equals(this.capitalGainedInLocalCurrency, fiscalSimulationBasicData.capitalGainedInLocalCurrency) &&
        Objects.equals(this.currencyCode, fiscalSimulationBasicData.currencyCode) &&
        Objects.equals(this.distributorId, fiscalSimulationBasicData.distributorId) &&
        Objects.equals(this.localCurrencyCode, fiscalSimulationBasicData.localCurrencyCode) &&
        Objects.equals(this.withholdingPercentage, fiscalSimulationBasicData.withholdingPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalGained, capitalGainedInLocalCurrency, currencyCode, distributorId, localCurrencyCode, withholdingPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalSimulationBasicData {\n");
    
    sb.append("    capitalGained: ").append(toIndentedString(capitalGained)).append("\n");
    sb.append("    capitalGainedInLocalCurrency: ").append(toIndentedString(capitalGainedInLocalCurrency)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    localCurrencyCode: ").append(toIndentedString(localCurrencyCode)).append("\n");
    sb.append("    withholdingPercentage: ").append(toIndentedString(withholdingPercentage)).append("\n");
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

