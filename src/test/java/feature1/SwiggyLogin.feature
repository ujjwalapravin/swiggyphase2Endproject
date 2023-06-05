Feature: Ordering Food on Swiggy

  Scenario: User select item and add to cart
    Given I am on the home screen
    When I click on location
    And I click on search
    And I search for "Burger" in the search bar
    And I choose a Burger from the restaurant menu
    And I add the burger to my cart
    And I click on add to item
    And I click on cart

  Scenario: User cancle the selected item form cart
    Given I am on the home screen
    When I click on location
    And I click on search
    And I search for "Burger" in the search bar
    And I choose a Burger from the restaurant menu
    And I add the burger to my cart
    And I click on add to item
    And I click on cart
