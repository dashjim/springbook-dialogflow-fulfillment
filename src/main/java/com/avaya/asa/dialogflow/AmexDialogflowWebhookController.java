package com.avaya.asa.dialogflow;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmexDialogflowWebhookController {
    Logger logger = LoggerFactory.getLogger(AmexDialogflowWebhookController.class);
    private DialogFlowFulfillmentService ddService;

    @Autowired
    public AmexDialogflowWebhookController(DialogFlowFulfillmentService ddService) {
        this.ddService = ddService;
    }

    @PostMapping({"/webhook"})
    public DialogFlowResponse webhook(@RequestBody DialogFlowRequest request) {
        return this.ddService.handleRequest(request);
    }
}
