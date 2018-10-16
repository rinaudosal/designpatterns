package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RebateFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebateFilter   {
  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  /**
   * Indicator to choose between {DealingInstrument} currency, payment currency or other, in which case the {RebateFilter.currencyCode} must contain a valid currencyCode (see {listRebateCurrencies} for a list of valid {Rebate} currencies)
   */
  public enum CurrencyPolicyEnum {
    INSTRUMENT_CURRENCY("INSTRUMENT_CURRENCY"),
    
    PAYMENT_CURRENCY("PAYMENT_CURRENCY"),
    
    OTHER("OTHER");

    private String value;

    CurrencyPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyPolicyEnum fromValue(String text) {
      for (CurrencyPolicyEnum b : CurrencyPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("currencyPolicy")
  private CurrencyPolicyEnum currencyPolicy = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public RebateFilter contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * The externalReference of the {Contract}
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "The externalReference of the {Contract}")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public RebateFilter currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency in which to express the {Rebate}. Only used if the value of {RebateFilter.currencyPolicy} is `OTHER`.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency in which to express the {Rebate}. Only used if the value of {RebateFilter.currencyPolicy} is `OTHER`.")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public RebateFilter currencyPolicy(CurrencyPolicyEnum currencyPolicy) {
    this.currencyPolicy = currencyPolicy;
    return this;
  }

  /**
   * Indicator to choose between {DealingInstrument} currency, payment currency or other, in which case the {RebateFilter.currencyCode} must contain a valid currencyCode (see {listRebateCurrencies} for a list of valid {Rebate} currencies)
   * @return currencyPolicy
  **/
  @ApiModelProperty(value = "Indicator to choose between {DealingInstrument} currency, payment currency or other, in which case the {RebateFilter.currencyCode} must contain a valid currencyCode (see {listRebateCurrencies} for a list of valid {Rebate} currencies)")


  public CurrencyPolicyEnum getCurrencyPolicy() {
    return currencyPolicy;
  }

  public void setCurrencyPolicy(CurrencyPolicyEnum currencyPolicy) {
    this.currencyPolicy = currencyPolicy;
  }

  public RebateFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public RebateFilter subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Subdistributor}")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebateFilter rebateFilter = (RebateFilter) o;
    return Objects.equals(this.contractExternalReference, rebateFilter.contractExternalReference) &&
        Objects.equals(this.currencyCode, rebateFilter.currencyCode) &&
        Objects.equals(this.currencyPolicy, rebateFilter.currencyPolicy) &&
        Objects.equals(this.productId, rebateFilter.productId) &&
        Objects.equals(this.subdistributorId, rebateFilter.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractExternalReference, currencyCode, currencyPolicy, productId, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebateFilter {\n");
    
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyPolicy: ").append(toIndentedString(currencyPolicy)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
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

