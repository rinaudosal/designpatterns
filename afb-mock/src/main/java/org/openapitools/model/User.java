package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class User   {
  @JsonProperty("defaulLanguageCode")
  private String defaulLanguageCode = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("secondSurname")
  private String secondSurname = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("username")
  private String username = null;

  public User defaulLanguageCode(String defaulLanguageCode) {
    this.defaulLanguageCode = defaulLanguageCode;
    return this;
  }

  /**
   * User's default language
   * @return defaulLanguageCode
  **/
  @ApiModelProperty(value = "User's default language")


  public String getDefaulLanguageCode() {
    return defaulLanguageCode;
  }

  public void setDefaulLanguageCode(String defaulLanguageCode) {
    this.defaulLanguageCode = defaulLanguageCode;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email
   * @return email
  **/
  @ApiModelProperty(value = "User's email")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * User's firstname
   * @return firstname
  **/
  @ApiModelProperty(value = "User's firstname")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public User id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Internal Id of the {User}
   * @return id
  **/
  @ApiModelProperty(value = "Internal Id of the {User}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  /**
   * User's secondd surname
   * @return secondSurname
  **/
  @ApiModelProperty(value = "User's secondd surname")


  public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }

  public User surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * User's surname
   * @return surname
  **/
  @ApiModelProperty(value = "User's surname")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Exteral Id of the {User}
   * @return username
  **/
  @ApiModelProperty(value = "Exteral Id of the {User}")


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
    User user = (User) o;
    return Objects.equals(this.defaulLanguageCode, user.defaulLanguageCode) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstname, user.firstname) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.secondSurname, user.secondSurname) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.username, user.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaulLanguageCode, email, firstname, id, secondSurname, surname, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    defaulLanguageCode: ").append(toIndentedString(defaulLanguageCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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

