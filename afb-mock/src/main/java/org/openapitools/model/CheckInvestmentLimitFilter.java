package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CompositionItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckInvestmentLimitFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CheckInvestmentLimitFilter   {
  @JsonProperty("compositionItems")
  @Valid
  private List<CompositionItem> compositionItems = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  public CheckInvestmentLimitFilter compositionItems(List<CompositionItem> compositionItems) {
    this.compositionItems = compositionItems;
    return this;
  }

  public CheckInvestmentLimitFilter addCompositionItemsItem(CompositionItem compositionItemsItem) {
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

  public CheckInvestmentLimitFilter operationalPortfolioId(Long operationalPortfolioId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckInvestmentLimitFilter checkInvestmentLimitFilter = (CheckInvestmentLimitFilter) o;
    return Objects.equals(this.compositionItems, checkInvestmentLimitFilter.compositionItems) &&
        Objects.equals(this.operationalPortfolioId, checkInvestmentLimitFilter.operationalPortfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositionItems, operationalPortfolioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInvestmentLimitFilter {\n");
    
    sb.append("    compositionItems: ").append(toIndentedString(compositionItems)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
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

