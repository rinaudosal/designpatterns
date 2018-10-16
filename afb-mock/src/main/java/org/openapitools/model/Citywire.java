package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Manager;
import org.openapitools.model.Rating;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The rating from http://citywire.co.uk/wealth-manager/rated-fund-managers(Citywire)
 */
@ApiModel(description = "The rating from http://citywire.co.uk/wealth-manager/rated-fund-managers(Citywire)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Citywire   {
  @JsonProperty("manager")
  private Manager manager = null;

  @JsonProperty("rating")
  private Rating rating = null;

  public Citywire manager(Manager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Manager getManager() {
    return manager;
  }

  public void setManager(Manager manager) {
    this.manager = manager;
  }

  public Citywire rating(Rating rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Citywire citywire = (Citywire) o;
    return Objects.equals(this.manager, citywire.manager) &&
        Objects.equals(this.rating, citywire.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manager, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Citywire {\n");
    
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

