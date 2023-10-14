@rerun
Feature: US01 Cok satan edebiyat kitapları
 Scenario: Mynet Rerun Testi
   Given Kullanici "url" e gider
    And arama butonuna basar
   And arama kutusuna "qa tester" yazar
   Then sonuçlarda "qa tester" oldugunu dogrular

  Scenario: Mynet Rerun Testi
    Given Kullanici "url" e gider
    And arama butonuna basar
    And arama kutusuna "hava durumu" yazar
    Then sonuçlarda "testere" oldugunu dogrular