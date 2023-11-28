package tests;

import org.testng.annotations.Test;

public class MainTests extends BaseTests {
    @Test
    public void create(){
       mainPage.openUrl();
       mainPage.createTicket("н Великий нехачуха","И не каких бабушек","Dushnila9000@mail.ru");
       mainPage.clickButton();
    }
}
