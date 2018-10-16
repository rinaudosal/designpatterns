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
 * FavoriteInstrumentFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FavoriteInstrumentFilter   {
  /**
   * Indicate whether the favorites list should be of Fund or ETF resources.
   */
  public enum InstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstrumentTypeEnum fromValue(String text) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("instrumentType")
  private InstrumentTypeEnum instrumentType = null;

  public FavoriteInstrumentFilter instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Indicate whether the favorites list should be of Fund or ETF resources.
   * @return instrumentType
  **/
  @ApiModelProperty(value = "Indicate whether the favorites list should be of Fund or ETF resources.")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoriteInstrumentFilter favoriteInstrumentFilter = (FavoriteInstrumentFilter) o;
    return Objects.equals(this.instrumentType, favoriteInstrumentFilter.instrumentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteInstrumentFilter {\n");
    
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
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

