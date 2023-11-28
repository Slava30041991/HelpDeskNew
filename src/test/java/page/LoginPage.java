package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    String LOGIN_URL = "https://at-sandbox.workbench.lanit.ru/login/?next=/";

    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By BUTTON_LOGIN = By.xpath("//input[@type ='submit']");

    public LoginPage openLoginPage(){
        driver.get(LOGIN_URL);
        return this;
    }
    public LoginPage enterNamePassword(String userName, String Password){
        driver.findElement(USER_NAME).sendKeys(userName);
        driver.findElement(PASSWORD).sendKeys(Password);
        return this;
    }

    public LoginPage clickButtonLogin (){
        driver.findElement(BUTTON_LOGIN).click();
        return this;

    }
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageOpen() {
        return false;
    }
}
