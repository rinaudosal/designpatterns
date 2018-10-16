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
 * AdditionalInformationForCapitalPreservation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AdditionalInformationForCapitalPreservation   {
  @JsonProperty("capitalPreservationLevel")
  private Double capitalPreservationLevel = null;

  /**
   * Identifies if a capital preservation method is used (Y) or not (N).
   */
  public enum ExistingCapitalPreservationEnum {
    Y("Y"),
    
    N("N");

    private String value;

    ExistingCapitalPreservationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExistingCapitalPreservationEnum fromValue(String text) {
      for (ExistingCapitalPreservationEnum b : ExistingCapitalPreservationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("existingCapitalPreservation")
  private ExistingCapitalPreservationEnum existingCapitalPreservation = null;

  @JsonProperty("multiplierPi")
  private Double multiplierPi = null;

  @JsonProperty("timeIntervalMaximumLoss")
  private String timeIntervalMaximumLoss = null;

  /**
   * Identifies if PI (Portfolio Insurance including CPPI Constant Proportion Portfolio Insurance)  is used (Y) or not (N) for capital preservation.
   */
  public enum UsesPiEnum {
    Y("Y"),
    
    N("N");

    private String value;

    UsesPiEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UsesPiEnum fromValue(String text) {
      for (UsesPiEnum b : UsesPiEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("usesPi")
  private UsesPiEnum usesPi = null;

  public AdditionalInformationForCapitalPreservation capitalPreservationLevel(Double capitalPreservationLevel) {
    this.capitalPreservationLevel = capitalPreservationLevel;
    return this;
  }

  /**
   * 100% minus the maximum possible loss in percentage of its market value.
   * @return capitalPreservationLevel
  **/
  @ApiModelProperty(value = "100% minus the maximum possible loss in percentage of its market value.")


  public Double getCapitalPreservationLevel() {
    return capitalPreservationLevel;
  }

  public void setCapitalPreservationLevel(Double capitalPreservationLevel) {
    this.capitalPreservationLevel = capitalPreservationLevel;
  }

  public AdditionalInformationForCapitalPreservation existingCapitalPreservation(ExistingCapitalPreservationEnum existingCapitalPreservation) {
    this.existingCapitalPreservation = existingCapitalPreservation;
    return this;
  }

  /**
   * Identifies if a capital preservation method is used (Y) or not (N).
   * @return existingCapitalPreservation
  **/
  @ApiModelProperty(value = "Identifies if a capital preservation method is used (Y) or not (N).")


  public ExistingCapitalPreservationEnum getExistingCapitalPreservation() {
    return existingCapitalPreservation;
  }

  public void setExistingCapitalPreservation(ExistingCapitalPreservationEnum existingCapitalPreservation) {
    this.existingCapitalPreservation = existingCapitalPreservation;
  }

  public AdditionalInformationForCapitalPreservation multiplierPi(Double multiplierPi) {
    this.multiplierPi = multiplierPi;
    return this;
  }

  /**
   * Gives the maximum multiplier value if PI algorithm is used.
   * @return multiplierPi
  **/
  @ApiModelProperty(value = "Gives the maximum multiplier value if PI algorithm is used.")


  public Double getMultiplierPi() {
    return multiplierPi;
  }

  public void setMultiplierPi(Double multiplierPi) {
    this.multiplierPi = multiplierPi;
  }

  public AdditionalInformationForCapitalPreservation timeIntervalMaximumLoss(String timeIntervalMaximumLoss) {
    this.timeIntervalMaximumLoss = timeIntervalMaximumLoss;
    return this;
  }

  /**
   * The time period in which a possible loss of a capital perservation funds is measured.
   * @return timeIntervalMaximumLoss
  **/
  @ApiModelProperty(value = "The time period in which a possible loss of a capital perservation funds is measured.")


  public String getTimeIntervalMaximumLoss() {
    return timeIntervalMaximumLoss;
  }

  public void setTimeIntervalMaximumLoss(String timeIntervalMaximumLoss) {
    this.timeIntervalMaximumLoss = timeIntervalMaximumLoss;
  }

  public AdditionalInformationForCapitalPreservation usesPi(UsesPiEnum usesPi) {
    this.usesPi = usesPi;
    return this;
  }

  /**
   * Identifies if PI (Portfolio Insurance including CPPI Constant Proportion Portfolio Insurance)  is used (Y) or not (N) for capital preservation.
   * @return usesPi
  **/
  @ApiModelProperty(value = "Identifies if PI (Portfolio Insurance including CPPI Constant Proportion Portfolio Insurance)  is used (Y) or not (N) for capital preservation.")


  public UsesPiEnum getUsesPi() {
    return usesPi;
  }

  public void setUsesPi(UsesPiEnum usesPi) {
    this.usesPi = usesPi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalInformationForCapitalPreservation additionalInformationForCapitalPreservation = (AdditionalInformationForCapitalPreservation) o;
    return Objects.equals(this.capitalPreservationLevel, additionalInformationForCapitalPreservation.capitalPreservationLevel) &&
        Objects.equals(this.existingCapitalPreservation, additionalInformationForCapitalPreservation.existingCapitalPreservation) &&
        Objects.equals(this.multiplierPi, additionalInformationForCapitalPreservation.multiplierPi) &&
        Objects.equals(this.timeIntervalMaximumLoss, additionalInformationForCapitalPreservation.timeIntervalMaximumLoss) &&
        Objects.equals(this.usesPi, additionalInformationForCapitalPreservation.usesPi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalPreservationLevel, existingCapitalPreservation, multiplierPi, timeIntervalMaximumLoss, usesPi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInformationForCapitalPreservation {\n");
    
    sb.append("    capitalPreservationLevel: ").append(toIndentedString(capitalPreservationLevel)).append("\n");
    sb.append("    existingCapitalPreservation: ").append(toIndentedString(existingCapitalPreservation)).append("\n");
    sb.append("    multiplierPi: ").append(toIndentedString(multiplierPi)).append("\n");
    sb.append("    timeIntervalMaximumLoss: ").append(toIndentedString(timeIntervalMaximumLoss)).append("\n");
    sb.append("    usesPi: ").append(toIndentedString(usesPi)).append("\n");
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

