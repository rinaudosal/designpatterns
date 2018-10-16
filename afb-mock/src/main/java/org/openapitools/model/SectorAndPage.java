package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.Sector;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Sector} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Sector} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SectorAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("sectors")
  @Valid
  private List<Sector> sectors = null;

  public SectorAndPage page(Page page) {
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

  public SectorAndPage sectors(List<Sector> sectors) {
    this.sectors = sectors;
    return this;
  }

  public SectorAndPage addSectorsItem(Sector sectorsItem) {
    if (this.sectors == null) {
      this.sectors = new ArrayList<>();
    }
    this.sectors.add(sectorsItem);
    return this;
  }

  /**
   * The array of {Sector}
   * @return sectors
  **/
  @ApiModelProperty(value = "The array of {Sector}")

  @Valid

  public List<Sector> getSectors() {
    return sectors;
  }

  public void setSectors(List<Sector> sectors) {
    this.sectors = sectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectorAndPage sectorAndPage = (SectorAndPage) o;
    return Objects.equals(this.page, sectorAndPage.page) &&
        Objects.equals(this.sectors, sectorAndPage.sectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, sectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectorAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
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

