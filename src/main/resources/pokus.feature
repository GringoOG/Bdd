Feature: pokus

  #toto je komentar

  Scenario: Pokusny test 1
    Given nastaveni pocatecnich podminek
    And dalsi nastavovaci krok
    When toto je nejaka akce
    And toto je dalsi akce
    Then overeni vysledku
    And dalsi overeni vysledku


  Scenario: Pokusny test 2
    Given nastaveni pocatecnich podminek
    When toto je dalsi akce
    Then dalsi overeni vysledku



  Scenario: Kalkulacka - soucet dvou cisel
    Given Uzivatel ma zadany dve cisla 5 a 8
    When Uzivatel secte tato dve cisla
    Then Uzivatel vidi na kalkulacce vysledek 13

