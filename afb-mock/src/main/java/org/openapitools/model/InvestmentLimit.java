package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Feature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvestmentLimit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InvestmentLimit   {
  @JsonProperty("assigned")
  private Boolean assigned = null;

  @JsonProperty("currencyPercentage")
  private Double currencyPercentage = null;

  @JsonProperty("descriptionData")
  private String descriptionData = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("features")
  @Valid
  private List<Feature> features = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("investmentLimitRiskLevelCode")
  private String investmentLimitRiskLevelCode = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Enum to select between \"LIMIT\" or \"THRESHOLD\".
   */
  public enum NotificationCauseEnum {
    LIMIT("LIMIT"),
    
    THRESHOLD("THRESHOLD");

    private String value;

    NotificationCauseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NotificationCauseEnum fromValue(String text) {
      for (NotificationCauseEnum b : NotificationCauseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("notificationCause")
  private NotificationCauseEnum notificationCause = null;

  /**
   * Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the type of the {InvestmentLimit}
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

  @JsonProperty("thresholdWarning")
  private Double thresholdWarning = null;

  public InvestmentLimit assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }

  /**
   * If the Investment Limits is currently assigned to a {OperationalPortfolio}
   * @return assigned
  **/
  @ApiModelProperty(value = "If the Investment Limits is currently assigned to a {OperationalPortfolio}")


  public Boolean getAssigned() {
    return assigned;
  }

  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }

  public InvestmentLimit currencyPercentage(Double currencyPercentage) {
    this.currencyPercentage = currencyPercentage;
    return this;
  }

  /**
   * Currency Percentage refer to {Notification}
   * @return currencyPercentage
  **/
  @ApiModelProperty(value = "Currency Percentage refer to {Notification}")


  public Double getCurrencyPercentage() {
    return currencyPercentage;
  }

  public void setCurrencyPercentage(Double currencyPercentage) {
    this.currencyPercentage = currencyPercentage;
  }

  public InvestmentLimit descriptionData(String descriptionData) {
    this.descriptionData = descriptionData;
    return this;
  }

  /**
   * The description of {InvestmentLimit}
   * @return descriptionData
  **/
  @ApiModelProperty(value = "The description of {InvestmentLimit}")


  public String getDescriptionData() {
    return descriptionData;
  }

  public void setDescriptionData(String descriptionData) {
    this.descriptionData = descriptionData;
  }

  public InvestmentLimit distributorId(Long distributorId) {
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

  public InvestmentLimit features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public InvestmentLimit addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * The array of {Feature}
   * @return features
  **/
  @ApiModelProperty(value = "The array of {Feature}")

  @Valid

  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public InvestmentLimit id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {InvestmentLimit}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {InvestmentLimit}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InvestmentLimit investmentLimitRiskLevelCode(String investmentLimitRiskLevelCode) {
    this.investmentLimitRiskLevelCode = investmentLimitRiskLevelCode;
    return this;
  }

  /**
   * The feature of InvestmentLimit. Refer to {listInvestmentLimitRiskLevels}
   * @return investmentLimitRiskLevelCode
  **/
  @ApiModelProperty(value = "The feature of InvestmentLimit. Refer to {listInvestmentLimitRiskLevels}")


  public String getInvestmentLimitRiskLevelCode() {
    return investmentLimitRiskLevelCode;
  }

  public void setInvestmentLimitRiskLevelCode(String investmentLimitRiskLevelCode) {
    this.investmentLimitRiskLevelCode = investmentLimitRiskLevelCode;
  }

  public InvestmentLimit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of {InvestmentLimit}
   * @return name
  **/
  @ApiModelProperty(value = "The name of {InvestmentLimit}")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InvestmentLimit notificationCause(NotificationCauseEnum notificationCause) {
    this.notificationCause = notificationCause;
    return this;
  }

  /**
   * Enum to select between \"LIMIT\" or \"THRESHOLD\".
   * @return notificationCause
  **/
  @ApiModelProperty(value = "Enum to select between \"LIMIT\" or \"THRESHOLD\".")


  public NotificationCauseEnum getNotificationCause() {
    return notificationCause;
  }

  public void setNotificationCause(NotificationCauseEnum notificationCause) {
    this.notificationCause = notificationCause;
  }

  public InvestmentLimit operationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }

  /**
   * Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the type of the {InvestmentLimit}
   * @return operationalStatus
  **/
  @ApiModelProperty(value = "Enum to select between \"ACTIVED\" or \"DESACTIVED\". Indicates the type of the {InvestmentLimit}")


  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }

  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }

  public InvestmentLimit thresholdWarning(Double thresholdWarning) {
    this.thresholdWarning = thresholdWarning;
    return this;
  }

  /**
   * Threshold Warning assigned to a {InvestmentLimit}
   * @return thresholdWarning
  **/
  @ApiModelProperty(value = "Threshold Warning assigned to a {InvestmentLimit}")


  public Double getThresholdWarning() {
    return thresholdWarning;
  }

  public void setThresholdWarning(Double thresholdWarning) {
    this.thresholdWarning = thresholdWarning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentLimit investmentLimit = (InvestmentLimit) o;
    return Objects.equals(this.assigned, investmentLimit.assigned) &&
        Objects.equals(this.currencyPercentage, investmentLimit.currencyPercentage) &&
        Objects.equals(this.descriptionData, investmentLimit.descriptionData) &&
        Objects.equals(this.distributorId, investmentLimit.distributorId) &&
        Objects.equals(this.features, investmentLimit.features) &&
        Objects.equals(this.id, investmentLimit.id) &&
        Objects.equals(this.investmentLimitRiskLevelCode, investmentLimit.investmentLimitRiskLevelCode) &&
        Objects.equals(this.name, investmentLimit.name) &&
        Objects.equals(this.notificationCause, investmentLimit.notificationCause) &&
        Objects.equals(this.operationalStatus, investmentLimit.operationalStatus) &&
        Objects.equals(this.thresholdWarning, investmentLimit.thresholdWarning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigned, currencyPercentage, descriptionData, distributorId, features, id, investmentLimitRiskLevelCode, name, notificationCause, operationalStatus, thresholdWarning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentLimit {\n");
    
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    currencyPercentage: ").append(toIndentedString(currencyPercentage)).append("\n");
    sb.append("    descriptionData: ").append(toIndentedString(descriptionData)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investmentLimitRiskLevelCode: ").append(toIndentedString(investmentLimitRiskLevelCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationCause: ").append(toIndentedString(notificationCause)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    thresholdWarning: ").append(toIndentedString(thresholdWarning)).append("\n");
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

