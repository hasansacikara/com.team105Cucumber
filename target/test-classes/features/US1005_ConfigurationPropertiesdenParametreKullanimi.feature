Feature:
 # ConfigReader'daki getProperty() kullanilip
    # configuration.properties dosyasindaki value testte kullanilabilir

  Scenario: TC06 Kullanici amazon sitesine gidisi test eder
  Scenario: TC09 Kullanici amazon sitesine gidisi test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then Url de "amazon" oldugunu test eder


  Scenario: TC07 Kullanici amazon sitesine gidisi test eder
  Scenario: TC10 Kullanici wisequarter sitesine gidisi test eder

    Given kullanici "wqUrl" anasayfaya gider
    Then Url de "wisequarter" oldugunu test eder


  Scenario: TC08 Kullanici amazon sitesine gidisi test eder
  Scenario: TC11 Kullanici walmart sitesine gidisi test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then Url de "walmart" oldugunu test eder

