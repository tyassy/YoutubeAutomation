package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webdriver.WebdriverInit;

public class WebDriverHooks {

    @Before(order = 1)
    public void intializeWebdriver(){
        WebdriverInit.initialize();
    }

//    @After(order = 1)
//    public void quitWebdriver(){
//        WebdriverInit.quit();
//    }

}
