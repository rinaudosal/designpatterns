package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FundCharacteristicsFilter;
import org.openapitools.model.FundClassificationFilter;
import org.openapitools.model.FundRangeFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundDetailsSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundDetailsSearchFilter   {
  @JsonProperty("fundCharacteristics")
  private FundCharacteristicsFilter fundCharacteristics = null;

  @JsonProperty("fundClassification")
  private FundClassificationFilter fundClassification = null;

  @JsonProperty("fundRange")
  private FundRangeFilter fundRange = null;

  public FundDetailsSearchFilter fundCharacteristics(FundCharacteristicsFilter fundCharacteristics) {
    this.fundCharacteristics = fundCharacteristics;
    return this;
  }

  /**
   * Get fundCharacteristics
   * @return fundCharacteristics
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundCharacteristicsFilter getFundCharacteristics() {
    return fundCharacteristics;
  }

  public void setFundCharacteristics(FundCharacteristicsFilter fundCharacteristics) {
    this.fundCharacteristics = fundCharacteristics;
  }

  public FundDetailsSearchFilter fundClassification(FundClassificationFilter fundClassification) {
    this.fundClassification = fundClassification;
    return this;
  }

  /**
   * Get fundClassification
   * @return fundClassification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundClassificationFilter getFundClassification() {
    return fundClassification;
  }

  public void setFundClassification(FundClassificationFilter fundClassification) {
    this.fundClassification = fundClassification;
  }

  public FundDetailsSearchFilter fundRange(FundRangeFilter fundRange) {
    this.fundRange = fundRange;
    return this;
  }

  /**
   * Get fundRange
   * @return fundRange
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundRangeFilter getFundRange() {
    return fundRange;
  }

  public void setFundRange(FundRangeFilter fundRange) {
    this.fundRange = fundRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundDetailsSearchFilter fundDetailsSearchFilter = (FundDetailsSearchFilter) o;
    return Objects.equals(this.fundCharacteristics, fundDetailsSearchFilter.fundCharacteristics) &&
        Objects.equals(this.fundClassification, fundDetailsSearchFilter.fundClassification) &&
        Objects.equals(this.fundRange, fundDetailsSearchFilter.fundRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundCharacteristics, fundClassification, fundRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundDetailsSearchFilter {\n");
    
    sb.append("    fundCharacteristics: ").append(toIndentedString(fundCharacteristics)).append("\n");
    sb.append("    fundClassification: ").append(toIndentedString(fundClassification)).append("\n");
    sb.append("    fundRange: ").append(toIndentedString(fundRange)).append("\n");
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

