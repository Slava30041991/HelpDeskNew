package page;

import org.openqa.selenium.WebDriver;

public class TiketsPage extends BasePage {



    public TiketsPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageOpen() {
        return false;
    }
}
