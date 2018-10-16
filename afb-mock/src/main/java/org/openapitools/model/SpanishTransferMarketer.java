package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains specific data about a marketers of {DealingInstrument}s used for into the Spanish market
 */
@ApiModel(description = "Contains specific data about a marketers of {DealingInstrument}s used for into the Spanish market")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferMarketer   {
  @JsonProperty("currentAccountCode")
  private String currentAccountCode = null;

  @JsonProperty("dealingInstrumentCnmvCode")
  private String dealingInstrumentCnmvCode = null;

  @JsonProperty("dealingInstrumentName")
  private String dealingInstrumentName = null;

  @JsonProperty("dealingInstrumentNif")
  private String dealingInstrumentNif = null;

  @JsonProperty("entityCnmvCode")
  private String entityCnmvCode = null;

  @JsonProperty("entityCnmvNif")
  private String entityCnmvNif = null;

  @JsonProperty("entityName")
  private String entityName = null;

  public SpanishTransferMarketer currentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
    return this;
  }

  /**
   * The Current Account Code associated to this {DealingInstrument}.
   * @return currentAccountCode
  **/
  @ApiModelProperty(value = "The Current Account Code associated to this {DealingInstrument}.")


  public String getCurrentAccountCode() {
    return currentAccountCode;
  }

  public void setCurrentAccountCode(String currentAccountCode) {
    this.currentAccountCode = currentAccountCode;
  }

  public SpanishTransferMarketer dealingInstrumentCnmvCode(String dealingInstrumentCnmvCode) {
    this.dealingInstrumentCnmvCode = dealingInstrumentCnmvCode;
    return this;
  }

  /**
   * The CNMV code of this {DealingInstrument}
   * @return dealingInstrumentCnmvCode
  **/
  @ApiModelProperty(value = "The CNMV code of this {DealingInstrument}")


  public String getDealingInstrumentCnmvCode() {
    return dealingInstrumentCnmvCode;
  }

  public void setDealingInstrumentCnmvCode(String dealingInstrumentCnmvCode) {
    this.dealingInstrumentCnmvCode = dealingInstrumentCnmvCode;
  }

  public SpanishTransferMarketer dealingInstrumentName(String dealingInstrumentName) {
    this.dealingInstrumentName = dealingInstrumentName;
    return this;
  }

  /**
   * The {DealingInstrument}'s name
   * @return dealingInstrumentName
  **/
  @ApiModelProperty(value = "The {DealingInstrument}'s name")


  public String getDealingInstrumentName() {
    return dealingInstrumentName;
  }

  public void setDealingInstrumentName(String dealingInstrumentName) {
    this.dealingInstrumentName = dealingInstrumentName;
  }

  public SpanishTransferMarketer dealingInstrumentNif(String dealingInstrumentNif) {
    this.dealingInstrumentNif = dealingInstrumentNif;
    return this;
  }

  /**
   * The NIF of this {DealingInstrument}.
   * @return dealingInstrumentNif
  **/
  @ApiModelProperty(value = "The NIF of this {DealingInstrument}.")


  public String getDealingInstrumentNif() {
    return dealingInstrumentNif;
  }

  public void setDealingInstrumentNif(String dealingInstrumentNif) {
    this.dealingInstrumentNif = dealingInstrumentNif;
  }

  public SpanishTransferMarketer entityCnmvCode(String entityCnmvCode) {
    this.entityCnmvCode = entityCnmvCode;
    return this;
  }

  /**
   * The CNMV code of the {DealingFundHouse} of this {DealingInstrument}
   * @return entityCnmvCode
  **/
  @ApiModelProperty(value = "The CNMV code of the {DealingFundHouse} of this {DealingInstrument}")


  public String getEntityCnmvCode() {
    return entityCnmvCode;
  }

  public void setEntityCnmvCode(String entityCnmvCode) {
    this.entityCnmvCode = entityCnmvCode;
  }

  public SpanishTransferMarketer entityCnmvNif(String entityCnmvNif) {
    this.entityCnmvNif = entityCnmvNif;
    return this;
  }

  /**
   * The NIF code of the {DealingFundHouse} of this {DealingInstrument}
   * @return entityCnmvNif
  **/
  @ApiModelProperty(value = "The NIF code of the {DealingFundHouse} of this {DealingInstrument}")


  public String getEntityCnmvNif() {
    return entityCnmvNif;
  }

  public void setEntityCnmvNif(String entityCnmvNif) {
    this.entityCnmvNif = entityCnmvNif;
  }

  public SpanishTransferMarketer entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * The name of the entity associated to the {DealingInstrument}
   * @return entityName
  **/
  @ApiModelProperty(value = "The name of the entity associated to the {DealingInstrument}")


  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferMarketer spanishTransferMarketer = (SpanishTransferMarketer) o;
    return Objects.equals(this.currentAccountCode, spanishTransferMarketer.currentAccountCode) &&
        Objects.equals(this.dealingInstrumentCnmvCode, spanishTransferMarketer.dealingInstrumentCnmvCode) &&
        Objects.equals(this.dealingInstrumentName, spanishTransferMarketer.dealingInstrumentName) &&
        Objects.equals(this.dealingInstrumentNif, spanishTransferMarketer.dealingInstrumentNif) &&
        Objects.equals(this.entityCnmvCode, spanishTransferMarketer.entityCnmvCode) &&
        Objects.equals(this.entityCnmvNif, spanishTransferMarketer.entityCnmvNif) &&
        Objects.equals(this.entityName, spanishTransferMarketer.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountCode, dealingInstrumentCnmvCode, dealingInstrumentName, dealingInstrumentNif, entityCnmvCode, entityCnmvNif, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferMarketer {\n");
    
    sb.append("    currentAccountCode: ").append(toIndentedString(currentAccountCode)).append("\n");
    sb.append("    dealingInstrumentCnmvCode: ").append(toIndentedString(dealingInstrumentCnmvCode)).append("\n");
    sb.append("    dealingInstrumentName: ").append(toIndentedString(dealingInstrumentName)).append("\n");
    sb.append("    dealingInstrumentNif: ").append(toIndentedString(dealingInstrumentNif)).append("\n");
    sb.append("    entityCnmvCode: ").append(toIndentedString(entityCnmvCode)).append("\n");
    sb.append("    entityCnmvNif: ").append(toIndentedString(entityCnmvNif)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

