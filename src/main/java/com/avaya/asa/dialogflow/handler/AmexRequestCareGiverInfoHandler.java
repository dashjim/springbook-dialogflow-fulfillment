package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;

public class AmexRequestCareGiverInfoHandler implements DDHandler {
    public static final String REQUEST_CARE_GIVER_INFO = "REQUEST CARE GIVER INFO";

    public String getIntentNameToHandle() {
        return "REQUEST CARE GIVER INFO";
    }

    public DialogFlowResponse handle(DialogFlowRequest request) {
        String caregiver = HandlerHelper.getEntity(request, "CAREGIVER");
        return caregiver.equalsIgnoreCase("primary") ? HandlerHelper.createNewDDResponseForAnswer("As the primary care giver, you can take 14 weeks of paid leave, secondary care givers can obtain up to 4 weeks of paid leave. Approved parental paid leave may be taken on a consecutive or intermittent basis following the birth, adoption or placement of a child with the employee. Do you have all the information necessary to apply for paid leave as the primary care giver?") : HandlerHelper.createNewDDResponseForAnswer("I have sent you a link, which will provide you with all the details required for the submittal of a primary or secondary paid leave request.\" (Pause)...In addition, in this link you will find training videos about the paid parental leave policy. Can I help you with something else?");
    }
}
