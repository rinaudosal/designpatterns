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
 * MigratedObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MigratedObject   {
  @JsonProperty("ids")
  @Valid
  private List<String> ids = null;

  @JsonProperty("isDistribuidora")
  private Boolean isDistribuidora = null;

  public MigratedObject ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public MigratedObject addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
  **/
  @ApiModelProperty(value = "")


  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public MigratedObject isDistribuidora(Boolean isDistribuidora) {
    this.isDistribuidora = isDistribuidora;
    return this;
  }

  /**
   * Name of Save search
   * @return isDistribuidora
  **/
  @ApiModelProperty(value = "Name of Save search")


  public Boolean getIsDistribuidora() {
    return isDistribuidora;
  }

  public void setIsDistribuidora(Boolean isDistribuidora) {
    this.isDistribuidora = isDistribuidora;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigratedObject migratedObject = (MigratedObject) o;
    return Objects.equals(this.ids, migratedObject.ids) &&
        Objects.equals(this.isDistribuidora, migratedObject.isDistribuidora);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, isDistribuidora);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigratedObject {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    isDistribuidora: ").append(toIndentedString(isDistribuidora)).append("\n");
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

