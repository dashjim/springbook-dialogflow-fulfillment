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
@JsonPropertyOrder({"expectUserResponse", "richResponse"})
public class Google {
   @JsonProperty("expectUserResponse")
   private Boolean expectUserResponse;
   @JsonProperty("richResponse")
   private RichResponse richResponse;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("expectUserResponse")
   public Boolean getExpectUserResponse() {
      return this.expectUserResponse;
   }

   @JsonProperty("expectUserResponse")
   public void setExpectUserResponse(Boolean expectUserResponse) {
      this.expectUserResponse = expectUserResponse;
   }

   @JsonProperty("richResponse")
   public RichResponse getRichResponse() {
      return this.richResponse;
   }

   @JsonProperty("richResponse")
   public void setRichResponse(RichResponse richResponse) {
      this.richResponse = richResponse;
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
