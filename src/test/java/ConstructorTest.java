import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.example.ConstructorPage;
import org.junit.Test;

import static org.example.constants.Constants.*;
import static org.junit.Assert.assertEquals;

public class ConstructorTest extends BaseTest {

    @DisplayName("Переход на вкладку Соусы")
    @Description("Успешный переход на вкладку соусы на главной странице")
    @Test
    public void saucesButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
         objectConstructor.clickOnSauces();

        String actual = objectConstructor.tabSauces();
        assertEquals(EXPECTED_SAUCES, actual);
    }

    @DisplayName("Переход на вкладку Начинки")
    @Description("Успешный переход на вкладку начинки на главной странице")
    @Test
    public void fillingsButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
        objectConstructor.clickOnFillings();
        String actual = objectConstructor.tabFillings();
        assertEquals(EXPECTED_FILLINGS, actual);
    }

    @DisplayName("Переход на вкладку Булки")
    @Description("Успешный переход на вкладку булки на главной странице")
    @Test
    public void bunsButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
        objectConstructor.clickOnSauces();
        objectConstructor.clickOnBuns();
        String actual = objectConstructor.tabBuns();
        assertEquals(EXPECTED_BUNS, actual);
    }
}