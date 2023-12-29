
  Feature: Scenario Outline Testi

    Background: siteye giris
      Given boyner sitesine gidilir
      When login ikonu ustune gidilir

    Scenario: Uyelik Testi
      And uye ol linki tiklanir
      Then uyelik sayfasinda oldugu dogrulanir
      And uyelik sayfasinda ad girilir
      And email girilir
      And uyelik sayfasinda password girilir
      And cep telefonu girilir
      And uyelik metni checkbox secilir
      And riza metni checkbox secilir
      And uye ol butonu tiklanir

    @boyner
      Scenario Outline: Negatif Uyelik Testi
        And uye ol linki tiklanir
        Then uyelik sayfasinda oldugu dogrulanir
        And uyelik sayfasinda ad bolumune "<ad>" girilir
        And uyelik sayfasinda email bolumune"<email>" girilir
        And uyelik sayfasinda password bolumune"<password>" girilir
        And uyelik sayfasinda cep telefonu bolumune"<cep telefonu>" girilir
        And uyelik metni icin "<uyelik metni>" checkbox secilir
        And riza metni icin "<riza metni>" checkbox secilir
        And uye ol butonu tiklanir
        Examples:
          | ad    | email                  | password | cep telefonu | uyelik metni | riza metni |
          | hakan | jaziah.poe             | 123456a  | 5455444444   | 1            | 1          |
          | hakan | jaziah.poe@            | 123456a  | 5455444444   | 1            | 1          |
          | hakan | jaziah.poe@free2ducks  | 123456a  | 5455444444   | 1            | 1          |
          | hakan | jaziah.poe@free2ducks. | 123456a  | 5455444444   | 1            | 1          |