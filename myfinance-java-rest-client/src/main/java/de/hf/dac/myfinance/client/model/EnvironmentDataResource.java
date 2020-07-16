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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.hf.dac.myfinance.client.model.InstrumentListResource;
import de.hf.dac.myfinance.client.model.TenantListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvironmentDataResource
 */
@javax.annotation.Generated(value = "de.hf.dac.myfinance.codegen.MyFinanceClient_JavaGenerator", date = "2020-07-17T02:16:39.752+02:00")
public class EnvironmentDataResource {
  @JsonProperty("instruments")
  private InstrumentListResource instruments = null;

  @JsonProperty("tenants")
  private TenantListResource tenants = null;

  public EnvironmentDataResource instruments(InstrumentListResource instruments) {
    this.instruments = instruments;
    return this;
  }

   /**
   * Get instruments
   * @return instruments
  **/
  @ApiModelProperty(value = "")
  public InstrumentListResource getInstruments() {
    return instruments;
  }

  public void setInstruments(InstrumentListResource instruments) {
    this.instruments = instruments;
  }

  public EnvironmentDataResource tenants(TenantListResource tenants) {
    this.tenants = tenants;
    return this;
  }

   /**
   * Get tenants
   * @return tenants
  **/
  @ApiModelProperty(value = "")
  public TenantListResource getTenants() {
    return tenants;
  }

  public void setTenants(TenantListResource tenants) {
    this.tenants = tenants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentDataResource environmentDataResource = (EnvironmentDataResource) o;
    return Objects.equals(this.instruments, environmentDataResource.instruments) &&
        Objects.equals(this.tenants, environmentDataResource.tenants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruments, tenants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentDataResource {\n");
    
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
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

