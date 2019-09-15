package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;

public interface DDHandler {
   String getIntentNameToHandle();

   DialogFlowResponse handle(DialogFlowRequest request);
}
