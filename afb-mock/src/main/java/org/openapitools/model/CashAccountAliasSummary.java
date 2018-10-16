package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicCashAccountAlias;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashAccountAliasSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashAccountAliasSummary   {
  @JsonProperty("basicCashAccountAlias")
  private BasicCashAccountAlias basicCashAccountAlias = null;

  @JsonProperty("id")
  private String id = null;

  public CashAccountAliasSummary basicCashAccountAlias(BasicCashAccountAlias basicCashAccountAlias) {
    this.basicCashAccountAlias = basicCashAccountAlias;
    return this;
  }

  /**
   * Get basicCashAccountAlias
   * @return basicCashAccountAlias
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicCashAccountAlias getBasicCashAccountAlias() {
    return basicCashAccountAlias;
  }

  public void setBasicCashAccountAlias(BasicCashAccountAlias basicCashAccountAlias) {
    this.basicCashAccountAlias = basicCashAccountAlias;
  }

  public CashAccountAliasSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {CashAccountAlias}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {CashAccountAlias}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashAccountAliasSummary cashAccountAliasSummary = (CashAccountAliasSummary) o;
    return Objects.equals(this.basicCashAccountAlias, cashAccountAliasSummary.basicCashAccountAlias) &&
        Objects.equals(this.id, cashAccountAliasSummary.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicCashAccountAlias, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccountAliasSummary {\n");
    
    sb.append("    basicCashAccountAlias: ").append(toIndentedString(basicCashAccountAlias)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

