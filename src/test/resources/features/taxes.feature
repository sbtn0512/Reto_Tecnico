Feature: As a user I want to check the value of the tax to check that they are calculated correctly
  Scenario: calculation of purchase taxes
    Given he entered products in the shopping cart
    When he checks the purchase
    Then he will see on the screen the value of the taxes
