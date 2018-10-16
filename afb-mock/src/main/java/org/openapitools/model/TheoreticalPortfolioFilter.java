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
 * The &#x60;TheoreticalPortfolioFilter&#x60; allows the {Consumer} to filter the results that match the required characteristics.
 */
@ApiModel(description = "The `TheoreticalPortfolioFilter` allows the {Consumer} to filter the results that match the required characteristics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TheoreticalPortfolioFilter   {
  /**
   * Indicates whether the search will be on {ALL} or {THEORETICAL} or {DEALING}
   */
  public enum PortfolioLevelEnum {
    ALL("ALL"),
    
    THEORETICAL("THEORETICAL"),
    
    DEALING("DEALING");

    private String value;

    PortfolioLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PortfolioLevelEnum fromValue(String text) {
      for (PortfolioLevelEnum b : PortfolioLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("portfolioLevel")
  private PortfolioLevelEnum portfolioLevel = null;

  @JsonProperty("portfolioName")
  private String portfolioName = null;

  public TheoreticalPortfolioFilter portfolioLevel(PortfolioLevelEnum portfolioLevel) {
    this.portfolioLevel = portfolioLevel;
    return this;
  }

  /**
   * Indicates whether the search will be on {ALL} or {THEORETICAL} or {DEALING}
   * @return portfolioLevel
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {ALL} or {THEORETICAL} or {DEALING}")


  public PortfolioLevelEnum getPortfolioLevel() {
    return portfolioLevel;
  }

  public void setPortfolioLevel(PortfolioLevelEnum portfolioLevel) {
    this.portfolioLevel = portfolioLevel;
  }

  public TheoreticalPortfolioFilter portfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
    return this;
  }

  /**
   * name of portfolio.
   * @return portfolioName
  **/
  @ApiModelProperty(value = "name of portfolio.")


  public String getPortfolioName() {
    return portfolioName;
  }

  public void setPortfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheoreticalPortfolioFilter theoreticalPortfolioFilter = (TheoreticalPortfolioFilter) o;
    return Objects.equals(this.portfolioLevel, theoreticalPortfolioFilter.portfolioLevel) &&
        Objects.equals(this.portfolioName, theoreticalPortfolioFilter.portfolioName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioLevel, portfolioName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheoreticalPortfolioFilter {\n");
    
    sb.append("    portfolioLevel: ").append(toIndentedString(portfolioLevel)).append("\n");
    sb.append("    portfolioName: ").append(toIndentedString(portfolioName)).append("\n");
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

