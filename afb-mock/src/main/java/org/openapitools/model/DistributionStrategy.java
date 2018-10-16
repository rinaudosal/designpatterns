package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DistributionStrategy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DistributionStrategy   {
  /**
   * Retail or Professional or Both or Neither
   */
  public enum ExecutionOnlyEnum {
    R("R"),
    
    P("P"),
    
    B("B"),
    
    N("N");

    private String value;

    ExecutionOnlyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExecutionOnlyEnum fromValue(String text) {
      for (ExecutionOnlyEnum b : ExecutionOnlyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("executionOnly")
  private ExecutionOnlyEnum executionOnly = null;

  /**
   * Retail or Professional or Both or Neither
   */
  public enum ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum {
    R("R"),
    
    P("P"),
    
    B("B"),
    
    N("N");

    private String value;

    ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum fromValue(String text) {
      for (ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum b : ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("executionWithAppropriatenessTestOrNonAdvisedServices")
  private ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum executionWithAppropriatenessTestOrNonAdvisedServices = null;

  /**
   * Retail or Professional or Both or Neither
   */
  public enum InvestmentAdviceEnum {
    R("R"),
    
    P("P"),
    
    B("B"),
    
    N("N");

    private String value;

    InvestmentAdviceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InvestmentAdviceEnum fromValue(String text) {
      for (InvestmentAdviceEnum b : InvestmentAdviceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("investmentAdvice")
  private InvestmentAdviceEnum investmentAdvice = null;

  /**
   * Retail or Professional or Both or Neither
   */
  public enum PortfolioManagementEnum {
    R("R"),
    
    P("P"),
    
    B("B"),
    
    N("N");

    private String value;

    PortfolioManagementEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PortfolioManagementEnum fromValue(String text) {
      for (PortfolioManagementEnum b : PortfolioManagementEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("portfolioManagement")
  private PortfolioManagementEnum portfolioManagement = null;

  public DistributionStrategy executionOnly(ExecutionOnlyEnum executionOnly) {
    this.executionOnly = executionOnly;
    return this;
  }

  /**
   * Retail or Professional or Both or Neither
   * @return executionOnly
  **/
  @ApiModelProperty(value = "Retail or Professional or Both or Neither")


  public ExecutionOnlyEnum getExecutionOnly() {
    return executionOnly;
  }

  public void setExecutionOnly(ExecutionOnlyEnum executionOnly) {
    this.executionOnly = executionOnly;
  }

  public DistributionStrategy executionWithAppropriatenessTestOrNonAdvisedServices(ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum executionWithAppropriatenessTestOrNonAdvisedServices) {
    this.executionWithAppropriatenessTestOrNonAdvisedServices = executionWithAppropriatenessTestOrNonAdvisedServices;
    return this;
  }

  /**
   * Retail or Professional or Both or Neither
   * @return executionWithAppropriatenessTestOrNonAdvisedServices
  **/
  @ApiModelProperty(value = "Retail or Professional or Both or Neither")


  public ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum getExecutionWithAppropriatenessTestOrNonAdvisedServices() {
    return executionWithAppropriatenessTestOrNonAdvisedServices;
  }

  public void setExecutionWithAppropriatenessTestOrNonAdvisedServices(ExecutionWithAppropriatenessTestOrNonAdvisedServicesEnum executionWithAppropriatenessTestOrNonAdvisedServices) {
    this.executionWithAppropriatenessTestOrNonAdvisedServices = executionWithAppropriatenessTestOrNonAdvisedServices;
  }

  public DistributionStrategy investmentAdvice(InvestmentAdviceEnum investmentAdvice) {
    this.investmentAdvice = investmentAdvice;
    return this;
  }

  /**
   * Retail or Professional or Both or Neither
   * @return investmentAdvice
  **/
  @ApiModelProperty(value = "Retail or Professional or Both or Neither")


  public InvestmentAdviceEnum getInvestmentAdvice() {
    return investmentAdvice;
  }

  public void setInvestmentAdvice(InvestmentAdviceEnum investmentAdvice) {
    this.investmentAdvice = investmentAdvice;
  }

  public DistributionStrategy portfolioManagement(PortfolioManagementEnum portfolioManagement) {
    this.portfolioManagement = portfolioManagement;
    return this;
  }

  /**
   * Retail or Professional or Both or Neither
   * @return portfolioManagement
  **/
  @ApiModelProperty(value = "Retail or Professional or Both or Neither")


  public PortfolioManagementEnum getPortfolioManagement() {
    return portfolioManagement;
  }

  public void setPortfolioManagement(PortfolioManagementEnum portfolioManagement) {
    this.portfolioManagement = portfolioManagement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionStrategy distributionStrategy = (DistributionStrategy) o;
    return Objects.equals(this.executionOnly, distributionStrategy.executionOnly) &&
        Objects.equals(this.executionWithAppropriatenessTestOrNonAdvisedServices, distributionStrategy.executionWithAppropriatenessTestOrNonAdvisedServices) &&
        Objects.equals(this.investmentAdvice, distributionStrategy.investmentAdvice) &&
        Objects.equals(this.portfolioManagement, distributionStrategy.portfolioManagement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionOnly, executionWithAppropriatenessTestOrNonAdvisedServices, investmentAdvice, portfolioManagement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionStrategy {\n");
    
    sb.append("    executionOnly: ").append(toIndentedString(executionOnly)).append("\n");
    sb.append("    executionWithAppropriatenessTestOrNonAdvisedServices: ").append(toIndentedString(executionWithAppropriatenessTestOrNonAdvisedServices)).append("\n");
    sb.append("    investmentAdvice: ").append(toIndentedString(investmentAdvice)).append("\n");
    sb.append("    portfolioManagement: ").append(toIndentedString(portfolioManagement)).append("\n");
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

