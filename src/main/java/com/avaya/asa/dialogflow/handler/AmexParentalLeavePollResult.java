package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;

public class AmexParentalLeavePollResult implements DDHandler {
    @Override
    public String getIntentNameToHandle() {
        return "start-poll-satisfaction-extent-overall";
    }

    @Override
    public DialogFlowResponse handle(DialogFlowRequest request) {
        return null;
    }
}
