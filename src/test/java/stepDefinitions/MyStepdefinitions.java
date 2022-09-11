package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class MyStepdefinitions {

    static int pages=1;
    @Then("Kullanici test edilmesini istedigi sayfalari acar")
    public void kullaniciTestEdilmesiniIstedigiSayfalariAcar() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty(pages+""));

        pages++;

        Thread.sleep(2000);
    }

    @Given("Kullanici Defensx browsera yuklenir")
    public void kullaniciDefensxBrowseraYuklenir() {

        System.out.println("burası doldurulacak");
    }

    @And("Kullanici browseri kapatir")
    public void kullaniciBrowseriKapatir() {

        Driver.closeDriver();
    }
}
