#Search Parameterizing Bu, bir senaryonun veya senaryo adımının farklı verilerle
# nasıl davranacağını test etmeye yarar.
  Feature: Search Parameterizing

    Scenario: Arama Kutusu Testi
      Given madame coco sitesine gidilir
      And arama kutusuna vazo yazilir
      Then sonuclarda vazo oldugu dogrulanir
    @search
      Scenario: Parametreli Arama Kutusu Testi
        Given madame coco sitesine gidilir
        And ingilizce menu secilir
        And arama kutusuna "urun" yazilir
        Then sonuclarda "urun" oldugu dogrulanir
