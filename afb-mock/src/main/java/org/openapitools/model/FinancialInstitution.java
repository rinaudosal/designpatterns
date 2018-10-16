package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FinancialInstitutionBicData;
import org.openapitools.model.FinancialInstitutionDescriptionData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialInstitution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FinancialInstitution   {
  @JsonProperty("bankIban")
  private String bankIban = null;

  @JsonProperty("bicData")
  private FinancialInstitutionBicData bicData = null;

  @JsonProperty("descriptionData")
  private FinancialInstitutionDescriptionData descriptionData = null;

  @JsonProperty("iban")
  private String iban = null;

  public FinancialInstitution bankIban(String bankIban) {
    this.bankIban = bankIban;
    return this;
  }

  /**
   * The 'International Bank Account Number' associated to the Institution Bank
   * @return bankIban
  **/
  @ApiModelProperty(value = "The 'International Bank Account Number' associated to the Institution Bank")


  public String getBankIban() {
    return bankIban;
  }

  public void setBankIban(String bankIban) {
    this.bankIban = bankIban;
  }

  public FinancialInstitution bicData(FinancialInstitutionBicData bicData) {
    this.bicData = bicData;
    return this;
  }

  /**
   * Get bicData
   * @return bicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitutionBicData getBicData() {
    return bicData;
  }

  public void setBicData(FinancialInstitutionBicData bicData) {
    this.bicData = bicData;
  }

  public FinancialInstitution descriptionData(FinancialInstitutionDescriptionData descriptionData) {
    this.descriptionData = descriptionData;
    return this;
  }

  /**
   * Get descriptionData
   * @return descriptionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitutionDescriptionData getDescriptionData() {
    return descriptionData;
  }

  public void setDescriptionData(FinancialInstitutionDescriptionData descriptionData) {
    this.descriptionData = descriptionData;
  }

  public FinancialInstitution iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * The 'International Bank Account Number'  associated Institucion Account
   * @return iban
  **/
  @ApiModelProperty(value = "The 'International Bank Account Number'  associated Institucion Account")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialInstitution financialInstitution = (FinancialInstitution) o;
    return Objects.equals(this.bankIban, financialInstitution.bankIban) &&
        Objects.equals(this.bicData, financialInstitution.bicData) &&
        Objects.equals(this.descriptionData, financialInstitution.descriptionData) &&
        Objects.equals(this.iban, financialInstitution.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankIban, bicData, descriptionData, iban);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialInstitution {\n");
    
    sb.append("    bankIban: ").append(toIndentedString(bankIban)).append("\n");
    sb.append("    bicData: ").append(toIndentedString(bicData)).append("\n");
    sb.append("    descriptionData: ").append(toIndentedString(descriptionData)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

