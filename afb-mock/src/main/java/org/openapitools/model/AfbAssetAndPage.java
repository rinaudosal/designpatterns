package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AfbAsset;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {AfbAsset} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {AfbAsset} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbAssetAndPage   {
  @JsonProperty("afbAssets")
  @Valid
  private List<AfbAsset> afbAssets = null;

  @JsonProperty("page")
  private Page page = null;

  public AfbAssetAndPage afbAssets(List<AfbAsset> afbAssets) {
    this.afbAssets = afbAssets;
    return this;
  }

  public AfbAssetAndPage addAfbAssetsItem(AfbAsset afbAssetsItem) {
    if (this.afbAssets == null) {
      this.afbAssets = new ArrayList<>();
    }
    this.afbAssets.add(afbAssetsItem);
    return this;
  }

  /**
   * The array of {AfbAsset}
   * @return afbAssets
  **/
  @ApiModelProperty(value = "The array of {AfbAsset}")

  @Valid

  public List<AfbAsset> getAfbAssets() {
    return afbAssets;
  }

  public void setAfbAssets(List<AfbAsset> afbAssets) {
    this.afbAssets = afbAssets;
  }

  public AfbAssetAndPage page(Page page) {
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
    AfbAssetAndPage afbAssetAndPage = (AfbAssetAndPage) o;
    return Objects.equals(this.afbAssets, afbAssetAndPage.afbAssets) &&
        Objects.equals(this.page, afbAssetAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbAssets, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbAssetAndPage {\n");
    
    sb.append("    afbAssets: ").append(toIndentedString(afbAssets)).append("\n");
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

