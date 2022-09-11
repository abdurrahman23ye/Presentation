package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:src/test/target/cucumber-reports.html",
                "json:src/test/target/json-reports/cucumber.json",
                "junit:src/test/target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue="stepDefinitions",
        tags="@task1",
        dryRun = false //dryRun=true adımlarda eksik varsa onu bildirir, calistirmaz.
)

public class TestRunners {




}
