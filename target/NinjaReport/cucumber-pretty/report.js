$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/testData/Ui_aboutYourWork_field_validation.feature");
formatter.feature({
  "name": "Verify all fields on Reg 2",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validating all fields on about your work page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@jani"
    }
  ]
});
formatter.step({
  "name": "user navigates to CreditNinja and use credentials \"James\" \"Bond\" \"zhanuzak+454@creditninja.com\" \"3123121234\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigates to CreditNinja loan application about your work and verify url and tite of it",
  "keyword": "And "
});
formatter.step({
  "name": "user sends information \"\u003cMonth\u003e\" \"\u003cDay\u003e\" \"\u003cYear\u003e\" \"\u003chomeAddress\u003e\" \"\u003ccity\u003e\" \"\u003cstate\u003e\" \"\u003czip\u003e\" \"\u003crentOwn\u003e\" \"\u003cssn\u003e\" \"\u003cssnConfirmation\u003e\" \"\u003cactiveDuty\u003e\" \"\u003cincomeType\u003e\" \"\u003cincome\u003e\" \"\u003clastPay\u003e\" \"\u003cnextPay\u003e\" \"\u003cafterNextPay\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks continue and validates missing fields",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Month",
        "Day",
        "Year",
        "homeAddress",
        "city",
        "state",
        "zip",
        "rentOwn",
        "ssn",
        "ssnConfirmation",
        "activeDuty",
        "incomeType",
        "income",
        "lastPay",
        "nextPay",
        "afterNextPay"
      ]
    },
    {
      "cells": [
        "September",
        "2",
        "1990",
        "222 S Riverside",
        "Chicago",
        "Illinois",
        "60610",
        "checked",
        "414-54-1405",
        "414-54-1405",
        "yes",
        "choose",
        "2000",
        "choose",
        "choose",
        "choose"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating all fields on about your work page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@jani"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to CreditNinja and use credentials \"James\" \"Bond\" \"zhanuzak+454@creditninja.com\" \"3123121234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Ui_aboutYourWork_field_validation_stepDef.user_navigates_to_CreditNinja_and_use_credentials(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to CreditNinja loan application about your work and verify url and tite of it",
  "keyword": "And "
});
formatter.match({
  "location": "Ui_aboutYourWork_field_validation_stepDef.user_navigates_to_CreditNinja_loan_application_about_your_work_and_verify_url_and_tite_of_it()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [https://dev.creditninja.com/loan_application/about_your_work] but found [https://qa.creditninja.com/loan_application/about_your_work]\n\tat org.testng.Assert.fail(Assert.java:96)\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\n\tat org.testng.Assert.assertEquals(Assert.java:118)\n\tat org.testng.Assert.assertEquals(Assert.java:453)\n\tat org.testng.Assert.assertEquals(Assert.java:463)\n\tat pages.HomePage.urlTitleVerify(HomePage.java:113)\n\tat step_definitions.ui.Ui_aboutYourWork_field_validation_stepDef.user_navigates_to_CreditNinja_loan_application_about_your_work_and_verify_url_and_tite_of_it(Ui_aboutYourWork_field_validation_stepDef.java:32)\n\tat ✽.user navigates to CreditNinja loan application about your work and verify url and tite of it(src/test/resources/testData/Ui_aboutYourWork_field_validation.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "user sends information \"September\" \"2\" \"1990\" \"222 S Riverside\" \"Chicago\" \"Illinois\" \"60610\" \"checked\" \"414-54-1405\" \"414-54-1405\" \"yes\" \"choose\" \"2000\" \"choose\" \"choose\" \"choose\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Ui_aboutYourWork_field_validation_stepDef.user_sends_information(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks continue and validates missing fields",
  "keyword": "And "
});
formatter.match({
  "location": "Ui_aboutYourWork_field_validation_stepDef.user_clicks_continue_and_validates_missing_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});