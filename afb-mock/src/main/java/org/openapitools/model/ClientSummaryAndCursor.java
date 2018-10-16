package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ClientSummary;
import org.openapitools.model.Cursor;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * It groups ClientSummary and Cursor objects
 */
@ApiModel(description = "It groups ClientSummary and Cursor objects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClientSummaryAndCursor   {
  @JsonProperty("clientSummaries")
  @Valid
  private List<ClientSummary> clientSummaries = null;

  @JsonProperty("cursor")
  private Cursor cursor = null;

  public ClientSummaryAndCursor clientSummaries(List<ClientSummary> clientSummaries) {
    this.clientSummaries = clientSummaries;
    return this;
  }

  public ClientSummaryAndCursor addClientSummariesItem(ClientSummary clientSummariesItem) {
    if (this.clientSummaries == null) {
      this.clientSummaries = new ArrayList<>();
    }
    this.clientSummaries.add(clientSummariesItem);
    return this;
  }

  /**
   * Get clientSummaries
   * @return clientSummaries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ClientSummary> getClientSummaries() {
    return clientSummaries;
  }

  public void setClientSummaries(List<ClientSummary> clientSummaries) {
    this.clientSummaries = clientSummaries;
  }

  public ClientSummaryAndCursor cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cursor getCursor() {
    return cursor;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSummaryAndCursor clientSummaryAndCursor = (ClientSummaryAndCursor) o;
    return Objects.equals(this.clientSummaries, clientSummaryAndCursor.clientSummaries) &&
        Objects.equals(this.cursor, clientSummaryAndCursor.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSummaries, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSummaryAndCursor {\n");
    
    sb.append("    clientSummaries: ").append(toIndentedString(clientSummaries)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

