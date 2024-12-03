package php.com.tutorials.pages;

import org.openqa.selenium.By;
import php.com.tutorials.utilities.Utility;

public class DesktopsPage extends Utility {

    //1.1 Mouse hover on the Desktops Tab and click
    By desktops = By.linkText("Desktops");

    //1.2 Click on “Show All Desktops”
    By showAllDesktops = By.linkText("Show AllDesktops");

    //1.3 Select Sort By position "Name: Z to A"
    By nameZToA = By.id("input-sort");

    //2.1 Mouse hover on the Currency Dropdown and click
    By currencyDropdown = By.xpath("//i[@class='fa fa-caret-down']");

    //2.2 Mouse hover on the £Pound Sterling and click
    By poundSterling = By.xpath("//button[normalize-space()='£Pound Sterling']");

    //2.3 Mouse hover on the Desktops Tab.
    By mouseOnDesktops = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']");

    //2.4 Click on the “Show AllDesktops”
    By showAllDesktop = By.xpath("//a[normalize-space()='Show AllDesktops']");

    //2.5 Select the Sort By position "Name: A to Z"
    By nameAToZ = By.id("input-sort");

    //2.6 Select product “HP LP3065”
    By productHP = By.xpath("//a[contains(text(),'HP LP3065')]");

    //2.7 Verify the Text "HP LP3065"
    By verifyText = By.xpath("//h1[contains(text(),'HP LP3065')]");

    //2.8 Select Delivery Date "2024-11-27"

    //2.9.Enter Qty "1” using Select class.
    By qty1 = By.name("quantity");

    //2.10 Click on the “Add to Cart” button
    By addToCart = By.xpath("//button[@id='button-cart']");

    //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    By verifyMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");

    //2.12 Click on the link “shopping cart” displayed in a success message
    By link = By.xpath("//a[contains(text(),'shopping cart')]");

    //2.13 Verify the text "Shopping Cart"
    By verifyTextShopCart = By.xpath("//div[@id='content']//h1");

    //2.14 Verify the Product name "HP LP3065"
    By verifyProductName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    //2.15 Verify the Delivery Date "2024-11-27"

    //2.16 Verify the Model "Product21"
    By verifyModel = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");

    //2.17 Verify the Todat "£74.73"
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");




    public void mouseHoverOnDesktops(){
        mouseHoverToElementAndClick(desktops);
    }

    public void clickOnShowAllDesktops(){
        clickOnElement(showAllDesktops);
    }

    public void sortByNameZToA(){
        selectByVisibleTextFromDropDown(nameZToA,"Name (Z - A)");
    }

    public void mouseHoverOnCurrency(){
        mouseHoverToElementAndClick(currencyDropdown);
    }

    public void mouseHoverOnPoundAndClick(){
        mouseHoverToElementAndClick(poundSterling);
    }

    public void mouseHoverOnDesktopsTab(){
        mouseHoverToElement(mouseOnDesktops);
    }

    public void clickShowAllDeskTops(){
        clickOnElement(showAllDesktop);
    }

    public void selectSortByNameAToZ(){
        selectByVisibleTextFromDropDown(nameAToZ,"Name (A - Z)");
    }

    public void selectProductHp3065(){
        clickOnElement(productHP);
    }

    public String verifyTheTextHPLP3065(){
        return getTextFromElement(verifyText);
    }

    public void enterQty1(){
        sendTextToElement(qty1,"1");
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public String verifySuccessMessage(){
        return getTextFromElement(verifyMessage);
    }

    public void clickOnLink(){
        clickOnElement(link);
    }

    public String verifyTheTextShoppingCart(){
       return getTextFromElement(verifyTextShopCart);
    }

    public String verifyTheProductName(){
      return getTextFromElement(verifyProductName);
    }

    public String verifyTheModel(){
        return getTextFromElement(verifyModel);
    }

    public String verifyTheTotal(){
        return getTextFromElement(verifyTotal);
    }
}
