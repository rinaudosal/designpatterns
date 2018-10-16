package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicCorporateAction;
import org.openapitools.model.CurrencyChangeActionData;
import org.openapitools.model.DividendActionData;
import org.openapitools.model.FundMergeActionData;
import org.openapitools.model.SplitActionData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorporateAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CorporateAction   {
  @JsonProperty("basicCorporateAction")
  private BasicCorporateAction basicCorporateAction = null;

  @JsonProperty("currencyChangeActionData")
  private CurrencyChangeActionData currencyChangeActionData = null;

  @JsonProperty("dividendActionData")
  private DividendActionData dividendActionData = null;

  @JsonProperty("fundMergeActionData")
  private FundMergeActionData fundMergeActionData = null;

  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("splitActionData")
  private SplitActionData splitActionData = null;

  public CorporateAction basicCorporateAction(BasicCorporateAction basicCorporateAction) {
    this.basicCorporateAction = basicCorporateAction;
    return this;
  }

  /**
   * Get basicCorporateAction
   * @return basicCorporateAction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicCorporateAction getBasicCorporateAction() {
    return basicCorporateAction;
  }

  public void setBasicCorporateAction(BasicCorporateAction basicCorporateAction) {
    this.basicCorporateAction = basicCorporateAction;
  }

  public CorporateAction currencyChangeActionData(CurrencyChangeActionData currencyChangeActionData) {
    this.currencyChangeActionData = currencyChangeActionData;
    return this;
  }

  /**
   * Get currencyChangeActionData
   * @return currencyChangeActionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CurrencyChangeActionData getCurrencyChangeActionData() {
    return currencyChangeActionData;
  }

  public void setCurrencyChangeActionData(CurrencyChangeActionData currencyChangeActionData) {
    this.currencyChangeActionData = currencyChangeActionData;
  }

  public CorporateAction dividendActionData(DividendActionData dividendActionData) {
    this.dividendActionData = dividendActionData;
    return this;
  }

  /**
   * Get dividendActionData
   * @return dividendActionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DividendActionData getDividendActionData() {
    return dividendActionData;
  }

  public void setDividendActionData(DividendActionData dividendActionData) {
    this.dividendActionData = dividendActionData;
  }

  public CorporateAction fundMergeActionData(FundMergeActionData fundMergeActionData) {
    this.fundMergeActionData = fundMergeActionData;
    return this;
  }

  /**
   * Get fundMergeActionData
   * @return fundMergeActionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FundMergeActionData getFundMergeActionData() {
    return fundMergeActionData;
  }

  public void setFundMergeActionData(FundMergeActionData fundMergeActionData) {
    this.fundMergeActionData = fundMergeActionData;
  }

  public CorporateAction fundName(String fundName) {
    this.fundName = fundName;
    return this;
  }

  /**
   * The name of the fund.
   * @return fundName
  **/
  @ApiModelProperty(value = "The name of the fund.")


  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public CorporateAction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CorporateAction splitActionData(SplitActionData splitActionData) {
    this.splitActionData = splitActionData;
    return this;
  }

  /**
   * Get splitActionData
   * @return splitActionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SplitActionData getSplitActionData() {
    return splitActionData;
  }

  public void setSplitActionData(SplitActionData splitActionData) {
    this.splitActionData = splitActionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateAction corporateAction = (CorporateAction) o;
    return Objects.equals(this.basicCorporateAction, corporateAction.basicCorporateAction) &&
        Objects.equals(this.currencyChangeActionData, corporateAction.currencyChangeActionData) &&
        Objects.equals(this.dividendActionData, corporateAction.dividendActionData) &&
        Objects.equals(this.fundMergeActionData, corporateAction.fundMergeActionData) &&
        Objects.equals(this.fundName, corporateAction.fundName) &&
        Objects.equals(this.id, corporateAction.id) &&
        Objects.equals(this.splitActionData, corporateAction.splitActionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicCorporateAction, currencyChangeActionData, dividendActionData, fundMergeActionData, fundName, id, splitActionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateAction {\n");
    
    sb.append("    basicCorporateAction: ").append(toIndentedString(basicCorporateAction)).append("\n");
    sb.append("    currencyChangeActionData: ").append(toIndentedString(currencyChangeActionData)).append("\n");
    sb.append("    dividendActionData: ").append(toIndentedString(dividendActionData)).append("\n");
    sb.append("    fundMergeActionData: ").append(toIndentedString(fundMergeActionData)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    splitActionData: ").append(toIndentedString(splitActionData)).append("\n");
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

