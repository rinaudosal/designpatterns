package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.WeightedResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Composition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Composition   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("resources")
  @Valid
  private List<WeightedResourceReference> resources = null;

  public Composition date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Composition id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Composition resources(List<WeightedResourceReference> resources) {
    this.resources = resources;
    return this;
  }

  public Composition addResourcesItem(WeightedResourceReference resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WeightedResourceReference> getResources() {
    return resources;
  }

  public void setResources(List<WeightedResourceReference> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Composition composition = (Composition) o;
    return Objects.equals(this.date, composition.date) &&
        Objects.equals(this.id, composition.id) &&
        Objects.equals(this.resources, composition.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Composition {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

