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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioComposition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioComposition   {
  @JsonProperty("compositionDealingInstruments")
  @Valid
  private List<CompositionDealingInstrument> compositionDealingInstruments = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("historical")
  private Boolean historical = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("inceptionDate")
  private OffsetDateTime inceptionDate = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("totalWeight")
  private Double totalWeight = null;

  public OperationalPortfolioComposition compositionDealingInstruments(List<CompositionDealingInstrument> compositionDealingInstruments) {
    this.compositionDealingInstruments = compositionDealingInstruments;
    return this;
  }

  public OperationalPortfolioComposition addCompositionDealingInstrumentsItem(CompositionDealingInstrument compositionDealingInstrumentsItem) {
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

  public OperationalPortfolioComposition distributorId(Long distributorId) {
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

  public OperationalPortfolioComposition historical(Boolean historical) {
    this.historical = historical;
    return this;
  }

  /**
   * Indicates if you historical
   * @return historical
  **/
  @ApiModelProperty(value = "Indicates if you historical")


  public Boolean getHistorical() {
    return historical;
  }

  public void setHistorical(Boolean historical) {
    this.historical = historical;
  }

  public OperationalPortfolioComposition id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolioComposition}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolioComposition}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OperationalPortfolioComposition inceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

  /**
   * Date for the {OperationalPortfolioComposition}
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "Date for the {OperationalPortfolioComposition}")

  @Valid

  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public OperationalPortfolioComposition operationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
    return this;
  }

  /**
   * Get operationalPortfolioId
   * @return operationalPortfolioId
  **/
  @ApiModelProperty(value = "")


  public Long getOperationalPortfolioId() {
    return operationalPortfolioId;
  }

  public void setOperationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
  }

  public OperationalPortfolioComposition statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of composition. Refer to {listOperationalPortfolioCompositionStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of composition. Refer to {listOperationalPortfolioCompositionStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public OperationalPortfolioComposition totalWeight(Double totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

  /**
   * Total Weight Percentage refer to {OperationalPortfolioComposition}
   * @return totalWeight
  **/
  @ApiModelProperty(value = "Total Weight Percentage refer to {OperationalPortfolioComposition}")


  public Double getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(Double totalWeight) {
    this.totalWeight = totalWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioComposition operationalPortfolioComposition = (OperationalPortfolioComposition) o;
    return Objects.equals(this.compositionDealingInstruments, operationalPortfolioComposition.compositionDealingInstruments) &&
        Objects.equals(this.distributorId, operationalPortfolioComposition.distributorId) &&
        Objects.equals(this.historical, operationalPortfolioComposition.historical) &&
        Objects.equals(this.id, operationalPortfolioComposition.id) &&
        Objects.equals(this.inceptionDate, operationalPortfolioComposition.inceptionDate) &&
        Objects.equals(this.operationalPortfolioId, operationalPortfolioComposition.operationalPortfolioId) &&
        Objects.equals(this.statusCode, operationalPortfolioComposition.statusCode) &&
        Objects.equals(this.totalWeight, operationalPortfolioComposition.totalWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositionDealingInstruments, distributorId, historical, id, inceptionDate, operationalPortfolioId, statusCode, totalWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioComposition {\n");
    
    sb.append("    compositionDealingInstruments: ").append(toIndentedString(compositionDealingInstruments)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    historical: ").append(toIndentedString(historical)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
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

