import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.example.ConstructorPage;
import org.junit.Test;

import static org.example.constants.Constants.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConstructorTest extends BaseTest {

    @DisplayName("Переход на вкладку Соусы")
    @Description("Успешный переход на вкладку соусы на главной странице и проверка, что она стала активной")
    @Test
    public void saucesButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
        objectConstructor.clickOnSauces();

        assertTrue(objectConstructor.tabSaucesActive());
    }

    @DisplayName("Переход на вкладку Начинки")
    @Description("Успешный переход на вкладку начинки на главной странице и проверка, что она стала активной")
    @Test
    public void fillingsButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
        objectConstructor.clickOnFillings();

        assertTrue(objectConstructor.tabFillingsActive());
    }

    @DisplayName("Переход на вкладку Булки")
    @Description("Успешный переход на вкладку булки на главной странице и проверка, что она стала активной")
    @Test
    public void bunsButtonTest() {
        ConstructorPage objectConstructor = new ConstructorPage(driver);
        objectConstructor.getWebSite();
        objectConstructor.clickOnSauces();
        objectConstructor.clickOnBuns();
        assertTrue(objectConstructor.tabBunsActive());
    }
}