package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Distribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Distribution   {
  @JsonProperty("cashDistribution")
  private Boolean cashDistribution = null;

  /**
   * Gets or Sets distributionCategory
   */
  public enum DistributionCategoryEnum {
    INTEREST("INTEREST"),
    
    DIVIDEND("DIVIDEND");

    private String value;

    DistributionCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DistributionCategoryEnum fromValue(String text) {
      for (DistributionCategoryEnum b : DistributionCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("distributionCategory")
  private DistributionCategoryEnum distributionCategory = null;

  @JsonProperty("distributionFrequencyCode")
  private String distributionFrequencyCode = null;

  @JsonProperty("equalisation")
  private Boolean equalisation = null;

  public Distribution cashDistribution(Boolean cashDistribution) {
    this.cashDistribution = cashDistribution;
    return this;
  }

  /**
   * Get cashDistribution
   * @return cashDistribution
  **/
  @ApiModelProperty(value = "")


  public Boolean getCashDistribution() {
    return cashDistribution;
  }

  public void setCashDistribution(Boolean cashDistribution) {
    this.cashDistribution = cashDistribution;
  }

  public Distribution distributionCategory(DistributionCategoryEnum distributionCategory) {
    this.distributionCategory = distributionCategory;
    return this;
  }

  /**
   * Get distributionCategory
   * @return distributionCategory
  **/
  @ApiModelProperty(value = "")


  public DistributionCategoryEnum getDistributionCategory() {
    return distributionCategory;
  }

  public void setDistributionCategory(DistributionCategoryEnum distributionCategory) {
    this.distributionCategory = distributionCategory;
  }

  public Distribution distributionFrequencyCode(String distributionFrequencyCode) {
    this.distributionFrequencyCode = distributionFrequencyCode;
    return this;
  }

  /**
   * Refer to {listFrequencies}
   * @return distributionFrequencyCode
  **/
  @ApiModelProperty(value = "Refer to {listFrequencies}")


  public String getDistributionFrequencyCode() {
    return distributionFrequencyCode;
  }

  public void setDistributionFrequencyCode(String distributionFrequencyCode) {
    this.distributionFrequencyCode = distributionFrequencyCode;
  }

  public Distribution equalisation(Boolean equalisation) {
    this.equalisation = equalisation;
    return this;
  }

  /**
   * An additional dividend paid to eligible stockholders when their divided income is reduced due to a change the board of directors makes to the dividend payment schedule
   * @return equalisation
  **/
  @ApiModelProperty(value = "An additional dividend paid to eligible stockholders when their divided income is reduced due to a change the board of directors makes to the dividend payment schedule")


  public Boolean getEqualisation() {
    return equalisation;
  }

  public void setEqualisation(Boolean equalisation) {
    this.equalisation = equalisation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.cashDistribution, distribution.cashDistribution) &&
        Objects.equals(this.distributionCategory, distribution.distributionCategory) &&
        Objects.equals(this.distributionFrequencyCode, distribution.distributionFrequencyCode) &&
        Objects.equals(this.equalisation, distribution.equalisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashDistribution, distributionCategory, distributionFrequencyCode, equalisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    
    sb.append("    cashDistribution: ").append(toIndentedString(cashDistribution)).append("\n");
    sb.append("    distributionCategory: ").append(toIndentedString(distributionCategory)).append("\n");
    sb.append("    distributionFrequencyCode: ").append(toIndentedString(distributionFrequencyCode)).append("\n");
    sb.append("    equalisation: ").append(toIndentedString(equalisation)).append("\n");
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

