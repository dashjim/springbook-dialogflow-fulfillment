package com.avaya.asa.dialogflow.handler;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DialogFlowHandlerReactor {
    private static final Logger log = LoggerFactory.getLogger(DialogFlowHandlerReactor.class);
    private static HashMap handlers = new HashMap();

    public DialogFlowHandlerReactor() {
        this.addHandler(new AmexRequestCareGiverInfoHandler());
        this.addHandler(new AmexParentalLeaveNotSatisfiedHandler());
    }

    private void addHandler(DDHandler newHandler) {
        log.info(String.format("register handler for - %s", newHandler.getIntentNameToHandle()));
        handlers.put(newHandler.getIntentNameToHandle(), newHandler);
    }

    public DDHandler getHandlerByIntentName(String IntentName) {
        return (DDHandler) handlers.get(IntentName);
    }
}
