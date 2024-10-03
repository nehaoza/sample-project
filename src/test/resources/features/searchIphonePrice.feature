Feature: List the Iphone prices and models of flipkart.com

 Scenario: Search for iphone and print prices
    Given User navigate to flipkart.com
    When  User search for "iphone"
    Then User should see the list of iphone prices
    And User should see the list of iphone models