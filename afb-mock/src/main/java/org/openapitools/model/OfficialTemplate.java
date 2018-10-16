package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Mifid2Data;
import org.openapitools.model.PriipsData;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfficialTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OfficialTemplate   {
  @JsonProperty("instrument")
  private ResourceReference instrument = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
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

  @JsonProperty("mifid2")
  private Mifid2Data mifid2 = null;

  @JsonProperty("priips")
  private PriipsData priips = null;

  public OfficialTemplate instrument(ResourceReference instrument) {
    this.instrument = instrument;
    return this;
  }

  /**
   * Get instrument
   * @return instrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getInstrument() {
    return instrument;
  }

  public void setInstrument(ResourceReference instrument) {
    this.instrument = instrument;
  }

  public OfficialTemplate instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return instrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }

  public OfficialTemplate mifid2(Mifid2Data mifid2) {
    this.mifid2 = mifid2;
    return this;
  }

  /**
   * Get mifid2
   * @return mifid2
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Mifid2Data getMifid2() {
    return mifid2;
  }

  public void setMifid2(Mifid2Data mifid2) {
    this.mifid2 = mifid2;
  }

  public OfficialTemplate priips(PriipsData priips) {
    this.priips = priips;
    return this;
  }

  /**
   * Get priips
   * @return priips
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PriipsData getPriips() {
    return priips;
  }

  public void setPriips(PriipsData priips) {
    this.priips = priips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficialTemplate officialTemplate = (OfficialTemplate) o;
    return Objects.equals(this.instrument, officialTemplate.instrument) &&
        Objects.equals(this.instrumentType, officialTemplate.instrumentType) &&
        Objects.equals(this.mifid2, officialTemplate.mifid2) &&
        Objects.equals(this.priips, officialTemplate.priips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument, instrumentType, mifid2, priips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficialTemplate {\n");
    
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    mifid2: ").append(toIndentedString(mifid2)).append("\n");
    sb.append("    priips: ").append(toIndentedString(priips)).append("\n");
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

