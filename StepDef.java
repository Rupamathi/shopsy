package shopsy;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObject.BaseMethods;
import pageObject.ShopsyPage;

public class StepDef {
	WebDriver driver;
	BaseMethods b = new BaseMethods();
	ShopsyPage s;
	@Given("I am on the Shopy homepage")
	public void i_am_on_the_shopy_homepage() {
		driver=b.get();
		s= new ShopsyPage(driver);
		b.shopsyweb();
		s.shopSearch();
	}
	@When("I search for {string}")
	public void i_search_for(String string) {
		
		s.searchItem();
	    
	}
	@Then("I should see search results for {string}")
	public void i_should_see_search_results_for(String string) {
		
		
	   
	}


}
