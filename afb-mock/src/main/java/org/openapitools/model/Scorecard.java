package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ScorecardFeatureDetails;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Scorecard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Scorecard   {
  @JsonProperty("assigned")
  private Boolean assigned = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("featureDetails")
  @Valid
  private List<ScorecardFeatureDetails> featureDetails = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public Scorecard assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }

  /**
   * If the Scorecard is currently assigned to a {OperationalPortfolio}
   * @return assigned
  **/
  @ApiModelProperty(value = "If the Scorecard is currently assigned to a {OperationalPortfolio}")


  public Boolean getAssigned() {
    return assigned;
  }

  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }

  public Scorecard distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public Scorecard featureDetails(List<ScorecardFeatureDetails> featureDetails) {
    this.featureDetails = featureDetails;
    return this;
  }

  public Scorecard addFeatureDetailsItem(ScorecardFeatureDetails featureDetailsItem) {
    if (this.featureDetails == null) {
      this.featureDetails = new ArrayList<>();
    }
    this.featureDetails.add(featureDetailsItem);
    return this;
  }

  /**
   * Get featureDetails
   * @return featureDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ScorecardFeatureDetails> getFeatureDetails() {
    return featureDetails;
  }

  public void setFeatureDetails(List<ScorecardFeatureDetails> featureDetails) {
    this.featureDetails = featureDetails;
  }

  public Scorecard id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {Scorecard}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {Scorecard}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Scorecard name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of Scorecard.
   * @return name
  **/
  @ApiModelProperty(value = "The name of Scorecard.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scorecard scorecard = (Scorecard) o;
    return Objects.equals(this.assigned, scorecard.assigned) &&
        Objects.equals(this.distributorId, scorecard.distributorId) &&
        Objects.equals(this.featureDetails, scorecard.featureDetails) &&
        Objects.equals(this.id, scorecard.id) &&
        Objects.equals(this.name, scorecard.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigned, distributorId, featureDetails, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scorecard {\n");
    
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    featureDetails: ").append(toIndentedString(featureDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

