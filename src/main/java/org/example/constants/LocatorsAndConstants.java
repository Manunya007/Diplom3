package org.example.constants;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class LocatorsAndConstants {
    //Переходы по сайту
    public static final String HOME_PAGE_URL = "https://stellarburgers.nomoreparties.site/";
public static final String FORM_REGISTRATION_URL = "https://stellarburgers.nomoreparties.site/register";
public static final String FORM_FORGOT_PASSWORD_URL = "https://stellarburgers.nomoreparties.site/forgot-password";

//Кнопки входа в аккаунт
    public static final By BUTTON_LOGIN_TO_ACCOUNT = By.className("button_button__33qZ0");
    public static final By BUTTON_PERSONAL_ACCOUNT = By.xpath("//p[text()='Личный Кабинет']");
    public static final By BUTTON_LOGIN = By.cssSelector("a[href='/login']");

    //форма авторизации
    public static final By FIELD_EMAIL = By.xpath("//div[label='Email']/input");
    public static final By FIELD_PASSWORD = By.cssSelector("input[type='password'][name='Пароль']");
    public static final By BUTTON_LOGIN_AUTHORIZATION = By.className("button_button__33qZ0");
    public static final By BUTTON_PLACE_AN_ORDER = By.xpath("//button[text()='Оформить заказ']");
    public static final String EXPECTED_LOGIN_SUCCESS = "Оформить заказ";

    //Тестовые данные
    public static final String EMAIL = "test-test-test@yandex.ru";
    public static final String PASSWORD = "12344321";
    public static final String SHORT_PASSWORD = "1234";
    public static final String NAME = "Петя";
    public static final String RANDOM_EMAIL = RandomStringUtils.randomAlphabetic(7) + "@yandex.ru";

    //Форма регистрации
    public static final By BUTTON_REGISTRATION = By.className("Auth_link__1fOlj");
public static final By FIELD_NAME = By.xpath("//label[text()='Имя']/following-sibling::input");
public static final By TITLE_ENTRANCE = By.xpath("//h2[text()='Вход']");
public static final By ERROR_PASSWORD = By.className("input__error");
public static final String EXPECTED_REGISTRATION_SUCCESS = "Вход";
public static final String EXPECTED_REGISTRATION_ERROR = "Некорректный пароль";

//Переходы к разделам
    public static final By TAB_SAUCES = By.xpath("//span[text()='Соусы']");
    public static final By TAB_FILLINGS = By.xpath("//span[text()='Начинки']");
    public static final By TAB_BUNS = By.xpath("//span[text()='Булки']");
    public static final By TITLE_SAUCES = By.xpath("//h2[text()='Соусы']");
    public static final By TITLE_FILLINGS = By.xpath("//h2[text()='Начинки']");
    public static final By TITLE_BUNS = By.xpath("//h2[text()='Булки']");
    public static final String EXPECTED_SAUCES = "Соусы";
    public static final String EXPECTED_FILLINGS = "Начинки";
    public static final String EXPECTED_BUNS = "Булки";



}
