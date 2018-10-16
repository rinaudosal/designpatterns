package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Market
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Market   {
  @JsonProperty("defaultCurrencyCode")
  private String defaultCurrencyCode = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public Market defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

  /**
   * The market�s default currency. Refer to {listCurrencies}
   * @return defaultCurrencyCode
  **/
  @ApiModelProperty(value = "The market�s default currency. Refer to {listCurrencies}")


  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }

  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }

  public Market id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Market name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Market market = (Market) o;
    return Objects.equals(this.defaultCurrencyCode, market.defaultCurrencyCode) &&
        Objects.equals(this.id, market.id) &&
        Objects.equals(this.name, market.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrencyCode, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Market {\n");
    
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

