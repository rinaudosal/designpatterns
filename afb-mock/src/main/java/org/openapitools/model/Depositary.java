package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Depositary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Depositary   {
  @JsonProperty("accountCodeRequired")
  private Boolean accountCodeRequired = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  public Depositary accountCodeRequired(Boolean accountCodeRequired) {
    this.accountCodeRequired = accountCodeRequired;
    return this;
  }

  /**
   * Indicates whether the Asset Account Code and/or the Current Account Code are mandatory.
   * @return accountCodeRequired
  **/
  @ApiModelProperty(value = "Indicates whether the Asset Account Code and/or the Current Account Code are mandatory.")


  public Boolean getAccountCodeRequired() {
    return accountCodeRequired;
  }

  public void setAccountCodeRequired(Boolean accountCodeRequired) {
    this.accountCodeRequired = accountCodeRequired;
  }

  public Depositary distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the Depositary's {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the Depositary's {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public Depositary id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Depositary Id
   * @return id
  **/
  @ApiModelProperty(value = "Depositary Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Depositary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Depositary description
   * @return name
  **/
  @ApiModelProperty(value = "Depositary description")


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
    Depositary depositary = (Depositary) o;
    return Objects.equals(this.accountCodeRequired, depositary.accountCodeRequired) &&
        Objects.equals(this.distributorId, depositary.distributorId) &&
        Objects.equals(this.id, depositary.id) &&
        Objects.equals(this.name, depositary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCodeRequired, distributorId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Depositary {\n");
    
    sb.append("    accountCodeRequired: ").append(toIndentedString(accountCodeRequired)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
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

