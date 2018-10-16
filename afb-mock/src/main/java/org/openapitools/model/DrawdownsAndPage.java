package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Drawdown;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Drawdown} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Drawdown} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DrawdownsAndPage   {
  @JsonProperty("drawdowns")
  @Valid
  private List<Drawdown> drawdowns = null;

  @JsonProperty("page")
  private Page page = null;

  public DrawdownsAndPage drawdowns(List<Drawdown> drawdowns) {
    this.drawdowns = drawdowns;
    return this;
  }

  public DrawdownsAndPage addDrawdownsItem(Drawdown drawdownsItem) {
    if (this.drawdowns == null) {
      this.drawdowns = new ArrayList<>();
    }
    this.drawdowns.add(drawdownsItem);
    return this;
  }

  /**
   * The array of {Drawdown}
   * @return drawdowns
  **/
  @ApiModelProperty(value = "The array of {Drawdown}")

  @Valid

  public List<Drawdown> getDrawdowns() {
    return drawdowns;
  }

  public void setDrawdowns(List<Drawdown> drawdowns) {
    this.drawdowns = drawdowns;
  }

  public DrawdownsAndPage page(Page page) {
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
    DrawdownsAndPage drawdownsAndPage = (DrawdownsAndPage) o;
    return Objects.equals(this.drawdowns, drawdownsAndPage.drawdowns) &&
        Objects.equals(this.page, drawdownsAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drawdowns, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawdownsAndPage {\n");
    
    sb.append("    drawdowns: ").append(toIndentedString(drawdowns)).append("\n");
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

