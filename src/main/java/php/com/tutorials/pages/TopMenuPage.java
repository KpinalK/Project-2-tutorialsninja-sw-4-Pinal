package php.com.tutorials.pages;

import org.openqa.selenium.By;
import php.com.tutorials.utilities.Utility;

public class TopMenuPage extends Utility {

    //1.1 Mouse hover on the “Desktops” Tab and click
    By desktops = By.linkText("Desktops");

    //1.3 Verify the text ‘Desktops’
    By verifyDesktops = By.xpath("//h2[normalize-space()='Desktops']");

    //2.1 Mouse hover on the “Laptops & Notebooks” Tab and click
    By laptopsAndNotebooks = By.linkText("Laptops & Notebooks");

    //2.3 Verify the text ‘Laptops & Notebooks’
    By verifyLaptopsAndNotebooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    //3.1 Mouse hover on the “Components” Tab and click
    By components = By.linkText("Components");

    //3.3 Verify the text ‘Components’
    By verifyComponents = By.xpath("//h2[contains(text(),'Components')]");



    public void mouseHoverOnDesktops(){
        mouseHoverToElementAndClick(desktops);
    }

    public String verifyTextDesktops(){
        return getTextFromElement(verifyDesktops);
    }

    public void laptopsAndNotebooksAndClick(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public String verifyTextLaptopsAndNotebooks(){
        return getTextFromElement(verifyLaptopsAndNotebooks);
    }

    public void mouseHoverOnComponentsAndClick(){
        mouseHoverToElementAndClick(components);
    }

    public String verifyTextComponents(){
        return getTextFromElement(verifyComponents);
    }
}
