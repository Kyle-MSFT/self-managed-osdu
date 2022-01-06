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
import io.swagger.client.model.FileDriver;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * FileLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:36:10.522Z")
public class FileLocation {
  @SerializedName("FileID")
  private String fileID = null;

  @SerializedName("Driver")
  private FileDriver driver = null;

  @SerializedName("Location")
  private String location = null;

  @SerializedName("CreatedAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("CreatedBy")
  private String createdBy = null;

  public FileLocation fileID(String fileID) {
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

  public FileLocation driver(FileDriver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @ApiModelProperty(value = "")
  public FileDriver getDriver() {
    return driver;
  }

  public void setDriver(FileDriver driver) {
    this.driver = driver;
  }

  public FileLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public FileLocation createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FileLocation createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLocation fileLocation = (FileLocation) o;
    return Objects.equals(this.fileID, fileLocation.fileID) &&
        Objects.equals(this.driver, fileLocation.driver) &&
        Objects.equals(this.location, fileLocation.location) &&
        Objects.equals(this.createdAt, fileLocation.createdAt) &&
        Objects.equals(this.createdBy, fileLocation.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileID, driver, location, createdAt, createdBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLocation {\n");
    
    sb.append("    fileID: ").append(toIndentedString(fileID)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

