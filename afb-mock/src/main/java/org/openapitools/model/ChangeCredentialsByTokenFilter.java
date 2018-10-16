package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains a couple of {User.id} and token values.
 */
@ApiModel(description = "Contains a couple of {User.id} and token values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ChangeCredentialsByTokenFilter   {
  @JsonProperty("newValue")
  private String newValue = null;

  @JsonProperty("userToken")
  private String userToken = null;

  public ChangeCredentialsByTokenFilter newValue(String newValue) {
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

  public ChangeCredentialsByTokenFilter userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

  /**
   * The token assigned to the forgot password request
   * @return userToken
  **/
  @ApiModelProperty(value = "The token assigned to the forgot password request")


  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeCredentialsByTokenFilter changeCredentialsByTokenFilter = (ChangeCredentialsByTokenFilter) o;
    return Objects.equals(this.newValue, changeCredentialsByTokenFilter.newValue) &&
        Objects.equals(this.userToken, changeCredentialsByTokenFilter.userToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newValue, userToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeCredentialsByTokenFilter {\n");
    
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
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

