package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A &#x60;ResourceReference&#x60; is a generic object that allows the API to reference resources in diferent API method. 
 */
@ApiModel(description = "A `ResourceReference` is a generic object that allows the API to reference resources in diferent API method. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ResourceReference   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("url")
  private String url = null;

  public ResourceReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The `id` of the refered resource. It can be used as a unique key by the {Consumer}.
   * @return id
  **/
  @ApiModelProperty(value = "The `id` of the refered resource. It can be used as a unique key by the {Consumer}.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResourceReference label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The `label` of the refered resource. It is usually a user friendly name that can be presented to the final User by the Consumer.
   * @return label
  **/
  @ApiModelProperty(value = "The `label` of the refered resource. It is usually a user friendly name that can be presented to the final User by the Consumer.")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ResourceReference url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The `url` at which the refered resource is available.
   * @return url
  **/
  @ApiModelProperty(value = "The `url` at which the refered resource is available.")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceReference resourceReference = (ResourceReference) o;
    return Objects.equals(this.id, resourceReference.id) &&
        Objects.equals(this.label, resourceReference.label) &&
        Objects.equals(this.url, resourceReference.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

