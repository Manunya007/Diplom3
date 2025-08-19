
import io.qameta.allure.junit4.DisplayName;
import org.example.LoginPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import static org.example.constants.LocatorsAndConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LoginTest extends BaseTest {
    private By buttonLogin;
    private String url;

    public LoginTest(String url, By buttonLogin){
        this.buttonLogin = buttonLogin;
        this.url = url;
    }

    @Parameterized.Parameters
    public static Object[][] getButtonLogin(){
        return new Object[][]{
                {HOME_PAGE_URL, BUTTON_LOGIN_TO_ACCOUNT},
                {HOME_PAGE_URL, BUTTON_PERSONAL_ACCOUNT},
                {FORM_REGISTRATION_URL, BUTTON_LOGIN},
                {FORM_FORGOT_PASSWORD_URL, BUTTON_LOGIN},
        };
    }
@DisplayName("Проверка вход в аккаунт через разные кнопки Войти")
    @Test
    public void successfulLoginTest(){
        LoginPage objectLogin = new LoginPage(driver);
        objectLogin.getWebSite(url);
        objectLogin.clickButtonLogin(buttonLogin);
        objectLogin.checkFormAuthorization();
String actual = objectLogin.buttonPlaceAnOrder();
assertEquals(EXPECTED_LOGIN_SUCCESS, actual);
    }
}
