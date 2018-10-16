package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FileObject   {
  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("url")
  private String url = null;

  public FileObject creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date.
   * @return creationDate
  **/
  @ApiModelProperty(value = "Date.")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public FileObject filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * File.
   * @return filename
  **/
  @ApiModelProperty(value = "File.")


  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public FileObject size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Size in bytes
   * @return size
  **/
  @ApiModelProperty(value = "Size in bytes")


  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FileObject title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title.
   * @return title
  **/
  @ApiModelProperty(value = "Title.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FileObject url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Url.
   * @return url
  **/
  @ApiModelProperty(value = "Url.")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileObject fileObject = (FileObject) o;
    return Objects.equals(this.creationDate, fileObject.creationDate) &&
        Objects.equals(this.filename, fileObject.filename) &&
        Objects.equals(this.size, fileObject.size) &&
        Objects.equals(this.title, fileObject.title) &&
        Objects.equals(this.url, fileObject.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, filename, size, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileObject {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

