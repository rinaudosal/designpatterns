package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClassInstrument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClassInstrument   {
  @JsonProperty("classClientTypeCode")
  private String classClientTypeCode = null;

  @JsonProperty("classServiceTypeCode")
  private String classServiceTypeCode = null;

  @JsonProperty("mifid2ClassCode")
  private String mifid2ClassCode = null;

  public ClassInstrument classClientTypeCode(String classClientTypeCode) {
    this.classClientTypeCode = classClientTypeCode;
    return this;
  }

  /**
   * Refers to {listClassClientTypes}
   * @return classClientTypeCode
  **/
  @ApiModelProperty(value = "Refers to {listClassClientTypes}")


  public String getClassClientTypeCode() {
    return classClientTypeCode;
  }

  public void setClassClientTypeCode(String classClientTypeCode) {
    this.classClientTypeCode = classClientTypeCode;
  }

  public ClassInstrument classServiceTypeCode(String classServiceTypeCode) {
    this.classServiceTypeCode = classServiceTypeCode;
    return this;
  }

  /**
   * Refers to {listClassServiceTypes}
   * @return classServiceTypeCode
  **/
  @ApiModelProperty(value = "Refers to {listClassServiceTypes}")


  public String getClassServiceTypeCode() {
    return classServiceTypeCode;
  }

  public void setClassServiceTypeCode(String classServiceTypeCode) {
    this.classServiceTypeCode = classServiceTypeCode;
  }

  public ClassInstrument mifid2ClassCode(String mifid2ClassCode) {
    this.mifid2ClassCode = mifid2ClassCode;
    return this;
  }

  /**
   * Refers to {listMifid2Classes}
   * @return mifid2ClassCode
  **/
  @ApiModelProperty(value = "Refers to {listMifid2Classes}")


  public String getMifid2ClassCode() {
    return mifid2ClassCode;
  }

  public void setMifid2ClassCode(String mifid2ClassCode) {
    this.mifid2ClassCode = mifid2ClassCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassInstrument classInstrument = (ClassInstrument) o;
    return Objects.equals(this.classClientTypeCode, classInstrument.classClientTypeCode) &&
        Objects.equals(this.classServiceTypeCode, classInstrument.classServiceTypeCode) &&
        Objects.equals(this.mifid2ClassCode, classInstrument.mifid2ClassCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classClientTypeCode, classServiceTypeCode, mifid2ClassCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassInstrument {\n");
    
    sb.append("    classClientTypeCode: ").append(toIndentedString(classClientTypeCode)).append("\n");
    sb.append("    classServiceTypeCode: ").append(toIndentedString(classServiceTypeCode)).append("\n");
    sb.append("    mifid2ClassCode: ").append(toIndentedString(mifid2ClassCode)).append("\n");
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

