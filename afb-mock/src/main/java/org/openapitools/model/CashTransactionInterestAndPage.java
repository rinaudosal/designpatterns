package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CashTransactionInterest;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransactionInterestAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransactionInterestAndPage   {
  @JsonProperty("interests")
  @Valid
  private List<CashTransactionInterest> interests = null;

  @JsonProperty("page")
  private Page page = null;

  public CashTransactionInterestAndPage interests(List<CashTransactionInterest> interests) {
    this.interests = interests;
    return this;
  }

  public CashTransactionInterestAndPage addInterestsItem(CashTransactionInterest interestsItem) {
    if (this.interests == null) {
      this.interests = new ArrayList<>();
    }
    this.interests.add(interestsItem);
    return this;
  }

  /**
   * Get interests
   * @return interests
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CashTransactionInterest> getInterests() {
    return interests;
  }

  public void setInterests(List<CashTransactionInterest> interests) {
    this.interests = interests;
  }

  public CashTransactionInterestAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransactionInterestAndPage cashTransactionInterestAndPage = (CashTransactionInterestAndPage) o;
    return Objects.equals(this.interests, cashTransactionInterestAndPage.interests) &&
        Objects.equals(this.page, cashTransactionInterestAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interests, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionInterestAndPage {\n");
    
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

