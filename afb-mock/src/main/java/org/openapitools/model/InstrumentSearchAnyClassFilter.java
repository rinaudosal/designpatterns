package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ClassInstrument;
import org.openapitools.model.InstrumentSearchByCodeClassFilter;
import org.openapitools.model.InstrumentSearchByOtherSearchFilter;
import org.openapitools.model.InstrumentSearchFilter;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InstrumentSearchAnyClassFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InstrumentSearchAnyClassFilter   {
  @JsonProperty("appliedManagementFee")
  private NumberComparisonFilter appliedManagementFee = null;

  @JsonProperty("classInstrumentFilter")
  private ClassInstrument classInstrumentFilter = null;

  /**
   * Indicates whether to search for a {NOT CLASSIFICABLE} or an {CLASSIFICABLE} or an {NOT INFORMED} instrument.
   */
  public enum ClassStatusEnum {
    NOT_CLASSIFICABLE("NOT_CLASSIFICABLE"),
    
    CLASSIFICABLE("CLASSIFICABLE"),
    
    NOT_INFORMED("NOT_INFORMED");

    private String value;

    ClassStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClassStatusEnum fromValue(String text) {
      for (ClassStatusEnum b : ClassStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("classStatus")
  private ClassStatusEnum classStatus = null;

  @JsonProperty("fundClassNameFilter")
  @Valid
  private List<String> fundClassNameFilter = null;

  @JsonProperty("fundGroupName")
  @Valid
  private List<String> fundGroupName = null;

  @JsonProperty("hedge")
  private Boolean hedge = null;

  @JsonProperty("instrumentSearchByCodeClassFilter")
  private InstrumentSearchByCodeClassFilter instrumentSearchByCodeClassFilter = null;

  @JsonProperty("instrumentSearchByOtherSearchFilter")
  private InstrumentSearchByOtherSearchFilter instrumentSearchByOtherSearchFilter = null;

  @JsonProperty("instrumentSearchFilter")
  private InstrumentSearchFilter instrumentSearchFilter = null;

  /**
   * It's a complex product if is {YES} if it's {NO} is not complex, and value {NOT_APPLICABLE}
   */
  public enum ProductComplexityEnum {
    COMPLEX("COMPLEX"),
    
    NOT_COMPLEX("NOT_COMPLEX"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    ProductComplexityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductComplexityEnum fromValue(String text) {
      for (ProductComplexityEnum b : ProductComplexityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("productComplexity")
  private ProductComplexityEnum productComplexity = null;

  public InstrumentSearchAnyClassFilter appliedManagementFee(NumberComparisonFilter appliedManagementFee) {
    this.appliedManagementFee = appliedManagementFee;
    return this;
  }

  /**
   * Get appliedManagementFee
   * @return appliedManagementFee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getAppliedManagementFee() {
    return appliedManagementFee;
  }

  public void setAppliedManagementFee(NumberComparisonFilter appliedManagementFee) {
    this.appliedManagementFee = appliedManagementFee;
  }

  public InstrumentSearchAnyClassFilter classInstrumentFilter(ClassInstrument classInstrumentFilter) {
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

  public InstrumentSearchAnyClassFilter classStatus(ClassStatusEnum classStatus) {
    this.classStatus = classStatus;
    return this;
  }

  /**
   * Indicates whether to search for a {NOT CLASSIFICABLE} or an {CLASSIFICABLE} or an {NOT INFORMED} instrument.
   * @return classStatus
  **/
  @ApiModelProperty(value = "Indicates whether to search for a {NOT CLASSIFICABLE} or an {CLASSIFICABLE} or an {NOT INFORMED} instrument.")


  public ClassStatusEnum getClassStatus() {
    return classStatus;
  }

  public void setClassStatus(ClassStatusEnum classStatus) {
    this.classStatus = classStatus;
  }

  public InstrumentSearchAnyClassFilter fundClassNameFilter(List<String> fundClassNameFilter) {
    this.fundClassNameFilter = fundClassNameFilter;
    return this;
  }

  public InstrumentSearchAnyClassFilter addFundClassNameFilterItem(String fundClassNameFilterItem) {
    if (this.fundClassNameFilter == null) {
      this.fundClassNameFilter = new ArrayList<>();
    }
    this.fundClassNameFilter.add(fundClassNameFilterItem);
    return this;
  }

  /**
   * Get fundClassNameFilter
   * @return fundClassNameFilter
  **/
  @ApiModelProperty(value = "")


  public List<String> getFundClassNameFilter() {
    return fundClassNameFilter;
  }

  public void setFundClassNameFilter(List<String> fundClassNameFilter) {
    this.fundClassNameFilter = fundClassNameFilter;
  }

  public InstrumentSearchAnyClassFilter fundGroupName(List<String> fundGroupName) {
    this.fundGroupName = fundGroupName;
    return this;
  }

  public InstrumentSearchAnyClassFilter addFundGroupNameItem(String fundGroupNameItem) {
    if (this.fundGroupName == null) {
      this.fundGroupName = new ArrayList<>();
    }
    this.fundGroupName.add(fundGroupNameItem);
    return this;
  }

  /**
   * Get fundGroupName
   * @return fundGroupName
  **/
  @ApiModelProperty(value = "")


  public List<String> getFundGroupName() {
    return fundGroupName;
  }

  public void setFundGroupName(List<String> fundGroupName) {
    this.fundGroupName = fundGroupName;
  }

  public InstrumentSearchAnyClassFilter hedge(Boolean hedge) {
    this.hedge = hedge;
    return this;
  }

  /**
   * Hedge of the currency
   * @return hedge
  **/
  @ApiModelProperty(value = "Hedge of the currency")


  public Boolean getHedge() {
    return hedge;
  }

  public void setHedge(Boolean hedge) {
    this.hedge = hedge;
  }

  public InstrumentSearchAnyClassFilter instrumentSearchByCodeClassFilter(InstrumentSearchByCodeClassFilter instrumentSearchByCodeClassFilter) {
    this.instrumentSearchByCodeClassFilter = instrumentSearchByCodeClassFilter;
    return this;
  }

  /**
   * Get instrumentSearchByCodeClassFilter
   * @return instrumentSearchByCodeClassFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchByCodeClassFilter getInstrumentSearchByCodeClassFilter() {
    return instrumentSearchByCodeClassFilter;
  }

  public void setInstrumentSearchByCodeClassFilter(InstrumentSearchByCodeClassFilter instrumentSearchByCodeClassFilter) {
    this.instrumentSearchByCodeClassFilter = instrumentSearchByCodeClassFilter;
  }

  public InstrumentSearchAnyClassFilter instrumentSearchByOtherSearchFilter(InstrumentSearchByOtherSearchFilter instrumentSearchByOtherSearchFilter) {
    this.instrumentSearchByOtherSearchFilter = instrumentSearchByOtherSearchFilter;
    return this;
  }

  /**
   * Get instrumentSearchByOtherSearchFilter
   * @return instrumentSearchByOtherSearchFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstrumentSearchByOtherSearchFilter getInstrumentSearchByOtherSearchFilter() {
    return instrumentSearchByOtherSearchFilter;
  }

  public void setInstrumentSearchByOtherSearchFilter(InstrumentSearchByOtherSearchFilter instrumentSearchByOtherSearchFilter) {
    this.instrumentSearchByOtherSearchFilter = instrumentSearchByOtherSearchFilter;
  }

  public InstrumentSearchAnyClassFilter instrumentSearchFilter(InstrumentSearchFilter instrumentSearchFilter) {
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

  public InstrumentSearchAnyClassFilter productComplexity(ProductComplexityEnum productComplexity) {
    this.productComplexity = productComplexity;
    return this;
  }

  /**
   * It's a complex product if is {YES} if it's {NO} is not complex, and value {NOT_APPLICABLE}
   * @return productComplexity
  **/
  @ApiModelProperty(value = "It's a complex product if is {YES} if it's {NO} is not complex, and value {NOT_APPLICABLE}")


  public ProductComplexityEnum getProductComplexity() {
    return productComplexity;
  }

  public void setProductComplexity(ProductComplexityEnum productComplexity) {
    this.productComplexity = productComplexity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentSearchAnyClassFilter instrumentSearchAnyClassFilter = (InstrumentSearchAnyClassFilter) o;
    return Objects.equals(this.appliedManagementFee, instrumentSearchAnyClassFilter.appliedManagementFee) &&
        Objects.equals(this.classInstrumentFilter, instrumentSearchAnyClassFilter.classInstrumentFilter) &&
        Objects.equals(this.classStatus, instrumentSearchAnyClassFilter.classStatus) &&
        Objects.equals(this.fundClassNameFilter, instrumentSearchAnyClassFilter.fundClassNameFilter) &&
        Objects.equals(this.fundGroupName, instrumentSearchAnyClassFilter.fundGroupName) &&
        Objects.equals(this.hedge, instrumentSearchAnyClassFilter.hedge) &&
        Objects.equals(this.instrumentSearchByCodeClassFilter, instrumentSearchAnyClassFilter.instrumentSearchByCodeClassFilter) &&
        Objects.equals(this.instrumentSearchByOtherSearchFilter, instrumentSearchAnyClassFilter.instrumentSearchByOtherSearchFilter) &&
        Objects.equals(this.instrumentSearchFilter, instrumentSearchAnyClassFilter.instrumentSearchFilter) &&
        Objects.equals(this.productComplexity, instrumentSearchAnyClassFilter.productComplexity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedManagementFee, classInstrumentFilter, classStatus, fundClassNameFilter, fundGroupName, hedge, instrumentSearchByCodeClassFilter, instrumentSearchByOtherSearchFilter, instrumentSearchFilter, productComplexity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentSearchAnyClassFilter {\n");
    
    sb.append("    appliedManagementFee: ").append(toIndentedString(appliedManagementFee)).append("\n");
    sb.append("    classInstrumentFilter: ").append(toIndentedString(classInstrumentFilter)).append("\n");
    sb.append("    classStatus: ").append(toIndentedString(classStatus)).append("\n");
    sb.append("    fundClassNameFilter: ").append(toIndentedString(fundClassNameFilter)).append("\n");
    sb.append("    fundGroupName: ").append(toIndentedString(fundGroupName)).append("\n");
    sb.append("    hedge: ").append(toIndentedString(hedge)).append("\n");
    sb.append("    instrumentSearchByCodeClassFilter: ").append(toIndentedString(instrumentSearchByCodeClassFilter)).append("\n");
    sb.append("    instrumentSearchByOtherSearchFilter: ").append(toIndentedString(instrumentSearchByOtherSearchFilter)).append("\n");
    sb.append("    instrumentSearchFilter: ").append(toIndentedString(instrumentSearchFilter)).append("\n");
    sb.append("    productComplexity: ").append(toIndentedString(productComplexity)).append("\n");
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

