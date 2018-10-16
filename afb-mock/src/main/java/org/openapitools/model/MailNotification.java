package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {MailNotification}.
 */
@ApiModel(description = "A simple object composed of either a {MailNotification}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MailNotification   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("investmentLimitRiskLevelCodes")
  @Valid
  private List<String> investmentLimitRiskLevelCodes = null;

  public MailNotification email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email addresses for Accessibility
   * @return email
  **/
  @ApiModelProperty(value = "Email addresses for Accessibility")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MailNotification id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {MailNotification}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {MailNotification}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MailNotification investmentLimitRiskLevelCodes(List<String> investmentLimitRiskLevelCodes) {
    this.investmentLimitRiskLevelCodes = investmentLimitRiskLevelCodes;
    return this;
  }

  public MailNotification addInvestmentLimitRiskLevelCodesItem(String investmentLimitRiskLevelCodesItem) {
    if (this.investmentLimitRiskLevelCodes == null) {
      this.investmentLimitRiskLevelCodes = new ArrayList<>();
    }
    this.investmentLimitRiskLevelCodes.add(investmentLimitRiskLevelCodesItem);
    return this;
  }

  /**
   * The array of codes refer to {listInvestmentLimitRiskLevels}
   * @return investmentLimitRiskLevelCodes
  **/
  @ApiModelProperty(value = "The array of codes refer to {listInvestmentLimitRiskLevels}")


  public List<String> getInvestmentLimitRiskLevelCodes() {
    return investmentLimitRiskLevelCodes;
  }

  public void setInvestmentLimitRiskLevelCodes(List<String> investmentLimitRiskLevelCodes) {
    this.investmentLimitRiskLevelCodes = investmentLimitRiskLevelCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailNotification mailNotification = (MailNotification) o;
    return Objects.equals(this.email, mailNotification.email) &&
        Objects.equals(this.id, mailNotification.id) &&
        Objects.equals(this.investmentLimitRiskLevelCodes, mailNotification.investmentLimitRiskLevelCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, investmentLimitRiskLevelCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailNotification {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investmentLimitRiskLevelCodes: ").append(toIndentedString(investmentLimitRiskLevelCodes)).append("\n");
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

