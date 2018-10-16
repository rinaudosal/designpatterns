package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CorporateAction;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {CorporateAction} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {CorporateAction} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CorporateActionAndPage   {
  @JsonProperty("corporateActions")
  @Valid
  private List<CorporateAction> corporateActions = null;

  @JsonProperty("page")
  private Page page = null;

  public CorporateActionAndPage corporateActions(List<CorporateAction> corporateActions) {
    this.corporateActions = corporateActions;
    return this;
  }

  public CorporateActionAndPage addCorporateActionsItem(CorporateAction corporateActionsItem) {
    if (this.corporateActions == null) {
      this.corporateActions = new ArrayList<>();
    }
    this.corporateActions.add(corporateActionsItem);
    return this;
  }

  /**
   * The array of {CorporateAction}
   * @return corporateActions
  **/
  @ApiModelProperty(value = "The array of {CorporateAction}")

  @Valid

  public List<CorporateAction> getCorporateActions() {
    return corporateActions;
  }

  public void setCorporateActions(List<CorporateAction> corporateActions) {
    this.corporateActions = corporateActions;
  }

  public CorporateActionAndPage page(Page page) {
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
    CorporateActionAndPage corporateActionAndPage = (CorporateActionAndPage) o;
    return Objects.equals(this.corporateActions, corporateActionAndPage.corporateActions) &&
        Objects.equals(this.page, corporateActionAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateActions, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateActionAndPage {\n");
    
    sb.append("    corporateActions: ").append(toIndentedString(corporateActions)).append("\n");
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

