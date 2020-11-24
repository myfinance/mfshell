
# RecurrentTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recurrenttransactionid** | **Integer** |  | 
**instrumentByInstrumentid2** | [**Instrument**](Instrument.md) |  | 
**instrumentBySecurityid** | [**Instrument**](Instrument.md) |  | 
**instrumentByInstrumentid1** | [**Instrument**](Instrument.md) |  | 
**recurrencytype** | **Integer** |  | 
**description** | **String** |  | 
**value** | **Double** |  | 
**nexttransaction** | [**LocalDate**](LocalDate.md) |  | 
**recurrentfrequenceId** | **Integer** |  | 
**recurrentfrequence** | [**RecurrentfrequenceEnum**](#RecurrentfrequenceEnum) |  | 


<a name="RecurrentfrequenceEnum"></a>
## Enum: RecurrentfrequenceEnum
Name | Value
---- | -----
MONTHLY | &quot;Monthly&quot;
QUATERLY | &quot;Quaterly&quot;
YEARLY | &quot;Yearly&quot;
UNKNOWN | &quot;UNKNOWN&quot;



