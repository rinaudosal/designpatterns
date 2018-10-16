package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Notification;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Notification} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Notification} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class NotificationAndPage   {
  @JsonProperty("notifications")
  @Valid
  private List<Notification> notifications = null;

  @JsonProperty("page")
  private Page page = null;

  public NotificationAndPage notifications(List<Notification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public NotificationAndPage addNotificationsItem(Notification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * The array of {Notification}
   * @return notifications
  **/
  @ApiModelProperty(value = "The array of {Notification}")

  @Valid

  public List<Notification> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<Notification> notifications) {
    this.notifications = notifications;
  }

  public NotificationAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationAndPage notificationAndPage = (NotificationAndPage) o;
    return Objects.equals(this.notifications, notificationAndPage.notifications) &&
        Objects.equals(this.page, notificationAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationAndPage {\n");
    
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

