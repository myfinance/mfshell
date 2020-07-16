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
import de.hf.dac.myfinance.client.model.Instrument;
import de.hf.dac.myfinance.client.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Cashflow
 */
@javax.annotation.Generated(value = "de.hf.dac.myfinance.codegen.MyFinanceClient_JavaGenerator", date = "2020-07-17T02:16:39.752+02:00")
public class Cashflow {
  @JsonProperty("cashflowid")
  private Integer cashflowid = null;

  @JsonProperty("instrument")
  private Instrument instrument = null;

  @JsonProperty("transaction")
  private Transaction transaction = null;

  @JsonProperty("value")
  private Double value = null;

  public Cashflow cashflowid(Integer cashflowid) {
    this.cashflowid = cashflowid;
    return this;
  }

   /**
   * Get cashflowid
   * @return cashflowid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCashflowid() {
    return cashflowid;
  }

  public void setCashflowid(Integer cashflowid) {
    this.cashflowid = cashflowid;
  }

  public Cashflow instrument(Instrument instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @ApiModelProperty(required = true, value = "")
  public Instrument getInstrument() {
    return instrument;
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public Cashflow transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  public Cashflow value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cashflow cashflow = (Cashflow) o;
    return Objects.equals(this.cashflowid, cashflow.cashflowid) &&
        Objects.equals(this.instrument, cashflow.instrument) &&
        Objects.equals(this.transaction, cashflow.transaction) &&
        Objects.equals(this.value, cashflow.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashflowid, instrument, transaction, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cashflow {\n");
    
    sb.append("    cashflowid: ").append(toIndentedString(cashflowid)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

