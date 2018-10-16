package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CashTransfer;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransferAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransferAndPage   {
  @JsonProperty("cashTransfers")
  @Valid
  private List<CashTransfer> cashTransfers = null;

  @JsonProperty("page")
  private Page page = null;

  public CashTransferAndPage cashTransfers(List<CashTransfer> cashTransfers) {
    this.cashTransfers = cashTransfers;
    return this;
  }

  public CashTransferAndPage addCashTransfersItem(CashTransfer cashTransfersItem) {
    if (this.cashTransfers == null) {
      this.cashTransfers = new ArrayList<>();
    }
    this.cashTransfers.add(cashTransfersItem);
    return this;
  }

  /**
   * Get cashTransfers
   * @return cashTransfers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CashTransfer> getCashTransfers() {
    return cashTransfers;
  }

  public void setCashTransfers(List<CashTransfer> cashTransfers) {
    this.cashTransfers = cashTransfers;
  }

  public CashTransferAndPage page(Page page) {
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
    CashTransferAndPage cashTransferAndPage = (CashTransferAndPage) o;
    return Objects.equals(this.cashTransfers, cashTransferAndPage.cashTransfers) &&
        Objects.equals(this.page, cashTransferAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashTransfers, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransferAndPage {\n");
    
    sb.append("    cashTransfers: ").append(toIndentedString(cashTransfers)).append("\n");
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

