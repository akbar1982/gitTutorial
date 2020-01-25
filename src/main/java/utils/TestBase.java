package utils;
import com.google.common.base.Function;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    // here we put all of our re-usable methods

   


    public WebElement getElement(By element){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),30);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(element)));
        ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].style.border='3px solid red'", ele);

        return ele;
    }


    public List<WebElement> getElements(By element){
        List<WebElement> ele = DriverManager.getDriver().findElements(element);
        return ele;
    }

    public WebElement getElementWithFluentWait(By element){

        Wait wait = new FluentWait<WebDriver>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(ElementNotInteractableException.class)
                .ignoring(NotFoundException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class);
        WebElement ele = (WebElement) wait.until(new Function<WebDriver, WebElement>(){

            public WebElement apply( WebDriver driver) {
                return driver.findElement(element);
            }
        });
       return ele;

    }

    //    this method is used for sending texts
    public void sendText(By element, String text){
        getElement(element).sendKeys(text);
    }

    public void scrollToElementy (By element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", getElement(element));

    }

    public void clickOn(By element){
        getElement(element).click();
    }

    public String getTitleOfThePage(){
       DriverManager.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
       String title = DriverManager.getDriver().getTitle();
       return title;
    }

    public  void takeScreenShot(){

        try {
            TakesScreenshot scrShot =((TakesScreenshot)DriverManager.getDriver());
            File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File destFile=new File("./screenshots/"+ LocalDateTime.now().toString()+".png");
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
