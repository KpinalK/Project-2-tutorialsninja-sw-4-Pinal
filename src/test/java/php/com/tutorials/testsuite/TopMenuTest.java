package php.com.tutorials.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import php.com.tutorials.pages.TopMenuPage;
import php.com.tutorials.testbase.BaseTest;

import java.util.List;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

        //1.1 Mouse hover on the “Desktops” Tab and click
        topMenuPage.mouseHoverOnDesktops();

        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        selectMenu("Show AllDesktops");

        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = topMenuPage.verifyTextDesktops();
        Assert.assertEquals(actualText,expectedText,"The text ‘Desktops’ not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

        //2.1 Mouse hover on the “Laptops & Notebooks” Tab and click
        topMenuPage.laptopsAndNotebooksAndClick();

        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");

        //2.3 Verify the text ‘Laptops & Notebooks’
        String expectedMessg = "Laptops & Notebooks";
        String actualMessg = topMenuPage.verifyTextLaptopsAndNotebooks();
        Assert.assertEquals(actualMessg,expectedMessg,"The text ‘Laptops & Notebooks’ not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

        //3.1 Mouse hover on the “Components” Tab and click
        topMenuPage.mouseHoverOnComponentsAndClick();

        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        selectMenu("Show AllComponents");

        //3.3 Verify the text ‘Components’
        String expectedResult = "Components";
        String actualResult = topMenuPage.verifyTextComponents();
        Assert.assertEquals(actualResult,expectedResult,"The text ‘Components’ not displayed");
    }

}
