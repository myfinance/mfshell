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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BaseMFRunnerParameter
 */
@javax.annotation.Generated(value = "de.hf.dac.myfinance.codegen.MyFinanceClient_JavaGenerator", date = "2020-11-24T14:07:06.698+01:00")



public class BaseMFRunnerParameter {
  @JsonProperty("params")
  private Map<String, Object> params = null;

  @JsonProperty("environment")
  private String environment = null;

  public BaseMFRunnerParameter params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  public BaseMFRunnerParameter putParamsItem(String key, Object paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  public BaseMFRunnerParameter environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseMFRunnerParameter baseMFRunnerParameter = (BaseMFRunnerParameter) o;
    return Objects.equals(this.params, baseMFRunnerParameter.params) &&
        Objects.equals(this.environment, baseMFRunnerParameter.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(params, environment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseMFRunnerParameter {\n");
    
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

