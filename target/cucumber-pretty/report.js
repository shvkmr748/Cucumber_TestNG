$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login page validation",
  "description": "",
  "id": "login-page-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login page validation",
  "description": "",
  "id": "login-page-validation;login-page-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Provide User name",
  "keyword": "And "
});
formatter.match({
  "location": "Login_page_validation.open_the_url()"
});
formatter.result({
  "duration": 18432392971,
  "status": "passed"
});
formatter.match({
  "location": "Login_page_validation.provide_User_name()"
});
formatter.result({
  "duration": 1190566721,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "cheeck box validation",
  "description": "",
  "id": "login-page-validation;cheeck-box-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Open the url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Provide User name",
  "keyword": "And "
});
formatter.match({
  "location": "Login_page_validation.open_the_url()"
});
formatter.result({
  "duration": 14020646581,
  "status": "passed"
});
formatter.match({
  "location": "Login_page_validation.provide_User_name()"
});
formatter.result({
  "duration": 1281749154,
  "status": "passed"
});
});