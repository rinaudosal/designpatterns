package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashClientSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashClientSummary   {
  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public CashClientSummary externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external reference assigned to the {CashClient}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external reference assigned to the {CashClient}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public CashClientSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The {CashClient} internal Id
   * @return id
  **/
  @ApiModelProperty(value = "The {CashClient} internal Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CashClientSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the {CashClient}
   * @return name
  **/
  @ApiModelProperty(value = "The name of the {CashClient}")


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
    CashClientSummary cashClientSummary = (CashClientSummary) o;
    return Objects.equals(this.externalReference, cashClientSummary.externalReference) &&
        Objects.equals(this.id, cashClientSummary.id) &&
        Objects.equals(this.name, cashClientSummary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalReference, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashClientSummary {\n");
    
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
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

