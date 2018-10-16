package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicCorporateAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BasicCorporateAction   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * Gets or Sets eventSource
   */
  public enum EventSourceEnum {
    FUND("FUND"),
    
    COLLECTIVEINVESTMENTSCHEME("COLLECTIVEINVESTMENTSCHEME"),
    
    FUNDHOUSE("FUNDHOUSE"),
    
    FUNDGROUP("FUNDGROUP");

    private String value;

    EventSourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventSourceEnum fromValue(String text) {
      for (EventSourceEnum b : EventSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("eventSource")
  private EventSourceEnum eventSource = null;

  @JsonProperty("eventTypeCode")
  private String eventTypeCode = null;

  @JsonProperty("executionDate")
  private OffsetDateTime executionDate = null;

  @JsonProperty("isin")
  private String isin = null;

  @JsonProperty("name")
  private String name = null;

  public BasicCorporateAction date(OffsetDateTime date) {
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

  public BasicCorporateAction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The {CorporateAction}'s description.
   * @return description
  **/
  @ApiModelProperty(value = "The {CorporateAction}'s description.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BasicCorporateAction eventSource(EventSourceEnum eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  /**
   * Get eventSource
   * @return eventSource
  **/
  @ApiModelProperty(value = "")


  public EventSourceEnum getEventSource() {
    return eventSource;
  }

  public void setEventSource(EventSourceEnum eventSource) {
    this.eventSource = eventSource;
  }

  public BasicCorporateAction eventTypeCode(String eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
    return this;
  }

  /**
   * Refers to {listEventTypes}
   * @return eventTypeCode
  **/
  @ApiModelProperty(value = "Refers to {listEventTypes}")


  public String getEventTypeCode() {
    return eventTypeCode;
  }

  public void setEventTypeCode(String eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
  }

  public BasicCorporateAction executionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * The {CorporateAction}'s execution date.
   * @return executionDate
  **/
  @ApiModelProperty(value = "The {CorporateAction}'s execution date.")

  @Valid

  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }

  public BasicCorporateAction isin(String isin) {
    this.isin = isin;
    return this;
  }

  /**
   * International Securities Identification Number as per ISO 6166.   [A-Z]{2}([A-Z]|[0-9]){9}[0-9]
   * @return isin
  **/
  @ApiModelProperty(value = "International Securities Identification Number as per ISO 6166.   [A-Z]{2}([A-Z]|[0-9]){9}[0-9]")


  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public BasicCorporateAction name(String name) {
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
    BasicCorporateAction basicCorporateAction = (BasicCorporateAction) o;
    return Objects.equals(this.date, basicCorporateAction.date) &&
        Objects.equals(this.description, basicCorporateAction.description) &&
        Objects.equals(this.eventSource, basicCorporateAction.eventSource) &&
        Objects.equals(this.eventTypeCode, basicCorporateAction.eventTypeCode) &&
        Objects.equals(this.executionDate, basicCorporateAction.executionDate) &&
        Objects.equals(this.isin, basicCorporateAction.isin) &&
        Objects.equals(this.name, basicCorporateAction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, description, eventSource, eventTypeCode, executionDate, isin, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicCorporateAction {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventTypeCode: ").append(toIndentedString(eventTypeCode)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
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

