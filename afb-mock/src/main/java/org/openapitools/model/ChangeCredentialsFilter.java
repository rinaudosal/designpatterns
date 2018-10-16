package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the current and the new values of user credentials in order to change the current value to the new one
 */
@ApiModel(description = "Contains the current and the new values of user credentials in order to change the current value to the new one")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ChangeCredentialsFilter   {
  @JsonProperty("currentValue")
  private String currentValue = null;

  @JsonProperty("newValue")
  private String newValue = null;

  @JsonProperty("username")
  private String username = null;

  public ChangeCredentialsFilter currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }

  /**
   * The current value of the {User} credentials.
   * @return currentValue
  **/
  @ApiModelProperty(value = "The current value of the {User} credentials.")


  public String getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }

  public ChangeCredentialsFilter newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * The new value of the {User} credentials
   * @return newValue
  **/
  @ApiModelProperty(value = "The new value of the {User} credentials")


  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public ChangeCredentialsFilter username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The {User.username}.
   * @return username
  **/
  @ApiModelProperty(value = "The {User.username}.")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeCredentialsFilter changeCredentialsFilter = (ChangeCredentialsFilter) o;
    return Objects.equals(this.currentValue, changeCredentialsFilter.currentValue) &&
        Objects.equals(this.newValue, changeCredentialsFilter.newValue) &&
        Objects.equals(this.username, changeCredentialsFilter.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentValue, newValue, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeCredentialsFilter {\n");
    
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

