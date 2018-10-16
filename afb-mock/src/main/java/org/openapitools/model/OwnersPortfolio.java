package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A &#x60;OwnersPortfolio&#x60; is a generic object, identifies the owners of portfolio. 
 */
@ApiModel(description = "A `OwnersPortfolio` is a generic object, identifies the owners of portfolio. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OwnersPortfolio   {
  @JsonProperty("distributorId")
  private String distributorId = null;

  @JsonProperty("distributorName")
  private String distributorName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public OwnersPortfolio distributorId(String distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The `distributorId` owner's distributors.
   * @return distributorId
  **/
  @ApiModelProperty(value = "The `distributorId` owner's distributors.")


  public String getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(String distributorId) {
    this.distributorId = distributorId;
  }

  public OwnersPortfolio distributorName(String distributorName) {
    this.distributorName = distributorName;
    return this;
  }

  /**
   * The `distributorName` distributors name.
   * @return distributorName
  **/
  @ApiModelProperty(value = "The `distributorName` distributors name.")


  public String getDistributorName() {
    return distributorName;
  }

  public void setDistributorName(String distributorName) {
    this.distributorName = distributorName;
  }

  public OwnersPortfolio id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The `id` owner.
   * @return id
  **/
  @ApiModelProperty(value = "The `id` owner.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OwnersPortfolio name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The `name` of owner.
   * @return name
  **/
  @ApiModelProperty(value = "The `name` of owner.")


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
    OwnersPortfolio ownersPortfolio = (OwnersPortfolio) o;
    return Objects.equals(this.distributorId, ownersPortfolio.distributorId) &&
        Objects.equals(this.distributorName, ownersPortfolio.distributorName) &&
        Objects.equals(this.id, ownersPortfolio.id) &&
        Objects.equals(this.name, ownersPortfolio.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, distributorName, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnersPortfolio {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    distributorName: ").append(toIndentedString(distributorName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

