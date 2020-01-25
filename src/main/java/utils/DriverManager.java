package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager{

    private   static WebDriver driver;


    public  static WebDriver getDriver(){
        if(driver == null) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            System.out.println("This will execute only once during the runtime");
            driver.get("https://selenium.dev");
            return driver;
        }else{
            return driver;
        }
    }

    public static void tearDown(){
            driver.quit();
    }
}
