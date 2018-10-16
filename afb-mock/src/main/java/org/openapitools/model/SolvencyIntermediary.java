package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SolvencyFund;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyIntermediary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyIntermediary   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("solvencyFunds")
  @Valid
  private List<SolvencyFund> solvencyFunds = null;

  public SolvencyIntermediary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the {SolvencyIntermediary}
   * @return id
  **/
  @ApiModelProperty(value = "The id of the {SolvencyIntermediary}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SolvencyIntermediary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the {String}
   * @return name
  **/
  @ApiModelProperty(value = "The name of the {String}")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SolvencyIntermediary solvencyFunds(List<SolvencyFund> solvencyFunds) {
    this.solvencyFunds = solvencyFunds;
    return this;
  }

  public SolvencyIntermediary addSolvencyFundsItem(SolvencyFund solvencyFundsItem) {
    if (this.solvencyFunds == null) {
      this.solvencyFunds = new ArrayList<>();
    }
    this.solvencyFunds.add(solvencyFundsItem);
    return this;
  }

  /**
   * List of the {SolvencyFund}
   * @return solvencyFunds
  **/
  @ApiModelProperty(value = "List of the {SolvencyFund}")

  @Valid

  public List<SolvencyFund> getSolvencyFunds() {
    return solvencyFunds;
  }

  public void setSolvencyFunds(List<SolvencyFund> solvencyFunds) {
    this.solvencyFunds = solvencyFunds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyIntermediary solvencyIntermediary = (SolvencyIntermediary) o;
    return Objects.equals(this.id, solvencyIntermediary.id) &&
        Objects.equals(this.name, solvencyIntermediary.name) &&
        Objects.equals(this.solvencyFunds, solvencyIntermediary.solvencyFunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, solvencyFunds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyIntermediary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    solvencyFunds: ").append(toIndentedString(solvencyFunds)).append("\n");
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

