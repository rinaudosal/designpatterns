package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingInstrumentNotificationFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingInstrumentNotificationFilter   {
  @JsonProperty("featureId")
  private Long featureId = null;

  @JsonProperty("investmentLimitId")
  private Long investmentLimitId = null;

  @JsonProperty("valueCode")
  private String valueCode = null;

  public DealingInstrumentNotificationFilter featureId(Long featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * The Id of the {Feature}
   * @return featureId
  **/
  @ApiModelProperty(value = "The Id of the {Feature}")


  public Long getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Long featureId) {
    this.featureId = featureId;
  }

  public DealingInstrumentNotificationFilter investmentLimitId(Long investmentLimitId) {
    this.investmentLimitId = investmentLimitId;
    return this;
  }

  /**
   * The Id of the {InvestmentLimit}
   * @return investmentLimitId
  **/
  @ApiModelProperty(value = "The Id of the {InvestmentLimit}")


  public Long getInvestmentLimitId() {
    return investmentLimitId;
  }

  public void setInvestmentLimitId(Long investmentLimitId) {
    this.investmentLimitId = investmentLimitId;
  }

  public DealingInstrumentNotificationFilter valueCode(String valueCode) {
    this.valueCode = valueCode;
    return this;
  }

  /**
   * The Value of the {Feature}. Refer to {listAfbGeographicalAreas}, {listAfbAssets}, \\n\\ {listCurrencies}, {listCountries}, {listCreditQualities}, {listSectors}.
   * @return valueCode
  **/
  @ApiModelProperty(value = "The Value of the {Feature}. Refer to {listAfbGeographicalAreas}, {listAfbAssets}, \\n\\ {listCurrencies}, {listCountries}, {listCreditQualities}, {listSectors}.")


  public String getValueCode() {
    return valueCode;
  }

  public void setValueCode(String valueCode) {
    this.valueCode = valueCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealingInstrumentNotificationFilter dealingInstrumentNotificationFilter = (DealingInstrumentNotificationFilter) o;
    return Objects.equals(this.featureId, dealingInstrumentNotificationFilter.featureId) &&
        Objects.equals(this.investmentLimitId, dealingInstrumentNotificationFilter.investmentLimitId) &&
        Objects.equals(this.valueCode, dealingInstrumentNotificationFilter.valueCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureId, investmentLimitId, valueCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingInstrumentNotificationFilter {\n");
    
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    investmentLimitId: ").append(toIndentedString(investmentLimitId)).append("\n");
    sb.append("    valueCode: ").append(toIndentedString(valueCode)).append("\n");
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

