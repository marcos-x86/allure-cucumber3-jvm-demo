package allure.cucumber3.jvm.demo.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.testng.SkipException;

/**
 * It is in charge to define the skip test scenario actions.
 */
public class SkipHook {

    private static final String SKIPPED_MSG = "Skipped !!!";

    /**
     * Skips the test scenario
     */
    @Before("@skip")
    public void skipScenario(final Scenario scenario) {
        System.out.println(scenario.getSourceTagNames());
        throw new SkipException(SKIPPED_MSG);
    }
}
