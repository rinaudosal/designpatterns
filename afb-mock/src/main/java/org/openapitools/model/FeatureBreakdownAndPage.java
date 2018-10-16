package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeyValue;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeatureBreakdownAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FeatureBreakdownAndPage   {
  @JsonProperty("featureBreakdowns")
  @Valid
  private List<KeyValue> featureBreakdowns = null;

  @JsonProperty("page")
  private Page page = null;

  public FeatureBreakdownAndPage featureBreakdowns(List<KeyValue> featureBreakdowns) {
    this.featureBreakdowns = featureBreakdowns;
    return this;
  }

  public FeatureBreakdownAndPage addFeatureBreakdownsItem(KeyValue featureBreakdownsItem) {
    if (this.featureBreakdowns == null) {
      this.featureBreakdowns = new ArrayList<>();
    }
    this.featureBreakdowns.add(featureBreakdownsItem);
    return this;
  }

  /**
   * The Graph legend
   * @return featureBreakdowns
  **/
  @ApiModelProperty(value = "The Graph legend")

  @Valid

  public List<KeyValue> getFeatureBreakdowns() {
    return featureBreakdowns;
  }

  public void setFeatureBreakdowns(List<KeyValue> featureBreakdowns) {
    this.featureBreakdowns = featureBreakdowns;
  }

  public FeatureBreakdownAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureBreakdownAndPage featureBreakdownAndPage = (FeatureBreakdownAndPage) o;
    return Objects.equals(this.featureBreakdowns, featureBreakdownAndPage.featureBreakdowns) &&
        Objects.equals(this.page, featureBreakdownAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureBreakdowns, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureBreakdownAndPage {\n");
    
    sb.append("    featureBreakdowns: ").append(toIndentedString(featureBreakdowns)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

