Feature: Test whether user can login and navigate through the Swag Labs site

  Scenario: Need to navigate to the SwagLabs site with correct Credentials
    Given As a user I need to open the Swaglab login page
    When User enters correct Username
    And User enters correct Password
    And User clicks the LoginButton
    Then User need to navigate to the Product home page
    And User need to add item two items to cart
    When User clicks the cartIcon
    Then User need to navigate to the Product Cart page
    And User clicks checkout button
    Then User should see the checkout overview page
    And User enters firstName
    And User enters lastname
    And User enters zipCode
    And User enters ContinueButton
    And User clicks finishedVButton
    Then User should see the checkout complete Page

