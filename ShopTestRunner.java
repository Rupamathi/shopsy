package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
	        features=".//features/shopsy.feature",
	        glue="shopsy",
	        dryRun=false,
	        plugin = {"pretty","html:output-report"},
	        monochrome=true
	
	
	
     )
public class ShopTestRunner {

}
