package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Currency;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Currency} codes and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Currency} codes and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CurrencyAndPage   {
  @JsonProperty("countries")
  @Valid
  private List<Currency> countries = null;

  @JsonProperty("page")
  private Page page = null;

  public CurrencyAndPage countries(List<Currency> countries) {
    this.countries = countries;
    return this;
  }

  public CurrencyAndPage addCountriesItem(Currency countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Currency> getCountries() {
    return countries;
  }

  public void setCountries(List<Currency> countries) {
    this.countries = countries;
  }

  public CurrencyAndPage page(Page page) {
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
    CurrencyAndPage currencyAndPage = (CurrencyAndPage) o;
    return Objects.equals(this.countries, currencyAndPage.countries) &&
        Objects.equals(this.page, currencyAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyAndPage {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

