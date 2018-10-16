package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ApiSubBean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An ApiBean is a dummy object used to test the internal Dozer infrastructure.
 */
@ApiModel(description = "An ApiBean is a dummy object used to test the internal Dozer infrastructure.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ApiBean   {
  @JsonProperty("apiDate")
  private OffsetDateTime apiDate = null;

  @JsonProperty("apiDate2String")
  private String apiDate2String = null;

  @JsonProperty("apiDouble")
  private Double apiDouble = null;

  @JsonProperty("apiInt")
  private Integer apiInt = null;

  @JsonProperty("apiString")
  private String apiString = null;

  @JsonProperty("apiString2Boolean")
  private Boolean apiString2Boolean = null;

  @JsonProperty("apiSubBean")
  private ApiSubBean apiSubBean = null;

  @JsonProperty("apiSubBeans")
  @Valid
  private List<ApiSubBean> apiSubBeans = null;

  @JsonProperty("apiUrl")
  private String apiUrl = null;

  public ApiBean apiDate(OffsetDateTime apiDate) {
    this.apiDate = apiDate;
    return this;
  }

  /**
   * A simple date.
   * @return apiDate
  **/
  @ApiModelProperty(value = "A simple date.")

  @Valid

  public OffsetDateTime getApiDate() {
    return apiDate;
  }

  public void setApiDate(OffsetDateTime apiDate) {
    this.apiDate = apiDate;
  }

  public ApiBean apiDate2String(String apiDate2String) {
    this.apiDate2String = apiDate2String;
    return this;
  }

  /**
   * This attribute is used to test the Date2StringConverter
   * @return apiDate2String
  **/
  @ApiModelProperty(value = "This attribute is used to test the Date2StringConverter")


  public String getApiDate2String() {
    return apiDate2String;
  }

  public void setApiDate2String(String apiDate2String) {
    this.apiDate2String = apiDate2String;
  }

  public ApiBean apiDouble(Double apiDouble) {
    this.apiDouble = apiDouble;
    return this;
  }

  /**
   * An simple double that will be translated to an internal Double
   * @return apiDouble
  **/
  @ApiModelProperty(value = "An simple double that will be translated to an internal Double")


  public Double getApiDouble() {
    return apiDouble;
  }

  public void setApiDouble(Double apiDouble) {
    this.apiDouble = apiDouble;
  }

  public ApiBean apiInt(Integer apiInt) {
    this.apiInt = apiInt;
    return this;
  }

  /**
   * An integer that will be translated to an internal Integer, and will serve as an Identifier in the apiUrl below.
   * @return apiInt
  **/
  @ApiModelProperty(value = "An integer that will be translated to an internal Integer, and will serve as an Identifier in the apiUrl below.")


  public Integer getApiInt() {
    return apiInt;
  }

  public void setApiInt(Integer apiInt) {
    this.apiInt = apiInt;
  }

  public ApiBean apiString(String apiString) {
    this.apiString = apiString;
    return this;
  }

  /**
   * An simple string that will be translated to an internal String
   * @return apiString
  **/
  @ApiModelProperty(value = "An simple string that will be translated to an internal String")


  public String getApiString() {
    return apiString;
  }

  public void setApiString(String apiString) {
    this.apiString = apiString;
  }

  public ApiBean apiString2Boolean(Boolean apiString2Boolean) {
    this.apiString2Boolean = apiString2Boolean;
    return this;
  }

  /**
   * This attribute is used to test the String2BooleanConverter
   * @return apiString2Boolean
  **/
  @ApiModelProperty(value = "This attribute is used to test the String2BooleanConverter")


  public Boolean getApiString2Boolean() {
    return apiString2Boolean;
  }

  public void setApiString2Boolean(Boolean apiString2Boolean) {
    this.apiString2Boolean = apiString2Boolean;
  }

  public ApiBean apiSubBean(ApiSubBean apiSubBean) {
    this.apiSubBean = apiSubBean;
    return this;
  }

  /**
   * Get apiSubBean
   * @return apiSubBean
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ApiSubBean getApiSubBean() {
    return apiSubBean;
  }

  public void setApiSubBean(ApiSubBean apiSubBean) {
    this.apiSubBean = apiSubBean;
  }

  public ApiBean apiSubBeans(List<ApiSubBean> apiSubBeans) {
    this.apiSubBeans = apiSubBeans;
    return this;
  }

  public ApiBean addApiSubBeansItem(ApiSubBean apiSubBeansItem) {
    if (this.apiSubBeans == null) {
      this.apiSubBeans = new ArrayList<>();
    }
    this.apiSubBeans.add(apiSubBeansItem);
    return this;
  }

  /**
   * Get apiSubBeans
   * @return apiSubBeans
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ApiSubBean> getApiSubBeans() {
    return apiSubBeans;
  }

  public void setApiSubBeans(List<ApiSubBean> apiSubBeans) {
    this.apiSubBeans = apiSubBeans;
  }

  public ApiBean apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

  /**
   * The apiUrl field is an example of a API field generated on the fly by the API in order to simulate the generation of URL to point to specific resources in the API. It is generated in the output from the resource identifier (apiInt). It is ignored when present in the input.
   * @return apiUrl
  **/
  @ApiModelProperty(value = "The apiUrl field is an example of a API field generated on the fly by the API in order to simulate the generation of URL to point to specific resources in the API. It is generated in the output from the resource identifier (apiInt). It is ignored when present in the input.")


  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiBean apiBean = (ApiBean) o;
    return Objects.equals(this.apiDate, apiBean.apiDate) &&
        Objects.equals(this.apiDate2String, apiBean.apiDate2String) &&
        Objects.equals(this.apiDouble, apiBean.apiDouble) &&
        Objects.equals(this.apiInt, apiBean.apiInt) &&
        Objects.equals(this.apiString, apiBean.apiString) &&
        Objects.equals(this.apiString2Boolean, apiBean.apiString2Boolean) &&
        Objects.equals(this.apiSubBean, apiBean.apiSubBean) &&
        Objects.equals(this.apiSubBeans, apiBean.apiSubBeans) &&
        Objects.equals(this.apiUrl, apiBean.apiUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiDate, apiDate2String, apiDouble, apiInt, apiString, apiString2Boolean, apiSubBean, apiSubBeans, apiUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiBean {\n");
    
    sb.append("    apiDate: ").append(toIndentedString(apiDate)).append("\n");
    sb.append("    apiDate2String: ").append(toIndentedString(apiDate2String)).append("\n");
    sb.append("    apiDouble: ").append(toIndentedString(apiDouble)).append("\n");
    sb.append("    apiInt: ").append(toIndentedString(apiInt)).append("\n");
    sb.append("    apiString: ").append(toIndentedString(apiString)).append("\n");
    sb.append("    apiString2Boolean: ").append(toIndentedString(apiString2Boolean)).append("\n");
    sb.append("    apiSubBean: ").append(toIndentedString(apiSubBean)).append("\n");
    sb.append("    apiSubBeans: ").append(toIndentedString(apiSubBeans)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
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

