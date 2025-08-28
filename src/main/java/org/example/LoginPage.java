package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.constants.Constants.*;

public class LoginPage {
    private static final By BUTTON_PLACE_AN_ORDER = By.xpath("//button[text()='Оформить заказ']");
    private static final By BUTTON_PERSONAL_ACCOUNT = By.xpath("//p[text()='Личный Кабинет']");
    private static final By BUTTON_LOGIN = By.cssSelector("a[href='/login']");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Переход на главную страницу")
    public void getWebSite() {
        driver.get(HOME_PAGE_URL);
    }

    @Step("Переход на страницу регистрации")
    public void getWebSiteRegistration(){
        driver.get(FORM_REGISTRATION_URL);
    }
@Step("Переход на страницу забыл пароль")
    public void getWebSiteForgotPassword(){
        driver.get(FORM_FORGOT_PASSWORD_URL);

}

    @Step("Клик по кнопке личный кабинет")
    public void clickPersonalAccount(){
        driver.findElement(BUTTON_PERSONAL_ACCOUNT).click();
    }

    @Step("Клик по кнопке войти на странице регистрации")
public void clickButtonLoginRegistrationPage(){
        driver.findElement(BUTTON_LOGIN).click();
    }

    @Step("Клик по кнопке войти на странице забыл пароль")
    public void clickButtonLoginForgotPasswordPage(){
        driver.findElement(BUTTON_LOGIN).click();
    }

    @Step("Получение текста с кнопки оформить заказ")
    public String buttonPlaceAnOrder() {
        return driver.findElement(BUTTON_PLACE_AN_ORDER).getText();
    }
}
