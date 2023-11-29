package tests;

import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    @Test
    public void signIn(){
        loginPage.openLoginPage()
                 .enterNamePassword("demo","demo1234");
        loginPage.clickButtonLogin();


    }


}
