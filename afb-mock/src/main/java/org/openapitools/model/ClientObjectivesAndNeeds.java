package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientObjectivesAndNeeds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClientObjectivesAndNeeds   {
  @JsonProperty("maturityDate")
  private OffsetDateTime maturityDate = null;

  /**
   * Yes or No or Neutral
   */
  public enum MayBeTerminatedEarlyEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    MayBeTerminatedEarlyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MayBeTerminatedEarlyEnum fromValue(String text) {
      for (MayBeTerminatedEarlyEnum b : MayBeTerminatedEarlyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("mayBeTerminatedEarly")
  private MayBeTerminatedEarlyEnum mayBeTerminatedEarly = null;

  /**
   * Yes or No or Neutral
   */
  public enum OptionOrLeveragedReturnProfileEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    OptionOrLeveragedReturnProfileEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OptionOrLeveragedReturnProfileEnum fromValue(String text) {
      for (OptionOrLeveragedReturnProfileEnum b : OptionOrLeveragedReturnProfileEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("optionOrLeveragedReturnProfile")
  private OptionOrLeveragedReturnProfileEnum optionOrLeveragedReturnProfile = null;

  /**
   * Yes or No or Neutral
   */
  public enum ReturnProfileGrowthEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    ReturnProfileGrowthEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnProfileGrowthEnum fromValue(String text) {
      for (ReturnProfileGrowthEnum b : ReturnProfileGrowthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("returnProfileGrowth")
  private ReturnProfileGrowthEnum returnProfileGrowth = null;

  /**
   * Yes or No or Neutral
   */
  public enum ReturnProfileHedgingEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    ReturnProfileHedgingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnProfileHedgingEnum fromValue(String text) {
      for (ReturnProfileHedgingEnum b : ReturnProfileHedgingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("returnProfileHedging")
  private ReturnProfileHedgingEnum returnProfileHedging = null;

  /**
   * Yes or No or Neutral
   */
  public enum ReturnProfileIncomeEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    ReturnProfileIncomeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnProfileIncomeEnum fromValue(String text) {
      for (ReturnProfileIncomeEnum b : ReturnProfileIncomeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("returnProfileIncome")
  private ReturnProfileIncomeEnum returnProfileIncome = null;

  /**
   * Yes or Neutral
   */
  public enum ReturnProfileOtherEnum {
    Y("Y"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    ReturnProfileOtherEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnProfileOtherEnum fromValue(String text) {
      for (ReturnProfileOtherEnum b : ReturnProfileOtherEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("returnProfileOther")
  private ReturnProfileOtherEnum returnProfileOther = null;

  /**
   * Yes or No or Neutral
   */
  public enum ReturnProfilePensionSchemeGermanyEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    ReturnProfilePensionSchemeGermanyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnProfilePensionSchemeGermanyEnum fromValue(String text) {
      for (ReturnProfilePensionSchemeGermanyEnum b : ReturnProfilePensionSchemeGermanyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("returnProfilePensionSchemeGermany")
  private ReturnProfilePensionSchemeGermanyEnum returnProfilePensionSchemeGermany = null;

  /**
   * Yes or No or Neutral
   */
  public enum ReturnProfilePreservationEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    ReturnProfilePreservationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnProfilePreservationEnum fromValue(String text) {
      for (ReturnProfilePreservationEnum b : ReturnProfilePreservationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("returnProfilePreservation")
  private ReturnProfilePreservationEnum returnProfilePreservation = null;

  /**
   * Yes or No or (Green investment, Ethical investment, Islamic banking, ESG, Other)
   */
  public enum SpecificInvestmentNeedEnum {
    Y("Y"),
    
    N("N"),
    
    G("G"),
    
    E("E"),
    
    I("I"),
    
    S("S"),
    
    O("O");

    private String value;

    SpecificInvestmentNeedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SpecificInvestmentNeedEnum fromValue(String text) {
      for (SpecificInvestmentNeedEnum b : SpecificInvestmentNeedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("specificInvestmentNeed")
  private SpecificInvestmentNeedEnum specificInvestmentNeed = null;

  @JsonProperty("timeHorizon")
  private String timeHorizon = null;

  public ClientObjectivesAndNeeds maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Date of Maturity
   * @return maturityDate
  **/
  @ApiModelProperty(value = "Date of Maturity")

  @Valid

  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }

  public ClientObjectivesAndNeeds mayBeTerminatedEarly(MayBeTerminatedEarlyEnum mayBeTerminatedEarly) {
    this.mayBeTerminatedEarly = mayBeTerminatedEarly;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return mayBeTerminatedEarly
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public MayBeTerminatedEarlyEnum getMayBeTerminatedEarly() {
    return mayBeTerminatedEarly;
  }

  public void setMayBeTerminatedEarly(MayBeTerminatedEarlyEnum mayBeTerminatedEarly) {
    this.mayBeTerminatedEarly = mayBeTerminatedEarly;
  }

  public ClientObjectivesAndNeeds optionOrLeveragedReturnProfile(OptionOrLeveragedReturnProfileEnum optionOrLeveragedReturnProfile) {
    this.optionOrLeveragedReturnProfile = optionOrLeveragedReturnProfile;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return optionOrLeveragedReturnProfile
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public OptionOrLeveragedReturnProfileEnum getOptionOrLeveragedReturnProfile() {
    return optionOrLeveragedReturnProfile;
  }

  public void setOptionOrLeveragedReturnProfile(OptionOrLeveragedReturnProfileEnum optionOrLeveragedReturnProfile) {
    this.optionOrLeveragedReturnProfile = optionOrLeveragedReturnProfile;
  }

  public ClientObjectivesAndNeeds returnProfileGrowth(ReturnProfileGrowthEnum returnProfileGrowth) {
    this.returnProfileGrowth = returnProfileGrowth;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return returnProfileGrowth
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public ReturnProfileGrowthEnum getReturnProfileGrowth() {
    return returnProfileGrowth;
  }

  public void setReturnProfileGrowth(ReturnProfileGrowthEnum returnProfileGrowth) {
    this.returnProfileGrowth = returnProfileGrowth;
  }

  public ClientObjectivesAndNeeds returnProfileHedging(ReturnProfileHedgingEnum returnProfileHedging) {
    this.returnProfileHedging = returnProfileHedging;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return returnProfileHedging
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public ReturnProfileHedgingEnum getReturnProfileHedging() {
    return returnProfileHedging;
  }

  public void setReturnProfileHedging(ReturnProfileHedgingEnum returnProfileHedging) {
    this.returnProfileHedging = returnProfileHedging;
  }

  public ClientObjectivesAndNeeds returnProfileIncome(ReturnProfileIncomeEnum returnProfileIncome) {
    this.returnProfileIncome = returnProfileIncome;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return returnProfileIncome
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public ReturnProfileIncomeEnum getReturnProfileIncome() {
    return returnProfileIncome;
  }

  public void setReturnProfileIncome(ReturnProfileIncomeEnum returnProfileIncome) {
    this.returnProfileIncome = returnProfileIncome;
  }

  public ClientObjectivesAndNeeds returnProfileOther(ReturnProfileOtherEnum returnProfileOther) {
    this.returnProfileOther = returnProfileOther;
    return this;
  }

  /**
   * Yes or Neutral
   * @return returnProfileOther
  **/
  @ApiModelProperty(value = "Yes or Neutral")


  public ReturnProfileOtherEnum getReturnProfileOther() {
    return returnProfileOther;
  }

  public void setReturnProfileOther(ReturnProfileOtherEnum returnProfileOther) {
    this.returnProfileOther = returnProfileOther;
  }

  public ClientObjectivesAndNeeds returnProfilePensionSchemeGermany(ReturnProfilePensionSchemeGermanyEnum returnProfilePensionSchemeGermany) {
    this.returnProfilePensionSchemeGermany = returnProfilePensionSchemeGermany;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return returnProfilePensionSchemeGermany
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public ReturnProfilePensionSchemeGermanyEnum getReturnProfilePensionSchemeGermany() {
    return returnProfilePensionSchemeGermany;
  }

  public void setReturnProfilePensionSchemeGermany(ReturnProfilePensionSchemeGermanyEnum returnProfilePensionSchemeGermany) {
    this.returnProfilePensionSchemeGermany = returnProfilePensionSchemeGermany;
  }

  public ClientObjectivesAndNeeds returnProfilePreservation(ReturnProfilePreservationEnum returnProfilePreservation) {
    this.returnProfilePreservation = returnProfilePreservation;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return returnProfilePreservation
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public ReturnProfilePreservationEnum getReturnProfilePreservation() {
    return returnProfilePreservation;
  }

  public void setReturnProfilePreservation(ReturnProfilePreservationEnum returnProfilePreservation) {
    this.returnProfilePreservation = returnProfilePreservation;
  }

  public ClientObjectivesAndNeeds specificInvestmentNeed(SpecificInvestmentNeedEnum specificInvestmentNeed) {
    this.specificInvestmentNeed = specificInvestmentNeed;
    return this;
  }

  /**
   * Yes or No or (Green investment, Ethical investment, Islamic banking, ESG, Other)
   * @return specificInvestmentNeed
  **/
  @ApiModelProperty(value = "Yes or No or (Green investment, Ethical investment, Islamic banking, ESG, Other)")


  public SpecificInvestmentNeedEnum getSpecificInvestmentNeed() {
    return specificInvestmentNeed;
  }

  public void setSpecificInvestmentNeed(SpecificInvestmentNeedEnum specificInvestmentNeed) {
    this.specificInvestmentNeed = specificInvestmentNeed;
  }

  public ClientObjectivesAndNeeds timeHorizon(String timeHorizon) {
    this.timeHorizon = timeHorizon;
    return this;
  }

  /**
   * RHP in years  or Very Short Term (<1Y)or Short term (<3Y) or Medium term (<5Y) or Long term  (>5Y) or Neutral
   * @return timeHorizon
  **/
  @ApiModelProperty(value = "RHP in years  or Very Short Term (<1Y)or Short term (<3Y) or Medium term (<5Y) or Long term  (>5Y) or Neutral")


  public String getTimeHorizon() {
    return timeHorizon;
  }

  public void setTimeHorizon(String timeHorizon) {
    this.timeHorizon = timeHorizon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientObjectivesAndNeeds clientObjectivesAndNeeds = (ClientObjectivesAndNeeds) o;
    return Objects.equals(this.maturityDate, clientObjectivesAndNeeds.maturityDate) &&
        Objects.equals(this.mayBeTerminatedEarly, clientObjectivesAndNeeds.mayBeTerminatedEarly) &&
        Objects.equals(this.optionOrLeveragedReturnProfile, clientObjectivesAndNeeds.optionOrLeveragedReturnProfile) &&
        Objects.equals(this.returnProfileGrowth, clientObjectivesAndNeeds.returnProfileGrowth) &&
        Objects.equals(this.returnProfileHedging, clientObjectivesAndNeeds.returnProfileHedging) &&
        Objects.equals(this.returnProfileIncome, clientObjectivesAndNeeds.returnProfileIncome) &&
        Objects.equals(this.returnProfileOther, clientObjectivesAndNeeds.returnProfileOther) &&
        Objects.equals(this.returnProfilePensionSchemeGermany, clientObjectivesAndNeeds.returnProfilePensionSchemeGermany) &&
        Objects.equals(this.returnProfilePreservation, clientObjectivesAndNeeds.returnProfilePreservation) &&
        Objects.equals(this.specificInvestmentNeed, clientObjectivesAndNeeds.specificInvestmentNeed) &&
        Objects.equals(this.timeHorizon, clientObjectivesAndNeeds.timeHorizon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maturityDate, mayBeTerminatedEarly, optionOrLeveragedReturnProfile, returnProfileGrowth, returnProfileHedging, returnProfileIncome, returnProfileOther, returnProfilePensionSchemeGermany, returnProfilePreservation, specificInvestmentNeed, timeHorizon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientObjectivesAndNeeds {\n");
    
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    mayBeTerminatedEarly: ").append(toIndentedString(mayBeTerminatedEarly)).append("\n");
    sb.append("    optionOrLeveragedReturnProfile: ").append(toIndentedString(optionOrLeveragedReturnProfile)).append("\n");
    sb.append("    returnProfileGrowth: ").append(toIndentedString(returnProfileGrowth)).append("\n");
    sb.append("    returnProfileHedging: ").append(toIndentedString(returnProfileHedging)).append("\n");
    sb.append("    returnProfileIncome: ").append(toIndentedString(returnProfileIncome)).append("\n");
    sb.append("    returnProfileOther: ").append(toIndentedString(returnProfileOther)).append("\n");
    sb.append("    returnProfilePensionSchemeGermany: ").append(toIndentedString(returnProfilePensionSchemeGermany)).append("\n");
    sb.append("    returnProfilePreservation: ").append(toIndentedString(returnProfilePreservation)).append("\n");
    sb.append("    specificInvestmentNeed: ").append(toIndentedString(specificInvestmentNeed)).append("\n");
    sb.append("    timeHorizon: ").append(toIndentedString(timeHorizon)).append("\n");
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

