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
@JsonPropertyOrder({"textToSpeech"})
public class SimpleResponse {
   @JsonProperty("textToSpeech")
   private String textToSpeech;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("textToSpeech")
   public String getTextToSpeech() {
      return this.textToSpeech;
   }

   @JsonProperty("textToSpeech")
   public void setTextToSpeech(String textToSpeech) {
      this.textToSpeech = textToSpeech;
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
