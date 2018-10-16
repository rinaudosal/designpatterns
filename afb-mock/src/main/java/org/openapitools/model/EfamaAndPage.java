package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Efama;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Efama} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Efama} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EfamaAndPage   {
  @JsonProperty("efama")
  @Valid
  private List<Efama> efama = null;

  @JsonProperty("page")
  private Page page = null;

  public EfamaAndPage efama(List<Efama> efama) {
    this.efama = efama;
    return this;
  }

  public EfamaAndPage addEfamaItem(Efama efamaItem) {
    if (this.efama == null) {
      this.efama = new ArrayList<>();
    }
    this.efama.add(efamaItem);
    return this;
  }

  /**
   * The array of {Efama}
   * @return efama
  **/
  @ApiModelProperty(value = "The array of {Efama}")

  @Valid

  public List<Efama> getEfama() {
    return efama;
  }

  public void setEfama(List<Efama> efama) {
    this.efama = efama;
  }

  public EfamaAndPage page(Page page) {
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
    EfamaAndPage efamaAndPage = (EfamaAndPage) o;
    return Objects.equals(this.efama, efamaAndPage.efama) &&
        Objects.equals(this.page, efamaAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(efama, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EfamaAndPage {\n");
    
    sb.append("    efama: ").append(toIndentedString(efama)).append("\n");
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

