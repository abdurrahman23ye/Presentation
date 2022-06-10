package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class MyStepdefs {
    MainPage mainPage=new MainPage();
    SignUp_Login signUp_login=new SignUp_Login();
    CartPage cartPage=new CartPage();
    SignUpPage signUpPage=new SignUpPage();
    ContactPage contactPage=new ContactPage();
    TestCasesPage testCasesPage=new TestCasesPage();
    ProductPage productPage=new ProductPage();
    ProductDetailPage productDetailPage=new ProductDetailPage();
    
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    Actions action=new Actions(Driver.getDriver());
    Faker fk=new Faker();
    String loginURL;
    TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
    WebDriverWait wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));

    static int US1010;

    @Given("Launch browser")
    public void launchBrowser() {}



    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {

        Assert.assertTrue(mainPage.mainPage.isEnabled());


    }






    @And("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue( signUp_login.newUserSignUpLabel.isDisplayed());
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {

        signUp_login.newUserSignUpName.sendKeys(ConfigReader.getProperty("dogruisim"));

        js.executeScript("window.scrollBy(0,150)");
        signUp_login.newUserSignUpEmail.sendKeys(ConfigReader.getProperty("dogruEmail"));

        js.executeScript("window.scrollBy(0,-150)");
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        signUp_login.newUserSignUpButton.click();
    }


    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(signUpPage.enterAccountInformation.isDisplayed());
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        signUpPage.inputTitle.click();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("signUpPassword")).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("dayOfBirthday")).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("monthOfBirthday")).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("yearOfBirthday")).perform();

    }


    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
    }

    @And("Select checkbox Receive special offers from our partners!Fill details: First name, Last name, Company, Address,")
    public void selectCheckboxReceiveSpecialOffersFromOurPartnersFillDetailsFirstNameLastNameCompanyAddress() {


        action.sendKeys(Keys.TAB).sendKeys(fk.name().name()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.name().lastName()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.company().name()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.address().fullAddress()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.address().fullAddress()).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().country()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().state()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().city()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().zipCode()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.phoneNumber().cellPhone()).perform();

    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        signUpPage.createAccount.click();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {

        Assert.assertTrue(signUpPage.accountCreated.isDisplayed());
    }



    @And("Click Continue button")
    public void clickContinueButton() {
        signUpPage.accountCreatedContinue.click();
    }


    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(mainPage.loggedName.getText().equals(ConfigReader.getProperty("dogruisim")));

    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        mainPage.deleteAccount.click();
    }

    @And("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }

    @Then("Navigate to url {string}")
    public void navigateToUrl(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }


    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(signUp_login.loginLabel.isDisplayed());
        loginURL=Driver.getDriver().getCurrentUrl();
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {

        signUp_login.inputEmail.sendKeys(ConfigReader.getProperty("dogruEmail"));

        action.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("signUpPassword")).perform();
    }

    @And("Click login button")
    public void clickLoginButton() {

        signUp_login.login.click();

    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {


        signUp_login.inputEmail.sendKeys(ConfigReader.getProperty("incorrectEmail"));

        js.executeScript("window.scrollBy(0,150)");

        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("inCorrectPassword")).perform();

        js.executeScript("window.scrollBy(0,-150)");



    }

    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(signUp_login.loginerror.isDisplayed());
    }

    @Then("wait {int} seconds")
    public void waitSeconds(int arg0) {

        try {
            Thread.sleep(arg0*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("Click on Signup  Login button")
    public void clickOnSignupLoginButton() {
        mainPage.loginLinki.click();
    }

    @And("Click Logout button")
    public void clickLogoutButton() {
        mainPage.logOut.click();
    }

    @And("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {


        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(loginURL));

    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {

        signUp_login.newUserSignUpName.sendKeys(ConfigReader.getProperty("dogruisim"));
        signUp_login.newUserSignUpEmail.sendKeys(ConfigReader.getProperty("dogruEmail"));
    }

    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(signUp_login.emailAlreadyExist.isDisplayed());
    }

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {

        contactPage.contactUsLink.click();
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {


        js.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(contactPage.getInTouch.isDisplayed());
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {

        contactPage.name.sendKeys(ConfigReader.getProperty("dogruisim"));

        action.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("dogruEmail")).perform();
        action.sendKeys(Keys.TAB).sendKeys("thanks to give us practicing opportunities").perform();
        action.sendKeys(Keys.TAB).sendKeys("thanks to give us practicing opportunities").perform();
    }

    @And("Upload file")
    public void uploadFile() {
        contactPage.file.sendKeys("C:\\Users\\asus\\Desktop\\290.txt");
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
        contactPage.submit.click();
    }

    @And("Click OK button")
    public void clickOKButton() {

        Driver.getDriver().switchTo().alert().accept();
    }


    @And("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(contactPage.success.isDisplayed());
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactPage.home.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("mainPage"));
    }

    @Given("Click on Test Cases button")
    public void clickOnTestCasesButton() {

        testCasesPage.TestCases.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("testCasePage"));

    }

    @And("Click on Products button")
    public void clickOnProductsButton() {
        mainPage.products.click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("productsPage"));
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        js.executeScript("window.scrollBy(0,600)");
        Assert.assertTrue(productPage.allProductsLabel.isDisplayed());
    }

    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        productPage.listedFirstProducts.click();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {

    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(productPage.listedFirstProductsCondition.isDisplayed());
        Assert.assertTrue(productPage.listedFirstProductsBrand.isDisplayed());
        Assert.assertTrue(productPage.listedFirstProductsName.isDisplayed());
        Assert.assertTrue(productPage.listedFirstProductsCategory.isDisplayed());
        Assert.assertTrue(productPage.listedFirstProductsPrice.isDisplayed());
        Assert.assertTrue(productPage.listedFirstProductsAvailability.isDisplayed());
    }

    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {

        js.executeScript("window.scrollBy(0,600)");

        productPage.searchBox.sendKeys("winter top");
        productPage.searchButton.click();
    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("window.scrollBy(0,500)");
        Assert.assertTrue(productPage.searchedProducts.isDisplayed());
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {

        Assert.assertTrue(productPage.searchedProducts.isDisplayed());
            }

    @And("Scroll down to footer")
    public void scrollDownToFooter() {

        Actions action=new Actions(Driver.getDriver());

        int input=3;
        int sayac=0;
        while(sayac<input){
            action.sendKeys(Keys.PAGE_DOWN).perform();

            sayac++;}
    }

    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertTrue(mainPage.subscription.isDisplayed());
    }

    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        mainPage.subscribe_email.sendKeys(ConfigReader.getProperty("dogruEmail"));

        mainPage.arrow.click();
    }

    @And("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {


        wait.until(ExpectedConditions.visibilityOf(mainPage.subscribeSuccess));

        Assert.assertTrue(mainPage.subscribeSuccess.isDisplayed());
    }

    @Given("Click Cart button")
    public void clickCartButton() {
        mainPage.cartButton.click();
    }


    @And("Hover first product and click Add to cart")
    public void hoverFirstProductAndClickAddToCart() {


        action.sendKeys(Keys.PAGE_DOWN).perform();


        action.moveToElement(productPage.listedFirstProducts).perform();
        productPage.listedFirstProductAddCart.click();
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        productPage.continueShoppingButton.click();
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        action.moveToElement(productPage.listedSecondProducts).perform();
        productPage.listedSecondProductAddCart.click();
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        productPage.viewCart.click();
    }

    @And("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {

        Assert.assertTrue(cartPage.firstProduct.isDisplayed());
        Assert.assertTrue(cartPage.secondProduct.isDisplayed());
    }

    @And("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {

        int inputAddedFirstCart= Integer.parseInt(cartPage.addedFirstProductPrice.getText().replace("Rs. ",""));
        int inputAddedFirstQuan= Integer.parseInt(cartPage.firstAddedProductQuantity.getText());
        int inputAddedFirstTotal= Integer.parseInt(cartPage.addedfirstProductPriceTotal.getText().replace("Rs. ",""));

        int inputAddedSecondCart= Integer.parseInt(cartPage.addedSecondProductPrice.getText().replace("Rs. ",""));
        int inputAddedSecondQuan= Integer.parseInt(cartPage.secondAddedProductQuantity.getText());
        int inputAddedSecondTotal= Integer.parseInt(cartPage.addedSecondProductPriceTotal.getText().replace("Rs. ",""));



        Assert.assertTrue(inputAddedFirstCart*inputAddedFirstQuan==inputAddedFirstTotal);
        Assert.assertTrue(inputAddedSecondCart*inputAddedSecondQuan==inputAddedSecondTotal);


    }

    @Given("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {

        js.executeScript("window.scrollBy(0,250)");

        mainPage.firstProduct.click();


    }

    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("firstProductDetailPage"));
    }

    @And("Increase quantity to {int}")
    public void ıncreaseQuantityTo(int arg0) throws InterruptedException {



        action.moveToElement(productDetailPage.productQuantity).click().perform();
        action.moveToElement(productDetailPage.productQuantity).sendKeys(Keys.BACK_SPACE).perform();
        action.moveToElement(productDetailPage.productQuantity).sendKeys("4").perform();


    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {

        productDetailPage.addToCart.click();
    }

    @And("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals("4",productDetailPage.addedProductQuantity.getText());
    }

    @And("Add products to cart")
    public void addProductsToCart() {
        
        mainPage.addProductToCart1.click();

    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("cartPage")));

    }

    @And("Add product to cart")
    public void addProductToCart() {
        mainPage.addProductToCart2.click();
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {

        cartPage.proceedToCheckout.click();


    }

    @And("Click Register  Login button")
    public void clickRegisterLoginButton() {

        cartPage.registerLoginButton.click();
    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {

        Assert.assertTrue(cartPage.deliverAdress.isDisplayed());
        Assert.assertTrue(cartPage.billingAdress.isDisplayed());
    }


    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        js.executeScript("window.scrollBy(0,250)");

        cartPage.textArea.sendKeys("my number:343534343");

        cartPage.placeOrder.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() throws InterruptedException {
        js.executeScript("window.scrollBy(0,250)");

        Thread.sleep(5000);

        action.moveToElement(cartPage.cardName).click().perform();
        action.sendKeys("MasterCard").perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("23232322").perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("232").perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("11").perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("2025").perform();
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {

        cartPage.payAndOrder.click();
    }

    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        Assert.assertTrue(cartPage.success.isDisplayed());
    }
}

