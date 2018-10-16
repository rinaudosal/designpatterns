package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains data about catipal gained associated with the {Transaction.transactionCapitalGainedData} that originated the {Settlement}
 */
@ApiModel(description = "Contains data about catipal gained associated with the {Transaction.transactionCapitalGainedData} that originated the {Settlement}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementCapitalGainedData   {
  @JsonProperty("capitalGained")
  private Double capitalGained = null;

  @JsonProperty("capitalGainedInLocalCurrency")
  private Double capitalGainedInLocalCurrency = null;

  public SettlementCapitalGainedData capitalGained(Double capitalGained) {
    this.capitalGained = capitalGained;
    return this;
  }

  /**
   * Capital gained expressed in the {Settlement}'s {SettlementBasicData.currencyCode}
   * @return capitalGained
  **/
  @ApiModelProperty(value = "Capital gained expressed in the {Settlement}'s {SettlementBasicData.currencyCode}")


  public Double getCapitalGained() {
    return capitalGained;
  }

  public void setCapitalGained(Double capitalGained) {
    this.capitalGained = capitalGained;
  }

  public SettlementCapitalGainedData capitalGainedInLocalCurrency(Double capitalGainedInLocalCurrency) {
    this.capitalGainedInLocalCurrency = capitalGainedInLocalCurrency;
    return this;
  }

  /**
   * Capital gained expressed in {Settlement}'s {SettlementBasicData.localCurrencyCode}
   * @return capitalGainedInLocalCurrency
  **/
  @ApiModelProperty(value = "Capital gained expressed in {Settlement}'s {SettlementBasicData.localCurrencyCode}")


  public Double getCapitalGainedInLocalCurrency() {
    return capitalGainedInLocalCurrency;
  }

  public void setCapitalGainedInLocalCurrency(Double capitalGainedInLocalCurrency) {
    this.capitalGainedInLocalCurrency = capitalGainedInLocalCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementCapitalGainedData settlementCapitalGainedData = (SettlementCapitalGainedData) o;
    return Objects.equals(this.capitalGained, settlementCapitalGainedData.capitalGained) &&
        Objects.equals(this.capitalGainedInLocalCurrency, settlementCapitalGainedData.capitalGainedInLocalCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalGained, capitalGainedInLocalCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementCapitalGainedData {\n");
    
    sb.append("    capitalGained: ").append(toIndentedString(capitalGained)).append("\n");
    sb.append("    capitalGainedInLocalCurrency: ").append(toIndentedString(capitalGainedInLocalCurrency)).append("\n");
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

