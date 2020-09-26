Feature: Homepage functionality

  @Smoke
  Scenario: Search for individual product
    Given user is on the home page to search for the product
    When user type 'nike' to search for product
    Then user should able to see all the nike products