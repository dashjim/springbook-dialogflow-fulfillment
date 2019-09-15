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
@JsonPropertyOrder({"text", "postback"})
public class Button {
   @JsonProperty("text")
   private String text;
   @JsonProperty("postback")
   private String postback;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("text")
   public String getText() {
      return this.text;
   }

   @JsonProperty("text")
   public void setText(String text) {
      this.text = text;
   }

   @JsonProperty("postback")
   public String getPostback() {
      return this.postback;
   }

   @JsonProperty("postback")
   public void setPostback(String postback) {
      this.postback = postback;
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
