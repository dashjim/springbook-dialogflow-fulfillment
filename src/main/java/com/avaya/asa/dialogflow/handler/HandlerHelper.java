package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddrequest.OutputContext;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class HandlerHelper {

    public static String getDirectEntity(DialogFlowRequest request, String entityName) {
        return (String) request.getQueryResult().getParameters().getAdditionalProperties().get(entityName);
    }


    public static String getEntityFromContext(DialogFlowRequest request, String ctxName, String entityName) {
        final List<OutputContext> outputContexts = request.getQueryResult().getOutputContexts();

        AtomicReference<String> entityValue = new AtomicReference<>();
        outputContexts.forEach(ctx -> {
            if (ctx.getName().contains(ctxName)) {
                entityValue.set(String.valueOf(ctx.getParameters().getAdditionalProperties().get(entityName)));
            }});

        return entityValue.get();
    }

    static DialogFlowResponse createNewDDResponseForAnswer(String answer) {
        DialogFlowResponse response = new DialogFlowResponse();
        response.setFulfillmentText(answer);
        return response;
    }
}
