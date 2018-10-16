package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeyValue;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundClassificationFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundClassificationFilter   {
  @JsonProperty("classificationKeyValues")
  @Valid
  private List<KeyValue> classificationKeyValues = null;

  @JsonProperty("euSavingDirectiveCode")
  private String euSavingDirectiveCode = null;

  @JsonProperty("marketRegistrationKeyValues")
  @Valid
  private List<KeyValue> marketRegistrationKeyValues = null;

  @JsonProperty("whiteassimilated")
  private NumberComparisonFilter whiteassimilated = null;

  @JsonProperty("whiteassimilatedAnt")
  private NumberComparisonFilter whiteassimilatedAnt = null;

  public FundClassificationFilter classificationKeyValues(List<KeyValue> classificationKeyValues) {
    this.classificationKeyValues = classificationKeyValues;
    return this;
  }

  public FundClassificationFilter addClassificationKeyValuesItem(KeyValue classificationKeyValuesItem) {
    if (this.classificationKeyValues == null) {
      this.classificationKeyValues = new ArrayList<>();
    }
    this.classificationKeyValues.add(classificationKeyValuesItem);
    return this;
  }

  /**
   * Refers to the codes given {listFundClassifications} 
   * @return classificationKeyValues
  **/
  @ApiModelProperty(value = "Refers to the codes given {listFundClassifications} ")

  @Valid

  public List<KeyValue> getClassificationKeyValues() {
    return classificationKeyValues;
  }

  public void setClassificationKeyValues(List<KeyValue> classificationKeyValues) {
    this.classificationKeyValues = classificationKeyValues;
  }

  public FundClassificationFilter euSavingDirectiveCode(String euSavingDirectiveCode) {
    this.euSavingDirectiveCode = euSavingDirectiveCode;
    return this;
  }

  /**
   * Refers to {listEuropeanFundClassifications}
   * @return euSavingDirectiveCode
  **/
  @ApiModelProperty(value = "Refers to {listEuropeanFundClassifications}")


  public String getEuSavingDirectiveCode() {
    return euSavingDirectiveCode;
  }

  public void setEuSavingDirectiveCode(String euSavingDirectiveCode) {
    this.euSavingDirectiveCode = euSavingDirectiveCode;
  }

  public FundClassificationFilter marketRegistrationKeyValues(List<KeyValue> marketRegistrationKeyValues) {
    this.marketRegistrationKeyValues = marketRegistrationKeyValues;
    return this;
  }

  public FundClassificationFilter addMarketRegistrationKeyValuesItem(KeyValue marketRegistrationKeyValuesItem) {
    if (this.marketRegistrationKeyValues == null) {
      this.marketRegistrationKeyValues = new ArrayList<>();
    }
    this.marketRegistrationKeyValues.add(marketRegistrationKeyValuesItem);
    return this;
  }

  /**
   * Refers to the codes given {listMarketRegistrations} 
   * @return marketRegistrationKeyValues
  **/
  @ApiModelProperty(value = "Refers to the codes given {listMarketRegistrations} ")

  @Valid

  public List<KeyValue> getMarketRegistrationKeyValues() {
    return marketRegistrationKeyValues;
  }

  public void setMarketRegistrationKeyValues(List<KeyValue> marketRegistrationKeyValues) {
    this.marketRegistrationKeyValues = marketRegistrationKeyValues;
  }

  public FundClassificationFilter whiteassimilated(NumberComparisonFilter whiteassimilated) {
    this.whiteassimilated = whiteassimilated;
    return this;
  }

  /**
   * Get whiteassimilated
   * @return whiteassimilated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getWhiteassimilated() {
    return whiteassimilated;
  }

  public void setWhiteassimilated(NumberComparisonFilter whiteassimilated) {
    this.whiteassimilated = whiteassimilated;
  }

  public FundClassificationFilter whiteassimilatedAnt(NumberComparisonFilter whiteassimilatedAnt) {
    this.whiteassimilatedAnt = whiteassimilatedAnt;
    return this;
  }

  /**
   * Get whiteassimilatedAnt
   * @return whiteassimilatedAnt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getWhiteassimilatedAnt() {
    return whiteassimilatedAnt;
  }

  public void setWhiteassimilatedAnt(NumberComparisonFilter whiteassimilatedAnt) {
    this.whiteassimilatedAnt = whiteassimilatedAnt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundClassificationFilter fundClassificationFilter = (FundClassificationFilter) o;
    return Objects.equals(this.classificationKeyValues, fundClassificationFilter.classificationKeyValues) &&
        Objects.equals(this.euSavingDirectiveCode, fundClassificationFilter.euSavingDirectiveCode) &&
        Objects.equals(this.marketRegistrationKeyValues, fundClassificationFilter.marketRegistrationKeyValues) &&
        Objects.equals(this.whiteassimilated, fundClassificationFilter.whiteassimilated) &&
        Objects.equals(this.whiteassimilatedAnt, fundClassificationFilter.whiteassimilatedAnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationKeyValues, euSavingDirectiveCode, marketRegistrationKeyValues, whiteassimilated, whiteassimilatedAnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundClassificationFilter {\n");
    
    sb.append("    classificationKeyValues: ").append(toIndentedString(classificationKeyValues)).append("\n");
    sb.append("    euSavingDirectiveCode: ").append(toIndentedString(euSavingDirectiveCode)).append("\n");
    sb.append("    marketRegistrationKeyValues: ").append(toIndentedString(marketRegistrationKeyValues)).append("\n");
    sb.append("    whiteassimilated: ").append(toIndentedString(whiteassimilated)).append("\n");
    sb.append("    whiteassimilatedAnt: ").append(toIndentedString(whiteassimilatedAnt)).append("\n");
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

