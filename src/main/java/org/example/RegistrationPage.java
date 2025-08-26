package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.constants.Constants.HOME_PAGE_URL;

public class RegistrationPage {
    public static final By BUTTON_LOGIN_TO_ACCOUNT = By.className("button_button__33qZ0");
    public static final By BUTTON_REGISTRATION = By.className("Auth_link__1fOlj");
    public static final By FIELD_NAME = By.xpath("//label[text()='Имя']/following-sibling::input");
    public static final By FIELD_EMAIL = By.xpath("//div[label='Email']/input");
    public static final By FIELD_PASSWORD = By.cssSelector("input[type='password'][name='Пароль']");
    public static final By TITLE_ENTRANCE = By.xpath("//h2[text()='Вход']");
    public static final By ERROR_PASSWORD = By.className("input__error");
    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Переход на главную страницу")
    public void getWebSite() {
        driver.get(HOME_PAGE_URL);
    }
    @Step("Клик по кнопке войти")
    public void clickButtonLogin() {
        driver.findElement(BUTTON_LOGIN_TO_ACCOUNT).click();
    }
    @Step("клик по кнопки зарегистрироваться")
    public void clickButtonRegistration(){
        driver.findElement(BUTTON_REGISTRATION).click();
    }
    @Step("Заполнение поля имя")
    public void checkFieldName(String name){
        driver.findElement(FIELD_NAME).clear();
        driver.findElement(FIELD_NAME).sendKeys(name);
    }
    @Step("Заполнение поля email")
    public void checkFieldEmail(String email){
        driver.findElement(FIELD_EMAIL).clear();
        driver.findElement(FIELD_EMAIL).sendKeys(email);
    }
    @Step("Заполнение поля пароль")
    public void checkFieldPassword(String password){
        driver.findElement(FIELD_PASSWORD).clear();
        driver.findElement(FIELD_PASSWORD).sendKeys(password);
    }

    @Step("Получение текста с заголовка вход")
    public String titleEntrance() {
        return driver.findElement(TITLE_ENTRANCE).getText();
    }
    @Step("Получение текста с ошибки некорректный пароль")
    public String errorPassword() {
        return driver.findElement(ERROR_PASSWORD).getText();
    }
}
