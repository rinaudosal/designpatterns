package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CostsAndCharges;
import org.openapitools.model.DistributionStrategy;
import org.openapitools.model.GeneralFinancialInstrumentInformation;
import org.openapitools.model.TargetMarkets;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mifid2Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Mifid2Data   {
  @JsonProperty("costsAndCharges")
  private CostsAndCharges costsAndCharges = null;

  @JsonProperty("distributionStrategy")
  private DistributionStrategy distributionStrategy = null;

  @JsonProperty("generalFinancialInstrumentInformation")
  private GeneralFinancialInstrumentInformation generalFinancialInstrumentInformation = null;

  @JsonProperty("targetMarkets")
  private TargetMarkets targetMarkets = null;

  public Mifid2Data costsAndCharges(CostsAndCharges costsAndCharges) {
    this.costsAndCharges = costsAndCharges;
    return this;
  }

  /**
   * Get costsAndCharges
   * @return costsAndCharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CostsAndCharges getCostsAndCharges() {
    return costsAndCharges;
  }

  public void setCostsAndCharges(CostsAndCharges costsAndCharges) {
    this.costsAndCharges = costsAndCharges;
  }

  public Mifid2Data distributionStrategy(DistributionStrategy distributionStrategy) {
    this.distributionStrategy = distributionStrategy;
    return this;
  }

  /**
   * Get distributionStrategy
   * @return distributionStrategy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DistributionStrategy getDistributionStrategy() {
    return distributionStrategy;
  }

  public void setDistributionStrategy(DistributionStrategy distributionStrategy) {
    this.distributionStrategy = distributionStrategy;
  }

  public Mifid2Data generalFinancialInstrumentInformation(GeneralFinancialInstrumentInformation generalFinancialInstrumentInformation) {
    this.generalFinancialInstrumentInformation = generalFinancialInstrumentInformation;
    return this;
  }

  /**
   * Get generalFinancialInstrumentInformation
   * @return generalFinancialInstrumentInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GeneralFinancialInstrumentInformation getGeneralFinancialInstrumentInformation() {
    return generalFinancialInstrumentInformation;
  }

  public void setGeneralFinancialInstrumentInformation(GeneralFinancialInstrumentInformation generalFinancialInstrumentInformation) {
    this.generalFinancialInstrumentInformation = generalFinancialInstrumentInformation;
  }

  public Mifid2Data targetMarkets(TargetMarkets targetMarkets) {
    this.targetMarkets = targetMarkets;
    return this;
  }

  /**
   * Get targetMarkets
   * @return targetMarkets
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TargetMarkets getTargetMarkets() {
    return targetMarkets;
  }

  public void setTargetMarkets(TargetMarkets targetMarkets) {
    this.targetMarkets = targetMarkets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mifid2Data mifid2Data = (Mifid2Data) o;
    return Objects.equals(this.costsAndCharges, mifid2Data.costsAndCharges) &&
        Objects.equals(this.distributionStrategy, mifid2Data.distributionStrategy) &&
        Objects.equals(this.generalFinancialInstrumentInformation, mifid2Data.generalFinancialInstrumentInformation) &&
        Objects.equals(this.targetMarkets, mifid2Data.targetMarkets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costsAndCharges, distributionStrategy, generalFinancialInstrumentInformation, targetMarkets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mifid2Data {\n");
    
    sb.append("    costsAndCharges: ").append(toIndentedString(costsAndCharges)).append("\n");
    sb.append("    distributionStrategy: ").append(toIndentedString(distributionStrategy)).append("\n");
    sb.append("    generalFinancialInstrumentInformation: ").append(toIndentedString(generalFinancialInstrumentInformation)).append("\n");
    sb.append("    targetMarkets: ").append(toIndentedString(targetMarkets)).append("\n");
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

