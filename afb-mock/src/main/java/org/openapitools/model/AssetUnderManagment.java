package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetUnderManagment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AssetUnderManagment   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("fundCurrencyCode")
  private String fundCurrencyCode = null;

  @JsonProperty("fundValuation")
  private Double fundValuation = null;

  @JsonProperty("groupCurrencyCode")
  private String groupCurrencyCode = null;

  @JsonProperty("groupValuation")
  private Double groupValuation = null;

  public AssetUnderManagment date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public AssetUnderManagment fundCurrencyCode(String fundCurrencyCode) {
    this.fundCurrencyCode = fundCurrencyCode;
    return this;
  }

  /**
   * The {AssetUnderManagment}'s  fund currency. Refer to {listCurrencies}
   * @return fundCurrencyCode
  **/
  @ApiModelProperty(value = "The {AssetUnderManagment}'s  fund currency. Refer to {listCurrencies}")


  public String getFundCurrencyCode() {
    return fundCurrencyCode;
  }

  public void setFundCurrencyCode(String fundCurrencyCode) {
    this.fundCurrencyCode = fundCurrencyCode;
  }

  public AssetUnderManagment fundValuation(Double fundValuation) {
    this.fundValuation = fundValuation;
    return this;
  }

  /**
   * Get fundValuation
   * @return fundValuation
  **/
  @ApiModelProperty(value = "")


  public Double getFundValuation() {
    return fundValuation;
  }

  public void setFundValuation(Double fundValuation) {
    this.fundValuation = fundValuation;
  }

  public AssetUnderManagment groupCurrencyCode(String groupCurrencyCode) {
    this.groupCurrencyCode = groupCurrencyCode;
    return this;
  }

  /**
   * The {AssetUnderManagment}'s group currency. Refer to {listCurrencies}
   * @return groupCurrencyCode
  **/
  @ApiModelProperty(value = "The {AssetUnderManagment}'s group currency. Refer to {listCurrencies}")


  public String getGroupCurrencyCode() {
    return groupCurrencyCode;
  }

  public void setGroupCurrencyCode(String groupCurrencyCode) {
    this.groupCurrencyCode = groupCurrencyCode;
  }

  public AssetUnderManagment groupValuation(Double groupValuation) {
    this.groupValuation = groupValuation;
    return this;
  }

  /**
   * Get groupValuation
   * @return groupValuation
  **/
  @ApiModelProperty(value = "")


  public Double getGroupValuation() {
    return groupValuation;
  }

  public void setGroupValuation(Double groupValuation) {
    this.groupValuation = groupValuation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetUnderManagment assetUnderManagment = (AssetUnderManagment) o;
    return Objects.equals(this.date, assetUnderManagment.date) &&
        Objects.equals(this.fundCurrencyCode, assetUnderManagment.fundCurrencyCode) &&
        Objects.equals(this.fundValuation, assetUnderManagment.fundValuation) &&
        Objects.equals(this.groupCurrencyCode, assetUnderManagment.groupCurrencyCode) &&
        Objects.equals(this.groupValuation, assetUnderManagment.groupValuation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, fundCurrencyCode, fundValuation, groupCurrencyCode, groupValuation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetUnderManagment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fundCurrencyCode: ").append(toIndentedString(fundCurrencyCode)).append("\n");
    sb.append("    fundValuation: ").append(toIndentedString(fundValuation)).append("\n");
    sb.append("    groupCurrencyCode: ").append(toIndentedString(groupCurrencyCode)).append("\n");
    sb.append("    groupValuation: ").append(toIndentedString(groupValuation)).append("\n");
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

