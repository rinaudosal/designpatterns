package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RegulatoryDataFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegulatoryDataByInstrumentsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RegulatoryDataByInstrumentsFilter   {
  @JsonProperty("instrumentIds")
  @Valid
  private List<Long> instrumentIds = null;

  @JsonProperty("regulatoryDataFilter")
  private RegulatoryDataFilter regulatoryDataFilter = null;

  public RegulatoryDataByInstrumentsFilter instrumentIds(List<Long> instrumentIds) {
    this.instrumentIds = instrumentIds;
    return this;
  }

  public RegulatoryDataByInstrumentsFilter addInstrumentIdsItem(Long instrumentIdsItem) {
    if (this.instrumentIds == null) {
      this.instrumentIds = new ArrayList<>();
    }
    this.instrumentIds.add(instrumentIdsItem);
    return this;
  }

  /**
   * The array of ids of {Instruments}
   * @return instrumentIds
  **/
  @ApiModelProperty(value = "The array of ids of {Instruments}")


  public List<Long> getInstrumentIds() {
    return instrumentIds;
  }

  public void setInstrumentIds(List<Long> instrumentIds) {
    this.instrumentIds = instrumentIds;
  }

  public RegulatoryDataByInstrumentsFilter regulatoryDataFilter(RegulatoryDataFilter regulatoryDataFilter) {
    this.regulatoryDataFilter = regulatoryDataFilter;
    return this;
  }

  /**
   * Get regulatoryDataFilter
   * @return regulatoryDataFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RegulatoryDataFilter getRegulatoryDataFilter() {
    return regulatoryDataFilter;
  }

  public void setRegulatoryDataFilter(RegulatoryDataFilter regulatoryDataFilter) {
    this.regulatoryDataFilter = regulatoryDataFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatoryDataByInstrumentsFilter regulatoryDataByInstrumentsFilter = (RegulatoryDataByInstrumentsFilter) o;
    return Objects.equals(this.instrumentIds, regulatoryDataByInstrumentsFilter.instrumentIds) &&
        Objects.equals(this.regulatoryDataFilter, regulatoryDataByInstrumentsFilter.regulatoryDataFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentIds, regulatoryDataFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryDataByInstrumentsFilter {\n");
    
    sb.append("    instrumentIds: ").append(toIndentedString(instrumentIds)).append("\n");
    sb.append("    regulatoryDataFilter: ").append(toIndentedString(regulatoryDataFilter)).append("\n");
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

