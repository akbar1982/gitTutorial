package pages;

import org.openqa.selenium.By;
import utils.DriverManager;



public class HomePage {

    DriverManager driver = new DriverManager();

    private By aboutMenu = By.xpath("//*[@id=\"navbar\"]/div[1]/span");
    private By downloadsMenu = By.xpath("//*[@id=\"navbar\"]/a[1]");
    private By projectsMenu = By.xpath("//*[@id=\"navbar\"]/a[3]");
    private By documentationMenu = By.xpath("//*[@id=\"navbar\"]/a[3]");
    private By supportMenu = By.xpath("//*[@id=\"navbar\"]/a[4]");
    private By blogMenu = By.xpath("//*[@id=\"navbar\"]/a[5]");
    private By searchHole = By.xpath("//*[@id=\"gsc-i-id1\"]");
    private By searchButton = By.xpath("//*[@id='navbar']/div[2]/div/img");
    private By webDriverDownload = By.xpath("//div[@class='download-button webdriver']");
    private By ideDownload = By.xpath("//div[@class='download-button ide']\"");
    private By gridDownload = By.xpath("//div[@class='download-button grid']");
    private By moreNews = By.xpath("//*[contains(text(),'MORE NEWS')]");
    private By downloadsButtons = By.xpath("//*[contains(text(),'DOWNLOAD')]");

    public By getDownloadsMenu() {
        return downloadsMenu;
    }

    public By getDownloadsButtons() {
        return downloadsButtons;
    }

    public DriverManager getDriver() {
        return driver;
    }

    public By getAboutMenu() {
        return aboutMenu;
    }

    public By getProjectsMenu() {
        return projectsMenu;
    }

    public By getDocumentationMenu() {
        return documentationMenu;
    }

    public By getSupportMenu() {
        return supportMenu;
    }

    public By getBlogMenu() {
        return blogMenu;
    }

    public By getSearchHole() {
        return searchHole;
    }

    public By getSearchButton() {
        return searchButton;
    }

    public By getWebDriverDownload() {
        return webDriverDownload;
    }

    public By getIdeDownload() {
        return ideDownload;
    }

    public By getGridDownload() {
        return gridDownload;
    }

    public By getMoreNews() {
        return moreNews;
    }
}
