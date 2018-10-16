package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listDocumentTypes} for a complete list.
 */
@ApiModel(description = "A simple object composed of an array of {CodeDescription.code} codes and a {Page}. Refer to {listDocumentTypes} for a complete list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DocumentTypeAndPage   {
  @JsonProperty("documentTypeCodes")
  @Valid
  private List<String> documentTypeCodes = null;

  @JsonProperty("page")
  private Page page = null;

  public DocumentTypeAndPage documentTypeCodes(List<String> documentTypeCodes) {
    this.documentTypeCodes = documentTypeCodes;
    return this;
  }

  public DocumentTypeAndPage addDocumentTypeCodesItem(String documentTypeCodesItem) {
    if (this.documentTypeCodes == null) {
      this.documentTypeCodes = new ArrayList<>();
    }
    this.documentTypeCodes.add(documentTypeCodesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code} available.
   * @return documentTypeCodes
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code} available.")


  public List<String> getDocumentTypeCodes() {
    return documentTypeCodes;
  }

  public void setDocumentTypeCodes(List<String> documentTypeCodes) {
    this.documentTypeCodes = documentTypeCodes;
  }

  public DocumentTypeAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTypeAndPage documentTypeAndPage = (DocumentTypeAndPage) o;
    return Objects.equals(this.documentTypeCodes, documentTypeAndPage.documentTypeCodes) &&
        Objects.equals(this.page, documentTypeAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTypeCodes, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTypeAndPage {\n");
    
    sb.append("    documentTypeCodes: ").append(toIndentedString(documentTypeCodes)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

