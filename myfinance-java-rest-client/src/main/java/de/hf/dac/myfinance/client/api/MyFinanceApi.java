package de.hf.dac.myfinance.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import de.hf.dac.myfinance.client.model.DateDoubleModel;
import de.hf.dac.myfinance.client.model.InstrumentListModel;
import de.hf.dac.myfinance.client.model.InstrumentModel;
import de.hf.dac.myfinance.client.model.RecurrentTransactionListModel;
import de.hf.dac.myfinance.client.model.StringListModel;
import de.hf.dac.myfinance.client.model.TransactionListModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "de.hf.dac.myfinance.codegen.MyFinanceClient_JavaGenerator", date = "2020-11-24T14:07:06.698+01:00")
public class MyFinanceApi {
  private ApiClient apiClient;

  public MyFinanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MyFinanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * add Budget
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param budgetGroupId the Id of the budgetGroup which the budget is attached to (optional)
   * @throws ApiException if fails to make API call
   */
  public void addBudget_envID_description_budgetGroupId(String envID, String description, Integer budgetGroupId) throws ApiException {

    addBudget_envID_description_budgetGroupIdWithHttpInfo(envID, description, budgetGroupId);
  }

  /**
   * add Budget
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param budgetGroupId the Id of the budgetGroup which the budget is attached to (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addBudget_envID_description_budgetGroupIdWithHttpInfo(String envID, String description, Integer budgetGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addBudget_envID_description_budgetGroupId");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addBudget"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "budgetGroupId", budgetGroupId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Instrument
   * 
   * @param envID The Service Environment (required)
   * @param currencyCode the currencyCode (optional)
   * @param description description (optional)
   * @throws ApiException if fails to make API call
   */
  public void addCurrency_envID_currencyCode_description(String envID, String currencyCode, String description) throws ApiException {

    addCurrency_envID_currencyCode_descriptionWithHttpInfo(envID, currencyCode, description);
  }

  /**
   * save Instrument
   * 
   * @param envID The Service Environment (required)
   * @param currencyCode the currencyCode (optional)
   * @param description description (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addCurrency_envID_currencyCode_descriptionWithHttpInfo(String envID, String currencyCode, String description) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addCurrency_envID_currencyCode_description");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addCurrency"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currencyCode", currencyCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Instrument
   * 
   * @param envID The Service Environment (required)
   * @param isin the isin (optional)
   * @param description description (optional)
   * @throws ApiException if fails to make API call
   */
  public void addEquity_envID_isin_description(String envID, String isin, String description) throws ApiException {

    addEquity_envID_isin_descriptionWithHttpInfo(envID, isin, description);
  }

  /**
   * save Instrument
   * 
   * @param envID The Service Environment (required)
   * @param isin the isin (optional)
   * @param description description (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addEquity_envID_isin_descriptionWithHttpInfo(String envID, String isin, String description) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addEquity_envID_isin_description");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addEquity"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Giro
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param tenantId the Id of the tenant which the giro is attached to (optional)
   * @throws ApiException if fails to make API call
   */
  public void addGiro_envID_description_tenantId(String envID, String description, Integer tenantId) throws ApiException {

    addGiro_envID_description_tenantIdWithHttpInfo(envID, description, tenantId);
  }

