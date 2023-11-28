package page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriverWait wait;
    protected WebDriver driver;
    String BASE_URL = "https://at-sandbox.workbench.lanit.ru/tickets/submit/";
    public static final By  QUEUE_VALUE = By.xpath("//select[@name = 'queue']//option[@value  = '1']");
    public static final By TITLE = By.id("id_title");
    public static final By BODY = By.id("id_body");
    public static final By DATE_FILED = By.id("id_due_date");
    public static final By DATE_VALUE = By.xpath("//table[@class = 'ui-datepicker-calendar' ]//a[text()= 23]");
    public static final By EMAIL = By.id("id_submitter_email");
    public static final By BUTTON = By.xpath("//button[@type = 'submit']");


    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);

    }

    public abstract boolean isPageOpen();
    public boolean isExist(By locator){
        try {
            return  driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
