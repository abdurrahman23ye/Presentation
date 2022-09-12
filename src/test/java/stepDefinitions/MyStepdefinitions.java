package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyStepdefinitions {

    static int urls=1;
    static int urls2=1;
    @Then("Kullanici test edilmesini istedigi sayfalari acar")
    public void kullaniciTestEdilmesiniIstedigiSayfalariAcar() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty(urls+""));

        urls++;

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



    @Given("Kullanici Defensx browsera yukler")
    public void kullaniciDefensxBrowseraYukler() {
    }

    @Then("Kullanici test edilmesini istedigi sayfalari<{int}> acar")
    public void kullaniciTestEdilmesiniIstedigiSayfalariAcar(int arg0) throws InterruptedException {


    }


    @Then("Kullanici test edilmesini istedigi sayfalari{string} acar")
    public void kullaniciTestEdilmesiniIstedigiSayfalariAcar(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty(arg0+""));


    }

    @Then("Kullanici test edilecek sayfalari acar")
    public void kullaniciTestEdilecekSayfalariAcar() throws IOException {


        String path="C:\\Users\\asus\\IdeaProjects\\Presentation\\src\\test\\java\\defensx.xlsx";

        FileInputStream fis= new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);

        String urls= workbook.getSheet("Sayfa2").getRow(1).getCell(urls2).toString();

        System.out.println("urls = " + urls);

        Driver.getDriver().get(ConfigReader.getProperty(urls));

        urls2++;


    }
}
