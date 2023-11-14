package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static webdriver.WebdriverInit.driver;

public class BasePageObject {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public WebDriver getDriver() {
        return driver;
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
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void scrollToElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", locator);
    }

    public void waitUntilVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id(String.valueOf(locator))));
    }

    public void waitUntilFullyLoad() {
        wait.withTimeout(Duration.ofSeconds(30))
                .until(ExpectedConditions
                        .visibilityOfElementLocated((By.xpath("(//a[@aria-label=\"Sign in\"])[2]"))));
    }

}
