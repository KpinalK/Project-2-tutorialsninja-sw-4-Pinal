package php.com.tutorials.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.com.tutorials.pages.DesktopsPage;
import php.com.tutorials.testbase.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest extends BaseTest {

    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

        //1.1 Mouse hover on the Desktops Tab and click
        desktopsPage.mouseHoverOnDesktops();

        //1.2 Click on “Show All Desktops”
        desktopsPage.clickOnShowAllDesktops();

        // Get all the products name and stored into array list
        List<WebElement> products = getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);

        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.sortByNameZToA();

        // After filter Z -A Get all the products name and stored into array list
        products = getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(afterSortByZToAProductsName,originalProductsName,"Product not sorted into Z to A order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){

        //2.1Mouse hover on the Currency Dropdown and click
        desktopsPage.mouseHoverOnCurrency();

        //2.2 Mouse hover on the £Pound Sterling and click
        desktopsPage.mouseHoverOnPoundAndClick();

        //2.3 Mouse hover on the Desktops Tab.
        desktopsPage.mouseHoverOnDesktopsTab();

        //2.4 Click on the “Show AllDesktops”
        desktopsPage.clickShowAllDeskTops();

        //2.5 Select the Sort By position "Name: A to Z"
        desktopsPage.selectSortByNameAToZ();

        //2.6 Select product “HP LP3065”
        desktopsPage.selectProductHp3065();

        //2.7 Verify the Text "HP LP3065"
       String expectedText = "HP LP3065";
       String actualText = desktopsPage.verifyTheTextHPLP3065();
       Assert.assertEquals(actualText,expectedText,"The Text 'HP LP3065' not displayed");

        //2.9.Enter Qty "1” using Select class.
        desktopsPage.enterQty1();

        //2.10 Click on the “Add to Cart” button
        desktopsPage.clickOnAddToCart();

        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String actualMessage = desktopsPage.verifySuccessMessage();
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage,expectedMessage,"Message not displayed");

        //2.12 Click on the link “shopping cart” displayed in a success message
        desktopsPage.clickOnLink();

        //2.13 Verify the text "Shopping Cart"

        //2.16 Verify the Model "Product21"
        String expectedModel = "Product21";
        String actualModel = desktopsPage.verifyTheModel();
        Assert.assertEquals(actualModel,expectedModel,"the Model 'Product21' not displayed");

        //2.17 Verify the Todat "£74.73"
        String expectedTotal = "£74.73";
        String actualTotal = desktopsPage.verifyTheTotal();

    }
}
