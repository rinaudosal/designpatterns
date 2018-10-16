package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Characteristics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Characteristics   {
  @JsonProperty("annualizedReturnVolatility")
  private Double annualizedReturnVolatility = null;

  @JsonProperty("bondsWeight")
  private Double bondsWeight = null;

  @JsonProperty("durationBonds")
  private Double durationBonds = null;

  public Characteristics annualizedReturnVolatility(Double annualizedReturnVolatility) {
    this.annualizedReturnVolatility = annualizedReturnVolatility;
    return this;
  }

  /**
   * Annualized daily volatility of the fund / portfolio based on the last 250 trading days or, if valuation frequency is lower than daily, the volatility is based on the valuation frequency and annualized.
   * @return annualizedReturnVolatility
  **/
  @ApiModelProperty(value = "Annualized daily volatility of the fund / portfolio based on the last 250 trading days or, if valuation frequency is lower than daily, the volatility is based on the valuation frequency and annualized.")


  public Double getAnnualizedReturnVolatility() {
    return annualizedReturnVolatility;
  }

  public void setAnnualizedReturnVolatility(Double annualizedReturnVolatility) {
    this.annualizedReturnVolatility = annualizedReturnVolatility;
  }

  public Characteristics bondsWeight(Double bondsWeight) {
    this.bondsWeight = bondsWeight;
    return this;
  }

  /**
   * Proportion (weight) of bonds and bonds futures within the fund/portfolio measured in percentage of market value.
   * @return bondsWeight
  **/
  @ApiModelProperty(value = "Proportion (weight) of bonds and bonds futures within the fund/portfolio measured in percentage of market value.")


  public Double getBondsWeight() {
    return bondsWeight;
  }

  public void setBondsWeight(Double bondsWeight) {
    this.bondsWeight = bondsWeight;
  }

  public Characteristics durationBonds(Double durationBonds) {
    this.durationBonds = durationBonds;
    return this;
  }

  /**
   * Asset prices weighted Macaulay-Duration in years of the fund / portfolio
   * @return durationBonds
  **/
  @ApiModelProperty(value = "Asset prices weighted Macaulay-Duration in years of the fund / portfolio")


  public Double getDurationBonds() {
    return durationBonds;
  }

  public void setDurationBonds(Double durationBonds) {
    this.durationBonds = durationBonds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Characteristics characteristics = (Characteristics) o;
    return Objects.equals(this.annualizedReturnVolatility, characteristics.annualizedReturnVolatility) &&
        Objects.equals(this.bondsWeight, characteristics.bondsWeight) &&
        Objects.equals(this.durationBonds, characteristics.durationBonds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualizedReturnVolatility, bondsWeight, durationBonds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Characteristics {\n");
    
    sb.append("    annualizedReturnVolatility: ").append(toIndentedString(annualizedReturnVolatility)).append("\n");
    sb.append("    bondsWeight: ").append(toIndentedString(bondsWeight)).append("\n");
    sb.append("    durationBonds: ").append(toIndentedString(durationBonds)).append("\n");
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

