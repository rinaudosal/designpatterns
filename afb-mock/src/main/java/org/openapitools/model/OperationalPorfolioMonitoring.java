package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CompositionDealingInstrument;
import org.openapitools.model.MonitoringAmountData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPorfolioMonitoring
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPorfolioMonitoring   {
  @JsonProperty("activationDate")
  private OffsetDateTime activationDate = null;

  @JsonProperty("compositionDealingInstruments")
  @Valid
  private List<CompositionDealingInstrument> compositionDealingInstruments = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("monitoringAmountData")
  private MonitoringAmountData monitoringAmountData = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  public OperationalPorfolioMonitoring activationDate(OffsetDateTime activationDate) {
    this.activationDate = activationDate;
    return this;
  }

  /**
   * Activation date refer to {OperationalPorfolioMonitoring}
   * @return activationDate
  **/
  @ApiModelProperty(value = "Activation date refer to {OperationalPorfolioMonitoring}")

  @Valid

  public OffsetDateTime getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(OffsetDateTime activationDate) {
    this.activationDate = activationDate;
  }

  public OperationalPorfolioMonitoring compositionDealingInstruments(List<CompositionDealingInstrument> compositionDealingInstruments) {
    this.compositionDealingInstruments = compositionDealingInstruments;
    return this;
  }

  public OperationalPorfolioMonitoring addCompositionDealingInstrumentsItem(CompositionDealingInstrument compositionDealingInstrumentsItem) {
    if (this.compositionDealingInstruments == null) {
      this.compositionDealingInstruments = new ArrayList<>();
    }
    this.compositionDealingInstruments.add(compositionDealingInstrumentsItem);
    return this;
  }

  /**
   * The array of {CompositionDealingInstrument}
   * @return compositionDealingInstruments
  **/
  @ApiModelProperty(value = "The array of {CompositionDealingInstrument}")

  @Valid

  public List<CompositionDealingInstrument> getCompositionDealingInstruments() {
    return compositionDealingInstruments;
  }

  public void setCompositionDealingInstruments(List<CompositionDealingInstrument> compositionDealingInstruments) {
    this.compositionDealingInstruments = compositionDealingInstruments;
  }

  public OperationalPorfolioMonitoring currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The benchmark's currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The benchmark's currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OperationalPorfolioMonitoring monitoringAmountData(MonitoringAmountData monitoringAmountData) {
    this.monitoringAmountData = monitoringAmountData;
    return this;
  }

  /**
   * Get monitoringAmountData
   * @return monitoringAmountData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MonitoringAmountData getMonitoringAmountData() {
    return monitoringAmountData;
  }

  public void setMonitoringAmountData(MonitoringAmountData monitoringAmountData) {
    this.monitoringAmountData = monitoringAmountData;
  }

  public OperationalPorfolioMonitoring operationalPortfolioId(Long operationalPortfolioId) {
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

  public OperationalPorfolioMonitoring statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of {OperationalPortfolio}. Refer to {listOperationalPortfolioCompositionStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of {OperationalPortfolio}. Refer to {listOperationalPortfolioCompositionStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPorfolioMonitoring operationalPorfolioMonitoring = (OperationalPorfolioMonitoring) o;
    return Objects.equals(this.activationDate, operationalPorfolioMonitoring.activationDate) &&
        Objects.equals(this.compositionDealingInstruments, operationalPorfolioMonitoring.compositionDealingInstruments) &&
        Objects.equals(this.currencyCode, operationalPorfolioMonitoring.currencyCode) &&
        Objects.equals(this.monitoringAmountData, operationalPorfolioMonitoring.monitoringAmountData) &&
        Objects.equals(this.operationalPortfolioId, operationalPorfolioMonitoring.operationalPortfolioId) &&
        Objects.equals(this.statusCode, operationalPorfolioMonitoring.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, compositionDealingInstruments, currencyCode, monitoringAmountData, operationalPortfolioId, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPorfolioMonitoring {\n");
    
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    compositionDealingInstruments: ").append(toIndentedString(compositionDealingInstruments)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    monitoringAmountData: ").append(toIndentedString(monitoringAmountData)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

