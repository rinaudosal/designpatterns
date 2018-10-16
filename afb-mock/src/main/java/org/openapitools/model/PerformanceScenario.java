package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PerformanceScenario
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PerformanceScenario   {
  @JsonProperty("portfolioMeanObservedReturnsM1")
  private Double portfolioMeanObservedReturnsM1 = null;

  @JsonProperty("portfolioNumberOfObservedReturnM0")
  private Double portfolioNumberOfObservedReturnM0 = null;

  @JsonProperty("portfolioObservedExcessKurtosis")
  private Double portfolioObservedExcessKurtosis = null;

  @JsonProperty("portfolioObservedSigma")
  private Double portfolioObservedSigma = null;

  @JsonProperty("portfolioObservedSkewness")
  private Double portfolioObservedSkewness = null;

  @JsonProperty("portfolioObservedStressedVolatility")
  private Double portfolioObservedStressedVolatility = null;

  @JsonProperty("portfolioReturnFavorableScenario1Year")
  private Double portfolioReturnFavorableScenario1Year = null;

  @JsonProperty("portfolioReturnFavorableScenarioHalfRhp")
  private Double portfolioReturnFavorableScenarioHalfRhp = null;

  @JsonProperty("portfolioReturnFavorableScenarioRhp")
  private Double portfolioReturnFavorableScenarioRhp = null;

  @JsonProperty("portfolioReturnModerateScenario1Year")
  private Double portfolioReturnModerateScenario1Year = null;

  @JsonProperty("portfolioReturnModerateScenarioHalfRhp")
  private Double portfolioReturnModerateScenarioHalfRhp = null;

  @JsonProperty("portfolioReturnModerateScenarioRhp")
  private Double portfolioReturnModerateScenarioRhp = null;

  @JsonProperty("portfolioReturnStressScenario1Year")
  private Double portfolioReturnStressScenario1Year = null;

  @JsonProperty("portfolioReturnStressScenarioHalfRhp")
  private Double portfolioReturnStressScenarioHalfRhp = null;

  @JsonProperty("portfolioReturnStressScenarioRhp")
  private Double portfolioReturnStressScenarioRhp = null;

  @JsonProperty("portfolioReturnUnfavorableScenario1Year")
  private Double portfolioReturnUnfavorableScenario1Year = null;

  @JsonProperty("portfolioReturnUnfavorableScenarioHalfRhp")
  private Double portfolioReturnUnfavorableScenarioHalfRhp = null;

  @JsonProperty("portfolioReturnUnfavorableScenarioRhp")
  private Double portfolioReturnUnfavorableScenarioRhp = null;

  public PerformanceScenario portfolioMeanObservedReturnsM1(Double portfolioMeanObservedReturnsM1) {
    this.portfolioMeanObservedReturnsM1 = portfolioMeanObservedReturnsM1;
    return this;
  }

  /**
   * See PRIIPS regulation
   * @return portfolioMeanObservedReturnsM1
  **/
  @ApiModelProperty(value = "See PRIIPS regulation")


  public Double getPortfolioMeanObservedReturnsM1() {
    return portfolioMeanObservedReturnsM1;
  }

  public void setPortfolioMeanObservedReturnsM1(Double portfolioMeanObservedReturnsM1) {
    this.portfolioMeanObservedReturnsM1 = portfolioMeanObservedReturnsM1;
  }

  public PerformanceScenario portfolioNumberOfObservedReturnM0(Double portfolioNumberOfObservedReturnM0) {
    this.portfolioNumberOfObservedReturnM0 = portfolioNumberOfObservedReturnM0;
    return this;
  }

  /**
   * See PRIIPS regulation
   * @return portfolioNumberOfObservedReturnM0
  **/
  @ApiModelProperty(value = "See PRIIPS regulation")


  public Double getPortfolioNumberOfObservedReturnM0() {
    return portfolioNumberOfObservedReturnM0;
  }

  public void setPortfolioNumberOfObservedReturnM0(Double portfolioNumberOfObservedReturnM0) {
    this.portfolioNumberOfObservedReturnM0 = portfolioNumberOfObservedReturnM0;
  }

  public PerformanceScenario portfolioObservedExcessKurtosis(Double portfolioObservedExcessKurtosis) {
    this.portfolioObservedExcessKurtosis = portfolioObservedExcessKurtosis;
    return this;
  }

  /**
   * See PRIIPS regulation
   * @return portfolioObservedExcessKurtosis
  **/
  @ApiModelProperty(value = "See PRIIPS regulation")


  public Double getPortfolioObservedExcessKurtosis() {
    return portfolioObservedExcessKurtosis;
  }

  public void setPortfolioObservedExcessKurtosis(Double portfolioObservedExcessKurtosis) {
    this.portfolioObservedExcessKurtosis = portfolioObservedExcessKurtosis;
  }

  public PerformanceScenario portfolioObservedSigma(Double portfolioObservedSigma) {
    this.portfolioObservedSigma = portfolioObservedSigma;
    return this;
  }

  /**
   * See PRIIPS regulation
   * @return portfolioObservedSigma
  **/
  @ApiModelProperty(value = "See PRIIPS regulation")


  public Double getPortfolioObservedSigma() {
    return portfolioObservedSigma;
  }

  public void setPortfolioObservedSigma(Double portfolioObservedSigma) {
    this.portfolioObservedSigma = portfolioObservedSigma;
  }

  public PerformanceScenario portfolioObservedSkewness(Double portfolioObservedSkewness) {
    this.portfolioObservedSkewness = portfolioObservedSkewness;
    return this;
  }

  /**
   * See PRIIPS regulation
   * @return portfolioObservedSkewness
  **/
  @ApiModelProperty(value = "See PRIIPS regulation")


  public Double getPortfolioObservedSkewness() {
    return portfolioObservedSkewness;
  }

  public void setPortfolioObservedSkewness(Double portfolioObservedSkewness) {
    this.portfolioObservedSkewness = portfolioObservedSkewness;
  }

  public PerformanceScenario portfolioObservedStressedVolatility(Double portfolioObservedStressedVolatility) {
    this.portfolioObservedStressedVolatility = portfolioObservedStressedVolatility;
    return this;
  }

  /**
   * See PRIIPS regulation
   * @return portfolioObservedStressedVolatility
  **/
  @ApiModelProperty(value = "See PRIIPS regulation")


  public Double getPortfolioObservedStressedVolatility() {
    return portfolioObservedStressedVolatility;
  }

  public void setPortfolioObservedStressedVolatility(Double portfolioObservedStressedVolatility) {
    this.portfolioObservedStressedVolatility = portfolioObservedStressedVolatility;
  }

  public PerformanceScenario portfolioReturnFavorableScenario1Year(Double portfolioReturnFavorableScenario1Year) {
    this.portfolioReturnFavorableScenario1Year = portfolioReturnFavorableScenario1Year;
    return this;
  }

  /**
   * Annual return  of the portfolio, fund, share class corresponding to the favorable scenario, after 1 year
   * @return portfolioReturnFavorableScenario1Year
  **/
  @ApiModelProperty(value = "Annual return  of the portfolio, fund, share class corresponding to the favorable scenario, after 1 year")


  public Double getPortfolioReturnFavorableScenario1Year() {
    return portfolioReturnFavorableScenario1Year;
  }

  public void setPortfolioReturnFavorableScenario1Year(Double portfolioReturnFavorableScenario1Year) {
    this.portfolioReturnFavorableScenario1Year = portfolioReturnFavorableScenario1Year;
  }

  public PerformanceScenario portfolioReturnFavorableScenarioHalfRhp(Double portfolioReturnFavorableScenarioHalfRhp) {
    this.portfolioReturnFavorableScenarioHalfRhp = portfolioReturnFavorableScenarioHalfRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the favorable scenario, after half of the RHP
   * @return portfolioReturnFavorableScenarioHalfRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the favorable scenario, after half of the RHP")


  public Double getPortfolioReturnFavorableScenarioHalfRhp() {
    return portfolioReturnFavorableScenarioHalfRhp;
  }

  public void setPortfolioReturnFavorableScenarioHalfRhp(Double portfolioReturnFavorableScenarioHalfRhp) {
    this.portfolioReturnFavorableScenarioHalfRhp = portfolioReturnFavorableScenarioHalfRhp;
  }

  public PerformanceScenario portfolioReturnFavorableScenarioRhp(Double portfolioReturnFavorableScenarioRhp) {
    this.portfolioReturnFavorableScenarioRhp = portfolioReturnFavorableScenarioRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the favorable scenario, at the RHP
   * @return portfolioReturnFavorableScenarioRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the favorable scenario, at the RHP")


  public Double getPortfolioReturnFavorableScenarioRhp() {
    return portfolioReturnFavorableScenarioRhp;
  }

  public void setPortfolioReturnFavorableScenarioRhp(Double portfolioReturnFavorableScenarioRhp) {
    this.portfolioReturnFavorableScenarioRhp = portfolioReturnFavorableScenarioRhp;
  }

  public PerformanceScenario portfolioReturnModerateScenario1Year(Double portfolioReturnModerateScenario1Year) {
    this.portfolioReturnModerateScenario1Year = portfolioReturnModerateScenario1Year;
    return this;
  }

  /**
   * Return of the portfolio, fund, share class corresponding to the moderate scenario, after 1 year
   * @return portfolioReturnModerateScenario1Year
  **/
  @ApiModelProperty(value = "Return of the portfolio, fund, share class corresponding to the moderate scenario, after 1 year")


  public Double getPortfolioReturnModerateScenario1Year() {
    return portfolioReturnModerateScenario1Year;
  }

  public void setPortfolioReturnModerateScenario1Year(Double portfolioReturnModerateScenario1Year) {
    this.portfolioReturnModerateScenario1Year = portfolioReturnModerateScenario1Year;
  }

  public PerformanceScenario portfolioReturnModerateScenarioHalfRhp(Double portfolioReturnModerateScenarioHalfRhp) {
    this.portfolioReturnModerateScenarioHalfRhp = portfolioReturnModerateScenarioHalfRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the moderate scenario, after half of the RHP
   * @return portfolioReturnModerateScenarioHalfRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the moderate scenario, after half of the RHP")


  public Double getPortfolioReturnModerateScenarioHalfRhp() {
    return portfolioReturnModerateScenarioHalfRhp;
  }

  public void setPortfolioReturnModerateScenarioHalfRhp(Double portfolioReturnModerateScenarioHalfRhp) {
    this.portfolioReturnModerateScenarioHalfRhp = portfolioReturnModerateScenarioHalfRhp;
  }

  public PerformanceScenario portfolioReturnModerateScenarioRhp(Double portfolioReturnModerateScenarioRhp) {
    this.portfolioReturnModerateScenarioRhp = portfolioReturnModerateScenarioRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the moderate scenario, at the RHP
   * @return portfolioReturnModerateScenarioRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the moderate scenario, at the RHP")


  public Double getPortfolioReturnModerateScenarioRhp() {
    return portfolioReturnModerateScenarioRhp;
  }

  public void setPortfolioReturnModerateScenarioRhp(Double portfolioReturnModerateScenarioRhp) {
    this.portfolioReturnModerateScenarioRhp = portfolioReturnModerateScenarioRhp;
  }

  public PerformanceScenario portfolioReturnStressScenario1Year(Double portfolioReturnStressScenario1Year) {
    this.portfolioReturnStressScenario1Year = portfolioReturnStressScenario1Year;
    return this;
  }

  /**
   * Annual return  of the portfolio, fund, share class corresponding to the stress scenario, after 1 year
   * @return portfolioReturnStressScenario1Year
  **/
  @ApiModelProperty(value = "Annual return  of the portfolio, fund, share class corresponding to the stress scenario, after 1 year")


  public Double getPortfolioReturnStressScenario1Year() {
    return portfolioReturnStressScenario1Year;
  }

  public void setPortfolioReturnStressScenario1Year(Double portfolioReturnStressScenario1Year) {
    this.portfolioReturnStressScenario1Year = portfolioReturnStressScenario1Year;
  }

  public PerformanceScenario portfolioReturnStressScenarioHalfRhp(Double portfolioReturnStressScenarioHalfRhp) {
    this.portfolioReturnStressScenarioHalfRhp = portfolioReturnStressScenarioHalfRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the stress scenario, after half of the RHP
   * @return portfolioReturnStressScenarioHalfRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the stress scenario, after half of the RHP")


  public Double getPortfolioReturnStressScenarioHalfRhp() {
    return portfolioReturnStressScenarioHalfRhp;
  }

  public void setPortfolioReturnStressScenarioHalfRhp(Double portfolioReturnStressScenarioHalfRhp) {
    this.portfolioReturnStressScenarioHalfRhp = portfolioReturnStressScenarioHalfRhp;
  }

  public PerformanceScenario portfolioReturnStressScenarioRhp(Double portfolioReturnStressScenarioRhp) {
    this.portfolioReturnStressScenarioRhp = portfolioReturnStressScenarioRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the stress scenario, at the RHP
   * @return portfolioReturnStressScenarioRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the stress scenario, at the RHP")


  public Double getPortfolioReturnStressScenarioRhp() {
    return portfolioReturnStressScenarioRhp;
  }

  public void setPortfolioReturnStressScenarioRhp(Double portfolioReturnStressScenarioRhp) {
    this.portfolioReturnStressScenarioRhp = portfolioReturnStressScenarioRhp;
  }

  public PerformanceScenario portfolioReturnUnfavorableScenario1Year(Double portfolioReturnUnfavorableScenario1Year) {
    this.portfolioReturnUnfavorableScenario1Year = portfolioReturnUnfavorableScenario1Year;
    return this;
  }

  /**
   * Annual return  of the portfolio, fund, share class corresponding to the unfavorable scenario, after 1 year
   * @return portfolioReturnUnfavorableScenario1Year
  **/
  @ApiModelProperty(value = "Annual return  of the portfolio, fund, share class corresponding to the unfavorable scenario, after 1 year")


  public Double getPortfolioReturnUnfavorableScenario1Year() {
    return portfolioReturnUnfavorableScenario1Year;
  }

  public void setPortfolioReturnUnfavorableScenario1Year(Double portfolioReturnUnfavorableScenario1Year) {
    this.portfolioReturnUnfavorableScenario1Year = portfolioReturnUnfavorableScenario1Year;
  }

  public PerformanceScenario portfolioReturnUnfavorableScenarioHalfRhp(Double portfolioReturnUnfavorableScenarioHalfRhp) {
    this.portfolioReturnUnfavorableScenarioHalfRhp = portfolioReturnUnfavorableScenarioHalfRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the unfavorable scenario, after half of the RHP
   * @return portfolioReturnUnfavorableScenarioHalfRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the unfavorable scenario, after half of the RHP")


  public Double getPortfolioReturnUnfavorableScenarioHalfRhp() {
    return portfolioReturnUnfavorableScenarioHalfRhp;
  }

  public void setPortfolioReturnUnfavorableScenarioHalfRhp(Double portfolioReturnUnfavorableScenarioHalfRhp) {
    this.portfolioReturnUnfavorableScenarioHalfRhp = portfolioReturnUnfavorableScenarioHalfRhp;
  }

  public PerformanceScenario portfolioReturnUnfavorableScenarioRhp(Double portfolioReturnUnfavorableScenarioRhp) {
    this.portfolioReturnUnfavorableScenarioRhp = portfolioReturnUnfavorableScenarioRhp;
    return this;
  }

  /**
   * Average annual return of the portfolio, fund, share class corresponding to the unfavorable scenario, at the RHP
   * @return portfolioReturnUnfavorableScenarioRhp
  **/
  @ApiModelProperty(value = "Average annual return of the portfolio, fund, share class corresponding to the unfavorable scenario, at the RHP")


  public Double getPortfolioReturnUnfavorableScenarioRhp() {
    return portfolioReturnUnfavorableScenarioRhp;
  }

  public void setPortfolioReturnUnfavorableScenarioRhp(Double portfolioReturnUnfavorableScenarioRhp) {
    this.portfolioReturnUnfavorableScenarioRhp = portfolioReturnUnfavorableScenarioRhp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceScenario performanceScenario = (PerformanceScenario) o;
    return Objects.equals(this.portfolioMeanObservedReturnsM1, performanceScenario.portfolioMeanObservedReturnsM1) &&
        Objects.equals(this.portfolioNumberOfObservedReturnM0, performanceScenario.portfolioNumberOfObservedReturnM0) &&
        Objects.equals(this.portfolioObservedExcessKurtosis, performanceScenario.portfolioObservedExcessKurtosis) &&
        Objects.equals(this.portfolioObservedSigma, performanceScenario.portfolioObservedSigma) &&
        Objects.equals(this.portfolioObservedSkewness, performanceScenario.portfolioObservedSkewness) &&
        Objects.equals(this.portfolioObservedStressedVolatility, performanceScenario.portfolioObservedStressedVolatility) &&
        Objects.equals(this.portfolioReturnFavorableScenario1Year, performanceScenario.portfolioReturnFavorableScenario1Year) &&
        Objects.equals(this.portfolioReturnFavorableScenarioHalfRhp, performanceScenario.portfolioReturnFavorableScenarioHalfRhp) &&
        Objects.equals(this.portfolioReturnFavorableScenarioRhp, performanceScenario.portfolioReturnFavorableScenarioRhp) &&
        Objects.equals(this.portfolioReturnModerateScenario1Year, performanceScenario.portfolioReturnModerateScenario1Year) &&
        Objects.equals(this.portfolioReturnModerateScenarioHalfRhp, performanceScenario.portfolioReturnModerateScenarioHalfRhp) &&
        Objects.equals(this.portfolioReturnModerateScenarioRhp, performanceScenario.portfolioReturnModerateScenarioRhp) &&
        Objects.equals(this.portfolioReturnStressScenario1Year, performanceScenario.portfolioReturnStressScenario1Year) &&
        Objects.equals(this.portfolioReturnStressScenarioHalfRhp, performanceScenario.portfolioReturnStressScenarioHalfRhp) &&
        Objects.equals(this.portfolioReturnStressScenarioRhp, performanceScenario.portfolioReturnStressScenarioRhp) &&
        Objects.equals(this.portfolioReturnUnfavorableScenario1Year, performanceScenario.portfolioReturnUnfavorableScenario1Year) &&
        Objects.equals(this.portfolioReturnUnfavorableScenarioHalfRhp, performanceScenario.portfolioReturnUnfavorableScenarioHalfRhp) &&
        Objects.equals(this.portfolioReturnUnfavorableScenarioRhp, performanceScenario.portfolioReturnUnfavorableScenarioRhp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioMeanObservedReturnsM1, portfolioNumberOfObservedReturnM0, portfolioObservedExcessKurtosis, portfolioObservedSigma, portfolioObservedSkewness, portfolioObservedStressedVolatility, portfolioReturnFavorableScenario1Year, portfolioReturnFavorableScenarioHalfRhp, portfolioReturnFavorableScenarioRhp, portfolioReturnModerateScenario1Year, portfolioReturnModerateScenarioHalfRhp, portfolioReturnModerateScenarioRhp, portfolioReturnStressScenario1Year, portfolioReturnStressScenarioHalfRhp, portfolioReturnStressScenarioRhp, portfolioReturnUnfavorableScenario1Year, portfolioReturnUnfavorableScenarioHalfRhp, portfolioReturnUnfavorableScenarioRhp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceScenario {\n");
    
    sb.append("    portfolioMeanObservedReturnsM1: ").append(toIndentedString(portfolioMeanObservedReturnsM1)).append("\n");
    sb.append("    portfolioNumberOfObservedReturnM0: ").append(toIndentedString(portfolioNumberOfObservedReturnM0)).append("\n");
    sb.append("    portfolioObservedExcessKurtosis: ").append(toIndentedString(portfolioObservedExcessKurtosis)).append("\n");
    sb.append("    portfolioObservedSigma: ").append(toIndentedString(portfolioObservedSigma)).append("\n");
    sb.append("    portfolioObservedSkewness: ").append(toIndentedString(portfolioObservedSkewness)).append("\n");
    sb.append("    portfolioObservedStressedVolatility: ").append(toIndentedString(portfolioObservedStressedVolatility)).append("\n");
    sb.append("    portfolioReturnFavorableScenario1Year: ").append(toIndentedString(portfolioReturnFavorableScenario1Year)).append("\n");
    sb.append("    portfolioReturnFavorableScenarioHalfRhp: ").append(toIndentedString(portfolioReturnFavorableScenarioHalfRhp)).append("\n");
    sb.append("    portfolioReturnFavorableScenarioRhp: ").append(toIndentedString(portfolioReturnFavorableScenarioRhp)).append("\n");
    sb.append("    portfolioReturnModerateScenario1Year: ").append(toIndentedString(portfolioReturnModerateScenario1Year)).append("\n");
    sb.append("    portfolioReturnModerateScenarioHalfRhp: ").append(toIndentedString(portfolioReturnModerateScenarioHalfRhp)).append("\n");
    sb.append("    portfolioReturnModerateScenarioRhp: ").append(toIndentedString(portfolioReturnModerateScenarioRhp)).append("\n");
    sb.append("    portfolioReturnStressScenario1Year: ").append(toIndentedString(portfolioReturnStressScenario1Year)).append("\n");
    sb.append("    portfolioReturnStressScenarioHalfRhp: ").append(toIndentedString(portfolioReturnStressScenarioHalfRhp)).append("\n");
    sb.append("    portfolioReturnStressScenarioRhp: ").append(toIndentedString(portfolioReturnStressScenarioRhp)).append("\n");
    sb.append("    portfolioReturnUnfavorableScenario1Year: ").append(toIndentedString(portfolioReturnUnfavorableScenario1Year)).append("\n");
    sb.append("    portfolioReturnUnfavorableScenarioHalfRhp: ").append(toIndentedString(portfolioReturnUnfavorableScenarioHalfRhp)).append("\n");
    sb.append("    portfolioReturnUnfavorableScenarioRhp: ").append(toIndentedString(portfolioReturnUnfavorableScenarioRhp)).append("\n");
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

