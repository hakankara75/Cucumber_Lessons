@paraleTest02 @regresyon
Feature: Paralel Test
  Scenario: Negatif Paralel Test 02
    Given "pazarama" sitesine gidilir
    When search box ina "jenga" yazılır
    Then goruntulenen sonuclarda "Ahşap" yazdigi dogrulanir