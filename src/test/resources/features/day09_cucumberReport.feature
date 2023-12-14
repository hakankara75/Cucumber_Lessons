@getir
  Feature: Cucumber Report
    Scenario: Cucumber Report
      Given "getir" sitesine gidilir
      When cerezleri kapatir

#pom.xml e cucumber-reporting plugin eklenir
  #Runner'da json report yolu eklenir plugine
  #paralel test icin acilan Runner'a dosya isminin sonuna 1 ver.
  #terminale mvn clean verify ile rapor olusur
#cucumber reportu githubdan mail ile paylasmak icin resources altinda cucumber.properties olustur

  #spark report icin pom.xml'e extentreports-cucumber7-adapter dependency ekle
  #resources altina extent-config.xml ve extent.properties dosyalarini ac
  #extent-config.xml file icine kodlari yapistir
#extent.properties icine kodlari yapistir
#Runner'a plugin icine "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//eklenir

