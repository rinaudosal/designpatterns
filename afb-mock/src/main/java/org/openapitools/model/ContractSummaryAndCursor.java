package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ContractSummary;
import org.openapitools.model.Cursor;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractSummaryAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ContractSummaryAndCursor   {
  @JsonProperty("contractSummaries")
  @Valid
  private List<ContractSummary> contractSummaries = null;

  @JsonProperty("cursor")
  private Cursor cursor = null;

  public ContractSummaryAndCursor contractSummaries(List<ContractSummary> contractSummaries) {
    this.contractSummaries = contractSummaries;
    return this;
  }

  public ContractSummaryAndCursor addContractSummariesItem(ContractSummary contractSummariesItem) {
    if (this.contractSummaries == null) {
      this.contractSummaries = new ArrayList<>();
    }
    this.contractSummaries.add(contractSummariesItem);
    return this;
  }

  /**
   * Get contractSummaries
   * @return contractSummaries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContractSummary> getContractSummaries() {
    return contractSummaries;
  }

  public void setContractSummaries(List<ContractSummary> contractSummaries) {
    this.contractSummaries = contractSummaries;
  }

  public ContractSummaryAndCursor cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cursor getCursor() {
    return cursor;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractSummaryAndCursor contractSummaryAndCursor = (ContractSummaryAndCursor) o;
    return Objects.equals(this.contractSummaries, contractSummaryAndCursor.contractSummaries) &&
        Objects.equals(this.cursor, contractSummaryAndCursor.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractSummaries, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractSummaryAndCursor {\n");
    
    sb.append("    contractSummaries: ").append(toIndentedString(contractSummaries)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

