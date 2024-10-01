Feature: List the Iphone prices of flipkart.com

 Scenario: Search for iphone and print prices
    Given Initial setUp to navigate flipkart.com
    When  User search for "iphone"
    Then User should see the list of iphone prices
    And User should see the list of iphone models