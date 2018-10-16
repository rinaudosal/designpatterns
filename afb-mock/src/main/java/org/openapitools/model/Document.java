package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FileObject;
import org.openapitools.model.KeyValue;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Document   {
  @JsonProperty("file")
  private FileObject file = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("metadata")
  @Valid
  private List<KeyValue> metadata = null;

  @JsonProperty("owner")
  private ResourceReference owner = null;

  public Document file(FileObject file) {
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

  public Document id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Document metadata(List<KeyValue> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Document addMetadataItem(KeyValue metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * This attribute contains a list of the metadatas. Each {KeyValue.key} contains a code whose description. * documentationTypeCode Refer to {listDocumentationTypes} * languageCode The Document's language code. Refer to {listLanguages} * fundHouseGroupId The Id of the {FundHouseGroup} * fundHouseId The Id of the {FundHouse} * collectiveInvestmentSchemeId The Id of the {CollectiveInvestmentScheme} * currencyCode The {Document}'s currency. Refers to {listCurrencies} * frequency [DAILY,WEEKLY,MONTHLY] * marketId The Id of the {Market}
   * @return metadata
  **/
  @ApiModelProperty(value = "This attribute contains a list of the metadatas. Each {KeyValue.key} contains a code whose description. * documentationTypeCode Refer to {listDocumentationTypes} * languageCode The Document's language code. Refer to {listLanguages} * fundHouseGroupId The Id of the {FundHouseGroup} * fundHouseId The Id of the {FundHouse} * collectiveInvestmentSchemeId The Id of the {CollectiveInvestmentScheme} * currencyCode The {Document}'s currency. Refers to {listCurrencies} * frequency [DAILY,WEEKLY,MONTHLY] * marketId The Id of the {Market}")

  @Valid

  public List<KeyValue> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<KeyValue> metadata) {
    this.metadata = metadata;
  }

  public Document owner(ResourceReference owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getOwner() {
    return owner;
  }

  public void setOwner(ResourceReference owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.file, document.file) &&
        Objects.equals(this.id, document.id) &&
        Objects.equals(this.metadata, document.metadata) &&
        Objects.equals(this.owner, document.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, id, metadata, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

