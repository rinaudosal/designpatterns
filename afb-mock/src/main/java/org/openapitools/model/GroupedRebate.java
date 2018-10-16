package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicRebate;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The {GroupedRebate.dealingFundHouse} is only valid when calling {navigateConsolidatedGroupedRebates}
 */
@ApiModel(description = "The {GroupedRebate.dealingFundHouse} is only valid when calling {navigateConsolidatedGroupedRebates}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GroupedRebate   {
  @JsonProperty("basicRebate")
  private BasicRebate basicRebate = null;

  @JsonProperty("dealingFundHouse")
  private ResourceReference dealingFundHouse = null;

  @JsonProperty("groupingLevelCode")
  private String groupingLevelCode = null;

  public GroupedRebate basicRebate(BasicRebate basicRebate) {
    this.basicRebate = basicRebate;
    return this;
  }

  /**
   * Get basicRebate
   * @return basicRebate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicRebate getBasicRebate() {
    return basicRebate;
  }

  public void setBasicRebate(BasicRebate basicRebate) {
    this.basicRebate = basicRebate;
  }

  public GroupedRebate dealingFundHouse(ResourceReference dealingFundHouse) {
    this.dealingFundHouse = dealingFundHouse;
    return this;
  }

  /**
   * Get dealingFundHouse
   * @return dealingFundHouse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getDealingFundHouse() {
    return dealingFundHouse;
  }

  public void setDealingFundHouse(ResourceReference dealingFundHouse) {
    this.dealingFundHouse = dealingFundHouse;
  }

  public GroupedRebate groupingLevelCode(String groupingLevelCode) {
    this.groupingLevelCode = groupingLevelCode;
    return this;
  }

  /**
   * Indicates the {GroupedRebate} grouping level. Refer to {listRebateGroupingLevels}
   * @return groupingLevelCode
  **/
  @ApiModelProperty(value = "Indicates the {GroupedRebate} grouping level. Refer to {listRebateGroupingLevels}")


  public String getGroupingLevelCode() {
    return groupingLevelCode;
  }

  public void setGroupingLevelCode(String groupingLevelCode) {
    this.groupingLevelCode = groupingLevelCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupedRebate groupedRebate = (GroupedRebate) o;
    return Objects.equals(this.basicRebate, groupedRebate.basicRebate) &&
        Objects.equals(this.dealingFundHouse, groupedRebate.dealingFundHouse) &&
        Objects.equals(this.groupingLevelCode, groupedRebate.groupingLevelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicRebate, dealingFundHouse, groupingLevelCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupedRebate {\n");
    
    sb.append("    basicRebate: ").append(toIndentedString(basicRebate)).append("\n");
    sb.append("    dealingFundHouse: ").append(toIndentedString(dealingFundHouse)).append("\n");
    sb.append("    groupingLevelCode: ").append(toIndentedString(groupingLevelCode)).append("\n");
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

