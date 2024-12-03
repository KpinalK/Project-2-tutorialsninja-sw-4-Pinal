package php.com.tutorials.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.com.tutorials.pages.MyAccountPage;
import php.com.tutorials.testbase.BaseTest;

import java.util.List;

public class MyAccountTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){

        //1.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccount();

        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter "Register”
        selectMyAccountOptions("Register");

        //1.3 Verify the text “Register Account”.
        String expectedMessage = "Register Account";
        String actualMessage = myAccountPage.verifyTextRegisterAccount();
        Assert.assertEquals(actualMessage,expectedMessage,"The text “Register Account” is not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        //2.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        selectMyAccountOptions("Login");

        //2.3 Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = myAccountPage.verifyTheTextReturningCustomer();
        Assert.assertEquals(actualMessage,expectedMessage,"The text “Returning Customer” is not displayed");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){

        //3.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions("Register");

        //3.3 Enter First Name
        myAccountPage.enterFirstName();

        //3.4 Enter Last Name
        myAccountPage.enterLastName();

        //3.5 Enter Email
        myAccountPage.enterEmail();

        //3.6 Enter Telephone
        myAccountPage.enterTelephone();

        //3.7 Enter Password
        myAccountPage.enterPassword();

        //3.8 Enter Password Confirm
        myAccountPage.enterPasswordConfirm();

        //3.9 Select Subscribe Yes radio button
        myAccountPage.selectYesRadioButton();

        //3.10 Click on Privacy Policy check box
        myAccountPage.clickOnPrivacyPolicyCheckbox();

        //3.11 Click on Continue button
        myAccountPage.clickOnContinueButton();

        //3.12 Verify the message “Your Account Has Been Created!”
        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = myAccountPage.verifyMessageYourAccountHasBeenCreated();
        Assert.assertEquals(actualMessage,expectedMessage,"Message not displayed");

        //3.13 Click on Continue button
        myAccountPage.clickOnContinueButton2();

        //3.14 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();

        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        selectMyAccountOptions("Logout");

        //3.16 Verify the text “Account Logout”
        String expectedMessageIs = "Account Logout";
        String actualMessageIs = myAccountPage.verifyTextAccountLogout();
        Assert.assertEquals(actualMessageIs,expectedMessageIs,"the text “Account Logout” is not displayed");

        //3.17 Click on Continue button
        myAccountPage.clickOnContinueButton3();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){

        //4.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter "Login”
        selectMyAccountOptions("Login");

        //4.3 Enter Email address
        myAccountPage.enterTheEmailAddress();

        //4.4 Enter Password
        myAccountPage.enterThePassword();

        //4.5 Click on Login button
        myAccountPage.clickOnLoginButton();

        //4.8 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();

        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        selectMyAccountOptions("Logout");

        //4.10 Verify the text “Account Logout”
        String expectedMessageIs = "Account Logout";
        String actualMessageIs = myAccountPage.verifyTextAccountLogout();
        Assert.assertEquals(actualMessageIs,expectedMessageIs,"the text “Account Logout” is not displayed");

        //4.11 Click on Continue button
        myAccountPage.clickOnContinueButton3();

    }

}
