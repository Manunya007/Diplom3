package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.constants.Constants.HOME_PAGE_URL;

public class ConstructorPage {
    public static final By TAB_SAUCES = By.xpath(".//div/span[text()='Соусы']");
    public static final By TAB_FILLINGS = By.xpath("//span[text()='Начинки']");
    public static final By TAB_BUNS = By.xpath("//span[text()='Булки']");
    public static final By TITLE_SAUCES = By.xpath("//h2[text()='Соусы']");
    public static final By TITLE_FILLINGS = By.xpath("//h2[text()='Начинки']");
    public static final By TITLE_BUNS = By.xpath("//h2[text()='Булки']");
    private final WebDriver driver;
    public ConstructorPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Переход на главную страницу")
    public void getWebSite() {
        driver.get(HOME_PAGE_URL);
    }

    @Step("Клик по кнопке соусы")
    public void clickOnSauces() {
        driver.findElement(TAB_SAUCES).click();
    }

    @Step("Клик по кнопке начинки")
    public void clickOnFillings() {
        driver.findElement(TAB_FILLINGS).click();
    }

    @Step("Клик по кнопке булки")
    public void clickOnBuns() {
        driver.findElement(TAB_FILLINGS).click();
        driver.findElement(TAB_BUNS).click();
    }

    @Step("Получение текста с заголовка раздела соусы")
    public String tabSauces() {
        return driver.findElement(TITLE_SAUCES).getText();
    }

    @Step("Получение текста с заголовка раздела начинки")
    public String tabFillings() {
        return driver.findElement(TITLE_FILLINGS).getText();
    }

    @Step("Получение текста с заголовка раздела булки")
    public String tabBuns() {
        return driver.findElement(TITLE_BUNS).getText();
    }

}
