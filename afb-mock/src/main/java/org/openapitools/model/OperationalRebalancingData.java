package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalRebalancingData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalRebalancingData   {
  @JsonProperty("automatedProcess")
  private Boolean automatedProcess = null;

  @JsonProperty("minimumAmountAdditionalContribution")
  private String minimumAmountAdditionalContribution = null;

  @JsonProperty("minimumAmountContribution")
  private String minimumAmountContribution = null;

  @JsonProperty("minimumAmountPermanence")
  private String minimumAmountPermanence = null;

  @JsonProperty("supervision")
  private Boolean supervision = null;

  public OperationalRebalancingData automatedProcess(Boolean automatedProcess) {
    this.automatedProcess = automatedProcess;
    return this;
  }

  /**
   * Indicate if the system will automatically send orders to the market without necessity of supervision. It will work together with Supervision indicator.
   * @return automatedProcess
  **/
  @ApiModelProperty(value = "Indicate if the system will automatically send orders to the market without necessity of supervision. It will work together with Supervision indicator.")


  public Boolean getAutomatedProcess() {
    return automatedProcess;
  }

  public void setAutomatedProcess(Boolean automatedProcess) {
    this.automatedProcess = automatedProcess;
  }

  public OperationalRebalancingData minimumAmountAdditionalContribution(String minimumAmountAdditionalContribution) {
    this.minimumAmountAdditionalContribution = minimumAmountAdditionalContribution;
    return this;
  }

  /**
   * Minimum amouunt for additional contribution to the {OperationalPortfolio}
   * @return minimumAmountAdditionalContribution
  **/
  @ApiModelProperty(value = "Minimum amouunt for additional contribution to the {OperationalPortfolio}")


  public String getMinimumAmountAdditionalContribution() {
    return minimumAmountAdditionalContribution;
  }

  public void setMinimumAmountAdditionalContribution(String minimumAmountAdditionalContribution) {
    this.minimumAmountAdditionalContribution = minimumAmountAdditionalContribution;
  }

  public OperationalRebalancingData minimumAmountContribution(String minimumAmountContribution) {
    this.minimumAmountContribution = minimumAmountContribution;
    return this;
  }

  /**
   * Minimum amount for contribution to the {OperationalPortfolio}
   * @return minimumAmountContribution
  **/
  @ApiModelProperty(value = "Minimum amount for contribution to the {OperationalPortfolio}")


  public String getMinimumAmountContribution() {
    return minimumAmountContribution;
  }

  public void setMinimumAmountContribution(String minimumAmountContribution) {
    this.minimumAmountContribution = minimumAmountContribution;
  }

  public OperationalRebalancingData minimumAmountPermanence(String minimumAmountPermanence) {
    this.minimumAmountPermanence = minimumAmountPermanence;
    return this;
  }

  /**
   * Minimum amouunt for permanence to the {OperationalPortfolio}
   * @return minimumAmountPermanence
  **/
  @ApiModelProperty(value = "Minimum amouunt for permanence to the {OperationalPortfolio}")


  public String getMinimumAmountPermanence() {
    return minimumAmountPermanence;
  }

  public void setMinimumAmountPermanence(String minimumAmountPermanence) {
    this.minimumAmountPermanence = minimumAmountPermanence;
  }

  public OperationalRebalancingData supervision(Boolean supervision) {
    this.supervision = supervision;
    return this;
  }

  /**
   * Indicate if the system will wait for supervision of users before send orders to the market. It will work together with Automated indicator.
   * @return supervision
  **/
  @ApiModelProperty(value = "Indicate if the system will wait for supervision of users before send orders to the market. It will work together with Automated indicator.")


  public Boolean getSupervision() {
    return supervision;
  }

  public void setSupervision(Boolean supervision) {
    this.supervision = supervision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalRebalancingData operationalRebalancingData = (OperationalRebalancingData) o;
    return Objects.equals(this.automatedProcess, operationalRebalancingData.automatedProcess) &&
        Objects.equals(this.minimumAmountAdditionalContribution, operationalRebalancingData.minimumAmountAdditionalContribution) &&
        Objects.equals(this.minimumAmountContribution, operationalRebalancingData.minimumAmountContribution) &&
        Objects.equals(this.minimumAmountPermanence, operationalRebalancingData.minimumAmountPermanence) &&
        Objects.equals(this.supervision, operationalRebalancingData.supervision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automatedProcess, minimumAmountAdditionalContribution, minimumAmountContribution, minimumAmountPermanence, supervision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalRebalancingData {\n");
    
    sb.append("    automatedProcess: ").append(toIndentedString(automatedProcess)).append("\n");
    sb.append("    minimumAmountAdditionalContribution: ").append(toIndentedString(minimumAmountAdditionalContribution)).append("\n");
    sb.append("    minimumAmountContribution: ").append(toIndentedString(minimumAmountContribution)).append("\n");
    sb.append("    minimumAmountPermanence: ").append(toIndentedString(minimumAmountPermanence)).append("\n");
    sb.append("    supervision: ").append(toIndentedString(supervision)).append("\n");
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

