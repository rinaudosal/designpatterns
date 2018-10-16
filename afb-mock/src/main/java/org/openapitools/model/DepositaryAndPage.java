package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Depositary;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Depositary} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Depositary} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DepositaryAndPage   {
  @JsonProperty("depositaries")
  @Valid
  private List<Depositary> depositaries = null;

  @JsonProperty("page")
  private Page page = null;

  public DepositaryAndPage depositaries(List<Depositary> depositaries) {
    this.depositaries = depositaries;
    return this;
  }

  public DepositaryAndPage addDepositariesItem(Depositary depositariesItem) {
    if (this.depositaries == null) {
      this.depositaries = new ArrayList<>();
    }
    this.depositaries.add(depositariesItem);
    return this;
  }

  /**
   * The array of {Depositary}
   * @return depositaries
  **/
  @ApiModelProperty(value = "The array of {Depositary}")

  @Valid

  public List<Depositary> getDepositaries() {
    return depositaries;
  }

  public void setDepositaries(List<Depositary> depositaries) {
    this.depositaries = depositaries;
  }

  public DepositaryAndPage page(Page page) {
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
    DepositaryAndPage depositaryAndPage = (DepositaryAndPage) o;
    return Objects.equals(this.depositaries, depositaryAndPage.depositaries) &&
        Objects.equals(this.page, depositaryAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositaries, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositaryAndPage {\n");
    
    sb.append("    depositaries: ").append(toIndentedString(depositaries)).append("\n");
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

