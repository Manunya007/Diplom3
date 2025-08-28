package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.constants.Constants.HOME_PAGE_URL;

public class ConstructorPage {
    private static final By TAB_SAUCES = By.xpath(".//div/span[text()='Соусы']");
    private static final By TAB_FILLINGS = By.xpath("//div[contains(@class, 'tab_tab__1SPyG') and .//span[text()='Начинки']]");
    private static final By TAB_BUNS = By.xpath("//div/span[text()='Булки']");
    private static final By TAB_SAUCES_ACTIVE = By.xpath("//div[contains(@class, 'tab_tab_type_current__2BEPc') and .//span[text()='Соусы']]");
    private static final By TAB_FILLINGS_ACTIVE = By.xpath("//div[contains(@class, 'tab_tab_type_current__2BEPc') and .//span[text()='Начинки']]");
    private static final By TAB_BUNS_ACTIVE = By.xpath("//div[contains(@class, 'tab_tab_type_current__2BEPc') and .//span[text()='Булки']]");
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

    @Step("Проверка активности вкладки соусы")
    public boolean tabSaucesActive() {
        driver.findElement(TAB_SAUCES_ACTIVE);
        return true;
    }

    @Step("Проверка активности вкладки начинки")
    public boolean tabFillingsActive() {
        driver.findElement(TAB_FILLINGS_ACTIVE);
        return true;
    }

    @Step("Проверка активности вкладки булки")
    public boolean tabBunsActive() {
        driver.findElement(TAB_BUNS_ACTIVE);
        return true;
    }

}