  /**
   * save Giro
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param tenantId the Id of the tenant which the giro is attached to (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addGiro_envID_description_tenantIdWithHttpInfo(String envID, String description, Integer tenantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addGiro_envID_description_tenantId");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addGiro"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenantId", tenantId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Income or Expense
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param accId the accountId of the income or expense (optional)
   * @param budgetId the budgetId of the income or expense (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public void addIncomeExpense_envID_description_accId_budgetId_value_transactiondate(String envID, String description, Integer accId, Integer budgetId, Double value, String transactiondate) throws ApiException {

    addIncomeExpense_envID_description_accId_budgetId_value_transactiondateWithHttpInfo(envID, description, accId, budgetId, value, transactiondate);
  }

  /**
   * save Income or Expense
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param accId the accountId of the income or expense (optional)
   * @param budgetId the budgetId of the income or expense (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addIncomeExpense_envID_description_accId_budgetId_value_transactiondateWithHttpInfo(String envID, String description, Integer accId, Integer budgetId, Double value, String transactiondate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addIncomeExpense_envID_description_accId_budgetId_value_transactiondate");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addIncomeExpense"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accId", accId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "budgetId", budgetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactiondate", transactiondate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Price
   * 
   * @param envID The Service Environment (required)
   * @param currencyCode the currencyCode (optional)
   * @param isin the isin (optional)
   * @param dayofprice the dayofprice(yyyy-mm-dd (optional)
   * @param value value (optional)
   * @throws ApiException if fails to make API call
   */
  public void addPrice_envID_currencyCode_isin_dayofprice_value(String envID, String currencyCode, String isin, String dayofprice, Double value) throws ApiException {

    addPrice_envID_currencyCode_isin_dayofprice_valueWithHttpInfo(envID, currencyCode, isin, dayofprice, value);
  }

  /**
   * save Price
   * 
   * @param envID The Service Environment (required)
   * @param currencyCode the currencyCode (optional)
   * @param isin the isin (optional)
   * @param dayofprice the dayofprice(yyyy-mm-dd (optional)
   * @param value value (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addPrice_envID_currencyCode_isin_dayofprice_valueWithHttpInfo(String envID, String currencyCode, String isin, String dayofprice, Double value) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addPrice_envID_currencyCode_isin_dayofprice_value");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addPrice"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currencyCode", currencyCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dayofprice", dayofprice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save RecurrentTransfer
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param srcId the instrumentId of the source (optional)
   * @param trgId the instrumentId of the target (optional)
   * @param recurrentFrequency the frequency of the recurrent transaction (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public void addRecurrentTransfer_envID_description_srcId_trgId_recurrentFrequency_value_transactiondate(String envID, String description, Integer srcId, Integer trgId, String recurrentFrequency, Double value, String transactiondate) throws ApiException {

    addRecurrentTransfer_envID_description_srcId_trgId_recurrentFrequency_value_transactiondateWithHttpInfo(envID, description, srcId, trgId, recurrentFrequency, value, transactiondate);
  }

  /**
   * save RecurrentTransfer
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param srcId the instrumentId of the source (optional)
   * @param trgId the instrumentId of the target (optional)
   * @param recurrentFrequency the frequency of the recurrent transaction (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addRecurrentTransfer_envID_description_srcId_trgId_recurrentFrequency_value_transactiondateWithHttpInfo(String envID, String description, Integer srcId, Integer trgId, String recurrentFrequency, Double value, String transactiondate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addRecurrentTransfer_envID_description_srcId_trgId_recurrentFrequency_value_transactiondate");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addRecurrentTransfer"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "srcId", srcId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trgId", trgId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recurrentFrequency", recurrentFrequency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactiondate", transactiondate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Instrument
   * 
   * @param envID The Service Environment (required)
   * @param isin the isin (optional)
   * @param symbol symbol (optional)
   * @param currencycode the code of the currency in which the security is traded in the exchange referenced by the symbol (optional)
   * @throws ApiException if fails to make API call
   */
  public void addSymbol_envID_isin_symbol_currencycode(String envID, String isin, String symbol, String currencycode) throws ApiException {

    addSymbol_envID_isin_symbol_currencycodeWithHttpInfo(envID, isin, symbol, currencycode);
  }

  /**
   * save Instrument
   * 
   * @param envID The Service Environment (required)
   * @param isin the isin (optional)
   * @param symbol symbol (optional)
   * @param currencycode the code of the currency in which the security is traded in the exchange referenced by the symbol (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addSymbol_envID_isin_symbol_currencycodeWithHttpInfo(String envID, String isin, String symbol, String currencycode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addSymbol_envID_isin_symbol_currencycode");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addSymbol"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currencycode", currencycode));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Tenant
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @throws ApiException if fails to make API call
   */
  public void addTenant_envID_description(String envID, String description) throws ApiException {

    addTenant_envID_descriptionWithHttpInfo(envID, description);
  }

