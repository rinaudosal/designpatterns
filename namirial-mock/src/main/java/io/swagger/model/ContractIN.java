package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Input for generating contract
 */
@ApiModel(description = "Input for generating contract")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:34:40.705Z")

public class ContractIN   {
  @JsonProperty("customerId")
  private String customerId = null;

  /**
   * Document type to sign
   */
  public enum DocumentTypeEnum {
    ONBOARDING_CERTIFICATO_EXPIRED("ONBOARDING_CERTIFICATO_EXPIRED"),
    
    VERSAMENTO("VERSAMENTO"),
    
    VERSAMENTO_AGGIUNTIVO("VERSAMENTO_AGGIUNTIVO"),
    
    RIMBORSO("RIMBORSO"),
    
    SWITCH("SWITCH"),
    
    MODIFICA_ANAGRAFICA("MODIFICA_ANAGRAFICA"),
    
    MIFID("MIFID"),
    
    AML_PEP("AML_PEP"),
    
    FATCA_CRS("FATCA_CRS");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DocumentTypeEnum fromValue(String text) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("documentType")
  private DocumentTypeEnum documentType = null;

  @JsonProperty("phoneMobile")
  private String phoneMobile = null;

  public ContractIN customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(example = "000000001", required = true, value = "")
  @NotNull


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ContractIN documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Document type to sign
   * @return documentType
  **/
  @ApiModelProperty(required = true, value = "Document type to sign")
  @NotNull


  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public ContractIN phoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
    return this;
  }

  /**
   * Get phoneMobile
   * @return phoneMobile
  **/
  @ApiModelProperty(example = "0039123457890", value = "")


  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractIN contractIN = (ContractIN) o;
    return Objects.equals(this.customerId, contractIN.customerId) &&
        Objects.equals(this.documentType, contractIN.documentType) &&
        Objects.equals(this.phoneMobile, contractIN.phoneMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, documentType, phoneMobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractIN {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    phoneMobile: ").append(toIndentedString(phoneMobile)).append("\n");
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

