package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {

            Driver.closeDriver();
        }

        public void amazonAramaKutusunaJavaYazipAratir () {
            amazonPage = new AmazonPage();
            amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
        }

        public void aramaSonuclarininJavaIcerdiginiTestEder () {
            String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
            String expectedKelime = "Java";

            Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
        }
        public void amazon_arama_kutusuna_samsung_yazip_aratir () {
            amazonPage = new AmazonPage();
            amazonPage.amazonAramaKutusu.sendKeys("Samsung" + Keys.ENTER);
        }
        public void arama_sonuclarinin_samsung_icerdigini_test_eder () {

            String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
            String expectedKelime = "Samsung";

            Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
        }

        public void saniyeBekler ( int saniye){


            try {
                Thread.sleep(saniye * 1000);
            } catch (InterruptedException e) {



            }

        }
    }
