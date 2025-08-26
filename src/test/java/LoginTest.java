import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.ValidatableResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.LoginPage;
import org.example.RegistrationPage;
import org.example.user.User;
import org.example.user.UserSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.example.constants.Constants.*;
import static org.junit.Assert.assertEquals;


public class LoginTest extends BaseTest {
    private UserSteps userSteps = new UserSteps();
    private User user;


    @Before
    public void setUp() {
        user = new User();
        user.setEmail(RandomStringUtils.randomAlphabetic(12) + "@yandex.ru")
                .setPassword("rtuihjh")
                .setName(RandomStringUtils.randomAlphabetic(12));
        new UserSteps()
                .createUser(user);
    }

    @DisplayName("Вход в аккаунт через кнопку войти в аккаунт на главной странице")
    @Description("Успешная авторизация пользователя после перехода по кнопке войти в аккаунт на главной странице")
    @Test
    public void successfulLoginButtonLoginToAccountTest() {
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        LoginPage objectLogin = new LoginPage(driver);
        objectLogin.getWebSite();
        objectRegistration.clickButtonLogin();
        objectRegistration.checkFieldEmail(user.getEmail());
        objectRegistration.checkFieldPassword(user.getPassword());
        objectRegistration.clickButtonLogin();
        String actual = objectLogin.buttonPlaceAnOrder();
        assertEquals(EXPECTED_LOGIN_SUCCESS, actual);
    }

    @DisplayName("Вход в аккаунт через кнопку личный кабинет на главной странице")
    @Description("Успешная авторизация пользователя после перехода по кнопке личный кабинет на главной странице")
    @Test
    public void successfulLoginButtonPersonalAccountTest() {
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        LoginPage objectLogin = new LoginPage(driver);
        objectLogin.getWebSite();
        objectLogin.clickPersonalAccount();
        objectRegistration.checkFieldEmail(user.getEmail());
        objectRegistration.checkFieldPassword(user.getPassword());
        objectRegistration.clickButtonLogin();
        String actual = objectLogin.buttonPlaceAnOrder();
        assertEquals(EXPECTED_LOGIN_SUCCESS, actual);
    }

    @DisplayName("Вход в аккаунт через кнопку войти на странице зарегистрироваться")
    @Description("Успешная авторизация пользователя после перехода по кнопке войти на странице зарегистрироваться")
    @Test
    public void successfulLoginButtonLoginRegistrationPageTest() {
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        LoginPage objectLogin = new LoginPage(driver);
        objectLogin.getWebSiteRegistration();
        objectLogin.clickButtonLoginRegistrationPage();
        objectRegistration.checkFieldEmail(user.getEmail());
        objectRegistration.checkFieldPassword(user.getPassword());
        objectRegistration.clickButtonLogin();
        String actual = objectLogin.buttonPlaceAnOrder();
        assertEquals(EXPECTED_LOGIN_SUCCESS, actual);
    }

    @DisplayName("Вход в аккаунт через кнопку войти на странице забыл пароль")
    @Description("Успешная авторизация пользователя после перехода по кнопке войти на странице забыл пароль")
    @Test
    public void successfulLoginButtonLoginForgotPasswordPageTest() {
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        LoginPage objectLogin = new LoginPage(driver);
        objectLogin.getWebSiteForgotPassword();
        objectLogin.clickButtonLoginForgotPasswordPage();
        objectRegistration.checkFieldEmail(user.getEmail());
        objectRegistration.checkFieldPassword(user.getPassword());
        objectRegistration.clickButtonLogin();
        String actual = objectLogin.buttonPlaceAnOrder();
        assertEquals(EXPECTED_LOGIN_SUCCESS, actual);
    }

    @After
    public void teaDown() {
        if (user != null) {
            try {
                ValidatableResponse response = userSteps.loginUser(user);
                if (response.extract().statusCode() == 200) {
                    String token = response.extract().path("accessToken");
                    if (token != null) {
                        userSteps.deleteUser(token);
                    }
                }
            } catch (Exception e) {
            }
        }
    }
}
