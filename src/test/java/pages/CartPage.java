package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement firstProduct;

    @FindBy(xpath = "//a[@href='/product_details/2']")
    public WebElement secondProduct;

    @FindBy(xpath ="(//a[@href='/view_cart'])[1]")
    public WebElement cartButton;

    @FindBy(xpath ="(//p[contains(text(),'Rs.')])[1]")
    public WebElement addedFirstProductPrice;

    @FindBy(xpath ="(//p[contains(text(),'Rs.')])[2]")
    public WebElement addedfirstProductPriceTotal;

    @FindBy(xpath ="(//p[contains(text(),'Rs.')])[3]")
    public WebElement addedSecondProductPrice;

    @FindBy(xpath ="(//p[contains(text(),'Rs.')])[4]")
    public WebElement addedSecondProductPriceTotal;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement firstAddedProductQuantity;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement secondAddedProductQuantity;

}

