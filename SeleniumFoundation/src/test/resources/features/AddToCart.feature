Feature: Validate add to cart functionality

  Scenario: Verify user can add an item to cart
    Given user opens the website
    And click shop now button
    When user click first element
    Then verify user is on item detail page
    And select size and click add to cart button
    Then verify item is added to the cart