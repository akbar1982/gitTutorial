package tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestBase;
import java.util.List;

public class HomePageTest extends TestHooker{

    TestBase base = new TestBase();
    HomePage homePage = new HomePage();



    @Test
    public void testTitle(){
        String actual = base.getTitleOfThePage();
        String expected = "SeleniumHQ Browser Automation";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testDownloadButtonCount(){
        base.scrollToElementy(homePage.getDownloadsButtons());
        base.takeScreenShot();
        List<WebElement> elements = base.getElements(homePage.getDownloadsButtons());
        int actual = elements.size();
        Assert.assertEquals(actual,3);
    }



}
