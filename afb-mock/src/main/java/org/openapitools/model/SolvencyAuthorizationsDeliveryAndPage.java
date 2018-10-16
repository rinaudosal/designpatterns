package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SolvencyAuthorizationDelivery;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {SolvencyAuthorizationDelivery} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {SolvencyAuthorizationDelivery} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationsDeliveryAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("solvencyAuthorizations")
  @Valid
  private List<SolvencyAuthorizationDelivery> solvencyAuthorizations = null;

  public SolvencyAuthorizationsDeliveryAndPage page(Page page) {
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

  public SolvencyAuthorizationsDeliveryAndPage solvencyAuthorizations(List<SolvencyAuthorizationDelivery> solvencyAuthorizations) {
    this.solvencyAuthorizations = solvencyAuthorizations;
    return this;
  }

  public SolvencyAuthorizationsDeliveryAndPage addSolvencyAuthorizationsItem(SolvencyAuthorizationDelivery solvencyAuthorizationsItem) {
    if (this.solvencyAuthorizations == null) {
      this.solvencyAuthorizations = new ArrayList<>();
    }
    this.solvencyAuthorizations.add(solvencyAuthorizationsItem);
    return this;
  }

  /**
   * The array of {SolvencyAuthorization}
   * @return solvencyAuthorizations
  **/
  @ApiModelProperty(value = "The array of {SolvencyAuthorization}")

  @Valid

  public List<SolvencyAuthorizationDelivery> getSolvencyAuthorizations() {
    return solvencyAuthorizations;
  }

  public void setSolvencyAuthorizations(List<SolvencyAuthorizationDelivery> solvencyAuthorizations) {
    this.solvencyAuthorizations = solvencyAuthorizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyAuthorizationsDeliveryAndPage solvencyAuthorizationsDeliveryAndPage = (SolvencyAuthorizationsDeliveryAndPage) o;
    return Objects.equals(this.page, solvencyAuthorizationsDeliveryAndPage.page) &&
        Objects.equals(this.solvencyAuthorizations, solvencyAuthorizationsDeliveryAndPage.solvencyAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, solvencyAuthorizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationsDeliveryAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    solvencyAuthorizations: ").append(toIndentedString(solvencyAuthorizations)).append("\n");
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

