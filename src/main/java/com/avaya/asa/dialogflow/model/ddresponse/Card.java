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
@JsonPropertyOrder({"title", "subtitle", "imageUri", "buttons"})
public class Card {
   @JsonProperty("title")
   private String title;
   @JsonProperty("subtitle")
   private String subtitle;
   @JsonProperty("imageUri")
   private String imageUri;
   @JsonProperty("buttons")
   private List buttons = null;
   @JsonIgnore
   private Map additionalProperties = new HashMap();

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("subtitle")
   public String getSubtitle() {
      return this.subtitle;
   }

   @JsonProperty("subtitle")
   public void setSubtitle(String subtitle) {
      this.subtitle = subtitle;
   }

   @JsonProperty("imageUri")
   public String getImageUri() {
      return this.imageUri;
   }

   @JsonProperty("imageUri")
   public void setImageUri(String imageUri) {
      this.imageUri = imageUri;
   }

   @JsonProperty("buttons")
   public List getButtons() {
      return this.buttons;
   }

   @JsonProperty("buttons")
   public void setButtons(List buttons) {
      this.buttons = buttons;
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
