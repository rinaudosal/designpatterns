package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeyValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MarketerFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MarketerFilter   {
  @JsonProperty("dealingInstrumentExternalCodeKeyValues")
  @Valid
  private List<KeyValue> dealingInstrumentExternalCodeKeyValues = null;

  public MarketerFilter dealingInstrumentExternalCodeKeyValues(List<KeyValue> dealingInstrumentExternalCodeKeyValues) {
    this.dealingInstrumentExternalCodeKeyValues = dealingInstrumentExternalCodeKeyValues;
    return this;
  }

  public MarketerFilter addDealingInstrumentExternalCodeKeyValuesItem(KeyValue dealingInstrumentExternalCodeKeyValuesItem) {
    if (this.dealingInstrumentExternalCodeKeyValues == null) {
      this.dealingInstrumentExternalCodeKeyValues = new ArrayList<>();
    }
    this.dealingInstrumentExternalCodeKeyValues.add(dealingInstrumentExternalCodeKeyValuesItem);
    return this;
  }

  /**
   * The codes corresponding with {SpanishTransferItem.dealingInstrumentExternalCodeKeyValues}. Refer to {listDealingInstrumentExternalCodes}
   * @return dealingInstrumentExternalCodeKeyValues
  **/
  @ApiModelProperty(value = "The codes corresponding with {SpanishTransferItem.dealingInstrumentExternalCodeKeyValues}. Refer to {listDealingInstrumentExternalCodes}")

  @Valid

  public List<KeyValue> getDealingInstrumentExternalCodeKeyValues() {
    return dealingInstrumentExternalCodeKeyValues;
  }

  public void setDealingInstrumentExternalCodeKeyValues(List<KeyValue> dealingInstrumentExternalCodeKeyValues) {
    this.dealingInstrumentExternalCodeKeyValues = dealingInstrumentExternalCodeKeyValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketerFilter marketerFilter = (MarketerFilter) o;
    return Objects.equals(this.dealingInstrumentExternalCodeKeyValues, marketerFilter.dealingInstrumentExternalCodeKeyValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingInstrumentExternalCodeKeyValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketerFilter {\n");
    
    sb.append("    dealingInstrumentExternalCodeKeyValues: ").append(toIndentedString(dealingInstrumentExternalCodeKeyValues)).append("\n");
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

