package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeyValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingFundHouse
 */
@ApiModel(description = "DealingFundHouse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingFundHouse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("logoUrls")
  @Valid
  private List<KeyValue> logoUrls = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("swiftPermitted")
  private Boolean swiftPermitted = null;

  public DealingFundHouse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * DealingFundHouse Id
   * @return id
  **/
  @ApiModelProperty(value = "DealingFundHouse Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DealingFundHouse logoUrls(List<KeyValue> logoUrls) {
    this.logoUrls = logoUrls;
    return this;
  }

  public DealingFundHouse addLogoUrlsItem(KeyValue logoUrlsItem) {
    if (this.logoUrls == null) {
      this.logoUrls = new ArrayList<>();
    }
    this.logoUrls.add(logoUrlsItem);
    return this;
  }

  /**
   * This attribute contains the list of available logos for this DealingFundHouse. Each {KeyValue.key} contains a code whose value can be either `BIG`, `MEDIUM`, `SMALL` depending on the size of the image. Each {KeyValue.value} contains the URL to the image. 
   * @return logoUrls
  **/
  @ApiModelProperty(value = "This attribute contains the list of available logos for this DealingFundHouse. Each {KeyValue.key} contains a code whose value can be either `BIG`, `MEDIUM`, `SMALL` depending on the size of the image. Each {KeyValue.value} contains the URL to the image. ")

  @Valid

  public List<KeyValue> getLogoUrls() {
    return logoUrls;
  }

  public void setLogoUrls(List<KeyValue> logoUrls) {
    this.logoUrls = logoUrls;
  }

  public DealingFundHouse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * DealingFundHouse description
   * @return name
  **/
  @ApiModelProperty(value = "DealingFundHouse description")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DealingFundHouse swiftPermitted(Boolean swiftPermitted) {
    this.swiftPermitted = swiftPermitted;
    return this;
  }

  /**
   * Indicates whether the entity can use SWIFT network.
   * @return swiftPermitted
  **/
  @ApiModelProperty(value = "Indicates whether the entity can use SWIFT network.")


  public Boolean getSwiftPermitted() {
    return swiftPermitted;
  }

  public void setSwiftPermitted(Boolean swiftPermitted) {
    this.swiftPermitted = swiftPermitted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealingFundHouse dealingFundHouse = (DealingFundHouse) o;
    return Objects.equals(this.id, dealingFundHouse.id) &&
        Objects.equals(this.logoUrls, dealingFundHouse.logoUrls) &&
        Objects.equals(this.name, dealingFundHouse.name) &&
        Objects.equals(this.swiftPermitted, dealingFundHouse.swiftPermitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logoUrls, name, swiftPermitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingFundHouse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    swiftPermitted: ").append(toIndentedString(swiftPermitted)).append("\n");
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

