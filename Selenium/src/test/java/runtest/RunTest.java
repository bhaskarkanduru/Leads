package runtest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/featureFiles/CreateLead.feature", monochrome = true, glue="cretaeleadsteps")
public class RunTest extends AbstractTestNGCucumberTests

{
	//, dryRun=true, snippets=SnippetType.CAMELCASE

}
