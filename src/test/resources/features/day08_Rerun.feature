
Feature: US01 Cok satan edebiyat kitapları
 Scenario: Mynet Rerun Testi
   Given "mynet" sitesine gidilir
    And arama butonuna basar
   And arama kutusuna "qa tester" yazar
   Then sonuçlarda "qa tester" oldugunu dogrular
  @rerun @regresyon
  Scenario: Mynet Rerun Testi
    Given "mynet" sitesine gidilir
    And arama butonuna basar
    And arama kutusuna "hava durumu" yazar
    Then sonuçlarda "testere" oldugunu dogrular

#runner olusturulur
  #runner'a rerun plugin eklenir
  #"rerun:TestOutput/failed_scenario.txt",//rerun hata veren testleri kaydedip yeniden otomatik kosmak icin
  #failedRunner feature'ina @ isareti ile txt dosyasinin yolunu ver
  #failedRunner'da tag sil