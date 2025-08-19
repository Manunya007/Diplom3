
import io.qameta.allure.junit4.DisplayName;
import org.example.ConstructorPage;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.example.constants.LocatorsAndConstants.*;
import static org.junit.Assert.assertEquals;

public class ConstructorTest extends BaseTest{
    @DisplayName("Переход на вкладку Соусы")
    @Test
    public void saucesButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
        objectConstructor.clickOnSauces();

String actual = objectConstructor.tabSauces();
assertEquals(EXPECTED_SAUCES, actual);
    }

    @DisplayName("Переход на вкладку Начинки")
    @Test
    public void fillingsButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
       objectConstructor.getWebSite();
       objectConstructor.clickOnFillings();
        String actual = objectConstructor.tabFillings();
        assertEquals(EXPECTED_FILLINGS, actual);
    }

    @DisplayName("Переход на вкладку Булки")
    @Test
    public void bunsButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
       objectConstructor.clickOnBuns();
        String actual = objectConstructor.tabBuns();
        assertEquals(EXPECTED_BUNS, actual);
    }
}