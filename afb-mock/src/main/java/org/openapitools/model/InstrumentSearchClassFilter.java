package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ClassInstrument;
import org.openapitools.model.InstrumentSearchFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchClassFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchClassFilter   {
  @JsonProperty("classInstrumentFilter")
  private ClassInstrument classInstrumentFilter = null;

  @JsonProperty("instrumentSearchFilter")
  private InstrumentSearchFilter instrumentSearchFilter = null;

  public InstrumentSearchClassFilter classInstrumentFilter(ClassInstrument classInstrumentFilter) {
    this.classInstrumentFilter = classInstrumentFilter;
    return this;
  }

  /**
   * Get classInstrumentFilter
   * @return classInstrumentFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClassInstrument getClassInstrumentFilter() {
    return classInstrumentFilter;
  }

  public void setClassInstrumentFilter(ClassInstrument classInstrumentFilter) {
    this.classInstrumentFilter = classInstrumentFilter;
  }

  public InstrumentSearchClassFilter instrumentSearchFilter(InstrumentSearchFilter instrumentSearchFilter) {
    this.instrumentSearchFilter = instrumentSearchFilter;
    return this;
  }

  /**
   * Get instrumentSearchFilter
   * @return instrumentSearchFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchFilter getInstrumentSearchFilter() {
    return instrumentSearchFilter;
  }

  public void setInstrumentSearchFilter(InstrumentSearchFilter instrumentSearchFilter) {
    this.instrumentSearchFilter = instrumentSearchFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentSearchClassFilter instrumentSearchClassFilter = (InstrumentSearchClassFilter) o;
    return Objects.equals(this.classInstrumentFilter, instrumentSearchClassFilter.classInstrumentFilter) &&
        Objects.equals(this.instrumentSearchFilter, instrumentSearchClassFilter.instrumentSearchFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classInstrumentFilter, instrumentSearchFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchClassFilter {\n");
    
    sb.append("    classInstrumentFilter: ").append(toIndentedString(classInstrumentFilter)).append("\n");
    sb.append("    instrumentSearchFilter: ").append(toIndentedString(instrumentSearchFilter)).append("\n");
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

