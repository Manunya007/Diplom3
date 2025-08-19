package org.example;
import org.openqa.selenium.WebDriver;

import static org.example.constants.LocatorsAndConstants.*;

public class RegistrationPage {
    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getWebSite() {
        driver.get(HOME_PAGE_URL);
    }

    public void clickButtonLogin() {
        driver.findElement(BUTTON_LOGIN_TO_ACCOUNT).click();
    }

    public void checkFieldNameAndEmail() {
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(FIELD_NAME).clear();
        driver.findElement(FIELD_NAME).sendKeys(NAME);
        driver.findElement(FIELD_EMAIL).sendKeys(RANDOM_EMAIL);
    }
    public void checkFieldPassword(String password){
        driver.findElement(FIELD_PASSWORD).clear();
        driver.findElement(FIELD_PASSWORD).sendKeys(password);
        driver.findElement(BUTTON_LOGIN_TO_ACCOUNT).click();
    }

    public String titleEntrance() {
        return driver.findElement(TITLE_ENTRANCE).getText();
    }
    public String errorPassword() {
        return driver.findElement(ERROR_PASSWORD).getText();
    }
}
