package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.SavingPlanFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlanFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanFilterAndPageFilter   {
  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  @JsonProperty("savingPlanFilter")
  private SavingPlanFilter savingPlanFilter = null;

  public SavingPlanFilterAndPageFilter pageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
    return this;
  }

  /**
   * Get pageFilter
   * @return pageFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPageFilter() {
    return pageFilter;
  }

  public void setPageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
  }

  public SavingPlanFilterAndPageFilter savingPlanFilter(SavingPlanFilter savingPlanFilter) {
    this.savingPlanFilter = savingPlanFilter;
    return this;
  }

  /**
   * Get savingPlanFilter
   * @return savingPlanFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SavingPlanFilter getSavingPlanFilter() {
    return savingPlanFilter;
  }

  public void setSavingPlanFilter(SavingPlanFilter savingPlanFilter) {
    this.savingPlanFilter = savingPlanFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanFilterAndPageFilter savingPlanFilterAndPageFilter = (SavingPlanFilterAndPageFilter) o;
    return Objects.equals(this.pageFilter, savingPlanFilterAndPageFilter.pageFilter) &&
        Objects.equals(this.savingPlanFilter, savingPlanFilterAndPageFilter.savingPlanFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageFilter, savingPlanFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanFilterAndPageFilter {\n");
    
    sb.append("    pageFilter: ").append(toIndentedString(pageFilter)).append("\n");
    sb.append("    savingPlanFilter: ").append(toIndentedString(savingPlanFilter)).append("\n");
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

