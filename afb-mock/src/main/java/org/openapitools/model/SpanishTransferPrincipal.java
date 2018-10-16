package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferPrincipal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferPrincipal   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("secondSurname")
  private String secondSurname = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("taxpayerId")
  private String taxpayerId = null;

  public SpanishTransferPrincipal firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of a {SpanishTransfer} principal.
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name of a {SpanishTransfer} principal.")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SpanishTransferPrincipal secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  /**
   * The second surname of a {SpanishTransfer} principal.
   * @return secondSurname
  **/
  @ApiModelProperty(value = "The second surname of a {SpanishTransfer} principal.")


  public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }

  public SpanishTransferPrincipal surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * The surname of a {SpanishTransfer} principal.
   * @return surname
  **/
  @ApiModelProperty(value = "The surname of a {SpanishTransfer} principal.")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public SpanishTransferPrincipal taxpayerId(String taxpayerId) {
    this.taxpayerId = taxpayerId;
    return this;
  }

  /**
   * The Id of the taxpayer associated to the principal
   * @return taxpayerId
  **/
  @ApiModelProperty(value = "The Id of the taxpayer associated to the principal")


  public String getTaxpayerId() {
    return taxpayerId;
  }

  public void setTaxpayerId(String taxpayerId) {
    this.taxpayerId = taxpayerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferPrincipal spanishTransferPrincipal = (SpanishTransferPrincipal) o;
    return Objects.equals(this.firstName, spanishTransferPrincipal.firstName) &&
        Objects.equals(this.secondSurname, spanishTransferPrincipal.secondSurname) &&
        Objects.equals(this.surname, spanishTransferPrincipal.surname) &&
        Objects.equals(this.taxpayerId, spanishTransferPrincipal.taxpayerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, secondSurname, surname, taxpayerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferPrincipal {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    taxpayerId: ").append(toIndentedString(taxpayerId)).append("\n");
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

