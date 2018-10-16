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
 * The DateMessage is a simple bean used in the Echo Date Service.
 */
@ApiModel(description = "The DateMessage is a simple bean used in the Echo Date Service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DateMessage   {
  @JsonProperty("clientDate")
  private OffsetDateTime clientDate = null;

  @JsonProperty("clientEpoch")
  private Long clientEpoch = null;

  @JsonProperty("clientString")
  private String clientString = null;

  @JsonProperty("serverDate")
  private OffsetDateTime serverDate = null;

  @JsonProperty("serverEpoch")
  private Long serverEpoch = null;

  @JsonProperty("serverString")
  private String serverString = null;

  public DateMessage clientDate(OffsetDateTime clientDate) {
    this.clientDate = clientDate;
    return this;
  }

  /**
   * Get clientDate
   * @return clientDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getClientDate() {
    return clientDate;
  }

  public void setClientDate(OffsetDateTime clientDate) {
    this.clientDate = clientDate;
  }

  public DateMessage clientEpoch(Long clientEpoch) {
    this.clientEpoch = clientEpoch;
    return this;
  }

  /**
   * Get clientEpoch
   * @return clientEpoch
  **/
  @ApiModelProperty(value = "")


  public Long getClientEpoch() {
    return clientEpoch;
  }

  public void setClientEpoch(Long clientEpoch) {
    this.clientEpoch = clientEpoch;
  }

  public DateMessage clientString(String clientString) {
    this.clientString = clientString;
    return this;
  }

  /**
   * Get clientString
   * @return clientString
  **/
  @ApiModelProperty(value = "")


  public String getClientString() {
    return clientString;
  }

  public void setClientString(String clientString) {
    this.clientString = clientString;
  }

  public DateMessage serverDate(OffsetDateTime serverDate) {
    this.serverDate = serverDate;
    return this;
  }

  /**
   * Get serverDate
   * @return serverDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getServerDate() {
    return serverDate;
  }

  public void setServerDate(OffsetDateTime serverDate) {
    this.serverDate = serverDate;
  }

  public DateMessage serverEpoch(Long serverEpoch) {
    this.serverEpoch = serverEpoch;
    return this;
  }

  /**
   * Get serverEpoch
   * @return serverEpoch
  **/
  @ApiModelProperty(value = "")


  public Long getServerEpoch() {
    return serverEpoch;
  }

  public void setServerEpoch(Long serverEpoch) {
    this.serverEpoch = serverEpoch;
  }

  public DateMessage serverString(String serverString) {
    this.serverString = serverString;
    return this;
  }

  /**
   * Get serverString
   * @return serverString
  **/
  @ApiModelProperty(value = "")


  public String getServerString() {
    return serverString;
  }

  public void setServerString(String serverString) {
    this.serverString = serverString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateMessage dateMessage = (DateMessage) o;
    return Objects.equals(this.clientDate, dateMessage.clientDate) &&
        Objects.equals(this.clientEpoch, dateMessage.clientEpoch) &&
        Objects.equals(this.clientString, dateMessage.clientString) &&
        Objects.equals(this.serverDate, dateMessage.serverDate) &&
        Objects.equals(this.serverEpoch, dateMessage.serverEpoch) &&
        Objects.equals(this.serverString, dateMessage.serverString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDate, clientEpoch, clientString, serverDate, serverEpoch, serverString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateMessage {\n");
    
    sb.append("    clientDate: ").append(toIndentedString(clientDate)).append("\n");
    sb.append("    clientEpoch: ").append(toIndentedString(clientEpoch)).append("\n");
    sb.append("    clientString: ").append(toIndentedString(clientString)).append("\n");
    sb.append("    serverDate: ").append(toIndentedString(serverDate)).append("\n");
    sb.append("    serverEpoch: ").append(toIndentedString(serverEpoch)).append("\n");
    sb.append("    serverString: ").append(toIndentedString(serverString)).append("\n");
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

