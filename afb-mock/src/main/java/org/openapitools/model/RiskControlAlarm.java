package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvestmentLimit;
import org.openapitools.model.MailNotification;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RiskControlAlarm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskControlAlarm   {
  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("investmentLimits")
  @Valid
  private List<InvestmentLimit> investmentLimits = null;

  /**
   * Enum to select between \"SPANISH\" OR \"ENGLISH\".
   */
  public enum LanguageEnum {
    SPANISH("SPANISH"),
    
    ENGLISH("ENGLISH");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("language")
  private LanguageEnum language = null;

  @JsonProperty("mailNotification")
  private Boolean mailNotification = null;

  @JsonProperty("mailNotifications")
  @Valid
  private List<MailNotification> mailNotifications = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  /**
   * Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the status of the {RiskControlAlarm}
   */
  public enum OperationalStatusEnum {
    ACTIVED("ACTIVED"),
    
    DESACTIVED("DESACTIVED");

    private String value;

    OperationalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationalStatusEnum fromValue(String text) {
      for (OperationalStatusEnum b : OperationalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operationalStatus")
  private OperationalStatusEnum operationalStatus = null;

  /**
   * Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   */
  public enum ScopeEnum {
    MODEL_PORTFOLIO("MODEL_PORTFOLIO"),
    
    REAL_PORTFOLIO("REAL_PORTFOLIO");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("scope")
  private ScopeEnum scope = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  public RiskControlAlarm distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public RiskControlAlarm id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {RiskControlAlarm}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {RiskControlAlarm}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RiskControlAlarm investmentLimits(List<InvestmentLimit> investmentLimits) {
    this.investmentLimits = investmentLimits;
    return this;
  }

  public RiskControlAlarm addInvestmentLimitsItem(InvestmentLimit investmentLimitsItem) {
    if (this.investmentLimits == null) {
      this.investmentLimits = new ArrayList<>();
    }
    this.investmentLimits.add(investmentLimitsItem);
    return this;
  }

  /**
   * Get investmentLimits
   * @return investmentLimits
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<InvestmentLimit> getInvestmentLimits() {
    return investmentLimits;
  }

  public void setInvestmentLimits(List<InvestmentLimit> investmentLimits) {
    this.investmentLimits = investmentLimits;
  }

  public RiskControlAlarm language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  /**
   * Enum to select between \"SPANISH\" OR \"ENGLISH\".
   * @return language
  **/
  @ApiModelProperty(value = "Enum to select between \"SPANISH\" OR \"ENGLISH\".")


  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public RiskControlAlarm mailNotification(Boolean mailNotification) {
    this.mailNotification = mailNotification;
    return this;
  }

  /**
   * The is an indicator mail of the {RiskControlAlarm]
   * @return mailNotification
  **/
  @ApiModelProperty(value = "The is an indicator mail of the {RiskControlAlarm]")


  public Boolean getMailNotification() {
    return mailNotification;
  }

  public void setMailNotification(Boolean mailNotification) {
    this.mailNotification = mailNotification;
  }

  public RiskControlAlarm mailNotifications(List<MailNotification> mailNotifications) {
    this.mailNotifications = mailNotifications;
    return this;
  }

  public RiskControlAlarm addMailNotificationsItem(MailNotification mailNotificationsItem) {
    if (this.mailNotifications == null) {
      this.mailNotifications = new ArrayList<>();
    }
    this.mailNotifications.add(mailNotificationsItem);
    return this;
  }

  /**
   * Get mailNotifications
   * @return mailNotifications
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MailNotification> getMailNotifications() {
    return mailNotifications;
  }

  public void setMailNotifications(List<MailNotification> mailNotifications) {
    this.mailNotifications = mailNotifications;
  }

  public RiskControlAlarm name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the {RiskControlAlarm}
   * @return name
  **/
  @ApiModelProperty(value = "The name of the {RiskControlAlarm}")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RiskControlAlarm operationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolio}
   * @return operationalPortfolioId
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolio}")


  public Long getOperationalPortfolioId() {
    return operationalPortfolioId;
  }

  public void setOperationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
  }

  public RiskControlAlarm operationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }

  /**
   * Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the status of the {RiskControlAlarm}
   * @return operationalStatus
  **/
  @ApiModelProperty(value = "Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the status of the {RiskControlAlarm}")


  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }

  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }

  public RiskControlAlarm scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   * @return scope
  **/
  @ApiModelProperty(value = "Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".")


  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public RiskControlAlarm typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * The type of alarm. Refer to {listRiskControlAlarmTypes}
   * @return typeCode
  **/
  @ApiModelProperty(value = "The type of alarm. Refer to {listRiskControlAlarmTypes}")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskControlAlarm riskControlAlarm = (RiskControlAlarm) o;
    return Objects.equals(this.distributorId, riskControlAlarm.distributorId) &&
        Objects.equals(this.id, riskControlAlarm.id) &&
        Objects.equals(this.investmentLimits, riskControlAlarm.investmentLimits) &&
        Objects.equals(this.language, riskControlAlarm.language) &&
        Objects.equals(this.mailNotification, riskControlAlarm.mailNotification) &&
        Objects.equals(this.mailNotifications, riskControlAlarm.mailNotifications) &&
        Objects.equals(this.name, riskControlAlarm.name) &&
        Objects.equals(this.operationalPortfolioId, riskControlAlarm.operationalPortfolioId) &&
        Objects.equals(this.operationalStatus, riskControlAlarm.operationalStatus) &&
        Objects.equals(this.scope, riskControlAlarm.scope) &&
        Objects.equals(this.typeCode, riskControlAlarm.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, id, investmentLimits, language, mailNotification, mailNotifications, name, operationalPortfolioId, operationalStatus, scope, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskControlAlarm {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investmentLimits: ").append(toIndentedString(investmentLimits)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mailNotification: ").append(toIndentedString(mailNotification)).append("\n");
    sb.append("    mailNotifications: ").append(toIndentedString(mailNotifications)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

