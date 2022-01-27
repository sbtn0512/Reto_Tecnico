Feature: As a user I want to complete a purchase to validate that it is made correctly

  Scenario: Buying multiple items in the shopping cart
    Given he checked out the cart
    When he completes the purchase
    Then he will see on the screen the message THANK YOU FOR YOUR ORDER