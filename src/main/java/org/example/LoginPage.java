package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.constants.LocatorsAndConstants.*;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
  //переход на сайт
    public void getWebSite(String url){
        driver.get(url);
    }
   //Переход по кнопке Войти
   public void clickButtonLogin(By buttonLogin){
       driver.findElement(buttonLogin).click();
   }
   //Заполнение формы авторизации
    public void checkFormAuthorization(){
        driver.findElement(FIELD_EMAIL).clear();
        driver.findElement(FIELD_EMAIL).sendKeys( EMAIL);
        driver.findElement(FIELD_PASSWORD).clear();
        driver.findElement(FIELD_PASSWORD).sendKeys(PASSWORD);
        driver.findElement(BUTTON_LOGIN_AUTHORIZATION).click();
    }
    //Появление кнопки оформить заказ
   public String buttonPlaceAnOrder(){
        return driver.findElement(BUTTON_PLACE_AN_ORDER).getText();
   }
}
