package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeyValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UCI
 */
@ApiModel(description = "UCI")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CollectiveInvestmentScheme   {
  @JsonProperty("externalCodeKeyValues")
  @Valid
  private List<KeyValue> externalCodeKeyValues = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  public CollectiveInvestmentScheme externalCodeKeyValues(List<KeyValue> externalCodeKeyValues) {
    this.externalCodeKeyValues = externalCodeKeyValues;
    return this;
  }

  public CollectiveInvestmentScheme addExternalCodeKeyValuesItem(KeyValue externalCodeKeyValuesItem) {
    if (this.externalCodeKeyValues == null) {
      this.externalCodeKeyValues = new ArrayList<>();
    }
    this.externalCodeKeyValues.add(externalCodeKeyValuesItem);
    return this;
  }

  /**
   * The CollectiveInvestmentScheme's type code. Refer to {listCollectiveInvestmentSchemeExternalCodes}
   * @return externalCodeKeyValues
  **/
  @ApiModelProperty(value = "The CollectiveInvestmentScheme's type code. Refer to {listCollectiveInvestmentSchemeExternalCodes}")

  @Valid

  public List<KeyValue> getExternalCodeKeyValues() {
    return externalCodeKeyValues;
  }

  public void setExternalCodeKeyValues(List<KeyValue> externalCodeKeyValues) {
    this.externalCodeKeyValues = externalCodeKeyValues;
  }

  public CollectiveInvestmentScheme id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CollectiveInvestmentScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CollectiveInvestmentScheme typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * The CollectiveInvestmentScheme's type code. Refer to {listCollectiveInvestmentSchemeTypes}
   * @return typeCode
  **/
  @ApiModelProperty(value = "The CollectiveInvestmentScheme's type code. Refer to {listCollectiveInvestmentSchemeTypes}")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectiveInvestmentScheme collectiveInvestmentScheme = (CollectiveInvestmentScheme) o;
    return Objects.equals(this.externalCodeKeyValues, collectiveInvestmentScheme.externalCodeKeyValues) &&
        Objects.equals(this.id, collectiveInvestmentScheme.id) &&
        Objects.equals(this.name, collectiveInvestmentScheme.name) &&
        Objects.equals(this.typeCode, collectiveInvestmentScheme.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCodeKeyValues, id, name, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectiveInvestmentScheme {\n");
    
    sb.append("    externalCodeKeyValues: ").append(toIndentedString(externalCodeKeyValues)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

