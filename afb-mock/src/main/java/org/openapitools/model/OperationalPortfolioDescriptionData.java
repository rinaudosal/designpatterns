package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OperationalPortfolioDescriptionBasic;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioDescriptionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioDescriptionData   {
  @JsonProperty("descriptionBasic")
  @Valid
  private List<OperationalPortfolioDescriptionBasic> descriptionBasic = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime registrationDate = null;

  public OperationalPortfolioDescriptionData descriptionBasic(List<OperationalPortfolioDescriptionBasic> descriptionBasic) {
    this.descriptionBasic = descriptionBasic;
    return this;
  }

  public OperationalPortfolioDescriptionData addDescriptionBasicItem(OperationalPortfolioDescriptionBasic descriptionBasicItem) {
    if (this.descriptionBasic == null) {
      this.descriptionBasic = new ArrayList<>();
    }
    this.descriptionBasic.add(descriptionBasicItem);
    return this;
  }

  /**
   * The array of {OperationalPortfolioDescriptionData}
   * @return descriptionBasic
  **/
  @ApiModelProperty(value = "The array of {OperationalPortfolioDescriptionData}")

  @Valid

  public List<OperationalPortfolioDescriptionBasic> getDescriptionBasic() {
    return descriptionBasic;
  }

  public void setDescriptionBasic(List<OperationalPortfolioDescriptionBasic> descriptionBasic) {
    this.descriptionBasic = descriptionBasic;
  }

  public OperationalPortfolioDescriptionData registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Date of the monthly analysis for the {OperationalPortfolio}
   * @return registrationDate
  **/
  @ApiModelProperty(value = "Date of the monthly analysis for the {OperationalPortfolio}")

  @Valid

  public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioDescriptionData operationalPortfolioDescriptionData = (OperationalPortfolioDescriptionData) o;
    return Objects.equals(this.descriptionBasic, operationalPortfolioDescriptionData.descriptionBasic) &&
        Objects.equals(this.registrationDate, operationalPortfolioDescriptionData.registrationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionBasic, registrationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioDescriptionData {\n");
    
    sb.append("    descriptionBasic: ").append(toIndentedString(descriptionBasic)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
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

