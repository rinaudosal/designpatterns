package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundMergeActionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundMergeActionData   {
  @JsonProperty("mergerIsin")
  private String mergerIsin = null;

  @JsonProperty("mergerName")
  private String mergerName = null;

  @JsonProperty("ratio")
  private Double ratio = null;

  public FundMergeActionData mergerIsin(String mergerIsin) {
    this.mergerIsin = mergerIsin;
    return this;
  }

  /**
   * International Securities Identification Number as per ISO 6166.   [A-Z]{2}([A-Z]|[0-9]){9}[0-9]
   * @return mergerIsin
  **/
  @ApiModelProperty(value = "International Securities Identification Number as per ISO 6166.   [A-Z]{2}([A-Z]|[0-9]){9}[0-9]")


  public String getMergerIsin() {
    return mergerIsin;
  }

  public void setMergerIsin(String mergerIsin) {
    this.mergerIsin = mergerIsin;
  }

  public FundMergeActionData mergerName(String mergerName) {
    this.mergerName = mergerName;
    return this;
  }

  /**
   * name of fund to has merge
   * @return mergerName
  **/
  @ApiModelProperty(value = "name of fund to has merge")


  public String getMergerName() {
    return mergerName;
  }

  public void setMergerName(String mergerName) {
    this.mergerName = mergerName;
  }

  public FundMergeActionData ratio(Double ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * @return ratio
  **/
  @ApiModelProperty(value = "")


  public Double getRatio() {
    return ratio;
  }

  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundMergeActionData fundMergeActionData = (FundMergeActionData) o;
    return Objects.equals(this.mergerIsin, fundMergeActionData.mergerIsin) &&
        Objects.equals(this.mergerName, fundMergeActionData.mergerName) &&
        Objects.equals(this.ratio, fundMergeActionData.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergerIsin, mergerName, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundMergeActionData {\n");
    
    sb.append("    mergerIsin: ").append(toIndentedString(mergerIsin)).append("\n");
    sb.append("    mergerName: ").append(toIndentedString(mergerName)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

