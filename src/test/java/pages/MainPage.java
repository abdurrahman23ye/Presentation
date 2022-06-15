package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginLinki;

    @FindBy(xpath ="//html")
    public WebElement mainPage;


    @FindBy(xpath = "//b")
    public WebElement loggedName;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOut;

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    public WebElement emailAlreadyExist;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement products;

    @FindBy(xpath ="//h2[text()='Subscription']")
    public WebElement subscription;

    @FindBy(xpath ="//input[@id='susbscribe_email']")
    public WebElement subscribe_email;

    @FindBy(xpath ="//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrow;

    @FindBy(xpath ="//div[@class='alert-success alert']")
    public WebElement subscribeSuccess;

    @FindBy(xpath ="(//a[@href='/view_cart'])[1]")
    public WebElement cartButton;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement firstProduct;

    @FindBy(xpath = "(//a[@data-product-id='1' and @class='btn btn-default add-to-cart'])[1]")
    public  WebElement addProductToCart1;


    @FindBy(xpath = "(//a[@data-product-id='2' and @class='btn btn-default add-to-cart'])[1]")
    public  WebElement addProductToCart2;

    @FindBy(xpath = "//div[@id='accordian']")
    public  WebElement categories;

    @FindBy(xpath = "(//a[@data-toggle='collapse'])[1]")
    public WebElement categoryOfWomen;

    @FindBy(xpath = "//a[@href='/category_products/1']")
    public WebElement categoryWomanDress;

    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement recommendedItemsLabel;

    @FindBy(xpath = "(//a[@data-product-id=2])[3]")
    public WebElement addRecommendedItem;

    @FindBy(xpath = "(//i[@class='fa fa-angle-right'])[2]")
    public WebElement otherRecommendedItems;

    @FindBy(xpath = "(//a[@data-product-id=4])[3]")
    public WebElement addRecommendedItem2;

    @FindBy(xpath
            = "(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]" )
    public WebElement fullFledgedPracticeLabel;
    @FindBy(xpath
            = "(//h2[text()='Full-Fledged practice website for Automation Engineers'])[2]" )
    public WebElement fullFledgedPracticeLabel2;
    @FindBy(xpath
            = "(//h2[text()='Full-Fledged practice website for Automation Engineers'])[2]" )
    public WebElement fullFledgedPracticeLabel3;

    @FindBy(xpath = "//i[@class='fa fa-angle-up']")

    public WebElement arrowForTop;

}
