package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalReferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AdditionalReferences   {
  @JsonProperty("additionalReference1")
  private String additionalReference1 = null;

  @JsonProperty("additionalReference2")
  private String additionalReference2 = null;

  @JsonProperty("additionalReference3")
  private String additionalReference3 = null;

  @JsonProperty("additionalReference4")
  private String additionalReference4 = null;

  public AdditionalReferences additionalReference1(String additionalReference1) {
    this.additionalReference1 = additionalReference1;
    return this;
  }

  /**
   * First additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`
   * @return additionalReference1
  **/
  @ApiModelProperty(value = "First additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`")


  public String getAdditionalReference1() {
    return additionalReference1;
  }

  public void setAdditionalReference1(String additionalReference1) {
    this.additionalReference1 = additionalReference1;
  }

  public AdditionalReferences additionalReference2(String additionalReference2) {
    this.additionalReference2 = additionalReference2;
    return this;
  }

  /**
   * Second additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`
   * @return additionalReference2
  **/
  @ApiModelProperty(value = "Second additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`")


  public String getAdditionalReference2() {
    return additionalReference2;
  }

  public void setAdditionalReference2(String additionalReference2) {
    this.additionalReference2 = additionalReference2;
  }

  public AdditionalReferences additionalReference3(String additionalReference3) {
    this.additionalReference3 = additionalReference3;
    return this;
  }

  /**
   * Third additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`
   * @return additionalReference3
  **/
  @ApiModelProperty(value = "Third additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`")


  public String getAdditionalReference3() {
    return additionalReference3;
  }

  public void setAdditionalReference3(String additionalReference3) {
    this.additionalReference3 = additionalReference3;
  }

  public AdditionalReferences additionalReference4(String additionalReference4) {
    this.additionalReference4 = additionalReference4;
    return this;
  }

  /**
   * Forth additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`
   * @return additionalReference4
  **/
  @ApiModelProperty(value = "Forth additional reference included by the user in the {CashTransaction}. This attribute is optional and defined by `SWIFT`")


  public String getAdditionalReference4() {
    return additionalReference4;
  }

  public void setAdditionalReference4(String additionalReference4) {
    this.additionalReference4 = additionalReference4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalReferences additionalReferences = (AdditionalReferences) o;
    return Objects.equals(this.additionalReference1, additionalReferences.additionalReference1) &&
        Objects.equals(this.additionalReference2, additionalReferences.additionalReference2) &&
        Objects.equals(this.additionalReference3, additionalReferences.additionalReference3) &&
        Objects.equals(this.additionalReference4, additionalReferences.additionalReference4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalReference1, additionalReference2, additionalReference3, additionalReference4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalReferences {\n");
    
    sb.append("    additionalReference1: ").append(toIndentedString(additionalReference1)).append("\n");
    sb.append("    additionalReference2: ").append(toIndentedString(additionalReference2)).append("\n");
    sb.append("    additionalReference3: ").append(toIndentedString(additionalReference3)).append("\n");
    sb.append("    additionalReference4: ").append(toIndentedString(additionalReference4)).append("\n");
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

