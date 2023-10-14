@Hooks
  Feature: Hooks Testi
    Background: Hooks Testi
      Given "trendyol" sitesine gidilir
      And arama kutusuna "iran yapıştırıcısı" yazılır
      Then arama sonuclarinin goruntulendigi dogrulanir

    Scenario: Hooks Testi Pozitif
      Then sonuc sayfasinda "iran yapıştırıcısı" oldugu dogrulanir
      When sonuc sayfasindaki arama sonuc sayisi alinir
      Then 20 den fazla urunun ekranda goruntulendigi dogrulanir

    Scenario: Hooks Testi Negatif
      Then sonuc sayfasinda "ekose gömlek" oldugu dogrulanir
      When sonuc sayfasindaki arama sonuc sayisi alinir
      Then sonuc sayisindaki kadar urunun ekranda goruntulendigi dogrulanir

# yapilacak islemler
# 1- hooks class ac
# 2- before metot ac cucumber'dan import et
# 3- after metot ac cucumber'dan import et
# 4- runner'a yol belirt

