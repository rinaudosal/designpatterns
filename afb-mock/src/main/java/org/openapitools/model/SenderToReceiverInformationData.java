package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SenderToReceiverInformationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SenderToReceiverInformationData   {
  @JsonProperty("information1")
  private String information1 = null;

  @JsonProperty("information2")
  private String information2 = null;

  @JsonProperty("information3")
  private String information3 = null;

  @JsonProperty("information4")
  private String information4 = null;

  public SenderToReceiverInformationData information1(String information1) {
    this.information1 = information1;
    return this;
  }

  /**
   * Additional Information 1, according with `SWIFT` messages for Standards MT
   * @return information1
  **/
  @ApiModelProperty(value = "Additional Information 1, according with `SWIFT` messages for Standards MT")


  public String getInformation1() {
    return information1;
  }

  public void setInformation1(String information1) {
    this.information1 = information1;
  }

  public SenderToReceiverInformationData information2(String information2) {
    this.information2 = information2;
    return this;
  }

  /**
   * Additional Information 2, according with `SWIFT` messages for Standards MT
   * @return information2
  **/
  @ApiModelProperty(value = "Additional Information 2, according with `SWIFT` messages for Standards MT")


  public String getInformation2() {
    return information2;
  }

  public void setInformation2(String information2) {
    this.information2 = information2;
  }

  public SenderToReceiverInformationData information3(String information3) {
    this.information3 = information3;
    return this;
  }

  /**
   * Additional Information 3, according with `SWIFT` messages for Standards MT
   * @return information3
  **/
  @ApiModelProperty(value = "Additional Information 3, according with `SWIFT` messages for Standards MT")


  public String getInformation3() {
    return information3;
  }

  public void setInformation3(String information3) {
    this.information3 = information3;
  }

  public SenderToReceiverInformationData information4(String information4) {
    this.information4 = information4;
    return this;
  }

  /**
   * Additional Information 4, according with `SWIFT` messages for Standards MT
   * @return information4
  **/
  @ApiModelProperty(value = "Additional Information 4, according with `SWIFT` messages for Standards MT")


  public String getInformation4() {
    return information4;
  }

  public void setInformation4(String information4) {
    this.information4 = information4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderToReceiverInformationData senderToReceiverInformationData = (SenderToReceiverInformationData) o;
    return Objects.equals(this.information1, senderToReceiverInformationData.information1) &&
        Objects.equals(this.information2, senderToReceiverInformationData.information2) &&
        Objects.equals(this.information3, senderToReceiverInformationData.information3) &&
        Objects.equals(this.information4, senderToReceiverInformationData.information4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(information1, information2, information3, information4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderToReceiverInformationData {\n");
    
    sb.append("    information1: ").append(toIndentedString(information1)).append("\n");
    sb.append("    information2: ").append(toIndentedString(information2)).append("\n");
    sb.append("    information3: ").append(toIndentedString(information3)).append("\n");
    sb.append("    information4: ").append(toIndentedString(information4)).append("\n");
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

