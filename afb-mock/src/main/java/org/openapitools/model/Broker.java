package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A broker acts as an agent or intermediary for a buyer and a seller. The buyer, seller, and broker may all be individuals, or one or more may be a business or other institution.
 */
@ApiModel(description = "A broker acts as an agent or intermediary for a buyer and a seller. The buyer, seller, and broker may all be individuals, or one or more may be a business or other institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Broker   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  public Broker id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Broker Id
   * @return id
  **/
  @ApiModelProperty(value = "Broker Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Broker name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Broker name
   * @return name
  **/
  @ApiModelProperty(value = "Broker name")


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
    Broker broker = (Broker) o;
    return Objects.equals(this.id, broker.id) &&
        Objects.equals(this.name, broker.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Broker {\n");
    
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

