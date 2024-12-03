package php.com.tutorials.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import php.com.tutorials.propertyreader.PropertyReader;
import php.com.tutorials.utilities.Utility;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
