package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BasicCorporateAction;
import org.openapitools.model.FileObject;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorporateActionSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CorporateActionSummary   {
  @JsonProperty("basicCorporateAction")
  private BasicCorporateAction basicCorporateAction = null;

  @JsonProperty("corporateActionId")
  private String corporateActionId = null;

  @JsonProperty("documentLanguageCodes")
  @Valid
  private List<String> documentLanguageCodes = null;

  @JsonProperty("file")
  private FileObject file = null;

  @JsonProperty("officialComunicationNumber")
  private Long officialComunicationNumber = null;

  public CorporateActionSummary basicCorporateAction(BasicCorporateAction basicCorporateAction) {
    this.basicCorporateAction = basicCorporateAction;
    return this;
  }

  /**
   * Get basicCorporateAction
   * @return basicCorporateAction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicCorporateAction getBasicCorporateAction() {
    return basicCorporateAction;
  }

  public void setBasicCorporateAction(BasicCorporateAction basicCorporateAction) {
    this.basicCorporateAction = basicCorporateAction;
  }

  public CorporateActionSummary corporateActionId(String corporateActionId) {
    this.corporateActionId = corporateActionId;
    return this;
  }

  /**
   * Get corporateActionId
   * @return corporateActionId
  **/
  @ApiModelProperty(value = "")


  public String getCorporateActionId() {
    return corporateActionId;
  }

  public void setCorporateActionId(String corporateActionId) {
    this.corporateActionId = corporateActionId;
  }

  public CorporateActionSummary documentLanguageCodes(List<String> documentLanguageCodes) {
    this.documentLanguageCodes = documentLanguageCodes;
    return this;
  }

  public CorporateActionSummary addDocumentLanguageCodesItem(String documentLanguageCodesItem) {
    if (this.documentLanguageCodes == null) {
      this.documentLanguageCodes = new ArrayList<>();
    }
    this.documentLanguageCodes.add(documentLanguageCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} corresponding to the available languages. Refer to {listLanguages}.
   * @return documentLanguageCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} corresponding to the available languages. Refer to {listLanguages}.")


  public List<String> getDocumentLanguageCodes() {
    return documentLanguageCodes;
  }

  public void setDocumentLanguageCodes(List<String> documentLanguageCodes) {
    this.documentLanguageCodes = documentLanguageCodes;
  }

  public CorporateActionSummary file(FileObject file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FileObject getFile() {
    return file;
  }

  public void setFile(FileObject file) {
    this.file = file;
  }

  public CorporateActionSummary officialComunicationNumber(Long officialComunicationNumber) {
    this.officialComunicationNumber = officialComunicationNumber;
    return this;
  }

  /**
   * Get officialComunicationNumber
   * @return officialComunicationNumber
  **/
  @ApiModelProperty(value = "")


  public Long getOfficialComunicationNumber() {
    return officialComunicationNumber;
  }

  public void setOfficialComunicationNumber(Long officialComunicationNumber) {
    this.officialComunicationNumber = officialComunicationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateActionSummary corporateActionSummary = (CorporateActionSummary) o;
    return Objects.equals(this.basicCorporateAction, corporateActionSummary.basicCorporateAction) &&
        Objects.equals(this.corporateActionId, corporateActionSummary.corporateActionId) &&
        Objects.equals(this.documentLanguageCodes, corporateActionSummary.documentLanguageCodes) &&
        Objects.equals(this.file, corporateActionSummary.file) &&
        Objects.equals(this.officialComunicationNumber, corporateActionSummary.officialComunicationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicCorporateAction, corporateActionId, documentLanguageCodes, file, officialComunicationNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateActionSummary {\n");
    
    sb.append("    basicCorporateAction: ").append(toIndentedString(basicCorporateAction)).append("\n");
    sb.append("    corporateActionId: ").append(toIndentedString(corporateActionId)).append("\n");
    sb.append("    documentLanguageCodes: ").append(toIndentedString(documentLanguageCodes)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    officialComunicationNumber: ").append(toIndentedString(officialComunicationNumber)).append("\n");
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

