package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Impersonation;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImpersonationAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ImpersonationAndPage   {
  @JsonProperty("impersonations")
  @Valid
  private List<Impersonation> impersonations = null;

  @JsonProperty("page")
  private Page page = null;

  public ImpersonationAndPage impersonations(List<Impersonation> impersonations) {
    this.impersonations = impersonations;
    return this;
  }

  public ImpersonationAndPage addImpersonationsItem(Impersonation impersonationsItem) {
    if (this.impersonations == null) {
      this.impersonations = new ArrayList<>();
    }
    this.impersonations.add(impersonationsItem);
    return this;
  }

  /**
   * Get impersonations
   * @return impersonations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Impersonation> getImpersonations() {
    return impersonations;
  }

  public void setImpersonations(List<Impersonation> impersonations) {
    this.impersonations = impersonations;
  }

  public ImpersonationAndPage page(Page page) {
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
    ImpersonationAndPage impersonationAndPage = (ImpersonationAndPage) o;
    return Objects.equals(this.impersonations, impersonationAndPage.impersonations) &&
        Objects.equals(this.page, impersonationAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impersonations, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpersonationAndPage {\n");
    
    sb.append("    impersonations: ").append(toIndentedString(impersonations)).append("\n");
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

