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
 * Trade
 */
@javax.annotation.Generated(value = "de.hf.dac.myfinance.codegen.MyFinanceClient_JavaGenerator", date = "2020-07-17T02:16:39.752+02:00")
public class Trade {
  @JsonProperty("tradeid")
  private Integer tradeid = null;

  @JsonProperty("instrumentByDepotid")
  private Instrument instrumentByDepotid = null;

  @JsonProperty("instrumentByInstrumentid")
  private Instrument instrumentByInstrumentid = null;

  @JsonProperty("transaction")
  private Transaction transaction = null;

  @JsonProperty("amount")
  private Double amount = null;

  public Trade tradeid(Integer tradeid) {
    this.tradeid = tradeid;
    return this;
  }

   /**
   * Get tradeid
   * @return tradeid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTradeid() {
    return tradeid;
  }

  public void setTradeid(Integer tradeid) {
    this.tradeid = tradeid;
  }

  public Trade instrumentByDepotid(Instrument instrumentByDepotid) {
    this.instrumentByDepotid = instrumentByDepotid;
    return this;
  }

   /**
   * Get instrumentByDepotid
   * @return instrumentByDepotid
  **/
  @ApiModelProperty(required = true, value = "")
  public Instrument getInstrumentByDepotid() {
    return instrumentByDepotid;
  }

  public void setInstrumentByDepotid(Instrument instrumentByDepotid) {
    this.instrumentByDepotid = instrumentByDepotid;
  }

  public Trade instrumentByInstrumentid(Instrument instrumentByInstrumentid) {
    this.instrumentByInstrumentid = instrumentByInstrumentid;
    return this;
  }

   /**
   * Get instrumentByInstrumentid
   * @return instrumentByInstrumentid
  **/
  @ApiModelProperty(required = true, value = "")
  public Instrument getInstrumentByInstrumentid() {
    return instrumentByInstrumentid;
  }

  public void setInstrumentByInstrumentid(Instrument instrumentByInstrumentid) {
    this.instrumentByInstrumentid = instrumentByInstrumentid;
  }

  public Trade transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(required = true, value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  public Trade amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trade trade = (Trade) o;
    return Objects.equals(this.tradeid, trade.tradeid) &&
        Objects.equals(this.instrumentByDepotid, trade.instrumentByDepotid) &&
        Objects.equals(this.instrumentByInstrumentid, trade.instrumentByInstrumentid) &&
        Objects.equals(this.transaction, trade.transaction) &&
        Objects.equals(this.amount, trade.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeid, instrumentByDepotid, instrumentByInstrumentid, transaction, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    
    sb.append("    tradeid: ").append(toIndentedString(tradeid)).append("\n");
    sb.append("    instrumentByDepotid: ").append(toIndentedString(instrumentByDepotid)).append("\n");
    sb.append("    instrumentByInstrumentid: ").append(toIndentedString(instrumentByInstrumentid)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

