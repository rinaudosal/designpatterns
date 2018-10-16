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
 * CashDateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashDateData   {
  @JsonProperty("orderedDate")
  private OffsetDateTime orderedDate = null;

  @JsonProperty("valueDate")
  private OffsetDateTime valueDate = null;

  public CashDateData orderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
    return this;
  }

  /**
   * The ordered date of the {CashTransfer} or the {CashTransaction}
   * @return orderedDate
  **/
  @ApiModelProperty(value = "The ordered date of the {CashTransfer} or the {CashTransaction}")

  @Valid

  public OffsetDateTime getOrderedDate() {
    return orderedDate;
  }

  public void setOrderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
  }

  public CashDateData valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The value date of the {CashTransfer} or the {CashTransaction}
   * @return valueDate
  **/
  @ApiModelProperty(value = "The value date of the {CashTransfer} or the {CashTransaction}")

  @Valid

  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashDateData cashDateData = (CashDateData) o;
    return Objects.equals(this.orderedDate, cashDateData.orderedDate) &&
        Objects.equals(this.valueDate, cashDateData.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedDate, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashDateData {\n");
    
    sb.append("    orderedDate: ").append(toIndentedString(orderedDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

