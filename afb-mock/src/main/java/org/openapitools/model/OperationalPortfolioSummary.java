package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationalPortfolioBasicData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioSummary   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("operationalPortfolioBasicData")
  private OperationalPortfolioBasicData operationalPortfolioBasicData = null;

  public OperationalPortfolioSummary id(Long id) {
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

  public OperationalPortfolioSummary operationalPortfolioBasicData(OperationalPortfolioBasicData operationalPortfolioBasicData) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioSummary operationalPortfolioSummary = (OperationalPortfolioSummary) o;
    return Objects.equals(this.id, operationalPortfolioSummary.id) &&
        Objects.equals(this.operationalPortfolioBasicData, operationalPortfolioSummary.operationalPortfolioBasicData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operationalPortfolioBasicData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationalPortfolioBasicData: ").append(toIndentedString(operationalPortfolioBasicData)).append("\n");
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

