package com.avaya.asa.dialogflow.model.ddrequest;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"responseId", "session", "queryResult", "originalDetectIntentRequest"})
public class DialogFlowRequest {
   @JsonProperty("responseId")
   private String responseId;
   @JsonProperty("session")
   private String session;
   @JsonProperty("queryResult")
   private QueryResult queryResult;
   @JsonProperty("originalDetectIntentRequest")
   private OriginalDetectIntentRequest originalDetectIntentRequest;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("responseId")
   public String getResponseId() {
      return this.responseId;
   }

   @JsonProperty("responseId")
   public void setResponseId(String responseId) {
      this.responseId = responseId;
   }

   @JsonProperty("session")
   public String getSession() {
      return this.session;
   }

   @JsonProperty("session")
   public void setSession(String session) {
      this.session = session;
   }

   @JsonProperty("queryResult")
   public QueryResult getQueryResult() {
      return this.queryResult;
   }

   @JsonProperty("queryResult")
   public void setQueryResult(QueryResult queryResult) {
      this.queryResult = queryResult;
   }

   @JsonProperty("originalDetectIntentRequest")
   public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
      return this.originalDetectIntentRequest;
   }

   @JsonProperty("originalDetectIntentRequest")
   public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
      this.originalDetectIntentRequest = originalDetectIntentRequest;
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
