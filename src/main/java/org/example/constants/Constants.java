package org.example.constants;

import org.openqa.selenium.By;

public class Constants {
    //Переходы по сайту
    public static final String HOME_PAGE_URL = "https://stellarburgers.nomoreparties.site/";
    public static final String FORM_REGISTRATION_URL = "https://stellarburgers.nomoreparties.site/register";
    public static final String FORM_FORGOT_PASSWORD_URL = "https://stellarburgers.nomoreparties.site/forgot-password";


    public static final String CREATE_USER = "api/auth/register";
    public static final String LOGIN_USER = "api/auth/login";
    public static final String DELETE_USER = "api/auth/user";

    //форма авторизации
    public static final String EXPECTED_LOGIN_SUCCESS = "Оформить заказ";

    //Форма регистрации
    public static final String EXPECTED_REGISTRATION_SUCCESS = "Вход";
    public static final String EXPECTED_REGISTRATION_ERROR = "Некорректный пароль";
}
