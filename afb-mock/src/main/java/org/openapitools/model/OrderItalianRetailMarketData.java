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
 * OrderItalianRetailMarketData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderItalianRetailMarketData   {
  /**
   * defines fee charge type between \"FRONTLOAD\", \"BACKLOAD\"
   */
  public enum FeeChargeOptionEnum {
    FRONTLOAD("FRONTLOAD"),
    
    BACKLOAD("BACKLOAD");

    private String value;

    FeeChargeOptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeChargeOptionEnum fromValue(String text) {
      for (FeeChargeOptionEnum b : FeeChargeOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("feeChargeOption")
  private FeeChargeOptionEnum feeChargeOption = null;

  public OrderItalianRetailMarketData feeChargeOption(FeeChargeOptionEnum feeChargeOption) {
    this.feeChargeOption = feeChargeOption;
    return this;
  }

  /**
   * defines fee charge type between \"FRONTLOAD\", \"BACKLOAD\"
   * @return feeChargeOption
  **/
  @ApiModelProperty(value = "defines fee charge type between \"FRONTLOAD\", \"BACKLOAD\"")


  public FeeChargeOptionEnum getFeeChargeOption() {
    return feeChargeOption;
  }

  public void setFeeChargeOption(FeeChargeOptionEnum feeChargeOption) {
    this.feeChargeOption = feeChargeOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItalianRetailMarketData orderItalianRetailMarketData = (OrderItalianRetailMarketData) o;
    return Objects.equals(this.feeChargeOption, orderItalianRetailMarketData.feeChargeOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeChargeOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItalianRetailMarketData {\n");
    
    sb.append("    feeChargeOption: ").append(toIndentedString(feeChargeOption)).append("\n");
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

