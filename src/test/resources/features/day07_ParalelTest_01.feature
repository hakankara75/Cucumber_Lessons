@paraleTest01
Feature: Paralel Test
    Scenario: Paralel Test 01
      Given "pazarama" sitesine gidilir
      When search box ina "jenga" yazılır
      Then goruntulenen sonuclarda "jenga" yazdigi dogrulanir
      When ilk urun favorilere eklenir
      And giris sayfasi acilir
      And email ve passwordkutusuna girilir
        | email                      | password |
        | hakandenememaili@gmail.com |1234567  |
      Then devam butonunun oldugu dogrulanir

#surefire-plugin
  #failsafe-plugin kurulur
  #birden fazla runner kur
  #mvn clean verify ile calistir