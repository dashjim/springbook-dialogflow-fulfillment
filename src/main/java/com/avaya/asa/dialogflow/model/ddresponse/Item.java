package com.avaya.asa.dialogflow.model.ddresponse;

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
@JsonPropertyOrder({"simpleResponse"})
public class Item {
   @JsonProperty("simpleResponse")
   private SimpleResponse simpleResponse;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("simpleResponse")
   public SimpleResponse getSimpleResponse() {
      return this.simpleResponse;
   }

   @JsonProperty("simpleResponse")
   public void setSimpleResponse(SimpleResponse simpleResponse) {
      this.simpleResponse = simpleResponse;
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
