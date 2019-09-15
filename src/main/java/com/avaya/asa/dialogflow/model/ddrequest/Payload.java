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
@JsonPropertyOrder({"isInSandbox", "surface", "inputs", "user", "conversation", "availableSurfaces"})
public class Payload {
   @JsonProperty("isInSandbox")
   private Boolean isInSandbox;
   @JsonProperty("surface")
   private Surface surface;
   @JsonProperty("inputs")
   private List inputs = null;
   @JsonProperty("user")
   private User user;
   @JsonProperty("conversation")
   private Conversation conversation;
   @JsonProperty("availableSurfaces")
   private List availableSurfaces = null;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("isInSandbox")
   public Boolean getIsInSandbox() {
      return this.isInSandbox;
   }

   @JsonProperty("isInSandbox")
   public void setIsInSandbox(Boolean isInSandbox) {
      this.isInSandbox = isInSandbox;
   }

   @JsonProperty("surface")
   public Surface getSurface() {
      return this.surface;
   }

   @JsonProperty("surface")
   public void setSurface(Surface surface) {
      this.surface = surface;
   }

   @JsonProperty("inputs")
   public List getInputs() {
      return this.inputs;
   }

   @JsonProperty("inputs")
   public void setInputs(List inputs) {
      this.inputs = inputs;
   }

   @JsonProperty("user")
   public User getUser() {
      return this.user;
   }

   @JsonProperty("user")
   public void setUser(User user) {
      this.user = user;
   }

   @JsonProperty("conversation")
   public Conversation getConversation() {
      return this.conversation;
   }

   @JsonProperty("conversation")
   public void setConversation(Conversation conversation) {
      this.conversation = conversation;
   }

   @JsonProperty("availableSurfaces")
   public List getAvailableSurfaces() {
      return this.availableSurfaces;
   }

   @JsonProperty("availableSurfaces")
   public void setAvailableSurfaces(List availableSurfaces) {
      this.availableSurfaces = availableSurfaces;
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
