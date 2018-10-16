package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CorporateActionFilterAndPageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorporateActionExcelFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CorporateActionExcelFilterAndPageFilter   {
  @JsonProperty("columns")
  @Valid
  private List<String> columns = null;

  @JsonProperty("corporateActionFilterAndPageFilter")
  private CorporateActionFilterAndPageFilter corporateActionFilterAndPageFilter = null;

  public CorporateActionExcelFilterAndPageFilter columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public CorporateActionExcelFilterAndPageFilter addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * An array to specify which columns must be returned into the generated excel file
   * @return columns
  **/
  @ApiModelProperty(value = "An array to specify which columns must be returned into the generated excel file")


  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public CorporateActionExcelFilterAndPageFilter corporateActionFilterAndPageFilter(CorporateActionFilterAndPageFilter corporateActionFilterAndPageFilter) {
    this.corporateActionFilterAndPageFilter = corporateActionFilterAndPageFilter;
    return this;
  }

  /**
   * Get corporateActionFilterAndPageFilter
   * @return corporateActionFilterAndPageFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CorporateActionFilterAndPageFilter getCorporateActionFilterAndPageFilter() {
    return corporateActionFilterAndPageFilter;
  }

  public void setCorporateActionFilterAndPageFilter(CorporateActionFilterAndPageFilter corporateActionFilterAndPageFilter) {
    this.corporateActionFilterAndPageFilter = corporateActionFilterAndPageFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateActionExcelFilterAndPageFilter corporateActionExcelFilterAndPageFilter = (CorporateActionExcelFilterAndPageFilter) o;
    return Objects.equals(this.columns, corporateActionExcelFilterAndPageFilter.columns) &&
        Objects.equals(this.corporateActionFilterAndPageFilter, corporateActionExcelFilterAndPageFilter.corporateActionFilterAndPageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, corporateActionFilterAndPageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateActionExcelFilterAndPageFilter {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    corporateActionFilterAndPageFilter: ").append(toIndentedString(corporateActionFilterAndPageFilter)).append("\n");
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

