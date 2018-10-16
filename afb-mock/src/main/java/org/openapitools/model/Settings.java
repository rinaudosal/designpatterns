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
 * Settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Settings   {
  @JsonProperty("accessibleHomePages")
  @Valid
  private List<String> accessibleHomePages = null;

  @JsonProperty("settings")
  @Valid
  private List<KeyValue> settings = null;

  @JsonProperty("userAccessControlList")
  @Valid
  private List<KeyValue> userAccessControlList = null;

  public Settings accessibleHomePages(List<String> accessibleHomePages) {
    this.accessibleHomePages = accessibleHomePages;
    return this;
  }

  public Settings addAccessibleHomePagesItem(String accessibleHomePagesItem) {
    if (this.accessibleHomePages == null) {
      this.accessibleHomePages = new ArrayList<>();
    }
    this.accessibleHomePages.add(accessibleHomePagesItem);
    return this;
  }

  /**
   * The array of {CodeDescription.code}
   * @return accessibleHomePages
  **/
  @ApiModelProperty(value = "The array of {CodeDescription.code}")


  public List<String> getAccessibleHomePages() {
    return accessibleHomePages;
  }

  public void setAccessibleHomePages(List<String> accessibleHomePages) {
    this.accessibleHomePages = accessibleHomePages;
  }

  public Settings settings(List<KeyValue> settings) {
    this.settings = settings;
    return this;
  }

  public Settings addSettingsItem(KeyValue settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

  /**
   * The array of {KeyValue}
   * @return settings
  **/
  @ApiModelProperty(value = "The array of {KeyValue}")

  @Valid

  public List<KeyValue> getSettings() {
    return settings;
  }

  public void setSettings(List<KeyValue> settings) {
    this.settings = settings;
  }

  public Settings userAccessControlList(List<KeyValue> userAccessControlList) {
    this.userAccessControlList = userAccessControlList;
    return this;
  }

  public Settings addUserAccessControlListItem(KeyValue userAccessControlListItem) {
    if (this.userAccessControlList == null) {
      this.userAccessControlList = new ArrayList<>();
    }
    this.userAccessControlList.add(userAccessControlListItem);
    return this;
  }

  /**
   * The array of {KeyValue}
   * @return userAccessControlList
  **/
  @ApiModelProperty(value = "The array of {KeyValue}")

  @Valid

  public List<KeyValue> getUserAccessControlList() {
    return userAccessControlList;
  }

  public void setUserAccessControlList(List<KeyValue> userAccessControlList) {
    this.userAccessControlList = userAccessControlList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.accessibleHomePages, settings.accessibleHomePages) &&
        Objects.equals(this.settings, settings.settings) &&
        Objects.equals(this.userAccessControlList, settings.userAccessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibleHomePages, settings, userAccessControlList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    accessibleHomePages: ").append(toIndentedString(accessibleHomePages)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    userAccessControlList: ").append(toIndentedString(userAccessControlList)).append("\n");
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

