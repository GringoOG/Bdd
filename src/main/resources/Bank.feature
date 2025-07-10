Feature: Bank

  Scenario: Bank account balance
    Given Bank account with 1000 Kc
    Then A user account balanc is 1000 kc


  Scenario: Bank account transfer
    Given Bank account with 500 Kc
    When A user withdraw 250 kc
    And A user transfer 1250 kc to this account
    Then A user account balanc is 1500 kc
    
