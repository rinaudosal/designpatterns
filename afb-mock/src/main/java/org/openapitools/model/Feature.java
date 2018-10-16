package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Feature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Feature   {
  @JsonProperty("featureTypeCode")
  private String featureTypeCode = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("maximum")
  private Double maximum = null;

  @JsonProperty("minimum")
  private Double minimum = null;

  @JsonProperty("valueCode")
  private String valueCode = null;

  public Feature featureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
    return this;
  }

  /**
   * The feature of InvestmentLimit. Refer to {listInvestmentLimitFeaturesByDistributor}
   * @return featureTypeCode
  **/
  @ApiModelProperty(value = "The feature of InvestmentLimit. Refer to {listInvestmentLimitFeaturesByDistributor}")


  public String getFeatureTypeCode() {
    return featureTypeCode;
  }

  public void setFeatureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
  }

  public Feature id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {Feature}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {Feature}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Feature maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The Maximun of the {Feature}
   * @return maximum
  **/
  @ApiModelProperty(value = "The Maximun of the {Feature}")


  public Double getMaximum() {
    return maximum;
  }

  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }

  public Feature minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * The Minimum of the {Feature}
   * @return minimum
  **/
  @ApiModelProperty(value = "The Minimum of the {Feature}")


  public Double getMinimum() {
    return minimum;
  }

  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }

  public Feature valueCode(String valueCode) {
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
    Feature feature = (Feature) o;
    return Objects.equals(this.featureTypeCode, feature.featureTypeCode) &&
        Objects.equals(this.id, feature.id) &&
        Objects.equals(this.maximum, feature.maximum) &&
        Objects.equals(this.minimum, feature.minimum) &&
        Objects.equals(this.valueCode, feature.valueCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureTypeCode, id, maximum, minimum, valueCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    featureTypeCode: ").append(toIndentedString(featureTypeCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
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

