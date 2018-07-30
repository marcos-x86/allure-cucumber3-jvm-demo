package allure.cucumber3.jvm.demo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * It is in charge to set properties for the test execution.
 */
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features"},
        glue = {"allure.cucumber3.jvm.demo"})
public class Runner extends AbstractTestNGCucumberTests {
}
