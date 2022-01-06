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
import java.util.ArrayList;
import java.util.List;

/**
 * Storage record versions.
 */
@ApiModel(description = "Storage record versions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:08:24.505Z")
public class StorageRecordVersions {
  @SerializedName("recordId")
  private String recordId = null;

  @SerializedName("versions")
  private List<Long> versions = null;

  public StorageRecordVersions recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @ApiModelProperty(value = "")
  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public StorageRecordVersions versions(List<Long> versions) {
    this.versions = versions;
    return this;
  }

  public StorageRecordVersions addVersionsItem(Long versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<Long>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @ApiModelProperty(value = "")
  public List<Long> getVersions() {
    return versions;
  }

  public void setVersions(List<Long> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageRecordVersions storageRecordVersions = (StorageRecordVersions) o;
    return Objects.equals(this.recordId, storageRecordVersions.recordId) &&
        Objects.equals(this.versions, storageRecordVersions.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, versions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageRecordVersions {\n");
    
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

