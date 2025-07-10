Feature:Checkout

  #REQ-001 (cislo requirementu)
  Scenario: Checkout banana
    Given the price of "banana" is 45c
    When A user check out "banana" 2
    Then the total price should be 90c



