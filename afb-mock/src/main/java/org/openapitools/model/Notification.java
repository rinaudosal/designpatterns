package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvestmentLimit;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {Notification}.
 */
@ApiModel(description = "A simple object composed of either a {Notification}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Notification   {
  @JsonProperty("dataDate")
  private OffsetDateTime dataDate = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("investmentLimits")
  @Valid
  private List<InvestmentLimit> investmentLimits = null;

  @JsonProperty("mailNotification")
  private Boolean mailNotification = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notificationDate")
  private OffsetDateTime notificationDate = null;

  @JsonProperty("notificationStatusCode")
  private String notificationStatusCode = null;

  @JsonProperty("notificationTypeCode")
  private String notificationTypeCode = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

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

  public Notification dataDate(OffsetDateTime dataDate) {
    this.dataDate = dataDate;
    return this;
  }

  /**
   * Date of the data that generates the notification.
   * @return dataDate
  **/
  @ApiModelProperty(value = "Date of the data that generates the notification.")

  @Valid

  public OffsetDateTime getDataDate() {
    return dataDate;
  }

  public void setDataDate(OffsetDateTime dataDate) {
    this.dataDate = dataDate;
  }

  public Notification distributorId(Long distributorId) {
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

  public Notification externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external Reference associated to the {Notification}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external Reference associated to the {Notification}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public Notification id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {Notification}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {Notification}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Notification investmentLimits(List<InvestmentLimit> investmentLimits) {
    this.investmentLimits = investmentLimits;
    return this;
  }

  public Notification addInvestmentLimitsItem(InvestmentLimit investmentLimitsItem) {
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

  public Notification mailNotification(Boolean mailNotification) {
    this.mailNotification = mailNotification;
    return this;
  }

  /**
   * The is an indicator mail of the {Notification]
   * @return mailNotification
  **/
  @ApiModelProperty(value = "The is an indicator mail of the {Notification]")


  public Boolean getMailNotification() {
    return mailNotification;
  }

  public void setMailNotification(Boolean mailNotification) {
    this.mailNotification = mailNotification;
  }

  public Notification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of {Notification}.
   * @return name
  **/
  @ApiModelProperty(value = "The name of {Notification}.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Notification notificationDate(OffsetDateTime notificationDate) {
    this.notificationDate = notificationDate;
    return this;
  }

  /**
   * Date of the {Notification}.
   * @return notificationDate
  **/
  @ApiModelProperty(value = "Date of the {Notification}.")

  @Valid

  public OffsetDateTime getNotificationDate() {
    return notificationDate;
  }

  public void setNotificationDate(OffsetDateTime notificationDate) {
    this.notificationDate = notificationDate;
  }

  public Notification notificationStatusCode(String notificationStatusCode) {
    this.notificationStatusCode = notificationStatusCode;
    return this;
  }

  /**
   * The status of {Notification}. Refer to {listNotificationStatuses}
   * @return notificationStatusCode
  **/
  @ApiModelProperty(value = "The status of {Notification}. Refer to {listNotificationStatuses}")


  public String getNotificationStatusCode() {
    return notificationStatusCode;
  }

  public void setNotificationStatusCode(String notificationStatusCode) {
    this.notificationStatusCode = notificationStatusCode;
  }

  public Notification notificationTypeCode(String notificationTypeCode) {
    this.notificationTypeCode = notificationTypeCode;
    return this;
  }

  /**
   * The type of {Notification}. Refer to {listRiskControlAlarmTypes}
   * @return notificationTypeCode
  **/
  @ApiModelProperty(value = "The type of {Notification}. Refer to {listRiskControlAlarmTypes}")


  public String getNotificationTypeCode() {
    return notificationTypeCode;
  }

  public void setNotificationTypeCode(String notificationTypeCode) {
    this.notificationTypeCode = notificationTypeCode;
  }

  public Notification operationalPortfolioId(Long operationalPortfolioId) {
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

  public Notification scope(ScopeEnum scope) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.dataDate, notification.dataDate) &&
        Objects.equals(this.distributorId, notification.distributorId) &&
        Objects.equals(this.externalReference, notification.externalReference) &&
        Objects.equals(this.id, notification.id) &&
        Objects.equals(this.investmentLimits, notification.investmentLimits) &&
        Objects.equals(this.mailNotification, notification.mailNotification) &&
        Objects.equals(this.name, notification.name) &&
        Objects.equals(this.notificationDate, notification.notificationDate) &&
        Objects.equals(this.notificationStatusCode, notification.notificationStatusCode) &&
        Objects.equals(this.notificationTypeCode, notification.notificationTypeCode) &&
        Objects.equals(this.operationalPortfolioId, notification.operationalPortfolioId) &&
        Objects.equals(this.scope, notification.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataDate, distributorId, externalReference, id, investmentLimits, mailNotification, name, notificationDate, notificationStatusCode, notificationTypeCode, operationalPortfolioId, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    dataDate: ").append(toIndentedString(dataDate)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investmentLimits: ").append(toIndentedString(investmentLimits)).append("\n");
    sb.append("    mailNotification: ").append(toIndentedString(mailNotification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationDate: ").append(toIndentedString(notificationDate)).append("\n");
    sb.append("    notificationStatusCode: ").append(toIndentedString(notificationStatusCode)).append("\n");
    sb.append("    notificationTypeCode: ").append(toIndentedString(notificationTypeCode)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

