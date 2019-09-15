package com.avaya.asa.dialogflow.model.ddrequest;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"languageCode", "queryText", "fulfillmentText", "action", "allRequiredParamsPresent", "parameters", "outputContexts", "intent", "fulfillmentMessages", "intentDetectionConfidence", "diagnosticInfo"})
public class QueryResult {
   @JsonProperty("languageCode")
   private String languageCode;
   @JsonProperty("queryText")
   private String queryText;
   @JsonProperty("fulfillmentText")
   private String fulfillmentText;
   @JsonProperty("action")
   private String action;
   @JsonProperty("allRequiredParamsPresent")
   private Boolean allRequiredParamsPresent;
   @JsonProperty("parameters")
   private Parameters parameters;
   @JsonProperty("outputContexts")
   private List<OutputContext> outputContexts = null;
   @JsonProperty("intent")
   private Intent intent;
   @JsonProperty("fulfillmentMessages")
   private List fulfillmentMessages = null;
   @JsonProperty("intentDetectionConfidence")
   private Integer intentDetectionConfidence;
   @JsonProperty("diagnosticInfo")
   private DiagnosticInfo diagnosticInfo;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("languageCode")
   public String getLanguageCode() {
      return this.languageCode;
   }

   @JsonProperty("languageCode")
   public void setLanguageCode(String languageCode) {
      this.languageCode = languageCode;
   }

   @JsonProperty("queryText")
   public String getQueryText() {
      return this.queryText;
   }

   @JsonProperty("queryText")
   public void setQueryText(String queryText) {
      this.queryText = queryText;
   }

   @JsonProperty("fulfillmentText")
   public String getFulfillmentText() {
      return this.fulfillmentText;
   }

   @JsonProperty("fulfillmentText")
   public void setFulfillmentText(String fulfillmentText) {
      this.fulfillmentText = fulfillmentText;
   }

   @JsonProperty("action")
   public String getAction() {
      return this.action;
   }

   @JsonProperty("action")
   public void setAction(String action) {
      this.action = action;
   }

   @JsonProperty("allRequiredParamsPresent")
   public Boolean getAllRequiredParamsPresent() {
      return this.allRequiredParamsPresent;
   }

   @JsonProperty("allRequiredParamsPresent")
   public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
      this.allRequiredParamsPresent = allRequiredParamsPresent;
   }

   @JsonProperty("parameters")
   public Parameters getParameters() {
      return this.parameters;
   }

   @JsonProperty("parameters")
   public void setParameters(Parameters parameters) {
      this.parameters = parameters;
   }

   @JsonProperty("outputContexts")
   public List<OutputContext> getOutputContexts() {
      return this.outputContexts;
   }

   @JsonProperty("outputContexts")
   public void setOutputContexts(List<OutputContext> outputContexts) {
      this.outputContexts = outputContexts;
   }

   @JsonProperty("intent")
   public Intent getIntent() {
      return this.intent;
   }

   @JsonProperty("intent")
   public void setIntent(Intent intent) {
      this.intent = intent;
   }

   @JsonProperty("fulfillmentMessages")
   public List getFulfillmentMessages() {
      return this.fulfillmentMessages;
   }

   @JsonProperty("fulfillmentMessages")
   public void setFulfillmentMessages(List fulfillmentMessages) {
      this.fulfillmentMessages = fulfillmentMessages;
   }

   @JsonProperty("intentDetectionConfidence")
   public Integer getIntentDetectionConfidence() {
      return this.intentDetectionConfidence;
   }

   @JsonProperty("intentDetectionConfidence")
   public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
      this.intentDetectionConfidence = intentDetectionConfidence;
   }

   @JsonProperty("diagnosticInfo")
   public DiagnosticInfo getDiagnosticInfo() {
      return this.diagnosticInfo;
   }

   @JsonProperty("diagnosticInfo")
   public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
      this.diagnosticInfo = diagnosticInfo;
   }

   @JsonAnyGetter
   public Map getAdditionalProperties() {
      return this.additionalProperties;
   }

   @JsonAnySetter
   public void setAdditionalProperty(String name, Object value) {
      this.additionalProperties.put(name, value);
   }
}
