package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OperationalPortfolioMovement;
import org.openapitools.model.OperationalPortfolioOrder;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioTransaction   {
  @JsonProperty("operationalPorfolioOrders")
  @Valid
  private List<OperationalPortfolioOrder> operationalPorfolioOrders = null;

  @JsonProperty("operationalPortfolioMovement")
  private OperationalPortfolioMovement operationalPortfolioMovement = null;

  public OperationalPortfolioTransaction operationalPorfolioOrders(List<OperationalPortfolioOrder> operationalPorfolioOrders) {
    this.operationalPorfolioOrders = operationalPorfolioOrders;
    return this;
  }

  public OperationalPortfolioTransaction addOperationalPorfolioOrdersItem(OperationalPortfolioOrder operationalPorfolioOrdersItem) {
    if (this.operationalPorfolioOrders == null) {
      this.operationalPorfolioOrders = new ArrayList<>();
    }
    this.operationalPorfolioOrders.add(operationalPorfolioOrdersItem);
    return this;
  }

  /**
   * The array of {OperationalPortfolioOrderItem}
   * @return operationalPorfolioOrders
  **/
  @ApiModelProperty(value = "The array of {OperationalPortfolioOrderItem}")

  @Valid

  public List<OperationalPortfolioOrder> getOperationalPorfolioOrders() {
    return operationalPorfolioOrders;
  }

  public void setOperationalPorfolioOrders(List<OperationalPortfolioOrder> operationalPorfolioOrders) {
    this.operationalPorfolioOrders = operationalPorfolioOrders;
  }

  public OperationalPortfolioTransaction operationalPortfolioMovement(OperationalPortfolioMovement operationalPortfolioMovement) {
    this.operationalPortfolioMovement = operationalPortfolioMovement;
    return this;
  }

  /**
   * Get operationalPortfolioMovement
   * @return operationalPortfolioMovement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioMovement getOperationalPortfolioMovement() {
    return operationalPortfolioMovement;
  }

  public void setOperationalPortfolioMovement(OperationalPortfolioMovement operationalPortfolioMovement) {
    this.operationalPortfolioMovement = operationalPortfolioMovement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioTransaction operationalPortfolioTransaction = (OperationalPortfolioTransaction) o;
    return Objects.equals(this.operationalPorfolioOrders, operationalPortfolioTransaction.operationalPorfolioOrders) &&
        Objects.equals(this.operationalPortfolioMovement, operationalPortfolioTransaction.operationalPortfolioMovement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalPorfolioOrders, operationalPortfolioMovement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioTransaction {\n");
    
    sb.append("    operationalPorfolioOrders: ").append(toIndentedString(operationalPorfolioOrders)).append("\n");
    sb.append("    operationalPortfolioMovement: ").append(toIndentedString(operationalPortfolioMovement)).append("\n");
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

