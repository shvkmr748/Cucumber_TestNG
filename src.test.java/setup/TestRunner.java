package setup;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

public class TestRunner {

	@CucumberOptions(features = "src.test.features", plugin = { "pretty", "html:target/cucumber-pretty",
			"json:target/cucumber.json" }, glue = { "stepDefinition" })
	public class OpenMRSTests {
		private TestNGCucumberRunner testRunner;

		@BeforeClass
		public void setUP() {
			testRunner = new TestNGCucumberRunner(OpenMRSTests.class);

		}

		@Test(description = "login", dataProvider = "features")
		public void login(CucumberFeatureWrapper cFeature) {
			testRunner.runCucumber(cFeature.getCucumberFeature());
		}

		@DataProvider(name = "features")
		public Object[][] getFeatures() {
			return testRunner.provideFeatures();
		}

		@AfterClass
		public void tearDown() {
			testRunner.finish();
		}

	}

}
