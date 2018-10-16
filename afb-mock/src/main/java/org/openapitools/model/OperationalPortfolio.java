package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.OperationalFeeDetails;
import org.openapitools.model.OperationalGroup;
import org.openapitools.model.OperationalPortfolioBasicData;
import org.openapitools.model.OperationalPortfolioDescriptionData;
import org.openapitools.model.OperationalRebalancingData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolio
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolio   {
  @JsonProperty("benchmarkId")
  private String benchmarkId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("currentOperationalManagementFee")
  private OperationalFeeDetails currentOperationalManagementFee = null;

  @JsonProperty("currentOperationalSuccessFee")
  private OperationalFeeDetails currentOperationalSuccessFee = null;

  @JsonProperty("futureOperationalManagementFee")
  private OperationalFeeDetails futureOperationalManagementFee = null;

  @JsonProperty("futureOperationalSuccessFee")
  private OperationalFeeDetails futureOperationalSuccessFee = null;

  @JsonProperty("id")
  private Long id = null;

  /**
   * Enum to select between \"CONFIRMATION\" or \"SETTLEMENT\". Indicates strategy for the NAV valuation of the {OperationalPortfolio}
   */
  public enum NavValuationStrategyEnum {
    CONFIRMATION("CONFIRMATION"),
    
    SETTLEMENT("SETTLEMENT");

    private String value;

    NavValuationStrategyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NavValuationStrategyEnum fromValue(String text) {
      for (NavValuationStrategyEnum b : NavValuationStrategyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("navValuationStrategy")
  private NavValuationStrategyEnum navValuationStrategy = null;

  @JsonProperty("operationalGroup")
  private OperationalGroup operationalGroup = null;

  @JsonProperty("operationalPortfolioBasicData")
  private OperationalPortfolioBasicData operationalPortfolioBasicData = null;

  @JsonProperty("operationalPortfolioDescriptionData")
  private OperationalPortfolioDescriptionData operationalPortfolioDescriptionData = null;

  @JsonProperty("operationalRebalancingData")
  private OperationalRebalancingData operationalRebalancingData = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime registrationDate = null;

  public OperationalPortfolio benchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
    return this;
  }

  /**
   * The  Id of the benchmark. Refer to {Benchmark}
   * @return benchmarkId
  **/
  @ApiModelProperty(value = "The  Id of the benchmark. Refer to {Benchmark}")


  public String getBenchmarkId() {
    return benchmarkId;
  }

  public void setBenchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
  }

  public OperationalPortfolio currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OperationalPortfolio currentOperationalManagementFee(OperationalFeeDetails currentOperationalManagementFee) {
    this.currentOperationalManagementFee = currentOperationalManagementFee;
    return this;
  }

  /**
   * Get currentOperationalManagementFee
   * @return currentOperationalManagementFee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalFeeDetails getCurrentOperationalManagementFee() {
    return currentOperationalManagementFee;
  }

  public void setCurrentOperationalManagementFee(OperationalFeeDetails currentOperationalManagementFee) {
    this.currentOperationalManagementFee = currentOperationalManagementFee;
  }

  public OperationalPortfolio currentOperationalSuccessFee(OperationalFeeDetails currentOperationalSuccessFee) {
    this.currentOperationalSuccessFee = currentOperationalSuccessFee;
    return this;
  }

  /**
   * Get currentOperationalSuccessFee
   * @return currentOperationalSuccessFee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalFeeDetails getCurrentOperationalSuccessFee() {
    return currentOperationalSuccessFee;
  }

  public void setCurrentOperationalSuccessFee(OperationalFeeDetails currentOperationalSuccessFee) {
    this.currentOperationalSuccessFee = currentOperationalSuccessFee;
  }

  public OperationalPortfolio futureOperationalManagementFee(OperationalFeeDetails futureOperationalManagementFee) {
    this.futureOperationalManagementFee = futureOperationalManagementFee;
    return this;
  }

  /**
   * Get futureOperationalManagementFee
   * @return futureOperationalManagementFee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalFeeDetails getFutureOperationalManagementFee() {
    return futureOperationalManagementFee;
  }

  public void setFutureOperationalManagementFee(OperationalFeeDetails futureOperationalManagementFee) {
    this.futureOperationalManagementFee = futureOperationalManagementFee;
  }

  public OperationalPortfolio futureOperationalSuccessFee(OperationalFeeDetails futureOperationalSuccessFee) {
    this.futureOperationalSuccessFee = futureOperationalSuccessFee;
    return this;
  }

  /**
   * Get futureOperationalSuccessFee
   * @return futureOperationalSuccessFee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalFeeDetails getFutureOperationalSuccessFee() {
    return futureOperationalSuccessFee;
  }

  public void setFutureOperationalSuccessFee(OperationalFeeDetails futureOperationalSuccessFee) {
    this.futureOperationalSuccessFee = futureOperationalSuccessFee;
  }

  public OperationalPortfolio id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolio}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolio}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OperationalPortfolio navValuationStrategy(NavValuationStrategyEnum navValuationStrategy) {
    this.navValuationStrategy = navValuationStrategy;
    return this;
  }

  /**
   * Enum to select between \"CONFIRMATION\" or \"SETTLEMENT\". Indicates strategy for the NAV valuation of the {OperationalPortfolio}
   * @return navValuationStrategy
  **/
  @ApiModelProperty(value = "Enum to select between \"CONFIRMATION\" or \"SETTLEMENT\". Indicates strategy for the NAV valuation of the {OperationalPortfolio}")


  public NavValuationStrategyEnum getNavValuationStrategy() {
    return navValuationStrategy;
  }

  public void setNavValuationStrategy(NavValuationStrategyEnum navValuationStrategy) {
    this.navValuationStrategy = navValuationStrategy;
  }

  public OperationalPortfolio operationalGroup(OperationalGroup operationalGroup) {
    this.operationalGroup = operationalGroup;
    return this;
  }

  /**
   * Get operationalGroup
   * @return operationalGroup
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalGroup getOperationalGroup() {
    return operationalGroup;
  }

  public void setOperationalGroup(OperationalGroup operationalGroup) {
    this.operationalGroup = operationalGroup;
  }

  public OperationalPortfolio operationalPortfolioBasicData(OperationalPortfolioBasicData operationalPortfolioBasicData) {
    this.operationalPortfolioBasicData = operationalPortfolioBasicData;
    return this;
  }

  /**
   * Get operationalPortfolioBasicData
   * @return operationalPortfolioBasicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioBasicData getOperationalPortfolioBasicData() {
    return operationalPortfolioBasicData;
  }

  public void setOperationalPortfolioBasicData(OperationalPortfolioBasicData operationalPortfolioBasicData) {
    this.operationalPortfolioBasicData = operationalPortfolioBasicData;
  }

  public OperationalPortfolio operationalPortfolioDescriptionData(OperationalPortfolioDescriptionData operationalPortfolioDescriptionData) {
    this.operationalPortfolioDescriptionData = operationalPortfolioDescriptionData;
    return this;
  }

  /**
   * Get operationalPortfolioDescriptionData
   * @return operationalPortfolioDescriptionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioDescriptionData getOperationalPortfolioDescriptionData() {
    return operationalPortfolioDescriptionData;
  }

  public void setOperationalPortfolioDescriptionData(OperationalPortfolioDescriptionData operationalPortfolioDescriptionData) {
    this.operationalPortfolioDescriptionData = operationalPortfolioDescriptionData;
  }

  public OperationalPortfolio operationalRebalancingData(OperationalRebalancingData operationalRebalancingData) {
    this.operationalRebalancingData = operationalRebalancingData;
    return this;
  }

  /**
   * Get operationalRebalancingData
   * @return operationalRebalancingData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalRebalancingData getOperationalRebalancingData() {
    return operationalRebalancingData;
  }

  public void setOperationalRebalancingData(OperationalRebalancingData operationalRebalancingData) {
    this.operationalRebalancingData = operationalRebalancingData;
  }

  public OperationalPortfolio registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * The portfolio's operational registration date.
   * @return registrationDate
  **/
  @ApiModelProperty(value = "The portfolio's operational registration date.")

  @Valid

  public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolio operationalPortfolio = (OperationalPortfolio) o;
    return Objects.equals(this.benchmarkId, operationalPortfolio.benchmarkId) &&
        Objects.equals(this.currencyCode, operationalPortfolio.currencyCode) &&
        Objects.equals(this.currentOperationalManagementFee, operationalPortfolio.currentOperationalManagementFee) &&
        Objects.equals(this.currentOperationalSuccessFee, operationalPortfolio.currentOperationalSuccessFee) &&
        Objects.equals(this.futureOperationalManagementFee, operationalPortfolio.futureOperationalManagementFee) &&
        Objects.equals(this.futureOperationalSuccessFee, operationalPortfolio.futureOperationalSuccessFee) &&
        Objects.equals(this.id, operationalPortfolio.id) &&
        Objects.equals(this.navValuationStrategy, operationalPortfolio.navValuationStrategy) &&
        Objects.equals(this.operationalGroup, operationalPortfolio.operationalGroup) &&
        Objects.equals(this.operationalPortfolioBasicData, operationalPortfolio.operationalPortfolioBasicData) &&
        Objects.equals(this.operationalPortfolioDescriptionData, operationalPortfolio.operationalPortfolioDescriptionData) &&
        Objects.equals(this.operationalRebalancingData, operationalPortfolio.operationalRebalancingData) &&
        Objects.equals(this.registrationDate, operationalPortfolio.registrationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkId, currencyCode, currentOperationalManagementFee, currentOperationalSuccessFee, futureOperationalManagementFee, futureOperationalSuccessFee, id, navValuationStrategy, operationalGroup, operationalPortfolioBasicData, operationalPortfolioDescriptionData, operationalRebalancingData, registrationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolio {\n");
    
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currentOperationalManagementFee: ").append(toIndentedString(currentOperationalManagementFee)).append("\n");
    sb.append("    currentOperationalSuccessFee: ").append(toIndentedString(currentOperationalSuccessFee)).append("\n");
    sb.append("    futureOperationalManagementFee: ").append(toIndentedString(futureOperationalManagementFee)).append("\n");
    sb.append("    futureOperationalSuccessFee: ").append(toIndentedString(futureOperationalSuccessFee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    navValuationStrategy: ").append(toIndentedString(navValuationStrategy)).append("\n");
    sb.append("    operationalGroup: ").append(toIndentedString(operationalGroup)).append("\n");
    sb.append("    operationalPortfolioBasicData: ").append(toIndentedString(operationalPortfolioBasicData)).append("\n");
    sb.append("    operationalPortfolioDescriptionData: ").append(toIndentedString(operationalPortfolioDescriptionData)).append("\n");
    sb.append("    operationalRebalancingData: ").append(toIndentedString(operationalRebalancingData)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
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

