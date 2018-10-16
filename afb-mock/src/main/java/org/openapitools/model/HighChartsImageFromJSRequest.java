package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A request with the needed parameters for highcharts to create a PNG. 
 */
@ApiModel(description = "A request with the needed parameters for highcharts to create a PNG. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HighChartsImageFromJSRequest   {
  @JsonProperty("callBack")
  private String callBack = null;

  @JsonProperty("constructor")
  private String constructor = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("globalOptions")
  private String globalOptions = null;

  @JsonProperty("input")
  private String input = null;

  @JsonProperty("mime")
  private String mime = null;

  @JsonProperty("resources")
  private String resources = null;

  @JsonProperty("scale")
  private String scale = null;

  @JsonProperty("width")
  private String width = null;

  public HighChartsImageFromJSRequest callBack(String callBack) {
    this.callBack = callBack;
    return this;
  }

  /**
   * String containing a callback JavaScript. 
   * @return callBack
  **/
  @ApiModelProperty(value = "String containing a callback JavaScript. ")


  public String getCallBack() {
    return callBack;
  }

  public void setCallBack(String callBack) {
    this.callBack = callBack;
  }

  public HighChartsImageFromJSRequest constructor(String constructor) {
    this.constructor = constructor;
    return this;
  }

  /**
   * The constructor name. Can be one of 'Chart' or 'StockChart'. This depends on whether you want to generate Highstock or basic Highcharts. Only applicable when using this in combination with the 'input' parameter. 
   * @return constructor
  **/
  @ApiModelProperty(value = "The constructor name. Can be one of 'Chart' or 'StockChart'. This depends on whether you want to generate Highstock or basic Highcharts. Only applicable when using this in combination with the 'input' parameter. ")


  public String getConstructor() {
    return constructor;
  }

  public void setConstructor(String constructor) {
    this.constructor = constructor;
  }

  public HighChartsImageFromJSRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The name of the exported file. Defaults to 'Chart'. 
   * @return fileName
  **/
  @ApiModelProperty(value = "The name of the exported file. Defaults to 'Chart'. ")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public HighChartsImageFromJSRequest globalOptions(String globalOptions) {
    this.globalOptions = globalOptions;
    return this;
  }

  /**
   * Use this if you want to apply a set of options to all charts on the same page. 
   * @return globalOptions
  **/
  @ApiModelProperty(value = "Use this if you want to apply a set of options to all charts on the same page. ")


  public String getGlobalOptions() {
    return globalOptions;
  }

  public void setGlobalOptions(String globalOptions) {
    this.globalOptions = globalOptions;
  }

  public HighChartsImageFromJSRequest input(String input) {
    this.input = input;
    return this;
  }

  /**
   * Highcharts JS code to generate a chart.
   * @return input
  **/
  @ApiModelProperty(value = "Highcharts JS code to generate a chart.")


  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public HighChartsImageFromJSRequest mime(String mime) {
    this.mime = mime;
    return this;
  }

  /**
   * The content-type of the file to output. Can be one of 'image/png', 'image/jpeg', 'application/pdf', or 'image/svg+xml'. 
   * @return mime
  **/
  @ApiModelProperty(value = "The content-type of the file to output. Can be one of 'image/png', 'image/jpeg', 'application/pdf', or 'image/svg+xml'. ")


  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public HighChartsImageFromJSRequest resources(String resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Stringified JSON which can contain three properties js and css. 
   * @return resources
  **/
  @ApiModelProperty(value = "Stringified JSON which can contain three properties js and css. ")


  public String getResources() {
    return resources;
  }

  public void setResources(String resources) {
    this.resources = resources;
  }

  public HighChartsImageFromJSRequest scale(String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * To scale the original SVG.  For example, if the chart.width option in the chart configuration is set to 600 and the scale is set to 2, the output raster image will have a pixel width of 1200. So this is a convenient way of increasing the resolution without decreasing the font size and line widths in the chart. This is ignored if the -width parameter is set. For now we allow a maximum scaling of 4. This is for ensuring a good repsonse time. Scaling is a bit resource intensive. 
   * @return scale
  **/
  @ApiModelProperty(value = "To scale the original SVG.  For example, if the chart.width option in the chart configuration is set to 600 and the scale is set to 2, the output raster image will have a pixel width of 1200. So this is a convenient way of increasing the resolution without decreasing the font size and line widths in the chart. This is ignored if the -width parameter is set. For now we allow a maximum scaling of 4. This is for ensuring a good repsonse time. Scaling is a bit resource intensive. ")


  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
  }

  public HighChartsImageFromJSRequest width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Set the exact pixel width of the exported image or pdf. This overrides the -scale parameter. The maximum allowed width is 2000px. 
   * @return width
  **/
  @ApiModelProperty(value = "Set the exact pixel width of the exported image or pdf. This overrides the -scale parameter. The maximum allowed width is 2000px. ")


  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighChartsImageFromJSRequest highChartsImageFromJSRequest = (HighChartsImageFromJSRequest) o;
    return Objects.equals(this.callBack, highChartsImageFromJSRequest.callBack) &&
        Objects.equals(this.constructor, highChartsImageFromJSRequest.constructor) &&
        Objects.equals(this.fileName, highChartsImageFromJSRequest.fileName) &&
        Objects.equals(this.globalOptions, highChartsImageFromJSRequest.globalOptions) &&
        Objects.equals(this.input, highChartsImageFromJSRequest.input) &&
        Objects.equals(this.mime, highChartsImageFromJSRequest.mime) &&
        Objects.equals(this.resources, highChartsImageFromJSRequest.resources) &&
        Objects.equals(this.scale, highChartsImageFromJSRequest.scale) &&
        Objects.equals(this.width, highChartsImageFromJSRequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callBack, constructor, fileName, globalOptions, input, mime, resources, scale, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighChartsImageFromJSRequest {\n");
    
    sb.append("    callBack: ").append(toIndentedString(callBack)).append("\n");
    sb.append("    constructor: ").append(toIndentedString(constructor)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    globalOptions: ").append(toIndentedString(globalOptions)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

