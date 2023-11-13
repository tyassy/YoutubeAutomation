package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        glue = {"stepDefinitions", "hooks"},
        stepNotifications = true,
        features = {"src/test/resources/features"},
        plugin = {"json:build/cucumber.json", "pretty", "html:build/result.html"},
        tags = "@case1" //put test case tagging here
)

public class CucumberRunner {

}
