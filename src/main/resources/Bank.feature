Feature: Bank

  Scenario: Bank account balance
    Given Bank account with 1000 Kc
    Then A user account balanc is 1000 kc


  Scenario Outline: Bank account transfer
    Given Bank account with <initialBalance> Kc
    When A user withdraw <withdrawAmount> kc
    And A user transfer <transferAmount> kc to this account
    Then A user account balanc is <expectedBalance> kc

  Examples:
    | initialBalance | withdrawAmount | transferAmount | expectedBalance |
    | 500            | 250            | 1250           |  1500           |
    | 1000           | 500            | 1000           |  1500           |
    | 5000           | 6000           | 500            |  -500           |
    | -5000          | 0              | 6000           |  1000           |



  Scenario: Bank account balance
    Given Bank account with 1000 Kc
    Then A user account balanc is 1000 kc

# stejna situace, prohozene kroky - nejprve transfer, pak withdraw
  Scenario Outline: Bank account transfer - 2
    Given Bank account with <initialBalance> Kc
    When A user transfer <transferAmount> kc to this account
    And A user withdraw <withdrawAmount> kc
    Then A user account balanc is <expectedBalance> kc

    Examples:
      | initialBalance | withdrawAmount | transferAmount | expectedBalance |
      | 500            | 250            | 1250           |  1500           |
      | 1000           | 500            | 1000           |  1500           |
      | 5000           | 6000           | 1500           |  500            |
      | -5000          | 0              | 6000           |  1000           |


    Scenario: Multiple bank account transfer
      Given Bank account with 1000 Kc
      And another bank account with 2000 Kc
      When A user transfer from first bank acount to second one 500 kc
      Then A user account balanc is 500 kc
      And A user second account balce is 2500 kc

