package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DocumentEngineFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {SearchDocumentEngineFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {SearchDocumentEngineFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DocumentEngineFilterAndPageFilter   {
  @JsonProperty("documentFilter")
  private DocumentEngineFilter documentFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public DocumentEngineFilterAndPageFilter documentFilter(DocumentEngineFilter documentFilter) {
    this.documentFilter = documentFilter;
    return this;
  }

  /**
   * Get documentFilter
   * @return documentFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DocumentEngineFilter getDocumentFilter() {
    return documentFilter;
  }

  public void setDocumentFilter(DocumentEngineFilter documentFilter) {
    this.documentFilter = documentFilter;
  }

  public DocumentEngineFilterAndPageFilter page(PageFilter page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPage() {
    return page;
  }

  public void setPage(PageFilter page) {
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
    DocumentEngineFilterAndPageFilter documentEngineFilterAndPageFilter = (DocumentEngineFilterAndPageFilter) o;
    return Objects.equals(this.documentFilter, documentEngineFilterAndPageFilter.documentFilter) &&
        Objects.equals(this.page, documentEngineFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEngineFilterAndPageFilter {\n");
    
    sb.append("    documentFilter: ").append(toIndentedString(documentFilter)).append("\n");
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

