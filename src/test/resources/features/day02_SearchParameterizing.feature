
  Feature: Search Parameterizing
    @search
    Scenario: Arama Kutusu Testi
      Given madame coco sitesine gidilir
      And arama kutusuna vazo yazilir
      Then sonuclarda vazo oldugu dogrulanir

      Scenario: Parametreli Arama Kutusu Testi
        Given madame coco sitesine gidilir
        And ingilizce menu secilir
        And arama kutusuna "<urun>" yazilir
        Then sonuclarda "<urun>" oldugu dogrulanir
