package runners;

import io.cucumber.testng.CucumberOptions;
import library.engine.core.runner.EngBaseTest;

@CucumberOptions(tags = {"@SmokeSuite"})
public class RegressionRunner extends EngBaseTest {
}