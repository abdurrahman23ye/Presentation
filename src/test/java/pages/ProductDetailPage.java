package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductDetailPage {

    public ProductDetailPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement productQuantity;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//button[@class='disabled']")
    public WebElement addedProductQuantity;



}
