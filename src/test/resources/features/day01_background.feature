Feature: ets Tur sitesi login testi
  Scenario: ets tur login
    Given ets tur sitesine gidilir
    And login butonu ustune gidilir
    When giris butonuna basilir
    And eposta girilir
    And password girilir
    When giris yap butonuna basilir
    Then sayfaya gidilemedigi dogrulanir

  @login
  Scenario: ets tur login
    Given ets tur sitesine gidilir
    And login butonu ustune gidilir
    Then uye ol butonuna basilir
    And ad girilir
    And soyad girilir
    And uyelik icin eposta girilir
    And ceptelefonu girilir
    And uyelik icin password girilir
    And password yeniden girilir
    And kullanim sartlari checkbox secilir
    And firsat ve kampanyalar checkbox secilir
    When uyelik bolumunde uye ol butonuna basilir
    Then sayfaya gidildigi dogrulanir