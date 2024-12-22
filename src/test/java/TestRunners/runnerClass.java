package TestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        // Path to the feature files where the Gherkin scenarios are written
        features = "src/main/resources/Features",

        // The package where your step definition classes are located
        glue = "StepDefinitions",  // Replace with your package for step definitions

        // Report configuration: Using ExtentReports adapter for better test reporting
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

        // Uncomment the line below to run only tests with a specific tag, such as "@Regression"
        tags = "@zooz"

        // Monochrome makes the console output cleaner and easier to read (no color codes)
//        monochrome = true
)
public class runnerClass extends AbstractTestNGCucumberTests {


}
/**
 * Reporting options in Cucumber:
 *
 * 1. pretty: Outputs in a readable format in the console (for a clean view).
 * 2. monochrome: Disables color output in the console for better readability.
 * 3. html:target/cucumber-reports/index.html: Generates an HTML report at this location.
 * 4. json:target/cucumber-reports/Cucumber.json: Generates a JSON report at this location.
 * 5. junit:target/cucumber-reports/Cucumber.xml: Generates a JUnit XML report at this location.
 * 6. com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: Uses ExtentReports for detailed, customizable test reports.
 **/
