package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webdriver.WebdriverInit;

import java.util.concurrent.TimeUnit;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebdriverInit.driver;
    }

    public WebElement find(By locator){
        return getDriver().findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator, CharSequence... text){
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By locator){
        return find(locator).getText();
    }

    public String getAttribute(By locator, String attributeName) {
        return find(locator).getAttribute(attributeName);
    }

    public void openUrl(String url){
        getDriver().get(url);
    }

    public void waitABit(java.lang.Integer seconds){}

    public void waitShortly(){
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }


}
