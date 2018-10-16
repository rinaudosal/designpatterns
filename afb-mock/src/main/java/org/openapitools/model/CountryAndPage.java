package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Country} codes and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Country} codes and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CountryAndPage   {
  @JsonProperty("countryCodes")
  @Valid
  private List<String> countryCodes = null;

  @JsonProperty("page")
  private Page page = null;

  public CountryAndPage countryCodes(List<String> countryCodes) {
    this.countryCodes = countryCodes;
    return this;
  }

  public CountryAndPage addCountryCodesItem(String countryCodesItem) {
    if (this.countryCodes == null) {
      this.countryCodes = new ArrayList<>();
    }
    this.countryCodes.add(countryCodesItem);
    return this;
  }

  /**
   * The array of {Country} codes
   * @return countryCodes
  **/
  @ApiModelProperty(value = "The array of {Country} codes")


  public List<String> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<String> countryCodes) {
    this.countryCodes = countryCodes;
  }

  public CountryAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryAndPage countryAndPage = (CountryAndPage) o;
    return Objects.equals(this.countryCodes, countryAndPage.countryCodes) &&
        Objects.equals(this.page, countryAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodes, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryAndPage {\n");
    
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

