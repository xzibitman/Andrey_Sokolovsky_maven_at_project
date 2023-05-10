package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"steps"},
        features = {"src/test/resources/features/datetest.feature"}
        //tags = "@QA"
)

public class DateTestCucRunner {
}
