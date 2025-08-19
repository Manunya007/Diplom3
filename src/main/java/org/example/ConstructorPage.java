package org.example;

import org.openqa.selenium.WebDriver;

import static org.example.constants.LocatorsAndConstants.*;

public class ConstructorPage {
    private final WebDriver driver;

    public ConstructorPage(WebDriver driver){
        this.driver = driver;
    }
    //переход на сайт
    public void getWebSite(){
        driver.get(HOME_PAGE_URL);
    }

    public void clickOnSauces(){
        driver.findElement(TAB_SAUCES).click();
    }
    public void clickOnFillings(){
        driver.findElement(TAB_FILLINGS).click();
    }
    public void clickOnBuns(){
        driver.findElement(TAB_FILLINGS).click();
        driver.findElement(TAB_BUNS).click();
    }
    public String tabSauces() {
        return driver.findElement(TITLE_SAUCES).getText();
    }
    public String tabFillings() {
        return driver.findElement(TITLE_FILLINGS).getText();
    }
    public String tabBuns() {
        return driver.findElement(TITLE_BUNS).getText();
    }
}
