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
 * Its function is the administration and representation of Collective Investment Institutions. Its obligations include keeping the books for the fund, determining the value of units, issuing certificates for the unit holders in the fund, and selecting the securities which will comprise the fund (Fund Mgmt. Co.).
 */
@ApiModel(description = "Its function is the administration and representation of Collective Investment Institutions. Its obligations include keeping the books for the fund, determining the value of units, issuing certificates for the unit holders in the fund, and selecting the securities which will comprise the fund (Fund Mgmt. Co.).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundHouse   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fundHouseGroupId")
  private Long fundHouseGroupId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("logoUrls")
  @Valid
  private List<KeyValue> logoUrls = null;

  @JsonProperty("name")
  private String name = null;

  public FundHouse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of {FundHouse}
   * @return description
  **/
  @ApiModelProperty(value = "description of {FundHouse}")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FundHouse fundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
    return this;
  }

  /**
   * The Id of the {FundHouseGroup}
   * @return fundHouseGroupId
  **/
  @ApiModelProperty(value = "The Id of the {FundHouseGroup}")


  public Long getFundHouseGroupId() {
    return fundHouseGroupId;
  }

  public void setFundHouseGroupId(Long fundHouseGroupId) {
    this.fundHouseGroupId = fundHouseGroupId;
  }

  public FundHouse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Fund house
   * @return id
  **/
  @ApiModelProperty(value = "Fund house")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FundHouse logoUrls(List<KeyValue> logoUrls) {
    this.logoUrls = logoUrls;
    return this;
  }

  public FundHouse addLogoUrlsItem(KeyValue logoUrlsItem) {
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

  public FundHouse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name Fund House
   * @return name
  **/
  @ApiModelProperty(value = "Name Fund House")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundHouse fundHouse = (FundHouse) o;
    return Objects.equals(this.description, fundHouse.description) &&
        Objects.equals(this.fundHouseGroupId, fundHouse.fundHouseGroupId) &&
        Objects.equals(this.id, fundHouse.id) &&
        Objects.equals(this.logoUrls, fundHouse.logoUrls) &&
        Objects.equals(this.name, fundHouse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fundHouseGroupId, id, logoUrls, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundHouse {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fundHouseGroupId: ").append(toIndentedString(fundHouseGroupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

