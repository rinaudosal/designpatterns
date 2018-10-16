package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockExchange
 */
@ApiModel(description = "StockExchange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockExchange   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public StockExchange id(String id) {
    this.id = id;
    return this;
  }

  /**
   * StockExchange Id
   * @return id
  **/
  @ApiModelProperty(value = "StockExchange Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StockExchange name(String name) {
    this.name = name;
    return this;
  }

  /**
   * StockExchange description
   * @return name
  **/
  @ApiModelProperty(value = "StockExchange description")


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
    StockExchange stockExchange = (StockExchange) o;
    return Objects.equals(this.id, stockExchange.id) &&
        Objects.equals(this.name, stockExchange.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockExchange {\n");
    
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

