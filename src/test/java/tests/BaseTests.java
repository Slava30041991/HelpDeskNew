package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.LoginPage;
import page.MainPage;
import page.TiketsPage;

import java.util.concurrent.TimeUnit;


public class BaseTests {

    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    TiketsPage tiketsPage;

    @BeforeMethod

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        tiketsPage = new TiketsPage(driver);

    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
