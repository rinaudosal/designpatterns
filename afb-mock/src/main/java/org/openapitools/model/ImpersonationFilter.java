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
 * ImpersonationFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ImpersonationFilter   {
  /**
   * Indicates the type of User to be impersonated
   */
  public enum ImpersonationTypeEnum {
    ALL("ALL"),
    
    LYNX("LYNX"),
    
    ECOMPOSER("ECOMPOSER");

    private String value;

    ImpersonationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImpersonationTypeEnum fromValue(String text) {
      for (ImpersonationTypeEnum b : ImpersonationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("impersonationType")
  private ImpersonationTypeEnum impersonationType = null;

  public ImpersonationFilter impersonationType(ImpersonationTypeEnum impersonationType) {
    this.impersonationType = impersonationType;
    return this;
  }

  /**
   * Indicates the type of User to be impersonated
   * @return impersonationType
  **/
  @ApiModelProperty(value = "Indicates the type of User to be impersonated")


  public ImpersonationTypeEnum getImpersonationType() {
    return impersonationType;
  }

  public void setImpersonationType(ImpersonationTypeEnum impersonationType) {
    this.impersonationType = impersonationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpersonationFilter impersonationFilter = (ImpersonationFilter) o;
    return Objects.equals(this.impersonationType, impersonationFilter.impersonationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impersonationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpersonationFilter {\n");
    
    sb.append("    impersonationType: ").append(toIndentedString(impersonationType)).append("\n");
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

