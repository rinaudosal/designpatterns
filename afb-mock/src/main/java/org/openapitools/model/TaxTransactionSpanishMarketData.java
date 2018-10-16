package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about data related to Spanish Market.
 */
@ApiModel(description = "This object keeps specific information about data related to Spanish Market.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TaxTransactionSpanishMarketData   {
  @JsonProperty("valuationUntil2005")
  private Double valuationUntil2005 = null;

  @JsonProperty("valuationUntil2006")
  private Double valuationUntil2006 = null;

  public TaxTransactionSpanishMarketData valuationUntil2005(Double valuationUntil2005) {
    this.valuationUntil2005 = valuationUntil2005;
    return this;
  }

  /**
   * Defines the amount of the valuation until December 31th 2005, expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}
   * @return valuationUntil2005
  **/
  @ApiModelProperty(value = "Defines the amount of the valuation until December 31th 2005, expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}")


  public Double getValuationUntil2005() {
    return valuationUntil2005;
  }

  public void setValuationUntil2005(Double valuationUntil2005) {
    this.valuationUntil2005 = valuationUntil2005;
  }

  public TaxTransactionSpanishMarketData valuationUntil2006(Double valuationUntil2006) {
    this.valuationUntil2006 = valuationUntil2006;
    return this;
  }

  /**
   * Defines the amount of the valuation until December 31th 2006, expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}
   * @return valuationUntil2006
  **/
  @ApiModelProperty(value = "Defines the amount of the valuation until December 31th 2006, expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}")


  public Double getValuationUntil2006() {
    return valuationUntil2006;
  }

  public void setValuationUntil2006(Double valuationUntil2006) {
    this.valuationUntil2006 = valuationUntil2006;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxTransactionSpanishMarketData taxTransactionSpanishMarketData = (TaxTransactionSpanishMarketData) o;
    return Objects.equals(this.valuationUntil2005, taxTransactionSpanishMarketData.valuationUntil2005) &&
        Objects.equals(this.valuationUntil2006, taxTransactionSpanishMarketData.valuationUntil2006);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valuationUntil2005, valuationUntil2006);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTransactionSpanishMarketData {\n");
    
    sb.append("    valuationUntil2005: ").append(toIndentedString(valuationUntil2005)).append("\n");
    sb.append("    valuationUntil2006: ").append(toIndentedString(valuationUntil2006)).append("\n");
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

