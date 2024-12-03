package php.com.tutorials.pages;

import org.openqa.selenium.By;
import php.com.tutorials.utilities.Utility;

public class LaptopsAndNotebooksPage extends Utility {

    By laptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    By showAllLaptopsAndNotebooks = By.linkText("Show AllLaptops & Notebooks");
    By priceHighToLow = By.id("input-sort");
    By macbook = By.linkText("MacBook");
    By verifyText = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By verifyMessageShoppingCart = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By linkShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyTextShoppingCart = By.xpath("//div[@id='content']//h1");
    By verifyProductNameMacBook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By changeQuantity = By.xpath("//input[contains(@name, 'quantity')]");
    By updateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By verifyModifiedShoppingCart = By.xpath("//div[@id='checkout-cart']/div[1]");
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkoutButton = By.xpath("//a[@class='btn btn-primary']");
    By verifyTextCheckout = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomer = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckout = By.xpath("//input[@value='guest']");
    By continueTab = By.xpath("//input[@id='button-account']");
    By continueButton = By.xpath("//input[@id='button-guest']");
    By addComment = By.xpath("//textarea[@name='comment']");
    By textArea = By.xpath("//input[@id='button-shipping-method']");
    By termAndConditions = By.xpath("//input[@name='agree']");
    By clickOnContinue = By.xpath("//input[@id='button-payment-method']");




    public void mouseHoverLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public void clickOnShowAllLaptopsAndNotebooks(){
        clickOnElement(showAllLaptopsAndNotebooks);
    }

    public void selectSortByPriceHighToLow(){
        selectByVisibleTextFromDropDown(priceHighToLow,"Price (Low > High)");
    }

    public void selectProductMacbook(){
        clickOnElement(macbook);
    }

    public String verifyTextMacBook(){
        return getTextFromElement(verifyText);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }

    public String verifyMessage(){
        return getTextFromElement(verifyMessageShoppingCart);
    }

    public void clickOnLinkShoppingCart(){
        clickOnElement(linkShoppingCart);
    }

    public String verifyTheTextShoppingCart(){
        return getTextFromElement(verifyTextShoppingCart);
    }

    public String verifyTheProductNameMacBook(){
        return getTextFromElement(verifyProductNameMacBook);
    }

    public void changeQuantity2(){
        sendTextToElement(changeQuantity,"2");
    }

    public void clickOnUpdateTab(){
        clickOnElement(updateTab);
    }

    public String VerifyMessageModifiedShoppingCart(){
        return getTextFromElement(verifyModifiedShoppingCart);
    }

    public String verifyTheTotal(){
        return getTextFromElement(verifyTotal);
    }

    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }

    public String verifyTheTextCheckout(){
        return getTextFromElement(verifyTextCheckout);
    }

    public String verifyTheTextNewCustomer(){
        return getTextFromElement(newCustomer);
    }

    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }

    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public void addCommentAboutYourOrder(){
        sendTextToElement(addComment,"This is comment for test case");
        clickOnElement(textArea);
    }

    public void checkTermsAndConditionCheckBox(){
        clickOnElement(termAndConditions);
    }

    public void clickOnTheContinueButton(){
        clickOnElement(clickOnContinue);
    }

}
