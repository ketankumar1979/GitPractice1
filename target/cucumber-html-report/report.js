$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage functionality",
  "description": "",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 56232860200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for individual product",
  "description": "",
  "id": "homepage-functionality;search-for-individual-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the home page to search for the product",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user type \u0027nike\u0027 to search for product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should able to see all the nike products",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_ProductSearchSteps.user_is_on_the_home_page_to_search_for_the_product()"
});
formatter.result({
  "duration": 25498774300,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_ProductSearchSteps.user_type_nike_to_search_for_product()"
});
formatter.result({
  "duration": 56616042000,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_ProductSearchSteps.user_should_able_to_see_all_the_nike_products()"
});
formatter.result({
  "duration": 5406795400,
  "status": "passed"
});
formatter.after({
  "duration": 59200,
  "status": "passed"
});
});