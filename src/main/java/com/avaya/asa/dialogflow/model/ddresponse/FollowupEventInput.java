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
@JsonPropertyOrder({"name", "languageCode", "parameters"})
public class FollowupEventInput {
   @JsonProperty("name")
   private String name;
   @JsonProperty("languageCode")
   private String languageCode;
   @JsonProperty("parameters")
   private Parameters_ parameters;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("languageCode")
   public String getLanguageCode() {
      return this.languageCode;
   }

   @JsonProperty("languageCode")
   public void setLanguageCode(String languageCode) {
      this.languageCode = languageCode;
   }

   @JsonProperty("parameters")
   public Parameters_ getParameters() {
      return this.parameters;
   }

   @JsonProperty("parameters")
   public void setParameters(Parameters_ parameters) {
      this.parameters = parameters;
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
