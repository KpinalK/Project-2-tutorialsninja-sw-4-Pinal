package php.com.tutorials.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.com.tutorials.pages.LaptopsAndNotebooksPage;
import php.com.tutorials.testbase.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTest extends BaseTest {

    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){

        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        laptopsAndNotebooksPage.mouseHoverLaptopsAndNotebooks();

        //1.2 Click on “Show AllLaptops & Notebooks”
        laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();

        List<WebElement> products = getListOfElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);

        //1.3 Select the Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortByPriceHighToLow();

        // After filter Price (High > Low) Get all the products price and stored into array list
        products = getListOfElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);

        //1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals(afterSortByPrice,originalProductsPrice,"Product not sorted by price High to Low");
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){

        //2.1 Mouse hover on the Laptops & Notebooks Tab and click
        laptopsAndNotebooksPage.mouseHoverLaptopsAndNotebooks();

        //2.2 Click on “Show All Laptops & Notebooks”
        laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();

        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortByPriceHighToLow();

        //2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.selectProductMacbook();

        //2.5 Verify the text “MacBook”
        String expectedText = "MacBook";
        String actualText = laptopsAndNotebooksPage.verifyTextMacBook();
        Assert.assertEquals(actualText,expectedText,"The text “MacBook” not displayed");

        // //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooksPage.clickOnAddToCartButton();

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedMessage = "Success: You have added MacBook to your shopping cart!";
        String actualMessage = laptopsAndNotebooksPage.verifyMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"The Message is not displayed");

        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebooksPage.clickOnLinkShoppingCart();

        //2.9 Verify the text "Shopping Cart"
        String expectedShoppingText = "Shopping Cart";
        String actualShoppingText = laptopsAndNotebooksPage.verifyTheTextShoppingCart();
        Assert.assertEquals(actualShoppingText,expectedShoppingText,"the text 'Shopping Cart' not displayed");

        //2.10 Verify the Product name "MacBook"
        String expectedProductName = "MacBook";
        String actualProductName = laptopsAndNotebooksPage.verifyTheProductNameMacBook();
        Assert.assertEquals(actualProductName,expectedProductName,"The Product name 'MacBook' not displayed");

        //2.11 Change Quantity "2"
        laptopsAndNotebooksPage.changeQuantity2();

        //2.12 Click on “Update” Tab
        laptopsAndNotebooksPage.clickOnUpdateTab();

        //2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedMessageCart = "Success: You have modified your shopping cart!";
        String actualMessageCart = laptopsAndNotebooksPage.VerifyMessageModifiedShoppingCart();
        Assert.assertEquals(actualMessageCart,expectedMessageCart,"Message not displayed");

        //2.14 Verify the Total £737.45
        String expectedTotal = "£737.45";
        String actualTotal = laptopsAndNotebooksPage.verifyTheTotal();
        Assert.assertEquals(actualTotal,expectedTotal,"The Total £737.45 not displayed");

        //2.15 Click on the “Checkout” button
        laptopsAndNotebooksPage.clickOnCheckoutButton();

        //2.16 Verify the text “Checkout”
        String expectedTextIs = "Checkout";
        String actualTextIs = laptopsAndNotebooksPage.verifyTheTextCheckout();
        Assert.assertEquals(actualTextIs,expectedTextIs,"The text “Checkout” not displayed");

        //2.17 Verify the Text “New Customer”
        String expectedMessageIs = "New Customer";
        String actualMessageIs = laptopsAndNotebooksPage.verifyTheTextNewCustomer();
        Assert.assertEquals(actualMessageIs,expectedMessageIs,"The Text “New Customer” is not displayed");

        //2.18 Click on the “Guest Checkout” radio button
        laptopsAndNotebooksPage.clickOnGuestCheckout();

        //2.19 Click on “Continue” tab
        laptopsAndNotebooksPage.clickOnContinueTab();

        //2.20 Fill the mandatory fields

        //2.21 Click on “Continue” Button
        laptopsAndNotebooksPage.clickOnContinueButton();

        //2.22 Add Comments About your order into the text area
        laptopsAndNotebooksPage.addCommentAboutYourOrder();

        //2.23 Check the Terms & Conditions check box
        laptopsAndNotebooksPage.checkTermsAndConditionCheckBox();

        //2.24 Click on the “Continue” button
        laptopsAndNotebooksPage.clickOnTheContinueButton();






    }
}
