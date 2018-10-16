package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.FileObject;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundCatalogResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundCatalogResponse   {
  @JsonProperty("file")
  private FileObject file = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("statusDate")
  private OffsetDateTime statusDate = null;

  public FundCatalogResponse file(FileObject file) {
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

  public FundCatalogResponse statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The `FundCatalogResponse` status code. Refer to {listFundCatalogStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The `FundCatalogResponse` status code. Refer to {listFundCatalogStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public FundCatalogResponse statusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * The date at which the status of this `FundCatalogResponse` has been changed.
   * @return statusDate
  **/
  @ApiModelProperty(value = "The date at which the status of this `FundCatalogResponse` has been changed.")

  @Valid

  public OffsetDateTime getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundCatalogResponse fundCatalogResponse = (FundCatalogResponse) o;
    return Objects.equals(this.file, fundCatalogResponse.file) &&
        Objects.equals(this.statusCode, fundCatalogResponse.statusCode) &&
        Objects.equals(this.statusDate, fundCatalogResponse.statusDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, statusCode, statusDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundCatalogResponse {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
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

