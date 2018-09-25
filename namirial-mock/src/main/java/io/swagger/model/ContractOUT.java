package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Output for generating contract.
 */
@ApiModel(description = "Output for generating contract.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:34:40.705Z")

public class ContractOUT   {
  @JsonProperty("byteContract")
  private String byteContract = null;

  @JsonProperty("mimeTypeContract")
  private String mimeTypeContract = null;

  /**
   * Get byteContract
   * @return byteContract
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public String getByteContract() {
    return byteContract;
  }

  public void setByteContract(String byteContract) {
    this.byteContract = byteContract;
  }

  public ContractOUT mimeTypeContract(String mimeTypeContract) {
    this.mimeTypeContract = mimeTypeContract;
    return this;
  }

  /**
   * Get mimeTypeContract
   * @return mimeTypeContract
  **/
  @ApiModelProperty(example = "application/pdf", required = true, value = "")
  @NotNull


  public String getMimeTypeContract() {
    return mimeTypeContract;
  }

  public void setMimeTypeContract(String mimeTypeContract) {
    this.mimeTypeContract = mimeTypeContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractOUT contractOUT = (ContractOUT) o;
    return Objects.equals(this.byteContract, contractOUT.byteContract) &&
        Objects.equals(this.mimeTypeContract, contractOUT.mimeTypeContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteContract, mimeTypeContract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractOUT {\n");
    
    sb.append("    byteContract: ").append(toIndentedString(byteContract)).append("\n");
    sb.append("    mimeTypeContract: ").append(toIndentedString(mimeTypeContract)).append("\n");
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

