package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subdistributor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Subdistributor   {
  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  public Subdistributor distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the Subdistributor's {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the Subdistributor's {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public Subdistributor id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Subdistributor Id
   * @return id
  **/
  @ApiModelProperty(value = "Subdistributor Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Subdistributor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Description Subdistributor
   * @return name
  **/
  @ApiModelProperty(value = "Description Subdistributor")


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
    Subdistributor subdistributor = (Subdistributor) o;
    return Objects.equals(this.distributorId, subdistributor.distributorId) &&
        Objects.equals(this.id, subdistributor.id) &&
        Objects.equals(this.name, subdistributor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subdistributor {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
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

