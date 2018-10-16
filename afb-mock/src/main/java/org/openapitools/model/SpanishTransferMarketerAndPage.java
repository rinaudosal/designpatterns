package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SpanishTransferMarketer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferMarketerAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferMarketerAndPage   {
  @JsonProperty("marketers")
  @Valid
  private List<SpanishTransferMarketer> marketers = null;

  @JsonProperty("page")
  private Page page = null;

  public SpanishTransferMarketerAndPage marketers(List<SpanishTransferMarketer> marketers) {
    this.marketers = marketers;
    return this;
  }

  public SpanishTransferMarketerAndPage addMarketersItem(SpanishTransferMarketer marketersItem) {
    if (this.marketers == null) {
      this.marketers = new ArrayList<>();
    }
    this.marketers.add(marketersItem);
    return this;
  }

  /**
   * Get marketers
   * @return marketers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SpanishTransferMarketer> getMarketers() {
    return marketers;
  }

  public void setMarketers(List<SpanishTransferMarketer> marketers) {
    this.marketers = marketers;
  }

  public SpanishTransferMarketerAndPage page(Page page) {
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
    SpanishTransferMarketerAndPage spanishTransferMarketerAndPage = (SpanishTransferMarketerAndPage) o;
    return Objects.equals(this.marketers, spanishTransferMarketerAndPage.marketers) &&
        Objects.equals(this.page, spanishTransferMarketerAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketers, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferMarketerAndPage {\n");
    
    sb.append("    marketers: ").append(toIndentedString(marketers)).append("\n");
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

