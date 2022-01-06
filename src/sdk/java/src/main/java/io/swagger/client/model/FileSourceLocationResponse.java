/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FileSourceLocationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:36:10.522Z")
public class FileSourceLocationResponse {
  @SerializedName("FileID")
  private String fileID = null;

  @SerializedName("Location")
  private Object location = null;

  public FileSourceLocationResponse fileID(String fileID) {
    this.fileID = fileID;
    return this;
  }

   /**
   * Get fileID
   * @return fileID
  **/
  @ApiModelProperty(value = "")
  public String getFileID() {
    return fileID;
  }

  public void setFileID(String fileID) {
    this.fileID = fileID;
  }

  public FileSourceLocationResponse location(Object location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Object getLocation() {
    return location;
  }

  public void setLocation(Object location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSourceLocationResponse fileSourceLocationResponse = (FileSourceLocationResponse) o;
    return Objects.equals(this.fileID, fileSourceLocationResponse.fileID) &&
        Objects.equals(this.location, fileSourceLocationResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileID, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSourceLocationResponse {\n");
    
    sb.append("    fileID: ").append(toIndentedString(fileID)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

