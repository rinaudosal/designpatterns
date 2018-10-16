package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrencyChangeActionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CurrencyChangeActionData   {
  @JsonProperty("associatedTo")
  private String associatedTo = null;

  @JsonProperty("newCurrencyCode")
  private String newCurrencyCode = null;

  @JsonProperty("oldCurrencyCode")
  private String oldCurrencyCode = null;

  public CurrencyChangeActionData associatedTo(String associatedTo) {
    this.associatedTo = associatedTo;
    return this;
  }

  /**
   * Get associatedTo
   * @return associatedTo
  **/
  @ApiModelProperty(value = "")


  public String getAssociatedTo() {
    return associatedTo;
  }

  public void setAssociatedTo(String associatedTo) {
    this.associatedTo = associatedTo;
  }

  public CurrencyChangeActionData newCurrencyCode(String newCurrencyCode) {
    this.newCurrencyCode = newCurrencyCode;
    return this;
  }

  /**
   * new currency fund. Refer to {listCurrencies}
   * @return newCurrencyCode
  **/
  @ApiModelProperty(value = "new currency fund. Refer to {listCurrencies}")


  public String getNewCurrencyCode() {
    return newCurrencyCode;
  }

  public void setNewCurrencyCode(String newCurrencyCode) {
    this.newCurrencyCode = newCurrencyCode;
  }

  public CurrencyChangeActionData oldCurrencyCode(String oldCurrencyCode) {
    this.oldCurrencyCode = oldCurrencyCode;
    return this;
  }

  /**
   * old currency fund. Refer to {listCurrencies}
   * @return oldCurrencyCode
  **/
  @ApiModelProperty(value = "old currency fund. Refer to {listCurrencies}")


  public String getOldCurrencyCode() {
    return oldCurrencyCode;
  }

  public void setOldCurrencyCode(String oldCurrencyCode) {
    this.oldCurrencyCode = oldCurrencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyChangeActionData currencyChangeActionData = (CurrencyChangeActionData) o;
    return Objects.equals(this.associatedTo, currencyChangeActionData.associatedTo) &&
        Objects.equals(this.newCurrencyCode, currencyChangeActionData.newCurrencyCode) &&
        Objects.equals(this.oldCurrencyCode, currencyChangeActionData.oldCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedTo, newCurrencyCode, oldCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyChangeActionData {\n");
    
    sb.append("    associatedTo: ").append(toIndentedString(associatedTo)).append("\n");
    sb.append("    newCurrencyCode: ").append(toIndentedString(newCurrencyCode)).append("\n");
    sb.append("    oldCurrencyCode: ").append(toIndentedString(oldCurrencyCode)).append("\n");
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

