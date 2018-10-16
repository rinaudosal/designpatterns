package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InstrumentSearchAnyClassFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchAnyClassExcelFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchAnyClassExcelFilter   {
  @JsonProperty("columns")
  @Valid
  private List<String> columns = null;

  @JsonProperty("instrumentSearchAnyClassFilter")
  private InstrumentSearchAnyClassFilter instrumentSearchAnyClassFilter = null;

  public InstrumentSearchAnyClassExcelFilter columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public InstrumentSearchAnyClassExcelFilter addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * An array to specify which columns must be returned
   * @return columns
  **/
  @ApiModelProperty(value = "An array to specify which columns must be returned")


  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public InstrumentSearchAnyClassExcelFilter instrumentSearchAnyClassFilter(InstrumentSearchAnyClassFilter instrumentSearchAnyClassFilter) {
    this.instrumentSearchAnyClassFilter = instrumentSearchAnyClassFilter;
    return this;
  }

  /**
   * Get instrumentSearchAnyClassFilter
   * @return instrumentSearchAnyClassFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchAnyClassFilter getInstrumentSearchAnyClassFilter() {
    return instrumentSearchAnyClassFilter;
  }

  public void setInstrumentSearchAnyClassFilter(InstrumentSearchAnyClassFilter instrumentSearchAnyClassFilter) {
    this.instrumentSearchAnyClassFilter = instrumentSearchAnyClassFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentSearchAnyClassExcelFilter instrumentSearchAnyClassExcelFilter = (InstrumentSearchAnyClassExcelFilter) o;
    return Objects.equals(this.columns, instrumentSearchAnyClassExcelFilter.columns) &&
        Objects.equals(this.instrumentSearchAnyClassFilter, instrumentSearchAnyClassExcelFilter.instrumentSearchAnyClassFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, instrumentSearchAnyClassFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchAnyClassExcelFilter {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    instrumentSearchAnyClassFilter: ").append(toIndentedString(instrumentSearchAnyClassFilter)).append("\n");
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

