package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Broker;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Broker} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Broker} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BrokerAndPage   {
  @JsonProperty("brokers")
  @Valid
  private List<Broker> brokers = null;

  @JsonProperty("page")
  private Page page = null;

  public BrokerAndPage brokers(List<Broker> brokers) {
    this.brokers = brokers;
    return this;
  }

  public BrokerAndPage addBrokersItem(Broker brokersItem) {
    if (this.brokers == null) {
      this.brokers = new ArrayList<>();
    }
    this.brokers.add(brokersItem);
    return this;
  }

  /**
   * The array of {Broker}
   * @return brokers
  **/
  @ApiModelProperty(value = "The array of {Broker}")

  @Valid

  public List<Broker> getBrokers() {
    return brokers;
  }

  public void setBrokers(List<Broker> brokers) {
    this.brokers = brokers;
  }

  public BrokerAndPage page(Page page) {
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
    BrokerAndPage brokerAndPage = (BrokerAndPage) o;
    return Objects.equals(this.brokers, brokerAndPage.brokers) &&
        Objects.equals(this.page, brokerAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokers, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerAndPage {\n");
    
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
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

