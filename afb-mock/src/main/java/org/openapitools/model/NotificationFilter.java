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
 * NotificationFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class NotificationFilter   {
  @JsonProperty("endNotificationDate")
  private OffsetDateTime endNotificationDate = null;

  @JsonProperty("notificationId")
  private Long notificationId = null;

  @JsonProperty("notificationStatusCode")
  private String notificationStatusCode = null;

  @JsonProperty("notificationTypeCode")
  private String notificationTypeCode = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  @JsonProperty("startNotificationDate")
  private OffsetDateTime startNotificationDate = null;

  public NotificationFilter endNotificationDate(OffsetDateTime endNotificationDate) {
    this.endNotificationDate = endNotificationDate;
    return this;
  }

  /**
   * End date to do the search.
   * @return endNotificationDate
  **/
  @ApiModelProperty(value = "End date to do the search.")

  @Valid

  public OffsetDateTime getEndNotificationDate() {
    return endNotificationDate;
  }

  public void setEndNotificationDate(OffsetDateTime endNotificationDate) {
    this.endNotificationDate = endNotificationDate;
  }

  public NotificationFilter notificationId(Long notificationId) {
    this.notificationId = notificationId;
    return this;
  }

  /**
   * The id of {Notification}.
   * @return notificationId
  **/
  @ApiModelProperty(value = "The id of {Notification}.")


  public Long getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(Long notificationId) {
    this.notificationId = notificationId;
  }

  public NotificationFilter notificationStatusCode(String notificationStatusCode) {
    this.notificationStatusCode = notificationStatusCode;
    return this;
  }

  /**
   * The status of {Notification}. Refer to {listNotificationStatuses}
   * @return notificationStatusCode
  **/
  @ApiModelProperty(value = "The status of {Notification}. Refer to {listNotificationStatuses}")


  public String getNotificationStatusCode() {
    return notificationStatusCode;
  }

  public void setNotificationStatusCode(String notificationStatusCode) {
    this.notificationStatusCode = notificationStatusCode;
  }

  public NotificationFilter notificationTypeCode(String notificationTypeCode) {
    this.notificationTypeCode = notificationTypeCode;
    return this;
  }

  /**
   * The type of {Notification}. Refer to {listNotificationTypes}
   * @return notificationTypeCode
  **/
  @ApiModelProperty(value = "The type of {Notification}. Refer to {listNotificationTypes}")


  public String getNotificationTypeCode() {
    return notificationTypeCode;
  }

  public void setNotificationTypeCode(String notificationTypeCode) {
    this.notificationTypeCode = notificationTypeCode;
  }

  public NotificationFilter operationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolio}
   * @return operationalPortfolioId
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolio}")


  public Long getOperationalPortfolioId() {
    return operationalPortfolioId;
  }

  public void setOperationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
  }

  public NotificationFilter startNotificationDate(OffsetDateTime startNotificationDate) {
    this.startNotificationDate = startNotificationDate;
    return this;
  }

  /**
   * Start date to do the search.
   * @return startNotificationDate
  **/
  @ApiModelProperty(value = "Start date to do the search.")

  @Valid

  public OffsetDateTime getStartNotificationDate() {
    return startNotificationDate;
  }

  public void setStartNotificationDate(OffsetDateTime startNotificationDate) {
    this.startNotificationDate = startNotificationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationFilter notificationFilter = (NotificationFilter) o;
    return Objects.equals(this.endNotificationDate, notificationFilter.endNotificationDate) &&
        Objects.equals(this.notificationId, notificationFilter.notificationId) &&
        Objects.equals(this.notificationStatusCode, notificationFilter.notificationStatusCode) &&
        Objects.equals(this.notificationTypeCode, notificationFilter.notificationTypeCode) &&
        Objects.equals(this.operationalPortfolioId, notificationFilter.operationalPortfolioId) &&
        Objects.equals(this.startNotificationDate, notificationFilter.startNotificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endNotificationDate, notificationId, notificationStatusCode, notificationTypeCode, operationalPortfolioId, startNotificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationFilter {\n");
    
    sb.append("    endNotificationDate: ").append(toIndentedString(endNotificationDate)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationStatusCode: ").append(toIndentedString(notificationStatusCode)).append("\n");
    sb.append("    notificationTypeCode: ").append(toIndentedString(notificationTypeCode)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    startNotificationDate: ").append(toIndentedString(startNotificationDate)).append("\n");
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

