package stepdefinations;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "/Users/vikramkumar/eclipse-workspace/CucumberAutomation/src/test/resources/feature/FlightBooking.feature",
    glue = "stepdefinations"
)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
