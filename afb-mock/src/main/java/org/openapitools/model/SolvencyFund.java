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
 * SolvencyFund
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyFund   {
  @JsonProperty("breakdownDate")
  private OffsetDateTime breakdownDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("file")
  private FileObject file = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isin")
  private String isin = null;

  @JsonProperty("name")
  private String name = null;

  public SolvencyFund breakdownDate(OffsetDateTime breakdownDate) {
    this.breakdownDate = breakdownDate;
    return this;
  }

  /**
   * Breakdown Date
   * @return breakdownDate
  **/
  @ApiModelProperty(value = "Breakdown Date")

  @Valid

  public OffsetDateTime getBreakdownDate() {
    return breakdownDate;
  }

  public void setBreakdownDate(OffsetDateTime breakdownDate) {
    this.breakdownDate = breakdownDate;
  }

  public SolvencyFund description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Value
   * @return description
  **/
  @ApiModelProperty(value = "Value")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SolvencyFund file(FileObject file) {
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

  public SolvencyFund id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id
   * @return id
  **/
  @ApiModelProperty(value = "id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SolvencyFund isin(String isin) {
    this.isin = isin;
    return this;
  }

  /**
   * Value
   * @return isin
  **/
  @ApiModelProperty(value = "Value")


  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public SolvencyFund name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Value
   * @return name
  **/
  @ApiModelProperty(value = "Value")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyFund solvencyFund = (SolvencyFund) o;
    return Objects.equals(this.breakdownDate, solvencyFund.breakdownDate) &&
        Objects.equals(this.description, solvencyFund.description) &&
        Objects.equals(this.file, solvencyFund.file) &&
        Objects.equals(this.id, solvencyFund.id) &&
        Objects.equals(this.isin, solvencyFund.isin) &&
        Objects.equals(this.name, solvencyFund.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdownDate, description, file, id, isin, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyFund {\n");
    
    sb.append("    breakdownDate: ").append(toIndentedString(breakdownDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

