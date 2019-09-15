package com.avaya.asa.dialogflow.handler;

import com.avaya.asa.dialogflow.model.ddrequest.DialogFlowRequest;
import com.avaya.asa.dialogflow.model.ddresponse.DialogFlowResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmexParentalLeavePollResult implements DDHandler {

    private static Logger log = LoggerFactory.getLogger(AmexParentalLeavePollResult.class);

    @Override
    public String getIntentNameToHandle() {
        return "start-poll-satisfaction-extent-overall";
    }

    @Override
    public DialogFlowResponse handle(DialogFlowRequest request) {
        final String satisfactionOverall = HandlerHelper.getEntityFromContext(request,
                "poll-satisfaction-extent-overall","number");
        final String satisfactionInteraction = HandlerHelper.getEntityFromContext(request, "poll-result", "number");

        log.info(String.format("the interaction satisfaction is %s, and the overall satisfaction is %s.",
                satisfactionInteraction, satisfactionOverall));

        return null;
    }

/*
sample request -
{
   "responseId":"f568814a-7839-4ddc-9038-72cb8a0fc50e-ad9426ce",
   "session":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88",
   "queryResult":{
      "languageCode":"en",
      "queryText":"5",
      "fulfillmentText":"Thank you for your rating! Bye.",
      "action":"PARENTALLEAVENOTSATISFIED.PARENTALLEAVENOTSATISFIED-custom.PARENTALLEAVENOTSATISFIED-nomoreinfoneeded-start-poll-custom.start-poll-yes-custom.start-poll-staisfaction-extent-custom",
      "allRequiredParamsPresent":true,
      "parameters":{
         "number":5.0
      },
      "outputContexts":[
         {
            "name":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88/contexts/poll-satisfaction-extent-overall",
            "lifespanCount":5,
            "parameters":{
               "number":5.0,
               "number.original":"5"
            }
         },
         {
            "name":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88/contexts/poll-result",
            "lifespanCount":3,
            "parameters":{
               "poll-is-satisfied":"satisfied",
               "poll-is-satisfied.original":"satisfied",
               "number":5.0,
               "number.original":"5"
            }
         },
         {
            "name":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88/contexts/request-paid-leave-info",
            "parameters":{
               "Parental-leave-reason":"Parental Leave",
               "Parental-leave-reason.original":"parental leave",
               "CAREGIVER":"primary care giver",
               "CAREGIVER.original":"primary care giver",
               "poll-is-satisfied":"satisfied",
               "poll-is-satisfied.original":"satisfied",
               "number":5.0,
               "number.original":"5"
            }
         },
         {
            "name":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88/contexts/poll-satisfaction-extent",
            "lifespanCount":4,
            "parameters":{
               "number":5.0,
               "number.original":"5"
            }
         },
         {
            "name":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88/contexts/parental-leave-not-satisfied",
            "lifespanCount":1,
            "parameters":{
               "Parental-leave-reason":"Parental Leave",
               "Parental-leave-reason.original":"parental leave",
               "CAREGIVER":"primary care giver",
               "CAREGIVER.original":"primary care giver",
               "poll-is-satisfied":"satisfied",
               "poll-is-satisfied.original":"satisfied",
               "number":5.0,
               "number.original":"5"
            }
         },
         {
            "name":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88/contexts/start-poll-yes-followup",
            "parameters":{
               "poll-is-satisfied":"satisfied",
               "poll-is-satisfied.original":"satisfied",
               "number":5.0,
               "number.original":"5"
            }
         },
         {
            "name":"projects/amex-uc1-cyiaix/agent/sessions/80b5a7a9-66cb-a3e0-75bb-6a4408876f88/contexts/start-poll-staisfaction-extent-followup",
            "lifespanCount":1,
            "parameters":{
               "number":5.0,
               "number.original":"5"
            }
         }
      ],
      "intent":{
         "name":"projects/amex-uc1-cyiaix/agent/intents/45aab8b8-64bf-4a8f-8229-1e2cc3c9da20",
         "displayName":"start-poll-satisfaction-extent-overall",
         "endInteraction":true
      },
      "fulfillmentMessages":[
         {
            "text":{
               "text":[
                  "Thank you for your rating! Bye."
               ]
            }
         }
      ],
      "intentDetectionConfidence":0
   },
   "originalDetectIntentRequest":{
      "payload":{

      }
   }
}
 */

}
