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
 * InverstorType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InverstorType   {
  /**
   * Yes or No or Neutral
   */
  public enum InvestorTypeEligibleCounterpartyEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    InvestorTypeEligibleCounterpartyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InvestorTypeEligibleCounterpartyEnum fromValue(String text) {
      for (InvestorTypeEligibleCounterpartyEnum b : InvestorTypeEligibleCounterpartyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("investorTypeEligibleCounterparty")
  private InvestorTypeEligibleCounterpartyEnum investorTypeEligibleCounterparty = null;

  /**
   * Yes or No or Neutral  or  Professional Per Se or Elective Professional or Both
   */
  public enum InvestorTypeProfessionalEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL"),
    
    P("P"),
    
    E("E"),
    
    B("B");

    private String value;

    InvestorTypeProfessionalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InvestorTypeProfessionalEnum fromValue(String text) {
      for (InvestorTypeProfessionalEnum b : InvestorTypeProfessionalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("investorTypeProfessional")
  private InvestorTypeProfessionalEnum investorTypeProfessional = null;

  /**
   * Yes or No or Neutral
   */
  public enum InvestorTypeRetailEnum {
    Y("Y"),
    
    N("N"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    InvestorTypeRetailEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InvestorTypeRetailEnum fromValue(String text) {
      for (InvestorTypeRetailEnum b : InvestorTypeRetailEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("investorTypeRetail")
  private InvestorTypeRetailEnum investorTypeRetail = null;

  public InverstorType investorTypeEligibleCounterparty(InvestorTypeEligibleCounterpartyEnum investorTypeEligibleCounterparty) {
    this.investorTypeEligibleCounterparty = investorTypeEligibleCounterparty;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return investorTypeEligibleCounterparty
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public InvestorTypeEligibleCounterpartyEnum getInvestorTypeEligibleCounterparty() {
    return investorTypeEligibleCounterparty;
  }

  public void setInvestorTypeEligibleCounterparty(InvestorTypeEligibleCounterpartyEnum investorTypeEligibleCounterparty) {
    this.investorTypeEligibleCounterparty = investorTypeEligibleCounterparty;
  }

  public InverstorType investorTypeProfessional(InvestorTypeProfessionalEnum investorTypeProfessional) {
    this.investorTypeProfessional = investorTypeProfessional;
    return this;
  }

  /**
   * Yes or No or Neutral  or  Professional Per Se or Elective Professional or Both
   * @return investorTypeProfessional
  **/
  @ApiModelProperty(value = "Yes or No or Neutral  or  Professional Per Se or Elective Professional or Both")


  public InvestorTypeProfessionalEnum getInvestorTypeProfessional() {
    return investorTypeProfessional;
  }

  public void setInvestorTypeProfessional(InvestorTypeProfessionalEnum investorTypeProfessional) {
    this.investorTypeProfessional = investorTypeProfessional;
  }

  public InverstorType investorTypeRetail(InvestorTypeRetailEnum investorTypeRetail) {
    this.investorTypeRetail = investorTypeRetail;
    return this;
  }

  /**
   * Yes or No or Neutral
   * @return investorTypeRetail
  **/
  @ApiModelProperty(value = "Yes or No or Neutral")


  public InvestorTypeRetailEnum getInvestorTypeRetail() {
    return investorTypeRetail;
  }

  public void setInvestorTypeRetail(InvestorTypeRetailEnum investorTypeRetail) {
    this.investorTypeRetail = investorTypeRetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InverstorType inverstorType = (InverstorType) o;
    return Objects.equals(this.investorTypeEligibleCounterparty, inverstorType.investorTypeEligibleCounterparty) &&
        Objects.equals(this.investorTypeProfessional, inverstorType.investorTypeProfessional) &&
        Objects.equals(this.investorTypeRetail, inverstorType.investorTypeRetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investorTypeEligibleCounterparty, investorTypeProfessional, investorTypeRetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InverstorType {\n");
    
    sb.append("    investorTypeEligibleCounterparty: ").append(toIndentedString(investorTypeEligibleCounterparty)).append("\n");
    sb.append("    investorTypeProfessional: ").append(toIndentedString(investorTypeProfessional)).append("\n");
    sb.append("    investorTypeRetail: ").append(toIndentedString(investorTypeRetail)).append("\n");
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

