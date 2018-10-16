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
 * KnowledgeAndOrExperience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class KnowledgeAndOrExperience   {
  /**
   * Yes or No or Neutral
   */
  public enum AdvancedInvestorEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    AdvancedInvestorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AdvancedInvestorEnum fromValue(String text) {
      for (AdvancedInvestorEnum b : AdvancedInvestorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("advancedInvestor")
  private AdvancedInvestorEnum advancedInvestor = null;

  /**
   * Yes or No or Neutral
   */
  public enum BasicInverstorEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    BasicInverstorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BasicInverstorEnum fromValue(String text) {
      for (BasicInverstorEnum b : BasicInverstorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("basicInverstor")
  private BasicInverstorEnum basicInverstor = null;

  /**
   * Yes or No or Neutral
   */
  public enum ExpertInvestorGermanyEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    ExpertInvestorGermanyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExpertInvestorGermanyEnum fromValue(String text) {
      for (ExpertInvestorGermanyEnum b : ExpertInvestorGermanyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("expertInvestorGermany")
  private ExpertInvestorGermanyEnum expertInvestorGermany = null;

  /**
   * Yes or No or Neutral
   */
  public enum InformedInvestorEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    InformedInvestorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InformedInvestorEnum fromValue(String text) {
      for (InformedInvestorEnum b : InformedInvestorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("informedInvestor")
  private InformedInvestorEnum informedInvestor = null;

  public KnowledgeAndOrExperience advancedInvestor(AdvancedInvestorEnum advancedInvestor) {
    this.advancedInvestor = advancedInvestor;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return advancedInvestor
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public AdvancedInvestorEnum getAdvancedInvestor() {
    return advancedInvestor;
  }

  public void setAdvancedInvestor(AdvancedInvestorEnum advancedInvestor) {
    this.advancedInvestor = advancedInvestor;
  }

  public KnowledgeAndOrExperience basicInverstor(BasicInverstorEnum basicInverstor) {
    this.basicInverstor = basicInverstor;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return basicInverstor
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public BasicInverstorEnum getBasicInverstor() {
    return basicInverstor;
  }

  public void setBasicInverstor(BasicInverstorEnum basicInverstor) {
    this.basicInverstor = basicInverstor;
  }

  public KnowledgeAndOrExperience expertInvestorGermany(ExpertInvestorGermanyEnum expertInvestorGermany) {
    this.expertInvestorGermany = expertInvestorGermany;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return expertInvestorGermany
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public ExpertInvestorGermanyEnum getExpertInvestorGermany() {
    return expertInvestorGermany;
  }

  public void setExpertInvestorGermany(ExpertInvestorGermanyEnum expertInvestorGermany) {
    this.expertInvestorGermany = expertInvestorGermany;
  }

  public KnowledgeAndOrExperience informedInvestor(InformedInvestorEnum informedInvestor) {
    this.informedInvestor = informedInvestor;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return informedInvestor
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public InformedInvestorEnum getInformedInvestor() {
    return informedInvestor;
  }

  public void setInformedInvestor(InformedInvestorEnum informedInvestor) {
    this.informedInvestor = informedInvestor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeAndOrExperience knowledgeAndOrExperience = (KnowledgeAndOrExperience) o;
    return Objects.equals(this.advancedInvestor, knowledgeAndOrExperience.advancedInvestor) &&
        Objects.equals(this.basicInverstor, knowledgeAndOrExperience.basicInverstor) &&
        Objects.equals(this.expertInvestorGermany, knowledgeAndOrExperience.expertInvestorGermany) &&
        Objects.equals(this.informedInvestor, knowledgeAndOrExperience.informedInvestor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedInvestor, basicInverstor, expertInvestorGermany, informedInvestor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeAndOrExperience {\n");
    
    sb.append("    advancedInvestor: ").append(toIndentedString(advancedInvestor)).append("\n");
    sb.append("    basicInverstor: ").append(toIndentedString(basicInverstor)).append("\n");
    sb.append("    expertInvestorGermany: ").append(toIndentedString(expertInvestorGermany)).append("\n");
    sb.append("    informedInvestor: ").append(toIndentedString(informedInvestor)).append("\n");
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