  /**
   * save Tenant
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addTenant_envID_descriptionWithHttpInfo(String envID, String description) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addTenant_envID_description");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addTenant"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * save Transfer or BudgetTransfer
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param srcId the instrumentId of the source (optional)
   * @param trgId the instrumentId of the target (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public void addTransfer_envID_description_srcId_trgId_value_transactiondate(String envID, String description, Integer srcId, Integer trgId, Double value, String transactiondate) throws ApiException {

    addTransfer_envID_description_srcId_trgId_value_transactiondateWithHttpInfo(envID, description, srcId, trgId, value, transactiondate);
  }

  /**
   * save Transfer or BudgetTransfer
   * 
   * @param envID The Service Environment (required)
   * @param description description (optional)
   * @param srcId the instrumentId of the source (optional)
   * @param trgId the instrumentId of the target (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addTransfer_envID_description_srcId_trgId_value_transactiondateWithHttpInfo(String envID, String description, Integer srcId, Integer trgId, Double value, String transactiondate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling addTransfer_envID_description_srcId_trgId_value_transactiondate");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/addTransfer"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "srcId", srcId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trgId", trgId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactiondate", transactiondate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * bookRecurrentTransactions
   * 
   * @param envID The Service Environment (required)
   * @throws ApiException if fails to make API call
   */
  public void bookRecurrentTransactions_envID(String envID) throws ApiException {

    bookRecurrentTransactions_envIDWithHttpInfo(envID);
  }

  /**
   * bookRecurrentTransactions
   * 
   * @param envID The Service Environment (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> bookRecurrentTransactions_envIDWithHttpInfo(String envID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling bookRecurrentTransactions_envID");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/bookRecurrentTransactions"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * delete Recurrent Transfer
   * 
   * @param envID The Service Environment (required)
   * @param recurrentTransactionId recurrentTransactionId (optional)
   * @throws ApiException if fails to make API call
   */
  public void delRecurrentTransfer_envID_recurrentTransactionId(String envID, Integer recurrentTransactionId) throws ApiException {

    delRecurrentTransfer_envID_recurrentTransactionIdWithHttpInfo(envID, recurrentTransactionId);
  }

  /**
   * delete Recurrent Transfer
   * 
   * @param envID The Service Environment (required)
   * @param recurrentTransactionId recurrentTransactionId (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> delRecurrentTransfer_envID_recurrentTransactionIdWithHttpInfo(String envID, Integer recurrentTransactionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling delRecurrentTransfer_envID_recurrentTransactionId");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/delRecurrentTransfer"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recurrentTransactionId", recurrentTransactionId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * delete Transfer
   * 
   * @param envID The Service Environment (required)
   * @param transactionId transactionId (optional)
   * @throws ApiException if fails to make API call
   */
  public void delTransfer_envID_transactionId(String envID, Integer transactionId) throws ApiException {

    delTransfer_envID_transactionIdWithHttpInfo(envID, transactionId);
  }

  /**
   * delete Transfer
   * 
   * @param envID The Service Environment (required)
   * @param transactionId transactionId (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> delTransfer_envID_transactionIdWithHttpInfo(String envID, Integer transactionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling delTransfer_envID_transactionId");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/delTransfer"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionId", transactionId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * fillpricehistory
   * 
   * @param envID The Service Environment (required)
   * @param sourceId the sourceId (optional)
   * @param isin the isin (optional)
   * @throws ApiException if fails to make API call
   */
  public void fillPricesHistory_envID_sourceId_isin(String envID, Integer sourceId, String isin) throws ApiException {

    fillPricesHistory_envID_sourceId_isinWithHttpInfo(envID, sourceId, isin);
  }

