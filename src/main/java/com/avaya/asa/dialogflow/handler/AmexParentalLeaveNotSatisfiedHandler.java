package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;

public class AmexParentalLeaveNotSatisfiedHandler implements DDHandler
{

    @Override
    public String getIntentNameToHandle() {
        return "PARENTAL.LEAVE.NOT.SATISFIED";
    }

    @Override
    public DialogFlowResponse handle(DialogFlowRequest request) {
        // TODO need to know how to get the user calling number from fulfillment service so we can send SMS.
        return HandlerHelper.createNewDDResponseForAnswer("Can I help you with something else?");
    }
}
