package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about fees applied to an {OperationalPortfolioMovement}. They are all expressed in {OperationalPortfolioMovement.currencyCode}
 */
@ApiModel(description = "This object keeps specific information about fees applied to an {OperationalPortfolioMovement}. They are all expressed in {OperationalPortfolioMovement.currencyCode}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioMovementFeeData   {
  @JsonProperty("firstMovementFeeAmount")
  private Double firstMovementFeeAmount = null;

  @JsonProperty("firstMovementFeePercentage")
  private Double firstMovementFeePercentage = null;

  @JsonProperty("secondMovementFeeAmount")
  private Double secondMovementFeeAmount = null;

  @JsonProperty("secondMovementFeePercentage")
  private Double secondMovementFeePercentage = null;

  public OperationalPortfolioMovementFeeData firstMovementFeeAmount(Double firstMovementFeeAmount) {
    this.firstMovementFeeAmount = firstMovementFeeAmount;
    return this;
  }

  /**
   * The amount of the first group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}
   * @return firstMovementFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the first group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}")


  public Double getFirstMovementFeeAmount() {
    return firstMovementFeeAmount;
  }

  public void setFirstMovementFeeAmount(Double firstMovementFeeAmount) {
    this.firstMovementFeeAmount = firstMovementFeeAmount;
  }

  public OperationalPortfolioMovementFeeData firstMovementFeePercentage(Double firstMovementFeePercentage) {
    this.firstMovementFeePercentage = firstMovementFeePercentage;
    return this;
  }

  /**
   * The percentage of the first group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}
   * @return firstMovementFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the first group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}")


  public Double getFirstMovementFeePercentage() {
    return firstMovementFeePercentage;
  }

  public void setFirstMovementFeePercentage(Double firstMovementFeePercentage) {
    this.firstMovementFeePercentage = firstMovementFeePercentage;
  }

  public OperationalPortfolioMovementFeeData secondMovementFeeAmount(Double secondMovementFeeAmount) {
    this.secondMovementFeeAmount = secondMovementFeeAmount;
    return this;
  }

  /**
   * The amount of the second group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}
   * @return secondMovementFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the second group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}")


  public Double getSecondMovementFeeAmount() {
    return secondMovementFeeAmount;
  }

  public void setSecondMovementFeeAmount(Double secondMovementFeeAmount) {
    this.secondMovementFeeAmount = secondMovementFeeAmount;
  }

  public OperationalPortfolioMovementFeeData secondMovementFeePercentage(Double secondMovementFeePercentage) {
    this.secondMovementFeePercentage = secondMovementFeePercentage;
    return this;
  }

  /**
   * The percentage of the second group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}
   * @return secondMovementFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the second group of commission applied to the {OperationalPortfolioMovement} by the {Distributor}")


  public Double getSecondMovementFeePercentage() {
    return secondMovementFeePercentage;
  }

  public void setSecondMovementFeePercentage(Double secondMovementFeePercentage) {
    this.secondMovementFeePercentage = secondMovementFeePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioMovementFeeData operationalPortfolioMovementFeeData = (OperationalPortfolioMovementFeeData) o;
    return Objects.equals(this.firstMovementFeeAmount, operationalPortfolioMovementFeeData.firstMovementFeeAmount) &&
        Objects.equals(this.firstMovementFeePercentage, operationalPortfolioMovementFeeData.firstMovementFeePercentage) &&
        Objects.equals(this.secondMovementFeeAmount, operationalPortfolioMovementFeeData.secondMovementFeeAmount) &&
        Objects.equals(this.secondMovementFeePercentage, operationalPortfolioMovementFeeData.secondMovementFeePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstMovementFeeAmount, firstMovementFeePercentage, secondMovementFeeAmount, secondMovementFeePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioMovementFeeData {\n");
    
    sb.append("    firstMovementFeeAmount: ").append(toIndentedString(firstMovementFeeAmount)).append("\n");
    sb.append("    firstMovementFeePercentage: ").append(toIndentedString(firstMovementFeePercentage)).append("\n");
    sb.append("    secondMovementFeeAmount: ").append(toIndentedString(secondMovementFeeAmount)).append("\n");
    sb.append("    secondMovementFeePercentage: ").append(toIndentedString(secondMovementFeePercentage)).append("\n");
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

