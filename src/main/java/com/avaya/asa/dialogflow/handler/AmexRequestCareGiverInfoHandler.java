package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmexRequestCareGiverInfoHandler implements DDHandler {

    private static final Logger log = LoggerFactory.getLogger(AmexRequestCareGiverInfoHandler.class);

    public static final String REQUEST_CARE_GIVER_INFO = "REQUEST CARE GIVER INFO";


    public String getIntentNameToHandle() {
        return "REQUEST CARE GIVER INFO";
    }

    public DialogFlowResponse handle(DialogFlowRequest request) {
        String caregiver = HandlerHelper.getEntity(request, "CAREGIVER");
        log.info(String.format("carevier entity is: %s", caregiver));
        return HandlerHelper.createNewDDResponseForAnswer("As the primary care giver, you can take 14 weeks of paid leave, " +
                "secondary care givers can obtain up to 4 weeks of paid leave. Approved parental paid leave may be taken " +
                "on a consecutive or intermittent basis following the birth, adoption or placement of a child with the employee. " +
                "Do you have all the information necessary to apply for paid leave as the primary care giver?");
    }
}
