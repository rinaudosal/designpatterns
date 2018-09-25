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
 * Input model for the request of otp
 */
@ApiModel(description = "Input model for the request of otp")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:34:40.705Z")

public class OtpRequestWithCustomerIN   {
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

  @JsonProperty("holderId")
  private Integer holderId = null;

  @JsonProperty("phoneMobile")
  private String phoneMobile = null;

  @JsonProperty("textMessage")
  private String textMessage = null;

  public OtpRequestWithCustomerIN customerId(String customerId) {
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

  public OtpRequestWithCustomerIN documentType(DocumentTypeEnum documentType) {
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

  public OtpRequestWithCustomerIN holderId(Integer holderId) {
    this.holderId = holderId;
    return this;
  }

  /**
   * required only if holder already exists
   * @return holderId
  **/
  @ApiModelProperty(example = "4", value = "required only if holder already exists")


  public Integer getHolderId() {
    return holderId;
  }

  public void setHolderId(Integer holderId) {
    this.holderId = holderId;
  }

  public OtpRequestWithCustomerIN phoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
    return this;
  }

  /**
   * Get phoneMobile
   * @return phoneMobile
  **/
  @ApiModelProperty(example = "0039123457890", required = true, value = "")
  @NotNull


  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }

  public OtpRequestWithCustomerIN textMessage(String textMessage) {
    this.textMessage = textMessage;
    return this;
  }

  /**
   * Get textMessage
   * @return textMessage
  **/
  @ApiModelProperty(example = "Il tuo codice OTP è : ", required = true, value = "")
  @NotNull


  public String getTextMessage() {
    return textMessage;
  }

  public void setTextMessage(String textMessage) {
    this.textMessage = textMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtpRequestWithCustomerIN otpRequestWithCustomerIN = (OtpRequestWithCustomerIN) o;
    return Objects.equals(this.customerId, otpRequestWithCustomerIN.customerId) &&
        Objects.equals(this.documentType, otpRequestWithCustomerIN.documentType) &&
        Objects.equals(this.holderId, otpRequestWithCustomerIN.holderId) &&
        Objects.equals(this.phoneMobile, otpRequestWithCustomerIN.phoneMobile) &&
        Objects.equals(this.textMessage, otpRequestWithCustomerIN.textMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, documentType, holderId, phoneMobile, textMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpRequestWithCustomerIN {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    holderId: ").append(toIndentedString(holderId)).append("\n");
    sb.append("    phoneMobile: ").append(toIndentedString(phoneMobile)).append("\n");
    sb.append("    textMessage: ").append(toIndentedString(textMessage)).append("\n");
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

