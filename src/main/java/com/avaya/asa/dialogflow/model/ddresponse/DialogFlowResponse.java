package com.avaya.asa.dialogflow.model.ddresponse;

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
@JsonPropertyOrder({"fulfillmentText", "fulfillmentMessages", "source", "payload", "outputContexts", "followupEventInput"})
public class DialogFlowResponse {
   @JsonProperty("fulfillmentText")
   private String fulfillmentText;
   @JsonProperty("fulfillmentMessages")
   private List fulfillmentMessages = null;
   @JsonProperty("source")
   private String source;
   @JsonProperty("payload")
   private Payload payload;
   @JsonProperty("outputContexts")
   private List outputContexts = null;
   @JsonProperty("followupEventInput")
   private FollowupEventInput followupEventInput;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("fulfillmentText")
   public String getFulfillmentText() {
      return this.fulfillmentText;
   }

   @JsonProperty("fulfillmentText")
   public void setFulfillmentText(String fulfillmentText) {
      this.fulfillmentText = fulfillmentText;
   }

   @JsonProperty("fulfillmentMessages")
   public List getFulfillmentMessages() {
      return this.fulfillmentMessages;
   }

   @JsonProperty("fulfillmentMessages")
   public void setFulfillmentMessages(List fulfillmentMessages) {
      this.fulfillmentMessages = fulfillmentMessages;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("payload")
   public Payload getPayload() {
      return this.payload;
   }

   @JsonProperty("payload")
   public void setPayload(Payload payload) {
      this.payload = payload;
   }

   @JsonProperty("outputContexts")
   public List getOutputContexts() {
      return this.outputContexts;
   }

   @JsonProperty("outputContexts")
   public void setOutputContexts(List outputContexts) {
      this.outputContexts = outputContexts;
   }

   @JsonProperty("followupEventInput")
   public FollowupEventInput getFollowupEventInput() {
      return this.followupEventInput;
   }

   @JsonProperty("followupEventInput")
   public void setFollowupEventInput(FollowupEventInput followupEventInput) {
      this.followupEventInput = followupEventInput;
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
