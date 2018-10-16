package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundFamilyPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FundFamilyPrice   {
  @JsonProperty("highest12Month")
  @Valid
  private List<Price> highest12Month = null;

  @JsonProperty("id")
  private Long id = null;

  /**
   * this is a data fund provider
   */
  public enum InformationProviderEnum {
    ALLFUNDS("ALLFUNDS"),
    
    MORNINGSTAR("MORNINGSTAR");

    private String value;

    InformationProviderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InformationProviderEnum fromValue(String text) {
      for (InformationProviderEnum b : InformationProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("informationProvider")
  private InformationProviderEnum informationProvider = null;

  @JsonProperty("lastMonth")
  @Valid
  private List<Price> lastMonth = null;

  @JsonProperty("lowest12Month")
  @Valid
  private List<Price> lowest12Month = null;

  @JsonProperty("mostRecent")
  @Valid
  private List<Price> mostRecent = null;

  @JsonProperty("name")
  private String name = null;

  public FundFamilyPrice highest12Month(List<Price> highest12Month) {
    this.highest12Month = highest12Month;
    return this;
  }

  public FundFamilyPrice addHighest12MonthItem(Price highest12MonthItem) {
    if (this.highest12Month == null) {
      this.highest12Month = new ArrayList<>();
    }
    this.highest12Month.add(highest12MonthItem);
    return this;
  }

  /**
   * Get highest12Month
   * @return highest12Month
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getHighest12Month() {
    return highest12Month;
  }

  public void setHighest12Month(List<Price> highest12Month) {
    this.highest12Month = highest12Month;
  }

  public FundFamilyPrice id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Internal identification in Allfunds Bank. This id is the unique key.
   * @return id
  **/
  @ApiModelProperty(value = "Internal identification in Allfunds Bank. This id is the unique key.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FundFamilyPrice informationProvider(InformationProviderEnum informationProvider) {
    this.informationProvider = informationProvider;
    return this;
  }

  /**
   * this is a data fund provider
   * @return informationProvider
  **/
  @ApiModelProperty(value = "this is a data fund provider")


  public InformationProviderEnum getInformationProvider() {
    return informationProvider;
  }

  public void setInformationProvider(InformationProviderEnum informationProvider) {
    this.informationProvider = informationProvider;
  }

  public FundFamilyPrice lastMonth(List<Price> lastMonth) {
    this.lastMonth = lastMonth;
    return this;
  }

  public FundFamilyPrice addLastMonthItem(Price lastMonthItem) {
    if (this.lastMonth == null) {
      this.lastMonth = new ArrayList<>();
    }
    this.lastMonth.add(lastMonthItem);
    return this;
  }

  /**
   * Get lastMonth
   * @return lastMonth
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getLastMonth() {
    return lastMonth;
  }

  public void setLastMonth(List<Price> lastMonth) {
    this.lastMonth = lastMonth;
  }

  public FundFamilyPrice lowest12Month(List<Price> lowest12Month) {
    this.lowest12Month = lowest12Month;
    return this;
  }

  public FundFamilyPrice addLowest12MonthItem(Price lowest12MonthItem) {
    if (this.lowest12Month == null) {
      this.lowest12Month = new ArrayList<>();
    }
    this.lowest12Month.add(lowest12MonthItem);
    return this;
  }

  /**
   * Get lowest12Month
   * @return lowest12Month
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getLowest12Month() {
    return lowest12Month;
  }

  public void setLowest12Month(List<Price> lowest12Month) {
    this.lowest12Month = lowest12Month;
  }

  public FundFamilyPrice mostRecent(List<Price> mostRecent) {
    this.mostRecent = mostRecent;
    return this;
  }

  public FundFamilyPrice addMostRecentItem(Price mostRecentItem) {
    if (this.mostRecent == null) {
      this.mostRecent = new ArrayList<>();
    }
    this.mostRecent.add(mostRecentItem);
    return this;
  }

  /**
   * Get mostRecent
   * @return mostRecent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getMostRecent() {
    return mostRecent;
  }

  public void setMostRecent(List<Price> mostRecent) {
    this.mostRecent = mostRecent;
  }

  public FundFamilyPrice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the fund. This name would be common to all share classes of the portfolio.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the fund. This name would be common to all share classes of the portfolio.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundFamilyPrice fundFamilyPrice = (FundFamilyPrice) o;
    return Objects.equals(this.highest12Month, fundFamilyPrice.highest12Month) &&
        Objects.equals(this.id, fundFamilyPrice.id) &&
        Objects.equals(this.informationProvider, fundFamilyPrice.informationProvider) &&
        Objects.equals(this.lastMonth, fundFamilyPrice.lastMonth) &&
        Objects.equals(this.lowest12Month, fundFamilyPrice.lowest12Month) &&
        Objects.equals(this.mostRecent, fundFamilyPrice.mostRecent) &&
        Objects.equals(this.name, fundFamilyPrice.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highest12Month, id, informationProvider, lastMonth, lowest12Month, mostRecent, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundFamilyPrice {\n");
    
    sb.append("    highest12Month: ").append(toIndentedString(highest12Month)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    informationProvider: ").append(toIndentedString(informationProvider)).append("\n");
    sb.append("    lastMonth: ").append(toIndentedString(lastMonth)).append("\n");
    sb.append("    lowest12Month: ").append(toIndentedString(lowest12Month)).append("\n");
    sb.append("    mostRecent: ").append(toIndentedString(mostRecent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