  /**
   * fillpricehistory
   * 
   * @param envID The Service Environment (required)
   * @param sourceId the sourceId (optional)
   * @param isin the isin (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> fillPricesHistory_envID_sourceId_isinWithHttpInfo(String envID, Integer sourceId, String isin) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling fillPricesHistory_envID_sourceId_isin");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/fillpricehistory"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param tenant tenant id (optional)
   * @return InstrumentListModel
   * @throws ApiException if fails to make API call
   */
  public InstrumentListModel getActiveInstrumentForTenantList_envID_tenant(String envID, Integer tenant) throws ApiException {
    return getActiveInstrumentForTenantList_envID_tenantWithHttpInfo(envID, tenant).getData();
      }

  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param tenant tenant id (optional)
   * @return ApiResponse&lt;InstrumentListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InstrumentListModel> getActiveInstrumentForTenantList_envID_tenantWithHttpInfo(String envID, Integer tenant) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getActiveInstrumentForTenantList_envID_tenant");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/activeinstrumentsfortenant"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenant", tenant));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InstrumentListModel> localVarReturnType = new GenericType<InstrumentListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Environments
   * 
   * @return StringListModel
   * @throws ApiException if fails to make API call
   */
  public StringListModel getEnvironmentList() throws ApiException {
    return getEnvironmentListWithHttpInfo().getData();
      }

  /**
   * List Environments
   * 
   * @return ApiResponse&lt;StringListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringListModel> getEnvironmentListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StringListModel> localVarReturnType = new GenericType<StringListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * get Data
   * 
   * @param envID The Service Environment (required)
   * @param budgetGroup budgetGroup id (optional)
   * @return InstrumentModel
   * @throws ApiException if fails to make API call
   */
  public InstrumentModel getIncomeBudget_envID_budgetGroup(String envID, Integer budgetGroup) throws ApiException {
    return getIncomeBudget_envID_budgetGroupWithHttpInfo(envID, budgetGroup).getData();
      }

