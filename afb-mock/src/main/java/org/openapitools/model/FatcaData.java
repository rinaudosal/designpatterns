package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FATCA data. FATCA is a law passed by the US Congress on March 18, 2010
 */
@ApiModel(description = "FATCA data. FATCA is a law passed by the US Congress on March 18, 2010")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FatcaData   {
  @JsonProperty("fatcaTypeCode")
  private String fatcaTypeCode = null;

  @JsonProperty("fiscalZipCode")
  private String fiscalZipCode = null;

  @JsonProperty("postalZipCode")
  private String postalZipCode = null;

  @JsonProperty("usFiscalTypeCode")
  private String usFiscalTypeCode = null;

  @JsonProperty("usTaxReference")
  private String usTaxReference = null;

  public FatcaData fatcaTypeCode(String fatcaTypeCode) {
    this.fatcaTypeCode = fatcaTypeCode;
    return this;
  }

  /**
   * Fatca Type code. Refer to {listFatcaTypes}
   * @return fatcaTypeCode
  **/
  @ApiModelProperty(value = "Fatca Type code. Refer to {listFatcaTypes}")


  public String getFatcaTypeCode() {
    return fatcaTypeCode;
  }

  public void setFatcaTypeCode(String fatcaTypeCode) {
    this.fatcaTypeCode = fatcaTypeCode;
  }

  public FatcaData fiscalZipCode(String fiscalZipCode) {
    this.fiscalZipCode = fiscalZipCode;
    return this;
  }

  /**
   * Post code fiscal
   * @return fiscalZipCode
  **/
  @ApiModelProperty(value = "Post code fiscal")


  public String getFiscalZipCode() {
    return fiscalZipCode;
  }

  public void setFiscalZipCode(String fiscalZipCode) {
    this.fiscalZipCode = fiscalZipCode;
  }

  public FatcaData postalZipCode(String postalZipCode) {
    this.postalZipCode = postalZipCode;
    return this;
  }

  /**
   * Post code correspondence
   * @return postalZipCode
  **/
  @ApiModelProperty(value = "Post code correspondence")


  public String getPostalZipCode() {
    return postalZipCode;
  }

  public void setPostalZipCode(String postalZipCode) {
    this.postalZipCode = postalZipCode;
  }

  public FatcaData usFiscalTypeCode(String usFiscalTypeCode) {
    this.usFiscalTypeCode = usFiscalTypeCode;
    return this;
  }

  /**
   * Fiscal id type in USA Fatca Type code. Refer to {listUsFiscalTypes}
   * @return usFiscalTypeCode
  **/
  @ApiModelProperty(value = "Fiscal id type in USA Fatca Type code. Refer to {listUsFiscalTypes}")


  public String getUsFiscalTypeCode() {
    return usFiscalTypeCode;
  }

  public void setUsFiscalTypeCode(String usFiscalTypeCode) {
    this.usFiscalTypeCode = usFiscalTypeCode;
  }

  public FatcaData usTaxReference(String usTaxReference) {
    this.usTaxReference = usTaxReference;
    return this;
  }

  /**
   * Tax identification in USA
   * @return usTaxReference
  **/
  @ApiModelProperty(value = "Tax identification in USA")


  public String getUsTaxReference() {
    return usTaxReference;
  }

  public void setUsTaxReference(String usTaxReference) {
    this.usTaxReference = usTaxReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FatcaData fatcaData = (FatcaData) o;
    return Objects.equals(this.fatcaTypeCode, fatcaData.fatcaTypeCode) &&
        Objects.equals(this.fiscalZipCode, fatcaData.fiscalZipCode) &&
        Objects.equals(this.postalZipCode, fatcaData.postalZipCode) &&
        Objects.equals(this.usFiscalTypeCode, fatcaData.usFiscalTypeCode) &&
        Objects.equals(this.usTaxReference, fatcaData.usTaxReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fatcaTypeCode, fiscalZipCode, postalZipCode, usFiscalTypeCode, usTaxReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FatcaData {\n");
    
    sb.append("    fatcaTypeCode: ").append(toIndentedString(fatcaTypeCode)).append("\n");
    sb.append("    fiscalZipCode: ").append(toIndentedString(fiscalZipCode)).append("\n");
    sb.append("    postalZipCode: ").append(toIndentedString(postalZipCode)).append("\n");
    sb.append("    usFiscalTypeCode: ").append(toIndentedString(usFiscalTypeCode)).append("\n");
    sb.append("    usTaxReference: ").append(toIndentedString(usTaxReference)).append("\n");
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

