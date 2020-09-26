package GitPractice1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "C:\\Users\\ketan\\BrightBDD\\src\\test\\Resource\\ResultPage.feature")
//@CucumberOptions(features = "src/test/Resource/ResultPage.feature", tags = {"@Regression"})
@CucumberOptions(features = "src/test/Resources/Homepage.feature", tags = {"@Smoke"},

        plugin = {"html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json",
                "junit:target/cucumber-xml-report.xml",
                "pretty:target/cucumber-pretty-report.txt"
        }

)
public class RunCukeTest {

}
