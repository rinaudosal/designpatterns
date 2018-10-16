package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericBreakdownFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GenericBreakdownFilter   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("comparison")
  private NumberComparisonFilter comparison = null;

  @JsonProperty("inTopTen")
  private Boolean inTopTen = null;

  public GenericBreakdownFilter code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Look at the definition of the {GenericBreakdown}Object to find out the different possible breakdown categories. It refers to {GenericBreakdown.code} attributes to. * {listAssetAllocations} * {listSectors} * {listCreditQualities} * {listGeographicAreas} * {listCurrencies}
   * @return code
  **/
  @ApiModelProperty(value = "Look at the definition of the {GenericBreakdown}Object to find out the different possible breakdown categories. It refers to {GenericBreakdown.code} attributes to. * {listAssetAllocations} * {listSectors} * {listCreditQualities} * {listGeographicAreas} * {listCurrencies}")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GenericBreakdownFilter comparison(NumberComparisonFilter comparison) {
    this.comparison = comparison;
    return this;
  }

  /**
   * Get comparison
   * @return comparison
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getComparison() {
    return comparison;
  }

  public void setComparison(NumberComparisonFilter comparison) {
    this.comparison = comparison;
  }

  public GenericBreakdownFilter inTopTen(Boolean inTopTen) {
    this.inTopTen = inTopTen;
    return this;
  }

  /**
   * Field to search only in top ten or all breakdown
   * @return inTopTen
  **/
  @ApiModelProperty(value = "Field to search only in top ten or all breakdown")


  public Boolean getInTopTen() {
    return inTopTen;
  }

  public void setInTopTen(Boolean inTopTen) {
    this.inTopTen = inTopTen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericBreakdownFilter genericBreakdownFilter = (GenericBreakdownFilter) o;
    return Objects.equals(this.code, genericBreakdownFilter.code) &&
        Objects.equals(this.comparison, genericBreakdownFilter.comparison) &&
        Objects.equals(this.inTopTen, genericBreakdownFilter.inTopTen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, comparison, inTopTen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericBreakdownFilter {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    inTopTen: ").append(toIndentedString(inTopTen)).append("\n");
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

