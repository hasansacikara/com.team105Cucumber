package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;

import java.util.NoSuchElementException;

public class HerokuappStepdefinitions {
    HerokuappPage herokuappPage= new HerokuappPage();

    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonu.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() throws InterruptedException {
        Thread.sleep(2000);
        // aslinda beklemeye gerek yok, ama bekler dedigi icin 2 sn bekledik
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        int flag=3;

        try {
            herokuappPage.deleteButonu.click();
            Assert.assertFalse(flag==3);
        } catch (Exception e) {
            Assert.assertTrue(flag==3);

        }
    }
}