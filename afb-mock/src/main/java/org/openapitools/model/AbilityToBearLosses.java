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
 * AbilityToBearLosses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AbilityToBearLosses   {
  /**
   * Investor seeking to preserve capital or can bear losses limited to a level specified by the product.Yes or No or Neutral
   */
  public enum LimitedCapitalLossEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    LimitedCapitalLossEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LimitedCapitalLossEnum fromValue(String text) {
      for (LimitedCapitalLossEnum b : LimitedCapitalLossEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("limitedCapitalLoss")
  private LimitedCapitalLossEnum limitedCapitalLoss = null;

  @JsonProperty("limitedCapitalLossLevel")
  private Double limitedCapitalLossLevel = null;

  /**
   * Loss Beyond the Capital. Yes or No or Neutral
   */
  public enum LossBeyondCapitalEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    LossBeyondCapitalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LossBeyondCapitalEnum fromValue(String text) {
      for (LossBeyondCapitalEnum b : LossBeyondCapitalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("lossBeyondCapital")
  private LossBeyondCapitalEnum lossBeyondCapital = null;

  /**
   * No Capital Guarantee nor protection. 100% capital at risk. Yes or No or Neutral
   */
  public enum NoCapitalGuaranteeEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    NoCapitalGuaranteeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NoCapitalGuaranteeEnum fromValue(String text) {
      for (NoCapitalGuaranteeEnum b : NoCapitalGuaranteeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("noCapitalGuarantee")
  private NoCapitalGuaranteeEnum noCapitalGuarantee = null;

  /**
   * Investor can bear no loss of capital. Minor losses especially due to costs possible. Yes or No or Neutral
   */
  public enum NoCapitalLossEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    NoCapitalLossEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NoCapitalLossEnum fromValue(String text) {
      for (NoCapitalLossEnum b : NoCapitalLossEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("noCapitalLoss")
  private NoCapitalLossEnum noCapitalLoss = null;

  public AbilityToBearLosses limitedCapitalLoss(LimitedCapitalLossEnum limitedCapitalLoss) {
    this.limitedCapitalLoss = limitedCapitalLoss;
    return this;
  }

  /**
   * Investor seeking to preserve capital or can bear losses limited to a level specified by the product.Yes or No or Neutral
   * @return limitedCapitalLoss
  **/
  @ApiModelProperty(value = "Investor seeking to preserve capital or can bear losses limited to a level specified by the product.Yes or No or Neutral")


  public LimitedCapitalLossEnum getLimitedCapitalLoss() {
    return limitedCapitalLoss;
  }

  public void setLimitedCapitalLoss(LimitedCapitalLossEnum limitedCapitalLoss) {
    this.limitedCapitalLoss = limitedCapitalLoss;
  }

  public AbilityToBearLosses limitedCapitalLossLevel(Double limitedCapitalLossLevel) {
    this.limitedCapitalLossLevel = limitedCapitalLossLevel;
    return this;
  }

  /**
   * Loss up to XX%
   * @return limitedCapitalLossLevel
  **/
  @ApiModelProperty(value = "Loss up to XX%")


  public Double getLimitedCapitalLossLevel() {
    return limitedCapitalLossLevel;
  }

  public void setLimitedCapitalLossLevel(Double limitedCapitalLossLevel) {
    this.limitedCapitalLossLevel = limitedCapitalLossLevel;
  }

  public AbilityToBearLosses lossBeyondCapital(LossBeyondCapitalEnum lossBeyondCapital) {
    this.lossBeyondCapital = lossBeyondCapital;
    return this;
  }

  /**
   * Loss Beyond the Capital. Yes or No or Neutral
   * @return lossBeyondCapital
  **/
  @ApiModelProperty(value = "Loss Beyond the Capital. Yes or No or Neutral")


  public LossBeyondCapitalEnum getLossBeyondCapital() {
    return lossBeyondCapital;
  }

  public void setLossBeyondCapital(LossBeyondCapitalEnum lossBeyondCapital) {
    this.lossBeyondCapital = lossBeyondCapital;
  }

  public AbilityToBearLosses noCapitalGuarantee(NoCapitalGuaranteeEnum noCapitalGuarantee) {
    this.noCapitalGuarantee = noCapitalGuarantee;
    return this;
  }

  /**
   * No Capital Guarantee nor protection. 100% capital at risk. Yes or No or Neutral
   * @return noCapitalGuarantee
  **/
  @ApiModelProperty(value = "No Capital Guarantee nor protection. 100% capital at risk. Yes or No or Neutral")


  public NoCapitalGuaranteeEnum getNoCapitalGuarantee() {
    return noCapitalGuarantee;
  }

  public void setNoCapitalGuarantee(NoCapitalGuaranteeEnum noCapitalGuarantee) {
    this.noCapitalGuarantee = noCapitalGuarantee;
  }

  public AbilityToBearLosses noCapitalLoss(NoCapitalLossEnum noCapitalLoss) {
    this.noCapitalLoss = noCapitalLoss;
    return this;
  }

  /**
   * Investor can bear no loss of capital. Minor losses especially due to costs possible. Yes or No or Neutral
   * @return noCapitalLoss
  **/
  @ApiModelProperty(value = "Investor can bear no loss of capital. Minor losses especially due to costs possible. Yes or No or Neutral")


  public NoCapitalLossEnum getNoCapitalLoss() {
    return noCapitalLoss;
  }

  public void setNoCapitalLoss(NoCapitalLossEnum noCapitalLoss) {
    this.noCapitalLoss = noCapitalLoss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbilityToBearLosses abilityToBearLosses = (AbilityToBearLosses) o;
    return Objects.equals(this.limitedCapitalLoss, abilityToBearLosses.limitedCapitalLoss) &&
        Objects.equals(this.limitedCapitalLossLevel, abilityToBearLosses.limitedCapitalLossLevel) &&
        Objects.equals(this.lossBeyondCapital, abilityToBearLosses.lossBeyondCapital) &&
        Objects.equals(this.noCapitalGuarantee, abilityToBearLosses.noCapitalGuarantee) &&
        Objects.equals(this.noCapitalLoss, abilityToBearLosses.noCapitalLoss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitedCapitalLoss, limitedCapitalLossLevel, lossBeyondCapital, noCapitalGuarantee, noCapitalLoss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityToBearLosses {\n");
    
    sb.append("    limitedCapitalLoss: ").append(toIndentedString(limitedCapitalLoss)).append("\n");
    sb.append("    limitedCapitalLossLevel: ").append(toIndentedString(limitedCapitalLossLevel)).append("\n");
    sb.append("    lossBeyondCapital: ").append(toIndentedString(lossBeyondCapital)).append("\n");
    sb.append("    noCapitalGuarantee: ").append(toIndentedString(noCapitalGuarantee)).append("\n");
    sb.append("    noCapitalLoss: ").append(toIndentedString(noCapitalLoss)).append("\n");
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

