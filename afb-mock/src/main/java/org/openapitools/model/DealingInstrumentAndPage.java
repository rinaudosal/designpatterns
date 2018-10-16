package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DealingInstrument;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {DealingInstrument} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {DealingInstrument} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingInstrumentAndPage   {
  @JsonProperty("dealingInstruments")
  @Valid
  private List<DealingInstrument> dealingInstruments = null;

  @JsonProperty("page")
  private Page page = null;

  public DealingInstrumentAndPage dealingInstruments(List<DealingInstrument> dealingInstruments) {
    this.dealingInstruments = dealingInstruments;
    return this;
  }

  public DealingInstrumentAndPage addDealingInstrumentsItem(DealingInstrument dealingInstrumentsItem) {
    if (this.dealingInstruments == null) {
      this.dealingInstruments = new ArrayList<>();
    }
    this.dealingInstruments.add(dealingInstrumentsItem);
    return this;
  }

  /**
   * The array of {DealingInstrument}
   * @return dealingInstruments
  **/
  @ApiModelProperty(value = "The array of {DealingInstrument}")

  @Valid

  public List<DealingInstrument> getDealingInstruments() {
    return dealingInstruments;
  }

  public void setDealingInstruments(List<DealingInstrument> dealingInstruments) {
    this.dealingInstruments = dealingInstruments;
  }

  public DealingInstrumentAndPage page(Page page) {
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
    DealingInstrumentAndPage dealingInstrumentAndPage = (DealingInstrumentAndPage) o;
    return Objects.equals(this.dealingInstruments, dealingInstrumentAndPage.dealingInstruments) &&
        Objects.equals(this.page, dealingInstrumentAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingInstruments, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingInstrumentAndPage {\n");
    
    sb.append("    dealingInstruments: ").append(toIndentedString(dealingInstruments)).append("\n");
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

