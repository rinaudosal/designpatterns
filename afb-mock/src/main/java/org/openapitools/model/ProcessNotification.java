package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ProcessNotification   {
  @JsonProperty("notificationStatusCode")
  private String notificationStatusCode = null;

  public ProcessNotification notificationStatusCode(String notificationStatusCode) {
    this.notificationStatusCode = notificationStatusCode;
    return this;
  }

  /**
   * The new {Notification}'s status. Refer to {listNotificationStatuses}
   * @return notificationStatusCode
  **/
  @ApiModelProperty(value = "The new {Notification}'s status. Refer to {listNotificationStatuses}")


  public String getNotificationStatusCode() {
    return notificationStatusCode;
  }

  public void setNotificationStatusCode(String notificationStatusCode) {
    this.notificationStatusCode = notificationStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessNotification processNotification = (ProcessNotification) o;
    return Objects.equals(this.notificationStatusCode, processNotification.notificationStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessNotification {\n");
    
    sb.append("    notificationStatusCode: ").append(toIndentedString(notificationStatusCode)).append("\n");
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

