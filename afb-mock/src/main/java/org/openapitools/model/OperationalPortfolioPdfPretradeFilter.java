package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CompositionItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioPdfPretradeFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioPdfPretradeFilter   {
  @JsonProperty("compositionItems")
  @Valid
  private List<CompositionItem> compositionItems = null;

  /**
   * When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   */
  public enum LevelEnum {
    MODEL_PORTFOLIO("MODEL_PORTFOLIO"),
    
    REAL_PORTFOLIO("REAL_PORTFOLIO"),
    
    FINAL_INVESTOR_PORTFOLIO("FINAL_INVESTOR_PORTFOLIO");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("level")
  private LevelEnum level = null;

  public OperationalPortfolioPdfPretradeFilter compositionItems(List<CompositionItem> compositionItems) {
    this.compositionItems = compositionItems;
    return this;
  }

  public OperationalPortfolioPdfPretradeFilter addCompositionItemsItem(CompositionItem compositionItemsItem) {
    if (this.compositionItems == null) {
      this.compositionItems = new ArrayList<>();
    }
    this.compositionItems.add(compositionItemsItem);
    return this;
  }

  /**
   * Get compositionItems
   * @return compositionItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CompositionItem> getCompositionItems() {
    return compositionItems;
  }

  public void setCompositionItems(List<CompositionItem> compositionItems) {
    this.compositionItems = compositionItems;
  }

  public OperationalPortfolioPdfPretradeFilter level(LevelEnum level) {
    this.level = level;
    return this;
  }

  /**
   * When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".
   * @return level
  **/
  @ApiModelProperty(value = "When the movementType is Proportional, it is necessary to define the scope of the portfolio to consider. Enum to select between \"MODEL_PORTFOLIO\" or \"REAL_PORTFOLIO\".")


  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioPdfPretradeFilter operationalPortfolioPdfPretradeFilter = (OperationalPortfolioPdfPretradeFilter) o;
    return Objects.equals(this.compositionItems, operationalPortfolioPdfPretradeFilter.compositionItems) &&
        Objects.equals(this.level, operationalPortfolioPdfPretradeFilter.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositionItems, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioPdfPretradeFilter {\n");
    
    sb.append("    compositionItems: ").append(toIndentedString(compositionItems)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

