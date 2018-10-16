package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RankingAndResourceReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RankingAndResourceReference   {
  @JsonProperty("calculationDate")
  private OffsetDateTime calculationDate = null;

  @JsonProperty("ranking")
  private Long ranking = null;

  @JsonProperty("resource")
  private ResourceReference resource = null;

  public RankingAndResourceReference calculationDate(OffsetDateTime calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

  /**
   * The ranking calculation date.
   * @return calculationDate
  **/
  @ApiModelProperty(value = "The ranking calculation date.")

  @Valid

  public OffsetDateTime getCalculationDate() {
    return calculationDate;
  }

  public void setCalculationDate(OffsetDateTime calculationDate) {
    this.calculationDate = calculationDate;
  }

  public RankingAndResourceReference ranking(Long ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * ranking of fund in this market
   * @return ranking
  **/
  @ApiModelProperty(value = "ranking of fund in this market")


  public Long getRanking() {
    return ranking;
  }

  public void setRanking(Long ranking) {
    this.ranking = ranking;
  }

  public RankingAndResourceReference resource(ResourceReference resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getResource() {
    return resource;
  }

  public void setResource(ResourceReference resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingAndResourceReference rankingAndResourceReference = (RankingAndResourceReference) o;
    return Objects.equals(this.calculationDate, rankingAndResourceReference.calculationDate) &&
        Objects.equals(this.ranking, rankingAndResourceReference.ranking) &&
        Objects.equals(this.resource, rankingAndResourceReference.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationDate, ranking, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingAndResourceReference {\n");
    
    sb.append("    calculationDate: ").append(toIndentedString(calculationDate)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

