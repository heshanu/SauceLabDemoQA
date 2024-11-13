package runnerClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/featurepkg",
		glue = "stepDefinitionsClass")

public class SwagLabsLoginrunner
{

}
