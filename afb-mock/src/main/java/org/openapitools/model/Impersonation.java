package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Impersonation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Impersonation   {
  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("distributorName")
  private String distributorName = null;

  @JsonProperty("marketIds")
  @Valid
  private List<String> marketIds = null;

  @JsonProperty("userIds")
  @Valid
  private List<String> userIds = null;

  public Impersonation distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public Impersonation distributorName(String distributorName) {
    this.distributorName = distributorName;
    return this;
  }

  /**
   * The Name of the {Distributor}
   * @return distributorName
  **/
  @ApiModelProperty(value = "The Name of the {Distributor}")


  public String getDistributorName() {
    return distributorName;
  }

  public void setDistributorName(String distributorName) {
    this.distributorName = distributorName;
  }

  public Impersonation marketIds(List<String> marketIds) {
    this.marketIds = marketIds;
    return this;
  }

  public Impersonation addMarketIdsItem(String marketIdsItem) {
    if (this.marketIds == null) {
      this.marketIds = new ArrayList<>();
    }
    this.marketIds.add(marketIdsItem);
    return this;
  }

  /**
   * Get marketIds
   * @return marketIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getMarketIds() {
    return marketIds;
  }

  public void setMarketIds(List<String> marketIds) {
    this.marketIds = marketIds;
  }

  public Impersonation userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public Impersonation addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * Get userIds
   * @return userIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Impersonation impersonation = (Impersonation) o;
    return Objects.equals(this.distributorId, impersonation.distributorId) &&
        Objects.equals(this.distributorName, impersonation.distributorName) &&
        Objects.equals(this.marketIds, impersonation.marketIds) &&
        Objects.equals(this.userIds, impersonation.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, distributorName, marketIds, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Impersonation {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    distributorName: ").append(toIndentedString(distributorName)).append("\n");
    sb.append("    marketIds: ").append(toIndentedString(marketIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

