package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OperationalAmountFee;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalFeeDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalFeeDetails   {
  @JsonProperty("amountFees")
  @Valid
  private List<OperationalAmountFee> amountFees = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("startDate")
  private String startDate = null;

  public OperationalFeeDetails amountFees(List<OperationalAmountFee> amountFees) {
    this.amountFees = amountFees;
    return this;
  }

  public OperationalFeeDetails addAmountFeesItem(OperationalAmountFee amountFeesItem) {
    if (this.amountFees == null) {
      this.amountFees = new ArrayList<>();
    }
    this.amountFees.add(amountFeesItem);
    return this;
  }

  /**
   * The array of {OperationalAmountFee}
   * @return amountFees
  **/
  @ApiModelProperty(value = "The array of {OperationalAmountFee}")

  @Valid

  public List<OperationalAmountFee> getAmountFees() {
    return amountFees;
  }

  public void setAmountFees(List<OperationalAmountFee> amountFees) {
    this.amountFees = amountFees;
  }

  public OperationalFeeDetails endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date
   * @return endDate
  **/
  @ApiModelProperty(value = "End date")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public OperationalFeeDetails startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalFeeDetails operationalFeeDetails = (OperationalFeeDetails) o;
    return Objects.equals(this.amountFees, operationalFeeDetails.amountFees) &&
        Objects.equals(this.endDate, operationalFeeDetails.endDate) &&
        Objects.equals(this.startDate, operationalFeeDetails.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountFees, endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalFeeDetails {\n");
    
    sb.append("    amountFees: ").append(toIndentedString(amountFees)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

