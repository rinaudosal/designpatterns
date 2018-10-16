package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SpanishTransferRequestDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferAvailableRequestsDatesAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferAvailableRequestsDatesAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("requestsDates")
  @Valid
  private List<SpanishTransferRequestDate> requestsDates = null;

  public SpanishTransferAvailableRequestsDatesAndPage page(Page page) {
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

  public SpanishTransferAvailableRequestsDatesAndPage requestsDates(List<SpanishTransferRequestDate> requestsDates) {
    this.requestsDates = requestsDates;
    return this;
  }

  public SpanishTransferAvailableRequestsDatesAndPage addRequestsDatesItem(SpanishTransferRequestDate requestsDatesItem) {
    if (this.requestsDates == null) {
      this.requestsDates = new ArrayList<>();
    }
    this.requestsDates.add(requestsDatesItem);
    return this;
  }

  /**
   * The array of available dates. In these dates there are requests associated to a {SpanishTransfer}.
   * @return requestsDates
  **/
  @ApiModelProperty(value = "The array of available dates. In these dates there are requests associated to a {SpanishTransfer}.")

  @Valid

  public List<SpanishTransferRequestDate> getRequestsDates() {
    return requestsDates;
  }

  public void setRequestsDates(List<SpanishTransferRequestDate> requestsDates) {
    this.requestsDates = requestsDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferAvailableRequestsDatesAndPage spanishTransferAvailableRequestsDatesAndPage = (SpanishTransferAvailableRequestsDatesAndPage) o;
    return Objects.equals(this.page, spanishTransferAvailableRequestsDatesAndPage.page) &&
        Objects.equals(this.requestsDates, spanishTransferAvailableRequestsDatesAndPage.requestsDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, requestsDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferAvailableRequestsDatesAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    requestsDates: ").append(toIndentedString(requestsDates)).append("\n");
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

