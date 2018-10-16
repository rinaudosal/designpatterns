package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RatingsSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RatingsSearchFilter   {
  @JsonProperty("blueRating")
  private NumberComparisonFilter blueRating = null;

  @JsonProperty("citywire")
  private NumberComparisonFilter citywire = null;

  @JsonProperty("morningStar")
  private NumberComparisonFilter morningStar = null;

  public RatingsSearchFilter blueRating(NumberComparisonFilter blueRating) {
    this.blueRating = blueRating;
    return this;
  }

  /**
   * Get blueRating
   * @return blueRating
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getBlueRating() {
    return blueRating;
  }

  public void setBlueRating(NumberComparisonFilter blueRating) {
    this.blueRating = blueRating;
  }

  public RatingsSearchFilter citywire(NumberComparisonFilter citywire) {
    this.citywire = citywire;
    return this;
  }

  /**
   * Get citywire
   * @return citywire
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getCitywire() {
    return citywire;
  }

  public void setCitywire(NumberComparisonFilter citywire) {
    this.citywire = citywire;
  }

  public RatingsSearchFilter morningStar(NumberComparisonFilter morningStar) {
    this.morningStar = morningStar;
    return this;
  }

  /**
   * Get morningStar
   * @return morningStar
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getMorningStar() {
    return morningStar;
  }

  public void setMorningStar(NumberComparisonFilter morningStar) {
    this.morningStar = morningStar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingsSearchFilter ratingsSearchFilter = (RatingsSearchFilter) o;
    return Objects.equals(this.blueRating, ratingsSearchFilter.blueRating) &&
        Objects.equals(this.citywire, ratingsSearchFilter.citywire) &&
        Objects.equals(this.morningStar, ratingsSearchFilter.morningStar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueRating, citywire, morningStar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingsSearchFilter {\n");
    
    sb.append("    blueRating: ").append(toIndentedString(blueRating)).append("\n");
    sb.append("    citywire: ").append(toIndentedString(citywire)).append("\n");
    sb.append("    morningStar: ").append(toIndentedString(morningStar)).append("\n");
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

