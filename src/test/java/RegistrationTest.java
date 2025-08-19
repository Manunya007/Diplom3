
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.RegistrationPage;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.example.constants.LocatorsAndConstants.*;
import static org.junit.Assert.assertEquals;

public class RegistrationTest extends BaseTest {

    @DisplayName("Регистрация с валидными данными")
    @Test
    public void registrationSuccessfulTest() {
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        objectRegistration.getWebSite();
objectRegistration.clickButtonLogin();
objectRegistration.checkFieldNameAndEmail();
objectRegistration.checkFieldPassword(PASSWORD);
String actual = objectRegistration.titleEntrance();
assertEquals(EXPECTED_REGISTRATION_SUCCESS, actual);
    }
@DisplayName("Регистрация с коротким паролем")
    @Test
    public void registrationWithShortPasswordReturnError(){
        RegistrationPage objectRegistration = new RegistrationPage(driver);
        objectRegistration.getWebSite();
        objectRegistration.clickButtonLogin();
       objectRegistration.checkFieldNameAndEmail();
       objectRegistration.checkFieldPassword(SHORT_PASSWORD);

        String actual = objectRegistration.errorPassword();
        assertEquals(EXPECTED_REGISTRATION_ERROR, actual);
    }
}
