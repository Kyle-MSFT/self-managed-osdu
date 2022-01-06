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
import io.swagger.client.model.SearchPoint;
import java.io.IOException;

/**
 * A spatial filter criteria to filter documents that exist within a specific distance from a geo point.
 */
@ApiModel(description = "A spatial filter criteria to filter documents that exist within a specific distance from a geo point.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:08:24.505Z")
public class SearchByDistance {
  @SerializedName("distance")
  private Double distance = null;

  @SerializedName("point")
  private SearchPoint point = null;

  public SearchByDistance distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * minimum: 0
   * @return distance
  **/
  @ApiModelProperty(value = "")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public SearchByDistance point(SearchPoint point) {
    this.point = point;
    return this;
  }

   /**
   * Get point
   * @return point
  **/
  @ApiModelProperty(required = true, value = "")
  public SearchPoint getPoint() {
    return point;
  }

  public void setPoint(SearchPoint point) {
    this.point = point;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchByDistance searchByDistance = (SearchByDistance) o;
    return Objects.equals(this.distance, searchByDistance.distance) &&
        Objects.equals(this.point, searchByDistance.point);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, point);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchByDistance {\n");
    
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
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

