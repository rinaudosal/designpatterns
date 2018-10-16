package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BrokerFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrokerFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BrokerFilterAndPageFilter   {
  @JsonProperty("brokerFilter")
  private BrokerFilter brokerFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public BrokerFilterAndPageFilter brokerFilter(BrokerFilter brokerFilter) {
    this.brokerFilter = brokerFilter;
    return this;
  }

  /**
   * Get brokerFilter
   * @return brokerFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BrokerFilter getBrokerFilter() {
    return brokerFilter;
  }

  public void setBrokerFilter(BrokerFilter brokerFilter) {
    this.brokerFilter = brokerFilter;
  }

  public BrokerFilterAndPageFilter page(PageFilter page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPage() {
    return page;
  }

  public void setPage(PageFilter page) {
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
    BrokerFilterAndPageFilter brokerFilterAndPageFilter = (BrokerFilterAndPageFilter) o;
    return Objects.equals(this.brokerFilter, brokerFilterAndPageFilter.brokerFilter) &&
        Objects.equals(this.page, brokerFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerFilterAndPageFilter {\n");
    
    sb.append("    brokerFilter: ").append(toIndentedString(brokerFilter)).append("\n");
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

