package page;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public BasePage openUrl(){
    driver.get(BASE_URL);
    return this;
    }

    public BasePage createTicket(String titleValue, String bodyValue, String emailValue){
       driver.findElement(QUEUE_VALUE).click();
       driver.findElement(TITLE).sendKeys(titleValue);
       driver.findElement(BODY).sendKeys(bodyValue);
       driver.findElement(DATE_FILED).click();
       driver.findElement(DATE_VALUE).click();
       driver.findElement(EMAIL).sendKeys(emailValue);
       return this;
    }

    public BasePage clickButton(){
        driver.findElement(BUTTON).click();
        return this;
    }


    public MainPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageOpen() {
        return false;
    }
}
