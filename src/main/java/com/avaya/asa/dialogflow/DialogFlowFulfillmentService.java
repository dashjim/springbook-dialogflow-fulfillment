package com.avaya.asa.dialogflow;

import com.avaya.asa.dialogflow.handler.DDHandler;
import com.avaya.asa.dialogflow.handler.DialogFlowHandlerReactor;
import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DialogFlowFulfillmentService {
   private static final Logger log = LoggerFactory.getLogger(DialogFlowFulfillmentService.class);
   private DialogFlowHandlerReactor register;

   @Autowired
   public DialogFlowFulfillmentService(DialogFlowHandlerReactor register) {
      this.register = register;
   }

   public DialogFlowResponse handleRequest(DialogFlowRequest request) {
      log.debug(String.format(">>>> request is: %s", JsonUtils.toJson(request)));
      String intentName = request.getQueryResult().getIntent().getDisplayName();
      DDHandler handler = this.register.getHandlerByIntentName(intentName);
      if (handler == null) {
         log.warn(String.format("not find register handler for intent %s", intentName));
         return null;
      } else {
         DialogFlowResponse response = handler.handle(request);
         log.debug(String.format("<<<< response is: %s", JsonUtils.toJson(response)));
         return response;
      }
   }
}
