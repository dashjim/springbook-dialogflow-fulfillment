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
@JsonPropertyOrder({"google", "facebook", "slack"})
public class Payload {
   @JsonProperty("google")
   private Google google;
   @JsonProperty("facebook")
   private Facebook facebook;
   @JsonProperty("slack")
   private Slack slack;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("google")
   public Google getGoogle() {
      return this.google;
   }

   @JsonProperty("google")
   public void setGoogle(Google google) {
      this.google = google;
   }

   @JsonProperty("facebook")
   public Facebook getFacebook() {
      return this.facebook;
   }

   @JsonProperty("facebook")
   public void setFacebook(Facebook facebook) {
      this.facebook = facebook;
   }

   @JsonProperty("slack")
   public Slack getSlack() {
      return this.slack;
   }

   @JsonProperty("slack")
   public void setSlack(Slack slack) {
      this.slack = slack;
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
