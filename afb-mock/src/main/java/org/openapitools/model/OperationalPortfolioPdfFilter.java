package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CompositionItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioPdfFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioPdfFilter   {
  @JsonProperty("backtestingPortfolioId")
  private String backtestingPortfolioId = null;

  @JsonProperty("compositionItems")
  @Valid
  private List<CompositionItem> compositionItems = null;

  @JsonProperty("screeningPeriod")
  private OffsetDateTime screeningPeriod = null;

  public OperationalPortfolioPdfFilter backtestingPortfolioId(String backtestingPortfolioId) {
    this.backtestingPortfolioId = backtestingPortfolioId;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolioBacktesting}
   * @return backtestingPortfolioId
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolioBacktesting}")


  public String getBacktestingPortfolioId() {
    return backtestingPortfolioId;
  }

  public void setBacktestingPortfolioId(String backtestingPortfolioId) {
    this.backtestingPortfolioId = backtestingPortfolioId;
  }

  public OperationalPortfolioPdfFilter compositionItems(List<CompositionItem> compositionItems) {
    this.compositionItems = compositionItems;
    return this;
  }

  public OperationalPortfolioPdfFilter addCompositionItemsItem(CompositionItem compositionItemsItem) {
    if (this.compositionItems == null) {
      this.compositionItems = new ArrayList<>();
    }
    this.compositionItems.add(compositionItemsItem);
    return this;
  }

  /**
   * Get compositionItems
   * @return compositionItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CompositionItem> getCompositionItems() {
    return compositionItems;
  }

  public void setCompositionItems(List<CompositionItem> compositionItems) {
    this.compositionItems = compositionItems;
  }

  public OperationalPortfolioPdfFilter screeningPeriod(OffsetDateTime screeningPeriod) {
    this.screeningPeriod = screeningPeriod;
    return this;
  }

  /**
   * Get screeningPeriod
   * @return screeningPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getScreeningPeriod() {
    return screeningPeriod;
  }

  public void setScreeningPeriod(OffsetDateTime screeningPeriod) {
    this.screeningPeriod = screeningPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioPdfFilter operationalPortfolioPdfFilter = (OperationalPortfolioPdfFilter) o;
    return Objects.equals(this.backtestingPortfolioId, operationalPortfolioPdfFilter.backtestingPortfolioId) &&
        Objects.equals(this.compositionItems, operationalPortfolioPdfFilter.compositionItems) &&
        Objects.equals(this.screeningPeriod, operationalPortfolioPdfFilter.screeningPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backtestingPortfolioId, compositionItems, screeningPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioPdfFilter {\n");
    
    sb.append("    backtestingPortfolioId: ").append(toIndentedString(backtestingPortfolioId)).append("\n");
    sb.append("    compositionItems: ").append(toIndentedString(compositionItems)).append("\n");
    sb.append("    screeningPeriod: ").append(toIndentedString(screeningPeriod)).append("\n");
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

