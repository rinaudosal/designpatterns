package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Document;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Document} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Document} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DocumentAndPage   {
  @JsonProperty("documents")
  @Valid
  private List<Document> documents = null;

  @JsonProperty("page")
  private Page page = null;

  public DocumentAndPage documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public DocumentAndPage addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * The array of {Document}
   * @return documents
  **/
  @ApiModelProperty(value = "The array of {Document}")

  @Valid

  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public DocumentAndPage page(Page page) {
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
    DocumentAndPage documentAndPage = (DocumentAndPage) o;
    return Objects.equals(this.documents, documentAndPage.documents) &&
        Objects.equals(this.page, documentAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAndPage {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

