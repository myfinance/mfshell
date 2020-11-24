/*
 * Dac Services
 * Dac Service REST API
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.hf.dac.myfinance.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.hf.dac.myfinance.client.model.RecurrentTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RecurrentTransactionListModel
 */
@javax.annotation.Generated(value = "de.hf.dac.myfinance.codegen.MyFinanceClient_JavaGenerator", date = "2020-11-24T14:07:06.698+01:00")



public class RecurrentTransactionListModel {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("values")
  private List<RecurrentTransaction> values = new ArrayList<>();

  public RecurrentTransactionListModel url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RecurrentTransactionListModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RecurrentTransactionListModel values(List<RecurrentTransaction> values) {
    this.values = values;
    return this;
  }

  public RecurrentTransactionListModel addValuesItem(RecurrentTransaction valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(required = true, value = "")
  public List<RecurrentTransaction> getValues() {
    return values;
  }

  public void setValues(List<RecurrentTransaction> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurrentTransactionListModel recurrentTransactionListModel = (RecurrentTransactionListModel) o;
    return Objects.equals(this.url, recurrentTransactionListModel.url) &&
        Objects.equals(this.id, recurrentTransactionListModel.id) &&
        Objects.equals(this.values, recurrentTransactionListModel.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, id, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrentTransactionListModel {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

