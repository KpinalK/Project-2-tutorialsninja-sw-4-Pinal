package php.com.tutorials.pages;

import org.openqa.selenium.By;
import php.com.tutorials.utilities.Utility;

public class MyAccountPage extends Utility {

    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By verifyText = By.xpath("//h1[contains(text(),'Register Account')]");
    By verifyTextReturning = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By passwordConfirm = By.id("input-confirm");
    By yesRadioButton = By.xpath("//fieldset[3]//input");
    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By verifyMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueButton2 = By.xpath("//a[contains(text(),'Continue')]");
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By verifyAccountLogout = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton3 = By.xpath("//a[contains(text(),'Continue')]");
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public void clickOnMyAccount(){
        clickOnElement(myAccount);
    }

    public String verifyTextRegisterAccount(){
        return getTextFromElement(verifyText);
    }

    public String verifyTheTextReturningCustomer(){
        return getTextFromElement(verifyTextReturning);
    }

    public void enterFirstName(){
        sendTextToElement(firstName,"Pinal");
    }

    public void enterLastName(){
        sendTextToElement(lastName,"Kamani");
    }

    public void enterEmail(){
        sendTextToElement(email,"Pinal2525@gmail.com");
    }

    public void enterTelephone(){
        sendTextToElement(telephone,"07988112233");
    }

    public void enterPassword(){
        sendTextToElement(password,"Pinal123");
    }

    public void enterPasswordConfirm(){
        sendTextToElement(passwordConfirm,"Pinal123");
    }

    public void selectYesRadioButton(){
        selectByContainsTextFromListOfElements(yesRadioButton,"Yes");
    }

    public void clickOnPrivacyPolicyCheckbox(){
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public String verifyMessageYourAccountHasBeenCreated(){
        return getTextFromElement(verifyMessage);
    }

    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }

    public String verifyTextAccountLogout(){
        return getTextFromElement(verifyAccountLogout);
    }

    public void clickOnContinueButton3(){
        clickOnElement(continueButton3);
    }

    public void enterTheEmailAddress(){
        sendTextToElement(email,"Pinal90@gmail.com");
    }

    public void enterThePassword(){
        sendTextToElement(password,"Pinal90");
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
}
