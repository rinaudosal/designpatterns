package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Client;
import org.openapitools.model.Cursor;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * It groups Client and Cursor objects
 */
@ApiModel(description = "It groups Client and Cursor objects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClientAndCursor   {
  @JsonProperty("clients")
  @Valid
  private List<Client> clients = null;

  @JsonProperty("cursor")
  private Cursor cursor = null;

  public ClientAndCursor clients(List<Client> clients) {
    this.clients = clients;
    return this;
  }

  public ClientAndCursor addClientsItem(Client clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<>();
    }
    this.clients.add(clientsItem);
    return this;
  }

  /**
   * Get clients
   * @return clients
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Client> getClients() {
    return clients;
  }

  public void setClients(List<Client> clients) {
    this.clients = clients;
  }

  public ClientAndCursor cursor(Cursor cursor) {
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
    ClientAndCursor clientAndCursor = (ClientAndCursor) o;
    return Objects.equals(this.clients, clientAndCursor.clients) &&
        Objects.equals(this.cursor, clientAndCursor.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAndCursor {\n");
    
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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

