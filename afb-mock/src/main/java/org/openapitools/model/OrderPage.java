package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;OrderPage&#x60; object is returned by the Server in order for the {Consumer} to setup its pagination.
 */
@ApiModel(description = "The `OrderPage` object is returned by the Server in order for the {Consumer} to setup its pagination.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderPage   {
  @JsonProperty("by")
  private String by = null;

  /**
   * Indicates the result set is ordered direction. Either `ASCENDING` or `DESCENDING`
   */
  public enum SortEnum {
    ASCENDING("ASCENDING"),
    
    DESCENDING("DESCENDING");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortEnum fromValue(String text) {
      for (SortEnum b : SortEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("sort")
  private SortEnum sort = null;

  public OrderPage by(String by) {
    this.by = by;
    return this;
  }

  /**
   * Indicates the field by which the result set is ordered
   * @return by
  **/
  @ApiModelProperty(value = "Indicates the field by which the result set is ordered")


  public String getBy() {
    return by;
  }

  public void setBy(String by) {
    this.by = by;
  }

  public OrderPage sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Indicates the result set is ordered direction. Either `ASCENDING` or `DESCENDING`
   * @return sort
  **/
  @ApiModelProperty(value = "Indicates the result set is ordered direction. Either `ASCENDING` or `DESCENDING`")


  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPage orderPage = (OrderPage) o;
    return Objects.equals(this.by, orderPage.by) &&
        Objects.equals(this.sort, orderPage.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPage {\n");
    
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

