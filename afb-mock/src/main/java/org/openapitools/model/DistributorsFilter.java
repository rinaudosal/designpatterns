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
 * DistributorsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DistributorsFilter   {
  @JsonProperty("listDistributorsId")
  @Valid
  private List<Long> listDistributorsId = null;

  public DistributorsFilter listDistributorsId(List<Long> listDistributorsId) {
    this.listDistributorsId = listDistributorsId;
    return this;
  }

  public DistributorsFilter addListDistributorsIdItem(Long listDistributorsIdItem) {
    if (this.listDistributorsId == null) {
      this.listDistributorsId = new ArrayList<>();
    }
    this.listDistributorsId.add(listDistributorsIdItem);
    return this;
  }

  /**
   * List Ids of {Distributor}.
   * @return listDistributorsId
  **/
  @ApiModelProperty(value = "List Ids of {Distributor}.")


  public List<Long> getListDistributorsId() {
    return listDistributorsId;
  }

  public void setListDistributorsId(List<Long> listDistributorsId) {
    this.listDistributorsId = listDistributorsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributorsFilter distributorsFilter = (DistributorsFilter) o;
    return Objects.equals(this.listDistributorsId, distributorsFilter.listDistributorsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listDistributorsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributorsFilter {\n");
    
    sb.append("    listDistributorsId: ").append(toIndentedString(listDistributorsId)).append("\n");
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