  /**
   * get Data
   * 
   * @param envID The Service Environment (required)
   * @param budgetGroup budgetGroup id (optional)
   * @return ApiResponse&lt;InstrumentModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InstrumentModel> getIncomeBudget_envID_budgetGroupWithHttpInfo(String envID, Integer budgetGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getIncomeBudget_envID_budgetGroup");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/incomebudgetforbudgetgroup"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "budgetGroup", budgetGroup));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InstrumentModel> localVarReturnType = new GenericType<InstrumentModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param tenant tenant id (optional)
   * @return InstrumentListModel
   * @throws ApiException if fails to make API call
   */
  public InstrumentListModel getInstrumentForTenantList_envID_tenant(String envID, Integer tenant) throws ApiException {
    return getInstrumentForTenantList_envID_tenantWithHttpInfo(envID, tenant).getData();
      }

  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param tenant tenant id (optional)
   * @return ApiResponse&lt;InstrumentListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InstrumentListModel> getInstrumentForTenantList_envID_tenantWithHttpInfo(String envID, Integer tenant) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getInstrumentForTenantList_envID_tenant");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/instrumentsfortenant"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenant", tenant));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InstrumentListModel> localVarReturnType = new GenericType<InstrumentListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @return InstrumentListModel
   * @throws ApiException if fails to make API call
   */
  public InstrumentListModel getInstrumentList_envID(String envID) throws ApiException {
    return getInstrumentList_envIDWithHttpInfo(envID).getData();
      }

  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @return ApiResponse&lt;InstrumentListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InstrumentListModel> getInstrumentList_envIDWithHttpInfo(String envID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getInstrumentList_envID");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/instruments"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InstrumentListModel> localVarReturnType = new GenericType<InstrumentListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param tenant tenant id (optional)
   * @param instrumenttype instrumenttype (optional)
   * @return InstrumentListModel
   * @throws ApiException if fails to make API call
   */
  public InstrumentListModel getInstrumentPerTypeList_envID_tenant_instrumenttype(String envID, Integer tenant, String instrumenttype) throws ApiException {
    return getInstrumentPerTypeList_envID_tenant_instrumenttypeWithHttpInfo(envID, tenant, instrumenttype).getData();
      }

  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param tenant tenant id (optional)
   * @param instrumenttype instrumenttype (optional)
   * @return ApiResponse&lt;InstrumentListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InstrumentListModel> getInstrumentPerTypeList_envID_tenant_instrumenttypeWithHttpInfo(String envID, Integer tenant, String instrumenttype) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getInstrumentPerTypeList_envID_tenant_instrumenttype");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/instrumentspertype"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenant", tenant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "instrumenttype", instrumenttype));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InstrumentListModel> localVarReturnType = new GenericType<InstrumentListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * get Data
   * 
   * @param envID The Service Environment (required)
   * @param isin the isin (optional)
   * @return InstrumentModel
   * @throws ApiException if fails to make API call
   */
  public InstrumentModel getInstrument_envID_isin(String envID, String isin) throws ApiException {
    return getInstrument_envID_isinWithHttpInfo(envID, isin).getData();
      }

  /**
   * get Data
   * 
   * @param envID The Service Environment (required)
   * @param isin the isin (optional)
   * @return ApiResponse&lt;InstrumentModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InstrumentModel> getInstrument_envID_isinWithHttpInfo(String envID, String isin) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getInstrument_envID_isin");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/getequity"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InstrumentModel> localVarReturnType = new GenericType<InstrumentModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @return RecurrentTransactionListModel
   * @throws ApiException if fails to make API call
   */
  public RecurrentTransactionListModel getRecurrentTransactionList_envID(String envID) throws ApiException {
    return getRecurrentTransactionList_envIDWithHttpInfo(envID).getData();
      }

  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @return ApiResponse&lt;RecurrentTransactionListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecurrentTransactionListModel> getRecurrentTransactionList_envIDWithHttpInfo(String envID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getRecurrentTransactionList_envID");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/listRecurrentTransactions"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RecurrentTransactionListModel> localVarReturnType = new GenericType<RecurrentTransactionListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @return InstrumentListModel
   * @throws ApiException if fails to make API call
   */
  public InstrumentListModel getTenantList_envID(String envID) throws ApiException {
    return getTenantList_envIDWithHttpInfo(envID).getData();
      }

  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @return ApiResponse&lt;InstrumentListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InstrumentListModel> getTenantList_envIDWithHttpInfo(String envID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getTenantList_envID");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/listTenants"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InstrumentListModel> localVarReturnType = new GenericType<InstrumentListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param startdate startdate in Format yyyy-mm-dd (optional)
   * @param enddate enddate in Format yyyy-mm-dd (optional)
   * @return TransactionListModel
   * @throws ApiException if fails to make API call
   */
  public TransactionListModel getTransactionList_envID_startdate_enddate(String envID, String startdate, String enddate) throws ApiException {
    return getTransactionList_envID_startdate_enddateWithHttpInfo(envID, startdate, enddate).getData();
      }

  /**
   * List Data
   * 
   * @param envID The Service Environment (required)
   * @param startdate startdate in Format yyyy-mm-dd (optional)
   * @param enddate enddate in Format yyyy-mm-dd (optional)
   * @return ApiResponse&lt;TransactionListModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TransactionListModel> getTransactionList_envID_startdate_enddateWithHttpInfo(String envID, String startdate, String enddate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getTransactionList_envID_startdate_enddate");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/listTransactions"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startdate", startdate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enddate", enddate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TransactionListModel> localVarReturnType = new GenericType<TransactionListModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Map Data
   * 
   * @param instrumentId the instrumentId (required)
   * @param envID The Service Environment (required)
   * @param startdate startdate in Format yyyy-mm-dd (optional)
   * @param enddate enddate in Format yyyy-mm-dd (optional)
   * @return DateDoubleModel
   * @throws ApiException if fails to make API call
   */
  public DateDoubleModel getValueMap_envID_instrumentId_startdate_enddate(Integer instrumentId, String envID, String startdate, String enddate) throws ApiException {
    return getValueMap_envID_instrumentId_startdate_enddateWithHttpInfo(instrumentId, envID, startdate, enddate).getData();
      }

  /**
   * Map Data
   * 
   * @param instrumentId the instrumentId (required)
   * @param envID The Service Environment (required)
   * @param startdate startdate in Format yyyy-mm-dd (optional)
   * @param enddate enddate in Format yyyy-mm-dd (optional)
   * @return ApiResponse&lt;DateDoubleModel&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DateDoubleModel> getValueMap_envID_instrumentId_startdate_enddateWithHttpInfo(Integer instrumentId, String envID, String startdate, String enddate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'instrumentId' is set
    if (instrumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'instrumentId' when calling getValueMap_envID_instrumentId_startdate_enddate");
    }
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling getValueMap_envID_instrumentId_startdate_enddate");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/getvaluecurve/{instrumentId}"
      .replaceAll("\\{" + "instrumentId" + "\\}", apiClient.escapeString(instrumentId.toString()))
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startdate", startdate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enddate", enddate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DateDoubleModel> localVarReturnType = new GenericType<DateDoubleModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * importprices
   * 
   * @param envID The Service Environment (required)
   * @throws ApiException if fails to make API call
   */
  public void importPrices_envID(String envID) throws ApiException {

    importPrices_envIDWithHttpInfo(envID);
  }

  /**
   * importprices
   * 
   * @param envID The Service Environment (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> importPrices_envIDWithHttpInfo(String envID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling importPrices_envID");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/importprices"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * update Instrument
   * 
   * @param envID The Service Environment (required)
   * @param id id (optional)
   * @param description description (optional)
   * @param isactive isactive (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateInstrument_envID_id_description_isactive(String envID, Integer id, String description, Boolean isactive) throws ApiException {

    updateInstrument_envID_id_description_isactiveWithHttpInfo(envID, id, description, isactive);
  }

  /**
   * update Instrument
   * 
   * @param envID The Service Environment (required)
   * @param id id (optional)
   * @param description description (optional)
   * @param isactive isactive (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateInstrument_envID_id_description_isactiveWithHttpInfo(String envID, Integer id, String description, Boolean isactive) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling updateInstrument_envID_id_description_isactive");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/updateInstrument"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isactive", isactive));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * update recurrent Transaction
   * 
   * @param envID The Service Environment (required)
   * @param id id (optional)
   * @param description description (optional)
   * @param value the value of the income or expense (optional)
   * @param nexttransaction the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateRecurrentTransaction_envID_id_description_value_nexttransaction(String envID, Integer id, String description, Double value, String nexttransaction) throws ApiException {

    updateRecurrentTransaction_envID_id_description_value_nexttransactionWithHttpInfo(envID, id, description, value, nexttransaction);
  }

  /**
   * update recurrent Transaction
   * 
   * @param envID The Service Environment (required)
   * @param id id (optional)
   * @param description description (optional)
   * @param value the value of the income or expense (optional)
   * @param nexttransaction the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateRecurrentTransaction_envID_id_description_value_nexttransactionWithHttpInfo(String envID, Integer id, String description, Double value, String nexttransaction) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling updateRecurrentTransaction_envID_id_description_value_nexttransaction");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/updateRecurrentTransaction"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nexttransaction", nexttransaction));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * update Transaction
   * 
   * @param envID The Service Environment (required)
   * @param id id (optional)
   * @param description description (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateTransaction_envID_id_description_value_transactiondate(String envID, Integer id, String description, Double value, String transactiondate) throws ApiException {

    updateTransaction_envID_id_description_value_transactiondateWithHttpInfo(envID, id, description, value, transactiondate);
  }

  /**
   * update Transaction
   * 
   * @param envID The Service Environment (required)
   * @param id id (optional)
   * @param description description (optional)
   * @param value the value of the income or expense (optional)
   * @param transactiondate the transactiondate(yyyy-mm-dd (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateTransaction_envID_id_description_value_transactiondateWithHttpInfo(String envID, Integer id, String description, Double value, String transactiondate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'envID' is set
    if (envID == null) {
      throw new ApiException(400, "Missing the required parameter 'envID' when calling updateTransaction_envID_id_description_value_transactiondate");
    }
    
    // create path and map variables
    String localVarPath = "/myfinance/environments/{envID}/updateTransaction"
      .replaceAll("\\{" + "envID" + "\\}", apiClient.escapeString(envID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactiondate", transactiondate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
