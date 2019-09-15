package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;

public class HandlerHelper {
    public static String getEntity(DialogFlowRequest request, String entityName) {
        return (String) request.getQueryResult().getParameters().getAdditionalProperties().get(entityName);
    }

    static DialogFlowResponse createNewDDResponseForAnswer(String answer) {
        DialogFlowResponse response = new DialogFlowResponse();
        response.setFulfillmentText(answer);
        return response;
    }
}
