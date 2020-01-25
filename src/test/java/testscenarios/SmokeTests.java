package testscenarios;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class SmokeTests {

    private static WebDriver driver;


    @Before
    public void startBrowser() {

        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

//            System.setProperty("webdriver.gecko.driver", "geckodriver");
            System.out.println("This will execute only once during the runtime");
        }
    }

    @Test
    public void testMethod0() throws Throwable {
        driver.get("https://selenium.dev/");
        WebDriverWait wait = new WebDriverWait(driver,30);
                WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='header']/a/img[1]"))));
        System.out.println(element.getAttribute("src"));
    }
    @Test
    public void testMethod() throws Throwable {
        driver.get("https://selenium.dev/");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Downloads")).click();
        System.out.println("This is the name of the current thread :" + Thread.currentThread().getName());
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

    }

    @Test
    public void testMethod2() throws Throwable{
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application
        driver.get("https://selenium.dev/");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below
        driver.manage().window().maximize();
//        driver.wait(5000);
        WebElement element = driver.findElement(By.linkText("Downloads"));
        Wait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Downloads")));
//        wait.until(ExpectedConditions.visibilityOf(element));
        driver.findElement(By.linkText("Downloads")).click();
        Thread.sleep(3000);
        // This  will scroll down the page by  2000 pixel vertical
//        js.executeScript("window.scrollBy(0,2000)");
//        driver.wait(5000);
        // This  will scroll up the page by  2000 pixel vertical
//        js.executeScript("window.scrollBy(0,-2000)");
//        driver.wait(5000);
//        List<WebElement> elements = driver.findElements(By.tagName("td"));
//        for(WebElement ele:elements){
//            System.out.println(ele.getText());
//        }
    }

   @Test
   public void testMethod3() throws Throwable{
       JavascriptExecutor js = (JavascriptExecutor) driver;

       //Launch the application
       driver.get("https://selenium.dev/");
       Thread.sleep(5000);
//       //Find element by link text and store in variable "Element"
       WebElement element = driver.findElement(By.linkText("LEARN MORE"));
//
//               //This will scroll the page till the element is found
       js.executeScript("arguments[0].scrollIntoView();", element);
//
       Thread.sleep(3000);
       WebElement Element = driver.findElement(By.xpath("//div[@class='download-button webdriver']"));
       Actions  builder = new Actions(driver);
       Action mouseOverHome = builder
               .moveToElement(element).click()
               .build();

//       Robot robot = new Robot();
//       robot.mouseMove(1197,44);
//       Thread.sleep(5000);
//       robot.keyPress(KeyEvent.VK_ENTER);
//       robot.keyRelease(KeyEvent.VK_ENTER);



       element.click();
//       element.click();
       Thread.sleep(10000);



   }



   @Test
   public void testMethod4()  {

       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
try {
    Thread.sleep(5000);
    int size = driver.findElements(By.tagName("iframe")).size();

//    for (int i = 0; i <= size; i++) {
        driver.switchTo().frame(size);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        WebElement ele = driver.findElement(By.cssSelector("body > select"));
        Select select = new Select(ele);
        select.selectByVisibleText("Saab");
//        Assert.assertEquals("Downloads",driver.getTitle());
        Thread.sleep(3000);

//    }
}catch(Exception e){
    e.printStackTrace();
}
   }

   @Test
   public void test5() throws InterruptedException{
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Facebook");
       Thread.sleep(5000);
        driver.findElement(By.name("btnK")).click();
       Thread.sleep(5000);

   }
    @After
    public void tearDown() {
        driver.quit();
    }


}

