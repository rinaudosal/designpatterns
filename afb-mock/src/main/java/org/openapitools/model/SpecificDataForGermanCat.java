package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdditionalInformationForCapitalPreservation;
import org.openapitools.model.Characteristics;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecificDataForGermanCat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpecificDataForGermanCat   {
  @JsonProperty("additionalInformationForCapitalPreservation")
  private AdditionalInformationForCapitalPreservation additionalInformationForCapitalPreservation = null;

  @JsonProperty("characteristics")
  private Characteristics characteristics = null;

  public SpecificDataForGermanCat additionalInformationForCapitalPreservation(AdditionalInformationForCapitalPreservation additionalInformationForCapitalPreservation) {
    this.additionalInformationForCapitalPreservation = additionalInformationForCapitalPreservation;
    return this;
  }

  /**
   * Get additionalInformationForCapitalPreservation
   * @return additionalInformationForCapitalPreservation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalInformationForCapitalPreservation getAdditionalInformationForCapitalPreservation() {
    return additionalInformationForCapitalPreservation;
  }

  public void setAdditionalInformationForCapitalPreservation(AdditionalInformationForCapitalPreservation additionalInformationForCapitalPreservation) {
    this.additionalInformationForCapitalPreservation = additionalInformationForCapitalPreservation;
  }

  public SpecificDataForGermanCat characteristics(Characteristics characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  /**
   * Get characteristics
   * @return characteristics
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Characteristics getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(Characteristics characteristics) {
    this.characteristics = characteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificDataForGermanCat specificDataForGermanCat = (SpecificDataForGermanCat) o;
    return Objects.equals(this.additionalInformationForCapitalPreservation, specificDataForGermanCat.additionalInformationForCapitalPreservation) &&
        Objects.equals(this.characteristics, specificDataForGermanCat.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformationForCapitalPreservation, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificDataForGermanCat {\n");
    
    sb.append("    additionalInformationForCapitalPreservation: ").append(toIndentedString(additionalInformationForCapitalPreservation)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
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

