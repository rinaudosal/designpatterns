package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Retunts an Excel file as base64 binary data and a page object is returned by the Server in order for the {Consumer} to setup its pagination. It comes with all the necessary information to navigate the result set.
 */
@ApiModel(description = "Retunts an Excel file as base64 binary data and a page object is returned by the Server in order for the {Consumer} to setup its pagination. It comes with all the necessary information to navigate the result set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ExcelAndPage   {
  @JsonProperty("base64BinaryData")
  private String base64BinaryData = null;

  @JsonProperty("page")
  private Page page = null;

  public ExcelAndPage base64BinaryData(String base64BinaryData) {
    this.base64BinaryData = base64BinaryData;
    return this;
  }

  /**
   * The Base64 encoded binary data, that corresponds to the exel file.
   * @return base64BinaryData
  **/
  @ApiModelProperty(value = "The Base64 encoded binary data, that corresponds to the exel file.")


  public String getBase64BinaryData() {
    return base64BinaryData;
  }

  public void setBase64BinaryData(String base64BinaryData) {
    this.base64BinaryData = base64BinaryData;
  }

  public ExcelAndPage page(Page page) {
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
    ExcelAndPage excelAndPage = (ExcelAndPage) o;
    return Objects.equals(this.base64BinaryData, excelAndPage.base64BinaryData) &&
        Objects.equals(this.page, excelAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64BinaryData, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcelAndPage {\n");
    
    sb.append("    base64BinaryData: ").append(toIndentedString(base64BinaryData)).append("\n");
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

