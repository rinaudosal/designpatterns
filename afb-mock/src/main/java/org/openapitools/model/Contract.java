package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ContractAccount;
import org.openapitools.model.ItalianRetailMarketContractInformation;
import org.openapitools.model.Shareholder;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps the full information about a contract
 */
@ApiModel(description = "This object keeps the full information about a contract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Contract   {
  @JsonProperty("accounts")
  @Valid
  private List<ContractAccount> accounts = null;

  @JsonProperty("advisor")
  private String advisor = null;

  @JsonProperty("defaultLanguageCode")
  private String defaultLanguageCode = null;

  @JsonProperty("depositaryId")
  private Long depositaryId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("externalReferenceSpanishDealingFundHouse")
  private String externalReferenceSpanishDealingFundHouse = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("inceptionDate")
  private OffsetDateTime inceptionDate = null;

  @JsonProperty("italianRetailMarketContractInformation")
  private ItalianRetailMarketContractInformation italianRetailMarketContractInformation = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("shareholders")
  @Valid
  private List<Shareholder> shareholders = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("testamentary")
  private Boolean testamentary = null;

  @JsonProperty("testamentaryContractExternalReference")
  private String testamentaryContractExternalReference = null;

  @JsonProperty("withholding")
  private Boolean withholding = null;

  public Contract accounts(List<ContractAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Contract addAccountsItem(ContractAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContractAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<ContractAccount> accounts) {
    this.accounts = accounts;
  }

  public Contract advisor(String advisor) {
    this.advisor = advisor;
    return this;
  }

  /**
   * Advisor assigned the contract.
   * @return advisor
  **/
  @ApiModelProperty(value = "Advisor assigned the contract.")


  public String getAdvisor() {
    return advisor;
  }

  public void setAdvisor(String advisor) {
    this.advisor = advisor;
  }

  public Contract defaultLanguageCode(String defaultLanguageCode) {
    this.defaultLanguageCode = defaultLanguageCode;
    return this;
  }

  /**
   * The Contract's language code. Refer to {listLanguages}
   * @return defaultLanguageCode
  **/
  @ApiModelProperty(value = "The Contract's language code. Refer to {listLanguages}")


  public String getDefaultLanguageCode() {
    return defaultLanguageCode;
  }

  public void setDefaultLanguageCode(String defaultLanguageCode) {
    this.defaultLanguageCode = defaultLanguageCode;
  }

  public Contract depositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
    return this;
  }

  /**
   * The Id of the {Depositary}
   * @return depositaryId
  **/
  @ApiModelProperty(value = "The Id of the {Depositary}")


  public Long getDepositaryId() {
    return depositaryId;
  }

  public void setDepositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
  }

  public Contract distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor} associated with this Contract
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor} associated with this Contract")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public Contract externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External Reference assigned to the contract
   * @return externalReference
  **/
  @ApiModelProperty(value = "External Reference assigned to the contract")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public Contract externalReferenceSpanishDealingFundHouse(String externalReferenceSpanishDealingFundHouse) {
    this.externalReferenceSpanishDealingFundHouse = externalReferenceSpanishDealingFundHouse;
    return this;
  }

  /**
   * This is used as contract reference for spanish dealing Fund Houses
   * @return externalReferenceSpanishDealingFundHouse
  **/
  @ApiModelProperty(value = "This is used as contract reference for spanish dealing Fund Houses")


  public String getExternalReferenceSpanishDealingFundHouse() {
    return externalReferenceSpanishDealingFundHouse;
  }

  public void setExternalReferenceSpanishDealingFundHouse(String externalReferenceSpanishDealingFundHouse) {
    this.externalReferenceSpanishDealingFundHouse = externalReferenceSpanishDealingFundHouse;
  }

  public Contract id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Contract Id
   * @return id
  **/
  @ApiModelProperty(value = "Contract Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Contract inceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

  /**
   * Contract inception date
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "Contract inception date")

  @Valid

  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public Contract italianRetailMarketContractInformation(ItalianRetailMarketContractInformation italianRetailMarketContractInformation) {
    this.italianRetailMarketContractInformation = italianRetailMarketContractInformation;
    return this;
  }

  /**
   * Get italianRetailMarketContractInformation
   * @return italianRetailMarketContractInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ItalianRetailMarketContractInformation getItalianRetailMarketContractInformation() {
    return italianRetailMarketContractInformation;
  }

  public void setItalianRetailMarketContractInformation(ItalianRetailMarketContractInformation italianRetailMarketContractInformation) {
    this.italianRetailMarketContractInformation = italianRetailMarketContractInformation;
  }

  public Contract productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Contract shareholders(List<Shareholder> shareholders) {
    this.shareholders = shareholders;
    return this;
  }

  public Contract addShareholdersItem(Shareholder shareholdersItem) {
    if (this.shareholders == null) {
      this.shareholders = new ArrayList<>();
    }
    this.shareholders.add(shareholdersItem);
    return this;
  }

  /**
   * Get shareholders
   * @return shareholders
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Shareholder> getShareholders() {
    return shareholders;
  }

  public void setShareholders(List<Shareholder> shareholders) {
    this.shareholders = shareholders;
  }

  public Contract subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Subdistributor} associated with this Contract
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Subdistributor} associated with this Contract")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }

  public Contract testamentary(Boolean testamentary) {
    this.testamentary = testamentary;
    return this;
  }

  /**
   * Indicates if the contract is created from a testamentary.
   * @return testamentary
  **/
  @ApiModelProperty(value = "Indicates if the contract is created from a testamentary.")


  public Boolean getTestamentary() {
    return testamentary;
  }

  public void setTestamentary(Boolean testamentary) {
    this.testamentary = testamentary;
  }

  public Contract testamentaryContractExternalReference(String testamentaryContractExternalReference) {
    this.testamentaryContractExternalReference = testamentaryContractExternalReference;
    return this;
  }

  /**
   * External reference of the contract associated with the testamentary. Only used if the contract is created from a testamentary.
   * @return testamentaryContractExternalReference
  **/
  @ApiModelProperty(value = "External reference of the contract associated with the testamentary. Only used if the contract is created from a testamentary.")


  public String getTestamentaryContractExternalReference() {
    return testamentaryContractExternalReference;
  }

  public void setTestamentaryContractExternalReference(String testamentaryContractExternalReference) {
    this.testamentaryContractExternalReference = testamentaryContractExternalReference;
  }

  public Contract withholding(Boolean withholding) {
    this.withholding = withholding;
    return this;
  }

  /**
   * Indicates if a withholding will be applied to the contract or not
   * @return withholding
  **/
  @ApiModelProperty(value = "Indicates if a withholding will be applied to the contract or not")


  public Boolean getWithholding() {
    return withholding;
  }

  public void setWithholding(Boolean withholding) {
    this.withholding = withholding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.accounts, contract.accounts) &&
        Objects.equals(this.advisor, contract.advisor) &&
        Objects.equals(this.defaultLanguageCode, contract.defaultLanguageCode) &&
        Objects.equals(this.depositaryId, contract.depositaryId) &&
        Objects.equals(this.distributorId, contract.distributorId) &&
        Objects.equals(this.externalReference, contract.externalReference) &&
        Objects.equals(this.externalReferenceSpanishDealingFundHouse, contract.externalReferenceSpanishDealingFundHouse) &&
        Objects.equals(this.id, contract.id) &&
        Objects.equals(this.inceptionDate, contract.inceptionDate) &&
        Objects.equals(this.italianRetailMarketContractInformation, contract.italianRetailMarketContractInformation) &&
        Objects.equals(this.productId, contract.productId) &&
        Objects.equals(this.shareholders, contract.shareholders) &&
        Objects.equals(this.subdistributorId, contract.subdistributorId) &&
        Objects.equals(this.testamentary, contract.testamentary) &&
        Objects.equals(this.testamentaryContractExternalReference, contract.testamentaryContractExternalReference) &&
        Objects.equals(this.withholding, contract.withholding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, advisor, defaultLanguageCode, depositaryId, distributorId, externalReference, externalReferenceSpanishDealingFundHouse, id, inceptionDate, italianRetailMarketContractInformation, productId, shareholders, subdistributorId, testamentary, testamentaryContractExternalReference, withholding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    advisor: ").append(toIndentedString(advisor)).append("\n");
    sb.append("    defaultLanguageCode: ").append(toIndentedString(defaultLanguageCode)).append("\n");
    sb.append("    depositaryId: ").append(toIndentedString(depositaryId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    externalReferenceSpanishDealingFundHouse: ").append(toIndentedString(externalReferenceSpanishDealingFundHouse)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    italianRetailMarketContractInformation: ").append(toIndentedString(italianRetailMarketContractInformation)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    shareholders: ").append(toIndentedString(shareholders)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    testamentary: ").append(toIndentedString(testamentary)).append("\n");
    sb.append("    testamentaryContractExternalReference: ").append(toIndentedString(testamentaryContractExternalReference)).append("\n");
    sb.append("    withholding: ").append(toIndentedString(withholding)).append("\n");
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

