package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeyValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * XlsExportInfoFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class XlsExportInfoFilter   {
  @JsonProperty("footers")
  @Valid
  private List<String> footers = null;

  @JsonProperty("mainTitles")
  @Valid
  private List<String> mainTitles = null;

  @JsonProperty("secondaryTitles")
  @Valid
  private List<String> secondaryTitles = null;

  @JsonProperty("tableHeaders")
  @Valid
  private List<KeyValue> tableHeaders = null;

  @JsonProperty("tableHeadersGroups")
  @Valid
  private List<String> tableHeadersGroups = null;

  @JsonProperty("topicTitles")
  @Valid
  private List<String> topicTitles = null;

  public XlsExportInfoFilter footers(List<String> footers) {
    this.footers = footers;
    return this;
  }

  public XlsExportInfoFilter addFootersItem(String footersItem) {
    if (this.footers == null) {
      this.footers = new ArrayList<>();
    }
    this.footers.add(footersItem);
    return this;
  }

  /**
   * The array with footers.
   * @return footers
  **/
  @ApiModelProperty(value = "The array with footers.")


  public List<String> getFooters() {
    return footers;
  }

  public void setFooters(List<String> footers) {
    this.footers = footers;
  }

  public XlsExportInfoFilter mainTitles(List<String> mainTitles) {
    this.mainTitles = mainTitles;
    return this;
  }

  public XlsExportInfoFilter addMainTitlesItem(String mainTitlesItem) {
    if (this.mainTitles == null) {
      this.mainTitles = new ArrayList<>();
    }
    this.mainTitles.add(mainTitlesItem);
    return this;
  }

  /**
   * The array with main titles.
   * @return mainTitles
  **/
  @ApiModelProperty(value = "The array with main titles.")


  public List<String> getMainTitles() {
    return mainTitles;
  }

  public void setMainTitles(List<String> mainTitles) {
    this.mainTitles = mainTitles;
  }

  public XlsExportInfoFilter secondaryTitles(List<String> secondaryTitles) {
    this.secondaryTitles = secondaryTitles;
    return this;
  }

  public XlsExportInfoFilter addSecondaryTitlesItem(String secondaryTitlesItem) {
    if (this.secondaryTitles == null) {
      this.secondaryTitles = new ArrayList<>();
    }
    this.secondaryTitles.add(secondaryTitlesItem);
    return this;
  }

  /**
   * The array with secondary titles.
   * @return secondaryTitles
  **/
  @ApiModelProperty(value = "The array with secondary titles.")


  public List<String> getSecondaryTitles() {
    return secondaryTitles;
  }

  public void setSecondaryTitles(List<String> secondaryTitles) {
    this.secondaryTitles = secondaryTitles;
  }

  public XlsExportInfoFilter tableHeaders(List<KeyValue> tableHeaders) {
    this.tableHeaders = tableHeaders;
    return this;
  }

  public XlsExportInfoFilter addTableHeadersItem(KeyValue tableHeadersItem) {
    if (this.tableHeaders == null) {
      this.tableHeaders = new ArrayList<>();
    }
    this.tableHeaders.add(tableHeadersItem);
    return this;
  }

  /**
   * The array with table headers.
   * @return tableHeaders
  **/
  @ApiModelProperty(value = "The array with table headers.")

  @Valid

  public List<KeyValue> getTableHeaders() {
    return tableHeaders;
  }

  public void setTableHeaders(List<KeyValue> tableHeaders) {
    this.tableHeaders = tableHeaders;
  }

  public XlsExportInfoFilter tableHeadersGroups(List<String> tableHeadersGroups) {
    this.tableHeadersGroups = tableHeadersGroups;
    return this;
  }

  public XlsExportInfoFilter addTableHeadersGroupsItem(String tableHeadersGroupsItem) {
    if (this.tableHeadersGroups == null) {
      this.tableHeadersGroups = new ArrayList<>();
    }
    this.tableHeadersGroups.add(tableHeadersGroupsItem);
    return this;
  }

  /**
   * The array with table headers groups.
   * @return tableHeadersGroups
  **/
  @ApiModelProperty(value = "The array with table headers groups.")


  public List<String> getTableHeadersGroups() {
    return tableHeadersGroups;
  }

  public void setTableHeadersGroups(List<String> tableHeadersGroups) {
    this.tableHeadersGroups = tableHeadersGroups;
  }

  public XlsExportInfoFilter topicTitles(List<String> topicTitles) {
    this.topicTitles = topicTitles;
    return this;
  }

  public XlsExportInfoFilter addTopicTitlesItem(String topicTitlesItem) {
    if (this.topicTitles == null) {
      this.topicTitles = new ArrayList<>();
    }
    this.topicTitles.add(topicTitlesItem);
    return this;
  }

  /**
   * The array with topic titles.
   * @return topicTitles
  **/
  @ApiModelProperty(value = "The array with topic titles.")


  public List<String> getTopicTitles() {
    return topicTitles;
  }

  public void setTopicTitles(List<String> topicTitles) {
    this.topicTitles = topicTitles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsExportInfoFilter xlsExportInfoFilter = (XlsExportInfoFilter) o;
    return Objects.equals(this.footers, xlsExportInfoFilter.footers) &&
        Objects.equals(this.mainTitles, xlsExportInfoFilter.mainTitles) &&
        Objects.equals(this.secondaryTitles, xlsExportInfoFilter.secondaryTitles) &&
        Objects.equals(this.tableHeaders, xlsExportInfoFilter.tableHeaders) &&
        Objects.equals(this.tableHeadersGroups, xlsExportInfoFilter.tableHeadersGroups) &&
        Objects.equals(this.topicTitles, xlsExportInfoFilter.topicTitles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(footers, mainTitles, secondaryTitles, tableHeaders, tableHeadersGroups, topicTitles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsExportInfoFilter {\n");
    
    sb.append("    footers: ").append(toIndentedString(footers)).append("\n");
    sb.append("    mainTitles: ").append(toIndentedString(mainTitles)).append("\n");
    sb.append("    secondaryTitles: ").append(toIndentedString(secondaryTitles)).append("\n");
    sb.append("    tableHeaders: ").append(toIndentedString(tableHeaders)).append("\n");
    sb.append("    tableHeadersGroups: ").append(toIndentedString(tableHeadersGroups)).append("\n");
    sb.append("    topicTitles: ").append(toIndentedString(topicTitles)).append("\n");
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

