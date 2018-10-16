package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FiscalSimulationFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object used to do a fiscal simulation
 */
@ApiModel(description = "Object used to do a fiscal simulation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FiscalSimulationByTransactionFilter   {
  @JsonProperty("basicFilter")
  private FiscalSimulationFilter basicFilter = null;

  @JsonProperty("shareholderDocument")
  private String shareholderDocument = null;

  public FiscalSimulationByTransactionFilter basicFilter(FiscalSimulationFilter basicFilter) {
    this.basicFilter = basicFilter;
    return this;
  }

  /**
   * Get basicFilter
   * @return basicFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FiscalSimulationFilter getBasicFilter() {
    return basicFilter;
  }

  public void setBasicFilter(FiscalSimulationFilter basicFilter) {
    this.basicFilter = basicFilter;
  }

  public FiscalSimulationByTransactionFilter shareholderDocument(String shareholderDocument) {
    this.shareholderDocument = shareholderDocument;
    return this;
  }

  /**
   * The Id of the {Client.document} selected
   * @return shareholderDocument
  **/
  @ApiModelProperty(value = "The Id of the {Client.document} selected")


  public String getShareholderDocument() {
    return shareholderDocument;
  }

  public void setShareholderDocument(String shareholderDocument) {
    this.shareholderDocument = shareholderDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalSimulationByTransactionFilter fiscalSimulationByTransactionFilter = (FiscalSimulationByTransactionFilter) o;
    return Objects.equals(this.basicFilter, fiscalSimulationByTransactionFilter.basicFilter) &&
        Objects.equals(this.shareholderDocument, fiscalSimulationByTransactionFilter.shareholderDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicFilter, shareholderDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalSimulationByTransactionFilter {\n");
    
    sb.append("    basicFilter: ").append(toIndentedString(basicFilter)).append("\n");
    sb.append("    shareholderDocument: ").append(toIndentedString(shareholderDocument)).append("\n");
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

