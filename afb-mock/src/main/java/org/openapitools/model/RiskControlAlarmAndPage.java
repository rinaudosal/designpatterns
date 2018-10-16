package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.RiskControlAlarm;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {RiskControlAlarm} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {RiskControlAlarm} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskControlAlarmAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("riskControlAlarms")
  @Valid
  private List<RiskControlAlarm> riskControlAlarms = null;

  public RiskControlAlarmAndPage page(Page page) {
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

  public RiskControlAlarmAndPage riskControlAlarms(List<RiskControlAlarm> riskControlAlarms) {
    this.riskControlAlarms = riskControlAlarms;
    return this;
  }

  public RiskControlAlarmAndPage addRiskControlAlarmsItem(RiskControlAlarm riskControlAlarmsItem) {
    if (this.riskControlAlarms == null) {
      this.riskControlAlarms = new ArrayList<>();
    }
    this.riskControlAlarms.add(riskControlAlarmsItem);
    return this;
  }

  /**
   * The array of {RiskControlAlarm}
   * @return riskControlAlarms
  **/
  @ApiModelProperty(value = "The array of {RiskControlAlarm}")

  @Valid

  public List<RiskControlAlarm> getRiskControlAlarms() {
    return riskControlAlarms;
  }

  public void setRiskControlAlarms(List<RiskControlAlarm> riskControlAlarms) {
    this.riskControlAlarms = riskControlAlarms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskControlAlarmAndPage riskControlAlarmAndPage = (RiskControlAlarmAndPage) o;
    return Objects.equals(this.page, riskControlAlarmAndPage.page) &&
        Objects.equals(this.riskControlAlarms, riskControlAlarmAndPage.riskControlAlarms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, riskControlAlarms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskControlAlarmAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    riskControlAlarms: ").append(toIndentedString(riskControlAlarms)).append("\n");
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

