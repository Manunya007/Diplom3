import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.ValidatableResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.RegistrationPage;
import org.example.user.User;
import org.example.user.UserSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.example.constants.Constants.EXPECTED_REGISTRATION_ERROR;
import static org.example.constants.Constants.EXPECTED_REGISTRATION_SUCCESS;
import static org.junit.Assert.assertEquals;

public class RegistrationTest extends BaseTest {
    private UserSteps userSteps = new UserSteps();
    private User user;

    @Before
    public void setUp() {
        user = new User();
        user.setEmail(RandomStringUtils.randomAlphabetic(12) + "@yandex.ru")
                .setPassword("rtuihjh")
                .setName(RandomStringUtils.randomAlphabetic(12));
    }

    @DisplayName("Регистрация с валидными данными")
    @Description("Успешная регистрация пользователя")
    @Test
    public void registrationSuccessfulTest() {
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        objectRegistration.getWebSite();
        objectRegistration.clickButtonLogin();
        objectRegistration.clickButtonRegistration();
        objectRegistration.checkFieldName(user.getName());
        objectRegistration.checkFieldEmail(user.getEmail());
        objectRegistration.checkFieldPassword(user.getPassword());
        objectRegistration.clickButtonLogin();
        String actual = objectRegistration.titleEntrance();
        assertEquals(EXPECTED_REGISTRATION_SUCCESS, actual);
    }

    @DisplayName("Регистрация с коротким паролем")
    @Description("Появление ошибки при вводе короткого пароля во время регистрации")
    @Test
    public void registrationWithShortPasswordReturnError() {
        User userWithShortPassword = new User();
        user.setEmail(RandomStringUtils.randomAlphabetic(12) + "@yandex.ru")
                .setPassword("rtu")
                .setName(RandomStringUtils.randomAlphabetic(12));
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        objectRegistration.getWebSite();
        objectRegistration.clickButtonLogin();
        objectRegistration.clickButtonRegistration();
        objectRegistration.checkFieldName(user.getName());
        objectRegistration.checkFieldEmail(user.getEmail());
        objectRegistration.checkFieldPassword(user.getPassword());
        objectRegistration.clickButtonLogin();

        String actual = objectRegistration.errorPassword();
        assertEquals(EXPECTED_REGISTRATION_ERROR, actual);
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
