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
 * RiskScoreScorecardFeatureFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskScoreScorecardFeatureFilter   {
  @JsonProperty("compositionItems")
  @Valid
  private List<CompositionItem> compositionItems = null;

  @JsonProperty("featureId")
  private Long featureId = null;

  public RiskScoreScorecardFeatureFilter compositionItems(List<CompositionItem> compositionItems) {
    this.compositionItems = compositionItems;
    return this;
  }

  public RiskScoreScorecardFeatureFilter addCompositionItemsItem(CompositionItem compositionItemsItem) {
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

  public RiskScoreScorecardFeatureFilter featureId(Long featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * The Id of the {Feature}
   * @return featureId
  **/
  @ApiModelProperty(value = "The Id of the {Feature}")


  public Long getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Long featureId) {
    this.featureId = featureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskScoreScorecardFeatureFilter riskScoreScorecardFeatureFilter = (RiskScoreScorecardFeatureFilter) o;
    return Objects.equals(this.compositionItems, riskScoreScorecardFeatureFilter.compositionItems) &&
        Objects.equals(this.featureId, riskScoreScorecardFeatureFilter.featureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositionItems, featureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskScoreScorecardFeatureFilter {\n");
    
    sb.append("    compositionItems: ").append(toIndentedString(compositionItems)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
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

