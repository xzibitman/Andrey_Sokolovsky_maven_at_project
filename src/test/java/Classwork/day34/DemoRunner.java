package Classwork.day34;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"Classwork.day34"},
        features = {"src/test/resources/features/first.feature", "src/test/resources/features/second.feature"}
        //tags = "@QA"
)
public class DemoRunner {

}
