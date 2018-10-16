package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.WeightedInstrumentFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedComparison
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavedComparison   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instruments")
  @Valid
  private List<WeightedInstrumentFilter> instruments = null;

  @JsonProperty("name")
  private String name = null;

  public SavedComparison id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {SavedComparison}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {SavedComparison}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SavedComparison instruments(List<WeightedInstrumentFilter> instruments) {
    this.instruments = instruments;
    return this;
  }

  public SavedComparison addInstrumentsItem(WeightedInstrumentFilter instrumentsItem) {
    if (this.instruments == null) {
      this.instruments = new ArrayList<>();
    }
    this.instruments.add(instrumentsItem);
    return this;
  }

  /**
   * Get instruments
   * @return instruments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WeightedInstrumentFilter> getInstruments() {
    return instruments;
  }

  public void setInstruments(List<WeightedInstrumentFilter> instruments) {
    this.instruments = instruments;
  }

  public SavedComparison name(String name) {
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
    SavedComparison savedComparison = (SavedComparison) o;
    return Objects.equals(this.id, savedComparison.id) &&
        Objects.equals(this.instruments, savedComparison.instruments) &&
        Objects.equals(this.name, savedComparison.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instruments, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedComparison {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
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

