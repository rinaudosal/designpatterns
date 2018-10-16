package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GenericBreakdown   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("weight")
  private Double weight = null;

  public GenericBreakdown code(String code) {
    this.code = code;
    return this;
  }

  /**
   * This attributes contains the Breakdown code. It can be a code from the  * {listAssetAllocations} * {listCreditQualities} * {listCurrencies} * {listGeographicAreas} * {listSectors} 
   * @return code
  **/
  @ApiModelProperty(value = "This attributes contains the Breakdown code. It can be a code from the  * {listAssetAllocations} * {listCreditQualities} * {listCurrencies} * {listGeographicAreas} * {listSectors} ")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GenericBreakdown date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date.
   * @return date
  **/
  @ApiModelProperty(value = "Date.")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public GenericBreakdown description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description.
   * @return description
  **/
  @ApiModelProperty(value = "Description.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GenericBreakdown weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight.
   * @return weight
  **/
  @ApiModelProperty(value = "Weight.")


  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericBreakdown genericBreakdown = (GenericBreakdown) o;
    return Objects.equals(this.code, genericBreakdown.code) &&
        Objects.equals(this.date, genericBreakdown.date) &&
        Objects.equals(this.description, genericBreakdown.description) &&
        Objects.equals(this.weight, genericBreakdown.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, date, description, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericBreakdown {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

