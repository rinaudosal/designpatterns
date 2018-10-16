package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicCashAccountAlias;
import org.openapitools.model.FinancialInstitution;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashAccountAlias
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashAccountAlias   {
  @JsonProperty("basicCashAccountAlias")
  private BasicCashAccountAlias basicCashAccountAlias = null;

  @JsonProperty("beneficiaryInstitution")
  private FinancialInstitution beneficiaryInstitution = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("intermediaryInstitution")
  private FinancialInstitution intermediaryInstitution = null;

  public CashAccountAlias basicCashAccountAlias(BasicCashAccountAlias basicCashAccountAlias) {
    this.basicCashAccountAlias = basicCashAccountAlias;
    return this;
  }

  /**
   * Get basicCashAccountAlias
   * @return basicCashAccountAlias
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicCashAccountAlias getBasicCashAccountAlias() {
    return basicCashAccountAlias;
  }

  public void setBasicCashAccountAlias(BasicCashAccountAlias basicCashAccountAlias) {
    this.basicCashAccountAlias = basicCashAccountAlias;
  }

  public CashAccountAlias beneficiaryInstitution(FinancialInstitution beneficiaryInstitution) {
    this.beneficiaryInstitution = beneficiaryInstitution;
    return this;
  }

  /**
   * Get beneficiaryInstitution
   * @return beneficiaryInstitution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitution getBeneficiaryInstitution() {
    return beneficiaryInstitution;
  }

  public void setBeneficiaryInstitution(FinancialInstitution beneficiaryInstitution) {
    this.beneficiaryInstitution = beneficiaryInstitution;
  }

  public CashAccountAlias id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {CashAccountAlias}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {CashAccountAlias}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CashAccountAlias intermediaryInstitution(FinancialInstitution intermediaryInstitution) {
    this.intermediaryInstitution = intermediaryInstitution;
    return this;
  }

  /**
   * Get intermediaryInstitution
   * @return intermediaryInstitution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitution getIntermediaryInstitution() {
    return intermediaryInstitution;
  }

  public void setIntermediaryInstitution(FinancialInstitution intermediaryInstitution) {
    this.intermediaryInstitution = intermediaryInstitution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashAccountAlias cashAccountAlias = (CashAccountAlias) o;
    return Objects.equals(this.basicCashAccountAlias, cashAccountAlias.basicCashAccountAlias) &&
        Objects.equals(this.beneficiaryInstitution, cashAccountAlias.beneficiaryInstitution) &&
        Objects.equals(this.id, cashAccountAlias.id) &&
        Objects.equals(this.intermediaryInstitution, cashAccountAlias.intermediaryInstitution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicCashAccountAlias, beneficiaryInstitution, id, intermediaryInstitution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccountAlias {\n");
    
    sb.append("    basicCashAccountAlias: ").append(toIndentedString(basicCashAccountAlias)).append("\n");
    sb.append("    beneficiaryInstitution: ").append(toIndentedString(beneficiaryInstitution)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intermediaryInstitution: ").append(toIndentedString(intermediaryInstitution)).append("\n");
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

